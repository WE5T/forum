/*提交回复*/
function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    comment2target(questionId, 1, content);
}

function comment2target(targetId, type, content) {

    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: 'application/json',
        data: JSON.stringify({
            "parentId": targetId,
            "content": content,
            "type": type
        }),
        success: function (response) {
            if (response.code != 200)
                alert(response.message);
            else {
                if (response.code == 2003) {
                    var isAccepted = confirm(response.message);
                    if (isAccepted) {
                        window.open("https://github.com/login/oauth/authorize?client_id=Iv1.628b4a885a01a11f&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                        window.localStorage.setItem("closable", true);
                    }
                }
                window.location.reload();
            }
        },
        dataType: "json"
    });
}

function comment(e) {
    var commentId = e.getAttribute("data-id");
    var content = $("#input-" + commentId).val();
    comment2target(commentId, 2, content);
}

/*展开二级评论*/
function collapseComment(e) {
    var id = e.getAttribute("data-id");
    var comments = $("#comment-" + id);
    var subCommentContainer = $("#comment-" + id);
    comments.toggleClass("in");
    e.classList.toggle("active");
    if (subCommentContainer.children().length == 2) {

        $.getJSON("/comment/" + id, function (data) {
            $.each(data.data.reverse(), function (index, comment) {

                var commentElement = $("<div/>", {
                    "class": "col-lg-12 col-md-12 col-sm-12 col-xs-12",
                    "style":"margin-top: 5px; margin-bottom: 5px",
                    html: comment.content
                });

                var mediaheadElement = $("<a/>", {
                    "class": "media-heading",
                    "href":"#",
                    "html": comment.user.name
                });

                var mediabodyElement = $("<div/>", {
                    "class": "media-body",
                });

                var avatarElement = $("<img/>", {
                    "class": "media-object ",
                    "src": comment.user.avatarUrl
                });

                var mediaLeftElement = $("<div/>", {
                    "class": "media-left"
                });

                var mediaElement = $("<div/>", {
                    "class": "media comment-bottom"
                });

                mediaElement.append(mediaLeftElement);
                mediaElement.append(mediabodyElement);
                mediaLeftElement.append(avatarElement);
                mediabodyElement.append(mediaheadElement);
                mediabodyElement.append(commentElement);
                subCommentContainer.prepend(mediaElement);
            });

        });
    }
}

package com.west.forum.dto;

import com.west.forum.model.schema.User;
import lombok.Data;

@Data
public class CommentDTO {
        private Long id;
        private Long parentId;
        private Integer type;
        private Long commenter;
        private Long gmtCreate;
        private Long gmtModified;
        private Long likeCount;
        private String content;
        private User user;
}

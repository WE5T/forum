package com.west.forum.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "该问题不存在"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中问题或评论"),
    USER_NOT_LOGIN(2003,"您还没有登录"),
    SYSTEM_ERROR(2004,"服务器异常"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"该评论不存在或已被删除"),
    COMMENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "这不是你的通知"),
    NOTIFICATION_NOT_FOUND(2009, "通知消息不存在");

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


}


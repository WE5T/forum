package com.west.forum.model.schema;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.TYPE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.COMMENTER
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long commenter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.LIKE_COUNT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private Long likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.COMMENT.CONTENT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.ID
     *
     * @return the value of SCHEMA.COMMENT.ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.ID
     *
     * @param id the value for SCHEMA.COMMENT.ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.PARENT_ID
     *
     * @return the value of SCHEMA.COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.PARENT_ID
     *
     * @param parentId the value for SCHEMA.COMMENT.PARENT_ID
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.TYPE
     *
     * @return the value of SCHEMA.COMMENT.TYPE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.TYPE
     *
     * @param type the value for SCHEMA.COMMENT.TYPE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.COMMENTER
     *
     * @return the value of SCHEMA.COMMENT.COMMENTER
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getCommenter() {
        return commenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.COMMENTER
     *
     * @param commenter the value for SCHEMA.COMMENT.COMMENTER
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setCommenter(Long commenter) {
        this.commenter = commenter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.GMT_CREATE
     *
     * @return the value of SCHEMA.COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.GMT_CREATE
     *
     * @param gmtCreate the value for SCHEMA.COMMENT.GMT_CREATE
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.GMT_MODIFIED
     *
     * @return the value of SCHEMA.COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.GMT_MODIFIED
     *
     * @param gmtModified the value for SCHEMA.COMMENT.GMT_MODIFIED
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.LIKE_COUNT
     *
     * @return the value of SCHEMA.COMMENT.LIKE_COUNT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.LIKE_COUNT
     *
     * @param likeCount the value for SCHEMA.COMMENT.LIKE_COUNT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.COMMENT.CONTENT
     *
     * @return the value of SCHEMA.COMMENT.CONTENT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.COMMENT.CONTENT
     *
     * @param content the value for SCHEMA.COMMENT.CONTENT
     *
     * @mbg.generated Fri Oct 25 19:56:22 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
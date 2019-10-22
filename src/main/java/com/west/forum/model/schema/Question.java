package com.west.forum.model.schema;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.ID
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.TITLE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.GMT_CREATE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.GMT_MODIFIED
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.CREATOR
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.COMMENT_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.VIEW_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.LIKE_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.TAG
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SCHEMA.QUESTION.DESCRIPTION
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.ID
     *
     * @return the value of SCHEMA.QUESTION.ID
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.ID
     *
     * @param id the value for SCHEMA.QUESTION.ID
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.TITLE
     *
     * @return the value of SCHEMA.QUESTION.TITLE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.TITLE
     *
     * @param title the value for SCHEMA.QUESTION.TITLE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.GMT_CREATE
     *
     * @return the value of SCHEMA.QUESTION.GMT_CREATE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.GMT_CREATE
     *
     * @param gmtCreate the value for SCHEMA.QUESTION.GMT_CREATE
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.GMT_MODIFIED
     *
     * @return the value of SCHEMA.QUESTION.GMT_MODIFIED
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.GMT_MODIFIED
     *
     * @param gmtModified the value for SCHEMA.QUESTION.GMT_MODIFIED
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.CREATOR
     *
     * @return the value of SCHEMA.QUESTION.CREATOR
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.CREATOR
     *
     * @param creator the value for SCHEMA.QUESTION.CREATOR
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.COMMENT_COUNT
     *
     * @return the value of SCHEMA.QUESTION.COMMENT_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.COMMENT_COUNT
     *
     * @param commentCount the value for SCHEMA.QUESTION.COMMENT_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.VIEW_COUNT
     *
     * @return the value of SCHEMA.QUESTION.VIEW_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.VIEW_COUNT
     *
     * @param viewCount the value for SCHEMA.QUESTION.VIEW_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.LIKE_COUNT
     *
     * @return the value of SCHEMA.QUESTION.LIKE_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.LIKE_COUNT
     *
     * @param likeCount the value for SCHEMA.QUESTION.LIKE_COUNT
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.TAG
     *
     * @return the value of SCHEMA.QUESTION.TAG
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.TAG
     *
     * @param tag the value for SCHEMA.QUESTION.TAG
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SCHEMA.QUESTION.DESCRIPTION
     *
     * @return the value of SCHEMA.QUESTION.DESCRIPTION
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SCHEMA.QUESTION.DESCRIPTION
     *
     * @param description the value for SCHEMA.QUESTION.DESCRIPTION
     *
     * @mbg.generated Tue Oct 22 12:30:46 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
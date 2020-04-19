package com.gcms.pojo;

import java.util.Date;

public class Notice extends BaseBean{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.id
     *
     * @return the value of notice.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.id
     *
     * @param id the value for notice.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.content
     *
     * @return the value of notice.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.content
     *
     * @param content the value for notice.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.view_count
     *
     * @return the value of notice.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.view_count
     *
     * @param viewCount the value for notice.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.create_time
     *
     * @return the value of notice.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.create_time
     *
     * @param createTime the value for notice.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
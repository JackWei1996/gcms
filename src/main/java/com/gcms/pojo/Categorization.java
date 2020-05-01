package com.gcms.pojo;

public class  Categorization extends BaseBean{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Integer type;
    private Double value;

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.value
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.harm
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Integer harm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categorization.info
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private String info;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categorization.id
     *
     * @return the value of categorization.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.id
     *
     * @param id the value for categorization.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categorization.content
     *
     * @return the value of categorization.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.content
     *
     * @param content the value for categorization.content
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categorization.type
     *
     * @return the value of categorization.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.type
     *
     * @param type the value for categorization.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categorization.view_count
     *
     * @return the value of categorization.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.view_count
     *
     * @param viewCount the value for categorization.view_count
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getHarm() {
        return harm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.harm
     *
     * @param harm the value for categorization.harm
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setHarm(Integer harm) {
        this.harm = harm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categorization.info
     *
     * @return the value of categorization.info
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categorization.info
     *
     * @param info the value for categorization.info
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}
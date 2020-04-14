package com.gcms.pojo;

import java.util.Date;

public class UserGarbage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.user_id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.gram
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Double gram;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.city
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_garbage.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.id
     *
     * @return the value of user_garbage.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.id
     *
     * @param id the value for user_garbage.id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.user_id
     *
     * @return the value of user_garbage.user_id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.user_id
     *
     * @param userId the value for user_garbage.user_id
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.gram
     *
     * @return the value of user_garbage.gram
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Double getGram() {
        return gram;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.gram
     *
     * @param gram the value for user_garbage.gram
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setGram(Double gram) {
        this.gram = gram;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.type
     *
     * @return the value of user_garbage.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.type
     *
     * @param type the value for user_garbage.type
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.city
     *
     * @return the value of user_garbage.city
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.city
     *
     * @param city the value for user_garbage.city
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_garbage.create_time
     *
     * @return the value of user_garbage.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_garbage.create_time
     *
     * @param createTime the value for user_garbage.create_time
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
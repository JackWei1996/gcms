package com.gcms.mapper;

import com.gcms.pojo.Categorization;
import com.gcms.pojo.CategorizationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CategorizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    long countByExample(CategorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int deleteByExample(CategorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int insert(Categorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int insertSelective(Categorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    List<Categorization> selectByExample(CategorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    Categorization selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") Categorization record, @Param("example") CategorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int updateByExample(@Param("record") Categorization record, @Param("example") CategorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int updateByPrimaryKeySelective(Categorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table categorization
     *
     * @mbg.generated Mon Apr 06 20:16:29 CST 2020
     */
    int updateByPrimaryKey(Categorization record);

    List<Categorization> getAllByLimit(Categorization categorization);

    int countAllByLimit(Categorization categorization);

    void viewCount(@Param("content") String content);

    List<Map<String, Object>> tjByTpye();
}
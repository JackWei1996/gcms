package com.gcms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public GarbageTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTipIsNull() {
            addCriterion("tip is null");
            return (Criteria) this;
        }

        public Criteria andTipIsNotNull() {
            addCriterion("tip is not null");
            return (Criteria) this;
        }

        public Criteria andTipEqualTo(String value) {
            addCriterion("tip =", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotEqualTo(String value) {
            addCriterion("tip <>", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThan(String value) {
            addCriterion("tip >", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThanOrEqualTo(String value) {
            addCriterion("tip >=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThan(String value) {
            addCriterion("tip <", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThanOrEqualTo(String value) {
            addCriterion("tip <=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLike(String value) {
            addCriterion("tip like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotLike(String value) {
            addCriterion("tip not like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipIn(List<String> values) {
            addCriterion("tip in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotIn(List<String> values) {
            addCriterion("tip not in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipBetween(String value1, String value2) {
            addCriterion("tip between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotBetween(String value1, String value2) {
            addCriterion("tip not between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andIncludeIsNull() {
            addCriterion("Include is null");
            return (Criteria) this;
        }

        public Criteria andIncludeIsNotNull() {
            addCriterion("Include is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeEqualTo(String value) {
            addCriterion("Include =", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotEqualTo(String value) {
            addCriterion("Include <>", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeGreaterThan(String value) {
            addCriterion("Include >", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeGreaterThanOrEqualTo(String value) {
            addCriterion("Include >=", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLessThan(String value) {
            addCriterion("Include <", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLessThanOrEqualTo(String value) {
            addCriterion("Include <=", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeLike(String value) {
            addCriterion("Include like", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotLike(String value) {
            addCriterion("Include not like", value, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeIn(List<String> values) {
            addCriterion("Include in", values, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotIn(List<String> values) {
            addCriterion("Include not in", values, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeBetween(String value1, String value2) {
            addCriterion("Include between", value1, value2, "include");
            return (Criteria) this;
        }

        public Criteria andIncludeNotBetween(String value1, String value2) {
            addCriterion("Include not between", value1, value2, "include");
            return (Criteria) this;
        }

        public Criteria andAskIsNull() {
            addCriterion("ask is null");
            return (Criteria) this;
        }

        public Criteria andAskIsNotNull() {
            addCriterion("ask is not null");
            return (Criteria) this;
        }

        public Criteria andAskEqualTo(String value) {
            addCriterion("ask =", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotEqualTo(String value) {
            addCriterion("ask <>", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThan(String value) {
            addCriterion("ask >", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThanOrEqualTo(String value) {
            addCriterion("ask >=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThan(String value) {
            addCriterion("ask <", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThanOrEqualTo(String value) {
            addCriterion("ask <=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLike(String value) {
            addCriterion("ask like", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotLike(String value) {
            addCriterion("ask not like", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskIn(List<String> values) {
            addCriterion("ask in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotIn(List<String> values) {
            addCriterion("ask not in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskBetween(String value1, String value2) {
            addCriterion("ask between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotBetween(String value1, String value2) {
            addCriterion("ask not between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table garbage_type
     *
     * @mbg.generated do_not_delete_during_merge Fri May 01 16:27:47 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table garbage_type
     *
     * @mbg.generated Fri May 01 16:27:47 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
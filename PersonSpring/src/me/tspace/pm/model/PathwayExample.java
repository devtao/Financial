package me.tspace.pm.model;

import java.util.ArrayList;
import java.util.List;

public class PathwayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public PathwayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
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
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
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

        public Criteria andPathwaynameIsNull() {
            addCriterion("pathwayname is null");
            return (Criteria) this;
        }

        public Criteria andPathwaynameIsNotNull() {
            addCriterion("pathwayname is not null");
            return (Criteria) this;
        }

        public Criteria andPathwaynameEqualTo(String value) {
            addCriterion("pathwayname =", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameNotEqualTo(String value) {
            addCriterion("pathwayname <>", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameGreaterThan(String value) {
            addCriterion("pathwayname >", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameGreaterThanOrEqualTo(String value) {
            addCriterion("pathwayname >=", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameLessThan(String value) {
            addCriterion("pathwayname <", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameLessThanOrEqualTo(String value) {
            addCriterion("pathwayname <=", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameLike(String value) {
            addCriterion("pathwayname like", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameNotLike(String value) {
            addCriterion("pathwayname not like", value, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameIn(List<String> values) {
            addCriterion("pathwayname in", values, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameNotIn(List<String> values) {
            addCriterion("pathwayname not in", values, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameBetween(String value1, String value2) {
            addCriterion("pathwayname between", value1, value2, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwaynameNotBetween(String value1, String value2) {
            addCriterion("pathwayname not between", value1, value2, "pathwayname");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestIsNull() {
            addCriterion("pathwayinterest is null");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestIsNotNull() {
            addCriterion("pathwayinterest is not null");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestEqualTo(Double value) {
            addCriterion("pathwayinterest =", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestNotEqualTo(Double value) {
            addCriterion("pathwayinterest <>", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestGreaterThan(Double value) {
            addCriterion("pathwayinterest >", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestGreaterThanOrEqualTo(Double value) {
            addCriterion("pathwayinterest >=", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestLessThan(Double value) {
            addCriterion("pathwayinterest <", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestLessThanOrEqualTo(Double value) {
            addCriterion("pathwayinterest <=", value, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestIn(List<Double> values) {
            addCriterion("pathwayinterest in", values, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestNotIn(List<Double> values) {
            addCriterion("pathwayinterest not in", values, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestBetween(Double value1, Double value2) {
            addCriterion("pathwayinterest between", value1, value2, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayinterestNotBetween(Double value1, Double value2) {
            addCriterion("pathwayinterest not between", value1, value2, "pathwayinterest");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsIsNull() {
            addCriterion("pathwayvisits is null");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsIsNotNull() {
            addCriterion("pathwayvisits is not null");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsEqualTo(Integer value) {
            addCriterion("pathwayvisits =", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsNotEqualTo(Integer value) {
            addCriterion("pathwayvisits <>", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsGreaterThan(Integer value) {
            addCriterion("pathwayvisits >", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathwayvisits >=", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsLessThan(Integer value) {
            addCriterion("pathwayvisits <", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsLessThanOrEqualTo(Integer value) {
            addCriterion("pathwayvisits <=", value, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsIn(List<Integer> values) {
            addCriterion("pathwayvisits in", values, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsNotIn(List<Integer> values) {
            addCriterion("pathwayvisits not in", values, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsBetween(Integer value1, Integer value2) {
            addCriterion("pathwayvisits between", value1, value2, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwayvisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("pathwayvisits not between", value1, value2, "pathwayvisits");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeIsNull() {
            addCriterion("pathwaytime is null");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeIsNotNull() {
            addCriterion("pathwaytime is not null");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeEqualTo(Integer value) {
            addCriterion("pathwaytime =", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeNotEqualTo(Integer value) {
            addCriterion("pathwaytime <>", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeGreaterThan(Integer value) {
            addCriterion("pathwaytime >", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathwaytime >=", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeLessThan(Integer value) {
            addCriterion("pathwaytime <", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("pathwaytime <=", value, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeIn(List<Integer> values) {
            addCriterion("pathwaytime in", values, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeNotIn(List<Integer> values) {
            addCriterion("pathwaytime not in", values, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeBetween(Integer value1, Integer value2) {
            addCriterion("pathwaytime between", value1, value2, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andPathwaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pathwaytime not between", value1, value2, "pathwaytime");
            return (Criteria) this;
        }

        public Criteria andBasicidIsNull() {
            addCriterion("basicid is null");
            return (Criteria) this;
        }

        public Criteria andBasicidIsNotNull() {
            addCriterion("basicid is not null");
            return (Criteria) this;
        }

        public Criteria andBasicidEqualTo(Integer value) {
            addCriterion("basicid =", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotEqualTo(Integer value) {
            addCriterion("basicid <>", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThan(Integer value) {
            addCriterion("basicid >", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("basicid >=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThan(Integer value) {
            addCriterion("basicid <", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidLessThanOrEqualTo(Integer value) {
            addCriterion("basicid <=", value, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidIn(List<Integer> values) {
            addCriterion("basicid in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotIn(List<Integer> values) {
            addCriterion("basicid not in", values, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidBetween(Integer value1, Integer value2) {
            addCriterion("basicid between", value1, value2, "basicid");
            return (Criteria) this;
        }

        public Criteria andBasicidNotBetween(Integer value1, Integer value2) {
            addCriterion("basicid not between", value1, value2, "basicid");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("sortId is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortId is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortId =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortId <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortId >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortId >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortId <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortId <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortId in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortId not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortId between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortId not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidIsNull() {
            addCriterion("bigCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidIsNotNull() {
            addCriterion("bigCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidEqualTo(Integer value) {
            addCriterion("bigCategoryId =", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidNotEqualTo(Integer value) {
            addCriterion("bigCategoryId <>", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidGreaterThan(Integer value) {
            addCriterion("bigCategoryId >", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigCategoryId >=", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidLessThan(Integer value) {
            addCriterion("bigCategoryId <", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("bigCategoryId <=", value, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidIn(List<Integer> values) {
            addCriterion("bigCategoryId in", values, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidNotIn(List<Integer> values) {
            addCriterion("bigCategoryId not in", values, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidBetween(Integer value1, Integer value2) {
            addCriterion("bigCategoryId between", value1, value2, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andBigcategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("bigCategoryId not between", value1, value2, "bigcategoryid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 07 16:47:12 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table selleck_interest_pathway_wan
     *
     * @mbggenerated Fri Jun 07 16:47:12 CST 2013
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
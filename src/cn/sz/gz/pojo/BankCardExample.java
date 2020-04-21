package cn.sz.gz.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andBankcardidIsNull() {
            addCriterion("bankCardId is null");
            return (Criteria) this;
        }

        public Criteria andBankcardidIsNotNull() {
            addCriterion("bankCardId is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardidEqualTo(Long value) {
            addCriterion("bankCardId =", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotEqualTo(Long value) {
            addCriterion("bankCardId <>", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidGreaterThan(Long value) {
            addCriterion("bankCardId >", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidGreaterThanOrEqualTo(Long value) {
            addCriterion("bankCardId >=", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidLessThan(Long value) {
            addCriterion("bankCardId <", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidLessThanOrEqualTo(Long value) {
            addCriterion("bankCardId <=", value, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidIn(List<Long> values) {
            addCriterion("bankCardId in", values, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotIn(List<Long> values) {
            addCriterion("bankCardId not in", values, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidBetween(Long value1, Long value2) {
            addCriterion("bankCardId between", value1, value2, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardidNotBetween(Long value1, Long value2) {
            addCriterion("bankCardId not between", value1, value2, "bankcardid");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNull() {
            addCriterion("bankCardNumber is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNotNull() {
            addCriterion("bankCardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberEqualTo(Long value) {
            addCriterion("bankCardNumber =", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotEqualTo(Long value) {
            addCriterion("bankCardNumber <>", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThan(Long value) {
            addCriterion("bankCardNumber >", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("bankCardNumber >=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThan(Long value) {
            addCriterion("bankCardNumber <", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThanOrEqualTo(Long value) {
            addCriterion("bankCardNumber <=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIn(List<Long> values) {
            addCriterion("bankCardNumber in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotIn(List<Long> values) {
            addCriterion("bankCardNumber not in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberBetween(Long value1, Long value2) {
            addCriterion("bankCardNumber between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotBetween(Long value1, Long value2) {
            addCriterion("bankCardNumber not between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeIsNull() {
            addCriterion("bankCardType is null");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeIsNotNull() {
            addCriterion("bankCardType is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeEqualTo(String value) {
            addCriterion("bankCardType =", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeNotEqualTo(String value) {
            addCriterion("bankCardType <>", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeGreaterThan(String value) {
            addCriterion("bankCardType >", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("bankCardType >=", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeLessThan(String value) {
            addCriterion("bankCardType <", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeLessThanOrEqualTo(String value) {
            addCriterion("bankCardType <=", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeLike(String value) {
            addCriterion("bankCardType like", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeNotLike(String value) {
            addCriterion("bankCardType not like", value, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeIn(List<String> values) {
            addCriterion("bankCardType in", values, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeNotIn(List<String> values) {
            addCriterion("bankCardType not in", values, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeBetween(String value1, String value2) {
            addCriterion("bankCardType between", value1, value2, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andBankcardtypeNotBetween(String value1, String value2) {
            addCriterion("bankCardType not between", value1, value2, "bankcardtype");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
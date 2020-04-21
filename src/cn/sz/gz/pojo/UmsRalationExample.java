package cn.sz.gz.pojo;

import java.util.ArrayList;
import java.util.List;

public class UmsRalationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsRalationExample() {
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

        public Criteria andRalationidIsNull() {
            addCriterion("ralationId is null");
            return (Criteria) this;
        }

        public Criteria andRalationidIsNotNull() {
            addCriterion("ralationId is not null");
            return (Criteria) this;
        }

        public Criteria andRalationidEqualTo(Long value) {
            addCriterion("ralationId =", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidNotEqualTo(Long value) {
            addCriterion("ralationId <>", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidGreaterThan(Long value) {
            addCriterion("ralationId >", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidGreaterThanOrEqualTo(Long value) {
            addCriterion("ralationId >=", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidLessThan(Long value) {
            addCriterion("ralationId <", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidLessThanOrEqualTo(Long value) {
            addCriterion("ralationId <=", value, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidIn(List<Long> values) {
            addCriterion("ralationId in", values, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidNotIn(List<Long> values) {
            addCriterion("ralationId not in", values, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidBetween(Long value1, Long value2) {
            addCriterion("ralationId between", value1, value2, "ralationid");
            return (Criteria) this;
        }

        public Criteria andRalationidNotBetween(Long value1, Long value2) {
            addCriterion("ralationId not between", value1, value2, "ralationid");
            return (Criteria) this;
        }

        public Criteria andUmsidIsNull() {
            addCriterion("umsId is null");
            return (Criteria) this;
        }

        public Criteria andUmsidIsNotNull() {
            addCriterion("umsId is not null");
            return (Criteria) this;
        }

        public Criteria andUmsidEqualTo(String value) {
            addCriterion("umsId =", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidNotEqualTo(String value) {
            addCriterion("umsId <>", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidGreaterThan(String value) {
            addCriterion("umsId >", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidGreaterThanOrEqualTo(String value) {
            addCriterion("umsId >=", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidLessThan(String value) {
            addCriterion("umsId <", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidLessThanOrEqualTo(String value) {
            addCriterion("umsId <=", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidLike(String value) {
            addCriterion("umsId like", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidNotLike(String value) {
            addCriterion("umsId not like", value, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidIn(List<String> values) {
            addCriterion("umsId in", values, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidNotIn(List<String> values) {
            addCriterion("umsId not in", values, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidBetween(String value1, String value2) {
            addCriterion("umsId between", value1, value2, "umsid");
            return (Criteria) this;
        }

        public Criteria andUmsidNotBetween(String value1, String value2) {
            addCriterion("umsId not between", value1, value2, "umsid");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("roleId is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("roleId is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Long value) {
            addCriterion("roleId =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Long value) {
            addCriterion("roleId <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Long value) {
            addCriterion("roleId >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Long value) {
            addCriterion("roleId >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Long value) {
            addCriterion("roleId <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Long value) {
            addCriterion("roleId <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Long> values) {
            addCriterion("roleId in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Long> values) {
            addCriterion("roleId not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Long value1, Long value2) {
            addCriterion("roleId between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Long value1, Long value2) {
            addCriterion("roleId not between", value1, value2, "roleid");
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
package cn.sz.gz.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FundOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundOrderExample() {
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

        public Criteria andFundorderidIsNull() {
            addCriterion("fundorderId is null");
            return (Criteria) this;
        }

        public Criteria andFundorderidIsNotNull() {
            addCriterion("fundorderId is not null");
            return (Criteria) this;
        }

        public Criteria andFundorderidEqualTo(Long value) {
            addCriterion("fundorderId =", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidNotEqualTo(Long value) {
            addCriterion("fundorderId <>", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidGreaterThan(Long value) {
            addCriterion("fundorderId >", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidGreaterThanOrEqualTo(Long value) {
            addCriterion("fundorderId >=", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidLessThan(Long value) {
            addCriterion("fundorderId <", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidLessThanOrEqualTo(Long value) {
            addCriterion("fundorderId <=", value, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidIn(List<Long> values) {
            addCriterion("fundorderId in", values, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidNotIn(List<Long> values) {
            addCriterion("fundorderId not in", values, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidBetween(Long value1, Long value2) {
            addCriterion("fundorderId between", value1, value2, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundorderidNotBetween(Long value1, Long value2) {
            addCriterion("fundorderId not between", value1, value2, "fundorderid");
            return (Criteria) this;
        }

        public Criteria andFundidIsNull() {
            addCriterion("fundID is null");
            return (Criteria) this;
        }

        public Criteria andFundidIsNotNull() {
            addCriterion("fundID is not null");
            return (Criteria) this;
        }

        public Criteria andFundidEqualTo(Long value) {
            addCriterion("fundID =", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotEqualTo(Long value) {
            addCriterion("fundID <>", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThan(Long value) {
            addCriterion("fundID >", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThanOrEqualTo(Long value) {
            addCriterion("fundID >=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThan(Long value) {
            addCriterion("fundID <", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThanOrEqualTo(Long value) {
            addCriterion("fundID <=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidIn(List<Long> values) {
            addCriterion("fundID in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotIn(List<Long> values) {
            addCriterion("fundID not in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidBetween(Long value1, Long value2) {
            addCriterion("fundID between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotBetween(Long value1, Long value2) {
            addCriterion("fundID not between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNull() {
            addCriterion("fundName is null");
            return (Criteria) this;
        }

        public Criteria andFundnameIsNotNull() {
            addCriterion("fundName is not null");
            return (Criteria) this;
        }

        public Criteria andFundnameEqualTo(String value) {
            addCriterion("fundName =", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotEqualTo(String value) {
            addCriterion("fundName <>", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThan(String value) {
            addCriterion("fundName >", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameGreaterThanOrEqualTo(String value) {
            addCriterion("fundName >=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThan(String value) {
            addCriterion("fundName <", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLessThanOrEqualTo(String value) {
            addCriterion("fundName <=", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameLike(String value) {
            addCriterion("fundName like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotLike(String value) {
            addCriterion("fundName not like", value, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameIn(List<String> values) {
            addCriterion("fundName in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotIn(List<String> values) {
            addCriterion("fundName not in", values, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameBetween(String value1, String value2) {
            addCriterion("fundName between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundnameNotBetween(String value1, String value2) {
            addCriterion("fundName not between", value1, value2, "fundname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameIsNull() {
            addCriterion("fundCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameIsNotNull() {
            addCriterion("fundCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameEqualTo(String value) {
            addCriterion("fundCompanyName =", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameNotEqualTo(String value) {
            addCriterion("fundCompanyName <>", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameGreaterThan(String value) {
            addCriterion("fundCompanyName >", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("fundCompanyName >=", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameLessThan(String value) {
            addCriterion("fundCompanyName <", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameLessThanOrEqualTo(String value) {
            addCriterion("fundCompanyName <=", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameLike(String value) {
            addCriterion("fundCompanyName like", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameNotLike(String value) {
            addCriterion("fundCompanyName not like", value, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameIn(List<String> values) {
            addCriterion("fundCompanyName in", values, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameNotIn(List<String> values) {
            addCriterion("fundCompanyName not in", values, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameBetween(String value1, String value2) {
            addCriterion("fundCompanyName between", value1, value2, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andFundcompanynameNotBetween(String value1, String value2) {
            addCriterion("fundCompanyName not between", value1, value2, "fundcompanyname");
            return (Criteria) this;
        }

        public Criteria andUndcodeIsNull() {
            addCriterion("undCode is null");
            return (Criteria) this;
        }

        public Criteria andUndcodeIsNotNull() {
            addCriterion("undCode is not null");
            return (Criteria) this;
        }

        public Criteria andUndcodeEqualTo(Long value) {
            addCriterion("undCode =", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeNotEqualTo(Long value) {
            addCriterion("undCode <>", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeGreaterThan(Long value) {
            addCriterion("undCode >", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("undCode >=", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeLessThan(Long value) {
            addCriterion("undCode <", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeLessThanOrEqualTo(Long value) {
            addCriterion("undCode <=", value, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeIn(List<Long> values) {
            addCriterion("undCode in", values, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeNotIn(List<Long> values) {
            addCriterion("undCode not in", values, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeBetween(Long value1, Long value2) {
            addCriterion("undCode between", value1, value2, "undcode");
            return (Criteria) this;
        }

        public Criteria andUndcodeNotBetween(Long value1, Long value2) {
            addCriterion("undCode not between", value1, value2, "undcode");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNull() {
            addCriterion("transactionType is null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIsNotNull() {
            addCriterion("transactionType is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeEqualTo(String value) {
            addCriterion("transactionType =", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotEqualTo(String value) {
            addCriterion("transactionType <>", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThan(String value) {
            addCriterion("transactionType >", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("transactionType >=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThan(String value) {
            addCriterion("transactionType <", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLessThanOrEqualTo(String value) {
            addCriterion("transactionType <=", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeLike(String value) {
            addCriterion("transactionType like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotLike(String value) {
            addCriterion("transactionType not like", value, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeIn(List<String> values) {
            addCriterion("transactionType in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotIn(List<String> values) {
            addCriterion("transactionType not in", values, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeBetween(String value1, String value2) {
            addCriterion("transactionType between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiontypeNotBetween(String value1, String value2) {
            addCriterion("transactionType not between", value1, value2, "transactiontype");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("transactionDate is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("transactionDate is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(Date value) {
            addCriterion("transactionDate =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(Date value) {
            addCriterion("transactionDate <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(Date value) {
            addCriterion("transactionDate >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("transactionDate >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(Date value) {
            addCriterion("transactionDate <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(Date value) {
            addCriterion("transactionDate <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<Date> values) {
            addCriterion("transactionDate in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<Date> values) {
            addCriterion("transactionDate not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(Date value1, Date value2) {
            addCriterion("transactionDate between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(Date value1, Date value2) {
            addCriterion("transactionDate not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNull() {
            addCriterion("netValue is null");
            return (Criteria) this;
        }

        public Criteria andNetvalueIsNotNull() {
            addCriterion("netValue is not null");
            return (Criteria) this;
        }

        public Criteria andNetvalueEqualTo(Double value) {
            addCriterion("netValue =", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotEqualTo(Double value) {
            addCriterion("netValue <>", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThan(Double value) {
            addCriterion("netValue >", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("netValue >=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThan(Double value) {
            addCriterion("netValue <", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueLessThanOrEqualTo(Double value) {
            addCriterion("netValue <=", value, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueIn(List<Double> values) {
            addCriterion("netValue in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotIn(List<Double> values) {
            addCriterion("netValue not in", values, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueBetween(Double value1, Double value2) {
            addCriterion("netValue between", value1, value2, "netvalue");
            return (Criteria) this;
        }

        public Criteria andNetvalueNotBetween(Double value1, Double value2) {
            addCriterion("netValue not between", value1, value2, "netvalue");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIsNull() {
            addCriterion("accumulated_Net is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIsNotNull() {
            addCriterion("accumulated_Net is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetEqualTo(Double value) {
            addCriterion("accumulated_Net =", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotEqualTo(Double value) {
            addCriterion("accumulated_Net <>", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetGreaterThan(Double value) {
            addCriterion("accumulated_Net >", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetGreaterThanOrEqualTo(Double value) {
            addCriterion("accumulated_Net >=", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetLessThan(Double value) {
            addCriterion("accumulated_Net <", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetLessThanOrEqualTo(Double value) {
            addCriterion("accumulated_Net <=", value, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetIn(List<Double> values) {
            addCriterion("accumulated_Net in", values, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotIn(List<Double> values) {
            addCriterion("accumulated_Net not in", values, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetBetween(Double value1, Double value2) {
            addCriterion("accumulated_Net between", value1, value2, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andAccumulatedNetNotBetween(Double value1, Double value2) {
            addCriterion("accumulated_Net not between", value1, value2, "accumulatedNet");
            return (Criteria) this;
        }

        public Criteria andValuationIsNull() {
            addCriterion("valuation is null");
            return (Criteria) this;
        }

        public Criteria andValuationIsNotNull() {
            addCriterion("valuation is not null");
            return (Criteria) this;
        }

        public Criteria andValuationEqualTo(Double value) {
            addCriterion("valuation =", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotEqualTo(Double value) {
            addCriterion("valuation <>", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationGreaterThan(Double value) {
            addCriterion("valuation >", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationGreaterThanOrEqualTo(Double value) {
            addCriterion("valuation >=", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationLessThan(Double value) {
            addCriterion("valuation <", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationLessThanOrEqualTo(Double value) {
            addCriterion("valuation <=", value, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationIn(List<Double> values) {
            addCriterion("valuation in", values, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotIn(List<Double> values) {
            addCriterion("valuation not in", values, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationBetween(Double value1, Double value2) {
            addCriterion("valuation between", value1, value2, "valuation");
            return (Criteria) this;
        }

        public Criteria andValuationNotBetween(Double value1, Double value2) {
            addCriterion("valuation not between", value1, value2, "valuation");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyIsNull() {
            addCriterion("amountOfMoney is null");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyIsNotNull() {
            addCriterion("amountOfMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyEqualTo(Double value) {
            addCriterion("amountOfMoney =", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyNotEqualTo(Double value) {
            addCriterion("amountOfMoney <>", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyGreaterThan(Double value) {
            addCriterion("amountOfMoney >", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("amountOfMoney >=", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyLessThan(Double value) {
            addCriterion("amountOfMoney <", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyLessThanOrEqualTo(Double value) {
            addCriterion("amountOfMoney <=", value, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyIn(List<Double> values) {
            addCriterion("amountOfMoney in", values, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyNotIn(List<Double> values) {
            addCriterion("amountOfMoney not in", values, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyBetween(Double value1, Double value2) {
            addCriterion("amountOfMoney between", value1, value2, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andAmountofmoneyNotBetween(Double value1, Double value2) {
            addCriterion("amountOfMoney not between", value1, value2, "amountofmoney");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIsNull() {
            addCriterion("handlingFee is null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIsNotNull() {
            addCriterion("handlingFee is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeEqualTo(Double value) {
            addCriterion("handlingFee =", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotEqualTo(Double value) {
            addCriterion("handlingFee <>", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeGreaterThan(Double value) {
            addCriterion("handlingFee >", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("handlingFee >=", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeLessThan(Double value) {
            addCriterion("handlingFee <", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeLessThanOrEqualTo(Double value) {
            addCriterion("handlingFee <=", value, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeIn(List<Double> values) {
            addCriterion("handlingFee in", values, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotIn(List<Double> values) {
            addCriterion("handlingFee not in", values, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeBetween(Double value1, Double value2) {
            addCriterion("handlingFee between", value1, value2, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andHandlingfeeNotBetween(Double value1, Double value2) {
            addCriterion("handlingFee not between", value1, value2, "handlingfee");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("payType like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("payType not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNull() {
            addCriterion("bankCard is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("bankCard is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(Long value) {
            addCriterion("bankCard =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(Long value) {
            addCriterion("bankCard <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(Long value) {
            addCriterion("bankCard >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(Long value) {
            addCriterion("bankCard >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(Long value) {
            addCriterion("bankCard <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(Long value) {
            addCriterion("bankCard <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<Long> values) {
            addCriterion("bankCard in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<Long> values) {
            addCriterion("bankCard not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(Long value1, Long value2) {
            addCriterion("bankCard between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(Long value1, Long value2) {
            addCriterion("bankCard not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNull() {
            addCriterion("bankType is null");
            return (Criteria) this;
        }

        public Criteria andBanktypeIsNotNull() {
            addCriterion("bankType is not null");
            return (Criteria) this;
        }

        public Criteria andBanktypeEqualTo(String value) {
            addCriterion("bankType =", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotEqualTo(String value) {
            addCriterion("bankType <>", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThan(String value) {
            addCriterion("bankType >", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeGreaterThanOrEqualTo(String value) {
            addCriterion("bankType >=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThan(String value) {
            addCriterion("bankType <", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLessThanOrEqualTo(String value) {
            addCriterion("bankType <=", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeLike(String value) {
            addCriterion("bankType like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotLike(String value) {
            addCriterion("bankType not like", value, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeIn(List<String> values) {
            addCriterion("bankType in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotIn(List<String> values) {
            addCriterion("bankType not in", values, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeBetween(String value1, String value2) {
            addCriterion("bankType between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andBanktypeNotBetween(String value1, String value2) {
            addCriterion("bankType not between", value1, value2, "banktype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeIsNull() {
            addCriterion("dividendType is null");
            return (Criteria) this;
        }

        public Criteria andDividendtypeIsNotNull() {
            addCriterion("dividendType is not null");
            return (Criteria) this;
        }

        public Criteria andDividendtypeEqualTo(String value) {
            addCriterion("dividendType =", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeNotEqualTo(String value) {
            addCriterion("dividendType <>", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeGreaterThan(String value) {
            addCriterion("dividendType >", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeGreaterThanOrEqualTo(String value) {
            addCriterion("dividendType >=", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeLessThan(String value) {
            addCriterion("dividendType <", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeLessThanOrEqualTo(String value) {
            addCriterion("dividendType <=", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeLike(String value) {
            addCriterion("dividendType like", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeNotLike(String value) {
            addCriterion("dividendType not like", value, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeIn(List<String> values) {
            addCriterion("dividendType in", values, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeNotIn(List<String> values) {
            addCriterion("dividendType not in", values, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeBetween(String value1, String value2) {
            addCriterion("dividendType between", value1, value2, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andDividendtypeNotBetween(String value1, String value2) {
            addCriterion("dividendType not between", value1, value2, "dividendtype");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderStatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderStatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderStatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderStatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderStatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderStatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderStatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderStatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderStatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderStatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderStatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderStatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderStatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderStatus not between", value1, value2, "orderstatus");
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
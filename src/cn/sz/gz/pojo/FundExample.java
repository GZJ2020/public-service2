package cn.sz.gz.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFundidIsNull() {
            addCriterion("fundId is null");
            return (Criteria) this;
        }

        public Criteria andFundidIsNotNull() {
            addCriterion("fundId is not null");
            return (Criteria) this;
        }

        public Criteria andFundidEqualTo(Long value) {
            addCriterion("fundId =", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotEqualTo(Long value) {
            addCriterion("fundId <>", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThan(Long value) {
            addCriterion("fundId >", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidGreaterThanOrEqualTo(Long value) {
            addCriterion("fundId >=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThan(Long value) {
            addCriterion("fundId <", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidLessThanOrEqualTo(Long value) {
            addCriterion("fundId <=", value, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidIn(List<Long> values) {
            addCriterion("fundId in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotIn(List<Long> values) {
            addCriterion("fundId not in", values, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidBetween(Long value1, Long value2) {
            addCriterion("fundId between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundidNotBetween(Long value1, Long value2) {
            addCriterion("fundId not between", value1, value2, "fundid");
            return (Criteria) this;
        }

        public Criteria andFundcodeIsNull() {
            addCriterion("fundCode is null");
            return (Criteria) this;
        }

        public Criteria andFundcodeIsNotNull() {
            addCriterion("fundCode is not null");
            return (Criteria) this;
        }

        public Criteria andFundcodeEqualTo(Long value) {
            addCriterion("fundCode =", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotEqualTo(Long value) {
            addCriterion("fundCode <>", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThan(Long value) {
            addCriterion("fundCode >", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("fundCode >=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThan(Long value) {
            addCriterion("fundCode <", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeLessThanOrEqualTo(Long value) {
            addCriterion("fundCode <=", value, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeIn(List<Long> values) {
            addCriterion("fundCode in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotIn(List<Long> values) {
            addCriterion("fundCode not in", values, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeBetween(Long value1, Long value2) {
            addCriterion("fundCode between", value1, value2, "fundcode");
            return (Criteria) this;
        }

        public Criteria andFundcodeNotBetween(Long value1, Long value2) {
            addCriterion("fundCode not between", value1, value2, "fundcode");
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

        public Criteria andSetupdateIsNull() {
            addCriterion("setupDate is null");
            return (Criteria) this;
        }

        public Criteria andSetupdateIsNotNull() {
            addCriterion("setupDate is not null");
            return (Criteria) this;
        }

        public Criteria andSetupdateEqualTo(Date value) {
            addCriterionForJDBCDate("setupDate =", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("setupDate <>", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateGreaterThan(Date value) {
            addCriterionForJDBCDate("setupDate >", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("setupDate >=", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateLessThan(Date value) {
            addCriterionForJDBCDate("setupDate <", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("setupDate <=", value, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateIn(List<Date> values) {
            addCriterionForJDBCDate("setupDate in", values, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("setupDate not in", values, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("setupDate between", value1, value2, "setupdate");
            return (Criteria) this;
        }

        public Criteria andSetupdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("setupDate not between", value1, value2, "setupdate");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNull() {
            addCriterion("fundType is null");
            return (Criteria) this;
        }

        public Criteria andFundtypeIsNotNull() {
            addCriterion("fundType is not null");
            return (Criteria) this;
        }

        public Criteria andFundtypeEqualTo(String value) {
            addCriterion("fundType =", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotEqualTo(String value) {
            addCriterion("fundType <>", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThan(String value) {
            addCriterion("fundType >", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeGreaterThanOrEqualTo(String value) {
            addCriterion("fundType >=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThan(String value) {
            addCriterion("fundType <", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLessThanOrEqualTo(String value) {
            addCriterion("fundType <=", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeLike(String value) {
            addCriterion("fundType like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotLike(String value) {
            addCriterion("fundType not like", value, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeIn(List<String> values) {
            addCriterion("fundType in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotIn(List<String> values) {
            addCriterion("fundType not in", values, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeBetween(String value1, String value2) {
            addCriterion("fundType between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andFundtypeNotBetween(String value1, String value2) {
            addCriterion("fundType not between", value1, value2, "fundtype");
            return (Criteria) this;
        }

        public Criteria andInveststrategyIsNull() {
            addCriterion("investStrategy is null");
            return (Criteria) this;
        }

        public Criteria andInveststrategyIsNotNull() {
            addCriterion("investStrategy is not null");
            return (Criteria) this;
        }

        public Criteria andInveststrategyEqualTo(String value) {
            addCriterion("investStrategy =", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyNotEqualTo(String value) {
            addCriterion("investStrategy <>", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyGreaterThan(String value) {
            addCriterion("investStrategy >", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyGreaterThanOrEqualTo(String value) {
            addCriterion("investStrategy >=", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyLessThan(String value) {
            addCriterion("investStrategy <", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyLessThanOrEqualTo(String value) {
            addCriterion("investStrategy <=", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyLike(String value) {
            addCriterion("investStrategy like", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyNotLike(String value) {
            addCriterion("investStrategy not like", value, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyIn(List<String> values) {
            addCriterion("investStrategy in", values, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyNotIn(List<String> values) {
            addCriterion("investStrategy not in", values, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyBetween(String value1, String value2) {
            addCriterion("investStrategy between", value1, value2, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andInveststrategyNotBetween(String value1, String value2) {
            addCriterion("investStrategy not between", value1, value2, "investstrategy");
            return (Criteria) this;
        }

        public Criteria andRisklevelIsNull() {
            addCriterion("riskLevel is null");
            return (Criteria) this;
        }

        public Criteria andRisklevelIsNotNull() {
            addCriterion("riskLevel is not null");
            return (Criteria) this;
        }

        public Criteria andRisklevelEqualTo(String value) {
            addCriterion("riskLevel =", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotEqualTo(String value) {
            addCriterion("riskLevel <>", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelGreaterThan(String value) {
            addCriterion("riskLevel >", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelGreaterThanOrEqualTo(String value) {
            addCriterion("riskLevel >=", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelLessThan(String value) {
            addCriterion("riskLevel <", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelLessThanOrEqualTo(String value) {
            addCriterion("riskLevel <=", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelLike(String value) {
            addCriterion("riskLevel like", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotLike(String value) {
            addCriterion("riskLevel not like", value, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelIn(List<String> values) {
            addCriterion("riskLevel in", values, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotIn(List<String> values) {
            addCriterion("riskLevel not in", values, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelBetween(String value1, String value2) {
            addCriterion("riskLevel between", value1, value2, "risklevel");
            return (Criteria) this;
        }

        public Criteria andRisklevelNotBetween(String value1, String value2) {
            addCriterion("riskLevel not between", value1, value2, "risklevel");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNull() {
            addCriterion("saleStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("saleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(String value) {
            addCriterion("saleStatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(String value) {
            addCriterion("saleStatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(String value) {
            addCriterion("saleStatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(String value) {
            addCriterion("saleStatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(String value) {
            addCriterion("saleStatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(String value) {
            addCriterion("saleStatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLike(String value) {
            addCriterion("saleStatus like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotLike(String value) {
            addCriterion("saleStatus not like", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<String> values) {
            addCriterion("saleStatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<String> values) {
            addCriterion("saleStatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(String value1, String value2) {
            addCriterion("saleStatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(String value1, String value2) {
            addCriterion("saleStatus not between", value1, value2, "salestatus");
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

        public Criteria andNetvaluedateIsNull() {
            addCriterion("netValueDate is null");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateIsNotNull() {
            addCriterion("netValueDate is not null");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateEqualTo(Date value) {
            addCriterion("netValueDate =", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateNotEqualTo(Date value) {
            addCriterion("netValueDate <>", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateGreaterThan(Date value) {
            addCriterion("netValueDate >", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateGreaterThanOrEqualTo(Date value) {
            addCriterion("netValueDate >=", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateLessThan(Date value) {
            addCriterion("netValueDate <", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateLessThanOrEqualTo(Date value) {
            addCriterion("netValueDate <=", value, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateIn(List<Date> values) {
            addCriterion("netValueDate in", values, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateNotIn(List<Date> values) {
            addCriterion("netValueDate not in", values, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateBetween(Date value1, Date value2) {
            addCriterion("netValueDate between", value1, value2, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andNetvaluedateNotBetween(Date value1, Date value2) {
            addCriterion("netValueDate not between", value1, value2, "netvaluedate");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthIsNull() {
            addCriterion("dayOfGrowth is null");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthIsNotNull() {
            addCriterion("dayOfGrowth is not null");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthEqualTo(Double value) {
            addCriterion("dayOfGrowth =", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthNotEqualTo(Double value) {
            addCriterion("dayOfGrowth <>", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthGreaterThan(Double value) {
            addCriterion("dayOfGrowth >", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthGreaterThanOrEqualTo(Double value) {
            addCriterion("dayOfGrowth >=", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthLessThan(Double value) {
            addCriterion("dayOfGrowth <", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthLessThanOrEqualTo(Double value) {
            addCriterion("dayOfGrowth <=", value, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthIn(List<Double> values) {
            addCriterion("dayOfGrowth in", values, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthNotIn(List<Double> values) {
            addCriterion("dayOfGrowth not in", values, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthBetween(Double value1, Double value2) {
            addCriterion("dayOfGrowth between", value1, value2, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andDayofgrowthNotBetween(Double value1, Double value2) {
            addCriterion("dayOfGrowth not between", value1, value2, "dayofgrowth");
            return (Criteria) this;
        }

        public Criteria andLastweekIsNull() {
            addCriterion("lastWeek is null");
            return (Criteria) this;
        }

        public Criteria andLastweekIsNotNull() {
            addCriterion("lastWeek is not null");
            return (Criteria) this;
        }

        public Criteria andLastweekEqualTo(Double value) {
            addCriterion("lastWeek =", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotEqualTo(Double value) {
            addCriterion("lastWeek <>", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekGreaterThan(Double value) {
            addCriterion("lastWeek >", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekGreaterThanOrEqualTo(Double value) {
            addCriterion("lastWeek >=", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekLessThan(Double value) {
            addCriterion("lastWeek <", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekLessThanOrEqualTo(Double value) {
            addCriterion("lastWeek <=", value, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekIn(List<Double> values) {
            addCriterion("lastWeek in", values, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotIn(List<Double> values) {
            addCriterion("lastWeek not in", values, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekBetween(Double value1, Double value2) {
            addCriterion("lastWeek between", value1, value2, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastweekNotBetween(Double value1, Double value2) {
            addCriterion("lastWeek not between", value1, value2, "lastweek");
            return (Criteria) this;
        }

        public Criteria andLastmonthIsNull() {
            addCriterion("lastMonth is null");
            return (Criteria) this;
        }

        public Criteria andLastmonthIsNotNull() {
            addCriterion("lastMonth is not null");
            return (Criteria) this;
        }

        public Criteria andLastmonthEqualTo(Double value) {
            addCriterion("lastMonth =", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthNotEqualTo(Double value) {
            addCriterion("lastMonth <>", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthGreaterThan(Double value) {
            addCriterion("lastMonth >", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthGreaterThanOrEqualTo(Double value) {
            addCriterion("lastMonth >=", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthLessThan(Double value) {
            addCriterion("lastMonth <", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthLessThanOrEqualTo(Double value) {
            addCriterion("lastMonth <=", value, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthIn(List<Double> values) {
            addCriterion("lastMonth in", values, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthNotIn(List<Double> values) {
            addCriterion("lastMonth not in", values, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthBetween(Double value1, Double value2) {
            addCriterion("lastMonth between", value1, value2, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastmonthNotBetween(Double value1, Double value2) {
            addCriterion("lastMonth not between", value1, value2, "lastmonth");
            return (Criteria) this;
        }

        public Criteria andLastquarterIsNull() {
            addCriterion("lastQuarter is null");
            return (Criteria) this;
        }

        public Criteria andLastquarterIsNotNull() {
            addCriterion("lastQuarter is not null");
            return (Criteria) this;
        }

        public Criteria andLastquarterEqualTo(Double value) {
            addCriterion("lastQuarter =", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterNotEqualTo(Double value) {
            addCriterion("lastQuarter <>", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterGreaterThan(Double value) {
            addCriterion("lastQuarter >", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterGreaterThanOrEqualTo(Double value) {
            addCriterion("lastQuarter >=", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterLessThan(Double value) {
            addCriterion("lastQuarter <", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterLessThanOrEqualTo(Double value) {
            addCriterion("lastQuarter <=", value, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterIn(List<Double> values) {
            addCriterion("lastQuarter in", values, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterNotIn(List<Double> values) {
            addCriterion("lastQuarter not in", values, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterBetween(Double value1, Double value2) {
            addCriterion("lastQuarter between", value1, value2, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLastquarterNotBetween(Double value1, Double value2) {
            addCriterion("lastQuarter not between", value1, value2, "lastquarter");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearIsNull() {
            addCriterion("lastHalfYear is null");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearIsNotNull() {
            addCriterion("lastHalfYear is not null");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearEqualTo(Double value) {
            addCriterion("lastHalfYear =", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearNotEqualTo(Double value) {
            addCriterion("lastHalfYear <>", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearGreaterThan(Double value) {
            addCriterion("lastHalfYear >", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearGreaterThanOrEqualTo(Double value) {
            addCriterion("lastHalfYear >=", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearLessThan(Double value) {
            addCriterion("lastHalfYear <", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearLessThanOrEqualTo(Double value) {
            addCriterion("lastHalfYear <=", value, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearIn(List<Double> values) {
            addCriterion("lastHalfYear in", values, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearNotIn(List<Double> values) {
            addCriterion("lastHalfYear not in", values, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearBetween(Double value1, Double value2) {
            addCriterion("lastHalfYear between", value1, value2, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLasthalfyearNotBetween(Double value1, Double value2) {
            addCriterion("lastHalfYear not between", value1, value2, "lasthalfyear");
            return (Criteria) this;
        }

        public Criteria andLastyearIsNull() {
            addCriterion("lastYear is null");
            return (Criteria) this;
        }

        public Criteria andLastyearIsNotNull() {
            addCriterion("lastYear is not null");
            return (Criteria) this;
        }

        public Criteria andLastyearEqualTo(Double value) {
            addCriterion("lastYear =", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearNotEqualTo(Double value) {
            addCriterion("lastYear <>", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearGreaterThan(Double value) {
            addCriterion("lastYear >", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearGreaterThanOrEqualTo(Double value) {
            addCriterion("lastYear >=", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearLessThan(Double value) {
            addCriterion("lastYear <", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearLessThanOrEqualTo(Double value) {
            addCriterion("lastYear <=", value, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearIn(List<Double> values) {
            addCriterion("lastYear in", values, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearNotIn(List<Double> values) {
            addCriterion("lastYear not in", values, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearBetween(Double value1, Double value2) {
            addCriterion("lastYear between", value1, value2, "lastyear");
            return (Criteria) this;
        }

        public Criteria andLastyearNotBetween(Double value1, Double value2) {
            addCriterion("lastYear not between", value1, value2, "lastyear");
            return (Criteria) this;
        }

        public Criteria andFundmanagersIsNull() {
            addCriterion("fundManagers is null");
            return (Criteria) this;
        }

        public Criteria andFundmanagersIsNotNull() {
            addCriterion("fundManagers is not null");
            return (Criteria) this;
        }

        public Criteria andFundmanagersEqualTo(String value) {
            addCriterion("fundManagers =", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersNotEqualTo(String value) {
            addCriterion("fundManagers <>", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersGreaterThan(String value) {
            addCriterion("fundManagers >", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersGreaterThanOrEqualTo(String value) {
            addCriterion("fundManagers >=", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersLessThan(String value) {
            addCriterion("fundManagers <", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersLessThanOrEqualTo(String value) {
            addCriterion("fundManagers <=", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersLike(String value) {
            addCriterion("fundManagers like", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersNotLike(String value) {
            addCriterion("fundManagers not like", value, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersIn(List<String> values) {
            addCriterion("fundManagers in", values, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersNotIn(List<String> values) {
            addCriterion("fundManagers not in", values, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersBetween(String value1, String value2) {
            addCriterion("fundManagers between", value1, value2, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andFundmanagersNotBetween(String value1, String value2) {
            addCriterion("fundManagers not between", value1, value2, "fundmanagers");
            return (Criteria) this;
        }

        public Criteria andManagerateIsNull() {
            addCriterion("manageRate is null");
            return (Criteria) this;
        }

        public Criteria andManagerateIsNotNull() {
            addCriterion("manageRate is not null");
            return (Criteria) this;
        }

        public Criteria andManagerateEqualTo(Double value) {
            addCriterion("manageRate =", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotEqualTo(Double value) {
            addCriterion("manageRate <>", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThan(Double value) {
            addCriterion("manageRate >", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateGreaterThanOrEqualTo(Double value) {
            addCriterion("manageRate >=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThan(Double value) {
            addCriterion("manageRate <", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateLessThanOrEqualTo(Double value) {
            addCriterion("manageRate <=", value, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateIn(List<Double> values) {
            addCriterion("manageRate in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotIn(List<Double> values) {
            addCriterion("manageRate not in", values, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateBetween(Double value1, Double value2) {
            addCriterion("manageRate between", value1, value2, "managerate");
            return (Criteria) this;
        }

        public Criteria andManagerateNotBetween(Double value1, Double value2) {
            addCriterion("manageRate not between", value1, value2, "managerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateIsNull() {
            addCriterion("trusteeRate is null");
            return (Criteria) this;
        }

        public Criteria andTrusteerateIsNotNull() {
            addCriterion("trusteeRate is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteerateEqualTo(Double value) {
            addCriterion("trusteeRate =", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateNotEqualTo(Double value) {
            addCriterion("trusteeRate <>", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateGreaterThan(Double value) {
            addCriterion("trusteeRate >", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateGreaterThanOrEqualTo(Double value) {
            addCriterion("trusteeRate >=", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateLessThan(Double value) {
            addCriterion("trusteeRate <", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateLessThanOrEqualTo(Double value) {
            addCriterion("trusteeRate <=", value, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateIn(List<Double> values) {
            addCriterion("trusteeRate in", values, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateNotIn(List<Double> values) {
            addCriterion("trusteeRate not in", values, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateBetween(Double value1, Double value2) {
            addCriterion("trusteeRate between", value1, value2, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andTrusteerateNotBetween(Double value1, Double value2) {
            addCriterion("trusteeRate not between", value1, value2, "trusteerate");
            return (Criteria) this;
        }

        public Criteria andServicerateIsNull() {
            addCriterion("serviceRate is null");
            return (Criteria) this;
        }

        public Criteria andServicerateIsNotNull() {
            addCriterion("serviceRate is not null");
            return (Criteria) this;
        }

        public Criteria andServicerateEqualTo(Double value) {
            addCriterion("serviceRate =", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateNotEqualTo(Double value) {
            addCriterion("serviceRate <>", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateGreaterThan(Double value) {
            addCriterion("serviceRate >", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateGreaterThanOrEqualTo(Double value) {
            addCriterion("serviceRate >=", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateLessThan(Double value) {
            addCriterion("serviceRate <", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateLessThanOrEqualTo(Double value) {
            addCriterion("serviceRate <=", value, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateIn(List<Double> values) {
            addCriterion("serviceRate in", values, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateNotIn(List<Double> values) {
            addCriterion("serviceRate not in", values, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateBetween(Double value1, Double value2) {
            addCriterion("serviceRate between", value1, value2, "servicerate");
            return (Criteria) this;
        }

        public Criteria andServicerateNotBetween(Double value1, Double value2) {
            addCriterion("serviceRate not between", value1, value2, "servicerate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateIsNull() {
            addCriterion("purchaseRate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserateIsNotNull() {
            addCriterion("purchaseRate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserateEqualTo(Double value) {
            addCriterion("purchaseRate =", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateNotEqualTo(Double value) {
            addCriterion("purchaseRate <>", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateGreaterThan(Double value) {
            addCriterion("purchaseRate >", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateGreaterThanOrEqualTo(Double value) {
            addCriterion("purchaseRate >=", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateLessThan(Double value) {
            addCriterion("purchaseRate <", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateLessThanOrEqualTo(Double value) {
            addCriterion("purchaseRate <=", value, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateIn(List<Double> values) {
            addCriterion("purchaseRate in", values, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateNotIn(List<Double> values) {
            addCriterion("purchaseRate not in", values, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateBetween(Double value1, Double value2) {
            addCriterion("purchaseRate between", value1, value2, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andPurchaserateNotBetween(Double value1, Double value2) {
            addCriterion("purchaseRate not between", value1, value2, "purchaserate");
            return (Criteria) this;
        }

        public Criteria andMinamountIsNull() {
            addCriterion("minAmount is null");
            return (Criteria) this;
        }

        public Criteria andMinamountIsNotNull() {
            addCriterion("minAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMinamountEqualTo(Double value) {
            addCriterion("minAmount =", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountNotEqualTo(Double value) {
            addCriterion("minAmount <>", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountGreaterThan(Double value) {
            addCriterion("minAmount >", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountGreaterThanOrEqualTo(Double value) {
            addCriterion("minAmount >=", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountLessThan(Double value) {
            addCriterion("minAmount <", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountLessThanOrEqualTo(Double value) {
            addCriterion("minAmount <=", value, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountIn(List<Double> values) {
            addCriterion("minAmount in", values, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountNotIn(List<Double> values) {
            addCriterion("minAmount not in", values, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountBetween(Double value1, Double value2) {
            addCriterion("minAmount between", value1, value2, "minamount");
            return (Criteria) this;
        }

        public Criteria andMinamountNotBetween(Double value1, Double value2) {
            addCriterion("minAmount not between", value1, value2, "minamount");
            return (Criteria) this;
        }

        public Criteria andRedeemrateIsNull() {
            addCriterion("redeemRate is null");
            return (Criteria) this;
        }

        public Criteria andRedeemrateIsNotNull() {
            addCriterion("redeemRate is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemrateEqualTo(Double value) {
            addCriterion("redeemRate =", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateNotEqualTo(Double value) {
            addCriterion("redeemRate <>", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateGreaterThan(Double value) {
            addCriterion("redeemRate >", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateGreaterThanOrEqualTo(Double value) {
            addCriterion("redeemRate >=", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateLessThan(Double value) {
            addCriterion("redeemRate <", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateLessThanOrEqualTo(Double value) {
            addCriterion("redeemRate <=", value, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateIn(List<Double> values) {
            addCriterion("redeemRate in", values, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateNotIn(List<Double> values) {
            addCriterion("redeemRate not in", values, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateBetween(Double value1, Double value2) {
            addCriterion("redeemRate between", value1, value2, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andRedeemrateNotBetween(Double value1, Double value2) {
            addCriterion("redeemRate not between", value1, value2, "redeemrate");
            return (Criteria) this;
        }

        public Criteria andFundstatusIsNull() {
            addCriterion("fundStatus is null");
            return (Criteria) this;
        }

        public Criteria andFundstatusIsNotNull() {
            addCriterion("fundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFundstatusEqualTo(String value) {
            addCriterion("fundStatus =", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusNotEqualTo(String value) {
            addCriterion("fundStatus <>", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusGreaterThan(String value) {
            addCriterion("fundStatus >", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusGreaterThanOrEqualTo(String value) {
            addCriterion("fundStatus >=", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusLessThan(String value) {
            addCriterion("fundStatus <", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusLessThanOrEqualTo(String value) {
            addCriterion("fundStatus <=", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusLike(String value) {
            addCriterion("fundStatus like", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusNotLike(String value) {
            addCriterion("fundStatus not like", value, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusIn(List<String> values) {
            addCriterion("fundStatus in", values, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusNotIn(List<String> values) {
            addCriterion("fundStatus not in", values, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusBetween(String value1, String value2) {
            addCriterion("fundStatus between", value1, value2, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andFundstatusNotBetween(String value1, String value2) {
            addCriterion("fundStatus not between", value1, value2, "fundstatus");
            return (Criteria) this;
        }

        public Criteria andAsktypeIsNull() {
            addCriterion("askType is null");
            return (Criteria) this;
        }

        public Criteria andAsktypeIsNotNull() {
            addCriterion("askType is not null");
            return (Criteria) this;
        }

        public Criteria andAsktypeEqualTo(String value) {
            addCriterion("askType =", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeNotEqualTo(String value) {
            addCriterion("askType <>", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeGreaterThan(String value) {
            addCriterion("askType >", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeGreaterThanOrEqualTo(String value) {
            addCriterion("askType >=", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeLessThan(String value) {
            addCriterion("askType <", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeLessThanOrEqualTo(String value) {
            addCriterion("askType <=", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeLike(String value) {
            addCriterion("askType like", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeNotLike(String value) {
            addCriterion("askType not like", value, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeIn(List<String> values) {
            addCriterion("askType in", values, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeNotIn(List<String> values) {
            addCriterion("askType not in", values, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeBetween(String value1, String value2) {
            addCriterion("askType between", value1, value2, "asktype");
            return (Criteria) this;
        }

        public Criteria andAsktypeNotBetween(String value1, String value2) {
            addCriterion("askType not between", value1, value2, "asktype");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("operatorName is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("operatorName =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("operatorName <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("operatorName >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("operatorName >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("operatorName <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("operatorName <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("operatorName like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("operatorName not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("operatorName in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("operatorName not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("operatorName between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("operatorName not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatordateIsNull() {
            addCriterion("operatorDate is null");
            return (Criteria) this;
        }

        public Criteria andOperatordateIsNotNull() {
            addCriterion("operatorDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperatordateEqualTo(Date value) {
            addCriterionForJDBCDate("operatorDate =", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotEqualTo(Date value) {
            addCriterionForJDBCDate("operatorDate <>", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateGreaterThan(Date value) {
            addCriterionForJDBCDate("operatorDate >", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operatorDate >=", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateLessThan(Date value) {
            addCriterionForJDBCDate("operatorDate <", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operatorDate <=", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateIn(List<Date> values) {
            addCriterionForJDBCDate("operatorDate in", values, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotIn(List<Date> values) {
            addCriterionForJDBCDate("operatorDate not in", values, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operatorDate between", value1, value2, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operatorDate not between", value1, value2, "operatordate");
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
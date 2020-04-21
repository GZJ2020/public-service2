package cn.sz.gz.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FixedInvestmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FixedInvestmentExample() {
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

        public Criteria andFixedinvestmentidIsNull() {
            addCriterion("fixedInvestmentId is null");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidIsNotNull() {
            addCriterion("fixedInvestmentId is not null");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidEqualTo(Long value) {
            addCriterion("fixedInvestmentId =", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidNotEqualTo(Long value) {
            addCriterion("fixedInvestmentId <>", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidGreaterThan(Long value) {
            addCriterion("fixedInvestmentId >", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidGreaterThanOrEqualTo(Long value) {
            addCriterion("fixedInvestmentId >=", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidLessThan(Long value) {
            addCriterion("fixedInvestmentId <", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidLessThanOrEqualTo(Long value) {
            addCriterion("fixedInvestmentId <=", value, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidIn(List<Long> values) {
            addCriterion("fixedInvestmentId in", values, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidNotIn(List<Long> values) {
            addCriterion("fixedInvestmentId not in", values, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidBetween(Long value1, Long value2) {
            addCriterion("fixedInvestmentId between", value1, value2, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentidNotBetween(Long value1, Long value2) {
            addCriterion("fixedInvestmentId not between", value1, value2, "fixedinvestmentid");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeIsNull() {
            addCriterion("fixedInvestmentIType is null");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeIsNotNull() {
            addCriterion("fixedInvestmentIType is not null");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeEqualTo(String value) {
            addCriterion("fixedInvestmentIType =", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeNotEqualTo(String value) {
            addCriterion("fixedInvestmentIType <>", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeGreaterThan(String value) {
            addCriterion("fixedInvestmentIType >", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeGreaterThanOrEqualTo(String value) {
            addCriterion("fixedInvestmentIType >=", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeLessThan(String value) {
            addCriterion("fixedInvestmentIType <", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeLessThanOrEqualTo(String value) {
            addCriterion("fixedInvestmentIType <=", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeLike(String value) {
            addCriterion("fixedInvestmentIType like", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeNotLike(String value) {
            addCriterion("fixedInvestmentIType not like", value, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeIn(List<String> values) {
            addCriterion("fixedInvestmentIType in", values, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeNotIn(List<String> values) {
            addCriterion("fixedInvestmentIType not in", values, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeBetween(String value1, String value2) {
            addCriterion("fixedInvestmentIType between", value1, value2, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andFixedinvestmentitypeNotBetween(String value1, String value2) {
            addCriterion("fixedInvestmentIType not between", value1, value2, "fixedinvestmentitype");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateIsNull() {
            addCriterion("firstDeductionDate is null");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateIsNotNull() {
            addCriterion("firstDeductionDate is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateEqualTo(Date value) {
            addCriterion("firstDeductionDate =", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateNotEqualTo(Date value) {
            addCriterion("firstDeductionDate <>", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateGreaterThan(Date value) {
            addCriterion("firstDeductionDate >", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("firstDeductionDate >=", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateLessThan(Date value) {
            addCriterion("firstDeductionDate <", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateLessThanOrEqualTo(Date value) {
            addCriterion("firstDeductionDate <=", value, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateIn(List<Date> values) {
            addCriterion("firstDeductionDate in", values, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateNotIn(List<Date> values) {
            addCriterion("firstDeductionDate not in", values, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateBetween(Date value1, Date value2) {
            addCriterion("firstDeductionDate between", value1, value2, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andFirstdeductiondateNotBetween(Date value1, Date value2) {
            addCriterion("firstDeductionDate not between", value1, value2, "firstdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Long value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Long value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Long value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Long value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Long value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Long> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Long> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Long value1, Long value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Long value1, Long value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateIsNull() {
            addCriterion("nextDeductionDate is null");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateIsNotNull() {
            addCriterion("nextDeductionDate is not null");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateEqualTo(Date value) {
            addCriterion("nextDeductionDate =", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateNotEqualTo(Date value) {
            addCriterion("nextDeductionDate <>", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateGreaterThan(Date value) {
            addCriterion("nextDeductionDate >", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("nextDeductionDate >=", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateLessThan(Date value) {
            addCriterion("nextDeductionDate <", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateLessThanOrEqualTo(Date value) {
            addCriterion("nextDeductionDate <=", value, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateIn(List<Date> values) {
            addCriterion("nextDeductionDate in", values, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateNotIn(List<Date> values) {
            addCriterion("nextDeductionDate not in", values, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateBetween(Date value1, Date value2) {
            addCriterion("nextDeductionDate between", value1, value2, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andNextdeductiondateNotBetween(Date value1, Date value2) {
            addCriterion("nextDeductionDate not between", value1, value2, "nextdeductiondate");
            return (Criteria) this;
        }

        public Criteria andDeductionamountIsNull() {
            addCriterion("deductionAmount is null");
            return (Criteria) this;
        }

        public Criteria andDeductionamountIsNotNull() {
            addCriterion("deductionAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionamountEqualTo(Double value) {
            addCriterion("deductionAmount =", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountNotEqualTo(Double value) {
            addCriterion("deductionAmount <>", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountGreaterThan(Double value) {
            addCriterion("deductionAmount >", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountGreaterThanOrEqualTo(Double value) {
            addCriterion("deductionAmount >=", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountLessThan(Double value) {
            addCriterion("deductionAmount <", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountLessThanOrEqualTo(Double value) {
            addCriterion("deductionAmount <=", value, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountIn(List<Double> values) {
            addCriterion("deductionAmount in", values, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountNotIn(List<Double> values) {
            addCriterion("deductionAmount not in", values, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountBetween(Double value1, Double value2) {
            addCriterion("deductionAmount between", value1, value2, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionamountNotBetween(Double value1, Double value2) {
            addCriterion("deductionAmount not between", value1, value2, "deductionamount");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusIsNull() {
            addCriterion("deductionStatus is null");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusIsNotNull() {
            addCriterion("deductionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusEqualTo(Long value) {
            addCriterion("deductionStatus =", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusNotEqualTo(Long value) {
            addCriterion("deductionStatus <>", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusGreaterThan(Long value) {
            addCriterion("deductionStatus >", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusGreaterThanOrEqualTo(Long value) {
            addCriterion("deductionStatus >=", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusLessThan(Long value) {
            addCriterion("deductionStatus <", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusLessThanOrEqualTo(Long value) {
            addCriterion("deductionStatus <=", value, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusIn(List<Long> values) {
            addCriterion("deductionStatus in", values, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusNotIn(List<Long> values) {
            addCriterion("deductionStatus not in", values, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusBetween(Long value1, Long value2) {
            addCriterion("deductionStatus between", value1, value2, "deductionstatus");
            return (Criteria) this;
        }

        public Criteria andDeductionstatusNotBetween(Long value1, Long value2) {
            addCriterion("deductionStatus not between", value1, value2, "deductionstatus");
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
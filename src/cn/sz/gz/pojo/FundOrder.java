package cn.sz.gz.pojo;

import java.util.Date;

public class FundOrder {
    private Long fundorderid;

    private Long fundid;

    private Long userid;

    private String fundname;

    private String fundcompanyname;

    private Long undcode;

    private String transactiontype;

    private Date transactiondate;

    private Double netvalue;

    private Double accumulatedNet;

    private Double valuation;

    private Double money;

    private Double amountofmoney;

    private Double handlingfee;

    private String paytype;

    private Long bankcard;

    private String banktype;

    private String dividendtype;

    private String orderstatus;

    public Long getFundorderid() {
        return fundorderid;
    }

    public void setFundorderid(Long fundorderid) {
        this.fundorderid = fundorderid;
    }

    public Long getFundid() {
        return fundid;
    }

    public void setFundid(Long fundid) {
        this.fundid = fundid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname == null ? null : fundname.trim();
    }

    public String getFundcompanyname() {
        return fundcompanyname;
    }

    public void setFundcompanyname(String fundcompanyname) {
        this.fundcompanyname = fundcompanyname == null ? null : fundcompanyname.trim();
    }

    public Long getUndcode() {
        return undcode;
    }

    public void setUndcode(Long undcode) {
        this.undcode = undcode;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype == null ? null : transactiontype.trim();
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public Double getNetvalue() {
        return netvalue;
    }

    public void setNetvalue(Double netvalue) {
        this.netvalue = netvalue;
    }

    public Double getAccumulatedNet() {
        return accumulatedNet;
    }

    public void setAccumulatedNet(Double accumulatedNet) {
        this.accumulatedNet = accumulatedNet;
    }

    public Double getValuation() {
        return valuation;
    }

    public void setValuation(Double valuation) {
        this.valuation = valuation;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getAmountofmoney() {
        return amountofmoney;
    }

    public void setAmountofmoney(Double amountofmoney) {
        this.amountofmoney = amountofmoney;
    }

    public Double getHandlingfee() {
        return handlingfee;
    }

    public void setHandlingfee(Double handlingfee) {
        this.handlingfee = handlingfee;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }

    public Long getBankcard() {
        return bankcard;
    }

    public void setBankcard(Long bankcard) {
        this.bankcard = bankcard;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype == null ? null : banktype.trim();
    }

    public String getDividendtype() {
        return dividendtype;
    }

    public void setDividendtype(String dividendtype) {
        this.dividendtype = dividendtype == null ? null : dividendtype.trim();
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }
}
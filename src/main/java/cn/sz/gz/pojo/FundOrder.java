package cn.sz.gz.pojo;

import java.util.Date;

public class FundOrder {
    private Integer fundorderid;//主键，订单表ID

    private Integer fundid;//基金id，用于查询基金信息

    private Integer userid;//客户id，根据id查询该用户所有订单

    private String fundname;//基金名称

    private String fundcompanyname;//基金公司

    private Integer undcode;//基金代码

    private String transactiontype;//交易类型（1买入、2卖出、3定投）

    private Date transactiondate;//交易时间（买入、卖出）

    private Double netvalue;//交易时的单位净值

    private Double accumulatedNet;//交易时的累计净值

    private Double valuation;//当前卖出估值收益

    private Double money;//交易金额

    private Double amountofmoney;//购买所对应的基金份额

    private Double handlingfee;//手续费

    private String paytype;//支付方式，默认银行卡

    private Integer bankcard;//银行卡号

    private String banktype;//银行卡类型

    private String dividendtype;//分红方式

    private String orderstatus;//订单状态（成功，失败，待处理）

    public Integer getFundorderid() {
        return fundorderid;
    }

    public void setFundorderid(Integer fundorderid) {
        this.fundorderid = fundorderid;
    }

    public Integer getFundid() {
        return fundid;
    }

    public void setFundid(Integer fundid) {
        this.fundid = fundid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname ;
    }

    public String getFundcompanyname() {
        return fundcompanyname;
    }

    public void setFundcompanyname(String fundcompanyname) {
        this.fundcompanyname = fundcompanyname ;
    }

    public Integer getUndcode() {
        return undcode;
    }

    public void setUndcode(Integer undcode) {
        this.undcode = undcode;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype ;
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
        this.paytype = paytype;
    }

    public Integer getBankcard() {
        return bankcard;
    }

    public void setBankcard(Integer bankcard) {
        this.bankcard = bankcard;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getDividendtype() {
        return dividendtype;
    }

    public void setDividendtype(String dividendtype) {
        this.dividendtype = dividendtype;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
}
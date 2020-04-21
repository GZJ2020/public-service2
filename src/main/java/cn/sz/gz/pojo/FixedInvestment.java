package cn.sz.gz.pojo;

import java.util.Date;

public class FixedInvestment {
    private Integer fixedinvestmentid;//定投计划表ID

    private String fixedinvestmentitype;//定投方式

    private String cycle;//扣款周期

    private Date firstdeductiondate;//第一次扣款日期

    private Integer number;//已完成定投的次数

    private Date nextdeductiondate;//下次扣款日期（没扣款一次更新一次）

    private Double deductionamount;//定投金额

    private Integer deductionstatus;//定投状态（1定投中，2已停止定投）

    private Integer fundcode;//基金代码(6位数)

    private String fundname;//基金名称

    private Integer bankcardnumber;//银行卡号

    private String bankcardtype;//银行卡类型

    private String paytype;//支付方式，默认银行卡

    private Integer fundid;//基金总表ID

    private Integer userid;//用户ID，可根据用户id查询所有定投计划

    public Integer getFixedinvestmentid() {
        return fixedinvestmentid;
    }

    public void setFixedinvestmentid(Integer fixedinvestmentid) {
        this.fixedinvestmentid = fixedinvestmentid;
    }

    public String getFixedinvestmentitype() {
        return fixedinvestmentitype;
    }

    public void setFixedinvestmentitype(String fixedinvestmentitype) {
        this.fixedinvestmentitype = fixedinvestmentitype;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public Date getFirstdeductiondate() {
        return firstdeductiondate;
    }

    public void setFirstdeductiondate(Date firstdeductiondate) {
        this.firstdeductiondate = firstdeductiondate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getNextdeductiondate() {
        return nextdeductiondate;
    }

    public void setNextdeductiondate(Date nextdeductiondate) {
        this.nextdeductiondate = nextdeductiondate;
    }

    public Double getDeductionamount() {
        return deductionamount;
    }

    public void setDeductionamount(Double deductionamount) {
        this.deductionamount = deductionamount;
    }

    public Integer getDeductionstatus() {
        return deductionstatus;
    }

    public void setDeductionstatus(Integer deductionstatus) {
        this.deductionstatus = deductionstatus;
    }

    public Integer getFundcode() {
        return fundcode;
    }

    public void setFundcode(Integer fundcode) {
        this.fundcode = fundcode;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public Integer getBankcardnumber() {
        return bankcardnumber;
    }

    public void setBankcardnumber(Integer bankcardnumber) {
        this.bankcardnumber = bankcardnumber;
    }

    public String getBankcardtype() {
        return bankcardtype;
    }

    public void setBankcardtype(String bankcardtype) {
        this.bankcardtype = bankcardtype;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype ;
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
}
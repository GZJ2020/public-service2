package cn.sz.gz.pojo;

import java.util.Date;

public class FixedInvestment {
    private Long fixedinvestmentid;

    private String fixedinvestmentitype;

    private String cycle;

    private Date firstdeductiondate;

    private Long number;

    private Date nextdeductiondate;

    private Double deductionamount;

    private Long deductionstatus;

    private Long fundcode;

    private String fundname;

    private Long bankcardnumber;

    private String bankcardtype;

    private String paytype;

    private Long fundid;

    private Long userid;

    public Long getFixedinvestmentid() {
        return fixedinvestmentid;
    }

    public void setFixedinvestmentid(Long fixedinvestmentid) {
        this.fixedinvestmentid = fixedinvestmentid;
    }

    public String getFixedinvestmentitype() {
        return fixedinvestmentitype;
    }

    public void setFixedinvestmentitype(String fixedinvestmentitype) {
        this.fixedinvestmentitype = fixedinvestmentitype == null ? null : fixedinvestmentitype.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Date getFirstdeductiondate() {
        return firstdeductiondate;
    }

    public void setFirstdeductiondate(Date firstdeductiondate) {
        this.firstdeductiondate = firstdeductiondate;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
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

    public Long getDeductionstatus() {
        return deductionstatus;
    }

    public void setDeductionstatus(Long deductionstatus) {
        this.deductionstatus = deductionstatus;
    }

    public Long getFundcode() {
        return fundcode;
    }

    public void setFundcode(Long fundcode) {
        this.fundcode = fundcode;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname == null ? null : fundname.trim();
    }

    public Long getBankcardnumber() {
        return bankcardnumber;
    }

    public void setBankcardnumber(Long bankcardnumber) {
        this.bankcardnumber = bankcardnumber;
    }

    public String getBankcardtype() {
        return bankcardtype;
    }

    public void setBankcardtype(String bankcardtype) {
        this.bankcardtype = bankcardtype == null ? null : bankcardtype.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
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
}
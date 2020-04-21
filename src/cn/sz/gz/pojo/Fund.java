package cn.sz.gz.pojo;

import java.util.Date;

public class Fund {
    private Long fundid;

    private Long fundcode;

    private String fundname;

    private String fundcompanyname;

    private Date setupdate;

    private String fundtype;

    private String investstrategy;

    private String risklevel;

    private String salestatus;

    private Double netvalue;

    private Double accumulatedNet;

    private Date netvaluedate;

    private Double dayofgrowth;

    private Double lastweek;

    private Double lastmonth;

    private Double lastquarter;

    private Double lasthalfyear;

    private Double lastyear;

    private String fundmanagers;

    private Double managerate;

    private Double trusteerate;

    private Double servicerate;

    private Double purchaserate;

    private Double minamount;

    private Double redeemrate;

    private String fundstatus;

    private String asktype;

    private String operatorname;

    private Date operatordate;

    public Long getFundid() {
        return fundid;
    }

    public void setFundid(Long fundid) {
        this.fundid = fundid;
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

    public String getFundcompanyname() {
        return fundcompanyname;
    }

    public void setFundcompanyname(String fundcompanyname) {
        this.fundcompanyname = fundcompanyname == null ? null : fundcompanyname.trim();
    }

    public Date getSetupdate() {
        return setupdate;
    }

    public void setSetupdate(Date setupdate) {
        this.setupdate = setupdate;
    }

    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype == null ? null : fundtype.trim();
    }

    public String getInveststrategy() {
        return investstrategy;
    }

    public void setInveststrategy(String investstrategy) {
        this.investstrategy = investstrategy == null ? null : investstrategy.trim();
    }

    public String getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(String risklevel) {
        this.risklevel = risklevel == null ? null : risklevel.trim();
    }

    public String getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(String salestatus) {
        this.salestatus = salestatus == null ? null : salestatus.trim();
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

    public Date getNetvaluedate() {
        return netvaluedate;
    }

    public void setNetvaluedate(Date netvaluedate) {
        this.netvaluedate = netvaluedate;
    }

    public Double getDayofgrowth() {
        return dayofgrowth;
    }

    public void setDayofgrowth(Double dayofgrowth) {
        this.dayofgrowth = dayofgrowth;
    }

    public Double getLastweek() {
        return lastweek;
    }

    public void setLastweek(Double lastweek) {
        this.lastweek = lastweek;
    }

    public Double getLastmonth() {
        return lastmonth;
    }

    public void setLastmonth(Double lastmonth) {
        this.lastmonth = lastmonth;
    }

    public Double getLastquarter() {
        return lastquarter;
    }

    public void setLastquarter(Double lastquarter) {
        this.lastquarter = lastquarter;
    }

    public Double getLasthalfyear() {
        return lasthalfyear;
    }

    public void setLasthalfyear(Double lasthalfyear) {
        this.lasthalfyear = lasthalfyear;
    }

    public Double getLastyear() {
        return lastyear;
    }

    public void setLastyear(Double lastyear) {
        this.lastyear = lastyear;
    }

    public String getFundmanagers() {
        return fundmanagers;
    }

    public void setFundmanagers(String fundmanagers) {
        this.fundmanagers = fundmanagers == null ? null : fundmanagers.trim();
    }

    public Double getManagerate() {
        return managerate;
    }

    public void setManagerate(Double managerate) {
        this.managerate = managerate;
    }

    public Double getTrusteerate() {
        return trusteerate;
    }

    public void setTrusteerate(Double trusteerate) {
        this.trusteerate = trusteerate;
    }

    public Double getServicerate() {
        return servicerate;
    }

    public void setServicerate(Double servicerate) {
        this.servicerate = servicerate;
    }

    public Double getPurchaserate() {
        return purchaserate;
    }

    public void setPurchaserate(Double purchaserate) {
        this.purchaserate = purchaserate;
    }

    public Double getMinamount() {
        return minamount;
    }

    public void setMinamount(Double minamount) {
        this.minamount = minamount;
    }

    public Double getRedeemrate() {
        return redeemrate;
    }

    public void setRedeemrate(Double redeemrate) {
        this.redeemrate = redeemrate;
    }

    public String getFundstatus() {
        return fundstatus;
    }

    public void setFundstatus(String fundstatus) {
        this.fundstatus = fundstatus == null ? null : fundstatus.trim();
    }

    public String getAsktype() {
        return asktype;
    }

    public void setAsktype(String asktype) {
        this.asktype = asktype == null ? null : asktype.trim();
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public Date getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(Date operatordate) {
        this.operatordate = operatordate;
    }
}
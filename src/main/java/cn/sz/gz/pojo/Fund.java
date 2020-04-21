package cn.sz.gz.pojo;

import java.util.Date;

public class Fund {
    private Integer fundid;//基金总表ID

    private Integer fundcode;//基金代码(6位数)

    private String fundname;//基金名称

    private String fundcompanyname;//基金公司

    private Date setupdate;//基金成立日期

    private String fundtype;//基金类型，如混合（BLEND）

    private String investstrategy;//投资策略

    private String risklevel;//风险等级

    private String salestatus;//销售状态（开放、暂停）

    private Double netvalue;//单位净值

    private Double accumulatedNet;//累计净值

    private Date netvaluedate;//净值日期

    private Double dayofgrowth;//日增长

    private Double lastweek;//近一周

    private Double lastmonth;//近一个月

    private Double lastquarter;//近三个月

    private Double lasthalfyear;//近半年

    private Double lastyear;//近一年

    private String fundmanagers;//基金经理

    private Double managerate;//管理费率（管理人）

    private Double trusteerate;//托管费（托管银行）

    private Double servicerate;//服务费

    private Double purchaserate;//申购费

    private Double minamount;//起购最低金额

    private Double redeemrate;//赎回费

    private String fundstatus;//基金状态，如已（申请）上架，已（申请）下架

    private String asktype;//申请类型，上架、下架，便于查询

    private String operatorname;//操作者，此基金操作的平台管理员名称

    private Date operatordate;//操作时间

    public Integer getFundid() {
        return fundid;
    }

    public void setFundid(Integer fundid) {
        this.fundid = fundid;
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
        this.fundname = fundname ;
    }

    public String getFundcompanyname() {
        return fundcompanyname;
    }

    public void setFundcompanyname(String fundcompanyname) {
        this.fundcompanyname = fundcompanyname ;
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
        this.fundtype = fundtype ;
    }

    public String getInveststrategy() {
        return investstrategy;
    }

    public void setInveststrategy(String investstrategy) {
        this.investstrategy = investstrategy ;
    }

    public String getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(String risklevel) {
        this.risklevel = risklevel ;
    }

    public String getSalestatus() {
        return salestatus;
    }

    public void setSalestatus(String salestatus) {
        this.salestatus = salestatus ;
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
        this.fundmanagers = fundmanagers;
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
        this.fundstatus = fundstatus;
    }

    public String getAsktype() {
        return asktype;
    }

    public void setAsktype(String asktype) {
        this.asktype = asktype;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname ;
    }

    public Date getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(Date operatordate) {
        this.operatordate = operatordate;
    }
}
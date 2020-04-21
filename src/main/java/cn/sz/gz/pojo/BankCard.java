package cn.sz.gz.pojo;

public class BankCard {
    private Integer bankcardid;//银行卡表ID
    
    private Integer bankcardnumber;//银行卡号
    
    private String bankcardtype;//银行卡类型
    
    private Integer userid;//用户id
    public Integer getBankcardid() {
        return bankcardid;
    }

    public void setBankcardid(Integer bankcardid) {
        this.bankcardid = bankcardid;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
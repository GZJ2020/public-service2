package cn.sz.gz.pojo;

public class BankCard {
    private Long bankcardid;

    private Long bankcardnumber;

    private String bankcardtype;

    private Long userid;

    public Long getBankcardid() {
        return bankcardid;
    }

    public void setBankcardid(Long bankcardid) {
        this.bankcardid = bankcardid;
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

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }
}
package cn.sz.gz.pojo;

public class UmsRalation {
    private Long ralationid;

    private String umsid;

    private Long roleid;

    public Long getRalationid() {
        return ralationid;
    }

    public void setRalationid(Long ralationid) {
        this.ralationid = ralationid;
    }

    public String getUmsid() {
        return umsid;
    }

    public void setUmsid(String umsid) {
        this.umsid = umsid == null ? null : umsid.trim();
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}
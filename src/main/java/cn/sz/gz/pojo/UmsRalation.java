package cn.sz.gz.pojo;

public class UmsRalation {
	//用户、管理员角色关系，后台用户和角色关系，多对多关系，一个角色可以分配给多个用户。
    private Integer ralationid;//主键

    private String umsid;//用户或者管理员ID

    private Integer roleid;//角色ID

    public Integer getRalationid() {
        return ralationid;
    }

    public void setRalationid(Integer ralationid) {
        this.ralationid = ralationid;
    }

    public String getUmsid() {
        return umsid;
    }

    public void setUmsid(String umsid) {
        this.umsid = umsid ;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}
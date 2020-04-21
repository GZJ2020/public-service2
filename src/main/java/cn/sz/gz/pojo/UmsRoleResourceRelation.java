package cn.sz.gz.pojo;

//角色表和资源关系表
public class UmsRoleResourceRelation {
    private Integer id;//主键

    private Integer roleid;//超级用户ID

    private Integer umsresourcesid;//资源

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUmsresourcesid() {
        return umsresourcesid;
    }

    public void setUmsresourcesid(Integer umsresourcesid) {
        this.umsresourcesid = umsresourcesid;
    }
}
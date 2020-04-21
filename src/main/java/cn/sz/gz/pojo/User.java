package cn.sz.gz.pojo;

import java.util.Date;

//用户表
public class User {
    private Integer userid;//用户ID，主键

    private String userpassword;//用户密码

    private String username;//用户名称

    private Integer userphone;//用户电话

    private String useridcard;//用户身份证号码

    private String userregisterpassword;//用户基金交易密码

    private Date createTime;//创建时间

    private Date loginTime;//最后登录时间

    private Integer status;//帐号启用状态：0->禁用；1->启用

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserphone() {
        return userphone;
    }

    public void setUserphone(Integer userphone) {
        this.userphone = userphone;
    }

    public String getUseridcard() {
        return useridcard;
    }

    public void setUseridcard(String useridcard) {
        this.useridcard = useridcard;
    }

    public String getUserregisterpassword() {
        return userregisterpassword;
    }

    public void setUserregisterpassword(String userregisterpassword) {
        this.userregisterpassword = userregisterpassword;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
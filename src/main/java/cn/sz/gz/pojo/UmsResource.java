package cn.sz.gz.pojo;

public class UmsResource {
	//资源，用于控制后台用户可以访问的接口，使用Ant路径的匹配规则，可以使用通配符定义一系列接口的权限。
    private Integer umsresourceid;//资源ID

    private String name;//资源名字

    private String url;//资源url

    private String description;//描述

    public Integer getUmsresourceid() {
        return umsresourceid;
    }

    public void setUmsresourceid(Integer umsresourceid) {
        this.umsresourceid = umsresourceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
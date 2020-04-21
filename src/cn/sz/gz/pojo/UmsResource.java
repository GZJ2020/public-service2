package cn.sz.gz.pojo;

public class UmsResource {
    private Long umsresourceid;

    private String name;

    private String url;

    private String description;

    public Long getUmsresourceid() {
        return umsresourceid;
    }

    public void setUmsresourceid(Long umsresourceid) {
        this.umsresourceid = umsresourceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
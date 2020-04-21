package cn.sz.gz.pojo;

public class ShoppingCart {
	//用户购物车,根据基金代码code从基金总表中查询所需要的数据来显示
    private Integer cartid;//购物车ID

    private Integer fundcode;//基金代码，用户查询基金信息

    private Integer userid;//用户ID

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getFundcode() {
        return fundcode;
    }

    public void setFundcode(Integer fundcode) {
        this.fundcode = fundcode;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
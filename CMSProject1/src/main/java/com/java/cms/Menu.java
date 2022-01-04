package com.java.cms;

public class Menu {
	private int menuid;
	private int restaurantid;
	private String itemname;
	private String menutype;
	private String menuprice;
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(int restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getMenutype() {
		return menutype;
	}
	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}
	public String getPrice() {
		return menuprice;
	}
	public void setPrice(String i) {
		this.menuprice = i;
	}
	@Override
	public String toString() {
		return "MenuDAO [menuid=" + menuid + ", restaurantid=" + restaurantid + ", itemname=" + itemname + ", menutype="
				+ menutype + ", menuprice=" + menuprice + "]";
	}
	
	

}

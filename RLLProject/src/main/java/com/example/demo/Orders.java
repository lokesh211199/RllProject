package com.example.demo;

import java.util.Date;

public class Orders {
	private int orderId;
	private int vendorId;
	private int customerid;
	private int menuid;
	private int walletId;
	private Date orderDate;
	private int quantityOrdered;
	private String orderStatus;
	private int billAmount;
	private String orderComments;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	public String getOrderComments() {
		return orderComments;
	}
	public void setOrderComments(String orderComments) {
		this.orderComments = orderComments;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", vendorId=" + vendorId + ", customerid=" + customerid + ", menuid=" + menuid + ", walletId="
				+ walletId + ", orderDate=" + orderDate + ", quantityOrdered=" + quantityOrdered + ", orderStatus="
				+ orderStatus + ", billAmount=" + billAmount + ", orderComments=" + orderComments + "]";
	}

	
	
	
	
}

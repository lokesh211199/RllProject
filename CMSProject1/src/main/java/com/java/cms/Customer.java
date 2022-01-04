package com.java.cms;

public class Customer {
	private int customerid;
	private String firstname;
	private String lastname;
	private String Gender;
	private String Dob;
	private String Maritalstatus;
	private String Address1;
	private String Address2;
	private String customerstate;
	private String customercity;
	private String Zipcode;
	private String Country;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getMaritalstatus() {
		return Maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		Maritalstatus = maritalstatus;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCustomerstate() {
		return customerstate;
	}
	public void setCustomerstate(String customerstate) {
		this.customerstate = customerstate;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}


@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", Gender=" + Gender + ", Dob=" + Dob + ", Maritalstatus=" + Maritalstatus + ", Address1=" + Address1
			+ ", Address2=" + Address2 + ", customerstate=" + customerstate + ", customercity=" + customercity
			+ ", Zipcode=" + Zipcode + ", Country=" + Country + "]";
}
}

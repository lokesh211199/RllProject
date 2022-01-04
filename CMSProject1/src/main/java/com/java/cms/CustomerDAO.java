package com.java.cms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	Connection connection;
	PreparedStatement pst;
	
	public List <Customer> showCustomer() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from customer";
		pst = connection.prepareStatement(cmd);
    	ResultSet rs = pst.executeQuery();
    	List<Customer> customerList = new ArrayList<Customer>();
    	Customer customer = null;
    	while(rs.next()) {	
    		customer=new Customer();
    		customer.setCustomerid(rs.getInt("customerid"));
    		customer.setFirstname(rs.getString("firstname"));
    		customer.setLastname(rs.getString("lastname"));
    		customer.setGender(rs.getString("Gender"));
    		customer.setDob(rs.getString("dob"));
    		customer.setMaritalstatus(rs.getString("maritalstatus"));
    		customer.setAddress1(rs.getString("address1"));
    		customer.setAddress2(rs.getString("address2"));
    		customer.setCustomercity(rs.getString("customercity"));
    		customer.setCustomerstate(rs.getString("customerstate"));
    		customer.setZipcode(rs.getString("zipcode"));
    		customer.setCountry(rs.getString("country"));	
    		customerList.add(customer);
    	}
    	return customerList;
	}
	public Customer searchCustomer (int customerid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from customer where customerid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, customerid);
			Customer customer=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
	    		customer=new Customer();
	    		customer.setCustomerid(rs.getInt("customerid"));
	    		customer.setFirstname(rs.getString("firstname"));
	    		customer.setLastname(rs.getString("lastname"));
	    		customer.setGender(rs.getString("Gender"));
	    		customer.setDob(rs.getString("dob"));
	    		customer.setMaritalstatus(rs.getString("maritalstatus"));
	    		customer.setAddress1(rs.getString("address1"));
	    		customer.setAddress2(rs.getString("address2"));
	    		customer.setCustomercity(rs.getString("customercity"));
	    		customer.setCustomerstate(rs.getString("customerstate"));
	    		customer.setZipcode(rs.getString("zipcode"));
	    		customer.setCountry(rs.getString("country"));
			}
		 return customer;
		 
	}

}

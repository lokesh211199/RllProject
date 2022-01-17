package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class OrdersDAO {
	@Autowired
    JdbcTemplate jdbcTemplate;
	
    public Orders[] showCOrders(int customerid) {
	String cmd = "select * from Orders where customerid=? ";	
	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {customerid}, new RowMapper() {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Orders orders = new Orders();
			orders = new Orders();
			orders.setOrderId(rs.getInt("orderid"));
			orders.setMenuid(rs.getInt("menuid"));
			orders.setVendorId(rs.getInt("vendorid"));
			orders.setCustomerid(rs.getInt("customerid"));
			orders.setWalletId(rs.getInt("walletid"));
			orders.setBillAmount(rs.getInt("billamount"));
			orders.setOrderComments(rs.getString("comments"));
			orders.setOrderDate(rs.getDate("orderdate"));
			orders.setOrderStatus(rs.getString("orderstatus"));
			orders.setQuantityOrdered(rs.getInt("quantityordered"));
			return orders;
		}
	});
	return ordersList.toArray(new Orders[ordersList.size()]);
}
    public Orders[] showCPOrders(int customerid) {
    	String cmd = "select * from Orders where customerid=? and orderstatus='PENDING'";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {customerid}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    		
    			Orders orders = new Orders();
    			orders = new Orders();
    			orders.setOrderId(rs.getInt("orderId"));
    			orders.setMenuid(rs.getInt("menuid"));
    			orders.setVendorId(rs.getInt("vendorId"));
    			orders.setCustomerid(rs.getInt("customerid"));
    			orders.setWalletId(rs.getInt("walletId"));
    			orders.setBillAmount(rs.getInt("billamount"));
    			orders.setOrderComments(rs.getString("comments"));
    			orders.setOrderDate(rs.getDate("orderdate"));
    			orders.setOrderStatus(rs.getString("orderstatus"));
    			orders.setQuantityOrdered(rs.getInt("quantityordered"));
    			return orders;
    		}
    	});
    	return ordersList.toArray(new Orders[ordersList.size()]);
    }
    public Orders[] showVPOrders(int vendorId) {
    	String cmd = "select * from Orders where customerid=? and orderstatus='PENDING'";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {vendorId}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    			
    			Orders orders = new Orders();
    			orders = new Orders();
    			orders.setOrderId(rs.getInt("orderId"));
    			orders.setMenuid(rs.getInt("menuid"));
    			orders.setVendorId(rs.getInt("vendorId"));
    			orders.setCustomerid(rs.getInt("customerid"));
    			orders.setWalletId(rs.getInt("walletId"));
    			orders.setBillAmount(rs.getInt("billamount"));
    			orders.setOrderComments(rs.getString("comments"));
    			orders.setOrderDate(rs.getDate("orderdate"));
    			orders.setOrderStatus(rs.getString("orderstatus"));
    			orders.setQuantityOrdered(rs.getInt("quantityordered"));
    			return orders;
    		}
    	});return ordersList.toArray(new Orders[ordersList.size()]);
    }
    public Orders[] showVOrders(int vendorId) {
    	String cmd = "select * from Orders where customerid=? ";	
    	List<Orders> ordersList=jdbcTemplate.query(cmd, new Object[] {vendorId}, new RowMapper() {

    		@Override
    		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
    			
    			Orders orders = new Orders();
    			orders = new Orders();
    			orders.setOrderId(rs.getInt("orderId"));
    			orders.setMenuid(rs.getInt("menuid"));
    			orders.setVendorId(rs.getInt("vendorId"));
    			orders.setCustomerid(rs.getInt("customerid"));
    			orders.setWalletId(rs.getInt("walletId"));
    			orders.setBillAmount(rs.getInt("billamount"));
    			orders.setOrderComments(rs.getString("comments"));
    			orders.setOrderDate(rs.getDate("orderdate"));
    			orders.setOrderStatus(rs.getString("orderstatus"));
    			orders.setQuantityOrdered(rs.getInt("quantityordered"));
    			return orders;
    		}
    	});return ordersList.toArray(new Orders[ordersList.size()]);
    }
}

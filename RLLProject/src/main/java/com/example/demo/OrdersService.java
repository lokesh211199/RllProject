package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrdersService {

	@Autowired
	OrdersDAO dao;
	
	public Orders[] showCOrders(int customerid) {
		return dao.showCOrders(customerid);
	}
	public Orders[] showCPOrders(int customerid) {
		return dao.showCPOrders(customerid);
	}
	public Orders[] showVOrders(int vendorid){
		return dao.showVOrders(vendorid);
	}
	public Orders[] showVPOrders(int vendorid) {
		return dao.showVPOrders(vendorid);
		
	}

}

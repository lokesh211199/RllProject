package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping("/co/{customerid}")
	public Orders[] showCOrders(@PathVariable int customerid) {
		return ordersService.showCOrders(customerid);
	}
	@RequestMapping("/showCPOrders/{customerid}")
	public Orders[] showCPOrders(@PathVariable int customerid) {
		return ordersService.showCPOrders(customerid);
	}
	@RequestMapping("/showVOrders/{vendorid}")
	public Orders[] showVOrders(@PathVariable int vendorid) {
		return ordersService.showVOrders(vendorid);
	}
	@RequestMapping("/showVPOrders/{vendorid}")
	public Orders[] showVPOrders(@PathVariable int vendorid) {
		return ordersService.showVPOrders(vendorid);
	}
	
	
}

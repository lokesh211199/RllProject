package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@RequestMapping("/showMenu")
	public Menu[] showMenu() {
		return service.showMenu();
	}
	
	@RequestMapping("/searchMenu/{restaurantid}")
	public Menu searchMenu(@PathVariable int restaurantid) {
		return service.searchMenu(restaurantid);
	}
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuService {
	@Autowired
	MenuDAO dao;
	
	public Menu[] showMenu() {
		return dao.showMenu();
	}
	public Menu searchMenu(int menuID) {
		return dao.searchMenu(menuID);
	}
}

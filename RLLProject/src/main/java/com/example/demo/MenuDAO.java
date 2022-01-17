package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDAO {

	@Autowired
    JdbcTemplate jdbcTemplate;

	public Menu searchMenu(int menuid) {
		String cmd = "select * from Menu where menuid=?";
		List<Menu> menuList = jdbcTemplate.query(cmd, new Object[] {menuid}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu= new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setRestaurantId(rs.getInt("restaurantId"));
				menu.setItemName(rs.getString("itemName"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setCalories(rs.getInt("calories"));
				menu.setPrice(rs.getInt("price"));
				return menu;
			}
		});
		if (menuList.size()==1) {
			return menuList.get(0);
		}
		return null;
	}

	public Menu[] showMenu() {
		String cmd = "select * from Menu";
		List<Menu> MenuList = null;
		MenuList = jdbcTemplate.query(cmd, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Menu menu= new Menu();
				menu.setMenuId(rs.getInt("menuId"));
				menu.setRestaurantId(rs.getInt("restaurantId"));
				menu.setItemName(rs.getString("itemName"));
				menu.setMenutype(rs.getString("menutype"));
				menu.setCalories(rs.getInt("calories"));
				menu.setPrice(rs.getInt("price"));
				return menu;			}
		});
		return MenuList.toArray(new Menu[MenuList.size()]);
	}
}

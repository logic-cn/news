package com.news.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.Category;

public class CategoryDao {

	public int updateCategory(Category category) {
		try {
			Connection connection = C3p0Utils.getConnection();
			String sql = "Update category set name ='" + category.getName() + "' where id=" + category.getId();
			Statement statement = connection.createStatement();
			int update = statement.executeUpdate(sql);
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public Category selectCategoryById(int id){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from category where id = " + id;
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				Category category = new Category();
				int category_id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int state = resultSet.getInt("state");
				Date create_date = resultSet.getDate("create_date");
				Date update_date = resultSet.getDate("update_date");
				category.setId(category_id);
				category.setName(name);
				category.setState(state);
				category.setCreate_date(create_date);
				category.setUpdate_date(update_date);
				return category;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public int deleteCategory(int id){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "delete from category where id = " +id;
			int update = statement.executeUpdate(sql);
			return update;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return id;
		
	}

}

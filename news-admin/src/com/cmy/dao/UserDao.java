package com.cmy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.User;

public class UserDao {

	public void insertUser(User user){
		try {
			Connection connection = C3p0Utils.getConnection();
			String sql = "insert into user(user_name,password,email,state,create_date) values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setInt(4, user.getState());
			statement.setDate(5, user.getCreate_date());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

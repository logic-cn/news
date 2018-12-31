package com.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.User;

public class UserDao {

	public int insertUser(User user){
		try {
			Connection connection = C3p0Utils.getConnection();
			String sql = "insert into user(user_name,password,email,state,create_date) values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setInt(4, user.getState());
			statement.setDate(5, user.getCreate_date());
			int update = statement.executeUpdate();
			return update;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int updateUser(User user){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "update user set user_name='" + user.getName() + "',password='" + user.getPassword() + "',email='" + user.getEmail() + "' where user_id=" + user.getId();
			int update = statement.executeUpdate(sql);
			return update;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	public int deleteUser(int user_id){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "delete from user where user_id=" + user_id;
			int update = statement.executeUpdate(sql);
			return update;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public User selectUserByUser(User user){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from user where user_name = '" + user.getName() + "' and password = '" + user.getPassword() + "'";
			ResultSet executeQuery = statement.executeQuery(sql);
			if (executeQuery.next()) {
				User user2 = new User();
				String user_name = executeQuery.getString("user_name");
				user2.setName(user_name);
				return user2;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}

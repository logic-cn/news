package com.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.AdminUser;

public class AdminDao {

	public int insertAdmin(AdminUser adminUser){
		try {
			Connection connection = C3p0Utils.getConnection();
			String sql = "insert into admin(username,password,state) values(?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, adminUser.getUsername());
			prepareStatement.setString(2, adminUser.getPassword());
			prepareStatement.setInt(3, adminUser.getState());
			int update = prepareStatement.executeUpdate();
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int deleteAdmin(int admin_id){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "delete from admin where id = " + admin_id;
			int update = statement.executeUpdate(sql );
			return update;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public AdminUser selectAdminById(int admin_id){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from admin where id =" + admin_id;
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				AdminUser adminUser = new AdminUser();
				int id = resultSet.getInt("id");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				int state = resultSet.getInt("state");
				adminUser.setId(id);
				adminUser.setUsername(username);
				adminUser.setPassword(password);
				adminUser.setState(state);
				return adminUser;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public int updateAdmin(AdminUser adminUser){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "update admin set username='" + adminUser.getUsername() + "',password='" + adminUser.getPassword() + "' where id = " + adminUser.getId();
			int update = statement.executeUpdate(sql);
			return update;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}

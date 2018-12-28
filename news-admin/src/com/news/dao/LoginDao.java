package com.news.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.AdminUser;

public class LoginDao {

	public int loginDao(AdminUser adminUser){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select admin.username,admin.password from admin where username='" + adminUser.getUsername() + "' and password='" + adminUser.getPassword()+"'";
			ResultSet executeQuery = statement.executeQuery(sql);
			if (executeQuery.next()) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}

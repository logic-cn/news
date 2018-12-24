package com.news.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	static DataSource ds = null;
	static{
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("mysql");
		ds = comboPooledDataSource;
	}
	public static Connection getConnection(){
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

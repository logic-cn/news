package com.news.dao.impl;

import java.sql.Connection;

import com.news.dbutils.C3p0Utils;

public class Test {

	public void getconn(){
		Connection connection = C3p0Utils.getConnection();
	}
}

package com.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.News;

public class NewsDao {
	public int insertNews(News news){
		try{
			Connection connection = C3p0Utils.getConnection();
			String sql="insert into news(category_id,title,content,state,create_date,update_date)values(?,?,?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setInt(1, news.getCategory_id());
			statement.setString(2, news.getTitle());
			statement.setString(3, news.getContent());
			statement.setInt(4, news.getState());
			statement.setDate(5, news.getCreate_date());
			statement.setDate(6, news.getUpdate_date());
			int update =statement.executeUpdate();
			return update;
		}catch(Exception e){
			e.printStackTrace();
				
		}
		return 0;
		
		
		
		
	}

}

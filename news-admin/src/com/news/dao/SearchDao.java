package com.news.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.News;

public class SearchDao {

	public  ArrayList<News> SearchNewsByContent(String content){
		Connection connection = C3p0Utils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "select * from news where content like '%" + content + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<News> list = new ArrayList<>();
			while(resultSet.next()){
				News news = new News();
				int id = resultSet.getInt("id");
				int category_id = resultSet.getInt("category_id");
				String title = resultSet.getString("title");
				String news_content = resultSet.getString("content");
				int state = resultSet.getInt("state");
				Date create_date = resultSet.getDate("create_date");
				Date update_date = resultSet.getDate("update_date");
				news.setId(id);
				news.setCategory_id(category_id);
				news.setTitle(title);
				news.setContent(news_content);
				news.setState(state);
				news.setCreate_date(create_date);
				news.setUpdate_date(update_date);
				list.add(news);
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public ArrayList<News> SearchNewsByTitle(String search_title) {
		Connection connection = C3p0Utils.getConnection();
		try{
			Statement statement = connection.createStatement();
			String sql = "select * from news where title like '%" +search_title + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<News> list = new ArrayList<>();
			while(resultSet.next()){
				News news = new News();
				int id = resultSet.getInt("id");
				int category_id = resultSet.getInt("category_id");
				String title = resultSet.getString("title");
				String news_content = resultSet.getString("content");
				int state = resultSet.getInt("state");
				Date create_date = resultSet.getDate("create_date");
				Date update_date = resultSet.getDate("update_date");
				news.setId(id);
				news.setCategory_id(category_id);
				news.setTitle(title);
				news.setContent(news_content);
				news.setState(state);
				news.setCreate_date(create_date);
				news.setUpdate_date(update_date);
				list.add(news);
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
	    }
		return null;
	  }
	public ArrayList<News> SearchNewsByCategoryId(int categoryId){
		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from news where category_id = " + categoryId;
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<News> list = new ArrayList<>();
			while(resultSet.next()){
				News news = new News();
				int id = resultSet.getInt("id");
				int category_id = resultSet.getInt("category_id");
				String title = resultSet.getString("title");
				String news_content = resultSet.getString("content");
				int state = resultSet.getInt("state");
				Date create_date = resultSet.getDate("create_date");
				Date update_date = resultSet.getDate("update_date");
				news.setId(id);
				news.setCategory_id(category_id);
				news.setTitle(title);
				news.setContent(news_content);
				news.setState(state);
				news.setCreate_date(create_date);
				news.setUpdate_date(update_date);
				list.add(news);
				return list;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	
}

package com.news.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.News;

public class UpdateNewsDao {
	public int updateNews(News news){
		
		try {
			Connection connection = C3p0Utils.getConnection();
			String sql="update news set category_id='"+news.getCategory_id()+"',title='"+news.getTitle()+"',content='"+news.getContent()+"' where id="+news.getId();
			PreparedStatement Statement = connection.prepareStatement(sql);
			
			int update =Statement.executeUpdate();
			return update;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
		
	}

}

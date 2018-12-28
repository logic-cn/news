package com.news.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.News;

/**
 * Servlet implementation class UpdateNewsServlet
 */
@WebServlet("/UpdateNewsServlet")
public class UpdateNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String id = request.getParameter("id");
		java.sql.Connection connection = C3p0Utils.getConnection();
		try {
			Statement createStatement = connection.createStatement();
			String sql="select * from news where id = " + id;
			ResultSet resultSet = createStatement.executeQuery(sql);
			//ArrayList<News> list = new ArrayList<>();
			News news = new News();
			while(resultSet.next()){
				int int1 = resultSet.getInt("id");
				int category_id = resultSet.getInt("category_id");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				Date create_date = resultSet.getDate("create_date");
				
				news.setId(int1);
				news.setCategory_id(category_id);
				news.setTitle(title);
				news.setContent(content);
				news.setCreate_date(create_date);
				
			    //list.add(news);
			}
			HttpSession session = request.getSession();
			session.setAttribute("Updatenews",news);
			response.sendRedirect("news-admin/updatenews.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

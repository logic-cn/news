package com.news.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.convertor.StringToSqlDate;
import com.news.dbutils.C3p0Utils;
import com.news.pojo.Category;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		String categeor_name = request.getParameter("news-classify");
		String ceeate_date = request.getParameter("news-time");
		StringToSqlDate stringToSqlDate = new StringToSqlDate();
		Date date = stringToSqlDate.getStringToSqlDate(ceeate_date);
		
		Category category = new Category();
		category.setName(categeor_name);
		category.setState(1);
		category.setCreate_date(date);
		category.setUpdate_date(date);
		
		C3p0Utils c3p0Utils = new C3p0Utils();
		Connection connection = C3p0Utils.getConnection();
		String sql = "insert into category(name,state,create_date,update_date) values(?,?,?,?)";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql );
			prepareStatement.setString(1, category.getName());
			prepareStatement.setInt(2, category.getState());
			prepareStatement.setDate(3, category.getCreate_date());
			prepareStatement.setDate(4, category.getUpdate_date());
			int update = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.news.servlet;

import java.io.IOException;
import java.sql.Connection;
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
import com.news.pojo.User;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		Connection connection = C3p0Utils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "select * from user where user_id = " + userid;
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()){
				User user = new User();
				int user_id = resultSet.getInt("user_id");
				String user_name = resultSet.getString("user_name");
				String password = resultSet.getString("password");
				String email = resultSet.getString("email");
				int state = resultSet.getInt("state");
				user.setId(user_id);
				user.setName(user_name);
				user.setPassword(password);
				user.setEmail(email);
				user.setState(state);
				HttpSession session = request.getSession();
				session.setAttribute("update_user", user);
				response.sendRedirect("news-admin/updateuser.jsp");
			}
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

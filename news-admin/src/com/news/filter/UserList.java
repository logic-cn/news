package com.news.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.news.dbutils.C3p0Utils;
import com.news.pojo.User;

/**
 * Servlet Filter implementation class UserList
 */
@WebFilter(filterName="/UserList", urlPatterns={"/news-admin/usertable.jsp", "/news-admin/deleteusertable.jsp"})
public class UserList implements Filter {

    /**
     * Default constructor. 
     */
    public UserList() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		Connection connection = C3p0Utils.getConnection();
		try {
			Statement statement = connection.createStatement();
			String sql = "select `user`.user_id,`user`.user_name,`user`.email,`user`.state,`user`.create_date FROM `user`";
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<User> list = new ArrayList<>();
			while(resultSet.next()){
				User user = new User();
				int user_id = resultSet.getInt("user_id");
				String user_name = resultSet.getString("user_name");
				String email = resultSet.getString("email");
				int state = resultSet.getInt("state");
				Date create_date = resultSet.getDate("create_date");
				user.setId(user_id);
				user.setName(user_name);
				user.setEmail(email);
				user.setState(state);
				user.setCreate_date(create_date);
				list.add(user);
			}
			HttpServletRequest request2 = (HttpServletRequest) request;
			HttpSession session = request2.getSession();
			session.setAttribute("users", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

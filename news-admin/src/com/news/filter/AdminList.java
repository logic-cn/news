package com.news.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
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
import com.news.pojo.AdminUser;

/**
 * Servlet Filter implementation class AdminList
 */
@WebFilter(filterName="/AdminList", urlPatterns={"/news-admin/admintable.jsp", "/news-admin/deleteadmintable.jsp"})
public class AdminList implements Filter {

    /**
     * Default constructor. 
     */
    public AdminList() {
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

		try {
			Connection connection = C3p0Utils.getConnection();
			Statement statement = connection.createStatement();
			String sql = "select * from admin";
			ResultSet resultSet = statement.executeQuery(sql);
			ArrayList<AdminUser> list = new ArrayList<>();
			while(resultSet.next()){
				AdminUser adminUser = new AdminUser();
				int admin_id = resultSet.getInt("id");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				int state = resultSet.getInt("state");
				adminUser.setId(admin_id);
				adminUser.setUsername(username);
				adminUser.setPassword(password);
				adminUser.setState(state);
				list.add(adminUser);
			}
			HttpServletRequest request2 = (HttpServletRequest) request;
			HttpSession session = request2.getSession();
			session.setAttribute("admin_list", list);
			//HttpServletResponse response2 = (HttpServletResponse) response;
			//response2.sendRedirect("news-admin/admintable.jsp");
		} catch (Exception e) {
			// TODO: handle exception
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

package com.news.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import com.news.pojo.Category;

/**
 * Servlet Filter implementation class CategoryList
 */
@WebFilter(filterName="/CategoryList", urlPatterns={"/news-admin/categorytable.jsp", "/news-admin/deletecategorytable.jsp"})
public class CategoryList implements Filter {

    /**
     * Default constructor. 
     */
    public CategoryList() {
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
		C3p0Utils c3p0Utils = new C3p0Utils();
		Connection connection = C3p0Utils.getConnection();
		String sql = "select * from category";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(sql);
			ResultSet resultSet  = prepareStatement.executeQuery();
			ArrayList<Category> list = new ArrayList<>();
			while(resultSet.next()){
				Category category = new Category();
				int category_id = resultSet.getInt("id");
				String category_name=resultSet.getString("name");
				int category_state=resultSet.getInt("state");
				Date category_create_date=resultSet.getDate("create_date");
				Date category_update_date=resultSet.getDate("update_date");
				
				category.setId(category_id);
				category.setName(category_name);
				category.setState(category_state);
				category.setCreate_date(category_create_date);
				category.setUpdate_date(category_update_date);

				list.add(category);
			}
			HttpServletRequest request2 = (HttpServletRequest) request;
			HttpSession session = request2.getSession();
			session.setAttribute("cateGory_list", list);
			chain.doFilter(request, response);
			//HttpServletResponse response2 = (HttpServletResponse) response;
			//response2.sendRedirect("revise.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

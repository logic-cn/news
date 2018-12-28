package com.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.dao.CategoryDao;
import com.news.pojo.Category;

/**
 * Servlet implementation class ReviseServlet
 */
@WebServlet("/ReviseServlet")
public class ReviseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		int category_id=Integer.parseInt(id);
		Category category=new Category();
		category.setId(category_id);
		category.setName(name);
		CategoryDao categoryDao=new CategoryDao();
		int updateCategory = categoryDao.updateCategory(category);
		if (updateCategory != 0) {
			response.sendRedirect("news-admin/categorytable.jsp");
		}else {
			String msg = "error";
			HttpSession session = request.getSession();
			session.setAttribute("code", msg);
			response.sendRedirect("news-admin/msg.jsp");
		}
		
	}

}

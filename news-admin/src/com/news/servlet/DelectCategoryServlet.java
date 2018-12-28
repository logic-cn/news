package com.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.dao.CategoryDao;

/**
 * Servlet implementation class DelectCategoryServlet
 */
@WebServlet("/DelectCategoryServlet")
public class DelectCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelectCategoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String category_id = request.getParameter("category_id");
		int id = Integer.parseInt(category_id);
		CategoryDao categoryDao = new CategoryDao();
		int category = categoryDao.deleteCategory(id);
		if (category != 0) {
			response.sendRedirect("news-admin/deletecategorytable.jsp");
		}else {
			String msg = "error";
			HttpSession session = request.getSession();
			session.setAttribute("code", msg);
			response.sendRedirect("news-admin/msg.jsp");
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

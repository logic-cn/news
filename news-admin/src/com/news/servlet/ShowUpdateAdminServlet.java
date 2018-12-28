package com.news.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.dao.AdminDao;
import com.news.pojo.AdminUser;

/**
 * Servlet implementation class ShowUpdateAdminServlet
 */
@WebServlet("/ShowUpdateAdminServlet")
public class ShowUpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUpdateAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String admin_id = request.getParameter("adminid");
		int id = Integer.parseInt(admin_id);
		AdminDao adminDao = new AdminDao();
		AdminUser adminUser = adminDao.selectAdminById(id);
		HttpSession session = request.getSession();
		session.setAttribute("admin_list", adminUser);
		response.sendRedirect("news-admin/updateadmin.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

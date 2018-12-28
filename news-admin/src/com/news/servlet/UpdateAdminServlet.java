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
 * Servlet implementation class UpdateAdminServlet
 */
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAdminServlet() {
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
		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int admin_id = Integer.parseInt(id);
		AdminUser adminUser = new AdminUser();
		adminUser.setId(admin_id);
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		AdminDao adminDao = new AdminDao();
		int admin = adminDao.updateAdmin(adminUser);
		if (admin != 0) {
			response.sendRedirect("news-admin/admintable.jsp");
		}else {
			String msg = "error";
			HttpSession session = request.getSession();
			session.setAttribute("code", msg);
			response.sendRedirect("news-admin/msg.jsp");
		}
	}

}

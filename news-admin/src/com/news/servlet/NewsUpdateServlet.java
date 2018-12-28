package com.news.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.convertor.StringToInt;
import com.news.dao.UpdateNewsDao;
import com.news.pojo.News;

/**
 * Servlet implementation class NewsUpdateServlet
 */
@WebServlet("/NewsUpdateServlet")
public class NewsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String category = request.getParameter("category");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		StringToInt stringToInt = new StringToInt();
		int category_id = stringToInt.getStringToInt(category);
		int parseInt = Integer.parseInt(id);
		
		News news = new News();
		news.setId(parseInt);
		news.setCategory_id(category_id);
		news.setTitle(title);
		news.setContent(content);
		news.setState(1);
		
		java.util.Date date = new java.util.Date();
		news.setUpdate_date(new Date(date.getTime()));
		
		UpdateNewsDao updateNewsDao = new UpdateNewsDao();
		int updateNews = updateNewsDao.updateNews(news);
		if(updateNews!=0){
			String msg="success";
			HttpSession session = request.getSession();
			session.setAttribute("code",msg);
			response.sendRedirect("news-admin/msg.jsp");
			
		}else{
			
			String msg="error";
			HttpSession session = request.getSession();
			session.setAttribute("code",msg);
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

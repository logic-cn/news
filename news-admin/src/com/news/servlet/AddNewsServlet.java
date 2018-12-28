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
import com.news.convertor.StringToSqlDate;
import com.news.dao.NewsDao;
import com.news.pojo.News;

/**
 * Servlet implementation class AddNewsServlet
 */
@WebServlet("/AddNewsServlet")
public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewsServlet() {
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
		request.setCharacterEncoding("UTF-8");
		News news = new News();
		String Category = request.getParameter("category");
		String  title=request.getParameter("title");
		String content=request.getParameter("content");
		String date = request.getParameter("date");
		
		StringToInt stringToInt = new StringToInt();
		int category_id = stringToInt.getStringToInt(Category);
		StringToSqlDate stringToSqlDate = new StringToSqlDate();
		Date sqlDate = stringToSqlDate.getStringToSqlDate(date);
		
		news.setCategory_id(category_id);
		news.setTitle(title);
		news.setContent(content);
		news.setCreate_date(sqlDate);
		news.setUpdate_date(sqlDate);
		news.setState(1);
		
		NewsDao newsDao = new NewsDao();
		int insertNews = newsDao.insertNews(news);
		
		if(insertNews!=0){
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

}

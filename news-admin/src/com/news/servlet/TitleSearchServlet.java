package com.news.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.dao.SearchDao;
import com.news.pojo.News;

/**
 * Servlet implementation class ContentsearchServlet
 */
@WebServlet("/TitleSearchServlet")
public class TitleSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TitleSearchServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String categeor_name = request.getParameter("tn");
		String search_content = request.getParameter("word");
		SearchDao searchDao = new SearchDao();
		//全文搜索
		if (categeor_name.equals("news")) {
			ArrayList<News> news = searchDao.SearchNewsByContent(search_content);
			HttpSession session = request.getSession();
			session.setAttribute("SearchResult", news);
			response.sendRedirect("news-admin/searchresult.jsp");
			
		}else if (categeor_name.equals("newstitle")) {
			//标题搜索
			ArrayList<News> news = searchDao.SearchNewsByTitle(search_content);
			HttpSession session = request.getSession();
			session.setAttribute("SearchResult", news);
			response.sendRedirect("news-admin/searchresult.jsp");
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

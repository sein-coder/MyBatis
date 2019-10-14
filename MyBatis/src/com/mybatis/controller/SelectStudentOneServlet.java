package com.mybatis.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.service.MybatisService;
import com.mybatis.model.service.MybatisServiceImpl;
import com.mybatis.model.vo.Student;

/**
 * Servlet implementation class SelectStudentOneServlet
 */
@WebServlet("/selectOne")
public class SelectStudentOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MybatisService service = new MybatisServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectStudentOneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		
		int count = service.selectCount();
//		Student s = service.selectOne(no);
		
		
//		request.setAttribute("s", s);
		
		Map map = service.selectOneMap(no);
		System.out.println(map);
		request.setAttribute("count", count);
		request.setAttribute("s", map);
		request.getRequestDispatcher("/views/selectOne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

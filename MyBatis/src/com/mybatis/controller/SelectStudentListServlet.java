package com.mybatis.controller;

import java.io.IOException;
import java.util.List;
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
 * Servlet implementation class SelectStudentListServlet
 */
@WebServlet("/selectList")
public class SelectStudentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MybatisService service=new MybatisServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectStudentListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list=service.selectStudentList();
		
		List<Map> list2 = service.selectStudentList2();

		request.setAttribute("list", list);
		request.setAttribute("list2", list2);
		request.getRequestDispatcher("/views/studentList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.mybatis.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.service.MybatisService;
import com.mybatis.model.service.MybatisServiceImpl;
import com.mybatis.model.vo.Student;

/**
 * Servlet implementation class InputAllEndServlet
 */
@WebServlet("/inputAllEnd")
public class InputAllEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MybatisService service = new MybatisServiceImpl();
    //인터페이스를 구현할 객체에 인터페이스를 넣어준다.
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputAllEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("studentName");
		String tel = request.getParameter("studentTel");
		String email = request.getParameter("studentEmail");
		String addr = request.getParameter("studentAddr");
		
		Student s = new Student(0,name,tel,email,addr,null);
		
		int result = service.insertStudent(s);
		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().append(result>0?"입력성공":"입력실패");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

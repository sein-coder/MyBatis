package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;

public class MybatisDaoImpl implements MybatisDao {
	
	@Override
//	public List<Map> selectStudentSearch(SqlSession session, String name) {
	public List<Map> selectStudentSearch(SqlSession session, Map<String,String> param) {
		// TODO Auto-generated method stub
		return session.selectList("student.selectStudentSearch",param);
	}

	@Override
	public List<Map> selectStudentList2(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("student.selectStudentList2");
	}

	@Override
	public List<Student> selectStudentList(SqlSession session) {
		//다중행을 출력할때는 session객체의 selectList매소드를 이용!!
		return session.selectList("student.selectStudentList");
	}

	@Override
	public Map selectOneMap(SqlSession session, int no) {
		return session.selectOne("student.selectOneMap",no);
	}

	@Override
	public Student selectOne(SqlSession session, int no) {
		return session.selectOne("student.selectOne",no);
	}

	@Override
	public int insertStudentName(SqlSession session, String name) {
		return session.insert("student.insertStudentName",name);
		//매개변수로 object를 하나만 받기때문에 vo객체가 결국엔 필요하다.
	}

	@Override
	public int insertStudent(SqlSession session, Student s) {
		return session.insert("student.insertStudentAll",s);
	}

	@Override
	public int selectCount(SqlSession session) {
		return session.selectOne("student.selectCount");
	}
	
	
	
	
}

package com.mybatis.model.service;

import static common.SqlSessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.MybatisDao;
import com.mybatis.model.dao.MybatisDaoImpl;
import com.mybatis.model.vo.Student;

public class MybatisServiceImpl implements MybatisService {

	private MybatisDao dao = new MybatisDaoImpl();
	
	
	@Override
//	public List<Map> selectStudentSearch(String name) {
	public List<Map> selectStudentSearch(Map<String,String> param) {
		SqlSession session = getSession();
		List<Map> list = dao.selectStudentSearch(session,param);
		session.close();
		return list;
	}

	@Override
	public List<Map> selectStudentList2() {
		SqlSession session=getSession();
		List<Map> list=dao.selectStudentList2(session);
		session.close();
		return list;
	}

	@Override
	public List<Student> selectStudentList() {
		SqlSession session=getSession();
		List<Student> list=dao.selectStudentList(session);
		session.close();
		return list;
	}
	
	@Override
	public Map selectOneMap(int no) {
		SqlSession session = getSession();
		Map map = dao.selectOneMap(session,no);
		return map;
	}

	@Override
	public Student selectOne(int no) {
		SqlSession session = getSession();
		Student s = dao.selectOne(session,no);
		session.close();
		return s;
	}

	@Override
	public int selectCount() {
		SqlSession session = getSession();
		int result = dao.selectCount(session);
		session.close();
		return result;
	}

	@Override
	public int insertStudentName(String name) {
		SqlSession session = getSession();
		int result = dao.insertStudentName(session,name);
		
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}session.close();
		
		return result;
	}

	@Override
	public int insertStudent(Student s) {
		SqlSession session = getSession();
		int result = dao.insertStudent(session,s);
		
		if(result>0) {
			session.commit();
		}else {
			session.rollback();
		}session.close();
		
		return result;
	}
	
	

}

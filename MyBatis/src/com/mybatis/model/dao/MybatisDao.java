package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;

public interface MybatisDao {
	
	int insertStudentName(SqlSession session, String name);
	int insertStudent(SqlSession session, Student s);
	
	
	//select문
	int selectCount(SqlSession session);
	Student selectOne(SqlSession session, int no);
	Map selectOneMap(SqlSession session, int no);
	
	List<Student> selectStudentList(SqlSession session);
	
	List<Map> selectStudentList2(SqlSession session);
	
//	List<Map> selectStudentSearch(SqlSession session, String name);
	List<Map> selectStudentSearch(SqlSession session, Map<String,String> param);
	
}

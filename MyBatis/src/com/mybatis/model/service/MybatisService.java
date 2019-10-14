package com.mybatis.model.service;

import java.util.List;
import java.util.Map;

import com.mybatis.model.vo.Student;

public interface MybatisService {
	
	int insertStudentName(String name);
	int insertStudent(Student s);
	
	//select臾�
	int selectCount();
	Student selectOne(int no);
	Map selectOneMap(int no);
	
	List<Student> selectStudentList();
	List<Map> selectStudentList2();
	
//	List<Map> selectStudentSearch(String name);
	List<Map> selectStudentSearch(Map<String,String> param);
	
}


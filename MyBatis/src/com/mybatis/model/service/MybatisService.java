package com.mybatis.model.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.MybatisDao;

import common.SqlSessionTemplate;

public class MybatisService {
	
	private MybatisDao dao = new MybatisDao();
	
	public int insertStudent() {
		SqlSession session = SqlSessionTemplate.getSession();
		int result = dao.insertStudent(session);
		
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		
		return result;
	}
	
}

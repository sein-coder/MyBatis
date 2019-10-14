package com.mybatis.model.dao;

import org.apache.ibatis.session.SqlSession;

public class MybatisDao1 {

	public int insertStudent(SqlSession session) {
		int result = session.insert("student.insertStudent");
		//insert할때 필요한 파라미터값을 object형식으로 같이 보낼수 있다.
		//map이든 vo객체든, 주로 map(key:value)형식으로 보낸다
		return result;
	}

}

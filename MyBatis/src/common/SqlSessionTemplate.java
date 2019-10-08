package common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionTemplate {

	public static SqlSession getSession() {
		//1. mybatis-config.xml파일을 불러온다.
		String resource="/mybatis-config.xml";
		SqlSession session = null;
		
		try {
			
			//설정파일인 mybatis-config.xml파일을 불러옴.
			InputStream is = Resources.getResourceAsStream(resource);
			//session생성
			//1. SqlSessionFactoryBuilder 생성
			//2. builder에서 build메소드(불러온 config파일을 이용)를 통해서 SqlSessionFactory를 생성
			//3. SqlSessionFactory의 openSession메소드를 통해 SqlSession객체 생성
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			session = factory.openSession(false);//매개변수로 true, false가 가능하다, 트랜잭션처리옵션(false가 autocommit방지)
			
//			session = new SqlSessionFactoryBuilder().build(is).openSession(false); 한줄로 끝내는법
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return session;
	}
	
	
	
}

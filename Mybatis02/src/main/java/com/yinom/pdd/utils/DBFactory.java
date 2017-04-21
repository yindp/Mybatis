package com.yinom.pdd.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBFactory {

	public static SqlSessionFactory sqlSessionFactory  = null;
	
	static{
		try {
			//����SqlSessionFactory
			String resource = "src/main/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"mysql");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ȡSqlSession
	 * @return
	 */
	public static SqlSession getSession(){
		
		return sqlSessionFactory.openSession();
	}

}

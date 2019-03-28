package com.app.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	/**
	 * 获取SqlSessionFactory
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		String resource="conf.xml";	
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
			return sessionFactory;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * 获取SqlSession
	 */
	public static SqlSession getSqlSession() {
		return getSqlSessionFactory().openSession();
	}
	
	/**
	 * 获取SqlSession
	 * isAutoCommit
	 * 			true:表示创建的SqlSession对象在执行完sql后自动提交事务
 * 				false:表示创建的SqlSession对象在执行完Sql后不会自动提交事务，需要手动调用sqlSession.commit() 提交
	 */
	public static SqlSession getSqlSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}

package com.app.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.app.entity.User;
import com.app.util.MyBatisUtil;

public class Test {

	//@org.junit.Test
	public void test(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		User user=new User();
		user.setName("kaiser2");
		user.setAge(23);
		int sqlResult=sqlSession.insert("mapper.userMapper.addUser",user);
		sqlSession.close();
		System.out.println(sqlResult);
	}
	
//	@org.junit.Test
	public void testUpdate(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		User user=new User();
		user.setName("kaiserNB");
		user.setAge(25);
		user.setId(1);
		int sqlResult=sqlSession.update("mapper.userMapper.updateUser",user);
		sqlSession.close();
		System.out.println(sqlResult);
	}
	
//	@org.junit.Test
	public void testDelete(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		int sqlResult=sqlSession.delete("mapper.userMapper.deleteUser",6);
		sqlSession.close();
		System.out.println(sqlResult);
	}

//	@org.junit.Test
	public void testGetAll(){
		SqlSession sqlSession=MyBatisUtil.getSqlSession(true);
		List<User> list =sqlSession.selectList("mapper.userMapper.getAllUser");
		sqlSession.close();
		for(User u : list) {
			System.out.println(u.getName());
		}
		
	}
	

}

package com.app.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.app.entity.User;
import com.app.mapper.IUserMapper;
import com.app.util.MyBatisUtil;

public class AnnotationTest {

//	@Test
	public void testAdd() {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		//得到IUserMapper的实现类
		IUserMapper mapper=session.getMapper(IUserMapper.class);
		User user=new User();
		user.setName("sylar");
		user.setAge(16);
		int add=mapper.add(user);
		//关闭session
		session.close();
		System.out.println(add);
	}
	@Test
	public void testUpdate() {
		SqlSession session=MyBatisUtil.getSqlSession(true);
		//得到IUserMapper的实现类
		IUserMapper mapper=session.getMapper(IUserMapper.class);
		User user=new User();
		user.setName("sylar");
		user.setAge(13);
		user.setId(13);
		int add=mapper.update(user);
		//关闭session
		session.close();
		System.out.println(add);
	}


}

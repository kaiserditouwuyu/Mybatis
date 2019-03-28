package com.app.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.app.entity.Classes;
import com.app.util.MyBatisUtil;

public class OneByOneTest {

	@Test
	public void test() {
		SqlSession session=MyBatisUtil.getSqlSession();
		Classes cs=session.selectOne("com.classMapper.getClass",1);
		session.close();
		System.out.println(cs);
	}

}

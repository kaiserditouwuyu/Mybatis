package com.app.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.app.entity.Classes;
import com.app.util.MyBatisUtil;

public class OneByOneTest {

	@Test
	public void test() {
		SqlSession session1=MyBatisUtil.getSqlSession();
		SqlSession session2=MyBatisUtil.getSqlSession();
	
		long start1=System.currentTimeMillis();
		Classes cs=session1.selectOne("com.classMapper.getClass",1);
		long end1=System.currentTimeMillis();
		System.out.println(end1-start1);
		session1.commit();
		//session1.close();
		
		
//	    int result=session.delete("com.classMapper.deleteStudent",1);
		
		
		long start2=System.currentTimeMillis();
		Classes cs2=session2.selectOne("com.classMapper.getClass",1);
		long end2=System.currentTimeMillis();
		
		//session2.close();
		System.out.println(end2-start2);
	}

}

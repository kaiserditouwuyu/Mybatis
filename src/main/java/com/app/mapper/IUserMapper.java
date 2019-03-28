package com.app.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.app.entity.User;

/**
 * 定义sql映射接口，使用注解指明方法要执行的SQL
 * 我们不需要针对这个IUserMapper接口去编写具体的实现类，这个具体的实现类由Mybatis帮我们动态构建
 * @author YuLi_01
 *
 */
public interface IUserMapper {
	
	//使用@Insert注解指明add方法要执行的SqL
	@Insert("insert into users (name,age) values (#{name},#{age})")
	public int add(User user);
	
	
	@Delete("delete from users where id=#{id}")
	public int deleteById(int id);
	
	@Update("update users set name=#{name},age=#{age} where id=#{id}")
	public int update(User user);
	
	@Select("select * from users where id=#{id}")
	public User getById(int id);
	
	@Select("select * from users")
	public List<User> getAll();
	
	
}

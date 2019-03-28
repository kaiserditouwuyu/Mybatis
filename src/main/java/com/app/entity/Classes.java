package com.app.entity;

import java.util.List;

public class Classes {
	private int id;  //id==>c_id
	private String name; //name==>c_name
	
	private Teacher teacher;
	private Student[] students;
	
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	@Override
	public String toString() {
		return "Classes:[id="+id+",name="+name+",teacher="+teacher+",students="+students+"]";
	}
}
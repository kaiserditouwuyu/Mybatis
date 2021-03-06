package com.app.entity;

import java.io.Serializable;

public class Teacher implements Serializable{
	private int id; //id==>t_id
	private String name; //name==>t_name
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
	
	@Override
	public String toString() {
		return "Teacher:[id="+id+",name"+name+"]";
	}
}	

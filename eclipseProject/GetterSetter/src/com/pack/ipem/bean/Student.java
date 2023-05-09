package com.pack.ipem.bean;

public class Student 
{
	private int stId;
	private String name;
	
	public Student() {
	}
	public Student(int stId, String name) {
		this.stId = stId;
		this.name = name;
	}
	
	public void setStId(int id)
	{
		this.stId=id;
	}
	public int getStId()
	{
		return stId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

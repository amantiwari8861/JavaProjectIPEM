package com.pack.ipem.bean;

public class User 
{
	private int Id;
	private String name;
	private double salary;
	
	public User() {
	}
	public User(int id, String name, double salary)
	{
		this.Id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

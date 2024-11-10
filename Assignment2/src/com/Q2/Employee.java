package com.Q2;

public class Employee {
	int id;
	String name;
	double sal;
	
	public Employee() {}
	
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}

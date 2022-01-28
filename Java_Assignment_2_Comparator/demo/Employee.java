package com.te.comparable.demo;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	int id;
	String name;
	String address;
	double salary;

	public Employee() {

	}

	public Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}


}

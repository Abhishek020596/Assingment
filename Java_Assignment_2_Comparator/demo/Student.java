package com.te.comparable.demo;

public class Student implements Comparable<Student> {
	int id;
	int rollNo;
	String name;
	double marks;

	public Student(int id, String name, int rollNo, double marks) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollNo + ", marks=" + marks + "]";

	}

	public int compareTo(Student o) {
		return this.id-o.id;
	}
}

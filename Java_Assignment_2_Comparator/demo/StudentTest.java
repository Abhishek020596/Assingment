package com.te.comparable.demo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(13, "Anil", 34, 59.02);
		Student student1 = new Student(18, "Ajit", 32, 89.09);
		Student student2 = new Student(11, "Alisha", 28, 69.42);
		Student student3 = new Student(9, "Robin", 52, 60.92);
		Student student4 = new Student(8, "Kiran", 19, 79.82);
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(student);
		arraylist.add(student1);
		arraylist.add(student2);
		arraylist.add(student3);
		arraylist.add(student4);
		
		System.out.println("Comparable");
		System.out.println("\nArrayList without Sorting");
		for (Student student5 : arraylist) {
			System.out.println(student5);
		}
		System.out.println("\nAfter sorting by Id");
		Collections.sort(arraylist);
		for (Student student5 : arraylist) {
			System.out.println(student5);

		}
	}

}

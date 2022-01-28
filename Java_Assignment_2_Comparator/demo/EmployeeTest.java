package com.te.comparable.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(2, "Anil", "Bengaluru", 34002.02);
		Employee employee1 = new Employee(1, "Ajit", "Jamshedpur", 38034.02);
		Employee employee2 = new Employee(4, "Alisha", "Chaibasa", 28900.12);
		Employee employee3 = new Employee(3, "Kajal", "Ranchi", 18900.91);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee);
		arrayList.add(employee1);
		arrayList.add(employee2);
		arrayList.add(employee3);
		
		System.out.println("Comparator");
		System.out.println("ArrayList without Sorting:");
		for (Employee employee4 : arrayList) {
			System.out.println(employee4);
		}

		System.out.println("\nArrayList after Sorting by Id:");
		Collections.sort(arrayList, new Employee());
		for (Employee employee4 : arrayList) {
			System.out.println(employee4);
		}

		System.out.println("\nArrayList after Sorting by Name:");
		Collections.sort(arrayList, new SortByName());
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nArrayList after Sorting by Address:");
		Collections.sort(arrayList, new SortByAddress());
		Iterator<Employee> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

		System.out.println("\nArrayList after Sorting by Salary:");
		Collections.sort(arrayList, new SortBySalary());
		Iterator<Employee> iterator3 = arrayList.iterator();
		while (iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
	}

}

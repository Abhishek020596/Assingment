package com.te.comparable.demo;

import java.util.Comparator;

public class SortByAddress implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.address.compareTo(o2.address);
	}

}

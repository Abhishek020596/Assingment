package com.te.assignment.service;

import java.util.Scanner;

import com.te.assignment.dao.HibernateImpl;
import com.te.assignment.dao.JDBCImpl;

public class Impl {
	static Scanner sc = new Scanner(System.in);

	public static void implement() {
		System.out.println("choose impl method hibernate/jdbc");
		String impl = sc.next();
		if (impl.equalsIgnoreCase("hibernate")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = sc.nextInt();
			switch (inputFromUser) {
			case 1:
				HibernateImpl hibernateImpl1 = new HibernateImpl();
				hibernateImpl1.findAll();
				break;
			case 2:
				HibernateImpl hibernateImpl2 = new HibernateImpl();
				hibernateImpl2.getById();
				break;
			case 3:
				HibernateImpl hibernateImpl3 = new HibernateImpl();
				hibernateImpl3.delete();
				break;
			case 4:
				HibernateImpl hibernateImpl4 = new HibernateImpl();
				hibernateImpl4.update();
				break;
			case 5:
				HibernateImpl hibernateImpl5 = new HibernateImpl();
				hibernateImpl5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}
		if (impl.equalsIgnoreCase("jdbc")) {
			System.out.println("select the following to perform on database");
			System.out.println("1-for fetching all records");
			System.out.println("2-for finding a record using id");
			System.out.println("3-for deleting records");
			System.out.println("4-for updating records");
			System.out.println("5-for inserting records");
			int inputFromUser = sc.nextInt();
			switch (inputFromUser) {
			case 1:
				JDBCImpl jdbcImpl1 = new JDBCImpl();
				jdbcImpl1.findAll();
				break;
			case 2:
				JDBCImpl jdbcImpl2 = new JDBCImpl();
				jdbcImpl2.getById();
				break;
			case 3:
				JDBCImpl jdbcImpl3 = new JDBCImpl();
				jdbcImpl3.delete();
				break;
			case 4:
				JDBCImpl jdbcImpl4 = new JDBCImpl();
				jdbcImpl4.update();
				break;
			case 5:
				JDBCImpl jdbcImpl5 = new JDBCImpl();
				jdbcImpl5.insert();
				break;

			default:
				System.out.println("Invalid Response");
				break;
			}
		}

	}

}
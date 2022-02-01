package com.te.librarymanagementsystems.service;
import com.te.librarymanagementsystems.bean.StudentDetails;

import java.util.List;

public interface StudentService {
	
	public StudentDetails authenticate(int id, String password);

	boolean addStudent(StudentDetails details);

	public boolean deleteStudent(int id);

	public List<StudentDetails> showAllStudent();

	public StudentDetails showStudent(int id);

	public boolean updateStudent(StudentDetails details, int id);
}

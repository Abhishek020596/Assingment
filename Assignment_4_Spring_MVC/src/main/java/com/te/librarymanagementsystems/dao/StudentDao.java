package com.te.librarymanagementsystems.dao;
import com.te.librarymanagementsystems.bean.StudentDetails;

import java.util.List;

public interface StudentDao {

	public StudentDetails authenticate(int id, String password);

	public boolean addStudent(StudentDetails details);

	public boolean deleteStudent(int id);

	public StudentDetails showStudent(int id);

	public List<StudentDetails> showAllStudent();

	public boolean updateStudent(StudentDetails details, int id);

}

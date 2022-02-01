package com.te.librarymanagementsystems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.librarymanagementsystems.bean.StudentDetails;
import com.te.librarymanagementsystems.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	@Override
	public StudentDetails authenticate(int id, String name) {
		if (id <= 0) {
			return null;
		}
		return dao.authenticate(id, name);
	}

	@Override
	public boolean addStudent(StudentDetails details) {
		return dao.addStudent(details);
	}

	@Override
	public boolean deleteStudent(int id) {
		if (id <= 0) {
			return false;
		} else {
			return dao.deleteStudent(id);
		}

	}

	@Override
	public StudentDetails showStudent(int id) {
		if (id <= 0) {
			return null;
		} else {
			return dao.showStudent(id);
		}
	}

	@Override
	public List<StudentDetails> showAllStudent() {
		return dao.showAllStudent();
	}

	@Override
	public boolean updateStudent(StudentDetails details, int id) {
		return dao.updateStudent(details, id);
	}

}

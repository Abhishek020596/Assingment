package com.te.librarymanagementsystems.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.librarymanagementsystems.bean.StudentDetails;
import com.te.librarymanagementsystems.exception.StudentException;

@Repository
public class StudentDaoImpl implements StudentDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public StudentDetails authenticate(int id, String name) {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();

		StudentDetails employee = manager.find(StudentDetails.class, id);
		if (employee != null) {
			if (employee.getPassword().equals(name)) {
				return employee;
			} else {
				throw new StudentException("Invalid Password");
			}
		}
		throw new StudentException("Invalid ID");
	}

	@Override
	public boolean addStudent(StudentDetails details) {
		EntityTransaction transaction = null;
		boolean isAdded = false;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(details);
			transaction.commit();
			isAdded = true;

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public boolean deleteStudent(int id) {
		EntityTransaction transaction = null;
		boolean isDeleted = false;
		try {
//				EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			transaction.begin();
			StudentDetails details = manager.find(StudentDetails.class, id);
			manager.remove(details);
			transaction.commit();
			isDeleted = true;

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public StudentDetails showStudent(int id) {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		StudentDetails details = manager.find(StudentDetails.class, id);
		if (details != null) {
			return details;
		} else {
			return null;
		}

	}

	@Override
	public boolean updateStudent(StudentDetails details, int id) {
		boolean isUpdated = false;
		EntityTransaction transaction = null;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			StudentDetails details2 = manager.find(StudentDetails.class, id);
			if (details2 != null) {
				details2.setName(details.getName());
				details2.setAddress(details.getAddress());
				details2.setPassword(details.getPassword());
			}
			manager.persist(details2);
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		return isUpdated;
	}

	@Override
	public List<StudentDetails> showAllStudent() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("stud");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("From StudentDetails");

		List<StudentDetails> list = query.getResultList();

		return list;

	}

}

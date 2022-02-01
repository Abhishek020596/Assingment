package com.te.librarymanagementsystems.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student_info")
public class StudentDetails implements Serializable{
	@Id
	@Column(name="s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_address")
	private String address;
	@Column(name = "s_password")
	private String password;

}

package com.te.librarymanagementsystems.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.librarymanagementsystems.bean.StudentDetails;
import com.te.librarymanagementsystems.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	public StudentService service;

	@GetMapping("/login")
	public String login() {
		return "loginStudent";
	}

	@PostMapping("/home")
	public String home(int id, String password, ModelMap map, HttpServletRequest request) {
		StudentDetails details = service.authenticate(id, password);
		HttpSession session = request.getSession();
		session.setAttribute("loggedIn", details);
		if (details != null) {
			map.addAttribute("data", details.getName());
			return "welcome";
		} else {
			map.addAttribute("err", "Invalid Details");
			return "loginStudent";
		}

	}

	@GetMapping("/addStudent")
	public String addForm(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details2,
			ModelMap map) {
		if (details2 != null) {
			return "addStudent";

		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@PostMapping("/add")
	public String addStudent(StudentDetails details, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details2) {
		if (details2 != null) {
			if (service.addStudent(details)) {
				map.addAttribute("msg", "Data Deleted Successfully!");
			} else {
				map.addAttribute("err", "Something Went Wrong!");
			}
			return "addStudent";
		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@GetMapping("/updateStudentDetails")
	public String update(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details,
			ModelMap map) {
		if (details != null) {
			map.addAttribute("data",details.getId());
			return "updateStudentDetails";

		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@PostMapping("/updateStudentDetails")
	public String updateStudent(
			@SessionAttribute(name = "loggedIn", required = false)StudentDetails details ,StudentDetails details2,ModelMap map) {
		if (details != null) {
			if(service.updateStudent(details2,details.getId())){
				map.addAttribute("data", details.getId());
				map.addAttribute("msg", "Data Updated Successfully!");
			} else {
				map.addAttribute("msg", "Something Went Wrong!");
			}
			return "updateStudentDetails";
		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@GetMapping("/deleteStudent")
	public String delete(@SessionAttribute(name = "loggedIn", required = false)StudentDetails details2,
			ModelMap map) {
		if (details2 != null) {
			return "deleteStudent";
		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@PostMapping("/deleteStudent")
	public String deleteStudent(Integer id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false)StudentDetails details2) {
		if (details2 != null) {
			if (service.deleteStudent(id)) {
				map.addAttribute("msg", "Data Deleted Successfully!");
			} else {
				map.addAttribute("msg", "Something Went Wrong!");
			}
			return "deleteStudent";
		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}

	}
	
	@GetMapping("/showStudent")
	public String showFrom(@SessionAttribute(name = "loggedIn", required = false) StudentDetails details,
			ModelMap map) {
		if (details != null) {
			return "showStudent";
		} else {
			map.addAttribute("err", "Please Login First");
			return "loginStudent";
		}
	}

	@PostMapping("/showStudent")
	public String showStudent(int id, ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details2) {
		if (details2 != null) {
			StudentDetails details = service.showStudent(id);
			if (details != null) {
				map.addAttribute("data", details);
			} else {
				map.addAttribute("msg", "Data not found for id:" + id);
			}
			return "showStudent";
		} else {
			map.addAttribute("err", "Please login first");
			return "loginStudent";
		}
	}

	@GetMapping("/showAllStudent")
	public String showAllStudent(ModelMap map,
			@SessionAttribute(name = "loggedIn", required = false) StudentDetails details) {
		if (details != null) {
			List<StudentDetails> details2 = service.showAllStudent();
			if (details2 != null) {
				map.addAttribute("alldata", details2);
			} else {
				map.addAttribute("err", "No Data is Present");
			}
			return "showAllStudent";
		} else {
			map.addAttribute("errMessage", "Please LogIn First");
			return "loginStudent";
		}
	}

	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		map.addAttribute("err", "Logged Out Successfully");
		session.invalidate();
		return "loginStudent";
	}

}

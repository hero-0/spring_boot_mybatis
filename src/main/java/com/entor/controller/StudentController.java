package com.entor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.Student;
import com.entor.service.IStudentService;

@Controller
public class StudentController {
	
	@Autowired
	private IStudentService iss;
	@RequestMapping("/queryById")
	@ResponseBody
	public Student queryById(String id) {
		return iss.queryById(id);
	}
	
}

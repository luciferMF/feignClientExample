package org.websparrow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.configuration.Student;
import org.websparrow.model.StudentModel;
import org.websparrow.proxy.ReportServiceProxy;

@RestController
@RequestMapping(value = "student")
public class StudentController {

	@Autowired
	private Student stu;
	
	@Autowired
	private ReportServiceProxy reportService;
	
	@GetMapping
	public StudentModel getStudent() {
		return new StudentModel(stu.getRecords());
	}
	
	@GetMapping("/reports")
	public List<String> reports(){
		return reportService.reports();
	}
}

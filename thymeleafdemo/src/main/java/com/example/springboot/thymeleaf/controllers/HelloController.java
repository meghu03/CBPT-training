package com.example.springboot.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springboot.thymeleaf.model.Student;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/sendData")
	public ModelAndView sendData() {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("message", "Take up one idea and make it your life");
		return mav;
	}

	@RequestMapping("/student")
	public ModelAndView getStudent() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();
		student.setName("Dashmi");
		student.setScore(90);
		mav.addObject("student", student);
		return mav;
	}
	@RequestMapping("/students")
	public ModelAndView getStudents() {
		ModelAndView mav = new ModelAndView("student");
		
		Student student = new Student();
		student.setName("Dashmi");
		student.setScore(90);
		
		Student student2 = new Student();
		student.setName("Medha");
		student.setScore(99);
		
		List<Student> students = Arrays.asList(student,student2);
		
		mav.addObject("students", students);
		return mav;
	}
}

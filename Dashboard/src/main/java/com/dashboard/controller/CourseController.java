package com.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.Course;
import com.dashboard.repository.CourseRepository;
import com.dashboard.service.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("{course_id}")
	public Course getUser(@PathVariable("course_id") String course_id) {
		return courseService.getCourseById(course_id);
	}
}

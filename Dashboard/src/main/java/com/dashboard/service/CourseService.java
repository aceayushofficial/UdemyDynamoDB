package com.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.dashboard.entity.Course;
import com.dashboard.entity.User;
import com.dashboard.repository.CourseRepository;
import com.dashboard.repository.UserRepository;

@Service
public class CourseService {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Course getCourseById(String course_id) {
		System.out.println(dynamoDBMapper.load(Course.class, course_id));
		return dynamoDBMapper.load(Course.class, course_id);
	}
}

package com.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.dashboard.entity.Course;
import com.dashboard.entity.CourseDocument;
import com.dashboard.entity.User;

@Service
public class UserService {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;

	@Autowired
	private CourseService courseService;

	public User save(User user) {
		dynamoDBMapper.save(user);
		return user;
	}

	public User getUserById(String user_id) {
		return dynamoDBMapper.load(User.class, user_id);
	}

	public String delete(String user_id) {
		User user = dynamoDBMapper.load(User.class, user_id);
		dynamoDBMapper.delete(user);
		return "User deleted";
	}

	public String update(String user_id, User user) {

		User fetch = dynamoDBMapper.load(User.class, user_id);

		fetch.setUser_name(user.getUser_name());
		fetch.setEmail_id(user.getEmail_id());
		fetch.setNum_courses(user.getNum_courses());
		dynamoDBMapper.save(fetch);

		return fetch.getUser_id();

	}

	@SuppressWarnings("null")
	public String addCourse(String user_id, Course course) {
		// TODO Auto-generated method stub
		User fetch = getUserById(user_id);
		if (fetch != null) {
			if (course.getCourse_id() != null) {
				Course course1 = courseService.getCourseById(course.getCourse_id());
				if (course1 != null) {
					CourseDocument doc = new CourseDocument();
					ArrayList<CourseDocument> courseList = new ArrayList<CourseDocument>();
					ArrayList<CourseDocument> fetchedCourse = fetch.getCourse_document();
					doc.setCourse_title(course1.getCourse_title());
					doc.setCourse_id(course1.getCourse_id());
					doc.setIs_paid(course1.getIs_paid());
					doc.setUrl(course1.getUrl());
					doc.setLevel(course1.getLevel());
					doc.setPrice(course1.getPrice());
					doc.setContent_duration(course1.getContent_duration());
					if (fetchedCourse == null) {
						courseList.add(doc);
						fetch.setCourse_document(courseList);
					} else {
						fetchedCourse.add(doc);
						fetch.setCourse_document(fetchedCourse);
					}
					fetch.setNum_courses(fetch.getNum_courses() + 1);
					dynamoDBMapper.save(fetch);
					return "Course Added";
				} else {
					return "Course Not Found";
				}

			} else
				return "Please enter course_id";

		} else
			return "User Not Found";
	}

	public List<String> courseDetails(String user_id) {
		// TODO Auto-generated method stub
		User fetch = getUserById(user_id);
		if (fetch != null) {
			ArrayList<CourseDocument> courseList= new ArrayList<CourseDocument>();
			ArrayList<String> listCourse = new ArrayList<String>();
			courseList = fetch.getCourse_document();
			if(courseList!=null) {
				for (CourseDocument courseDocument : courseList) {
					listCourse.add(courseDocument.getCourse_title());
				}
				return listCourse;
			}
			else
				return null;
		}
		return null;
	}
}

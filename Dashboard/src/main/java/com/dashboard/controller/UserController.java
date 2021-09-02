package com.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.entity.Course;
import com.dashboard.entity.User;
import com.dashboard.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("{user_id}")
	public User getUser(@PathVariable("user_id") String user_id) {
		return userService.getUserById(user_id);
	}

	@DeleteMapping("{user_id}")
	public String deleteUser(@PathVariable("user_id") String user_id) {
		return userService.delete(user_id);
	}

	@PutMapping("{user_id}")
	public String updateUser(@PathVariable("user_id") String user_id, @RequestBody User user) {
		return userService.update(user_id, user);
	}
	
	@PutMapping("course/add/{user_id}")
	public String addCourse(@PathVariable("user_id") String user_id, @RequestBody Course course) {
		return userService.addCourse(user_id, course);
	}
	
	@GetMapping("course/display/{user_id}")
	public List<String> addCourse(@PathVariable("user_id") String user_id) {
		return userService.courseDetails(user_id);
	}
}

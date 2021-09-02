package com.dashboard.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Repository
public class CourseRepository {
	
	@Autowired
	private DynamoDBMapper dynamoDBMapper;

}

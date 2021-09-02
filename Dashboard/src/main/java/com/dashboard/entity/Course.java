package com.dashboard.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "course")
public class Course {


	@DynamoDBHashKey
	private String course_id;
	@DynamoDBAttribute
	private String course_title;
	@DynamoDBAttribute
	private String url;
	@DynamoDBAttribute
	private String is_paid;
	@DynamoDBAttribute
	private String price;
	@DynamoDBAttribute
	private String num_subscribers;
	@DynamoDBAttribute
	private String num_reviews;
	@DynamoDBAttribute
	private String num_lectures;
	@DynamoDBAttribute
	private String level;
	@DynamoDBAttribute
	private String content_duration;
	@DynamoDBAttribute
	private String published_timestamp;
	@DynamoDBAttribute
	private String subject;
	
	
	
	
	public Course() {
		
	}
	public Course(String course_id, String course_title, String url, String is_paid, String price,
			String num_subscribers, String num_reviews, String num_lectures, String level, String content_duration,
			String published_timestamp, String subject) {
		super();
		this.course_id = course_id;
		this.course_title = course_title;
		this.url = url;
		this.is_paid = is_paid;
		this.price = price;
		this.num_subscribers = num_subscribers;
		this.num_reviews = num_reviews;
		this.num_lectures = num_lectures;
		this.level = level;
		this.content_duration = content_duration;
		this.published_timestamp = published_timestamp;
		this.subject = subject;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIs_paid() {
		return is_paid;
	}
	public void setIs_paid(String is_paid) {
		this.is_paid = is_paid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNum_subscribers() {
		return num_subscribers;
	}
	public void setNum_subscribers(String num_subscribers) {
		this.num_subscribers = num_subscribers;
	}
	public String getNum_reviews() {
		return num_reviews;
	}
	public void setNum_reviews(String num_reviews) {
		this.num_reviews = num_reviews;
	}
	public String getNum_lectures() {
		return num_lectures;
	}
	public void setNum_lectures(String num_lectures) {
		this.num_lectures = num_lectures;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getContent_duration() {
		return content_duration;
	}
	public void setContent_duration(String content_duration) {
		this.content_duration = content_duration;
	}
	public String getPublished_timestamp() {
		return published_timestamp;
	}
	public void setPublished_timestamp(String published_timestamp) {
		this.published_timestamp = published_timestamp;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
	
	
	
	
	 
}

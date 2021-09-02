package com.dashboard.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class CourseDocument {

	@DynamoDBAttribute
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
	private String level;
	@DynamoDBAttribute
	private String content_duration;

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

}

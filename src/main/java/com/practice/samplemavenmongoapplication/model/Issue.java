package com.practice.samplemavenmongoapplication.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "issues")
public class Issue {
	
	@Id
	private String id;
	private final String description;
	private final int severity;
	private final String assignee;
	public Issue(String description, int severity, String assignee) {
		super();
		this.description = description;
		this.severity = severity;
		this.assignee = assignee;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public int getSeverity() {
		return severity;
	}
	public String getAssignee() {
		return assignee;
	}
	
	
}

package com.techelevator.domain;

import javax.validation.constraints.NotBlank;

public class Course {

	private long id;
	@NotBlank(message = "name is required")
	private String name;
	@NotBlank(message = "desecription is required")
	private String description;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesecription() {
		return description;
	}
	public void setDesecription(String desecription) {
		this.description = desecription;
	}
	
	
	
}

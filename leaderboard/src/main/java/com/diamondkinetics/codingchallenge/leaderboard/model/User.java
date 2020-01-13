package com.diamondkinetics.codingchallenge.leaderboard.model;

public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	
	public User() {}
	public User(Integer userId, String firstName, String lastName) {
		setUserId(userId);
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

package com.diamondkinetics.codingchallenge.leaderboard.model;

public class Group {

	private Integer groupId;
	private String name;
	private String description;
	
	public Group() {}
	public Group(Integer groupId, String name, String description) {
		
	}
	
	public Integer getGroupId() {
		return groupId;
	}
	
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}

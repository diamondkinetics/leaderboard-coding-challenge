package com.diamondkinetics.codingchallenge.leaderboard.model;

public class GroupMembership {

	private Integer groupMembershipId;
	private Integer groupId;
	private Integer userId;
	
	public GroupMembership() {}
	public GroupMembership(Integer groupMembershipId, Integer groupId, Integer userId) {
		setGroupMembershipId(groupMembershipId);
		setGroupId(groupId);
		setUserId(userId);
	}
	
	public Integer getGroupMembershipId() {
		return groupMembershipId;
	}
	
	public void setGroupMembershipId(Integer groupMembershipId) {
		this.groupMembershipId = groupMembershipId;
	}
	
	public Integer getGroupId() {
		return groupId;
	}
	
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}

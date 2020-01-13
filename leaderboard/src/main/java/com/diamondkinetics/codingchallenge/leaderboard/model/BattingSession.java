package com.diamondkinetics.codingchallenge.leaderboard.model;

import java.time.OffsetDateTime;

public class BattingSession {

	private Integer battingSessionId;
	private OffsetDateTime sessionDate;
	private Integer associatedGroupId;
	private Integer userId;
	
	public BattingSession() {}
	public BattingSession(
		Integer battingSessionId,
		OffsetDateTime sessionDate,
		Integer associatedGroupId,
		Integer userId)
	{
		setBattingSessionId(battingSessionId);
		setSessionDate(sessionDate);
		setAssociatedGroupId(associatedGroupId);
		setUserId(userId);
	}
	
	public Integer getBattingSessionId() {
		return battingSessionId;
	}
	
	public void setBattingSessionId(Integer battingSessionId) {
		this.battingSessionId = battingSessionId;
	}
	
	public OffsetDateTime getSessionDate() {
		return sessionDate;
	}
	
	public void setSessionDate(OffsetDateTime sessionDate) {
		this.sessionDate = sessionDate;
	}
	
	public Integer getAssociatedGroupId() {
		return associatedGroupId;
	}
	
	public void setAssociatedGroupId(Integer associatedGroupId) {
		this.associatedGroupId = associatedGroupId;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}

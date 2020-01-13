package com.diamondkinetics.codingchallenge.leaderboard.model;

public class Swing {

	private Integer swingId;
	private Integer battingSessionId;
	private Double powerBatAvg;
	private Double powerBatAccelMax;
	private Double powerBatMomentumImpact;
	private Double speedHandsMax;
	private Double speedBatBarrelMax;
	private Double speedBatTimeImpactMax;
	
	public Swing() {}
	public Swing(
		Integer swingId,
		Integer battingSessionId,
		Double powerBatAvg,
		Double powerBatAccelMax,
		Double powerBatMomentumImpact,
		Double speedHandsMax,
		Double speedBatBarrelMax,
		Double speedBatTimeImpactMax)
	{
		setSwingId(swingId);
		setBattingSessionId(battingSessionId);
		setPowerBatAvg(powerBatAvg);
		setPowerBatAccelMax(powerBatAccelMax);
		setPowerBatMomentumImpact(powerBatMomentumImpact);
		setSpeedHandsMax(speedHandsMax);
		setSpeedBatBarrelMax(speedBatBarrelMax);
		setSpeedBatTimeImpactMax(speedBatTimeImpactMax);
	}
	
	public Integer getSwingId() {
		return swingId;
	}
	
	public void setSwingId(Integer swingId) {
		this.swingId = swingId;
	}
	
	public Integer getBattingSessionId() {
		return battingSessionId;
	}
	
	public void setBattingSessionId(Integer battingSessionId) {
		this.battingSessionId = battingSessionId;
	}
	
	public Double getPowerBatAvg() {
		return powerBatAvg;
	}
	
	public void setPowerBatAvg(Double powerBatAvg) {
		this.powerBatAvg = powerBatAvg;
	}
	
	public Double getPowerBatAccelMax() {
		return powerBatAccelMax;
	}
	
	public void setPowerBatAccelMax(Double powerBatAccelMax) {
		this.powerBatAccelMax = powerBatAccelMax;
	}
	
	public Double getPowerBatMomentumImpact() {
		return powerBatMomentumImpact;
	}
	
	public void setPowerBatMomentumImpact(Double powerBatMomentumImpact) {
		this.powerBatMomentumImpact = powerBatMomentumImpact;
	}
	
	public Double getSpeedHandsMax() {
		return speedHandsMax;
	}
	
	public void setSpeedHandsMax(Double speedHandsMax) {
		this.speedHandsMax = speedHandsMax;
	}
	
	public Double getSpeedBatBarrelMax() {
		return speedBatBarrelMax;
	}
	
	public void setSpeedBatBarrelMax(Double speedBatBarrelMax) {
		this.speedBatBarrelMax = speedBatBarrelMax;
	}
	
	public Double getSpeedBatTimeImpactMax() {
		return speedBatTimeImpactMax;
	}
	
	public void setSpeedBatTimeImpactMax(Double speedBatTimeImpactMax) {
		this.speedBatTimeImpactMax = speedBatTimeImpactMax;
	}
	
}

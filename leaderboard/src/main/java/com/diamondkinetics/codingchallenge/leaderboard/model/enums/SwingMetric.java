package com.diamondkinetics.codingchallenge.leaderboard.model.enums;

import java.util.Arrays;
import java.lang.IllegalArgumentException;

public enum SwingMetric {
	
	APPLIED_SWING_POWER("metricAppliedSwingPower", "Applied Swing Power")
	,MAX_ACCELERATION("metricMaxAcceleration", "Maximum Acceleration")
	,IMPACT_MOMENTUM("metricImpactMomentum", "Impact Momentum")
	,MAX_HAND_SPEED("metricMaxHandSpeed", "Maximum Hand Speed")
	,MAX_BARREL_SPEED("metricMaxBarrelSpeed", "Maximum Barrel Speed")
	,SPEED_EFFICIENCY("metricSpeedEfficiency", "Speed Efficiency");
	
	private String field;
	private String name;
	
	private SwingMetric(String field, String name) {
		this.field = field;
		this.name = name;
	}
	
	public String getField() {
		return field;
	}
	
	public String getName() {
		return name;
	}
	
	public static SwingMetric byField(String field) {
		return Arrays.asList(SwingMetric.values())
			.stream()
			.filter(sm -> sm.getField().equals(field))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("No SwingMetric with field '" + field + "' found."));
	}
	
	public static SwingMetric byName(String name) {
		return Arrays.asList(SwingMetric.values())
			.stream()
			.filter(sm -> sm.getName().equals(name))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("No SwingMetric with name '" + name + "' found."));
	}

}

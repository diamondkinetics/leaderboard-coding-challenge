package com.diamondkinetics.codingchallenge.leaderboard.model.enums;

import java.util.Arrays;
import java.lang.IllegalArgumentException;

public enum SwingMetric {
	
	POWER_BAT_AVERAGE("powerBatAvg", "Applied Swing Power")
	,POWER_BAT_ACCEL_MAX("powerBatAccelMax", "Maximum Acceleration")
	,POWER_BAT_MOMENTUM("powerBatMomentumImpact", "Impact Momentum")
	,SPEED_HANDS_MAX("speedHandsMax", "Maximum Hand Speed")
	,SPEED_BAT_BARREL_MAX("speedBatBarrelMax", "Maximum Barrel Speed")
	,SPEED_IMPACT_EFFICIENCY("speedBatTimeImpact", "Speed Efficiency");
	
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

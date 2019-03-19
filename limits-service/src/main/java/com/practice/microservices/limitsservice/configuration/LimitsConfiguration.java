package com.practice.microservices.limitsservice.configuration;

public class LimitsConfiguration {

	private int min;
	private int max;

	public LimitsConfiguration() {
	}

	public LimitsConfiguration(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

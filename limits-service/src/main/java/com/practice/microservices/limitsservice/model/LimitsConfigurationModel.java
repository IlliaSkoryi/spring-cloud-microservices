package com.practice.microservices.limitsservice.model;

import java.util.Objects;

public class LimitsConfigurationModel {

	private int min;
	private int max;

	public LimitsConfigurationModel() {
	}

	public LimitsConfigurationModel(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LimitsConfigurationModel that = (LimitsConfigurationModel) o;
		return min == that.min &&
				max == that.max;
	}

	@Override
	public int hashCode() {
		return Objects.hash(min, max);
	}

	@Override
	public String toString() {
		return "LimitsConfigurationModel{" +
				"min=" + min +
				", max=" + max +
				'}';
	}
}

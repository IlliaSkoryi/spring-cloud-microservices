package com.practice.microservices.limitsservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Value("${limits-service.min}")
	private int min;
	@Value("${limits-service.max}")
	private int max;

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

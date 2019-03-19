package com.practice.microservices.limitsservice.controller;

import com.practice.microservices.limitsservice.configuration.Config;
import com.practice.microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@Autowired
	private Config config;

	@GetMapping("/limits")
	public LimitsConfiguration getLimitsConfiguration() {
		return new LimitsConfiguration(config.getMin(), config.getMax());
	}
}

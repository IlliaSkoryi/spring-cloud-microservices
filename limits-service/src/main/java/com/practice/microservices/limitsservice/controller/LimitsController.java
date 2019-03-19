package com.practice.microservices.limitsservice.controller;

import com.practice.microservices.limitsservice.configuration.Config;
import com.practice.microservices.limitsservice.model.LimitsConfigurationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

	@Autowired
	private Config config;

	@GetMapping("/limits")
	public LimitsConfigurationModel getLimitsConfiguration() {
		return new LimitsConfigurationModel(config.getMin(), config.getMax());
	}
}

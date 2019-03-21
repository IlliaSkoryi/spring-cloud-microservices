package com.practice.microservices.currencyexchangeservice.controller.impl;

import com.practice.microservices.currencyexchangeservice.controller.CurrencyExchangeController;
import com.practice.microservices.currencyexchangeservice.model.ExchangeValue;
import com.practice.microservices.currencyexchangeservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeControllerImpl implements CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueService service;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@Override
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = service.findByFromAndTo(from, to);
		exchangeValue.setPort(environment.getProperty("local.server.port"));
		return exchangeValue;
	}
}

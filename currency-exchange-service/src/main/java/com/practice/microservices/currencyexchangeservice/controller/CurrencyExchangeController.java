package com.practice.microservices.currencyexchangeservice.controller;

import com.practice.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = new ExchangeValue(1L, from, to, BigDecimal.valueOf(27L));
		exchangeValue.setPort(environment.getProperty("local.server.port"));
		return exchangeValue;
	}
}

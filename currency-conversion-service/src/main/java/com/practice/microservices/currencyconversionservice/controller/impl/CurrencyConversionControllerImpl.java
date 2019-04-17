package com.practice.microservices.currencyconversionservice.controller.impl;

import com.practice.microservices.currencyconversionservice.controller.CurrencyConversionController;
import com.practice.microservices.currencyconversionservice.model.CurrencyConversionModel;
import com.practice.microservices.currencyconversionservice.service.CurrencyConversionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
public class CurrencyConversionControllerImpl implements CurrencyConversionController {

	@Autowired
	private CurrencyConversionService conversionService;

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	@Override
	public CurrencyConversionModel getConvertedResult(@PathVariable String from, @PathVariable String to,
													  @PathVariable BigDecimal quantity) {
		CurrencyConversionModel currencyConversionModel = conversionService.getConvertedResult(from, to, quantity);
		log.info("{}", currencyConversionModel);
		return currencyConversionModel;
	}
}

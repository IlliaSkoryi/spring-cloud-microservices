package com.practice.microservices.currencyconversionservice.service.impl;

import com.practice.microservices.currencyconversionservice.model.CurrencyConversionModel;
import com.practice.microservices.currencyconversionservice.proxy.CurrencyExchangeServiceProxy;
import com.practice.microservices.currencyconversionservice.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@Autowired
	private Environment environment;

	@Override
	public CurrencyConversionModel getConvertedResult(String from, String to, BigDecimal quantity) {
		CurrencyConversionModel result = proxy.retrieveExchangeValue(from, to);
		result.setQuantity(quantity);
		result.setTotalCalculatedAmount(result.getConversionMultiple().multiply(quantity));
		return result;
	}
}

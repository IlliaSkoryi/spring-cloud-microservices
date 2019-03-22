package com.practice.microservices.currencyconversionservice.service;

import com.practice.microservices.currencyconversionservice.model.CurrencyConversionModel;

import java.math.BigDecimal;

public interface CurrencyConversionService {

	CurrencyConversionModel getConvertedResult(String from, String to, BigDecimal quantity);
}

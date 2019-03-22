package com.practice.microservices.currencyconversionservice.controller;

import com.practice.microservices.currencyconversionservice.model.CurrencyConversionModel;

import java.math.BigDecimal;

public interface CurrencyConversionController {

	CurrencyConversionModel getConvertedResult(String from, String to, BigDecimal quantity);
}

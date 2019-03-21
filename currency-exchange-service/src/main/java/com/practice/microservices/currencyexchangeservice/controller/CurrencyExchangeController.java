package com.practice.microservices.currencyexchangeservice.controller;

import com.practice.microservices.currencyexchangeservice.model.ExchangeValue;

public interface CurrencyExchangeController {

    ExchangeValue retrieveExchangeValue(String from, String to);
}

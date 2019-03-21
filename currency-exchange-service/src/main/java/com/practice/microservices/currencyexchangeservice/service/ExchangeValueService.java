package com.practice.microservices.currencyexchangeservice.service;

import com.practice.microservices.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueService {

    ExchangeValue findByFromAndTo(String from, String to);
}

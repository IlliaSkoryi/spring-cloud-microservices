package com.practice.microservices.currencyexchangeservice.service.impl;

import com.practice.microservices.currencyexchangeservice.model.ExchangeValue;
import com.practice.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import com.practice.microservices.currencyexchangeservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

    @Autowired
    private ExchangeValueRepository repository;

    @Override
    public ExchangeValue findByFromAndTo(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}

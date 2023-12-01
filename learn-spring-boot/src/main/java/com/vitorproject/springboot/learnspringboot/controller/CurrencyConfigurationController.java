package com.vitorproject.springboot.learnspringboot.controller;

import com.vitorproject.springboot.learnspringboot.CurrencyServiceConfiguration;
import com.vitorproject.springboot.learnspringboot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getConfiguration() {
        return configuration;
    }
}

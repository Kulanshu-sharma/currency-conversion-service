package com.kulanshu.microservices.currencyconversionservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kulanshu.microservices.currencyconversionservice.beans.CurrencyConversionBean;
import com.kulanshu.microservices.currencyconversionservice.beans.CurrencyExchangeServiceFeignProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	public CurrencyExchangeServiceFeignProxy proxy;

	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retrieveCurrencyConversion(@PathVariable String from,@PathVariable 
			                                                String to,@PathVariable int quantity) {
		CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversion(),quantity,response.getConversion()*quantity);
	}
}

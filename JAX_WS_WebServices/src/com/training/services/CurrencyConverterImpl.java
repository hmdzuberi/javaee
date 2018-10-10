package com.training.services;

import javax.jws.WebService;

import com.training.ifaces.CurrencyConverter;

@WebService(endpointInterface = "com.training.ifaces.CurrencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {

	@Override
	public double dollarToRupees(double dollarAmount) {

		return dollarAmount * 74;
	}

}

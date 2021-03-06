package com.training.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CurrencyConverter {

	@WebMethod
	public double dollarToRupees(@WebParam(name = "usd") double dollarAmount);

}

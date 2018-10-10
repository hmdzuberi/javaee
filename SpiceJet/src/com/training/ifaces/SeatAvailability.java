package com.training.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface SeatAvailability {

	@WebMethod
	@WebResult(name = "seatsAvailable")
	public int getAvailableSeats(String origin, String destination);

}

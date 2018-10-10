package com.training.services;

import javax.jws.WebService;

import com.training.ifaces.SeatAvailability;

@WebService(endpointInterface = "com.training.ifaces.SeatAvailability")
public class SpiceJet implements SeatAvailability {

	@Override
	public int getAvailableSeats(String origin, String destination) {

		int seatsAvailable = 0;

		if (origin.equals("Bangalore") && destination.equals("Delhi")) {
			seatsAvailable = 25;
		} else if (origin.equals("Delhi") && destination.equals("Bangalore")) {
			seatsAvailable = 15;
		}

		return seatsAvailable;
	}

}

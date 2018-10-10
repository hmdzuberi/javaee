package com.training.domain;

import com.training.jetairways.JetAirwaysService;
import com.training.jetairways.SeatAvailability;
import com.training.spicejet.SpiceJetService;

public class Application {

	public static void main(String[] args) {

		JetAirwaysService jetAirways = new JetAirwaysService();
		SeatAvailability proxyJet = jetAirways.getJetAirwaysPort();
		System.out.println("Jet Airways: Bangalore - Delhi");
		System.out.println("Seats available: " + proxyJet.getAvailableSeats("Bangalore", "Delhi"));

		System.out.println();

		SpiceJetService spiceJet = new SpiceJetService();
		com.training.spicejet.SeatAvailability proxySpice = spiceJet.getSpiceJetPort();
		System.out.println("Spice Jet: Bangalore - Delhi");
		System.out.println("Seats available: " + proxySpice.getAvailableSeats("Bangalore", "Delhi"));
	}

}

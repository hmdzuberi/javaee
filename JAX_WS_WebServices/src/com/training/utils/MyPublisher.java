package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.DonationRequestService;

public class MyPublisher {

	public static void main(String[] args) {

		// Endpoint.publish("http://localhost:5000/converter", new
		// CurrencyConverterImpl());
		// System.out.println("Service Running");

		Endpoint.publish("http://localhost:5000/donor", new DonationRequestService());
		System.out.println("Donation Service Running");
	}

}

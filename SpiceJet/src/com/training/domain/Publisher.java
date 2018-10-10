package com.training.domain;

import javax.xml.ws.Endpoint;

import com.training.services.SpiceJet;

public class Publisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:5005/SpiceJet", new SpiceJet());
		System.out.println("SpiceJet service online");

	}

}

package com.training.domain;

import javax.xml.ws.Endpoint;

import com.training.services.JetAirways;

public class Publisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:5000/JetAirways", new JetAirways());
		System.out.println("JetAirways service online");

	}

}

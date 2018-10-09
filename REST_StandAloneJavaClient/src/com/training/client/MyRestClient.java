package com.training.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.beans.Customer;

public class MyRestClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/REST_WebService/rest");

		// String response = target.path("quick").request().get(String.class);
		//
		// System.out.println(response);

		// Response deleteResponse =
		// target.path("customer/remove").queryParam("customerId",
		// 102).request().delete();
		//
		// System.out.println(deleteResponse);

		Customer customer = new Customer(101, "Hamaad", 123123L);

		//
		// Response updateResponse =
		// target.path("customer/update").queryParam("customerId",
		// 101).request()
		// .put(Entity.entity(customer, MediaType.APPLICATION_JSON));
		//
		// System.out.println(updateResponse);

		Response response = target.path("customer/addAsJason").request()
				.post(Entity.entity(customer, MediaType.APPLICATION_JSON));

		System.out.println(response.readEntity(String.class));
	}

}

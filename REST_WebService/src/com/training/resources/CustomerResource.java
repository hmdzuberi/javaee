package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.beans.Customer;
import com.training.util.CustomerDetails;

@Path("/customer")
public class CustomerResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getCustomer() {

		Customer customer = new Customer(101, "Ramesh", 484848L);

		return Response.status(200).entity(customer.toString()).build();
	}

	@GET
	@Path("xmlFormat")
	@Produces(MediaType.APPLICATION_XML)
	public Response getCustomerAsXml() {

		Customer customer = new Customer(102, "Ganesh", 565656L);

		return Response.status(200).entity(customer).build();
	}

	@GET
	@Path("jsonFormat")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerAsJson() {

		HashMap<Long, Customer> customerList = CustomerDetails.getAllCustomer();

		return Response.status(200).entity(customerList).build();
	}

	@GET
	@Path("findById/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerById(@PathParam("customerId") long customerId) {

		Customer customer = CustomerDetails.getCustomer(customerId);

		return Response.status(200).entity(customer).build();
	}

	@POST
	@Path("add")
	public String addCustomer(@FormParam("customerId") long customerId, @FormParam("customerName") String customerName,
			@FormParam("mobileNumber") long mobileNumber) {

		return CustomerDetails.addCustomer(new Customer(customerId, customerName, mobileNumber));
	}

	@DELETE
	@Path("remove")
	public String removeCustomer(@QueryParam("customerId") long customerId) {

		return CustomerDetails.removeCustomer(customerId);
	}

	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateMobileNumber(Customer customer, @QueryParam("customerId") long customerId) {

		return CustomerDetails.updateMobileNumber(customerId, customer);
	}

}

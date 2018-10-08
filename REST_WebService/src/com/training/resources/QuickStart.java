package com.training.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/quick")
public class QuickStart {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {

		return "You have configured JERSEY properly - Hamaad";
	}

}

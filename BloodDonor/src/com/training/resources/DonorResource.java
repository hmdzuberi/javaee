package com.training.resources;

import java.sql.Connection;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.training.beans.Donor;
import com.training.dao.DonorDAO;
import com.training.dao.impl.DonorDAOImpl;

@Path("/donor")
public class DonorResource {

	private DonorDAO donorDAO;

	public DonorResource() {

		try {
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/ds1");
			Connection con = dataSource.getConnection();

			System.out.println(con);
			this.donorDAO = new DonorDAOImpl(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String addDonor(Donor donor) {

		int donorAdded = 0;
		String result = "Error";

		try {
			donorAdded = donorDAO.add(donor);
			result = donorAdded + " donor added";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@GET
	@Path("get/loc")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDonorByLocation(@QueryParam("location") String location) {

		List<Donor> donorList = null;

		try {
			donorList = donorDAO.getByLoc(location);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(donorList).build();
	}

	@GET
	@Path("get/type")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDonorByType(@QueryParam("bloodType") String bloodType) {

		List<Donor> donorList = null;

		try {
			donorList = donorDAO.getByType(bloodType);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(donorList).build();
	}

	@POST
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateDonor(Donor donor) {

		int donorUpdated;
		String result = "Error";

		try {
			donorUpdated = donorDAO.update(donor);
			result = donorUpdated + " donor updated";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@GET
	@Path("get/loctype/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDonorByLocAndType(@QueryParam("loc") String location, @QueryParam("type") String bloodType) {

		List<Donor> donorList = null;

		System.out.println(location);
		System.out.println(bloodType);

		try {
			donorList = donorDAO.getByLocAndType(location, bloodType);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(donorList).build();
	}

	@GET
	@Path("loc")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLocations() {

		List<String> locationList = null;

		try {
			locationList = donorDAO.getLocations();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(locationList).build();
	}

	@GET
	@Path("loctype")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTypesByLoc(@QueryParam("loc") String location) {

		List<String> typeList = null;

		try {
			typeList = donorDAO.getTypeByLoc(location);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(typeList).build();
	}

}

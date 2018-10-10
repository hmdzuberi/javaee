package com.training.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.domain.BloodDonor;

@WebService
public interface DonationRequest {

	@WebMethod
	@WebResult(name = "donorDetails")
	public BloodDonor getRequest(@WebParam(name = "bloodGroup") String bloodGroup);

}

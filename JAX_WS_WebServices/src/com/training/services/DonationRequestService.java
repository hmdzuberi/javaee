package com.training.services;

import java.util.HashMap;

import javax.jws.WebService;

import com.training.domain.BloodDonor;
import com.training.ifaces.DonationRequest;

@WebService(endpointInterface = "com.training.ifaces.DonationRequest")
public class DonationRequestService implements DonationRequest {

	private HashMap<String, BloodDonor> donorList;

	public DonationRequestService() {

		super();
		donorList = new HashMap<>();
		donorList.put("Ap", new BloodDonor(101, "Hamaad", "Bengaluru", "Ap", 2));
		donorList.put("ABp", new BloodDonor(102, "Ayush", "Bengaluru", "ABp", 4));
		donorList.put("Bp", new BloodDonor(103, "Saad", "Aligarh", "Bp", 1));
	}

	@Override
	public BloodDonor getRequest(String bloodGroup) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return donorList.get(bloodGroup);
	}

}

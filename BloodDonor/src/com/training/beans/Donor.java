package com.training.beans;

public class Donor {

	private long donorId;
	private String donorName;
	private String location;
	private String bloodType;
	private int timesDonated;

	public Donor() {
		super();
	}

	public Donor(long donorId, String donorName, String location, String bloodType, int timesDonated) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.location = location;
		this.bloodType = bloodType;
		this.timesDonated = timesDonated;
	}

	public long getDonorId() {

		return donorId;
	}

	public void setDonorId(long donorId) {

		this.donorId = donorId;
	}

	public String getDonorName() {

		return donorName;
	}

	public void setDonorName(String donorName) {

		this.donorName = donorName;
	}

	public String getLocation() {

		return location;
	}

	public void setLocation(String location) {

		this.location = location;
	}

	public String getBloodType() {

		return bloodType;
	}

	public void setBloodType(String bloodType) {

		this.bloodType = bloodType;
	}

	public int getTimesDonated() {

		return timesDonated;
	}

	public void setTimesDonated(int timesDonated) {

		this.timesDonated = timesDonated;
	}

}

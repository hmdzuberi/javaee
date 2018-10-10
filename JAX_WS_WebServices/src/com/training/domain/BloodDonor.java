package com.training.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BloodDonor {

	@XmlAttribute
	private long donorId;

	@XmlElement
	private String donorName;

	@XmlElement
	private String location;

	@XmlElement
	private String bloodType;

	@XmlElement
	private int timesDonated;

	public BloodDonor() {
		super();
	}

	public BloodDonor(long donorId, String donorName, String location, String bloodType, int timesDonated) {
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

	@Override
	public String toString() {

		return "BloodDonor [donorId=" + donorId + ", donorName=" + donorName + ", location=" + location + ", bloodType="
				+ bloodType + ", timesDonated=" + timesDonated + "]";
	}

}

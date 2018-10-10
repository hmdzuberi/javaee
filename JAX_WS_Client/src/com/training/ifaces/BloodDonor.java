
package com.training.ifaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for bloodDonor complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="bloodDonor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timesDonated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="donorId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bloodDonor", propOrder = { "donorName", "location", "bloodType", "timesDonated" })
public class BloodDonor {

	protected String donorName;
	protected String location;
	protected String bloodType;
	protected int timesDonated;
	@XmlAttribute(name = "donorId", required = true)
	protected long donorId;

	/**
	 * Gets the value of the donorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDonorName() {

		return donorName;
	}

	/**
	 * Sets the value of the donorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDonorName(String value) {

		this.donorName = value;
	}

	/**
	 * Gets the value of the location property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocation() {

		return location;
	}

	/**
	 * Sets the value of the location property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocation(String value) {

		this.location = value;
	}

	/**
	 * Gets the value of the bloodType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBloodType() {

		return bloodType;
	}

	/**
	 * Sets the value of the bloodType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBloodType(String value) {

		this.bloodType = value;
	}

	/**
	 * Gets the value of the timesDonated property.
	 * 
	 */
	public int getTimesDonated() {

		return timesDonated;
	}

	/**
	 * Sets the value of the timesDonated property.
	 * 
	 */
	public void setTimesDonated(int value) {

		this.timesDonated = value;
	}

	/**
	 * Gets the value of the donorId property.
	 * 
	 */
	public long getDonorId() {

		return donorId;
	}

	/**
	 * Sets the value of the donorId property.
	 * 
	 */
	public void setDonorId(long value) {

		this.donorId = value;
	}

	@Override
	public String toString() {

		return "BloodDonor [donorName=" + donorName + ", location=" + location + ", bloodType=" + bloodType
				+ ", timesDonated=" + timesDonated + ", donorId=" + donorId + "]";
	}

}


package com.training.spicejet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableSeatsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableSeatsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatsAvailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableSeatsResponse", propOrder = {
    "seatsAvailable"
})
public class GetAvailableSeatsResponse {

    protected int seatsAvailable;

    /**
     * Gets the value of the seatsAvailable property.
     * 
     */
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    /**
     * Sets the value of the seatsAvailable property.
     * 
     */
    public void setSeatsAvailable(int value) {
        this.seatsAvailable = value;
    }

}

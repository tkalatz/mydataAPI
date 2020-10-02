//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.02 at 03:58:23 PM EEST 
//


package org.model.xjc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="doy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="shipId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipType", propOrder = {
    "applicationId",
    "applicationDate",
    "doy",
    "shipId"
})
public class ShipType {

    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    protected String doy;
    @XmlElement(required = true)
    protected String shipId;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the doy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoy() {
        return doy;
    }

    /**
     * Sets the value of the doy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoy(String value) {
        this.doy = value;
    }

    /**
     * Gets the value of the shipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipId() {
        return shipId;
    }

    /**
     * Sets the value of the shipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipId(String value) {
        this.shipId = value;
    }

}

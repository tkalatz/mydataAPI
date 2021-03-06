//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.02 at 03:58:23 PM EEST 
//


package org.model.xjc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AadeBookInvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AadeBookInvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cancelledByMark" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="authenticationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://www.aade.gr/myDATA/invoice/v1.0}PartyType" minOccurs="0"/>
 *         &lt;element name="counterpart" type="{http://www.aade.gr/myDATA/invoice/v1.0}PartyType" minOccurs="0"/>
 *         &lt;element name="invoiceHeader" type="{http://www.aade.gr/myDATA/invoice/v1.0}InvoiceHeaderType"/>
 *         &lt;element name="paymentMethods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="paymentMethodDetails" type="{http://www.aade.gr/myDATA/invoice/v1.0}PaymentMethodDetailType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="invoiceDetails" type="{http://www.aade.gr/myDATA/invoice/v1.0}InvoiceRowType" maxOccurs="unbounded"/>
 *         &lt;element name="taxesTotals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxes" type="{http://www.aade.gr/myDATA/invoice/v1.0}TaxTotalsType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="invoiceSummary" type="{http://www.aade.gr/myDATA/invoice/v1.0}InvoiceSummaryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AadeBookInvoiceType", propOrder = {
    "uid",
    "mark",
    "cancelledByMark",
    "authenticationCode",
    "issuer",
    "counterpart",
    "invoiceHeader",
    "paymentMethods",
    "invoiceDetails",
    "taxesTotals",
    "invoiceSummary"
})
public class AadeBookInvoiceType {

    protected String uid;
    protected Long mark;
    protected Long cancelledByMark;
    protected String authenticationCode;
    protected PartyType issuer;
    protected PartyType counterpart;
    @XmlElement(required = true)
    protected InvoiceHeaderType invoiceHeader;
    protected AadeBookInvoiceType.PaymentMethods paymentMethods;
    @XmlElement(required = true)
    protected List<InvoiceRowType> invoiceDetails;
    protected AadeBookInvoiceType.TaxesTotals taxesTotals;
    @XmlElement(required = true)
    protected InvoiceSummaryType invoiceSummary;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMark(Long value) {
        this.mark = value;
    }

    /**
     * Gets the value of the cancelledByMark property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCancelledByMark() {
        return cancelledByMark;
    }

    /**
     * Sets the value of the cancelledByMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCancelledByMark(Long value) {
        this.cancelledByMark = value;
    }

    /**
     * Gets the value of the authenticationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationCode() {
        return authenticationCode;
    }

    /**
     * Sets the value of the authenticationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationCode(String value) {
        this.authenticationCode = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuer(PartyType value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the counterpart property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCounterpart() {
        return counterpart;
    }

    /**
     * Sets the value of the counterpart property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCounterpart(PartyType value) {
        this.counterpart = value;
    }

    /**
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public InvoiceHeaderType getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public void setInvoiceHeader(InvoiceHeaderType value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link AadeBookInvoiceType.PaymentMethods }
     *     
     */
    public AadeBookInvoiceType.PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Sets the value of the paymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AadeBookInvoiceType.PaymentMethods }
     *     
     */
    public void setPaymentMethods(AadeBookInvoiceType.PaymentMethods value) {
        this.paymentMethods = value;
    }

    /**
     * Gets the value of the invoiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRowType }
     * 
     * 
     */
    public List<InvoiceRowType> getInvoiceDetails() {
        if (invoiceDetails == null) {
            invoiceDetails = new ArrayList<InvoiceRowType>();
        }
        return this.invoiceDetails;
    }

    /**
     * Gets the value of the taxesTotals property.
     * 
     * @return
     *     possible object is
     *     {@link AadeBookInvoiceType.TaxesTotals }
     *     
     */
    public AadeBookInvoiceType.TaxesTotals getTaxesTotals() {
        return taxesTotals;
    }

    /**
     * Sets the value of the taxesTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AadeBookInvoiceType.TaxesTotals }
     *     
     */
    public void setTaxesTotals(AadeBookInvoiceType.TaxesTotals value) {
        this.taxesTotals = value;
    }

    /**
     * Gets the value of the invoiceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSummaryType }
     *     
     */
    public InvoiceSummaryType getInvoiceSummary() {
        return invoiceSummary;
    }

    /**
     * Sets the value of the invoiceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSummaryType }
     *     
     */
    public void setInvoiceSummary(InvoiceSummaryType value) {
        this.invoiceSummary = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="paymentMethodDetails" type="{http://www.aade.gr/myDATA/invoice/v1.0}PaymentMethodDetailType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentMethodDetails"
    })
    public static class PaymentMethods {

        @XmlElement(required = true)
        protected List<PaymentMethodDetailType> paymentMethodDetails;

        /**
         * Gets the value of the paymentMethodDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentMethodDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentMethodDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentMethodDetailType }
         * 
         * 
         */
        public List<PaymentMethodDetailType> getPaymentMethodDetails() {
            if (paymentMethodDetails == null) {
                paymentMethodDetails = new ArrayList<PaymentMethodDetailType>();
            }
            return this.paymentMethodDetails;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="taxes" type="{http://www.aade.gr/myDATA/invoice/v1.0}TaxTotalsType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxes"
    })
    public static class TaxesTotals {

        @XmlElement(required = true)
        protected List<TaxTotalsType> taxes;

        /**
         * Gets the value of the taxes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxTotalsType }
         * 
         * 
         */
        public List<TaxTotalsType> getTaxes() {
            if (taxes == null) {
                taxes = new ArrayList<TaxTotalsType>();
            }
            return this.taxes;
        }

    }

}

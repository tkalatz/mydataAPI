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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="incomeInvoiceClassification" type="{https://www.aade.gr/myDATA/incomeClassificaton/v1.0}InvoiceIncomeClassificationType"/>
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
    "incomeInvoiceClassification"
})
@XmlRootElement(name = "IncomeClassificationsDoc", namespace = "https://www.aade.gr/myDATA/incomeClassificaton/v1.0")
public class IncomeClassificationsDoc {

    @XmlElement(namespace = "https://www.aade.gr/myDATA/incomeClassificaton/v1.0", required = true)
    protected List<InvoiceIncomeClassificationType> incomeInvoiceClassification;

    /**
     * Gets the value of the incomeInvoiceClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeInvoiceClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeInvoiceClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceIncomeClassificationType }
     * 
     * 
     */
    public List<InvoiceIncomeClassificationType> getIncomeInvoiceClassification() {
        if (incomeInvoiceClassification == null) {
            incomeInvoiceClassification = new ArrayList<InvoiceIncomeClassificationType>();
        }
        return this.incomeInvoiceClassification;
    }

}

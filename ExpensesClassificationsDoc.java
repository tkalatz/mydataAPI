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
 *         &lt;element name="expensesInvoiceClassification" type="{https://www.aade.gr/myDATA/expensesClassificaton/v1.0}InvoiceExpensesClassificationType"/>
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
    "expensesInvoiceClassification"
})
@XmlRootElement(name = "ExpensesClassificationsDoc", namespace = "https://www.aade.gr/myDATA/expensesClassificaton/v1.0")
public class ExpensesClassificationsDoc {

    @XmlElement(namespace = "https://www.aade.gr/myDATA/expensesClassificaton/v1.0", required = true)
    protected List<InvoiceExpensesClassificationType> expensesInvoiceClassification;

    /**
     * Gets the value of the expensesInvoiceClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expensesInvoiceClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpensesInvoiceClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceExpensesClassificationType }
     * 
     * 
     */
    public List<InvoiceExpensesClassificationType> getExpensesInvoiceClassification() {
        if (expensesInvoiceClassification == null) {
            expensesInvoiceClassification = new ArrayList<InvoiceExpensesClassificationType>();
        }
        return this.expensesInvoiceClassification;
    }

}
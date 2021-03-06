//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.02 at 03:58:23 PM EEST 
//


package org.model.xjc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="measurementUnit" type="{http://www.aade.gr/myDATA/invoice/v1.0}QuantityType" minOccurs="0"/>
 *         &lt;element name="invoiceDetailType" type="{http://www.aade.gr/myDATA/invoice/v1.0}InvoiceDetailType" minOccurs="0"/>
 *         &lt;element name="netValue" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType"/>
 *         &lt;element name="vatCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}VatType"/>
 *         &lt;element name="vatAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType"/>
 *         &lt;element name="vatExemptionCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}VatExemptionType" minOccurs="0"/>
 *         &lt;element name="dienergia" type="{http://www.aade.gr/myDATA/invoice/v1.0}ShipType" minOccurs="0"/>
 *         &lt;element name="discountOption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="withheldAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType" minOccurs="0"/>
 *         &lt;element name="withheldPercentCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}WithheldType" minOccurs="0"/>
 *         &lt;element name="stampDutyAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType" minOccurs="0"/>
 *         &lt;element name="stampDutyPercentCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}StampDutyType" minOccurs="0"/>
 *         &lt;element name="feesAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType" minOccurs="0"/>
 *         &lt;element name="feesPercentCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}FeesType" minOccurs="0"/>
 *         &lt;element name="otherTaxesPercentCategory" type="{http://www.aade.gr/myDATA/invoice/v1.0}OtherTaxesType" minOccurs="0"/>
 *         &lt;element name="otherTaxesAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType" minOccurs="0"/>
 *         &lt;element name="deductionsAmount" type="{http://www.aade.gr/myDATA/invoice/v1.0}AmountType" minOccurs="0"/>
 *         &lt;element name="lineComments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="150"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="incomeClassification" type="{https://www.aade.gr/myDATA/incomeClassificaton/v1.0}IncomeClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expensesClassification" type="{https://www.aade.gr/myDATA/expensesClassificaton/v1.0}ExpensesClassificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRowType", propOrder = {
    "lineNumber",
    "quantity",
    "measurementUnit",
    "invoiceDetailType",
    "netValue",
    "vatCategory",
    "vatAmount",
    "vatExemptionCategory",
    "dienergia",
    "discountOption",
    "withheldAmount",
    "withheldPercentCategory",
    "stampDutyAmount",
    "stampDutyPercentCategory",
    "feesAmount",
    "feesPercentCategory",
    "otherTaxesPercentCategory",
    "otherTaxesAmount",
    "deductionsAmount",
    "lineComments",
    "incomeClassification",
    "expensesClassification"
})
public class InvoiceRowType {

    protected int lineNumber;
    protected BigDecimal quantity;
    protected Integer measurementUnit;
    protected Integer invoiceDetailType;
    @XmlElement(required = true)
    protected BigDecimal netValue;
    protected int vatCategory;
    @XmlElement(required = true)
    protected BigDecimal vatAmount;
    protected Integer vatExemptionCategory;
    protected ShipType dienergia;
    protected Boolean discountOption;
    protected BigDecimal withheldAmount;
    protected Integer withheldPercentCategory;
    protected BigDecimal stampDutyAmount;
    protected Integer stampDutyPercentCategory;
    protected BigDecimal feesAmount;
    protected Integer feesPercentCategory;
    protected Integer otherTaxesPercentCategory;
    protected BigDecimal otherTaxesAmount;
    protected BigDecimal deductionsAmount;
    protected String lineComments;
    protected List<IncomeClassificationType> incomeClassification;
    protected List<ExpensesClassificationType> expensesClassification;

    /**
     * Gets the value of the lineNumber property.
     * 
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     */
    public void setLineNumber(int value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeasurementUnit(Integer value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the invoiceDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvoiceDetailType() {
        return invoiceDetailType;
    }

    /**
     * Sets the value of the invoiceDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvoiceDetailType(Integer value) {
        this.invoiceDetailType = value;
    }

    /**
     * Gets the value of the netValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetValue() {
        return netValue;
    }

    /**
     * Sets the value of the netValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetValue(BigDecimal value) {
        this.netValue = value;
    }

    /**
     * Gets the value of the vatCategory property.
     * 
     */
    public int getVatCategory() {
        return vatCategory;
    }

    /**
     * Sets the value of the vatCategory property.
     * 
     */
    public void setVatCategory(int value) {
        this.vatCategory = value;
    }

    /**
     * Gets the value of the vatAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    /**
     * Sets the value of the vatAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatAmount(BigDecimal value) {
        this.vatAmount = value;
    }

    /**
     * Gets the value of the vatExemptionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVatExemptionCategory() {
        return vatExemptionCategory;
    }

    /**
     * Sets the value of the vatExemptionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVatExemptionCategory(Integer value) {
        this.vatExemptionCategory = value;
    }

    /**
     * Gets the value of the dienergia property.
     * 
     * @return
     *     possible object is
     *     {@link ShipType }
     *     
     */
    public ShipType getDienergia() {
        return dienergia;
    }

    /**
     * Sets the value of the dienergia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipType }
     *     
     */
    public void setDienergia(ShipType value) {
        this.dienergia = value;
    }

    /**
     * Gets the value of the discountOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountOption() {
        return discountOption;
    }

    /**
     * Sets the value of the discountOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountOption(Boolean value) {
        this.discountOption = value;
    }

    /**
     * Gets the value of the withheldAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWithheldAmount() {
        return withheldAmount;
    }

    /**
     * Sets the value of the withheldAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWithheldAmount(BigDecimal value) {
        this.withheldAmount = value;
    }

    /**
     * Gets the value of the withheldPercentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWithheldPercentCategory() {
        return withheldPercentCategory;
    }

    /**
     * Sets the value of the withheldPercentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWithheldPercentCategory(Integer value) {
        this.withheldPercentCategory = value;
    }

    /**
     * Gets the value of the stampDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStampDutyAmount() {
        return stampDutyAmount;
    }

    /**
     * Sets the value of the stampDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStampDutyAmount(BigDecimal value) {
        this.stampDutyAmount = value;
    }

    /**
     * Gets the value of the stampDutyPercentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStampDutyPercentCategory() {
        return stampDutyPercentCategory;
    }

    /**
     * Sets the value of the stampDutyPercentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStampDutyPercentCategory(Integer value) {
        this.stampDutyPercentCategory = value;
    }

    /**
     * Gets the value of the feesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeesAmount() {
        return feesAmount;
    }

    /**
     * Sets the value of the feesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeesAmount(BigDecimal value) {
        this.feesAmount = value;
    }

    /**
     * Gets the value of the feesPercentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeesPercentCategory() {
        return feesPercentCategory;
    }

    /**
     * Sets the value of the feesPercentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeesPercentCategory(Integer value) {
        this.feesPercentCategory = value;
    }

    /**
     * Gets the value of the otherTaxesPercentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOtherTaxesPercentCategory() {
        return otherTaxesPercentCategory;
    }

    /**
     * Sets the value of the otherTaxesPercentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOtherTaxesPercentCategory(Integer value) {
        this.otherTaxesPercentCategory = value;
    }

    /**
     * Gets the value of the otherTaxesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherTaxesAmount() {
        return otherTaxesAmount;
    }

    /**
     * Sets the value of the otherTaxesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherTaxesAmount(BigDecimal value) {
        this.otherTaxesAmount = value;
    }

    /**
     * Gets the value of the deductionsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionsAmount() {
        return deductionsAmount;
    }

    /**
     * Sets the value of the deductionsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionsAmount(BigDecimal value) {
        this.deductionsAmount = value;
    }

    /**
     * Gets the value of the lineComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineComments() {
        return lineComments;
    }

    /**
     * Sets the value of the lineComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineComments(String value) {
        this.lineComments = value;
    }

    /**
     * Gets the value of the incomeClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomeClassificationType }
     * 
     * 
     */
    public List<IncomeClassificationType> getIncomeClassification() {
        if (incomeClassification == null) {
            incomeClassification = new ArrayList<IncomeClassificationType>();
        }
        return this.incomeClassification;
    }

    /**
     * Gets the value of the expensesClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expensesClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpensesClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpensesClassificationType }
     * 
     * 
     */
    public List<ExpensesClassificationType> getExpensesClassification() {
        if (expensesClassification == null) {
            expensesClassification = new ArrayList<ExpensesClassificationType>();
        }
        return this.expensesClassification;
    }

}

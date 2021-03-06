//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.02 at 03:58:23 PM EEST 
//


package org.model.xjc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomeClassificationCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncomeClassificationCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="category1_1"/>
 *     &lt;enumeration value="category1_2"/>
 *     &lt;enumeration value="category1_3"/>
 *     &lt;enumeration value="category1_4"/>
 *     &lt;enumeration value="category1_5"/>
 *     &lt;enumeration value="category1_6"/>
 *     &lt;enumeration value="category1_7"/>
 *     &lt;enumeration value="category1_8"/>
 *     &lt;enumeration value="category1_9"/>
 *     &lt;enumeration value="category1_10"/>
 *     &lt;enumeration value="category1_95"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncomeClassificationCategoryType", namespace = "https://www.aade.gr/myDATA/incomeClassificaton/v1.0")
@XmlEnum
public enum IncomeClassificationCategoryType {

    @XmlEnumValue("category1_1")
    CATEGORY_1_1("category1_1"),
    @XmlEnumValue("category1_2")
    CATEGORY_1_2("category1_2"),
    @XmlEnumValue("category1_3")
    CATEGORY_1_3("category1_3"),
    @XmlEnumValue("category1_4")
    CATEGORY_1_4("category1_4"),
    @XmlEnumValue("category1_5")
    CATEGORY_1_5("category1_5"),
    @XmlEnumValue("category1_6")
    CATEGORY_1_6("category1_6"),
    @XmlEnumValue("category1_7")
    CATEGORY_1_7("category1_7"),
    @XmlEnumValue("category1_8")
    CATEGORY_1_8("category1_8"),
    @XmlEnumValue("category1_9")
    CATEGORY_1_9("category1_9"),
    @XmlEnumValue("category1_10")
    CATEGORY_1_10("category1_10"),
    @XmlEnumValue("category1_95")
    CATEGORY_1_95("category1_95");
    private final String value;

    IncomeClassificationCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncomeClassificationCategoryType fromValue(String v) {
        for (IncomeClassificationCategoryType c: IncomeClassificationCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

# mydataAPI
myData Java API in JXB.
The Java API was created based on version 0.6 of the XSD schemas.

Follows the main code that produces an XML incvoice document
```java
package com.mycompany.mydatatest;

import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.model.xjc.*;

/**
 *
 * @author 
 */
public class AadeToXml {
    public static void main(String[] args) 
    {
        //Java object. We will convert it to XML.
       PartyType partyType=new PartyType();
       PartyType counterType=new PartyType();
       InvoiceHeaderType invoiceHeader=new InvoiceHeaderType();
       InvoiceRowType invoiceRow1=new InvoiceRowType();
       InvoiceRowType invoiceRow2=new InvoiceRowType();
       InvoiceSummaryType invoiceSummary=new InvoiceSummaryType();
       
       AadeBookInvoiceType aBit = new AadeBookInvoiceType();
       InvoicesDoc invoices=new InvoicesDoc();
       //
       XMLGregorianCalendar issueDate;
       Date dt=new Date();
       DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
       String strDate=dateFormat.format(dt);
       try {
        issueDate=DatatypeFactory.newInstance().newXMLGregorianCalendar(strDate);
       }
       catch (  DatatypeConfigurationException e) { throw new RuntimeException(e);}
       //
       partyType.setVatNumber("123456789");
       partyType.setBranch(0);
       //
       counterType.setVatNumber("999888777");
       counterType.setBranch(0);
       //
       invoiceHeader.setAa("0001");
       invoiceHeader.setSeries("A");
       invoiceHeader.setInvoiceType("2.1");
       invoiceHeader.setIssueDate(issueDate);
       invoiceHeader.setCurrency(CurrencyType.EUR);
       //1st Row
       invoiceRow1.setLineNumber(1);
       invoiceRow1.setVatCategory(1);
       invoiceRow1.setWithheldAmount(BigDecimal.valueOf(200.0));
       invoiceRow1.setNetValue(BigDecimal.valueOf(1000.0));
       invoiceRow1.setVatAmount(BigDecimal.valueOf(240.0));
       //2nd Row
       invoiceRow2.setLineNumber(2);
       invoiceRow2.setVatCategory(1);
       invoiceRow2.setWithheldAmount(BigDecimal.valueOf(200.0));
       invoiceRow2.setNetValue(BigDecimal.valueOf(1000.0));
       invoiceRow2.setVatAmount(BigDecimal.valueOf(240.0));       
       //
       invoiceSummary.setTotalVatAmount(BigDecimal.valueOf(480.0));
       invoiceSummary.setTotalNetValue(BigDecimal.valueOf(2000.0));
       invoiceSummary.setTotalWithheldAmount(BigDecimal.valueOf(400.0));
       invoiceSummary.setTotalGrossValue(BigDecimal.valueOf(4080.0));
       invoiceSummary.setTotalFeesAmount(BigDecimal.ZERO);
       //
       //AadeBook
       aBit.setCounterpart(counterType);
       aBit.setIssuer(partyType);
       aBit.setInvoiceHeader(invoiceHeader);
       aBit.getInvoiceDetails().add(invoiceRow1);
       aBit.getInvoiceDetails().add(invoiceRow2);
       aBit.setInvoiceSummary(invoiceSummary);
       //Add an AadeBook to Invoice
       invoices.getInvoice().add(aBit);
       //Serialize AADE data to XML (post BODY)
       jaxbObjectToXML(invoices);
    }
    
    private static void jaxbObjectToXML(InvoicesDoc invoice) 
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(InvoicesDoc.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("c://utils//InvoicesDocData.xml");
            jaxbMarshaller.marshal(invoice, file); 
        } 
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
```




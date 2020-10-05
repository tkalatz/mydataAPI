# mydataAPI
myData Java API in JXB.
The Java API was created based on version 0.6 of the XSD schemas.

Follows the main JAVA code of an example service invoice with 2 lines to produce an XML incvoice document, where org.model.xjc.* is the package that contains all mydata API classes.
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
        //Work with Java objects and serialize to XML
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

The output XML:
```
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<InvoicesDoc xmlns="http://www.aade.gr/myDATA/invoice/v1.0" xmlns:ns2="https://www.aade.gr/myDATA/incomeClassificaton/v1.0" xmlns:ns3="https://www.aade.gr/myDATA/expensesClassificaton/v1.0">
    <invoice>
        <issuer>
            <vatNumber>123456789</vatNumber>
            <branch>0</branch>
        </issuer>
        <counterpart>
            <vatNumber>999888777</vatNumber>
            <branch>0</branch>
        </counterpart>
        <invoiceHeader>
            <series>A</series>
            <aa>0001</aa>
            <issueDate>2020-10-05</issueDate>
            <invoiceType>2.1</invoiceType>
            <currency>EUR</currency>
        </invoiceHeader>
        <invoiceDetails>
            <lineNumber>1</lineNumber>
            <netValue>1000.0</netValue>
            <vatCategory>1</vatCategory>
            <vatAmount>240.0</vatAmount>
            <withheldAmount>200.0</withheldAmount>
        </invoiceDetails>
        <invoiceDetails>
            <lineNumber>2</lineNumber>
            <netValue>1000.0</netValue>
            <vatCategory>1</vatCategory>
            <vatAmount>240.0</vatAmount>
            <withheldAmount>200.0</withheldAmount>
        </invoiceDetails>
        <invoiceSummary>
            <totalNetValue>2000.0</totalNetValue>
            <totalVatAmount>480.0</totalVatAmount>
            <totalWithheldAmount>400.0</totalWithheldAmount>
            <totalFeesAmount>0</totalFeesAmount>
            <totalGrossValue>4080.0</totalGrossValue>
        </invoiceSummary>
    </invoice>
</InvoicesDoc>
```



//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.10 at 02:29:11 PM EET 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WlmwldataFindXML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WlmwldataFindXML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namedata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countrydata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tinnumberdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="blcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bltype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WlmwldataFindXML", propOrder = {
    "namedata",
    "countrydata",
    "tinnumberdata",
    "birthdate",
    "blcode",
    "bltype"
})
public class WlmwldataFindXML {

    protected String namedata;
    protected String countrydata;
    protected String tinnumberdata;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    protected String blcode;
    protected String bltype;

    /**
     * Gets the value of the namedata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamedata() {
        return namedata;
    }

    /**
     * Sets the value of the namedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamedata(String value) {
        this.namedata = value;
    }

    /**
     * Gets the value of the countrydata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrydata() {
        return countrydata;
    }

    /**
     * Sets the value of the countrydata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrydata(String value) {
        this.countrydata = value;
    }

    /**
     * Gets the value of the tinnumberdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinnumberdata() {
        return tinnumberdata;
    }

    /**
     * Sets the value of the tinnumberdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinnumberdata(String value) {
        this.tinnumberdata = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the blcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlcode() {
        return blcode;
    }

    /**
     * Sets the value of the blcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlcode(String value) {
        this.blcode = value;
    }

    /**
     * Gets the value of the bltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBltype() {
        return bltype;
    }

    /**
     * Sets the value of the bltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBltype(String value) {
        this.bltype = value;
    }

}

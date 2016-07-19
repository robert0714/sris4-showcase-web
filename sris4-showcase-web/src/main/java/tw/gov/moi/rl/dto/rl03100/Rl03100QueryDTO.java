/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto.rl03100;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * <p>
 * Java class for Rl03100QueryDTO complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Rl03100QueryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ris.iisigroup.com/ae/domain}risParamType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://ris.iisigroup.com/rl/domain}personIdType"/>
 *         &lt;element name="Range" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppId" type="{http://ris.iisigroup.com/rl/domain}personIdType"/>
 *         &lt;element name="RemoveYearFrom" type="{http://ris.iisigroup.com/ae/domain}risYearType"/>
 *         &lt;element name="RemoveYearTo" type="{http://ris.iisigroup.com/ae/domain}risYearType"/>
 *         &lt;element name="SiteId" type="{http://ris.iisigroup.com/rl/domain}siteIdType"/>
 *         &lt;element name="PartialNameList" type="{http://ris.iisigroup.com/rl/domain}nameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

/**
 * 31查詢參數DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100QueryDTO", propOrder = { "personId", "range", "appId", "removeYearFrom", "removeYearTo",
        "siteId", "partialNameList" })
@XmlRootElement(name = "Rl03100QueryDTO")
public class Rl03100QueryDTO implements Serializable {

    private final static long serialVersionUID = 1L;
    @FieldName("統號")
    @XmlElement(name = "PersonId", required = true)
    protected String personId;
    @FieldName("範圍")
    @XmlElement(name = "Range", required = true)
    protected String range;
    @FieldName("作業代碼")
    @XmlElement(name = "AppId", required = true)
    protected String appId;
    @FieldName("除戶年份起")
    @XmlElement(name = "RemoveYearFrom", required = true)
    protected BigInteger removeYearFrom;
    @FieldName("除戶年份迄")
    @XmlElement(name = "RemoveYearTo", required = true)
    protected BigInteger removeYearTo;
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    protected String siteId;
    @FieldName("部份成員清單")
    @XmlElement(name = "PartialNameList")
    protected List<String> partialNameList;

    /**
     * Gets the value of the personId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    public boolean isSetPersonId() {
        return (this.personId != null);
    }

    /**
     * Gets the value of the range property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRange(String value) {
        this.range = value;
    }

    public boolean isSetRange() {
        return (this.range != null);
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    public boolean isSetAppId() {
        return (this.appId != null);
    }

    /**
     * Gets the value of the removeYearFrom property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getRemoveYearFrom() {
        return removeYearFrom;
    }

    /**
     * Sets the value of the removeYearFrom property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setRemoveYearFrom(BigInteger value) {
        this.removeYearFrom = value;
    }

    public boolean isSetRemoveYearFrom() {
        return (this.removeYearFrom != null);
    }

    /**
     * Gets the value of the removeYearTo property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getRemoveYearTo() {
        return removeYearTo;
    }

    /**
     * Sets the value of the removeYearTo property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setRemoveYearTo(BigInteger value) {
        this.removeYearTo = value;
    }

    public boolean isSetRemoveYearTo() {
        return (this.removeYearTo != null);
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    public boolean isSetSiteId() {
        return (this.siteId != null);
    }

    /**
     * Gets the value of the partialNameList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the partialNameList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPartialNameList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getPartialNameList() {
        if (partialNameList == null) {
            partialNameList = new ArrayList<String>();
        }
        return this.partialNameList;
    }

    public boolean isSetPartialNameList() {
        return ((this.partialNameList != null) && (!this.partialNameList.isEmpty()));
    }

    public void unsetPartialNameList() {
        this.partialNameList = null;
    }

}

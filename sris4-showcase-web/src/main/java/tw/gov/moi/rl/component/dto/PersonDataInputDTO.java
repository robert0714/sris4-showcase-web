/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.InputDateDTO;
import tw.gov.moi.rl.domain.InputTimeDTO;

/**
 * PersonKeyDTO。.
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDataIdDTO", propOrder = { "personId", "siteId", "removeYyymmdd", "removeTime",
        "applyRelationship", "inputDateDTO", "inputTimeDTO", "computerizedPredecessor", "personName", "street" })
@XmlRootElement(name = "PersonDataInputDTO")
public class PersonDataInputDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 除戶日期. */
    @XmlElement(name = "removeYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /** 申請人與當事人關係. */
    @XmlElement(name = "ApplyRelationship", required = true)
    @FieldName("申請人與當事人關係")
    private String applyRelationship;

    /** 除戶日期年月日. */
    @XmlElement(name = "InputDateDTO", required = true)
    @FieldName("除戶日期年月日")
    private InputDateDTO inputDateDTO = new InputDateDTO();

    /** 除戶時間時分秒. */
    @XmlElement(name = "InputTimeDTO", required = true)
    @FieldName("除戶時間時分秒")
    private InputTimeDTO inputTimeDTO = new InputTimeDTO();

    /** 是否為電腦化前人口. */
    @XmlElement(name = "ComputerizedPredecessor", required = true)
    @FieldName("是否為電腦化前人口")
    private boolean computerizedPredecessor = false;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 街路門牌. */
    @XmlElement(name = "Street")
    @FieldName("街路門牌")
    private String street;

    /**
     * Instantiates a new person data input dto.
     */
    public PersonDataInputDTO() {
        super();
    }

    /**
     * Instantiates a new person data input dto.
     * 
     * @param personID
     *            the person id
     * @param areaCode
     *            the area code
     */
    public PersonDataInputDTO(final String personID, String areaCode) {
        super();
        this.personId = personID;
        this.siteId = areaCode;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personID
     *            the new person id
     */
    public void setPersonId(final String personID) {
        this.personId = personID;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the removes the yyymmdd.
     * 
     * @return the removes the yyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * Sets the removes the yyymmdd.
     * 
     * @param removeYyymmdd
     *            the new removes the yyymmdd
     */
    public void setRemoveYyymmdd(final String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * Gets the removes the time.
     * 
     * @return the removes the time
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * Sets the removes the time.
     * 
     * @param removeTime
     *            the new removes the time
     */
    public void setRemoveTime(final String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * Gets the apply relationship.
     * 
     * @return the apply relationship
     */
    public String getApplyRelationship() {
        return applyRelationship;
    }

    /**
     * Sets the apply relationship.
     * 
     * @param applyRelationship
     *            the new apply relationship
     */
    public void setApplyRelationship(final String applyRelationship) {
        this.applyRelationship = applyRelationship;
    }

    /**
     * Gets the input date dto.
     * 
     * @return the input date dto
     */
    public InputDateDTO getInputDateDTO() {
        return inputDateDTO;
    }

    /**
     * Sets the input date dto.
     * 
     * @param inputDateDTO
     *            the new input date dto
     */
    public void setInputDateDTO(final InputDateDTO inputDateDTO) {
        this.inputDateDTO = inputDateDTO;
    }

    /**
     * Gets the input time dto.
     * 
     * @return the input time dto
     */
    public InputTimeDTO getInputTimeDTO() {
        return inputTimeDTO;
    }

    /**
     * Sets the input time dto.
     * 
     * @param inputTimeDTO
     *            the new input time dto
     */
    public void setInputTimeDTO(final InputTimeDTO inputTimeDTO) {
        this.inputTimeDTO = inputTimeDTO;
    }

    /**
     * Checks if is computerized predecessor.
     * 
     * @return true, if is computerized predecessor
     */
    public boolean isComputerizedPredecessor() {
        return computerizedPredecessor;
    }

    /**
     * Sets the computerized predecessor.
     * 
     * @param computerizedPredecessor
     *            the new computerized predecessor
     */
    public void setComputerizedPredecessor(final boolean computerizedPredecessor) {
        this.computerizedPredecessor = computerizedPredecessor;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    /**
     * Gets the street.
     * 
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     * 
     * @param street
     *            the new street
     */
    public void setStreet(final String street) {
        this.street = street;
    }
}
/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 撤銷廢止戶籍登記-撤銷廢止戶籍者DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unDelPersonDataObject", propOrder = { "unDelPersonData", "householdState", "personRole", "orgEducationMark", "educationName", "livingStyleCodeName", "livingRaceTypeName", "finishFlag", "cancelFlag" })
@XmlRootElement(name = "UnDelPersonDataObject")
public class UnDelPersonDataObject implements Serializable {

    /** serialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 撤銷廢止戶籍者. */
    @XmlElement(name = "UnDelPersonData", required = true)
    @FieldName("撤銷廢止戶籍者")
    private XLDFPersonDataDomainObject unDelPersonData;

    /** 撤銷廢止戶籍者-戶籍簿頁狀態（M現戶）、（H除戶）、（T暫存）. */
    @XmlElement(name = "HouseholdState", required = true)
    @FieldName("撤銷廢止戶籍者-戶籍簿頁狀態（M現戶）、（H除戶）、（T暫存）")
    private String householdState;

    /** 身分角色. */
    @XmlElement(name = "PersonRole", required = true)
    @FieldName("身分角色")
    private String personRole;

    /** 原教育程度註記. */
    @XmlElement(name = "OrgEducationMark", required = true)
    @FieldName("原教育程度註記")
    private String orgEducationMark;

    /** 教育程度名稱. */
    @XmlElement(name = "EducationName", required = true)
    @FieldName("教育程度名稱")
    private String educationName;

    /** 原住民身分名稱. */
    @XmlElement(name = "LivingStyleCodeName", required = true)
    @FieldName("原住民身分名稱")
    private String livingStyleCodeName;

    /** 族別名稱. */
    @XmlElement(name = "LivingRaceTypeName", required = true)
    @FieldName("族別名稱")
    private String livingRaceTypeName;

    /** 完成個人狀態. */
    @XmlElement(name = "FinishFlag", required = true)
    @FieldName("完成個人狀態")
    private boolean finishFlag;

    /** 刪除旗標. */
    @XmlElement(name = "CancelFlag", required = true)
    @FieldName("刪除旗標")
    private boolean cancelFlag;

    /**
     * Gets the un del person data.
     * 
     * @return the un del person data
     */
    public XLDFPersonDataDomainObject getUnDelPersonData() {
        return unDelPersonData;
    }

    /**
     * Sets the un del person data.
     * 
     * @param unDelPersonData
     *            the new un del person data
     */
    public void setUnDelPersonData(final XLDFPersonDataDomainObject unDelPersonData) {
        this.unDelPersonData = unDelPersonData;
    }

    /**
     * Gets the household state.
     * 
     * @return the household state
     */
    public String getHouseholdState() {
        return householdState;
    }

    /**
     * Sets the household state.
     * 
     * @param householdState
     *            the new household state
     */
    public void setHouseholdState(final String householdState) {
        this.householdState = householdState;
    }

    /**
     * Gets the person role.
     * 
     * @return the person role
     */
    public String getPersonRole() {
        return personRole;
    }

    /**
     * Sets the person role.
     * 
     * @param personRole
     *            the new person role
     */
    public void setPersonRole(final String personRole) {
        this.personRole = personRole;
    }

    /**
     * Gets the org education mark.
     * 
     * @return the org education mark
     */
    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    /**
     * Sets the org education mark.
     * 
     * @param orgEducationMark
     *            the new org education mark
     */
    public void setOrgEducationMark(final String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    /**
     * Gets the education name.
     * 
     * @return the education name
     */
    public String getEducationName() {
        return educationName;
    }

    /**
     * Sets the education name.
     * 
     * @param educationName
     *            the new education name
     */
    public void setEducationName(final String educationName) {
        this.educationName = educationName;
    }

    /**
     * Gets the living style code name.
     * 
     * @return the living style code name
     */
    public String getLivingStyleCodeName() {
        return livingStyleCodeName;
    }

    /**
     * Sets the living style code name.
     * 
     * @param livingStyleCodeName
     *            the new living style code name
     */
    public void setLivingStyleCodeName(final String livingStyleCodeName) {
        this.livingStyleCodeName = livingStyleCodeName;
    }

    /**
     * Gets the living race type name.
     * 
     * @return the living race type name
     */
    public String getLivingRaceTypeName() {
        return livingRaceTypeName;
    }

    /**
     * Sets the living race type name.
     * 
     * @param livingRaceTypeName
     *            the new living race type name
     */
    public void setLivingRaceTypeName(final String livingRaceTypeName) {
        this.livingRaceTypeName = livingRaceTypeName;
    }

    /**
     * Checks if is finish flag.
     * 
     * @return true, if is finish flag
     */
    public boolean isFinishFlag() {
        return finishFlag;
    }

    /**
     * Sets the finish flag.
     * 
     * @param finishFlag
     *            the new finish flag
     */
    public void setFinishFlag(final boolean finishFlag) {
        this.finishFlag = finishFlag;
    }

    /**
     * Checks if is cancel flag.
     * 
     * @return true, if is cancel flag
     */
    public boolean isCancelFlag() {
        return cancelFlag;
    }

    /**
     * Sets the cancel flag.
     * 
     * @param cancelFlag
     *            the new cancel flag
     */
    public void setCancelFlag(final boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

}

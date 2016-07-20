/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl02c40DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02c40DTO", propOrder = { "personIdArray", "personId", "applyYyymmdd", "commPersonId", "commSiteId",
        "cellPhoneNumber", "resultList", "householdHeadId", "householdId", "applyPersonId", "applySiteId",
        "commRldf004mType", "commRldf001mType", "applyRldf004mType", "applyRldf001mType", "commPersonName",
        "commAdminOfficeCode", "reportUrl", "sendEmailList" })
@XmlRootElement(name = "Rl02c40DTO")
public class Rl02c40DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號(多個). */
    @XmlElement(name = "PersonIdArray")
    @FieldName("國民身分證統一編號(多個)")
    private String[] personIdArray = new String[9];

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 受委託人統號. */
    @XmlElement(name = "CommPersonId")
    @FieldName("受委託人統號")
    private String commPersonId = "";

    /** 受委託人作業點代碼. */
    @XmlElement(name = "CommSiteId")
    @FieldName("受委託人作業點代碼")
    private String commSiteId = "";

    /** 聯絡電話. */
    @XmlElement(name = "CellPhoneNumber")
    @FieldName("聯絡電話")
    private String cellPhoneNumber = "";

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl02c40ResultDTO> resultList = new ArrayList<Rl02c40ResultDTO>();

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 申請人統號. */
    @XmlElement(name = "ApplyPersonId")
    @FieldName("申請人統號")
    private String applyPersonId = "";

    /** 申請人作業點代碼. */
    @XmlElement(name = "ApplySiteId")
    @FieldName("申請人作業點代碼")
    private String applySiteId = "";

    /** 受委託人Rldf004m. */
    @XmlElement(name = "CommRldf004mType")
    @FieldName("受委託人Rldf004m")
    private Rldf004mType commRldf004mType;

    /** 受委託人Rldf001m. */
    @XmlElement(name = "CommRldf001mType")
    @FieldName("受委託人Rldf001m")
    private Rldf001mType commRldf001mType;

    /** 申請人Rldf004m. */
    @XmlElement(name = "ApplyRldf004mType")
    @FieldName("申請人Rldf004m")
    private Rldf004mType applyRldf004mType;

    /** 申請人Rldf001m. */
    @XmlElement(name = "ApplyRldf001mType")
    @FieldName("申請人Rldf001m")
    private Rldf001mType applyRldf001mType;

    /** 受委託人姓名. */
    @XmlElement(name = "CommPersonName")
    @FieldName("受委託人姓名")
    private String commPersonName = "";

    /** 受委託人戶所代碼. */
    @XmlElement(name = "CommAdminOfficeCode")
    @FieldName("受委託人戶所代碼")
    private String commAdminOfficeCode = "";

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /** 寄發電子郵件清單. */
    @XmlElement(name = "SendEmailList")
    @FieldName("寄發電子郵件清單")
    private List<Rldf004mType> sendEmailList = new ArrayList<Rldf004mType>();

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
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the comm person id.
     * 
     * @return the comm person id
     */
    public String getCommPersonId() {
        return commPersonId;
    }

    /**
     * Sets the comm person id.
     * 
     * @param commPersonId
     *            the new comm person id
     */
    public void setCommPersonId(String commPersonId) {
        this.commPersonId = commPersonId;
    }

    /**
     * Gets the comm site id.
     * 
     * @return the comm site id
     */
    public String getCommSiteId() {
        return commSiteId;
    }

    /**
     * Sets the comm site id.
     * 
     * @param CommSiteId
     *            the new comm site id
     */
    public void setCommSiteId(String CommSiteId) {
        this.commSiteId = CommSiteId;
    }

    /**
     * Gets the cell phone number.
     * 
     * @return the cell phone number
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the cell phone number.
     * 
     * @param cellPhoneNumber
     *            the new cell phone number
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl02c40ResultDTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl02c40ResultDTO> resultList) {
        this.resultList = resultList;
    }

    /**
     * Gets the person id array.
     * 
     * @return the person id array
     */
    public String[] getPersonIdArray() {
        return personIdArray;
    }

    /**
     * Sets the person id array.
     * 
     * @param personIdArray
     *            the new person id array
     */
    public void setPersonIdArray(String[] personIdArray) {
        this.personIdArray = personIdArray;
    }

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl02c40DTO [personIdArray=" + Arrays.toString(personIdArray) + ", personId=" + personId
                + ", applyYyymmdd=" + applyYyymmdd + ", commPersonId=" + commPersonId + ", commSiteId=" + commSiteId
                + ", cellPhoneNumber=" + cellPhoneNumber + ", resultList=" + resultList + ", householdHeadId="
                + householdHeadId + ", householdId=" + householdId + ", applyPersonId=" + applyPersonId
                + ", applySiteId=" + applySiteId + "]";
    }

    /**
     * Gets the apply person id.
     * 
     * @return the apply person id
     */
    public String getApplyPersonId() {
        return applyPersonId;
    }

    /**
     * Sets the apply person id.
     * 
     * @param applyPersonId
     *            the new apply person id
     */
    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    /**
     * Gets the apply site id.
     * 
     * @return the apply site id
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * Sets the apply site id.
     * 
     * @param applySiteId
     *            the new apply site id
     */
    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    /**
     * Gets the comm rldf004m type.
     * 
     * @return the comm rldf004m type
     */
    public Rldf004mType getCommRldf004mType() {
        return commRldf004mType;
    }

    /**
     * Sets the comm rldf004m type.
     * 
     * @param commRldf004mType
     *            the new comm rldf004m type
     */
    public void setCommRldf004mType(Rldf004mType commRldf004mType) {
        this.commRldf004mType = commRldf004mType;
    }

    /**
     * Gets the comm rldf001m type.
     * 
     * @return the comm rldf001m type
     */
    public Rldf001mType getCommRldf001mType() {
        return commRldf001mType;
    }

    /**
     * Sets the comm rldf001m type.
     * 
     * @param commRldf001mType
     *            the new comm rldf001m type
     */
    public void setCommRldf001mType(Rldf001mType commRldf001mType) {
        this.commRldf001mType = commRldf001mType;
    }

    /**
     * Gets the apply rldf004m type.
     * 
     * @return the apply rldf004m type
     */
    public Rldf004mType getApplyRldf004mType() {
        return applyRldf004mType;
    }

    /**
     * Sets the apply rldf004m type.
     * 
     * @param applyRldf004mType
     *            the new apply rldf004m type
     */
    public void setApplyRldf004mType(Rldf004mType applyRldf004mType) {
        this.applyRldf004mType = applyRldf004mType;
    }

    /**
     * Gets the apply rldf001m type.
     * 
     * @return the apply rldf001m type
     */
    public Rldf001mType getApplyRldf001mType() {
        return applyRldf001mType;
    }

    /**
     * Sets the apply rldf001m type.
     * 
     * @param applyRldf001mType
     *            the new apply rldf001m type
     */
    public void setApplyRldf001mType(Rldf001mType applyRldf001mType) {
        this.applyRldf001mType = applyRldf001mType;
    }

    /**
     * Gets the comm person name.
     * 
     * @return the comm person name
     */
    public String getCommPersonName() {
        return commPersonName;
    }

    /**
     * Sets the comm person name.
     * 
     * @param commPersonName
     *            the new comm person name
     */
    public void setCommPersonName(String commPersonName) {
        this.commPersonName = commPersonName;
    }

    /**
     * Gets the comm admin office code.
     * 
     * @return the comm admin office code
     */
    public String getCommAdminOfficeCode() {
        return commAdminOfficeCode;
    }

    /**
     * Sets the comm admin office code.
     * 
     * @param commAdminOfficeCode
     *            the new comm admin office code
     */
    public void setCommAdminOfficeCode(String commAdminOfficeCode) {
        this.commAdminOfficeCode = commAdminOfficeCode;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public List<Rldf004mType> getSendEmailList() {
        return sendEmailList;
    }

    public void setSendEmailList(List<Rldf004mType> sendEmailList) {
        this.sendEmailList = sendEmailList;
    }

}

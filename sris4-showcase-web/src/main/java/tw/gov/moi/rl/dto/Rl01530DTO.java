/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.RlWarningMessage;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 印鑑廢止登記 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01530DTO", propOrder = { "openingOperationDTO", "personData", "houseHeadData", "householdData",
        "sealNumber", "sealApplYyymmdd", "registerContent", "sealReason", "fee", "systemDate", "systemTime",
        "crossSiteEnabled", "applyPerson1", "applyPerson1Relationship", "applyPerson2", "applyPerson2Relationship",
        "delegated", "certificate", "otherCertificateStatus", "otherCertificate", "acceptSiteId" })
@XmlRootElement(name = "Rl01530DTO")
public class Rl01530DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** The OpeningOperationDTO. */
    @XmlElement(name = "openingOperationDTO", required = true)
    @FieldName("OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 個人基本資料. */
    @XmlElement(name = "PersonData", required = true)
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /** 戶長基本資料. */
    @XmlElement(name = "HouseHeadData", required = true)
    @FieldName("戶長個人基本資料")
    private XLDFPersonDataDomainObject houseHeadData;

    /** 個人基本資料. */
    @XmlElement(name = "HouseholdData", required = true)
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject householdData;

    /** 印登字號. */
    @XmlElement(name = "SealNumber", required = true)
    @FieldName("印登字號")
    private String sealNumber;

    /** 廢止日期. */
    @XmlElement(name = "SealApplYyymmdd", required = true)
    @FieldName("廢止日期")
    private String sealApplYyymmdd;

    /** 備註. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 廢止原因. */
    @XmlElement(name = "SealReason", required = true)
    @FieldName("廢止原因")
    private String sealReason;

    /** 規費. */
    @XmlElement(name = "Fee", required = true)
    @FieldName("規費")
    private String fee;

    /** 系統日期. */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 是否可異地辦理. */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** 申請人1 */
    @XmlElement(name = "ApplyPerson1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyPerson1 = new XLDFApplicantDataDTO();

    /** 申請人1-與當事人關係. */
    @XmlElement(name = "ApplyPerson1Relationship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String applyPerson1Relationship;

    /** 申請人2 */
    @XmlElement(name = "ApplyPerson2", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applyPerson2 = new XLDFApplicantDataDTO();

    /** 申請人2-與當事人關係. */
    @XmlElement(name = "ApplyPerson2Relationship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String applyPerson2Relationship;

    /** 受委託人 */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 附繳證件. */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("附繳證件")
    private List<String> certificate;

    /** 顯示其他附繳證件輸入欄位與否 */
    @XmlElement(name = "OtherCertificateStatus", required = true)
    @FieldName("顯示其他附繳證件輸入欄位與否")
    private String otherCertificateStatus;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其他附繳證件")
    private String otherCertificate;

    @XmlElement(name = "warningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 列印資料-法定代理人統號1. */
    @XmlElement(name = "CommId1")
    @FieldName("列印法定代理人統號1")
    private String commId1;
    /** 列印資料-法定代理人姓名1. */
    @XmlElement(name = "CommName1")
    @FieldName("列印法定代理人姓名1")
    private String commName1;

    /** 列印資料-法定代理人統號2. */
    @XmlElement(name = "CommId2")
    @FieldName("列印法定代理人統號2")
    private String commId2;
    /** 列印資料-法定代理人姓名2. */
    @XmlElement(name = "CommName2")
    @FieldName("列印法定代理人姓名2")
    private String commName2;
    
    
  //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 規費
    @XmlElement(name = "receiptId")
    @FieldName("收據號碼")
    private String receiptId;
    @XmlElement(name = "feeAmount")
    @FieldName("規費")
    private String feeAmount;
    @XmlElement(name = "freeReason")
    @FieldName("免收規費代碼")
    private String freeReason;
    @XmlElement(name = "otherFreeReason")
    @FieldName("免收規費原因")
    private String otherFreeReason;
    
    @XmlElement(name = "feeList")
    @FieldName("規費資料")
    private List<Rldfu001Type> feeList;
    @XmlElement(name = "feeSelect")
    @FieldName("規費選擇")
    private Rldfu001Type feeSelect;
    
    @XmlElement(name = "feeCode")
    @FieldName("規費選擇")
    private String feeCode;
    
    @XmlElement(name = "copies")
    @FieldName("份數")
    private String copies = "1";
    
    @XmlElement(name = "selectFree")
    @FieldName("是否免費")
    private String selectFree = "N";
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    
    @XmlElement(name = "cancelAgent1")
    @FieldName("取消法定代理人1")
    private boolean cancelAgent1;
    
    @XmlElement(name = "cancelAgent2")
    @FieldName("取消法定代理人2")
    private boolean cancelAgent2;
    
    @XmlElement(name = "acceptSiteId")
    @FieldName("受理地代碼")
    private String acceptSiteId;
    
    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public boolean isCancelAgent1() {
        return cancelAgent1;
    }

    public void setCancelAgent1(boolean cancelAgent1) {
        this.cancelAgent1 = cancelAgent1;
    }

    public boolean isCancelAgent2() {
        return cancelAgent2;
    }

    public void setCancelAgent2(boolean cancelAgent2) {
        this.cancelAgent2 = cancelAgent2;
    }

    public void setFeeList(List<Rldfu001Type> feeList) {
        this.feeList = feeList;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public Rldfu001Type getFeeSelect() {
        return feeSelect;
    }

    public void setFeeSelect(Rldfu001Type feeSelect) {
        this.feeSelect = feeSelect;
    }

    public List<Rldfu001Type> getFeeList() {
        return feeList;
    }

    public String getCommId1() {
        return commId1;
    }

    public void setCommId1(String commId1) {
        this.commId1 = commId1;
    }

    public String getCommName1() {
        return commName1;
    }

    public void setCommName1(String commName1) {
        this.commName1 = commName1;
    }

    public String getCommId2() {
        return commId2;
    }

    public void setCommId2(String commId2) {
        this.commId2 = commId2;
    }

    public String getCommName2() {
        return commName2;
    }

    public void setCommName2(String commName2) {
        this.commName2 = commName2;
    }

    /**
     * @return the openingOperationDTO
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * @param openingOperationDTO
     *            the openingOperationDTO to set
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * @return the personData
     */
    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    /**
     * @return the houseHeadData
     */
    public XLDFPersonDataDomainObject getHouseHeadData() {
        return houseHeadData;
    }

    /**
     * @param houseHeadData
     *            the houseHeadData to set
     */
    public void setHouseHeadData(XLDFPersonDataDomainObject houseHeadData) {
        this.houseHeadData = houseHeadData;
    }

    /**
     * @return the householdData
     */
    public XLDFHouseholdDataDomainObject getHouseholdData() {
        return householdData;
    }

    /**
     * @param householdData
     *            the householdData to set
     */
    public void setHouseholdData(XLDFHouseholdDataDomainObject householdData) {
        this.householdData = householdData;
    }

    /**
     * @return the sealNumber
     */
    public String getSealNumber() {
        return sealNumber;
    }

    /**
     * @param sealNumber
     *            the sealNumber to set
     */
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    /**
     * @return the sealApplYyymmdd
     */
    public String getSealApplYyymmdd() {
        return sealApplYyymmdd;
    }

    /**
     * @param sealApplYyymmdd
     *            the sealApplYyymmdd to set
     */
    public void setSealApplYyymmdd(String sealApplYyymmdd) {
        this.sealApplYyymmdd = sealApplYyymmdd;
    }

    /**
     * @return the registerContent
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * @param registerContent
     *            the registerContent to set
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * @return the sealReason
     */
    public String getSealReason() {
        return sealReason;
    }

    /**
     * @param sealReason
     *            the sealReason to set
     */
    public void setSealReason(String sealReason) {
        this.sealReason = sealReason;
    }

    /**
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * @param fee
     *            the fee to set
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * @return the systemDate
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * @param systemDate
     *            the systemDate to set
     */
    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * @return the systemTime
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * @param systemTime
     *            the systemTime to set
     */
    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * @return the crossSiteEnabled
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * @param crossSiteEnabled
     *            the crossSiteEnabled to set
     */
    public void setCrossSiteEnabled(boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * @return the applyPerson1
     */
    public XLDFApplicantDataDTO getApplyPerson1() {
        return applyPerson1;
    }

    /**
     * @param applyPerson1
     *            the applyPerson1 to set
     */
    public void setApplyPerson1(XLDFApplicantDataDTO applyPerson1) {
        this.applyPerson1 = applyPerson1;
    }

    /**
     * @return the applyPerson1Relationship
     */
    public String getApplyPerson1Relationship() {
        return applyPerson1Relationship;
    }

    /**
     * @param applyPerson1Relationship
     *            the applyPerson1Relationship to set
     */
    public void setApplyPerson1Relationship(String applyPerson1Relationship) {
        this.applyPerson1Relationship = applyPerson1Relationship;
    }

    /**
     * @return the applyPerson2
     */
    public XLDFApplicantDataDTO getApplyPerson2() {
        return applyPerson2;
    }

    /**
     * @param applyPerson2
     *            the applyPerson2 to set
     */
    public void setApplyPerson2(XLDFApplicantDataDTO applyPerson2) {
        this.applyPerson2 = applyPerson2;
    }

    /**
     * @return the applyPerson2Relationship
     */
    public String getApplyPerson2Relationship() {
        return applyPerson2Relationship;
    }

    /**
     * @param applyPerson2Relationship
     *            the applyPerson2Relationship to set
     */
    public void setApplyPerson2Relationship(String applyPerson2Relationship) {
        this.applyPerson2Relationship = applyPerson2Relationship;
    }

    /**
     * @return the delegated
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * @param delegated
     *            the delegated to set
     */
    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * @return the certificate
     */
    public List<String> getCertificate() {
        return certificate;
    }

    /**
     * @param certificate
     *            the certificate to set
     */
    public void setCertificate(List<String> certificate) {
        this.certificate = certificate;
    }

    /**
     * @return the otherCertificateStatus
     */
    public String getOtherCertificateStatus() {
        return otherCertificateStatus;
    }

    /**
     * @param otherCertificateStatus
     *            the otherCertificateStatus to set
     */
    public void setOtherCertificateStatus(String otherCertificateStatus) {
        this.otherCertificateStatus = otherCertificateStatus;
    }

    /**
     * @return the otherCertificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * @param otherCertificate
     *            the otherCertificate to set
     */
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }
       
    public String getSelectFree() {
        return selectFree;
    }

    public void setSelectFree(String selectFree) {
        this.selectFree = selectFree;
    }

	public String getAcceptSiteId() {
		return acceptSiteId;
	}

	public void setAcceptSiteId(String acceptSiteId) {
		this.acceptSiteId = acceptSiteId;
	}
}

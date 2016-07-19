/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 更正全戶記事申請資料 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01120AppDataDTO", propOrder = { "isHouseholdHead", "registerYyymmdd", "registerHhmmss",
        "acceptAdminOfficeCode", "beforeRegisterContent", "afterRegisterContent", "updateYyymmdd", "updateReason",
        "mainType", "subType", "reasonCode", "remark", "backupUpdateYyymmdd", "attachments", "otherCertificate",
        "backupUpdateReason", "backupAfterRegisterContent", "bakcupRemark" })
@XmlRootElement(name = "Rl01120AppDataDTO")
public class Rl01120AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 是否為戶長. */
    @XmlElement(name = "IsHouseholdHead")
    @FieldName("是否為戶長")
    private boolean isHouseholdHead = Boolean.FALSE;

    /** 登記日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("登記日期")
    private String registerYyymmdd = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterHhmmss")
    @FieldName("登記時間")
    private String registerHhmmss = "";

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode = "";

    /** 原事項. */
    @XmlElement(name = "BeforeRegisterContent")
    @FieldName("原事項")
    private String beforeRegisterContent = "";

    /** 更正事項. */
    @XmlElement(name = "AfterRegisterContent")
    @FieldName("更正事項")
    private String afterRegisterContent = "";

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd = "";

    /** 更正原因. */
    @XmlElement(name = "UpdateReason")
    @FieldName("更正原因")
    private String updateReason = "";

    /** 主分類. */
    @XmlElement(name = "MainType")
    @FieldName("主分類")
    private String mainType = "";

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類")
    private String subType = "";

    /** 記事代碼. */
    @XmlElement(name = "ReasonCode")
    @FieldName("記事代碼")
    private String reasonCode = "";

    /** 申請書備註. */
    @XmlElement(name = "Remark")
    @FieldName("申請書備註")
    private String remark = "";

    /** 更正日期備份. */
    @XmlElement(name = "BackupUpdateYyymmdd")
    @FieldName("更正日期備份")
    private String backupUpdateYyymmdd = "";

    /** 附送證件. */
    @XmlElement(name = "CertificateList")
    @FieldName("附送證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附送證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附送證件")
    private String otherCertificate = "";

    /** 更正原因備份. */
    @XmlElement(name = "BackupUpdateReason")
    @FieldName("更正原因備份")
    private String backupUpdateReason = "";

    /** 更正事項備份. */
    @XmlElement(name = "BackupAfterRegisterContent")
    @FieldName("更正事項備份")
    private String backupAfterRegisterContent = "";

    /** 備註備份. */
    @XmlElement(name = "BakcupRemark")
    @FieldName("備註備份")
    private String bakcupRemark = "";

    /**
     * Checks if is household head.
     * 
     * @return true, if is household head
     */
    public boolean isHouseholdHead() {
        return isHouseholdHead;
    }

    /**
     * Sets the household head.
     * 
     * @param isHouseholdHead
     *            the new household head
     */
    public void setHouseholdHead(boolean isHouseholdHead) {
        this.isHouseholdHead = isHouseholdHead;
    }

    /**
     * Gets the register yyymmdd.
     * 
     * @return the register yyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * Sets the register yyymmdd.
     * 
     * @param registerYyymmdd
     *            the new register yyymmdd
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * Gets the register hhmmss.
     * 
     * @return the register hhmmss
     */
    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    /**
     * Sets the register hhmmss.
     * 
     * @param registerHhmmss
     *            the new register hhmmss
     */
    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the before register content.
     * 
     * @return the before register content
     */
    public String getBeforeRegisterContent() {
        return beforeRegisterContent;
    }

    /**
     * Sets the before register content.
     * 
     * @param beforeRegisterContent
     *            the new before register content
     */
    public void setBeforeRegisterContent(String beforeRegisterContent) {
        this.beforeRegisterContent = beforeRegisterContent;
    }

    /**
     * Gets the after register content.
     * 
     * @return the after register content
     */
    public String getAfterRegisterContent() {
        return afterRegisterContent;
    }

    /**
     * Sets the after register content.
     * 
     * @param afterRegisterContent
     *            the new after register content
     */
    public void setAfterRegisterContent(String afterRegisterContent) {
        this.afterRegisterContent = afterRegisterContent;
    }

    /**
     * Gets the update yyymmdd.
     * 
     * @return the update yyymmdd
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * Sets the update yyymmdd.
     * 
     * @param updateYyymmdd
     *            the new update yyymmdd
     */
    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the update reason.
     * 
     * @return the update reason
     */
    public String getUpdateReason() {
        return updateReason;
    }

    /**
     * Sets the update reason.
     * 
     * @param updateReason
     *            the new update reason
     */
    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    /**
     * Gets the main type.
     * 
     * @return the main type
     */
    public String getMainType() {
        return mainType;
    }

    /**
     * Sets the main type.
     * 
     * @param mainType
     *            the new main type
     */
    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    /**
     * Gets the sub type.
     * 
     * @return the sub type
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the sub type.
     * 
     * @param subType
     *            the new sub type
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * Gets the reason code.
     * 
     * @return the reason code
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the reason code.
     * 
     * @param reasonCode
     *            the new reason code
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Gets the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the remark.
     * 
     * @param remark
     *            the new remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets the backup update yyymmdd.
     * 
     * @return the backup update yyymmdd
     */
    public String getBackupUpdateYyymmdd() {
        return backupUpdateYyymmdd;
    }

    /**
     * Sets the backup update yyymmdd.
     * 
     * @param backupUpdateYyymmdd
     *            the new backup update yyymmdd
     */
    public void setBackupUpdateYyymmdd(String backupUpdateYyymmdd) {
        this.backupUpdateYyymmdd = backupUpdateYyymmdd;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the backup update reason.
     * 
     * @return the backup update reason
     */
    public String getBackupUpdateReason() {
        return backupUpdateReason;
    }

    /**
     * Sets the backup update reason.
     * 
     * @param backupUpdateReason
     *            the new backup update reason
     */
    public void setBackupUpdateReason(String backupUpdateReason) {
        this.backupUpdateReason = backupUpdateReason;
    }

    /**
     * Gets the backup after register content.
     * 
     * @return the backup after register content
     */
    public String getBackupAfterRegisterContent() {
        return backupAfterRegisterContent;
    }

    /**
     * Sets the backup after register content.
     * 
     * @param backupAfterRegisterContent
     *            the new backup after register content
     */
    public void setBackupAfterRegisterContent(String backupAfterRegisterContent) {
        this.backupAfterRegisterContent = backupAfterRegisterContent;
    }

    /**
     * Gets the bakcup remark.
     * 
     * @return the bakcup remark
     */
    public String getBakcupRemark() {
        return bakcupRemark;
    }

    /**
     * Sets the bakcup remark.
     * 
     * @param bakcupRemark
     *            the new bakcup remark
     */
    public void setBakcupRemark(String bakcupRemark) {
        this.bakcupRemark = bakcupRemark;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

}

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
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.dto.XLDFDomainDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFEmptyRemoveDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * XLDFPersonNoteDTO.
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFPersonNoteDTO", propOrder = { "sequenceId", "personId", "siteId", "registerYyymmdd",
        "registerHhmmss", "removeYyymmdd", "removeTime", "areaCode", "adminOfficeCode", "mainType", "subType",
        "registerCode", "registerContent", "registerAdminOfficeCode", "registrarName", "applyTransactionId",
        "applySequenceId", "visible" })
@XmlRootElement(name = "XLDFPersonNoteDTO")
public abstract class XLDFPersonNoteDTO implements XLDFDomainDTO, Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The sequence id. */
    @XmlElement(name = "SequenceId", required = true)
    @FieldName("The sequence id")
    private String sequenceId;

    /** 統號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 登記日期. */
    @XmlElement(name = "RegisterYyymmdd", required = true)
    @FieldName("登記日期")
    private String registerYyymmdd;

    /** 登記時間. */
    @XmlElement(name = "RegisterHhmmss", required = true)
    @FieldName("登記時間")
    private String registerHhmmss;

    /** 除戶日期. */
    @XmlElement(name = "RemoveYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 主分類. */
    @XmlElement(name = "MainType", required = true)
    @FieldName("主分類")
    private String mainType;

    /** 次分類（申請書類別）. */
    @XmlElement(name = "SubType", required = true)
    @FieldName("次分類（申請書類別）")
    private String subType;

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;

    /** 記事內容. */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;

    /** 登記戶所代碼. */
    @XmlElement(name = "registerAdminOfficeCode", required = true)
    @FieldName("登記戶所代碼")
    private String registerAdminOfficeCode;

    /** 戶籍員姓名. */
    @XmlElement(name = "RegistrarName", required = true)
    @FieldName("戶籍員姓名")
    private String registrarName;

    /** 申請書交易序號. */
    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("申請書交易序號")
    private String applyTransactionId;

    /** 申請書序號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("申請書序號")
    private Integer applySequenceId;

    /** 是否列印申請書及顯示在記事清單. */
    @XmlElement(name = "Visible", required = true)
    @FieldName("是否列印申請書及顯示在記事清單")
    private boolean visible;

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
    public void setPersonId(final String personId) {
        this.personId = personId;
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
    public void setRegisterYyymmdd(final String registerYyymmdd) {
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
    public void setRegisterHhmmss(final String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(final String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
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
    public void setMainType(final String mainType) {
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
    public void setSubType(final String subType) {
        this.subType = subType;
    }

    /**
     * Gets the register code.
     * 
     * @return the register code
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * Sets the register code.
     * 
     * @param registerCode
     *            the new register code
     */
    public void setRegisterCode(final String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the register_admin office code.
     * 
     * @return the register_admin office code
     */
    @Deprecated
    public String getRegister_adminOfficeCode() {
        return registerAdminOfficeCode;
    }

    /**
     * Sets the register_admin office code.
     * 
     * @param register_adminOfficeCode
     *            the new register_admin office code
     */
    @Deprecated
    public void setRegister_adminOfficeCode(final String register_adminOfficeCode) {
        this.registerAdminOfficeCode = register_adminOfficeCode;
    }

    /**
     * Gets the register admin office code.
     * 
     * @return the register admin office code
     */
    public String getRegisterAdminOfficeCode() {
        return registerAdminOfficeCode;
    }

    /**
     * Sets the register admin office code.
     * 
     * @param registerAdminOfficeCode
     *            the new register admin office code
     */
    public void setRegisterAdminOfficeCode(final String registerAdminOfficeCode) {
        this.registerAdminOfficeCode = registerAdminOfficeCode;
    }

    /**
     * Gets the registrar name.
     * 
     * @return the registrar name
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * Sets the registrar name.
     * 
     * @param registrarName
     *            the new registrar name
     */
    public void setRegistrarName(final String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * Gets the removes the dto.
     * 
     * @return the removes the dto
     */
    public XLDFRemoveDTO getRemoveDTO() {
        return XLDFEmptyRemoveDTO.getInstance();
    }

    /**
     * Gets the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return XLDFEmptyRemoveDTO.class.isInstance(getRemoveDTO()) ? RlConstant.CURRENT_HOUSEHOLD
                : RlConstant.REMOVED_HOUSEHOLD;
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
     * Gets the sequence id.
     * 
     * @return the sequence id
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the sequence id.
     * 
     * @param sequenceId
     *            the new sequence id
     */
    public void setSequenceId(final String sequenceId) {
        this.sequenceId = sequenceId;
    }

    /**
     * Checks if is visible.
     * 
     * @return true, if is visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the visible.
     * 
     * @param visible
     *            the new visible
     */
    public void setVisible(final boolean visible) {
        this.visible = visible;
    }

    /**
     * Gets the apply transaction id.
     * 
     * @return the apply transaction id
     */
    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    /**
     * Sets the apply transaction id.
     * 
     * @param applyTransactionId
     *            the new apply transaction id
     */
    public void setApplyTransactionId(final String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public Integer getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(final Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
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

}

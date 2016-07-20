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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.dto.XLDFDomainDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFEmptyRemoveDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * XLDFHouseholdNoteDTO。
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFHouseholdNoteDTO", propOrder = { "sequenceId", "householdHeadId", "householdId",
        "registerYyymmdd", "registerHhmmss", "areaCode", "adminOfficeCode", "registerCode", "registerContent",
        "registerAdminOfficeCode", "registrarName", "mainType", "subType", "visible" })
public abstract class XLDFHouseholdNoteDTO implements XLDFDomainDTO, Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SequenceId", required = true)
    @FieldName("交易序號")
    private String sequenceId;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 登記日期 */
    @XmlElement(name = "RegisterYyymmdd", required = true)
    @FieldName("登記日期")
    private String registerYyymmdd;

    /** 登記時間 */
    @XmlElement(name = "RegisterHhmmss", required = true)
    @FieldName("登記時間")
    private String registerHhmmss;

    /** 行政區域代碼 */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼 */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 記事代碼 */
    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;

    /** 記事內容 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;

    /** 登記戶所代碼 */
    @XmlElement(name = "RegisterAdminOfficeCode", required = true)
    @FieldName("登記戶所代碼")
    private String registerAdminOfficeCode;

    /** 戶籍員姓名 */
    @XmlElement(name = "RegistrarName", required = true)
    @FieldName("戶籍員姓名")
    private String registrarName;

    /** 記事主分類 */
    @XmlElement(name = "MainType", required = true)
    @FieldName("記事主分類")
    private String mainType;

    /** 記事次分類（申請書類別） */
    @XmlElement(name = "SubType", required = true)
    @FieldName("記事次分類（申請書類別）")
    private String subType;

    /** 是否列印申請書及顯示在記事清單 */
    @XmlElement(name = "Visible", required = true)
    @FieldName("是否列印申請書及顯示在記事清單")
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getRegisterAdminOfficeCode() {
        return registerAdminOfficeCode;
    }

    public void setRegisterAdminOfficeCode(String registerAdminOfficeCode) {
        this.registerAdminOfficeCode = registerAdminOfficeCode;
    }

    public String getRegistrarName() {
        return registrarName;
    }

    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public XLDFRemoveDTO getRemoveDTO() {
        return XLDFEmptyRemoveDTO.getInstance();
    }

    public String getRemark() {
        return XLDFEmptyRemoveDTO.class.isInstance(getRemoveDTO()) ? "現戶" : "除戶";
    }

    /** site id */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("site id")
    private String siteId;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

}

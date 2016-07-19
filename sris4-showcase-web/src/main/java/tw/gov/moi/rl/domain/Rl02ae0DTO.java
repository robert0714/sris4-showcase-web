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
import tw.gov.moi.ae.personimage.domain.ImgInfoDto;
import tw.gov.moi.domain.Tldfs0z3Type;

/**
 * The Class Rl02ae0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ae0DTO", propOrder = { "personId", "siteId", "personName", "birthYyymmdd", "cancelApplyYyymmdd",
        "cancelApplyHhmmss", "cancelAcceptAdminOfficeCode", "cancelApplyReason", "applyYyymmdd", "applyHhmmss",
        "acceptAdminOfficeCode", "applyReason", "idCardApplyYyymmdd", "idCardApplyCode", "expireReason",
        "expireYyymmdd", "registerCode", "registerContent", "applyPersonId", "applySiteId", "relationship",
        "applyPersonName", "personNote", "reportUrl", "temp", "haveApplyData", "tldfs0z3Obj", "applicantSameTxnPerson" })
@XmlRootElement(name = "Rl02ae0DTO")
public class Rl02ae0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 作業點代碼 */
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId")
    private String siteId;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "BirthYyymmdd")
    private String birthYyymmdd;

    /** 註銷案件－受理日期 */
    @FieldName("註銷案件－受理日期")
    @XmlElement(name = "CancelApplyYyymmdd")
    private String cancelApplyYyymmdd;

    /** 註銷案件－受理時間 */
    @FieldName("註銷案件－受理時間")
    @XmlElement(name = "CancelApplyHhmmss")
    private String cancelApplyHhmmss;

    /** 註銷案件－發證戶所 */
    @FieldName("註銷案件－發證戶所")
    @XmlElement(name = "CancelAcceptAdminOfficeCode")
    private String cancelAcceptAdminOfficeCode;

    /** 註銷案件－申請事由 */
    @FieldName("註銷案件－申請事由")
    @XmlElement(name = "CancelApplyReason")
    private String cancelApplyReason;

    /** 最新請領資料－受理日期 */
    @FieldName("最新請領資料－受理日期")
    @XmlElement(name = "ApplyYyymmdd")
    private String applyYyymmdd;

    /** 最新請領資料－受理時間 */
    @FieldName("最新請領資料－受理時間 ")
    @XmlElement(name = "ApplyHhmmss")
    private String applyHhmmss;

    /** 最新請領資料－發證戶所 */
    @FieldName("最新請領資料－發證戶所")
    @XmlElement(name = "AcceptAdminOfficeCode")
    private String acceptAdminOfficeCode;

    /** 最新請領資料－申請事由 */
    @FieldName("最新請領資料－申請事由")
    @XmlElement(name = "ApplyReason")
    private String applyReason;

    /** 最新請領資料－個人基本資料正確之請領日期 */
    @FieldName("最新請領資料－個人基本資料正確之請領日期")
    @XmlElement(name = "IdCardApplyYyymmdd")
    private String idCardApplyYyymmdd;

    /** 最新請領資料－個人基本資料正確之請領代碼 */
    @FieldName("最新請領資料－個人基本資料正確之請領代碼")
    @XmlElement(name = "IdCardApplyCode")
    private String idCardApplyCode;

    /** 註銷原因 */
    @FieldName("註銷原因")
    @XmlElement(name = "ExpireReason")
    private String expireReason;

    /** 註銷日期 */
    @FieldName("註銷日期")
    @XmlElement(name = "ExpireYyymmdd")
    private String expireYyymmdd;

    /** 記事代碼 */
    @FieldName("記事代碼 ")
    @XmlElement(name = "RegisterCode")
    private String registerCode;

    /** 記事內容 */
    @FieldName("記事內容")
    @XmlElement(name = "RegisterContent")
    private String registerContent;

    /** 申請人國民身分證統一編號 */
    @FieldName("申請人國民身分證統一編號")
    @XmlElement(name = "ApplyPersonId")
    private String applyPersonId;

    /** 申請人作業點代碼 */
    @FieldName("申請人作業點代碼")
    @XmlElement(name = "ApplySiteId")
    private String applySiteId;

    /** 申請人當事人之關係 */
    @FieldName("申請人當事人之關係")
    @XmlElement(name = "Relationship")
    private String relationship;

    /** 申請人姓名 */
    @FieldName("申請人姓名")
    @XmlElement(name = "ApplyPersonName")
    private String applyPersonName;

    /** 報表路徑 */
    @FieldName("報表路徑")
    @XmlElement(name = "ReportUrl")
    private String reportUrl;

    /** 影像資料 */
    @FieldName("影像資料")
    @XmlElement(name = "img")
    private ImgInfoDto img;

    /** 暫存資料 */
    @FieldName("暫存資料 ")
    @XmlElement(name = "Temp")
    private Rl02ae0TempDTO temp = new Rl02ae0TempDTO();

    /** 是否有回復後的請領資料. */
    @FieldName("是否有回復後的請領資料")
    @XmlElement(name = "HaveApplyData")
    private boolean haveApplyData = true;

    /** 註銷新式國民身分證請領申請書資料暫存檔. */
    @FieldName("註銷新式國民身分證請領申請書資料暫存檔")
    @XmlElement(name = "Tldfs0z3Obj")
    private Tldfs0z3Type tldfs0z3Obj;

    /** 申請人同當事人. */
    @FieldName("申請人同當事人")
    @XmlElement(name = "ApplicantSameTxnPerson")
    private boolean applicantSameTxnPerson = false;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getCancelApplyYyymmdd() {
        return cancelApplyYyymmdd;
    }

    public void setCancelApplyYyymmdd(String cancelApplyYyymmdd) {
        this.cancelApplyYyymmdd = cancelApplyYyymmdd;
    }

    public String getCancelApplyHhmmss() {
        return cancelApplyHhmmss;
    }

    public void setCancelApplyHhmmss(String cancelApplyHhmmss) {
        this.cancelApplyHhmmss = cancelApplyHhmmss;
    }

    public String getCancelAcceptAdminOfficeCode() {
        return cancelAcceptAdminOfficeCode;
    }

    public void setCancelAcceptAdminOfficeCode(String cancelAcceptAdminOfficeCode) {
        this.cancelAcceptAdminOfficeCode = cancelAcceptAdminOfficeCode;
    }

    public String getCancelApplyReason() {
        return cancelApplyReason;
    }

    public void setCancelApplyReason(String cancelApplyReason) {
        this.cancelApplyReason = cancelApplyReason;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    public void setIdCardApplyCode(String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    public String getExpireReason() {
        return expireReason;
    }

    public void setExpireReason(String expireReason) {
        this.expireReason = expireReason;
    }

    public String getExpireYyymmdd() {
        return expireYyymmdd;
    }

    public void setExpireYyymmdd(String expireYyymmdd) {
        this.expireYyymmdd = expireYyymmdd;
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

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getApplyPersonName() {
        return applyPersonName;
    }

    public void setApplyPersonName(String applyPersonName) {
        this.applyPersonName = applyPersonName;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public ImgInfoDto getImg() {
        return img;
    }

    public void setImg(ImgInfoDto img) {
        this.img = img;
    }

    public Rl02ae0TempDTO getTemp() {
        return temp;
    }

    public void setTemp(Rl02ae0TempDTO temp) {
        this.temp = temp;
    }

    public boolean isHaveApplyData() {
        return haveApplyData;
    }

    public void setHaveApplyData(boolean haveApplyData) {
        this.haveApplyData = haveApplyData;
    }

    public Tldfs0z3Type getTldfs0z3Obj() {
        return tldfs0z3Obj;
    }

    public void setTldfs0z3Obj(Tldfs0z3Type tldfs0z3Obj) {
        this.tldfs0z3Obj = tldfs0z3Obj;
    }

    public boolean isApplicantSameTxnPerson() {
        return applicantSameTxnPerson;
    }

    public void setApplicantSameTxnPerson(boolean applicantSameTxnPerson) {
        this.applicantSameTxnPerson = applicantSameTxnPerson;
    }

}

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

/**
 * 核發門牌證明DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01630DTO", propOrder = { "applyKind", "applyName", "content", "adminOfficeCode", "noUseNo",
        "reportURL", "isChecked" })
@XmlRootElement(name = "Rl01630DTO")
public class Rl01630DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 證明書種類 */
    @XmlElement(name = "applyKind", required = true)
    @FieldName("證明書種類")
    private String applyKind;

    /** 申請人 */
    @XmlElement(name = "applyName", required = true)
    @FieldName("申請人")
    private String applyName;

    /** 證明書內容 */
    @XmlElement(name = "content", required = true)
    @FieldName("證明書內容")
    private String content;

    /** 戶所名稱 */
    @XmlElement(name = "adminOfficeCode", required = true)
    @FieldName("戶所名稱")
    private String adminOfficeCode;

    /** 使用號碼 */
    @XmlElement(name = "noUseNo", required = true)
    @FieldName("使用號碼")
    private String nowUseNo;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    @XmlElement(name = "IsChecked")
    @FieldName("是否驗證")
    private boolean isChecked = false;

    @XmlElement(name = "OldCotent")
    @FieldName("原有內容")
    private String oldCotent = "";

    @XmlElement(name = "IsPrint")
    @FieldName("是否列印")
    private boolean isPrint = false;

    /**
     * @return the applyKind
     */
    public String getApplyKind() {
        return applyKind;
    }

    /**
     * @param applyKind
     *            the applyKind to set
     */
    public void setApplyKind(String applyKind) {
        this.applyKind = applyKind;
    }

    /**
     * @return the applyName
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * @param applyName
     *            the applyName to set
     */
    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     *            the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the adminOfficeCode
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * @param adminOfficeCode
     *            the adminOfficeCode to set
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * @return the nowUseNo
     */
    public String getNowUseNo() {
        return nowUseNo;
    }

    /**
     * @param nowUseNo
     *            the nowUseNo to set
     */
    public void setNowUseNo(String nowUseNo) {
        this.nowUseNo = nowUseNo;
    }

    /**
     * @return the reportURL
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * @param reportURL
     *            the reportURL to set
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getOldCotent() {
        return oldCotent;
    }

    public void setOldCotent(String oldCotent) {
        this.oldCotent = oldCotent;
    }

    public boolean isPrint() {
        return isPrint;
    }

    public void setPrint(boolean isPrint) {
        this.isPrint = isPrint;
    }

}

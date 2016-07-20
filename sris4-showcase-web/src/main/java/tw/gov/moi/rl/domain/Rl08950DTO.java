/*
 * Copyright (final c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */

package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;

/**
 * 所內記事資料清冊數據傳輸對象. 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08590DTO", propOrder = { "registerCode", "registerName", "jumpType", "villageList", "siteId", "siteName",
        "reportFormat", "reportURL", "resultList" })
@XmlRootElement(name = "Rl08590DTO")
public class Rl08950DTO extends BaseITextReportParams implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    @FieldName("記事代碼")
    private String registerCode;

    /** 記事名稱. */
    @XmlElement(name = "RegisterName")
    @FieldName("記事名稱")
    private String registerName;

    /** 跳頁方式. */
    @XmlElement(name = "JumpType")
    @FieldName("跳頁方式")
    private String jumpType;

    /** 村(里)清單. */
    @XmlElement(name = "VillageList")
    @FieldName("村(里)清單")
    private List<String> villageList;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表位置. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表位置")
    private String reportURL;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 作業點名稱. */
    @XmlElement(name = "SiteName")
    @FieldName("作業點名稱")
    private String siteName;

    /** 所內記事資料結果清單. */
    @XmlElement(name = "ResultList")
    @FieldName("所內記事資料結果清單")
    private List<List<Rl08950Result>> resultList;

    /**
     * 取得跳頁方式.
     * 
     * @return 跳頁方式
     */
    public String getJumpType() {
        return this.jumpType;
    }

    @Override
    public String getMainReportName() {
        return "RLRP08950";
    }

    /**
     * 取得記事代碼.
     * 
     * @return 記事代碼
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * 取得記事名稱.
     * 
     * @return 記事名稱
     */
    public String getRegisterName() {
        return this.registerName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rs.common.report.dto.RsReportInfo#getReportExt()
     */
    @Override
    public String getReportExt() {
        return new String(new SimpleDateFormat("yyMMddHHmmss").format(new Date()));
    }

    /**
     * 取得檔案格式.
     * 
     * @return 檔案格式
     */
    public String getReportFormat() {
        return this.reportFormat;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rs.common.report.dto.RsReportInfo#getReportFormatEnum()
     */
    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(this.reportFormat) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    /**
     * 取得報表位置.
     * 
     * @return 報表位置
     */
    public String getReportURL() {
        return this.reportURL;
    }

    /**
     * 取得所內記事資料結果清單清單.
     * 
     * @return 所內記事資料結果清單
     */
    public List<List<Rl08950Result>> getResultList() {
        return this.resultList;
    }

    /**
     * 取得作業點代碼.
     * 
     * @return 作業點代碼
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * 取得戶政所別.
     * 
     * @return 戶政所別
     */
    public String getSiteName() {
        return this.siteName;
    }

    /**
     * 取得村(里)清單.
     * 
     * @return 村(里)清單
     */
    public List<String> getVillageList() {
        return this.villageList;
    }

    /**
     * 設定跳頁方式.
     * 
     * @param 跳頁方式
     */
    public void setJumpType(final String jumpType) {
        this.jumpType = jumpType;
    }

    /**
     * 設定記事代碼.
     * 
     * @param 記事代碼
     */
    public void setRegisterCode(final String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * 設定記事名稱.
     * 
     * @param registerName
     *            記事名稱
     */
    public void setRegisterName(final String registerName) {
        this.registerName = registerName;
    }

    /**
     * 設定檔案格式.
     * 
     * @param 檔案格式
     */
    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * 設定報表位置.
     * 
     * @param 報表位置
     */
    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    /**
     * 設定所內記事資料結果清單.
     * 
     * @param resultList
     *            所內記事資料結果清單
     */
    public void setResultList(final List<List<Rl08950Result>> resultList) {
        this.resultList = resultList;
    }

    /**
     * 設定作業點代碼.
     * 
     * @param siteId
     *            作業點代碼
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    /**
     * 設定戶政所別.
     * 
     * @param siteName
     *            戶政所別
     */
    public void setSiteName(final String siteName) {
        this.siteName = siteName;
    }

    /**
     * 設定村(里)清單.
     * 
     * @param 村
     *            (里)清單
     */
    public void setVillageList(final List<String> villageList) {
        this.villageList = villageList;
    }
}
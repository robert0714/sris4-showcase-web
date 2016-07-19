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

/**
 * The Class Rl02af0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02af0DTO", propOrder = { "statisticKind", "dataDateBegin", "dataDateEnd", "site", "reportFormat",
        "fileURL", "reportURL", "lastReceiveDate", "lastReceiveTime" ,"rldf008aStartDate" })
@XmlRootElement(name = "Rl02af0DTO")
public class Rl02af0DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 統計造冊：頁面統計造冊欄位. */
    @XmlElement(name = "StatisticKind")
    @FieldName("頁面統計造冊欄位")
    private String statisticKind = RlConstant.STRING_ZERO;

    /** 日期起：頁面日期起欄位. */
    @XmlElement(name = "DataDateBegin")
    @FieldName("頁面日期起欄位")
    private String dataDateBegin;

    /** 日期迄：頁面日期迄欄位. */
    @XmlElement(name = "DataDateEnd")
    @FieldName("頁面日期迄欄位")
    private String dataDateEnd;

    /** 鄉鎮市區. */
    @XmlElement(name = "Site")
    @FieldName("鄉鎮市區")
    private String site;

    /** 檔案格式：頁面檔案格式欄位. */
    @XmlElement(name = "ReportFormat")
    @FieldName("頁面檔案格式欄位")
    private String reportFormat;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 接ReportingComponet回傳的報表位置. */
    @XmlElement(name = "ReportURL")
    @FieldName("接ReportingComponet回傳的報表位置")
    private String reportURL;
    
    
    /** 最後收妥日期. */
    @XmlElement(name = "LastReceiveDate")
    @FieldName("最後收妥日期")
    private String lastReceiveDate;

    /** 最後收妥時間. */
    @XmlElement(name = "LastReceiveTime")
    @FieldName("最後收妥時間")
    private String lastReceiveTime;
    
    /** 全民換證時間. */
    @XmlElement(name = "Rldf008aStartDate")
    @FieldName("全民換證時間")
    private String rldf008aStartDate;
    
    /**
     * Gets the statistic kind.
     * 
     * @return the statistic kind
     */
    public String getStatisticKind() {
        return statisticKind;
    }

    /**
     * Sets the statistic kind.
     * 
     * @param statisticKind
     *            the new statistic kind
     */
    public void setStatisticKind(String statisticKind) {
        this.statisticKind = statisticKind;
    }

    /**
     * Gets the data date begin.
     * 
     * @return the data date begin
     */
    public String getDataDateBegin() {
        return dataDateBegin;
    }

    /**
     * Sets the data date begin.
     * 
     * @param dataDateBegin
     *            the new data date begin
     */
    public void setDataDateBegin(String dataDateBegin) {
        this.dataDateBegin = dataDateBegin;
    }

    /**
     * Gets the data date end.
     * 
     * @return the data date end
     */
    public String getDataDateEnd() {
        return dataDateEnd;
    }

    /**
     * Sets the data date end.
     * 
     * @param dataDateEnd
     *            the new data date end
     */
    public void setDataDateEnd(String dataDateEnd) {
        this.dataDateEnd = dataDateEnd;
    }

    /**
     * Gets the site.
     * 
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the site.
     * 
     * @param site
     *            the new site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * Gets the report format.
     * 
     * @return the report format
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * Sets the report format.
     * 
     * @param reportFormat
     *            the new report format
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * Gets the file url.
     * 
     * @return the file url
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the file url.
     * 
     * @param fileURL
     *            the new file url
     */
    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the report url.
     * 
     * @param reportURL
     *            the new report url
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }
    
    /**
     * Gets the last receive date.
     * 
     * @return the last receive date
     */
    public String getLastReceiveDate() {
        return lastReceiveDate;
    }

    /**
     * Sets the last receive date.
     * 
     * @param lastReceiveDate
     *            the new last receive date
     */
    public void setLastReceiveDate(final String lastReceiveDate) {
        this.lastReceiveDate = lastReceiveDate;
    }

    /**
     * Gets the last receive time.
     * 
     * @return the last receive time
     */
    public String getLastReceiveTime() {
        return lastReceiveTime;
    }

    /**
     * Sets the last receive time.
     * 
     * @param lastReceiveTime
     *            the new last receive time
     */
    public void setLastReceiveTime(final String lastReceiveTime) {
        this.lastReceiveTime = lastReceiveTime;
    }
    

    public String getRldf008aStartDate() {
        return rldf008aStartDate;
    }

    public void setRldf008aStartDate(String rldf008aStartDate) {
        this.rldf008aStartDate = rldf008aStartDate;
    }

    @Override
    public String toString() {
        return "Rc0c2b0DTO [statisticKind=" + statisticKind + ", dataDateBegin=" + dataDateBegin + ", dataDateEnd="
                + dataDateEnd + ", site=" + site + ", reportFormat=" + reportFormat + ", fileURL=" + fileURL
                + ", reportURL=" + reportURL + "]";
    }
}
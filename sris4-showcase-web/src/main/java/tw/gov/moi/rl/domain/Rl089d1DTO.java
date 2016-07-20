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
 * The Class Rl089d1DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089d1DTO", propOrder = { "dataYear", "reportFormat", "turnPage", "village", "neighbor", "tranType",
        "reportUrl" })
@XmlRootElement(name = "Rl089d1DTO")
public class Rl089d1DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 清查年份. */
    @XmlElement(name = "DataYear")
    @FieldName("清查年份")
    private String dataYear = "";

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat = "";

    /** 換頁方式. */
    @XmlElement(name = "TurnPage")
    @FieldName("換頁方式")
    private String turnPage = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 清查對象. */
    @XmlElement(name = "TranType")
    @FieldName("清查對象")
    private String[] tranType;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /**
     * Gets the data year.
     * 
     * @return the data year
     */
    public String getDataYear() {
        return dataYear;
    }

    /**
     * Sets the data year.
     * 
     * @param dataYear
     *            the new data year
     */
    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
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
     * Gets the turn page.
     * 
     * @return the turn page
     */
    public String getTurnPage() {
        return turnPage;
    }

    /**
     * Sets the turn page.
     * 
     * @param turnPage
     *            the new turn page
     */
    public void setTurnPage(String turnPage) {
        this.turnPage = turnPage;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl089d1DTO [dataYear=" + dataYear + ", reportFormat=" + reportFormat + ", turnPage=" + turnPage
                + ", village=" + village + ", neighbor=" + neighbor + "]";
    }

    /**
     * Gets the tran type.
     * 
     * @return the tran type
     */
    public String[] getTranType() {
        return tranType;
    }

    /**
     * Sets the tran type.
     * 
     * @param tranType
     *            the new tran type
     */
    public void setTranType(String[] tranType) {
        this.tranType = tranType;
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

}

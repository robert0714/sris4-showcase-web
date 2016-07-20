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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl089d4DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089d4DTO", propOrder = { "yyy", "reportFormat", "changePage", "village", "forGoal", "reportUrl" })
@XmlRootElement(name = "Rl089d4DTO")
public class Rl089d4DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 清查年份. */
    @XmlElement(name = "Yyy")
    @FieldName("清查年份")
    private String yyy = "";

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat = "";

    /** 換頁方式. */
    @XmlElement(name = "ChangePage")
    @FieldName("換頁方式")
    private String changePage = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 清查對象. */
    @XmlElement(name = "ForGoal")
    @FieldName("清查對象")
    private String[] forGoal;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /** 列印方式. */
    @XmlElement(name = "Check")
    @FieldName("列印方式")
    private String check = "";

    /**
     * Gets the yyy.
     * 
     * @return the yyy
     */
    public String getYyy() {
        return yyy;
    }

    /**
     * Sets the yyy.
     * 
     * @param yyy
     *            the new yyy
     */
    public void setYyy(String yyy) {
        this.yyy = yyy;
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
     * Gets the change page.
     * 
     * @return the change page
     */
    public String getChangePage() {
        return changePage;
    }

    /**
     * Sets the change page.
     * 
     * @param changePage
     *            the new change page
     */
    public void setChangePage(String changePage) {
        this.changePage = changePage;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl089d4DTO [yyy=" + yyy + ", reportFormat=" + reportFormat + ", changePage=" + changePage
                + ", village=" + village + ", forGoal=" + StringUtils.join(forGoal) + "]";
    }

    /**
     * Gets the for goal.
     * 
     * @return the for goal
     */
    public String[] getForGoal() {
        return forGoal;
    }

    /**
     * Sets the for goal.
     * 
     * @param forGoal
     *            the new for goal
     */
    public void setForGoal(String[] forGoal) {
        this.forGoal = forGoal;
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

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

}

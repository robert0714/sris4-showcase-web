/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde205wType;

/**
 * 稱謂代碼對照資料DTO.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01d10DTO", propOrder = {
        "appellation",
        "appellationCode",
        "results"
})
@XmlRootElement(name = "Rl01d10DTO")
public class Rl01d10DTO {
    
    /** 稱謂. */
    @XmlElement(name = "Appellation")
    @FieldName("稱謂")
    private String appellation;
    
    /** 稱謂代碼. */
    @XmlElement(name = "AppellationCode")
    @FieldName("稱謂代碼")
    private String appellationCode;
    
    /** 查詢結果. */
    @XmlElement(name = "Results")
    @FieldName("查詢結果")
    private List<Rlde205wType> results = new ArrayList<Rlde205wType>();
    
    /** 報表網址 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表網址")
    private String reportUrl;
 
    /** 電子檔格式 */
    @XmlElement(name = "ReportFormat")
    @FieldName("電子檔格式")
    private String reportFormat = "";

    /**
     * Gets the results.
     *
     * @return the results
     */
    public List<Rlde205wType> getResults() {
        return results;
    }

    /**
     * Sets the results.
     *
     * @param results the new results
     */
    public void setResults(final List<Rlde205wType> results) {
        this.results = results;
    }

    /**
     * Gets the appellation.
     *
     * @return the appellation
     */
    public String getAppellation() {
        return appellation;
    }

    /**
     * Sets the appellation.
     *
     * @param appellation the new appellation
     */
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    /**
     * Gets the appellation code.
     *
     * @return the appellation code
     */
    public String getAppellationCode() {
        return appellationCode;
    }

    /**
     * Sets the appellation code.
     *
     * @param appellationCode the new appellation code
     */
    public void setAppellationCode(String appellationCode) {
        this.appellationCode = appellationCode;
    }
    
    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }
    
    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }
    
}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl02bb0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02bb0DTO", propOrder = { "year", "season", "statisticYyymmS", "statisticYyymmE",
        "statisticYyymmddS", "statisticYyymmddE", "reportType", "reportURL", "fileURL", "reportName",
        "reportParams", "printRunning" })
@XmlRootElement(name = "Rl02bb0DTO")
public class Rl02bb0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計期間-民國 */
    @XmlElement(name = "Year", required = true)
    @FieldName("統計期間-民國")
    private String year;

    /** 統計期間-上下半年 */
    @XmlElement(name = "Season", required = true)
    @FieldName("統計期間-上下半年")
    private String season;

    /** statisticYyymmS */
    @XmlElement(name = "StatisticYyymmS", required = true)
    @FieldName("statisticYyymmS")
    private String statisticYyymmS;

    /** statisticYyymmE */
    @XmlElement(name = "StatisticYyymmE", required = true)
    @FieldName("statisticYyymmE")
    private String statisticYyymmE;

    /** statisticsYyymmddS */
    @XmlElement(name = "StatisticsYyymmddS", required = true)
    @FieldName("statisticsYyymmddS")
    private String statisticYyymmddS;

    /** statisticYyymmddE */
    @XmlElement(name = "StatisticYyymmddE", required = true)
    @FieldName("statisticYyymmddE")
    private String statisticYyymmddE;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "RLRP02BB0";

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /** 報表是否執行中 */
    @XmlElement(name = "printRunning", required = true)
    @FieldName("報表是否執行中")
    private Boolean printRunning = Boolean.FALSE;

    public String getYear() {
        return year;
    }

    public void setYear(final String year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(final String season) {
        this.season = season;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(final String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public String getStatisticYyymmS() {
        return statisticYyymmS;
    }

    public void setStatisticYyymmS(final String statisticYyymmS) {
        this.statisticYyymmS = statisticYyymmS;
    }

    public String getStatisticYyymmE() {
        return statisticYyymmE;
    }

    public void setStatisticYyymmE(final String statisticYyymmE) {
        this.statisticYyymmE = statisticYyymmE;
    }

    public String getStatisticYyymmddS() {
        return statisticYyymmddS;
    }

    public void setStatisticYyymmddS(final String statisticYyymmddS) {
        this.statisticYyymmddS = statisticYyymmddS;
    }

    public String getStatisticYyymmddE() {
        return statisticYyymmddE;
    }

    public void setStatisticYyymmddE(final String statisticYyymmddE) {
        this.statisticYyymmddE = statisticYyymmddE;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

	public HashMap<String, String> getReportParams() {
		return reportParams;
	}

	public void setReportParams(HashMap<String, String> reportParams) {
		this.reportParams = reportParams;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Boolean getPrintRunning() {
		return printRunning;
	}

	public void setPrintRunning(Boolean printRunning) {
		this.printRunning = printRunning;
	}
}

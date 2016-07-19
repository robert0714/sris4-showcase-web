/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶政管理服務案件統計表DTO.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08181DTO", propOrder = { "statisticYyymmdd", "rl08181Savedto", "printCountyArea", "printTownArea",
        "isNotice", "reportFormat", "reportURL", "saveDtoResultList" })
@XmlRootElement(name = "Rl08181DTO")
public class Rl08181DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統計日期. */
    @XmlElement(name = "StatisticYyymmdd", required = false)
    @FieldName("統計日期")
    private String statisticYyymmdd;

    /** 戶政管理服務案件統計表設定. */
    @XmlElement(name = "Rl08181Savedto", required = false)
    @FieldName("戶政管理服務案件統計表設定")
    private Rl08181SaveDTO rl08181Savedto;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea", required = false)
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea", required = false)
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 是否通報. */
    @XmlElement(name = "IsNotice", required = false)
    @FieldName("是否通報")
    private String isNotice;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat", required = false)
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = false)
    @FieldName("報表路徑")
    private String reportURL;

    /** Rl08181SaveDTO resultList. */
    @XmlElement(name = "SaveDtoResultList", required = false)
    @FieldName("Rl08181SaveDTO resultList")
    private List<Rl08181SaveDTO> saveDtoResultList;
    
    @XmlElement(name = "doSend", required = false)
    @FieldName("送通報")
    private String doSend;

    public String getDoSend() {
        return doSend;
    }

    public void setDoSend(String doSend) {
        this.doSend = doSend;
    }

    /**
     * Gets the statistic yyymmdd.
     * 
     * @return the statistic yyymmdd
     */
    public String getStatisticYyymmdd() {
        return statisticYyymmdd;
    }

    /**
     * Sets the statistic yyymmdd.
     * 
     * @param statisticYyymmdd
     *            the new statistic yyymmdd
     */
    public void setStatisticYyymmdd(String statisticYyymmdd) {
        this.statisticYyymmdd = statisticYyymmdd;
    }

    /**
     * Gets the rl08181 savedto.
     * 
     * @return the rl08181 savedto
     */
    public Rl08181SaveDTO getRl08181Savedto() {
        return rl08181Savedto;
    }

    /**
     * Sets the rl08181 savedto.
     * 
     * @param rl08181Savedto
     *            the new rl08181 savedto
     */
    public void setRl08181Savedto(Rl08181SaveDTO rl08181Savedto) {
        this.rl08181Savedto = rl08181Savedto;
    }

    /**
     * Gets the prints the county area.
     * 
     * @return the prints the county area
     */
    public String getPrintCountyArea() {
        return printCountyArea;
    }

    /**
     * Sets the prints the county area.
     * 
     * @param printCountyArea
     *            the new prints the county area
     */
    public void setPrintCountyArea(String printCountyArea) {
        this.printCountyArea = printCountyArea;
    }

    /**
     * Gets the prints the town area.
     * 
     * @return the prints the town area
     */
    public String getPrintTownArea() {
        return printTownArea;
    }

    /**
     * Sets the prints the town area.
     * 
     * @param printTownArea
     *            the new prints the town area
     */
    public void setPrintTownArea(String printTownArea) {
        this.printTownArea = printTownArea;
    }

    /**
     * Gets the checks if is notice.
     * 
     * @return the checks if is notice
     */
    public String getIsNotice() {
        return isNotice;
    }

    /**
     * Sets the checks if is notice.
     * 
     * @param isNotice
     *            the new checks if is notice
     */
    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
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
     * Gets the save dto result list.
     * 
     * @return the save dto result list
     */
    public List<Rl08181SaveDTO> getSaveDtoResultList() {
        return saveDtoResultList;
    }

    /**
     * Sets the save dto result list.
     * 
     * @param saveDtoResultList
     *            the new save dto result list
     */
    public void setSaveDtoResultList(List<Rl08181SaveDTO> saveDtoResultList) {
        this.saveDtoResultList = saveDtoResultList;
    }

}

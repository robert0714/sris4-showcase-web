/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
 * The Class Rl05232DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05232DTO", propOrder = { "forignApplyType", "pringType", "dateStart", "dateEnd", "pageChange", "village", "reportType", "villageList" })
@XmlRootElement(name = "Rl05232DTO")
public class Rl05232DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 外來申請書類別
    /** The forign apply type. */
    @XmlElement(name = "ForignApplyType")
    @FieldName("外來申請書類別")
    private String forignApplyType;

    // 列印註記
    /** The pring type. */
    @XmlElement(name = "PringType")
    @FieldName("列印註記")
    private String pringType;

    // 起始日期
    /** The date start. */
    @XmlElement(name = "DateStart")
    @FieldName("起始日期")
    private String dateStart;

    // 終止日期
    /** The date end. */
    @XmlElement(name = "DateEnd")
    @FieldName("終止日期")
    private String dateEnd;

    // 換頁方式
    /** The page change. */
    @XmlElement(name = "PageChange")
    @FieldName("換頁方式")
    private String pageChange;

    // 村里
    /** The village. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    // 另存檔案格式
    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

    /** The village list. */
    @XmlElement(name = "VillageList")
    @FieldName("villageList")
    private List<String> villageList;
    
    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the forign apply type.
     * 
     * @return the forign apply type
     */
    public String getForignApplyType() {
        return forignApplyType;
    }

    /**
     * Sets the forign apply type.
     * 
     * @param forignApplyType
     *            the new forign apply type
     */
    public void setForignApplyType(String forignApplyType) {
        this.forignApplyType = forignApplyType;
    }

    /**
     * Gets the pring type.
     * 
     * @return the pring type
     */
    public String getPringType() {
        return pringType;
    }

    /**
     * Sets the pring type.
     * 
     * @param pringType
     *            the new pring type
     */
    public void setPringType(String pringType) {
        this.pringType = pringType;
    }

    /**
     * Gets the date start.
     * 
     * @return the date start
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Sets the date start.
     * 
     * @param dateStart
     *            the new date start
     */
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * Gets the date end.
     * 
     * @return the date end
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the date end.
     * 
     * @param dateEnd
     *            the new date end
     */
    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Gets the page change.
     * 
     * @return the page change
     */
    public String getPageChange() {
        return pageChange;
    }

    /**
     * Sets the page change.
     * 
     * @param pageChange
     *            the new page change
     */
    public void setPageChange(String pageChange) {
        this.pageChange = pageChange;
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
     * Gets the report type.
     * 
     * @return the report type
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the report type.
     * 
     * @param reportType
     *            the new report type
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * Gets the village list.
     * 
     * @return the village list
     */
    public List<String> getVillageList() {
        return villageList;
    }

    /**
     * Sets the village list.
     * 
     * @param villageList
     *            the new village list
     */
    public void setVillageList(List<String> villageList) {
        this.villageList = villageList;
    }
}

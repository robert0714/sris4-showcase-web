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
 * The Class Rl08150DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08150DTO", propOrder = { "printType", "dateStart", "dateEnd", "villageList", "pageChange",
        "reportType" })
@XmlRootElement(name = "Rl08150DTO")
public class Rl08150DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 製表類別
    /** The print type. */
    @XmlElement(name = "PrintType")
    @FieldName("製表類別")
    private String printType;

    // 製表類別
    /** The print type. */
    @XmlElement(name = "PrintType2")
    @FieldName("製表類別")
    private String printType2;

    // 登記期間起
    /** The date start. */
    @XmlElement(name = "DateStart")
    @FieldName("登記期間起")
    private String dateStart;

    // 登記期間迄
    /** The date end. */
    @XmlElement(name = "DateEnd")
    @FieldName("登記期間迄")
    private String dateEnd;

    // 村里
    /** The village list. */
    @XmlElement(name = "VillageList")
    @FieldName("村里")
    private List<String> villageList;

    // 換頁方式
    /** The page change. */
    @XmlElement(name = "PageChange")
    @FieldName("換頁方式")
    private String pageChange;

    // 換頁方式
    /** The page change. */
    @XmlElement(name = "PageChangeShow")
    @FieldName("換頁方式")
    private boolean pageChangeShow;

    // 另存檔案格式
    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private String reportUrl;
    
    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private long timeLimit;
    
    @XmlElement(name = "directPrintMark")
    @FieldName("directPrintMark")
    private String directPrintMark;
    
    

    public String getDirectPrintMark() {
        return directPrintMark;
    }

    public void setDirectPrintMark(String directPrintMark) {
        this.directPrintMark = directPrintMark;
    }

    public long getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getPrintType2() {
        return printType2;
    }

    public void setPrintType2(String printType2) {
        this.printType2 = printType2;
    }

    /**
     * Gets the prints the type.
     * 
     * @return the prints the type
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the prints the type.
     * 
     * @param printType
     *            the new prints the type
     */
    public void setPrintType(String printType) {
        this.printType = printType;
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

    public boolean isPageChangeShow() {
        return pageChangeShow;
    }

    public void setPageChangeShow(boolean pageChangeShow) {
        this.pageChangeShow = pageChangeShow;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
        result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
        result = prime * result + ((pageChange == null) ? 0 : pageChange.hashCode());
        result = prime * result + (pageChangeShow ? 1231 : 1237);
        result = prime * result + ((printType == null) ? 0 : printType.hashCode());
        result = prime * result + ((printType2 == null) ? 0 : printType2.hashCode());
        result = prime * result + ((villageList == null) ? 0 : villageList.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl08150DTO other = (Rl08150DTO) obj;
        if (dateEnd == null) {
            if (other.dateEnd != null)
                return false;
        } else if (!dateEnd.equals(other.dateEnd))
            return false;
        if (dateStart == null) {
            if (other.dateStart != null)
                return false;
        } else if (!dateStart.equals(other.dateStart))
            return false;
        if (pageChange == null) {
            if (other.pageChange != null)
                return false;
        } else if (!pageChange.equals(other.pageChange))
            return false;
        if (pageChangeShow != other.pageChangeShow)
            return false;
        if (printType == null) {
            if (other.printType != null)
                return false;
        } else if (!printType.equals(other.printType))
            return false;
        if (printType2 == null) {
            if (other.printType2 != null)
                return false;
        } else if (!printType2.equals(other.printType2))
            return false;
        if (villageList == null) {
            if (other.villageList != null)
                return false;
        } else if (!villageList.equals(other.villageList))
            return false;
        return true;
    }
}

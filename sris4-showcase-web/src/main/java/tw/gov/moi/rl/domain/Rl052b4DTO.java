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
 * 列印已接收死亡通報未辦理死亡登記清冊.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052b4DTO", propOrder = { "siteId", "noticeDateStart", "noticeDateEnd", "printCountyArea",
        "printTownArea", "order1", "order2", "changePage1", "changePage2", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl052b4DTO")
public class Rl052b4DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 工作站. */
    @XmlElement(name = "SiteId")
    @FieldName("工作站")
    private String siteId;

    /** 通報日期(起). */
    @XmlElement(name = "NoticeDateStart")
    @FieldName("通報日期(起)")
    private String noticeDateStart;

    /** 通報日期(迄). */
    @XmlElement(name = "NoticeDateEnd")
    @FieldName("通報日期(迄)")
    private String noticeDateEnd;

    /** 列印區域-市縣市. */
    @XmlElement(name = "PrintCountyArea")
    @FieldName("列印區域-市縣市")
    private String printCountyArea;

    /** 列印區域-鄉鎮市區. */
    @XmlElement(name = "PrintTownArea")
    @FieldName("列印區域-鄉鎮市區")
    private String printTownArea;

    /** 排序順序1. */
    @XmlElement(name = "Order1")
    @FieldName("排序順序1")
    private String order1;

    /** 排序順序2. */
    @XmlElement(name = "Order2")
    @FieldName("排序順序2")
    private String order2;

    /** 換頁1. */
    @XmlElement(name = "ChangePage1")
    @FieldName("換頁1")
    private String changePage1;

    /** 換頁2. */
    @XmlElement(name = "ChangePage2")
    @FieldName("換頁2")
    private String changePage2;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the notice date start.
     * 
     * @return the notice date start
     */
    public String getNoticeDateStart() {
        return noticeDateStart;
    }

    /**
     * Sets the notice date start.
     * 
     * @param noticeDateStart
     *            the new notice date start
     */
    public void setNoticeDateStart(String noticeDateStart) {
        this.noticeDateStart = noticeDateStart;
    }

    /**
     * Gets the notice date end.
     * 
     * @return the notice date end
     */
    public String getNoticeDateEnd() {
        return noticeDateEnd;
    }

    /**
     * Sets the notice date end.
     * 
     * @param noticeDateEnd
     *            the new notice date end
     */
    public void setNoticeDateEnd(String noticeDateEnd) {
        this.noticeDateEnd = noticeDateEnd;
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
     * Gets the order1.
     * 
     * @return the order1
     */
    public String getOrder1() {
        return order1;
    }

    /**
     * Sets the order1.
     * 
     * @param order1
     *            the new order1
     */
    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    /**
     * Gets the order2.
     * 
     * @return the order2
     */
    public String getOrder2() {
        return order2;
    }

    /**
     * Sets the order2.
     * 
     * @param order2
     *            the new order2
     */
    public void setOrder2(String order2) {
        this.order2 = order2;
    }

    /**
     * Gets the change page1.
     * 
     * @return the change page1
     */
    public String getChangePage1() {
        return changePage1;
    }

    /**
     * Sets the change page1.
     * 
     * @param changePage1
     *            the new change page1
     */
    public void setChangePage1(String changePage1) {
        this.changePage1 = changePage1;
    }

    /**
     * Gets the change page2.
     * 
     * @return the change page2
     */
    public String getChangePage2() {
        return changePage2;
    }

    /**
     * Sets the change page2.
     * 
     * @param changePage2
     *            the new change page2
     */
    public void setChangePage2(String changePage2) {
        this.changePage2 = changePage2;
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

}

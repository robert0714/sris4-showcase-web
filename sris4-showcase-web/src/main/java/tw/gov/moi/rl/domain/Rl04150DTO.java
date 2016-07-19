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
 * 製作行政區域調整通報單.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04150DTO", propOrder = { "RegDate", "PrintOption", "PrintItemOption", "NewVillage", "OldVillage",
        "NewNeighbor", "OldNeighbor", "HouseHoldHeadId", "HouseHoldId", "ReportFormat", "ReportURL" })
@XmlRootElement(name = "Rl04150DTO")
public class Rl04150DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 整編日期. */
    @XmlElement(name = "RegDate")
    @FieldName("整編日期")
    private String regDate;

    /** 列印順序. */
    @XmlElement(name = "PrintOption")
    @FieldName("列印順序")
    private String printOption;

    /** 列印條件選項. */
    @XmlElement(name = "PrintItemOption")
    @FieldName("列印條件選項")
    private String printItemOption;

    /** 新村里. */
    @XmlElement(name = "NewVillage")
    @FieldName("新村里")
    private String newVillage;

    /** 舊村里. */
    @XmlElement(name = "OldVillage")
    @FieldName("舊村里")
    private String oldVillage;

    /** 新鄰. */
    @XmlElement(name = "NewNeighbor")
    @FieldName("新鄰")
    private String newNeighbor;

    /** 舊鄰. */
    @XmlElement(name = "OldNeighbor")
    @FieldName("舊鄰")
    private String oldNeighbor;

    /** 戶長統號. */
    @XmlElement(name = "HouseHoldHeadId")
    @FieldName("戶長統號")
    private String houseHoldHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseHoldId")
    @FieldName("戶號")
    private String houseHoldId;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @FieldName("報表路徑")
    @XmlElement(name = "ReportURL")
    private String reportURL;

    /**
     * Gets the reg date.
     * 
     * @return the reg date
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the reg date.
     * 
     * @param regDate
     *            the new reg date
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * Gets the prints the option.
     * 
     * @return the prints the option
     */
    public String getPrintOption() {
        return printOption;
    }

    /**
     * Sets the prints the option.
     * 
     * @param printOption
     *            the new prints the option
     */
    public void setPrintOption(String printOption) {
        this.printOption = printOption;
    }

    /**
     * Gets the prints the item option.
     * 
     * @return the prints the item option
     */
    public String getPrintItemOption() {
        return printItemOption;
    }

    /**
     * Sets the prints the item option.
     * 
     * @param printItemOption
     *            the new prints the item option
     */
    public void setPrintItemOption(String printItemOption) {
        this.printItemOption = printItemOption;
    }

    /**
     * Gets the new village.
     * 
     * @return the new village
     */
    public String getNewVillage() {
        return newVillage;
    }

    /**
     * Sets the new village.
     * 
     * @param newVillage
     *            the new new village
     */
    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    /**
     * Gets the old village.
     * 
     * @return the old village
     */
    public String getOldVillage() {
        return oldVillage;
    }

    /**
     * Sets the old village.
     * 
     * @param oldVillage
     *            the new old village
     */
    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    /**
     * Gets the new neighbor.
     * 
     * @return the new neighbor
     */
    public String getNewNeighbor() {
        return newNeighbor;
    }

    /**
     * Sets the new neighbor.
     * 
     * @param newNeighbor
     *            the new new neighbor
     */
    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    /**
     * Gets the old neighbor.
     * 
     * @return the old neighbor
     */
    public String getOldNeighbor() {
        return oldNeighbor;
    }

    /**
     * Sets the old neighbor.
     * 
     * @param oldNeighbor
     *            the new old neighbor
     */
    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    /**
     * Gets the house hold head id.
     * 
     * @return the house hold head id
     */
    public String getHouseHoldHeadId() {
        return houseHoldHeadId;
    }

    /**
     * Sets the house hold head id.
     * 
     * @param houseHoldHeadId
     *            the new house hold head id
     */
    public void setHouseHoldHeadId(String houseHoldHeadId) {
        this.houseHoldHeadId = houseHoldHeadId;
    }

    /**
     * Gets the house hold id.
     * 
     * @return the house hold id
     */
    public String getHouseHoldId() {
        return houseHoldId;
    }

    /**
     * Sets the house hold id.
     * 
     * @param houseHoldId
     *            the new house hold id
     */
    public void setHouseHoldId(String houseHoldId) {
        this.houseHoldId = houseHoldId;
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

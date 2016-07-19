/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08b30DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08b30DTO", propOrder = { "reportName", "reprtType", "pageType", "addRow", "applyStartDate",
        "applyEndDate", "order1", "order2", "hBirthDateStart", "hBirthDateEnd", "hAboriginalIdentity", "hTribes",
        "hRegion", "hBirthType", "hEducation", "hMaritalStatus", "militaryType", "hCity", "hTwon", "hVillage",
        "hStartNeighbor", "hEndNeighbor", "hAddress", "wBirthDateStart", "wBirthDateEnd", "wAboriginalIdentity",
        "wTribes", "wRegion", "wBirthType", "wEducation", "wMaritalStatus", "wCity", "wTwon", "wVillage",
        "wStartNeighbor", "wEndNeighbor", "wAddress", "marriedDateStart", "marriedDateEnd", "marriedType", "document",
        "villageList", "village" })
@XmlRootElement(name = "Rl08b30DTO")
public class Rl08b30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 報表名稱. */
    @XmlElement(name = "ReportName", required = true)
    @FieldName("報表名稱")
    private String reportName;

    /** 報表格式. */
    @XmlElement(name = "ReprtType", required = true)
    @FieldName("報表格式")
    private String reprtType;

    /** 頁面格式. */
    @XmlElement(name = "PageType", required = true)
    @FieldName("頁面格式")
    private String pageType;

    /** 增加Row. */
    @XmlElement(name = "AddRow", required = true)
    @FieldName("增加Row")
    private String addRow;

    /** 申請日期起. */
    @XmlElement(name = "ApplyStartDate", required = true)
    @FieldName("申請日期起")
    private Date applyStartDate;

    /** 申請日期迄. */
    @XmlElement(name = "ApplyEndDate", required = true)
    @FieldName("申請日期迄")
    private Date applyEndDate;

    /** 排序順序-1. */
    @XmlElement(name = "Order1", required = true)
    @FieldName("排序順序-1")
    private String order1;

    /** 排序順序-2. */
    @XmlElement(name = "Order2", required = true)
    @FieldName("排序順序-2")
    private String order2;

    /** 夫出生日期起. */
    @XmlElement(name = "HBirthDateStart", required = true)
    @FieldName("夫出生日期起")
    private String hBirthDateStart;

    /** 夫出生日期迄. */
    @XmlElement(name = "HBirthDateEnd", required = true)
    @FieldName("夫出生日期迄")
    private String hBirthDateEnd;

    /** 夫國籍或區域代碼. */
    @XmlElement(name = "HAboriginalIdentity", required = true)
    @FieldName("夫國籍或區域代碼")
    private String hAboriginalIdentity;

    /** 夫部落. */
    @XmlElement(name = "HTribes", required = true)
    @FieldName("夫部落")
    private String hTribes;

    /** 夫地區. */
    @XmlElement(name = "HRegion", required = true)
    @FieldName("夫地區")
    private String hRegion;

    /** 夫出生別. */
    @XmlElement(name = "HBirthType", required = true)
    @FieldName("夫出生別")
    private String hBirthType;

    /** 夫教育程度. */
    @XmlElement(name = "HEducation", required = true)
    @FieldName("夫教育程度")
    private String hEducation;

    /** 夫婚前婚姻狀況. */
    @XmlElement(name = "HMaritalStatus", required = true)
    @FieldName("夫婚前婚姻狀況")
    private String hMaritalStatus;

    /** 夫役別. */
    @XmlElement(name = "MilitaryType", required = true)
    @FieldName("夫役別")
    private String militaryType;

    /** 夫省市縣市. */
    @XmlElement(name = "HCity", required = true)
    @FieldName("夫省市縣市")
    private String hCity;

    /** 夫鄉鎮市區. */
    @XmlElement(name = "HTwon", required = true)
    @FieldName("夫鄉鎮市區")
    private String hTwon;

    /** 夫村里. */
    @XmlElement(name = "HVillage", required = true)
    @FieldName("夫村里")
    private String hVillage;

    /** 夫鄰起. */
    @XmlElement(name = "HStartNeighbor", required = true)
    @FieldName("夫鄰起")
    private String hStartNeighbor;

    /** 夫鄰迄. */
    @XmlElement(name = "HEndNeighbor", required = true)
    @FieldName("夫鄰迄")
    private String hEndNeighbor;

    /** 夫地址. */
    @XmlElement(name = "HAddress", required = true)
    @FieldName("夫地址")
    private String hAddress;

    /** 妻出生日期起. */
    @XmlElement(name = "WBirthDateStart", required = true)
    @FieldName("妻出生日期起")
    private String wBirthDateStart;

    /** 妻出生日期迄. */
    @XmlElement(name = "WBirthDateEnd", required = true)
    @FieldName("妻出生日期迄")
    private String wBirthDateEnd;

    /** 妻國籍或區域代碼. */
    @XmlElement(name = "WAboriginalIdentity", required = true)
    @FieldName("妻國籍或區域代碼")
    private String wAboriginalIdentity;

    /** 妻部落. */
    @XmlElement(name = "WTribes", required = true)
    @FieldName("妻部落")
    private String wTribes;

    /** 妻地區. */
    @XmlElement(name = "WRegion", required = true)
    @FieldName("妻地區")
    private String wRegion;

    /** 妻出生別. */
    @XmlElement(name = "WBirthType", required = true)
    @FieldName("妻出生別")
    private String wBirthType;

    /** 妻教育程度. */
    @XmlElement(name = "WEducation", required = true)
    @FieldName("妻教育程度")
    private String wEducation;

    /** 妻婚前婚姻狀況. */
    @XmlElement(name = "WMaritalStatus", required = true)
    @FieldName("妻婚前婚姻狀況")
    private String wMaritalStatus;

    /** 妻省市縣市. */
    @XmlElement(name = "WCity", required = true)
    @FieldName("妻省市縣市")
    private String wCity;

    /** 妻鄉鎮市區. */
    @XmlElement(name = "WTwon", required = true)
    @FieldName("妻鄉鎮市區")
    private String wTwon;

    /** 妻村里. */
    @XmlElement(name = "WVillage", required = true)
    @FieldName("妻村里")
    private String wVillage;

    /** 妻鄰起. */
    @XmlElement(name = "WStartNeighbor", required = true)
    @FieldName("妻鄰起")
    private String wStartNeighbor;

    /** 妻鄰迄. */
    @XmlElement(name = "WEndNeighbor", required = true)
    @FieldName("妻鄰迄")
    private String wEndNeighbor;

    /** 妻地址. */
    @XmlElement(name = "WAddress", required = true)
    @FieldName("妻地址")
    private String wAddress;

    /** 結婚日期起. */
    @XmlElement(name = "MarriedDateStart", required = true)
    @FieldName("結婚日期起")
    private String marriedDateStart;

    /** 結婚日期迄. */
    @XmlElement(name = "MarriedDateEnd", required = true)
    @FieldName("結婚日期迄")
    private String marriedDateEnd;

    /** 結婚格式. */
    @XmlElement(name = "MarriedType", required = true)
    @FieldName("結婚格式")
    private String marriedType;

    /** 文件. */
    @XmlElement(name = "Document", required = true)
    @FieldName("文件")
    private String document;

    /** 村里清單. */
    @XmlElement(name = "VillageList", required = true)
    @FieldName("村里清單")
    private List<String> villageList;

    /** 村里. */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /**
     * Gets the report name.
     * 
     * @return the report name
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the report name.
     * 
     * @param reportName
     *            the new report name
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * Gets the reprt type.
     * 
     * @return the reprt type
     */
    public String getReprtType() {
        return reprtType;
    }

    /**
     * Sets the reprt type.
     * 
     * @param reprtType
     *            the new reprt type
     */
    public void setReprtType(String reprtType) {
        this.reprtType = reprtType;
    }

    /**
     * Gets the page type.
     * 
     * @return the page type
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the page type.
     * 
     * @param pageType
     *            the new page type
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * Gets the adds the row.
     * 
     * @return the adds the row
     */
    public String getAddRow() {
        return addRow;
    }

    /**
     * Sets the adds the row.
     * 
     * @param addRow
     *            the new adds the row
     */
    public void setAddRow(String addRow) {
        this.addRow = addRow;
    }

    /**
     * Gets the apply start date.
     * 
     * @return the apply start date
     */
    public Date getApplyStartDate() {
        return applyStartDate;
    }

    /**
     * Sets the apply start date.
     * 
     * @param applyStartDate
     *            the new apply start date
     */
    public void setApplyStartDate(Date applyStartDate) {
        this.applyStartDate = applyStartDate;
    }

    /**
     * Gets the apply end date.
     * 
     * @return the apply end date
     */
    public Date getApplyEndDate() {
        return applyEndDate;
    }

    /**
     * Sets the apply end date.
     * 
     * @param applyEndDate
     *            the new apply end date
     */
    public void setApplyEndDate(Date applyEndDate) {
        this.applyEndDate = applyEndDate;
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
     * Gets the h birth date start.
     * 
     * @return the h birth date start
     */
    public String gethBirthDateStart() {
        return hBirthDateStart;
    }

    /**
     * Sets the h birth date start.
     * 
     * @param hBirthDateStart
     *            the new h birth date start
     */
    public void sethBirthDateStart(String hBirthDateStart) {
        this.hBirthDateStart = hBirthDateStart;
    }

    /**
     * Gets the h birth date end.
     * 
     * @return the h birth date end
     */
    public String gethBirthDateEnd() {
        return hBirthDateEnd;
    }

    /**
     * Sets the h birth date end.
     * 
     * @param hBirthDateEnd
     *            the new h birth date end
     */
    public void sethBirthDateEnd(String hBirthDateEnd) {
        this.hBirthDateEnd = hBirthDateEnd;
    }

    /**
     * Gets the h aboriginal identity.
     * 
     * @return the h aboriginal identity
     */
    public String gethAboriginalIdentity() {
        return hAboriginalIdentity;
    }

    /**
     * Sets the h aboriginal identity.
     * 
     * @param hAboriginalIdentity
     *            the new h aboriginal identity
     */
    public void sethAboriginalIdentity(String hAboriginalIdentity) {
        this.hAboriginalIdentity = hAboriginalIdentity;
    }

    /**
     * Gets the h tribes.
     * 
     * @return the h tribes
     */
    public String gethTribes() {
        return hTribes;
    }

    /**
     * Sets the h tribes.
     * 
     * @param hTribes
     *            the new h tribes
     */
    public void sethTribes(String hTribes) {
        this.hTribes = hTribes;
    }

    /**
     * Gets the h region.
     * 
     * @return the h region
     */
    public String gethRegion() {
        return hRegion;
    }

    /**
     * Sets the h region.
     * 
     * @param hRegion
     *            the new h region
     */
    public void sethRegion(String hRegion) {
        this.hRegion = hRegion;
    }

    /**
     * Gets the h birth type.
     * 
     * @return the h birth type
     */
    public String gethBirthType() {
        return hBirthType;
    }

    /**
     * Sets the h birth type.
     * 
     * @param hBirthType
     *            the new h birth type
     */
    public void sethBirthType(String hBirthType) {
        this.hBirthType = hBirthType;
    }

    /**
     * Gets the h education.
     * 
     * @return the h education
     */
    public String gethEducation() {
        return hEducation;
    }

    /**
     * Sets the h education.
     * 
     * @param hEducation
     *            the new h education
     */
    public void sethEducation(String hEducation) {
        this.hEducation = hEducation;
    }

    /**
     * Gets the h marital status.
     * 
     * @return the h marital status
     */
    public String gethMaritalStatus() {
        return hMaritalStatus;
    }

    /**
     * Sets the h marital status.
     * 
     * @param hMaritalStatus
     *            the new h marital status
     */
    public void sethMaritalStatus(String hMaritalStatus) {
        this.hMaritalStatus = hMaritalStatus;
    }

    /**
     * Gets the military type.
     * 
     * @return the military type
     */
    public String getMilitaryType() {
        return militaryType;
    }

    /**
     * Sets the military type.
     * 
     * @param militaryType
     *            the new military type
     */
    public void setMilitaryType(String militaryType) {
        this.militaryType = militaryType;
    }

    /**
     * Gets the h city.
     * 
     * @return the h city
     */
    public String gethCity() {
        return hCity;
    }

    /**
     * Sets the h city.
     * 
     * @param hCity
     *            the new h city
     */
    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    /**
     * Gets the h twon.
     * 
     * @return the h twon
     */
    public String gethTwon() {
        return hTwon;
    }

    /**
     * Sets the h twon.
     * 
     * @param hTwon
     *            the new h twon
     */
    public void sethTwon(String hTwon) {
        this.hTwon = hTwon;
    }

    /**
     * Gets the h village.
     * 
     * @return the h village
     */
    public String gethVillage() {
        return hVillage;
    }

    /**
     * Sets the h village.
     * 
     * @param hVillage
     *            the new h village
     */
    public void sethVillage(String hVillage) {
        this.hVillage = hVillage;
    }

    /**
     * Gets the h start neighbor.
     * 
     * @return the h start neighbor
     */
    public String gethStartNeighbor() {
        return hStartNeighbor;
    }

    /**
     * Sets the h start neighbor.
     * 
     * @param hStartNeighbor
     *            the new h start neighbor
     */
    public void sethStartNeighbor(String hStartNeighbor) {
        this.hStartNeighbor = hStartNeighbor;
    }

    /**
     * Gets the h end neighbor.
     * 
     * @return the h end neighbor
     */
    public String gethEndNeighbor() {
        return hEndNeighbor;
    }

    /**
     * Sets the h end neighbor.
     * 
     * @param hEndNeighbor
     *            the new h end neighbor
     */
    public void sethEndNeighbor(String hEndNeighbor) {
        this.hEndNeighbor = hEndNeighbor;
    }

    /**
     * Gets the h address.
     * 
     * @return the h address
     */
    public String gethAddress() {
        return hAddress;
    }

    /**
     * Sets the h address.
     * 
     * @param hAddress
     *            the new h address
     */
    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    /**
     * Gets the w birth date start.
     * 
     * @return the w birth date start
     */
    public String getwBirthDateStart() {
        return wBirthDateStart;
    }

    /**
     * Sets the w birth date start.
     * 
     * @param wBirthDateStart
     *            the new w birth date start
     */
    public void setwBirthDateStart(String wBirthDateStart) {
        this.wBirthDateStart = wBirthDateStart;
    }

    /**
     * Gets the w birth date end.
     * 
     * @return the w birth date end
     */
    public String getwBirthDateEnd() {
        return wBirthDateEnd;
    }

    /**
     * Sets the w birth date end.
     * 
     * @param wBirthDateEnd
     *            the new w birth date end
     */
    public void setwBirthDateEnd(String wBirthDateEnd) {
        this.wBirthDateEnd = wBirthDateEnd;
    }

    /**
     * Gets the w aboriginal identity.
     * 
     * @return the w aboriginal identity
     */
    public String getwAboriginalIdentity() {
        return wAboriginalIdentity;
    }

    /**
     * Sets the w aboriginal identity.
     * 
     * @param wAboriginalIdentity
     *            the new w aboriginal identity
     */
    public void setwAboriginalIdentity(String wAboriginalIdentity) {
        this.wAboriginalIdentity = wAboriginalIdentity;
    }

    /**
     * Gets the w tribes.
     * 
     * @return the w tribes
     */
    public String getwTribes() {
        return wTribes;
    }

    /**
     * Sets the w tribes.
     * 
     * @param wTribes
     *            the new w tribes
     */
    public void setwTribes(String wTribes) {
        this.wTribes = wTribes;
    }

    /**
     * Gets the w region.
     * 
     * @return the w region
     */
    public String getwRegion() {
        return wRegion;
    }

    /**
     * Sets the w region.
     * 
     * @param wRegion
     *            the new w region
     */
    public void setwRegion(String wRegion) {
        this.wRegion = wRegion;
    }

    /**
     * Gets the w birth type.
     * 
     * @return the w birth type
     */
    public String getwBirthType() {
        return wBirthType;
    }

    /**
     * Sets the w birth type.
     * 
     * @param wBirthType
     *            the new w birth type
     */
    public void setwBirthType(String wBirthType) {
        this.wBirthType = wBirthType;
    }

    /**
     * Gets the w education.
     * 
     * @return the w education
     */
    public String getwEducation() {
        return wEducation;
    }

    /**
     * Sets the w education.
     * 
     * @param wEducation
     *            the new w education
     */
    public void setwEducation(String wEducation) {
        this.wEducation = wEducation;
    }

    /**
     * Gets the w marital status.
     * 
     * @return the w marital status
     */
    public String getwMaritalStatus() {
        return wMaritalStatus;
    }

    /**
     * Sets the w marital status.
     * 
     * @param wMaritalStatus
     *            the new w marital status
     */
    public void setwMaritalStatus(String wMaritalStatus) {
        this.wMaritalStatus = wMaritalStatus;
    }

    /**
     * Gets the w city.
     * 
     * @return the w city
     */
    public String getwCity() {
        return wCity;
    }

    /**
     * Sets the w city.
     * 
     * @param wCity
     *            the new w city
     */
    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    /**
     * Gets the w twon.
     * 
     * @return the w twon
     */
    public String getwTwon() {
        return wTwon;
    }

    /**
     * Sets the w twon.
     * 
     * @param wTwon
     *            the new w twon
     */
    public void setwTwon(String wTwon) {
        this.wTwon = wTwon;
    }

    /**
     * Gets the w village.
     * 
     * @return the w village
     */
    public String getwVillage() {
        return wVillage;
    }

    /**
     * Sets the w village.
     * 
     * @param wVillage
     *            the new w village
     */
    public void setwVillage(String wVillage) {
        this.wVillage = wVillage;
    }

    /**
     * Gets the w start neighbor.
     * 
     * @return the w start neighbor
     */
    public String getwStartNeighbor() {
        return wStartNeighbor;
    }

    /**
     * Sets the w start neighbor.
     * 
     * @param wStartNeighbor
     *            the new w start neighbor
     */
    public void setwStartNeighbor(String wStartNeighbor) {
        this.wStartNeighbor = wStartNeighbor;
    }

    /**
     * Gets the w end neighbor.
     * 
     * @return the w end neighbor
     */
    public String getwEndNeighbor() {
        return wEndNeighbor;
    }

    /**
     * Sets the w end neighbor.
     * 
     * @param wEndNeighbor
     *            the new w end neighbor
     */
    public void setwEndNeighbor(String wEndNeighbor) {
        this.wEndNeighbor = wEndNeighbor;
    }

    /**
     * Gets the w address.
     * 
     * @return the w address
     */
    public String getwAddress() {
        return wAddress;
    }

    /**
     * Sets the w address.
     * 
     * @param wAddress
     *            the new w address
     */
    public void setwAddress(String wAddress) {
        this.wAddress = wAddress;
    }

    /**
     * Gets the married date start.
     * 
     * @return the married date start
     */
    public String getMarriedDateStart() {
        return marriedDateStart;
    }

    /**
     * Sets the married date start.
     * 
     * @param marriedDateStart
     *            the new married date start
     */
    public void setMarriedDateStart(String marriedDateStart) {
        this.marriedDateStart = marriedDateStart;
    }

    /**
     * Gets the married date end.
     * 
     * @return the married date end
     */
    public String getMarriedDateEnd() {
        return marriedDateEnd;
    }

    /**
     * Sets the married date end.
     * 
     * @param marriedDateEnd
     *            the new married date end
     */
    public void setMarriedDateEnd(String marriedDateEnd) {
        this.marriedDateEnd = marriedDateEnd;
    }

    /**
     * Gets the married type.
     * 
     * @return the married type
     */
    public String getMarriedType() {
        return marriedType;
    }

    /**
     * Sets the married type.
     * 
     * @param marriedType
     *            the new married type
     */
    public void setMarriedType(String marriedType) {
        this.marriedType = marriedType;
    }

    /**
     * Gets the document.
     * 
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the document.
     * 
     * @param document
     *            the new document
     */
    public void setDocument(String document) {
        this.document = document;
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
     * Gets the village list.
     * 
     * @return the village list
     */
    public List<String> getVillageList() {
        if (null == villageList) {
            villageList = new ArrayList<String>();
        }
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

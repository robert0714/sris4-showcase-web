/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl04500DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04500DTO", propOrder = { "printYN", "regDateS", "regDateE", "regKind", "printSort", "pageType",
        "streetDoor", "village1", "neighbor1S", "neighbor1E", "village2", "neighbor2S", "neighbor2E", "village3",
        "neighbor3S", "neighbor3E", "village4", "neighbor4S", "neighbor4E", "village5", "neighbor5S", "neighbor5E",
        "village6", "neighbor6S", "neighbor6E", "village7", "neighbor7S", "neighbor7E", "village8", "neighbor8S",
        "neighbor8E", "village9", "neighbor9S", "neighbor9E", "neighbor9E", "village10", "neighbor10S", "neighbor10E",
        "village11", "neighbor11S", "neighbor11E", "village12", "neighbor12S", "neighbor12E", "village13",
        "neighbor13S", "neighbor13E", "village14", "neighbor14S", "neighbor14E", "village15", "neighbor15S",
        "neighbor15E", "village16", "neighbor16S", "neighbor16E", "village", "neighborS", "neighborE", "allList",
        "reportURL" })
@XmlRootElement(name = "Rl04500DTO")
public class Rl04500DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 全部列印. */
    @XmlElement(name = "PrintYN", required = true)
    @FieldName("全部列印")
    private String printYN = "";

    /** 編釘起始日期. */
    @XmlElement(name = "RegDateS", required = true)
    @FieldName("編釘起始日期")
    private String regDateS = "";

    /** 編釘結束日期. */
    @XmlElement(name = "RegDateE", required = true)
    @FieldName("編釘結束日期")
    private String regDateE = "";

    /** 編釘類別. */
    @XmlElement(name = "RegKind", required = true)
    @FieldName("編釘類別")
    private String regKind = "";

    /** 列印順序. */
    @XmlElement(name = "PrintSort", required = true)
    @FieldName("列印順序")
    private String printSort = "";

    /** 跳頁方式. */
    @XmlElement(name = "PageType", required = true)
    @FieldName("跳頁方式")
    private String pageType = "";

    /** 街路門牌. */
    @XmlElement(name = "StreetDoor", required = true)
    @FieldName("街路門牌")
    private String streetDoor = "";

    /** 村里1. */
    @XmlElement(name = "Village1", required = true)
    @FieldName("村里1")
    private String village1 = "";

    /** 鄰1起. */
    @XmlElement(name = "Neighbor1S", required = true)
    @FieldName("鄰1起")
    private String neighbor1S = "";

    /** 存放村里. */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 存放起鄰. */
    @XmlElement(name = "NeighborS", required = true)
    @FieldName("起鄰")
    private String neighborS;

    /** 存放迄鄰. */
    @XmlElement(name = "NeighborE", required = true)
    @FieldName("迄鄰")
    private String neighborE;

    /** 存放村里鄰. */
    @XmlElement(name = "AllList", required = true)
    @FieldName("存放村里鄰")
    private List<Map<String, String>> allList = new ArrayList<Map<String, String>>();

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    @XmlElement(name = "ReportyKey")
    @FieldName("報表辨識碼")
    private String reportyKey;

    @XmlElement(name = "villageDTO")
    private Rl04500SelectVillageDTO villageDTO = new Rl04500SelectVillageDTO();

    @XmlElement(name = "ReportyKey")
    private List<Rl04500SelectVillageDTO> selectVillage = new ArrayList<Rl04500SelectVillageDTO>();

    public Rl04500SelectVillageDTO getVillageDTO() {
        return villageDTO;
    }

    public void setVillageDTO(Rl04500SelectVillageDTO villageDTO) {
        this.villageDTO = villageDTO;
    }

    public List<Rl04500SelectVillageDTO> getSelectVillage() {
        return selectVillage;
    }

    public void setSelectVillage(List<Rl04500SelectVillageDTO> selectVillage) {
        this.selectVillage = selectVillage;
    }

    /**
     * Gets the printYN
     * 
     * @return the printYN
     */
    public String getPrintYN() {
        return printYN;
    }

    /**
     * Sets the printYN
     * 
     * @param printYN
     *            the printYN to set
     */
    public void setPrintYN(String printYN) {
        this.printYN = printYN;
    }

    /**
     * Gets the regDateS
     * 
     * @return the regDateS
     */
    public String getRegDateS() {
        return regDateS;
    }

    /**
     * Sets the regDateS
     * 
     * @param regDateS
     *            the regDateS to set
     */
    public void setRegDateS(String regDateS) {
        this.regDateS = regDateS;
    }

    /**
     * Gets the regDateE
     * 
     * @return the regDateE
     */
    public String getRegDateE() {
        return regDateE;
    }

    /**
     * Sets the regDateE
     * 
     * @param regDateE
     *            the regDateE to set
     */
    public void setRegDateE(String regDateE) {
        this.regDateE = regDateE;
    }

    /**
     * Gets the regKind
     * 
     * @return the regKind
     */
    public String getRegKind() {
        return regKind;
    }

    /**
     * Sets the regKind
     * 
     * @param regKind
     *            the regKind to set
     */
    public void setRegKind(String regKind) {
        this.regKind = regKind;
    }

    /**
     * Gets the printSort
     * 
     * @return the printSort
     */
    public String getPrintSort() {
        return printSort;
    }

    /**
     * Sets the printSort
     * 
     * @param printSort
     *            the printSort to set
     */
    public void setPrintSort(String printSort) {
        this.printSort = printSort;
    }

    /**
     * Gets the pageType
     * 
     * @return the pageType
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * Sets the pageType
     * 
     * @param pageType
     *            the pageType to set
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * Gets the streetDoor
     * 
     * @return the streetDoor
     */
    public String getStreetDoor() {
        return streetDoor;
    }

    /**
     * Sets the streetDoor
     * 
     * @param streetDoor
     *            the streetDoor to set
     */
    public void setStreetDoor(String streetDoor) {
        this.streetDoor = streetDoor;
    }

    /**
     * Gets the village1
     * 
     * @return the village1
     */
    public String getVillage1() {
        return village1;
    }

    /**
     * Sets the village1
     * 
     * @param village1
     *            the village1 to set
     */
    public void setVillage1(String village1) {
        this.village1 = village1;
    }

    /**
     * Gets the neighbor1S
     * 
     * @return the neighbor1S
     */
    public String getNeighbor1S() {
        return neighbor1S;
    }

    /**
     * Sets the neighbor1S
     * 
     * @param neighbor1s
     *            the neighbor1S to set
     */
    public void setNeighbor1S(String neighbor1s) {
        neighbor1S = neighbor1s;
    }

    /**
     * Gets the serialversionuid
     * 
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the village
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village
     * 
     * @param village
     *            the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighborS
     * 
     * @return the neighborS
     */
    public String getNeighborS() {
        return neighborS;
    }

    /**
     * Sets the neighborS
     * 
     * @param neighborS
     *            the neighborS to set
     */
    public void setNeighborS(String neighborS) {
        this.neighborS = neighborS;
    }

    /**
     * Gets the neighborE
     * 
     * @return the neighborE
     */
    public String getNeighborE() {
        return neighborE;
    }

    /**
     * Sets the neighborE
     * 
     * @param neighborE
     *            the neighborE to set
     */
    public void setNeighborE(String neighborE) {
        this.neighborE = neighborE;
    }

    /**
     * Gets the allList
     * 
     * @return the allList
     */
    public List<Map<String, String>> getAllList() {
        return allList;
    }

    /**
     * Sets the allList
     * 
     * @param allList
     *            the allList to set
     */
    public void setAllList(List<Map<String, String>> allList) {
        this.allList = allList;
    }

    /**
     * @return the reportURL
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * @param reportURL
     *            the reportURL to set
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getReportyKey() {
        return reportyKey;
    }

    public void setReportyKey(String reportyKey) {
        this.reportyKey = reportyKey;
    }

}

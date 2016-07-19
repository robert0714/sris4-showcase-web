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
 * 製作行政區域調整及門牌整編戶口名簿改註及換證通知單.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02c30DTO", propOrder = { "effDate", "printOption", "printItemOption", "addressOption", "village",
        "neighbor", "doorPlate", "acceptDateS", "acceptDateE", "acceptTimeS", "acceptTimeE", "ReportFormat",
        "ReportURL" })
@XmlRootElement(name = "Rl02c30DTO")
public class Rl02c30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 生效日期. */
    @XmlElement(name = "EffDate")
    @FieldName("生效日期")
    private String effDate;

    /** 列印順序. */
    @XmlElement(name = "PrintOption")
    @FieldName("列印順序")
    private String printOption;

    /** 列印條件選項. */
    @XmlElement(name = "PrintItemOption")
    @FieldName("列印條件選項")
    private String printItemOption;

    /** 查詢地址選項. */
    @XmlElement(name = "AddressOption")
    @FieldName("查詢地址選項")
    private String addressOption;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 門牌. */
    @XmlElement(name = "DoorPlate")
    @FieldName("門牌")
    private String doorPlate;

    /** 受理日期起始. */
    @XmlElement(name = "AcceptDateS")
    @FieldName("受理日期起始")
    private String acceptDateS;

    /** 受理日期結束. */
    @XmlElement(name = "AcceptDateE")
    @FieldName("受理日期結束")
    private String acceptDateE;

    /** 受理時間起始. */
    @XmlElement(name = "AcceptTimeS")
    @FieldName("受理時間起始")
    private String acceptTimeS;

    /** 受理時間結束. */
    @XmlElement(name = "AcceptTimeE")
    @FieldName("受理時間結束")
    private String acceptTimeE;

    /** 統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the eff date.
     * 
     * @return the eff date
     */
    public String getEffDate() {
        return effDate;
    }

    /**
     * Sets the eff date.
     * 
     * @param effDate
     *            the new eff date
     */
    public void setEffDate(String effDate) {
        this.effDate = effDate;
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
     * Gets the address option.
     * 
     * @return the address option
     */
    public String getAddressOption() {
        return addressOption;
    }

    /**
     * Sets the address option.
     * 
     * @param addressOption
     *            the new address option
     */
    public void setAddressOption(String addressOption) {
        this.addressOption = addressOption;
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
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the door plate.
     * 
     * @return the door plate
     */
    public String getDoorPlate() {
        return doorPlate;
    }

    /**
     * Sets the door plate.
     * 
     * @param doorPlate
     *            the new door plate
     */
    public void setDoorPlate(String doorPlate) {
        this.doorPlate = doorPlate;
    }

    /**
     * Gets the accept date s.
     * 
     * @return the accept date s
     */
    public String getAcceptDateS() {
        return acceptDateS;
    }

    /**
     * Sets the accept date s.
     * 
     * @param acceptDateS
     *            the new accept date s
     */
    public void setAcceptDateS(String acceptDateS) {
        this.acceptDateS = acceptDateS;
    }

    /**
     * Gets the accept date e.
     * 
     * @return the accept date e
     */
    public String getAcceptDateE() {
        return acceptDateE;
    }

    /**
     * Sets the accept date e.
     * 
     * @param acceptDateE
     *            the new accept date e
     */
    public void setAcceptDateE(String acceptDateE) {
        this.acceptDateE = acceptDateE;
    }

    /**
     * Gets the accept time s.
     * 
     * @return the accept time s
     */
    public String getAcceptTimeS() {
        return acceptTimeS;
    }

    /**
     * Sets the accept time s.
     * 
     * @param acceptTimeS
     *            the new accept time s
     */
    public void setAcceptTimeS(String acceptTimeS) {
        this.acceptTimeS = acceptTimeS;
    }

    /**
     * Gets the accept time e.
     * 
     * @return the accept time e
     */
    public String getAcceptTimeE() {
        return acceptTimeE;
    }

    /**
     * Sets the accept time e.
     * 
     * @param acceptTimeE
     *            the new accept time e
     */
    public void setAcceptTimeE(String acceptTimeE) {
        this.acceptTimeE = acceptTimeE;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
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

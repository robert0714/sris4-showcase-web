/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
 * The Class Rl05240DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05232DTO", propOrder = { "pringType", "printCondition", "personId", "dateStart", "dateEnd", "military", "reportType" })
@XmlRootElement(name = "Rl05232DTO")
public class Rl05240DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 列印種類
    /** The print type. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType;

    // 列印條件
    /** The print condition. */
    @XmlElement(name = "PrintCondition")
    @FieldName("列印條件")
    private String printCondition;

    // 統一編號
    /** The person id. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    // 通報日期起
    /** The date start. */
    @XmlElement(name = "DateStart")
    @FieldName("通報日期起")
    private String dateStart;

    // 通報日期迄
    /** The date end. */
    @XmlElement(name = "DateEnd")
    @FieldName("通報日期迄")
    private String dateEnd;

    // 役別
    /** The military. */
    @XmlElement(name = "Military")
    @FieldName("役別")
    private String military;

    // 另存檔案格式
    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

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
     * Gets the prints the condition.
     * 
     * @return the prints the condition
     */
    public String getPrintCondition() {
        return printCondition;
    }

    /**
     * Sets the prints the condition.
     * 
     * @param printCondition
     *            the new prints the condition
     */
    public void setPrintCondition(String printCondition) {
        this.printCondition = printCondition;
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
     * Gets the military.
     * 
     * @return the military
     */
    public String getMilitary() {
        return military;
    }

    /**
     * Sets the military.
     * 
     * @param military
     *            the new military
     */
    public void setMilitary(String military) {
        this.military = military;
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
}

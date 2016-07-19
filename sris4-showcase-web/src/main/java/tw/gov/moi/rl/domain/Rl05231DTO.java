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
 * The Class Rl05231DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05231DTO", propOrder = { "printType", "printType2", "dateStart", "dateEnd", "serialNo", "reportType" })
@XmlRootElement(name = "Rl05231DTO")
public class Rl05231DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 列印類別. */
    @XmlElement(name = "PrintType")
    @FieldName("列印類別")
    private String printType;

    /** The print type2. */
    @XmlElement(name = "PrintType2")
    @FieldName("列印類別2")
    private String printType2;

    /** 通報日期起. */
    @XmlElement(name = "DateStart")
    @FieldName("通報日期起")
    private String dateStart;

    /** 通報日期訖. */
    @XmlElement(name = "DateEnd")
    @FieldName("通報日期訖")
    private String dateEnd;

    /** 通報序號. */
    @XmlElement(name = "SerialNo")
    @FieldName("通報序號")
    private String serialNo;

    /** 報表格式. */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private String reportUrl;
    
    // 受理時間起
    /** The time hh start. */
    @XmlElement(name = "TimeHhStart")
    @FieldName("受理日期起")
    private String timeHhStart;

    // 受理時間迄
    /** The time hh end. */
    @XmlElement(name = "TimeHhEnd")
    @FieldName("受理時間迄")
    private String timeHhEnd;

    // 受理時間起
    /** The time mm start. */
    @XmlElement(name = "TimeMmStart")
    @FieldName("受理時間起")
    private String timeMmStart = "00";

    // 受理時間迄
    /** The time mm end. */
    @XmlElement(name = "TimeMmEnd")
    @FieldName("受理時間迄")
    private String timeMmEnd = "00";

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
     * Gets the serial no.
     * 
     * @return the serial no
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the serial no.
     * 
     * @param serialNo
     *            the new serial no
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * Gets the prints the type2.
     * 
     * @return the prints the type2
     */
    public String getPrintType2() {
        return printType2;
    }

    /**
     * Sets the prints the type2.
     * 
     * @param printType2
     *            the new prints the type2
     */
    public void setPrintType2(String printType2) {
        this.printType2 = printType2;
    }

    public String getTimeHhStart() {
        return timeHhStart;
    }

    public void setTimeHhStart(String timeHhStart) {
        this.timeHhStart = timeHhStart;
    }

    public String getTimeHhEnd() {
        return timeHhEnd;
    }

    public void setTimeHhEnd(String timeHhEnd) {
        this.timeHhEnd = timeHhEnd;
    }

    public String getTimeMmStart() {
        return timeMmStart;
    }

    public void setTimeMmStart(String timeMmStart) {
        this.timeMmStart = timeMmStart;
    }

    public String getTimeMmEnd() {
        return timeMmEnd;
    }

    public void setTimeMmEnd(String timeMmEnd) {
        this.timeMmEnd = timeMmEnd;
    }
}

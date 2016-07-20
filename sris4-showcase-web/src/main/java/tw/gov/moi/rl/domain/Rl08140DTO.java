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
 * The Class Rl08140DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08140DTO", propOrder = { "dateStart", "dateEnd", "timeHhStart", "timeHhEnd", "timeMmStart", "timeMmEnd", "printType", "reportType" })
@XmlRootElement(name = "Rl08140DTO")
public class Rl08140DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // 受理日期起
    /** The date start. */
    @XmlElement(name = "DateStart")
    @FieldName("受理日期起")
    private String dateStart;

    // 受理日期迄
    /** The date end. */
    @XmlElement(name = "DateEnd")
    @FieldName("受理日期迄")
    private String dateEnd;

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
    private String timeMmStart;

    // 受理時間迄
    /** The time mm end. */
    @XmlElement(name = "TimeMmEnd")
    @FieldName("受理時間迄")
    private String timeMmEnd;

    // 列表方式
    /** The print type. */
    @XmlElement(name = "PrintType")
    @FieldName("列表方式")
    private String printType;

    // 另存檔案格式
    /** The report type. */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;
    
    /** 報表路徑 */
    @XmlElement(name = "reportUrl")
    @FieldName("報表路徑")
    private String reportUrl;
    
    @XmlElement(name = "timeLimit")
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
     * Gets the time hh start.
     * 
     * @return the time hh start
     */
    public String getTimeHhStart() {
        return timeHhStart;
    }

    /**
     * Sets the time hh start.
     * 
     * @param timeHhStart
     *            the new time hh start
     */
    public void setTimeHhStart(String timeHhStart) {
        this.timeHhStart = timeHhStart;
    }

    /**
     * Gets the time hh end.
     * 
     * @return the time hh end
     */
    public String getTimeHhEnd() {
        return timeHhEnd;
    }

    /**
     * Sets the time hh end.
     * 
     * @param timeHhEnd
     *            the new time hh end
     */
    public void setTimeHhEnd(String timeHhEnd) {
        this.timeHhEnd = timeHhEnd;
    }

    /**
     * Gets the time mm start.
     * 
     * @return the time mm start
     */
    public String getTimeMmStart() {
        return timeMmStart;
    }

    /**
     * Sets the time mm start.
     * 
     * @param timeMmStart
     *            the new time mm start
     */
    public void setTimeMmStart(String timeMmStart) {
        this.timeMmStart = timeMmStart;
    }

    /**
     * Gets the time mm end.
     * 
     * @return the time mm end
     */
    public String getTimeMmEnd() {
        return timeMmEnd;
    }

    /**
     * Sets the time mm end.
     * 
     * @param timeMmEnd
     *            the new time mm end
     */
    public void setTimeMmEnd(String timeMmEnd) {
        this.timeMmEnd = timeMmEnd;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
        result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
        result = prime * result + ((printType == null) ? 0 : printType.hashCode());
        result = prime * result + ((timeHhEnd == null) ? 0 : timeHhEnd.hashCode());
        result = prime * result + ((timeHhStart == null) ? 0 : timeHhStart.hashCode());
        result = prime * result + ((timeMmEnd == null) ? 0 : timeMmEnd.hashCode());
        result = prime * result + ((timeMmStart == null) ? 0 : timeMmStart.hashCode());
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
        Rl08140DTO other = (Rl08140DTO) obj;
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
        if (printType == null) {
            if (other.printType != null)
                return false;
        } else if (!printType.equals(other.printType))
            return false;
        if (timeHhEnd == null) {
            if (other.timeHhEnd != null)
                return false;
        } else if (!timeHhEnd.equals(other.timeHhEnd))
            return false;
        if (timeHhStart == null) {
            if (other.timeHhStart != null)
                return false;
        } else if (!timeHhStart.equals(other.timeHhStart))
            return false;
        if (timeMmEnd == null) {
            if (other.timeMmEnd != null)
                return false;
        } else if (!timeMmEnd.equals(other.timeMmEnd))
            return false;
        if (timeMmStart == null) {
            if (other.timeMmStart != null)
                return false;
        } else if (!timeMmStart.equals(other.timeMmStart))
            return false;
        return true;
    }
}

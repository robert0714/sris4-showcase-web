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
 * The Class Rl08110DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08110DTO", propOrder = { "StatisticYyy", "StatisticMm", "PrintType", "ReportUrl", "ReportFormat" })
@XmlRootElement(name = "Rl08110DTO")
public class Rl08110DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統計年 */
    @FieldName("統計年")
    @XmlElement(name = "StatisticYyy")
    private String statisticYyy;

    /** 統計月 */
    @FieldName("統計月")
    @XmlElement(name = "StatisticMm")
    private String statisticMm;

    /** 列印區域 */
    @FieldName("列印區域")
    @XmlElement(name = "PrintType")
    private String printType;

    /** 報表位置 */
    @FieldName("報表格式")
    @XmlElement(name = "ReportUrl")
    private String reportUrl;

    /** 報表格式 */
    @FieldName("報表格式")
    @XmlElement(name = "ReportFormat")
    private String reportFormat;
    
    private boolean doCheating2AlreadyRunning;
    
    private boolean doCheating3AlreadyRunning;

    public boolean isDoCheating3AlreadyRunning() {
        return doCheating3AlreadyRunning;
    }

    public void setDoCheating3AlreadyRunning(boolean doCheating3AlreadyRunning) {
        this.doCheating3AlreadyRunning = doCheating3AlreadyRunning;
    }

    public boolean isDoCheating2AlreadyRunning() {
        return doCheating2AlreadyRunning;
    }

    public void setDoCheating2AlreadyRunning(boolean doCheating2AlreadyRunning) {
        this.doCheating2AlreadyRunning = doCheating2AlreadyRunning;
    }

    public String getStatisticYyy() {
        return statisticYyy;
    }

    public void setStatisticYyy(String statisticYyy) {
        this.statisticYyy = statisticYyy;
    }

    public String getStatisticMm() {
        return statisticMm;
    }

    public void setStatisticMm(String statisticMm) {
        this.statisticMm = statisticMm;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((printType == null) ? 0 : printType.hashCode());
        result = prime * result + ((statisticMm == null) ? 0 : statisticMm.hashCode());
        result = prime * result + ((statisticYyy == null) ? 0 : statisticYyy.hashCode());
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
        Rl08110DTO other = (Rl08110DTO) obj;
        if (printType == null) {
            if (other.printType != null)
                return false;
        } else if (!printType.equals(other.printType))
            return false;
        if (statisticMm == null) {
            if (other.statisticMm != null)
                return false;
        } else if (!statisticMm.equals(other.statisticMm))
            return false;
        if (statisticYyy == null) {
            if (other.statisticYyy != null)
                return false;
        } else if (!statisticYyy.equals(other.statisticYyy))
            return false;
        return true;
    }
}

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

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08140DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl08111DTO")
public class Rl08111DTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(name = "dateStart")
    @FieldName("日期起")
    private String dateStart;
    
    @XmlElement(name = "dateEnd")
    @FieldName("日期迄")
    private String dateEnd;
    
    @XmlElement(name = "yyy")
    @FieldName("年")
    private String yyy;
    
    @XmlElement(name = "mm")
    @FieldName("月")
    private String mm;
    
    @XmlElement(name = "yyy_")
    @FieldName("年")
    private String yyy_;
    
    @XmlElement(name = "mm_")
    @FieldName("月")
    private String mm_;
    
    @XmlElement(name = "yyy1")
    @FieldName("年")
    private String yyy1;

    @XmlElement(name = "reportUrl")
    @FieldName("列印路徑")
    private String reportUrl;
    
    @XmlElement(name = "reportType")
    @FieldName("列印類型 - pdf,doc")
    private String reportType;
    
    @XmlElement(name = "reportSelect")
    @FieldName("報表類型 - 月報年報日報")
    private String reportSelect;
    

    public String getYyy1() {
        return yyy1;
    }

    public void setYyy1(String yyy1) {
        this.yyy1 = yyy1;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getYyy() {
        return yyy;
    }

    public void setYyy(String yyy) {
        this.yyy = yyy;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportSelect() {
        return reportSelect;
    }

    public void setReportSelect(String reportSelect) {
        this.reportSelect = reportSelect;
    }

    public String getYyy_() {
        return yyy_;
    }

    public void setYyy_(String yyy_) {
        this.yyy_ = yyy_;
    }

    public String getMm_() {
        return mm_;
    }

    public void setMm_(String mm_) {
        this.mm_ = mm_;
    }
}

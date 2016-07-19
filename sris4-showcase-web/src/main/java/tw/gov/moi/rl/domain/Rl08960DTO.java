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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08960DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08960DTO", propOrder = { "type", "startYyymmdd", "endYyymmdd", "reportFormat", "reportURL",
        "rl08960Edit" })
@XmlRootElement(name = "Rl08960DTO")
public class Rl08960DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 列印種類. */
    @XmlElement(name = "Type", required = true)
    @FieldName("列印種類")
    private String type;

    /** 登記日期(起). */
    @XmlElement(name = "StartYyymmdd", required = true)
    @FieldName("登記日期(起)")
    private String startYyymmdd;

    /** 登記日期(迄). */
    @XmlElement(name = "EndYyymmdd", required = true)
    @FieldName("登記日期(迄)")
    private String endYyymmdd;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表URL")
    private String reportURL;

    /** Rl08960ResultDTO編輯清單. */
    @XmlElement(name = "Rl08960Edit", required = true)
    @FieldName("Rl08960ResultDTO編輯清單")
    private List<Rl08960ResultDTO> rl08960Edit;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the start yyymmdd.
     * 
     * @return the start yyymmdd
     */
    public String getStartYyymmdd() {
        return startYyymmdd;
    }

    /**
     * Sets the start yyymmdd.
     * 
     * @param startYyymmdd
     *            the new start yyymmdd
     */
    public void setStartYyymmdd(String startYyymmdd) {
        this.startYyymmdd = startYyymmdd;
    }

    /**
     * Gets the end yyymmdd.
     * 
     * @return the end yyymmdd
     */
    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    /**
     * Sets the end yyymmdd.
     * 
     * @param endYyymmdd
     *            the new end yyymmdd
     */
    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
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

    /**
     * Gets the rl08960 edit.
     * 
     * @return the rl08960 edit
     */
    public List<Rl08960ResultDTO> getRl08960Edit() {
        if (rl08960Edit == null) {
            rl08960Edit = new ArrayList<Rl08960ResultDTO>();
        }
        return rl08960Edit;
    }

    /**
     * Sets the rl08960 edit.
     * 
     * @param rl08960Edit
     *            the new rl08960 edit
     */
    public void setRl08960Edit(List<Rl08960ResultDTO> rl08960Edit) {
        this.rl08960Edit = rl08960Edit;
    }

}

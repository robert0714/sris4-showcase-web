/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf043mType;
import tw.gov.moi.domain.Rldf044mType;

/**
 * The Class Rl05282DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05282DTO", propOrder = { "reportUrl", "rldf044mTypeList" })
@XmlRootElement(name = "Rl05282DTO")
public class Rl05282DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The report url. */
    @XmlElement(name = "ReportUrl")
    @FieldName("reportUrl")
    private String reportUrl;

    /** The rldf044m type list. */
    @XmlElement(name = "Rldf044mTypeList")
    @FieldName("rldf044mTypeList")
    private List<Rldf044mType> rldf044mTypeList;

    private Rldf043mType nowRldf043mType;

    private Rldf004mType nowRldf004mType;

    private List<Rldf043mType> queryList = new ArrayList<Rldf043mType>();

    public List<Rldf043mType> getQueryList() {
        return queryList;
    }

    public void setQueryList(List<Rldf043mType> queryList) {
        this.queryList = queryList;
    }

    public Rldf043mType getNowRldf043mType() {
        return nowRldf043mType;
    }

    public void setNowRldf043mType(Rldf043mType nowRldf043mType) {
        this.nowRldf043mType = nowRldf043mType;
    }

    public Rldf004mType getNowRldf004mType() {
        return nowRldf004mType;
    }

    public void setNowRldf004mType(Rldf004mType nowRldf004mType) {
        this.nowRldf004mType = nowRldf004mType;
    }

    /**
     * Gets the rldf044m type list.
     * 
     * @return the rldf044m type list
     */
    public List<Rldf044mType> getRldf044mTypeList() {
        return rldf044mTypeList;
    }

    /**
     * Sets the rldf044m type list.
     * 
     * @param rldf044mTypeList
     *            the new rldf044m type list
     */
    public void setRldf044mTypeList(List<Rldf044mType> rldf044mTypeList) {
        this.rldf044mTypeList = rldf044mTypeList;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }
}

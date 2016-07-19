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
import tw.gov.moi.domain.Rldf041mType;
import tw.gov.moi.domain.Rldf042mType;

/**
 * The Class Rl05281DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05281DTO", propOrder = { "reportUrl", "rldf042mTypeList", "insertObjList", "deleteObjList",
        "updateObjList" })
@XmlRootElement(name = "Rl05281DTO")
public class Rl05281DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The report url. */
    @XmlElement(name = "ReportUrl")
    @FieldName("reportUrl")
    private String reportUrl;

    /** The rldf042m type list. */
    @XmlElement(name = "Rldf042mTypeList")
    @FieldName("rldf042mTypeList")
    private List<Rldf042mType> rldf042mTypeList;

    /** The insert obj list. */
    @XmlElement(name = "InsertObjList")
    @FieldName("insertObjList")
    private List<Object> insertObjList = new ArrayList<Object>();

    /** The delete obj list. */
    @XmlElement(name = "DeleteObjList")
    @FieldName("deleteObjList")
    private List<Object> deleteObjList = new ArrayList<Object>();

    /** The update obj list. */
    @XmlElement(name = "UpdateObjList")
    @FieldName("updateObjList")
    private List<Object> updateObjList = new ArrayList<Object>();

    private Rldf041mType nowRldf041mType = null;

    private Rldf004mType nowRldf004mType = null;

    private List<Rldf041mType> queryList = new ArrayList<Rldf041mType>();

    public List<Rldf041mType> getQueryList() {
        return queryList;
    }

    public void setQueryList(List<Rldf041mType> queryList) {
        this.queryList = queryList;
    }

    public Rldf004mType getNowRldf004mType() {
        return nowRldf004mType;
    }

    public void setNowRldf004mType(Rldf004mType nowRldf004mType) {
        this.nowRldf004mType = nowRldf004mType;
    }

    public Rldf041mType getNowRldf041mType() {
        return nowRldf041mType;
    }

    public void setNowRldf041mType(Rldf041mType nowRldf041mType) {
        this.nowRldf041mType = nowRldf041mType;
    }

    /**
     * Gets the update obj list.
     * 
     * @return the update obj list
     */
    public List<Object> getUpdateObjList() {
        return updateObjList;
    }

    /**
     * Sets the update obj list.
     * 
     * @param updateObjList
     *            the new update obj list
     */
    public void setUpdateObjList(List<Object> updateObjList) {
        this.updateObjList = updateObjList;
    }

    /**
     * Gets the insert obj list.
     * 
     * @return the insert obj list
     */
    public List<Object> getInsertObjList() {
        return insertObjList;
    }

    /**
     * Sets the insert obj list.
     * 
     * @param insertObjList
     *            the new insert obj list
     */
    public void setInsertObjList(List<Object> insertObjList) {
        this.insertObjList = insertObjList;
    }

    /**
     * Gets the delete obj list.
     * 
     * @return the delete obj list
     */
    public List<Object> getDeleteObjList() {
        return deleteObjList;
    }

    /**
     * Sets the delete obj list.
     * 
     * @param deleteObjList
     *            the new delete obj list
     */
    public void setDeleteObjList(List<Object> deleteObjList) {
        this.deleteObjList = deleteObjList;
    }

    /**
     * Gets the rldf042m type list.
     * 
     * @return the rldf042m type list
     */
    public List<Rldf042mType> getRldf042mTypeList() {
        return rldf042mTypeList;
    }

    /**
     * Sets the rldf042m type list.
     * 
     * @param rldf042mTypeList
     *            the new rldf042m type list
     */
    public void setRldf042mTypeList(List<Rldf042mType> rldf042mTypeList) {
        this.rldf042mTypeList = rldf042mTypeList;
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

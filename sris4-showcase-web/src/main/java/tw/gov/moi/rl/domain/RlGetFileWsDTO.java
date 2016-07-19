/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.RlFetchFileType;

/**
 * 取得File的WS DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetFileWsDTO", propOrder = { "personId", "siteId", "householdHeadId", "householdId",
        "removeYyymmdd", "removeTime", "fetchFileType", "doLock", "doCheckBigHousehold", "qryPersonIds" })
@XmlRootElement(name = "RlGetFileWsDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetFileWsDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /** The person id. */
    @XmlElement(name = "PersonId", required = false)
    @FieldName("統號")
    private String personId;

    /** The site id. */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = StringUtils.EMPTY;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = StringUtils.EMPTY;

    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    @XmlElement(name = "FetchFileType")
    @FieldName("取得檔案的態樣")
    private RlFetchFileType fetchFileType;

    @XmlElement(name = "DoLock")
    @FieldName("鎖定資料與否")
    private boolean doLock;

    @XmlElement(name = "DoCheckBigHousehold")
    @FieldName("鎖定資料與否")
    private boolean doCheckBigHousehold;

    @XmlElement(name = "QryPersonIds")
    @FieldName("要取得個人基本資料的統號")
    private List<String> qryPersonIds = new ArrayList<String>();

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the householdHeadId
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * @param householdHeadId
     *            the householdHeadId to set
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * @return the householdId
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * @param householdId
     *            the householdId to set
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * @return the removeYyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * @param removeYyymmdd
     *            the removeYyymmdd to set
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * @return the fetchFileType
     */
    public RlFetchFileType getFetchFileType() {
        return fetchFileType;
    }

    /**
     * @param fetchFileType
     *            the fetchFileType to set
     */
    public void setFetchFileType(RlFetchFileType fetchFileType) {
        this.fetchFileType = fetchFileType;
    }

    /**
     * @return the doLock
     */
    public boolean isDoLock() {
        return doLock;
    }

    /**
     * @param doLock
     *            the doLock to set
     */
    public void setDoLock(boolean doLock) {
        this.doLock = doLock;
    }

    /**
     * @return the doCheckBigHousehold
     */
    public boolean isDoCheckBigHousehold() {
        return doCheckBigHousehold;
    }

    /**
     * @param doCheckBigHousehold
     *            the doCheckBigHousehold to set
     */
    public void setDoCheckBigHousehold(boolean doCheckBigHousehold) {
        this.doCheckBigHousehold = doCheckBigHousehold;
    }

    /**
     * @return the qryPersonIds
     */
    public List<String> getQryPersonIds() {
        return qryPersonIds;
    }

    /**
     * @param qryPersonIds
     *            the qryPersonIds to set
     */
    public void setQryPersonIds(List<String> qryPersonIds) {
        this.qryPersonIds = qryPersonIds;
    }

}

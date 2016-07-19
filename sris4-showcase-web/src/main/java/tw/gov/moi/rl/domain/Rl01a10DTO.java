/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf030mType;

/**
 * The Class Rl01a10DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a10DTO", propOrder = { "personId", "siteId", "siteIdQuery",
        "viewObj", "deleteArr", "rldf030mList", "rldf001mObj", "rldf004mObj" })
@XmlRootElement(name = "Rl01a10DTO")
public class Rl01a10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteIdQuery", required = true)
    @FieldName("作業點代碼")
    private String siteIdQuery;

    /** 細節項目 */
    @XmlElement(name = "ViewObj", required = true)
    @FieldName("編修項目")
    private Rldf030mType viewObj;

    /** 刪除項目 */
    @XmlElement(name = "DeleteArr", required = true)
    @FieldName("刪除項目")
    private Rldf030mType[] deleteArr;

    /** 查詢清單 */
    @XmlElement(name = "Rldf030mList", required = true)
    @FieldName("查詢清單")
    private List<Rldf030mType> queryList;

    /** rldf001m資料 */
    @XmlElement(name = "Rldf001mObj", required = true)
    @FieldName("rldf001m資料")
    private Rldf001mType rldf001mObj;

    /** rldf004m資料 */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("rldf004m資料")
    private Rldf004mType rldf004mObj;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public Rldf030mType getViewObj() {
        return viewObj;
    }

    public void setViewObj(final Rldf030mType viewObj) {
        this.viewObj = viewObj;
    }

    public Rldf030mType[] getDeleteArr() {
        return deleteArr;
    }

    public void setDeleteArr(final Rldf030mType[] deleteArr) {
        this.deleteArr = deleteArr;
    }

    public List<Rldf030mType> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rldf030mType> queryList) {
        this.queryList = queryList;
    }

    public String getSiteIdQuery() {
        return siteIdQuery;
    }

    public void setSiteIdQuery(final String siteIdQuery) {
        this.siteIdQuery = siteIdQuery;
    }

    public Rldf001mType getRldf001mObj() {
        return rldf001mObj;
    }

    public void setRldf001mObj(final Rldf001mType rldf001mObj) {
        this.rldf001mObj = rldf001mObj;
    }

    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    public void setRldf004mObj(final Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
    }

}

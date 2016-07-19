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

/**
 * The Class Rl01930DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01930DTO", propOrder = { "siteId", "houseHoldHeadId", "houseHoldId",  "queryType","personIdQuery",
        "personIdModify", "personIdQueryList", "queryList", "viewObject","deleteList","confirmMessageDalete", 
         })
@XmlRootElement(name = "Rl01930DTO")
public class Rl01930DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 作業點 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點")
    private String siteId;

    /** 戶長統號 */
    @XmlElement(name = "HouseHoldHeadId", required = true)
    @FieldName("戶長統號")
    private String houseHoldHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseHoldId", required = true)
    @FieldName("戶號")
    private String houseHoldId;

    /** 查詢方式 */
    @XmlElement(name = "QueryType", required = true)
    @FieldName("查詢方式")
    private String queryType;

    /** 身分證統一編號 */
    @XmlElement(name = "PersonIdQuery", required = true)
    @FieldName("身分證統一編號")
    private String personIdQuery;

    /** 身分證統一編號-for修改 */
    @XmlElement(name = "personIdModify", required = true)
    @FieldName("身分證統一編號-for修改")
    private String personIdModify;

    /** 身分證統一編號清單 */
    @XmlElement(name = "PersonIdQueryList", required = true)
    @FieldName("作業點")
    private List<String> personIdQueryList;

    /** 補登資料清單 */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("補登資料清單")
    private List<Rl01930QueryDTO> queryList;

    /** 觀看查詢物件 */
    @XmlElement(name = "ViewObject", required = true)
    @FieldName("觀看查詢物件")
    private Rl01930QueryDTO viewObject;

    /** 刪除補登資料清單 */
    @XmlElement(name = "DeleteList", required = true)
    @FieldName("刪除補登資料清單")
    private Rl01930QueryDTO[] deleteList;

    /** 刪除詢問訊息 */
    @XmlElement(name = "ConfirmMessageDalete", required = true)
    @FieldName("刪除詢問訊息")
    private String confirmMessageDelete;
    

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public String getHouseHoldHeadId() {
        return houseHoldHeadId;
    }

    public void setHouseHoldHeadId(final String houseHoldHeadId) {
        this.houseHoldHeadId = houseHoldHeadId;
    }

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(final String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    public List<String> getPersonIdQueryList() {
        return personIdQueryList;
    }

    public void setPersonIdQueryList(final List<String> personIdQueryList) {
        this.personIdQueryList = personIdQueryList;
    }

    public List<Rl01930QueryDTO> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rl01930QueryDTO> queryList) {
        this.queryList = queryList;
    }

    public String getPersonIdQuery() {
        return personIdQuery;
    }

    public void setPersonIdQuery(final String personIdQuery) {
        this.personIdQuery = personIdQuery;
    }

    public String getConfirmMessageDelete() {
        return confirmMessageDelete;
    }

    public void setConfirmMessageDelete(final String confirmMessageDelete) {
        this.confirmMessageDelete = confirmMessageDelete;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(final String queryType) {
        this.queryType = queryType;
    }

    public Rl01930QueryDTO[] getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(final Rl01930QueryDTO[] deleteList) {
        this.deleteList = deleteList;
    }

    public Rl01930QueryDTO getViewObject() {
        return viewObject;
    }

    public void setViewObject(final Rl01930QueryDTO viewObject) {
        this.viewObject = viewObject;
    }

    public String getPersonIdModify() {
        return personIdModify;
    }

    public void setPersonIdModify(final String personIdModify) {
        this.personIdModify = personIdModify;
    }

}

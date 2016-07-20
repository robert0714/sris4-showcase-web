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
 * The Class Rl02a90DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a90DTO", propOrder = { "queryType", "personId", "siteId", "personIdList", "selectedResult",
        "rl02a90ResultList", "disabledSaveBtn" })
@XmlRootElement(name = "Rl02a90DTO")
public class Rl02a90DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 查詢類別 */
    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType;

    /** 國民身分證統一編號(B類) */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號(B類)")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 國民身分證統一編號(A類) */
    @XmlElement(name = "PersonIdList")
    @FieldName("國民身分證統一編號(A類)")
    private String personIdList[] = new String[6];

    /** 國民身分證請領記錄 */
    @XmlElement(name = "SelectedResult")
    @FieldName("國民身分證請領記錄")
    private Rl02a90ResultDTO selectedResult;

    /** 國民身分證請領記錄清單 */
    @XmlElement(name = "Rl02a90ResultList")
    @FieldName("國民身分證請領記錄清單")
    private List<Rl02a90ResultDTO> rl02a90ResultList = new ArrayList<Rl02a90ResultDTO>();

    @XmlElement(name = "DisabledSaveBtn")
    @FieldName("禁用儲存按鈕")
    private boolean disabledSaveBtn = true;

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String[] getPersonIdList() {
        return personIdList;
    }

    public void setPersonIdList(String[] personIdList) {
        this.personIdList = personIdList;
    }

    public Rl02a90ResultDTO getSelectedResult() {
        return selectedResult;
    }

    public void setSelectedResult(Rl02a90ResultDTO selectedResult) {
        this.selectedResult = selectedResult;
    }

    public List<Rl02a90ResultDTO> getRl02a90ResultList() {
        return rl02a90ResultList;
    }

    public void setRl02a90ResultList(List<Rl02a90ResultDTO> rl02a90ResultList) {
        this.rl02a90ResultList = rl02a90ResultList;
    }

    public boolean isDisabledSaveBtn() {
        return disabledSaveBtn;
    }

    public void setDisabledSaveBtn(boolean disabledSaveBtn) {
        this.disabledSaveBtn = disabledSaveBtn;
    }

}

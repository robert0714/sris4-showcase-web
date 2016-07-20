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
import tw.gov.moi.domain.Xldf1464Type;

/**
 * The Class Rl01464DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01464DTO", propOrder = { "PersonId", "ConfirmMessage", "SiteId", "SiteIdQuery", "ResultList",
        "SelectedListArray", "TodoXldf1464" })
@XmlRootElement(name = "Rl01464DTO")
public class Rl01464DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統一編號")
    private String personId;

    /** 通報詢問訊息 */
    @XmlElement(name = "ConfirmMessage", required = true)
    @FieldName("通報詢問訊息")
    private String confirmMessage;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteIdQuery", required = true)
    @FieldName("作業點代碼")
    private String siteIdQuery;

    /** 查詢結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果")
    private List<Rl01464QueryDTO> resultList;

    /** 選擇項目 */
    @XmlElement(name = "SelectedListArray", required = true)
    @FieldName("選擇項目")
    private Rl01464QueryDTO[] selectedArray;

    /** 待處理資料 */
    @XmlElement(name = "TodoXldf1464", required = true)
    @FieldName("待處理資料")
    private List<Xldf1464Type> todoXldf1464;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public List<Rl01464QueryDTO> getResultList() {
        return resultList;
    }

    public void setResultList(final List<Rl01464QueryDTO> resultList) {
        this.resultList = resultList;
    }

    public String getConfirmMessage() {
        return confirmMessage;
    }

    public void setConfirmMessage(final String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    public Rl01464QueryDTO[] getSelectedArray() {
        return selectedArray;
    }

    public void setSelectedArray(final Rl01464QueryDTO[] selectedArray) {
        this.selectedArray = selectedArray;
    }

    public String getSiteIdQuery() {
        return siteIdQuery;
    }

    public void setSiteIdQuery(String siteIdQuery) {
        this.siteIdQuery = siteIdQuery;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<Xldf1464Type> getTodoXldf1464() {
        return todoXldf1464;
    }

    public void setTodoXldf1464(List<Xldf1464Type> todoXldf1464) {
        this.todoXldf1464 = todoXldf1464;
    }

}

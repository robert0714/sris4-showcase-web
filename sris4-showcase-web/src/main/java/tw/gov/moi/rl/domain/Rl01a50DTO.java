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
import tw.gov.moi.domain.Rldf030tType;

/**
 * The Class Rl01a50DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a50DTO", propOrder = { "personId", "startRegisterYyymmdd", "endRegisterYyymmdd", "modifyObj",
        "queryList" })
@XmlRootElement(name = "Rl01a50DTO")
public class Rl01a50DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 登記日期(起) */
    @XmlElement(name = "StartRegisterYyymmdd", required = true)
    @FieldName("登記日期(起)")
    private String startRegisterYyymmdd;

    /** 登記日期(迄) */
    @XmlElement(name = "EndRegisterYyymmdd", required = true)
    @FieldName("登記日期(迄)")
    private String endRegisterYyymmdd;

    /** 細節項目 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("編修項目")
    private Rldf030tType viewObj;

    /** 查詢清單 */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("查詢清單")
    private List<Rldf030tType> queryList;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public Rldf030tType getViewObj() {
        return viewObj;
    }

    public void setViewObj(final Rldf030tType viewObj) {
        this.viewObj = viewObj;
    }

    public List<Rldf030tType> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rldf030tType> queryList) {
        this.queryList = queryList;
    }

    public String getStartRegisterYyymmdd() {
        return startRegisterYyymmdd;
    }

    public void setStartRegisterYyymmdd(String startRegisterYyymmdd) {
        this.startRegisterYyymmdd = startRegisterYyymmdd;
    }

    public String getEndRegisterYyymmdd() {
        return endRegisterYyymmdd;
    }

    public void setEndRegisterYyymmdd(String endRegisterYyymmdd) {
        this.endRegisterYyymmdd = endRegisterYyymmdd;
    }

}

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
 * The Class Rl02ad0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02ad0DTO", propOrder = { "queryType", "personId", "beginExpireYyymmdd", "endExpireYyymmdd",
        "village", "neighbor", "expireReason", "rl02ac0ResultList" })
@XmlRootElement(name = "Rl02ad0DTO")
public class Rl02ad0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 查詢類別 */
    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 註銷日期(起) */
    @XmlElement(name = "BeginExpireYyymmdd")
    @FieldName("註銷日期(起)")
    private String beginExpireYyymmdd;

    /** 註銷日期(迄) */
    @XmlElement(name = "EndExpireYyymmdd")
    @FieldName("註銷日期(迄)")
    private String endExpireYyymmdd;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 註銷原因 */
    @XmlElement(name = "ExpireReason")
    @FieldName("註銷原因")
    private String expireReason;

    @XmlElement(name = "Rl02ad0ResultList")
    @FieldName("Rl02ad0ResultList")
    private List<Rl02ad0ResultDTO> rl02ad0ResultList;

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

    public String getBeginExpireYyymmdd() {
        return beginExpireYyymmdd;
    }

    public void setBeginExpireYyymmdd(String beginExpireYyymmdd) {
        this.beginExpireYyymmdd = beginExpireYyymmdd;
    }

    public String getEndExpireYyymmdd() {
        return endExpireYyymmdd;
    }

    public void setEndExpireYyymmdd(String endExpireYyymmdd) {
        this.endExpireYyymmdd = endExpireYyymmdd;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getExpireReason() {
        return expireReason;
    }

    public void setExpireReason(String expireReason) {
        this.expireReason = expireReason;
    }

    public List<Rl02ad0ResultDTO> getRl02ad0ResultList() {
        return rl02ad0ResultList;
    }

    public void setRl02ad0ResultList(List<Rl02ad0ResultDTO> rl02ad0ResultList) {
        this.rl02ad0ResultList = rl02ad0ResultList;
    }

}

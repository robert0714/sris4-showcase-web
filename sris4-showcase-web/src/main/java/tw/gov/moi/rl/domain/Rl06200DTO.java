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
import tw.gov.moi.domain.Rldf006sType;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * The Class Rl06200DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06200DTO", propOrder = { "HouseholdId", "SiteIdArr", "Rldf006sList", "ObnfList" })
@XmlRootElement(name = "Rl06200DTO")
public class Rl06200DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** rldf006s List */
    @XmlElement(name = "Rldf006sList", required = true)
    @FieldName("rldf006s List")
    private List<Rldf006sType> rldf006sList;

    /** 作業點陣列 */
    @XmlElement(name = "SiteIdArr", required = true)
    @FieldName("作業點陣列")
    private String[] siteIdArr;

    /** 通報資料 */
    @XmlElement(name = "ObnfList", required = true)
    @FieldName("通報資料")
    private List<ObnfDTO> obnfList;

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    public List<Rldf006sType> getRldf006sList() {
        return rldf006sList;
    }

    public void setRldf006sList(final List<Rldf006sType> rldf006sList) {
        this.rldf006sList = rldf006sList;
    }

    public List<ObnfDTO> getObnfList() {
        return obnfList;
    }

    public void setObnfList(final List<ObnfDTO> obnfList) {
        this.obnfList = obnfList;
    }

    public String[] getSiteIdArr() {
        return siteIdArr;
    }

    public void setSiteIdArr(final String[] siteIdArr) {
        this.siteIdArr = siteIdArr;
    }

}

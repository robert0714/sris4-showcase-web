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
import tw.gov.moi.domain.Rldf007sType;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * The Class Rl06100DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06100DTO", propOrder = { "PersonId", "Rldf007sList", "SiteIdArr", "ObnfList" })
@XmlRootElement(name = "Rl06100DTO")
public class Rl06100DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** rldf007s List */
    @XmlElement(name = "Rldf007sList", required = true)
    @FieldName("rldf007s List")
    private List<Rldf007sType> rldf007sList;

    /** 作業點陣列 */
    @XmlElement(name = "SiteIdArr", required = true)
    @FieldName("作業點陣列")
    private String[] siteIdArr;

    /** 通報資料 */
    @XmlElement(name = "ObnfList", required = true)
    @FieldName("通報資料")
    private List<ObnfDTO> obnfList;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public List<Rldf007sType> getRldf007sList() {
        return rldf007sList;
    }

    public void setRldf007sList(final List<Rldf007sType> rldf007sList) {
        this.rldf007sList = rldf007sList;
    }

    public String[] getSiteIdArr() {
        return siteIdArr;
    }

    public void setSiteIdArr(final String[] siteIdArr) {
        this.siteIdArr = siteIdArr;
    }

    public List<ObnfDTO> getObnfList() {
        return obnfList;
    }

    public void setObnfList(final List<ObnfDTO> obnfList) {
        this.obnfList = obnfList;
    }

}

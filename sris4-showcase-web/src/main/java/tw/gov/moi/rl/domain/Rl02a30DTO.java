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
 * The Class Rl02a30DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a30DTO", propOrder = { "PersonId", "SiteId", "IsCellophane", "Rl02a30ResultList" })
@XmlRootElement(name = "Rl02a30DTO")
public class Rl02a30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 是否已護貝 */
    @XmlElement(name = "IsCellophane")
    @FieldName("是否已護貝")
    private String isCellophane;

    /** Rl02a30ResultDTO */
    @XmlElement(name = "Rl02a30ResultList")
    @FieldName("Rl02a30ResultDTO")
    private List<Rl02a30ResultDTO> rl02a30ResultList = new ArrayList<Rl02a30ResultDTO>();

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

    public String getIsCellophane() {
        return isCellophane;
    }

    public void setIsCellophane(String isCellophane) {
        this.isCellophane = isCellophane;
    }

    public List<Rl02a30ResultDTO> getRl02a30ResultList() {
        return rl02a30ResultList;
    }

    public void setRl02a30ResultList(List<Rl02a30ResultDTO> rl02a30ResultList) {
        this.rl02a30ResultList = rl02a30ResultList;
    }
}

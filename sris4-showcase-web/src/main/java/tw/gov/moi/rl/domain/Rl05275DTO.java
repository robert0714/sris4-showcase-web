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

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 入出境紀錄查詢處理DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05275DTO", propOrder = { "personId", "assignYyymmddStart", "assignYyymmddEnd", "launchOption",
        "resultList" })
@XmlRootElement(name = "Rl05275DTO")
public class Rl05275DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 統一編號 */
    @XmlElement(name = "personId", required = true)
    @FieldName("統一編號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "siteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 查詢結果-出入境紀錄- */
    @XmlElement(name = "resultList", required = true)
    @FieldName("查詢結果-出入境紀錄-")
    private List<Rl05275ResultDTO> resultList;

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
     * @return the resultList
     */
    public List<Rl05275ResultDTO> getResultList() {
        return resultList;
    }

    /**
     * @param resultList
     *            the resultList to set
     */
    public void setResultList(List<Rl05275ResultDTO> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

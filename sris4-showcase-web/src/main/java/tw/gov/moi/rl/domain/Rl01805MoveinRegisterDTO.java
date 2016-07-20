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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 遷出撤銷登記 記事DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01804MoveinRegisterDTO", propOrder = { "selectePersonId", "selectePersonName", "personRegisterList" })
@XmlRootElement(name = "Rl01804MoveinRegisterDTO")
public class Rl01805MoveinRegisterDTO implements Serializable {

    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    private String selectePersonId;

    /** 國民身分證統一編號. */
    private String selectePersonName;

    /** 挑選個人記事. */
    private List<Rl01805SelectRegisterDTO> personRegisterList = new ArrayList<Rl01805SelectRegisterDTO>();

    /**
     * @return the selectePersonId
     */
    public String getSelectePersonId() {
        return selectePersonId;
    }

    /**
     * @param selectePersonId
     *            the selectePersonId to set
     */
    public void setSelectePersonId(String selectePersonId) {
        this.selectePersonId = selectePersonId;
    }

    /**
     * @return the selectePersonName
     */
    public String getSelectePersonName() {
        return selectePersonName;
    }

    /**
     * @param selectePersonName
     *            the selectePersonName to set
     */
    public void setSelectePersonName(String selectePersonName) {
        this.selectePersonName = selectePersonName;
    }

    /**
     * @return the personRegisterList
     */
    public List<Rl01805SelectRegisterDTO> getPersonRegisterList() {
        return personRegisterList;
    }

    /**
     * @param personRegisterList
     *            the personRegisterList to set
     */
    public void setPersonRegisterList(List<Rl01805SelectRegisterDTO> personRegisterList) {
        this.personRegisterList = personRegisterList;
    }

}

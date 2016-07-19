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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlPersonDataResultDTO", propOrder = { "personDataList", "restrictedPersonIds" })
@XmlRootElement(name = "RlPersonDataResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlPersonDataResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4865538287465448613L;

    @XmlElement(name = "PersonDataList")
    @FieldName("個人基本資料串列")
    List<RlPersonalDataDTO> personDataList = new ArrayList<RlPersonalDataDTO>(20);

    @XmlElement(name = "RestrictedPersonIds")
    @FieldName("限制遷徙人口統號")
    List<String> restrictedPersonIds = new ArrayList<String>(20);

    public RlPersonDataResultDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RlPersonDataResultDTO(List<RlPersonalDataDTO> personDataList) {
        super();
        this.personDataList = personDataList;
    }

    /**
     * @return the personDataList
     */
    public List<RlPersonalDataDTO> getPersonDataList() {
        return personDataList;
    }

    /**
     * @param personDataList
     *            the personDataList to set
     */
    public void setPersonDataList(List<RlPersonalDataDTO> personDataList) {
        this.personDataList = personDataList;
    }

    /**
     * @return the restrictedPersonIds
     */
    public List<String> getRestrictedPersonIds() {
        return restrictedPersonIds;
    }

    /**
     * @param restrictedPersonIds
     *            the restrictedPersonIds to set
     */
    public void setRestrictedPersonIds(List<String> restrictedPersonIds) {
        this.restrictedPersonIds = restrictedPersonIds;
    }

}

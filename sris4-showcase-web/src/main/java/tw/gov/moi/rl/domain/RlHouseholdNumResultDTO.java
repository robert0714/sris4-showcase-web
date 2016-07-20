/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

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
@XmlType(name = "rlHouseholdNumResultDTO", propOrder = { "residentNum", "nonResidentNum" })
@XmlRootElement(name = "RlHouseholdNumResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlHouseholdNumResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -646067838680749338L;
    /** 現住人口數. */
    @XmlElement(name = "ResidentNum")
    @FieldName("現住人口數")
    private Integer residentNum = -1;
    /** 非現住人口數(包含除口與死亡). */
    @XmlElement(name = "NonResidentNum")
    @FieldName("非現住人口數")
    private Integer nonResidentNum = -1;

    /**
     * @return the residentNum
     */
    public Integer getResidentNum() {
        return residentNum;
    }

    /**
     * @param residentNum
     *            the residentNum to set
     */
    public void setResidentNum(Integer residentNum) {
        this.residentNum = residentNum;
    }

    /**
     * @return the nonResidentNum
     */
    public Integer getNonResidentNum() {
        return nonResidentNum;
    }

    /**
     * @param nonResidentNum
     *            the nonResidentNum to set
     */
    public void setNonResidentNum(Integer nonResidentNum) {
        this.nonResidentNum = nonResidentNum;
    }

}

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
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRmve41ResultDTO", propOrder = { "personData", "householdData" })
@XmlRootElement(name = "RlRmve41ResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlRmve41ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -646067838680749338L;
    /** 除戶個人基本資料. */
    @XmlElement(name = "PersonData")
    @FieldName("除戶個人基本資料")
    private Rldf004hType personData;

    /** 除戶全戶基本資料. */
    @XmlElement(name = "HouseholdData")
    @FieldName("除戶全戶基本資料")
    private Rldf001hType householdData;

    /**
     * @return the personData
     */
    public Rldf004hType getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(Rldf004hType personData) {
        this.personData = personData;
    }

    /**
     * @return the householdData
     */
    public Rldf001hType getHouseholdData() {
        return householdData;
    }

    /**
     * @param householdData
     *            the householdData to set
     */
    public void setHouseholdData(Rldf001hType householdData) {
        this.householdData = householdData;
    }

}

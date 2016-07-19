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

/**
 * The Class Rl03200ErrorDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03200ErrorDTO", propOrder = { "householdHeadId", "householdId", "returnMsg" })
@XmlRootElement(name = "Rl03200ErrorDTO")
public class Rl03200ErrorDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 戶長國民身分證統一編號 */
    @FieldName("戶長國民身分證統一編號")
    @XmlElement(name = "HouseholdHeadId")
    private String householdHeadId;

    /** 戶號 */
    @FieldName("戶號")
    @XmlElement(name = "HouseholdId")
    private String householdId;

    /** 回覆訊息 */
    @FieldName("回覆訊息")
    @XmlElement(name = "ReturnMsg")
    private String returnMsg;

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

}

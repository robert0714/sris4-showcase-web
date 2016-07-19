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
 * 取得File 回傳的訊息DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetFileReturnDTO", propOrder = { "ifBigHousehold", "ifCommonBusinssHousehold", "ifMoveinplaceData",
        "moveinPlaceHouseholdHeadId", "moveinPlaceHouseholdId" })
@XmlRootElement(name = "RlGetPersonIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetFileReturnDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** The IfBigHousehold. */
    @XmlElement(name = "IfBigHousehold", required = false)
    @FieldName("是否為大戶")
    private boolean ifBigHousehold;

    /** The IfBigHousehold. */
    @XmlElement(name = "IfCommonBusinssHousehold", required = false)
    @FieldName("是否為共同事業戶")
    private boolean ifCommonBusinssHousehold;

    @XmlElement(name = "IfMoveinplaceData", required = false)
    @FieldName("是否有遷入地除口資料")
    private boolean ifMoveinplaceData;

    @XmlElement(name = "MoveinPlaceHouseholdHeadId", required = false)
    @FieldName("遷入地除口戶長統號")
    private String moveinPlaceHouseholdHeadId;

    @XmlElement(name = "MoveinPlaceHouseholdId", required = false)
    @FieldName("遷入地除口戶號")
    private String moveinPlaceHouseholdId;

    public RlGetFileReturnDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RlGetFileReturnDTO(boolean ifBigHousehold) {
        super();
        this.ifBigHousehold = ifBigHousehold;
    }

    /**
     * @return the ifBigHousehold
     */
    public boolean isIfBigHousehold() {
        return ifBigHousehold;
    }

    /**
     * @param ifBigHousehold
     *            the ifBigHousehold to set
     */
    public void setIfBigHousehold(boolean ifBigHousehold) {
        this.ifBigHousehold = ifBigHousehold;
    }

    /**
     * @return the ifCommonBusinssHousehold
     */
    public boolean isIfCommonBusinssHousehold() {
        return ifCommonBusinssHousehold;
    }

    /**
     * @param ifCommonBusinssHousehold
     *            the ifCommonBusinssHousehold to set
     */
    public void setIfCommonBusinssHousehold(boolean ifCommonBusinssHousehold) {
        this.ifCommonBusinssHousehold = ifCommonBusinssHousehold;
    }

    /**
     * @return the ifMoveinplaceData
     */
    public boolean isIfMoveinplaceData() {
        return ifMoveinplaceData;
    }

    /**
     * @param ifMoveinplaceData
     *            the ifMoveinplaceData to set
     */
    public void setIfMoveinplaceData(boolean ifMoveinplaceData) {
        this.ifMoveinplaceData = ifMoveinplaceData;
    }

    /**
     * @return the moveinPlaceHouseholdHeadId
     */
    public String getMoveinPlaceHouseholdHeadId() {
        return moveinPlaceHouseholdHeadId;
    }

    /**
     * @param moveinPlaceHouseholdHeadId
     *            the moveinPlaceHouseholdHeadId to set
     */
    public void setMoveinPlaceHouseholdHeadId(String moveinPlaceHouseholdHeadId) {
        this.moveinPlaceHouseholdHeadId = moveinPlaceHouseholdHeadId;
    }

    /**
     * @return the moveinPlaceHouseholdId
     */
    public String getMoveinPlaceHouseholdId() {
        return moveinPlaceHouseholdId;
    }

    /**
     * @param moveinPlaceHouseholdId
     *            the moveinPlaceHouseholdId to set
     */
    public void setMoveinPlaceHouseholdId(String moveinPlaceHouseholdId) {
        this.moveinPlaceHouseholdId = moveinPlaceHouseholdId;
    }

}

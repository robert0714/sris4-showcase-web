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
 * 住址變更登記遷出戶DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01330MoveOutRemainderDTO", propOrder = { "appellation", "birthYyymmdd", "checked",
        "isHouseholdHeader", "moveOutDate", "oldAppellation", "personId", "personName" })
@XmlRootElement(name = "Rl01330MoveOutRemainderDTO")
public class Rl01330MoveOutRemainderDTO implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 稱謂. */
    @XmlElement(name = "Appellation", required = true)
    @FieldName("稱謂")
    private String appellation;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 選擇. */
    @XmlElement(name = "Checked", required = true)
    @FieldName("選擇 ")
    private boolean checked;

    /** 是否為新戶長. */
    @XmlElement(name = "IsHouseholdHeader", required = true)
    @FieldName("是否為新戶長")
    private boolean isHouseholdHeader;

    /** 遷出時間. */
    @XmlElement(name = "MoveOutDate", required = true)
    @FieldName("遷出時間")
    private String moveOutDate;

    /** 原稱謂. */
    @XmlElement(name = "oldAppellation", required = true)
    @FieldName("原稱謂")
    private String oldAppellation;

    /** 統號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;

    public String getAppellation() {
        return appellation;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public String getMoveOutDate() {
        return moveOutDate;
    }

    public String getOldAppellation() {
        return oldAppellation;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public boolean isChecked() {
        return checked;
    }

    public boolean isHouseholdHeader() {
        return isHouseholdHeader;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setHouseholdHeader(boolean isHouseholdHeader) {
        this.isHouseholdHeader = isHouseholdHeader;
    }

    public void setMoveOutDate(String moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public void setOldAppellation(String oldAppellation) {
        this.oldAppellation = oldAppellation;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl01330MoveOutRemainderDTO [isHouseholdHeader=" + isHouseholdHeader + ", personName=" + personName
                + ", personId=" + personId + ", birthYyymmdd=" + birthYyymmdd + ", moveOutDate=" + moveOutDate
                + ", appellation=" + appellation + ", checked=" + checked + "]";
    }
}

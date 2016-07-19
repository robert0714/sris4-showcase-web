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
 * 分(合)戶遷出戶DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01830MoveOutRemainderDTO", propOrder = { "isHouseholdHeader", "personName", "personId",
        "birthYyymmdd", "moveOutDate", "appellation", "checked", "oldAppellation" })
@XmlRootElement(name = "Rl01830MoveOutRemainderDTO")
public class Rl01830MoveOutRemainderDTO implements Serializable {

    /** SerialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 稱謂. */
    @XmlElement(name = "Appellation", required = true)
    @FieldName("稱謂")
    private String appellation;

    /** 姓名. */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("個人記事")
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

    /** 性名. */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("性名")
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

    @Override
    public String toString() {
        return "Rl01830MoveOutRemainderDTO [isHouseholdHeader=" + isHouseholdHeader + ", personName=" + personName
                + ", personId=" + personId + ", birthYyymmdd=" + birthYyymmdd + ", moveOutDate=" + moveOutDate
                + ", appellation=" + appellation + ", checked=" + checked + "]";
    }
}

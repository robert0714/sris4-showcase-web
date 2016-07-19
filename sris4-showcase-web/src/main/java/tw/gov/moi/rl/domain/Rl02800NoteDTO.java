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
import tw.gov.moi.domain.Rldf005yType;
import tw.gov.moi.domain.Rldf007yType;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;

/**
 * 英文戶籍滕本核發-記事選擇(電腦化後)DTO.
 * 
 * @author Josh hsu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02800NoteDTO", propOrder = { "id", "householdNote", "rldf007y", "rld005y", "isModifyEng", "notPrint",
		"mainType", "mainTypeName", "subType", "subTypeName", "showName", "showCode", "level"
})
@XmlRootElement(name = "Rl02800NoteDTO")
public class Rl02800NoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 23838367583747309L;

    /** 序號. */
    @XmlElement(name = "Id")
    @FieldName("序號")
    private Integer id;

    /** 全戶記事資料. */
    @XmlElement(name = "HouseholdNote")
    @FieldName("全戶記事資料")
    private XLDFHouseholdNoteDomainObject householdNote;

    /** 英文個人記事 */
    @XmlElement(name = "Rldf007y")
    @FieldName("英文個人記事")
    private Rldf007yType rldf007y = new Rldf007yType();

    /**
     * 英文全戶記事
     */
    @XmlElement(name = "Rld005y")
    @FieldName("英文全戶記事")
    private Rldf005yType rld005y = new Rldf005yType();

    /**
     * 是否翻譯過
     */
    @XmlElement(name = "IsModifyEng")
    @FieldName("是否翻譯過")
    private Boolean isModifyEng = Boolean.FALSE;

    /**
     * 是否選擇不印<BR>
     * Default: 否.
     */
    @XmlElement(name = "NotPrint")
    @FieldName("是否選擇不印")
    private boolean notPrint = false;

    /** 主分類. */
    @XmlElement(name = "MainType")
    @FieldName("主分類")
    private String mainType;

    /** 主分類名稱. */
    @XmlElement(name = "MainTypeName")
    @FieldName("主分類名稱")
    private String mainTypeName;

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類.")
    private String subType;

    /** 次分類名稱. */
    @XmlElement(name = "SubTypeName")
    @FieldName("次分類名稱")
    private String subTypeName;

    /** 顯示名字 */
    @XmlElement(name = "ShowName")
    @FieldName("顯示名字")
    private String showName;

    /** 顯示代碼 */
    @XmlElement(name = "ShowCode")
    @FieldName("顯示代碼")
    private String showCode;

    /** 層級 */
    @XmlElement(name = "Level")
    @FieldName("層級")
    private String level;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Checks if is not print.
     * 
     * @return true, if is not print
     */
    public boolean isNotPrint() {
        return notPrint;
    }

    /**
     * Sets the not print.
     * 
     * @param notPrint
     *            the new not print
     */
    public void setNotPrint(final boolean notPrint) {
        this.notPrint = notPrint;
    }

    /**
     * Gets the sub type.
     * 
     * @return the sub type
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the sub type.
     * 
     * @param subType
     *            the new sub type
     */
    public void setSubType(final String subType) {
        this.subType = subType;
    }

    /**
     * Gets the sub type name.
     * 
     * @return the sub type name
     */
    public String getSubTypeName() {
        return subTypeName;
    }

    public Rldf007yType getRldf007y() {
        return rldf007y;
    }

    public void setRldf007y(Rldf007yType rldf007y) {
        this.rldf007y = rldf007y;
    }

    /**
     * Sets the sub type name.
     * 
     * @param subTypeName
     *            the new sub type name
     */
    public void setSubTypeName(final String subTypeName) {
        this.subTypeName = subTypeName;
    }

    public XLDFHouseholdNoteDomainObject getHouseholdNote() {
        return householdNote;
    }

    public void setHouseholdNote(XLDFHouseholdNoteDomainObject householdNote) {
        this.householdNote = householdNote;
    }

    public Boolean getIsModifyEng() {
        return isModifyEng;
    }

    public void setIsModifyEng(Boolean isModifyEng) {
        this.isModifyEng = isModifyEng;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getMainTypeName() {
        return mainTypeName;
    }

    public void setMainTypeName(String mainTypeName) {
        this.mainTypeName = mainTypeName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowCode() {
        return showCode;
    }

    public void setShowCode(String showCode) {
        this.showCode = showCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Rldf005yType getRld005y() {
        return rld005y;
    }

    public void setRld005y(Rldf005yType rld005y) {
        this.rld005y = rld005y;
    }

    @Override
    public String toString() {
        return "Rl02800NoteDTO [id=" + id + ", householdNote=" + householdNote + ", rldf007y=" + rldf007y + ", rld005y=" + rld005y + ", isModifyEng=" + isModifyEng + ", notPrint=" + notPrint + ", mainType=" + mainType + ", mainTypeName=" + mainTypeName + ", subType=" + subType + ", subTypeName=" + subTypeName + ", showName=" + showName + ", showCode=" + showCode + ", level=" + level + "]";
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

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
 * The Class Rl02720HouseholdNoteDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02720HouseholdNoteDTO", propOrder = { "registerYyymmdd", "registerHhmmss", "registerContent",
        "subType", "deleteFlag" })
@XmlRootElement(name = "Rl02720HouseholdNoteDTO")
public class Rl02720HouseholdNoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 登記日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("登記日期")
    private String registerYyymmdd = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterHhmmss")
    @FieldName("登記時間")
    private String registerHhmmss = "";

    /** 記事內容. */
    @XmlElement(name = "RegisterContent")
    @FieldName("記事內容")
    private String registerContent = "";

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類")
    private String subType;

    /** 刪除註記. */
    @XmlElement(name = "DeleteFlag")
    @FieldName("刪除註記")
    private boolean deleteFlag = Boolean.FALSE;

    /**
     * Gets the register yyymmdd.
     * 
     * @return the register yyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * Sets the register yyymmdd.
     * 
     * @param registerYyymmdd
     *            the new register yyymmdd
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * Gets the register hhmmss.
     * 
     * @return the register hhmmss
     */
    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    /**
     * Sets the register hhmmss.
     * 
     * @param registerHhmmss
     *            the new register hhmmss
     */
    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Checks if is delete flag.
     * 
     * @return true, if is delete flag
     */
    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the delete flag.
     * 
     * @param deleteFlag
     *            the new delete flag
     */
    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
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
    public void setSubType(String subType) {
        this.subType = subType;
    }

    @Override
    public String toString() {
        return "Rl02720HouseholdNoteDTO [registerYyymmdd=" + registerYyymmdd + ", registerHhmmss=" + registerHhmmss
                + ", registerContent=" + registerContent + ", subType=" + subType + ", deleteFlag=" + deleteFlag + "]";
    }
}

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
 * The Class Rl08f51ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f51ResultDTO", propOrder = { "personId", "personName", "livingStyleCode", "votePoint", "mainPage",
        "subPage", "workVotePoint" })
@XmlRootElement(name = "Rl08f51ResultDTO")
public class Rl08f51ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統號. */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** 姓名. */
    @XmlElement(name = "personName")
    @FieldName("姓名")
    private String personName = "";

    /** 原住民註記. */
    @XmlElement(name = "livingStyleCode")
    @FieldName("原住民註記")
    private String livingStyleCode = "";

    /** 投票所. */
    @XmlElement(name = "votePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 主頁. */
    @XmlElement(name = "mainPage")
    @FieldName("主頁")
    private String mainPage = "";

    /** 副頁. */
    @XmlElement(name = "subPage")
    @FieldName("副頁")
    private String subPage = "";

    /** 工作地投票所. */
    @XmlElement(name = "workVotePoint")
    @FieldName("工作地投票所")
    private String workVotePoint = "";

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the living style code.
     * 
     * @return the living style code
     */
    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    /**
     * Sets the living style code.
     * 
     * @param livingStyleCode
     *            the new living style code
     */
    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    /**
     * Gets the vote point.
     * 
     * @return the vote point
     */
    public String getVotePoint() {
        return votePoint;
    }

    /**
     * Sets the vote point.
     * 
     * @param votePoint
     *            the new vote point
     */
    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    /**
     * Gets the main page.
     * 
     * @return the main page
     */
    public String getMainPage() {
        return mainPage;
    }

    /**
     * Sets the main page.
     * 
     * @param mainPage
     *            the new main page
     */
    public void setMainPage(String mainPage) {
        this.mainPage = mainPage;
    }

    /**
     * Gets the sub page.
     * 
     * @return the sub page
     */
    public String getSubPage() {
        return subPage;
    }

    /**
     * Sets the sub page.
     * 
     * @param subPage
     *            the new sub page
     */
    public void setSubPage(String subPage) {
        this.subPage = subPage;
    }

    /**
     * Gets the work vote point.
     * 
     * @return the work vote point
     */
    public String getWorkVotePoint() {
        return workVotePoint;
    }

    /**
     * Sets the work vote point.
     * 
     * @param workVotePoint
     *            the new work vote point
     */
    public void setWorkVotePoint(String workVotePoint) {
        this.workVotePoint = workVotePoint;
    }

    /**
     * Gets the serialversionuid.
     * 
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

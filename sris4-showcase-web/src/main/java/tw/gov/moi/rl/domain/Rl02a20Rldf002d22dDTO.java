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
 * The Class Rl02a20Rldf002d22dDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a20Rldf002d22dDTO", propOrder = { "sendId", "village", "neighbor", "personName", "personId",
        "applyYyymmdd", "applyHhmmss", "applyReason", "issueYyymmdd", "option" })
@XmlRootElement(name = "Rl02a20Rldf002d22dDTO")
public class Rl02a20Rldf002d22dDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 送件識別碼. */
    @XmlElement(name = "SendId")
    @FieldName("送件識別碼")
    private String sendId = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 受理時間. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** 申請事由. */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason = "";

    /** 發證日期/發出日期. */
    @XmlElement(name = "IssueYyymmdd")
    @FieldName("發證日期/發出日期")
    private String issueYyymmdd = "";

    /** 案件類別/辦理類別. */
    @XmlElement(name = "Option")
    @FieldName("案件類別/辦理類別")
    private String option = "";

    /**
     * Gets the send id.
     * 
     * @return the send id
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * Sets the send id.
     * 
     * @param sendId
     *            the new send id
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
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
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the apply hhmmss.
     * 
     * @return the apply hhmmss
     */
    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    /**
     * Sets the apply hhmmss.
     * 
     * @param applyHhmmss
     *            the new apply hhmmss
     */
    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    /**
     * Gets the apply reason.
     * 
     * @return the apply reason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * Sets the apply reason.
     * 
     * @param applyReason
     *            the new apply reason
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * Gets the issue yyymmdd.
     * 
     * @return the issue yyymmdd
     */
    public String getIssueYyymmdd() {
        return issueYyymmdd;
    }

    /**
     * Sets the issue yyymmdd.
     * 
     * @param issueYyymmdd
     *            the new issue yyymmdd
     */
    public void setIssueYyymmdd(String issueYyymmdd) {
        this.issueYyymmdd = issueYyymmdd;
    }

    /**
     * Gets the option.
     * 
     * @return the option
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the option.
     * 
     * @param option
     *            the new option
     */
    public void setOption(String option) {
        this.option = option;
    }

}

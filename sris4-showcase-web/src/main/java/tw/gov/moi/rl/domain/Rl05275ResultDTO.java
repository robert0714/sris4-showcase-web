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
 * 入出境紀錄查詢結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05275ResultDTO", propOrder = { "personId", "personName", "noticeYyymmdd", "noticeNo",
        "birthYyymmdd", "departureYyymmdd", "arrivalYyymmdd", "processYyymmdd", "processCode" })
@XmlRootElement(name = "Rl05275ResultDTO")
public class Rl05275ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 統一編號 */
    @XmlElement(name = "personId", required = true)
    @FieldName("統一編號")
    private String personId;

    /** 姓名 */
    @XmlElement(name = "personName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 移民署通報日期 */
    @XmlElement(name = "noticeYyymmdd", required = true)
    @FieldName("移民署通報日期")
    private String noticeYyymmdd;

    /** 通報序號 */
    @XmlElement(name = "noticeNo", required = true)
    @FieldName("通報序號")
    private String noticeNo;

    /** 出生日期 */
    @XmlElement(name = "birthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 出境日期 */
    @XmlElement(name = "departureYyymmdd", required = true)
    @FieldName("出境日期")
    private String departureYyymmdd;

    /** 入境日期 */
    @XmlElement(name = "arrivalYyymmdd", required = true)
    @FieldName("入境日期")
    private String arrivalYyymmdd;

    /** 處理日期 */
    @XmlElement(name = "processYyymmdd", required = true)
    @FieldName("處理日期")
    private String processYyymmdd;

    /** 處理註記期 */
    @XmlElement(name = "processCode", required = true)
    @FieldName("處理註記")
    private String processCode;

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName
     *            the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return the noticeYyymmdd
     */
    public String getNoticeYyymmdd() {
        return noticeYyymmdd;
    }

    /**
     * @param noticeYyymmdd
     *            the noticeYyymmdd to set
     */
    public void setNoticeYyymmdd(String noticeYyymmdd) {
        this.noticeYyymmdd = noticeYyymmdd;
    }

    /**
     * @return the noticeNo
     */
    public String getNoticeNo() {
        return noticeNo;
    }

    /**
     * @param noticeNo
     *            the noticeNo to set
     */
    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    /**
     * @return the birthYyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * @param birthYyymmdd
     *            the birthYyymmdd to set
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * @return the departureYyymmdd
     */
    public String getDepartureYyymmdd() {
        return departureYyymmdd;
    }

    /**
     * @param departureYyymmdd
     *            the departureYyymmdd to set
     */
    public void setDepartureYyymmdd(String departureYyymmdd) {
        this.departureYyymmdd = departureYyymmdd;
    }

    /**
     * @return the arrivalYyymmdd
     */
    public String getArrivalYyymmdd() {
        return arrivalYyymmdd;
    }

    /**
     * @param arrivalYyymmdd
     *            the arrivalYyymmdd to set
     */
    public void setArrivalYyymmdd(String arrivalYyymmdd) {
        this.arrivalYyymmdd = arrivalYyymmdd;
    }

    /**
     * @return the processYyymmdd
     */
    public String getProcessYyymmdd() {
        return processYyymmdd;
    }

    /**
     * @param processYyymmdd
     *            the processYyymmdd to set
     */
    public void setProcessYyymmdd(String processYyymmdd) {
        this.processYyymmdd = processYyymmdd;
    }

    /**
     * @return the processCode
     */
    public String getProcessCode() {
        return processCode;
    }

    /**
     * @param processCode
     *            the processCode to set
     */
    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

}

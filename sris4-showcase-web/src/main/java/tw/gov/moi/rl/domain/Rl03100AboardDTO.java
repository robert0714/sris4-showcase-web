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
 * The Class Rl03100AboardDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100AboardDTO", propOrder = { "noticeYyymmdd", "noticeNo", "registerYyymmdd", "departurePlace",
        "rdProcessYyymmdd", "processStatus", "processCode" })
@XmlRootElement(name = "Rl03100AboardDTO")
public class Rl03100AboardDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 移民署通報日期 */
    @FieldName("移民署通報日期")
    @XmlElement(name = "NoticeYyymmdd", required = false)
    private String noticeYyymmdd = "";

    /** 通報序號 */
    @FieldName("通報序號")
    @XmlElement(name = "NoticeNo", required = false)
    private String noticeNo = "";

    /** 出/入境日期 */
    @FieldName("出/入境日期")
    @XmlElement(name = "RegisterYyymmdd", required = false)
    private String registerYyymmdd = "";

    /** 出境地點 */
    @FieldName("出境地點")
    @XmlElement(name = "DeparturePlace", required = false)
    private String departurePlace = "";

    /** 內政部處理日期 */
    @FieldName("內政部處理日期")
    @XmlElement(name = "RdProcessYyymmdd", required = false)
    private String rdProcessYyymmdd = "";

    /** 處理情形 */
    @FieldName("處理情形")
    @XmlElement(name = "ProcessStatus", required = false)
    private String processStatus = "";

    /** 處理註記 */
    @FieldName("處理註記")
    @XmlElement(name = "ProcessCode", required = false)
    private String processCode = "";

    public String getNoticeYyymmdd() {
        return noticeYyymmdd;
    }

    public void setNoticeYyymmdd(String noticeYyymmdd) {
        this.noticeYyymmdd = noticeYyymmdd;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getRdProcessYyymmdd() {
        return rdProcessYyymmdd;
    }

    public void setRdProcessYyymmdd(String rdProcessYyymmdd) {
        this.rdProcessYyymmdd = rdProcessYyymmdd;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

}

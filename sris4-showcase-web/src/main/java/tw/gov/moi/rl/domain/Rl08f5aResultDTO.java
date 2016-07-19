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
import tw.gov.moi.domain.Rlde811wType;

/**
 * The Class Rl08f5aResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f5aResultDTO", propOrder = { "rlde811wType", "errorCodeData", "workVotePoint" })
@XmlRootElement(name = "Rl08f5aResultDTO")
public class Rl08f5aResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 工作地人員資料匯入紀錄檔. */
    @XmlElement(name = "Rlde811wType")
    @FieldName("工作地人員資料匯入紀錄檔")
    private Rlde811wType rlde811wType = new Rlde811wType();

    /** 異常代碼備註. */
    @XmlElement(name = "errorCodeData")
    @FieldName("異常代碼備註")
    private String errorCodeData = "";

    /** 工作地投票所. */
    @XmlElement(name = "WorkVotePoint")
    @FieldName("工作地投票所")
    private String workVotePoint = "";

    /**
     * Gets the rlde811w type.
     * 
     * @return the rlde811w type
     */
    public Rlde811wType getRlde811wType() {
        return rlde811wType;
    }

    /**
     * Sets the rlde811w type.
     * 
     * @param rlde811wType
     *            the new rlde811w type
     */
    public void setRlde811wType(Rlde811wType rlde811wType) {
        this.rlde811wType = rlde811wType;
    }

    public String getErrorCodeData() {
        return errorCodeData;
    }

    public void setErrorCodeData(String errorCodeData) {
        this.errorCodeData = errorCodeData;
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

}

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
import tw.gov.moi.exception.ErrorCode;

/**
 * 警告訊息
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlWarningMessage", propOrder = { "code", "extMessage" })
@XmlRootElement(name = "RlWarningMessage")
public class RlWarningMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 警告訊息代碼 */
    @XmlElement(name = "Code", required = true)
    @FieldName("警告訊息代碼")
    private String code;

    /** 補充警告訊息 */
    @XmlElement(name = "ExtMessage", required = true)
    @FieldName("補充警告訊息")
    private String extMessage;

    /**
     * 建構子
     */
    public RlWarningMessage() {
        super();
    }

    /**
     * 建構子
     * 
     * @param code 警告訊息代碼
     */
    public RlWarningMessage(ErrorCode code) {
        super();
        this.code = code.getCode();
    }

    /**
     * 建構子
     * 
     * @param code 警告訊息代碼
     * @param extMessage 補充警告訊息
     */
    public RlWarningMessage(ErrorCode code, String extMessage) {
        super();
        this.code = code.getCode();
        this.extMessage = extMessage;
    }

    /**
     * 建構子
     * 
     * @param code 警告訊息代碼
     */
    public RlWarningMessage(String code) {
        super();
        this.code = code;
    }

    /**
     * 建構子
     * 
     * @param code 警告訊息代碼
     * @param extMessage 補充警告訊息
     */
    public RlWarningMessage(String code, String extMessage) {
        super();
        this.code = code;
        this.extMessage = extMessage;
    }

    /**
     * 取得警告訊息代碼
     * 
     * @return 警告訊息代碼
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 設定警告訊息代碼
     * 
     * @param code 警告訊息代碼
     */
    public void setCode(final String code) {
        this.code = code;
    }

    /**
     * 取得補充警告訊息
     * 
     * @return 補充警告訊息
     */
    public String getExtMessage() {
        return this.extMessage;
    }

    /**
     * 設定補充警告訊息
     * 
     * @param extMessage 補充警告訊息
     */
    public void setExtMessage(final String extMessage) {
        this.extMessage = extMessage;
    }

}
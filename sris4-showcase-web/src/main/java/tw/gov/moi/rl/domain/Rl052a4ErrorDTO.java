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
 * The Class Rl052a4ErrorDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052a4ErrorDTO", propOrder = { "NoticeNo", "ErrorMesg" })
@XmlRootElement(name = "Rl052a4ErrorDTO")
public class Rl052a4ErrorDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 出生通報序號 */
    @XmlElement(name = "NoticeNo", required = true)
    @FieldName("出生通報序號 ")
    private String noticeNo;

    /** 回覆訊息 */
    @XmlElement(name = "ErrorMesg", required = true)
    @FieldName("回覆訊息")
    private String errorMesg;

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(final String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getErrorMesg() {
        return errorMesg;
    }

    public void setErrorMesg(final String errorMesg) {
        this.errorMesg = errorMesg;
    }

}
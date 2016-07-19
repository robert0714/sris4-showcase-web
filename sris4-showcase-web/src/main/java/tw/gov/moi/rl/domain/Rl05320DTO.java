/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl05320DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05320DTO", propOrder = { "NoticeReceiveDateStart", "NoticeReceiveDateEnd", "ResultData" })
@XmlRootElement(name = "Rl05320DTO")
public class Rl05320DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 通報資料接收日期-起 */
    @XmlElement(name = "NoticeReceiveDateStart", required = true)
    @FieldName("通報資料接收日期-起")
    private String noticeReceiveDateStart;

    /** 通報資料接收日期-迄 */
    @XmlElement(name = "NoticeReceiveDateEnd", required = true)
    @FieldName("通報資料接收日期-迄")
    private String noticeReceiveDateEnd;

    /** 查詢結果 */
    @XmlElement(name = "ResultData", required = true)
    @FieldName("查詢結果")
    private List<Rl05320QueryDTO> resultData;

    public String getNoticeReceiveDateStart() {
        return noticeReceiveDateStart;
    }

    public void setNoticeReceiveDateStart(final String noticeReceiveDateStart) {
        this.noticeReceiveDateStart = noticeReceiveDateStart;
    }

    public String getNoticeReceiveDateEnd() {
        return noticeReceiveDateEnd;
    }

    public void setNoticeReceiveDateEnd(final String noticeReceiveDateEnd) {
        this.noticeReceiveDateEnd = noticeReceiveDateEnd;
    }

    public List<Rl05320QueryDTO> getResultData() {
        return resultData;
    }

    public void setResultData(final List<Rl05320QueryDTO> resultData) {
        this.resultData = resultData;
    }

}

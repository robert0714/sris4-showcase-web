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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 出生通報查核結果資料檔查詢物件.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rldf058mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
@XmlType(name = "rldf058mDTO", propOrder = { "siteId", "birthNoticeNo", "birthBeginYyymmdd" })
public class Rldf058mDTO implements Serializable {

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 出生通報序號. */
    @XmlElement(name = "BirthNoticeNo")
    @FieldName("出生通報序號")
    private String birthNoticeNo;

    /** 出生通報資料週期(起). */
    @XmlElement(name = "BirthBeginYyymmdd")
    @FieldName("出生通報資料週期(起)")
    private String birthBeginYyymmdd;

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     */
    public Rldf058mDTO() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param siteId
     *            作業點代碼
     * @param birthNoticeNo
     *            出生通報序號
     * @param birthBeginYyymmdd
     *            出生通報資料週期(起)
     */
    public Rldf058mDTO(final String siteId, final String birthNoticeNo, final String birthBeginYyymmdd) {
        super();
        this.siteId = siteId;
        this.birthNoticeNo = birthNoticeNo;
        this.birthBeginYyymmdd = birthBeginYyymmdd;
    }

    /**
     * 取得出生通報資料週期(起).
     * 
     * @return 出生通報資料週期(起)
     */
    public String getBirthBeginYyymmdd() {
        return birthBeginYyymmdd;
    }

    /**
     * 取得出生通報序號.
     * 
     * @return 出生通報序號
     */
    public String getBirthNoticeNo() {
        return birthNoticeNo;
    }

    /**
     * 取得作業點代碼.
     * 
     * @return 作業點代碼
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * 設定出生通報資料週期(起).
     * 
     * @param birthBeginYyymmdd
     *            出生通報資料週期(起).
     */
    public void setBirthBeginYyymmdd(final String birthBeginYyymmdd) {
        this.birthBeginYyymmdd = birthBeginYyymmdd;
    }

    /**
     * 設定出生通報序號.
     * 
     * @param birthNoticeNo
     *            出生通報序號
     */
    public void setBirthNoticeNo(final String birthNoticeNo) {
        this.birthNoticeNo = birthNoticeNo;
    }

    /**
     * 設定作業點代碼.
     * 
     * @param siteId
     *            作業點代碼
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

}

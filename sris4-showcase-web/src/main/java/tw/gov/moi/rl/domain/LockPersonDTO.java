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
 * 個人資料鎖定資訊DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lockPersonDTO", propOrder = { "personId", "siteId", "identity" })
@XmlRootElement(name = "LockPersonDTO")
public class LockPersonDTO implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 統號 */
    @FieldName("統號")
    @XmlElement(name = "PersonId", required = true)
    private String personId;

    /** 作業點代碼 */
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    private String siteId;

    /** 身分(錯誤訊息使用) */
    @FieldName("身分(錯誤訊息使用)")
    @XmlElement(name = "Identity", required = true)
    private String identity;

    /**
     * Constructor.
     */
    public LockPersonDTO() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param identity
     *            身分(錯誤訊息使用)
     */
    public LockPersonDTO(final String personId, final String siteId, final String identity) {
        super();
        this.personId = personId;
        this.siteId = siteId;
        this.identity = identity;
    }

    /**
     * 取得身分(錯誤訊息使用).
     * 
     * @return 身分(錯誤訊息使用)
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 取得統號.
     * 
     * @return 統號
     */
    public String getPersonId() {
        return personId;
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
     * 設定身分(錯誤訊息使用).
     * 
     * @param identity
     *            身分(錯誤訊息使用)
     */
    public void setIdentity(final String identity) {
        this.identity = identity;
    }

    /**
     * 設定統號.
     * 
     * @param personId
     *            統號
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
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

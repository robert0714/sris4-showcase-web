/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import tw.gov.moi.domain.XldfahntType;


/**
 * XldfahntDTO 全戶記事(5/10)
 * 
 * @author Marcus Chen
 * 
 */
public class XldfahntDTO implements Serializable {

    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    /** 臨時列印申請書全戶記事資料. */
    private XldfahntType xldfahnt;
    /** 記事代碼. */
    private String registerCode;
    /** 作業點代碼. */
    private String siteId;
    /** 簿頁種類. */
    private String registerBook;

    /**
     * @return the XldfahntType
     */
    public XldfahntType getXldfahnt() {
        return xldfahnt;
    }

    /**
     * @param XldfahntType
     *            the xldfahnt to set
     */
    public void setXldfahnt(XldfahntType xldfahnt) {
        this.xldfahnt = xldfahnt;
    }

    /**
     * @return the registerCode
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * @param registerCode
     *            the registerCode to set
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the registerBook
     */
    public String getRegisterBook() {
        return registerBook;
    }

    /**
     * @param registerBook
     *            the registerBook to set
     */
    public void setRegisterBook(String registerBook) {
        this.registerBook = registerBook;
    }

}

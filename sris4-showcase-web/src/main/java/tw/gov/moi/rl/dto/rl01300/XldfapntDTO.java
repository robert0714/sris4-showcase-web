/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import tw.gov.moi.domain.XldfapntType;


/**
 * XldfapntDTO(5/10)
 * 
 * @author Marcus Chen
 * 
 */
public class XldfapntDTO implements Serializable {

    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    /** 臨時列印申請書個人記事資料. */
    private XldfapntType xldfapnt;
    /** 記事代碼. */
    private String registerCode;
    /** 作業點代碼. */
    private String siteId;
    /** 簿頁種類. */
    private String registerBook;

    /**
     * @return the xldfapnt
     */
    public XldfapntType getXldfapnt() {
        return xldfapnt;
    }

    /**
     * @param xldfapnt
     *            the xldfapnt to set
     */
    public void setXldfapnt(XldfapntType xldfapnt) {
        this.xldfapnt = xldfapnt;
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

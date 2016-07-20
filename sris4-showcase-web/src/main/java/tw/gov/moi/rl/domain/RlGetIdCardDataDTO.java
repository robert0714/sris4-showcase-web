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
 * The Class RlGetIdCardDataDTO.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetIdCardDataDTO", propOrder = { "personId", "applyYyymmdd", "applyHhmmss", "siteId", "cardNo",
        "cellophaneNo", "type", "acceptAdminOfficeCode" })
@XmlRootElement(name = "RlGetIdCardDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetIdCardDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("申請日期")
    private String applyYyymmdd;

    @XmlElement(name = "ApplyHhmmss")
    @FieldName("申請時間")
    private String applyHhmmss;

    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    @XmlElement(name = "CardNo")
    @FieldName("空白證號")
    private String cardNo;

    @XmlElement(name = "CellophaneNo")
    @FieldName("膠膜號")
    private String cellophaneNo;

    @XmlElement(name = "Type")
    @FieldName("類型")
    private String type;

    @XmlElement(name = "acceptAdminOfficeCode")
    @FieldName("發證戶所")
    private String acceptAdminOfficeCode;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCellophaneNo() {
        return cellophaneNo;
    }

    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

}

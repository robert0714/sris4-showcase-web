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
 * WebService 專用.
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldfm10mDTO", propOrder = { "personId", "siteId", "applyCode", "applyType" })
@XmlRootElement(name = "Rldfm10mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldfm10mDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    @FieldName("統號")
    private String personId;

    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    @XmlElement(name = "ApplyCode", required = false)
    @FieldName("申請書代碼")
    private String applyCode;

    @XmlElement(name = "ApplyType", required = false)
    @FieldName("交待R或T")
    private String applyType;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(final String applyType) {
        this.applyType = applyType;
    }

}

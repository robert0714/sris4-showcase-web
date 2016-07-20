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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRldf030tDTO", propOrder = { "personId", "registerYyymmdd", "registerHhmmss", "siteId" })
@XmlRootElement(name = "GetRldf030tDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class GetRldf030tDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    public GetRldf030tDTO() {

    }

    public GetRldf030tDTO(String personId, String registerYyymmdd, String registerHhmmss, String siteId) {
        super();
        this.personId = personId;
        this.registerYyymmdd = registerYyymmdd;
        this.registerHhmmss = registerHhmmss;
        this.siteId = siteId;
    }

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 登記日期 */
    @XmlElement(name = "RegisterYyymmdd", required = true)
    @FieldName("登記日期")
    private String registerYyymmdd;

    /** 登記時間 */
    @XmlElement(name = "RegisterHhmmss", required = true)
    @FieldName("登記時間")
    private String registerHhmmss;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(final String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    public void setRegisterHhmmss(final String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

}

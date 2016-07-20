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

import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class RlIdCardMaterialDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlIdCardMaterialDTO", propOrder = { "type", "no", "siteId" })
@XmlRootElement(name = "RlIdCardMaterialDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlIdCardMaterialDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 點交物 */
    @XmlElement(name = "Type", required = true)
    private String type;

    /** 號碼 */
    @XmlElement(name = "No", required = true)
    private String no;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    private String siteId;

    public RlIdCardMaterialDTO() {
    }

    public RlIdCardMaterialDTO(String type, String no, String siteId) {
        this.type = type;
        this.no = no;
        this.siteId = siteId;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(final String no) {
        this.no = no;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

}

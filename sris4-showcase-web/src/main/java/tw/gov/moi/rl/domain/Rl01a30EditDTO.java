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
import tw.gov.moi.domain.Rldf030mType;

/**
 * The Class Rl01a30EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a30EditDTO", propOrder = { "rldf030mObj", "registerCode", "registerContent" })
@XmlRootElement(name = "Rl01a30EditDTO")
public class Rl01a30EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 所內記事 */
    @XmlElement(name = "Rldf030mObj", required = true)
    @FieldName("所內記事")
    private Rldf030mType rldf030mObj;

    /** 記事代碼 */
    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;

    /** 記事內容 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;

    public Rldf030mType getRldf030mObj() {
        return rldf030mObj;
    }

    public void setRldf030mObj(final Rldf030mType rldf030mObj) {
        this.rldf030mObj = rldf030mObj;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(final String registerCode) {
        this.registerCode = registerCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

}

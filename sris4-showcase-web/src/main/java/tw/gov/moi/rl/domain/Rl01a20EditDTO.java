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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl01a20EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a20EditDTO", propOrder = { "registerCode", "registerContent", "rldf001mObj", "rldf004mObj" })
@XmlRootElement(name = "Rl01a20EditDTO")
public class Rl01a20EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;
    
    /** 記事代碼 */
    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;
    
    /** 記事內容 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;
    
    /** Rldf001m */
    @XmlElement(name = "Rldf001mObj", required = true)
    @FieldName("Rldf001m")
    private Rldf001mType rldf001mObj;
    
    /** Rldf004m */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("Rldf004m")
    private Rldf004mType rldf004mObj;

    public Rldf001mType getRldf001mObj() {
        return rldf001mObj;
    }

    public void setRldf001mObj(final Rldf001mType rldf001mObj) {
        this.rldf001mObj = rldf001mObj;
    }

    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    public void setRldf004mObj(final Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
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

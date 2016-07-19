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
 * 遷出撤銷登記-成員清單DTO-
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01804MemberDTO", propOrder = { "checked", "memberPersonId", "memberPersonName" })
@XmlRootElement(name = "Rl01804MemberDTO")
public class Rl01805MemberDTO implements Serializable {

    /** Serail Id. */
    private static final long serialVersionUID = 1L;
    /** 選擇 */
    @XmlElement(name = "checked", required = true)
    @FieldName("選擇 ")
    private boolean checked;

    /** 國民身分證統一編號 */
    @XmlElement(name = "memberPersonId", required = true)
    @FieldName("國民身分證統一編號 ")
    private String memberPersonId;

    /** 姓名 */
    @XmlElement(name = "memberPersonName", required = true)
    @FieldName("姓名")
    private String memberPersonName;

    public Rl01805MemberDTO() {

    }

    /**
     * 
     * @param memberPersonId
     */
    public Rl01805MemberDTO(String memberPersonId, String memberPersonName) {
        this.checked = Boolean.FALSE;
        this.memberPersonId = memberPersonId;
        this.memberPersonName = memberPersonName;
    }

    /**
     * @return the checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * @param checked
     *            the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /**
     * @return the memberPersonId
     */
    public String getMemberPersonId() {
        return memberPersonId;
    }

    /**
     * @param memberPersonId
     *            the memberPersonId to set
     */
    public void setMemberPersonId(String memberPersonId) {
        this.memberPersonId = memberPersonId;
    }

    /**
     * @return the memberPersonName
     */
    public String getMemberPersonName() {
        return memberPersonName;
    }

    /**
     * @param memberPersonName
     *            the memberPersonName to set
     */
    public void setMemberPersonName(String memberPersonName) {
        this.memberPersonName = memberPersonName;
    }

}

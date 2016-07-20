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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 遷入登記戶內成員DTO
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memberDTO", propOrder = { "checked", "memberPersonId", "memberPersonName", "relationship" })
@XmlRootElement(name = "MemberDTO")
public class MemberDTO implements Serializable {

    /** Serail Id. */
    private static final long serialVersionUID = 1L;
    /** 選擇 */
    @XmlElement(name = "Checked", required = true)
    @FieldName("選擇 ")
    private boolean checked;

    /** 國民身分證統一編號 */
    @XmlElement(name = "MemberPersonId", required = true)
    @FieldName("國民身分證統一編號 ")
    private String memberPersonId;

    /** 姓名 */
    @XmlElement(name = "MemberPersonName", required = true)
    @FieldName("姓名")
    private String memberPersonName;

    /** 稱謂 */
    @XmlElement(name = "Relationship", required = true)
    @FieldName("稱謂")
    private String relationship;

    public MemberDTO() {

    }

    /**
     * 
     * @param memberPersonId
     */
    public MemberDTO(String memberPersonId, String memberPersonName, String relaitonsip) {
        this.checked = Boolean.FALSE;
        this.memberPersonId = memberPersonId;
        this.memberPersonName = memberPersonName;
        this.relationship = relaitonsip;
    }

    /**
     * 
     * @param memberPersonId
     */
    public MemberDTO(XLDFPersonDataDomainObject personDataObj) {
        this.checked = Boolean.FALSE;
        this.memberPersonId = personDataObj.getPersonId();
        this.memberPersonName = personDataObj.getPersonName();
        this.relationship = personDataObj.getRelationship();
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

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     *            the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}

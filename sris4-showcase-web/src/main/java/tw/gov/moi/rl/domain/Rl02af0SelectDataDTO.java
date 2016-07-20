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
 * The Class Rl02af0SelectDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02af0SelectDataDTO", propOrder = { "personId", "applyYyymmdd", "applyHhmmss", "personName", "birthYyymmdd",
        "applyReason", "acceptSiteid" , "address"})
@XmlRootElement(name = "Rl02af0SelectDataDTO")
public class Rl02af0SelectDataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId ;

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd;

    /** 受理時間. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 申請事由. */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason;

    /** 受理地代碼. */
    @XmlElement(name = "AcceptSiteid")
    @FieldName("受理地代碼")
    private String acceptSiteid;
    
    /** 地址. */
    @XmlElement(name = "Address")
    @FieldName("地址")
    private String address;

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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getAcceptSiteid() {
        return acceptSiteid;
    }

    public void setAcceptSiteid(String acceptSiteid) {
        this.acceptSiteid = acceptSiteid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Rl02af0SelectDataDTO [personId=" + personId + ", applyYyymmdd=" + applyYyymmdd + ", applyHhmmss="
                + applyHhmmss + ", personName=" + personName + ", birthYyymmdd=" + birthYyymmdd + ", applyReason="
                + applyReason + ", acceptSiteid=" + acceptSiteid + ", address=" + address + "]";
    }
    

}
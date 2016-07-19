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
import tw.gov.moi.domain.Rldf100mType;

/**
 * The Class Rl01410EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01410EditDTO", propOrder = { "SpecialCode", "BeginYyymmdd", "EndYyymmdd", "DocuId", "DocuNo",
        "Content", "Rldf001mObj", "Rldf004mObj", "Rldf100mObj" })
@XmlRootElement(name = "Rl01410EditDTO")
public class Rl01410EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 特殊註記 */
    @XmlElement(name = "SpecialCode", required = true)
    @FieldName("特殊註記")
    private String specialCode;

    /** 起始日期 */
    @XmlElement(name = "BeginYyymmdd", required = true)
    @FieldName("起始日期")
    private String beginYyymmdd;

    /** 結束日期 */
    @XmlElement(name = "EndYyymmdd", required = true)
    @FieldName("結束日期")
    private String endYyymmdd;

    /** 來文字 */
    @XmlElement(name = "DocuId", required = true)
    @FieldName("來文字")
    private String docuId;

    /** 來文號 */
    @XmlElement(name = "DocuNo", required = true)
    @FieldName("來文號")
    private String docuNo;

    /** 摘要 */
    @XmlElement(name = "Content", required = true)
    @FieldName("摘要")
    private String content;

    /** Rldf001m */
    @XmlElement(name = "Rldf001mObj", required = true)
    @FieldName("Rldf001m")
    private Rldf001mType rldf001mObj;

    /** Rldf004m */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("Rldf004m")
    private Rldf004mType rldf004mObj;

    /** Rldf100m */
    @XmlElement(name = "Rldf100mObj", required = true)
    @FieldName("Rldf100m")
    private Rldf100mType rldf100mObj;

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

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(final String specialCode) {
        this.specialCode = specialCode;
    }

    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    public void setBeginYyymmdd(final String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    public void setEndYyymmdd(final String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public String getDocuId() {
        return docuId;
    }

    public void setDocuId(final String docuId) {
        this.docuId = docuId;
    }

    public String getDocuNo() {
        return docuNo;
    }

    public void setDocuNo(final String docuNo) {
        this.docuNo = docuNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public Rldf100mType getRldf100mObj() {
        return rldf100mObj;
    }

    public void setRldf100mObj(final Rldf100mType rldf100mObj) {
        this.rldf100mObj = rldf100mObj;
    }

}

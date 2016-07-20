/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf008mType;

/**
 * The Class Rl01440EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01440EditDTO", propOrder = { "rldf008mObj", "doNotice", "docuId","content","personName"})
@XmlRootElement(name = "Rl01440EditDTO")
public class Rl01440EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Rldf008m */
    @XmlElement(name = "Rldf008mObj", required = true)
    @FieldName("Rldf008m")
    private Rldf008mType rldf008mObj;

    /** 是否通報 */
    @XmlElement(name = "DoNotice", required = true)
    @FieldName("是否通報")
    private boolean doNotice;

    @XmlElement(name = "DocuId")
    @FieldName("來文字")
    private String docuId;

    @XmlElement(name = "Content")
    @FieldName("摘要")
    private String content;
    
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    public Rldf008mType getRldf008mObj() {
        return rldf008mObj;
    }

    public void setRldf008mObj(final Rldf008mType rldf008mObj) {
        this.rldf008mObj = rldf008mObj;
        docuId = rldf008mObj.getDocuId();
        content = rldf008mObj.getContent();
        if (docuId != null && docuId.length() > 6) {
            docuId = StringUtils.substring(docuId, 0, 6) + "...";
        }
        if (content != null && content.length() > 6) {
            content = StringUtils.substring(content, 0, 6) + "...";
        }
    }

    public boolean isDoNotice() {
        return doNotice;
    }

    public void setDoNotice(final boolean doNotice) {
        this.doNotice = doNotice;
    }

    public String getDocuId() {
        return docuId;
    }

    public void setDocuId(String docuId) {
        this.docuId = docuId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
}

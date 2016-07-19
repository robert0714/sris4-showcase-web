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
import tw.gov.moi.domain.Rldf012dType;

/**
 * 瑕疵退回確認及通報 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f130ResultDTO", propOrder = { "no", "acceptYyymmdd", "acceptHhmmss", "documentNo", "voidYyymmdd",
        "voidHhmmss", "voidingName", "sendNoticeOption", "entity" })
@XmlRootElement(name = "Rl0f130ResultDTO")
public class Rl0f130ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 號碼 */
    @XmlElement(name = "no", required = true)
    @FieldName("號碼 ")
    private String no;

    /** 點收日期 */
    @XmlElement(name = "acceptYyymmdd", required = true)
    @FieldName("點收日期 ")
    private String acceptYyymmdd;

    /** 點收時間 */
    @XmlElement(name = "acceptHhmmss", required = true)
    @FieldName("點收時間 ")
    private String acceptHhmmss;

    /** 登錄時間 (作廢日期) */
    @XmlElement(name = "voidYyymmdd", required = true)
    @FieldName("登錄日期 ")
    private String voidYyymmdd;

    /** 登錄時間(作廢時間) */
    @XmlElement(name = "voidHhmmss", required = true)
    @FieldName("登錄時間 ")
    private String voidHhmmss;

    /** 登錄人員(造成作廢人員) */
    @XmlElement(name = "voidingName", required = true)
    @FieldName("登錄人員")
    private String voidingName;

    /** 發文號 */
    @XmlElement(name = "documentNo", required = true)
    @FieldName("發文號 ")
    private String documentNo;

    /** 確認通報 */
    @XmlElement(name = "sendNoticeOption", required = true)
    @FieldName("確認通報 ")
    private boolean sendNoticeOption;

    /** lockObj */
    @XmlElement(name = "entity", required = true)
    @FieldName("被鎖定的物件 ")
    private Rldf012dType entity;

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     *            the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the acceptYyymmdd
     */
    public String getAcceptYyymmdd() {
        return acceptYyymmdd;
    }

    /**
     * @param acceptYyymmdd
     *            the acceptYyymmdd to set
     */
    public void setAcceptYyymmdd(String acceptYyymmdd) {
        this.acceptYyymmdd = acceptYyymmdd;
    }

    /**
     * @return the acceptHhmmss
     */
    public String getAcceptHhmmss() {
        return acceptHhmmss;
    }

    /**
     * @param acceptHhmmss
     *            the acceptHhmmss to set
     */
    public void setAcceptHhmmss(String acceptHhmmss) {
        this.acceptHhmmss = acceptHhmmss;
    }

    /**
     * @return the documentNo
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * @param documentNo
     *            the documentNo to set
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    /**
     * @return the voidYyymmdd
     */
    public String getVoidYyymmdd() {
        return voidYyymmdd;
    }

    /**
     * @param voidYyymmdd
     *            the voidYyymmdd to set
     */
    public void setVoidYyymmdd(String voidYyymmdd) {
        this.voidYyymmdd = voidYyymmdd;
    }

    /**
     * @return the voidHhmmss
     */
    public String getVoidHhmmss() {
        return voidHhmmss;
    }

    /**
     * @param voidHhmmss
     *            the voidHhmmss to set
     */
    public void setVoidHhmmss(String voidHhmmss) {
        this.voidHhmmss = voidHhmmss;
    }

    /**
     * @return the voidingName
     */
    public String getVoidingName() {
        return voidingName;
    }

    /**
     * @param voidingName
     *            the voidingName to set
     */
    public void setVoidingName(String voidingName) {
        this.voidingName = voidingName;
    }

    /**
     * @return the sendNoticeOption
     */
    public boolean isSendNoticeOption() {
        return sendNoticeOption;
    }

    /**
     * @param sendNoticeOption
     *            the sendNoticeOption to set
     */
    public void setSendNoticeOption(boolean sendNoticeOption) {
        this.sendNoticeOption = sendNoticeOption;
    }

    /**
     * @return the entity
     */
    public Rldf012dType getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(Rldf012dType entity) {
        this.entity = entity;
    }

}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 行政區域調整 參數
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "massMoveParamDTO", propOrder = { "modifyDate", "modifyTime", "processDate", "processTime",
        "oldSiteId", "newSiteId", "removeYyymmdd", "removeTime" })
@XmlRootElement(name = "MassMoveParamDTO")
public class MassMoveParamDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** 調整日期 */
    @XmlElement(name = "ModifyDate")
    @FieldName("調整日期")
    private String modifyDate;

    /** 調整時間 */
    @XmlElement(name = "ModifyTime")
    @FieldName("調整時間")
    private String modifyTime;

    /** 生效日期 */
    @XmlElement(name = "processDate")
    @FieldName("生效日期")
    private String processDate;

    /** 生效時間 */
    @XmlElement(name = "ProcessTime")
    @FieldName("生效時間")
    private String processTime;

    /** 調整前所屬作業點代碼 */
    @XmlElement(name = "OldSiteId")
    @FieldName("調整前所屬作業點代碼")
    private String oldSiteId;

    /** 調整前所屬戶政事務所 */
    @XmlElement(name = "OldAdminOfficeCode")
    @FieldName("調整前所屬戶政事務所")
    private String oldAdminOfficeCode;

    /** 調整前所屬行政區域 */
    @XmlElement(name = "OldAreaCode")
    @FieldName("調整前所屬行政區域")
    private String oldAreaCode;

    /** 調整後所屬作業點代碼 */
    @XmlElement(name = "NewSiteId")
    @FieldName("調整後所屬作業點代碼")
    private String newSiteId;

    /** 除戶日期 */
    @XmlElement(name = "removeYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間 */
    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    public MassMoveParamDTO() {
        super();

    }

    public MassMoveParamDTO(String modifyDate, String modifyTime, String processDate, String processTime,
            String oldSiteId, String newSiteId, String removeYyymmdd, String removeTime) {
        super();
        this.modifyDate = modifyDate;
        this.modifyTime = modifyTime;
        this.processDate = processDate;
        this.processTime = processTime;
        this.oldSiteId = oldSiteId;
        this.newSiteId = newSiteId;
        this.removeYyymmdd = removeYyymmdd;
        this.removeTime = removeTime;
    }

    /**
     * @return the processDate
     */
    public String getProcessDate() {
        return processDate;
    }

    /**
     * @param processDate
     *            the processDate to set
     */
    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    /**
     * @return the processTime
     */
    public String getProcessTime() {
        return processTime;
    }

    /**
     * @param processTime
     *            the processTime to set
     */
    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    /**
     * @return the removeYyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * @param removeYyymmdd
     *            the removeYyymmdd to set
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * @return the modifyDate
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     *            the modifyDate to set
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return the modifyTime
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     *            the modifyTime to set
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return the oldSiteId
     */
    public String getOldSiteId() {
        return oldSiteId;
    }

    /**
     * @param oldSiteId
     *            the oldSiteId to set
     */
    public void setOldSiteId(String oldSiteId) {
        this.oldSiteId = oldSiteId;
    }

    /**
     * @return the newSiteId
     */
    public String getNewSiteId() {
        return newSiteId;
    }

    /**
     * @param newSiteId
     *            the newSiteId to set
     */
    public void setNewSiteId(String newSiteId) {
        this.newSiteId = newSiteId;
    }

    public String getOldAdminOfficeCode() {
        return oldAdminOfficeCode;
    }

    public void setOldAdminOfficeCode(String oldAdminOfficeCode) {
        this.oldAdminOfficeCode = oldAdminOfficeCode;
    }

    public String getOldAreaCode() {
        return oldAreaCode;
    }

    public void setOldAreaCode(String oldAreaCode) {
        this.oldAreaCode = oldAreaCode;
    }

}

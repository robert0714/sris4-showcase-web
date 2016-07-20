/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl0f230DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0f230DTO", propOrder = { "Type", "FoundYyymmdd", "FoundHhmmss", "LostName", "LostReason",
        "ConfirmMessage", "SaveList" })
@XmlRootElement(name = "Rl0f230DTO")
public class Rl0f230DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 發現遺失日期 */
    @XmlElement(name = "FoundYyymmdd", required = true)
    @FieldName("發現遺失日期")
    private String foundYyymmdd;

    /** 發現遺失時間 */
    @XmlElement(name = "FoundHhmmss", required = true)
    @FieldName("發現遺失時間")
    private String foundHhmmss;

    /** 遺失人員 */
    @XmlElement(name = "LostName", required = true)
    @FieldName("遺失人員")
    private String lostName;

    /** 遺失原因 */
    @XmlElement(name = "LostReason", required = true)
    @FieldName("遺失原因")
    private String lostReason;

    /** 存檔詢問訊息 */
    // @XmlElement(name = "ConfirmMessage", required = true)
    // @FieldName("存檔詢問訊息")
    // private String confirmMessage;

    /** 存檔訊息 */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("存檔清單")
    private List<Rl0f230SaveDTO> saveList;

    // public String getConfirmMessage() {
    // return confirmMessage;
    // }

    // public void setConfirmMessage(final String confirmMessage) {
    // this.confirmMessage = confirmMessage;
    // }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getFoundYyymmdd() {
        return foundYyymmdd;
    }

    public void setFoundYyymmdd(final String foundYyymmdd) {
        this.foundYyymmdd = foundYyymmdd;
    }

    public String getFoundHhmmss() {
        return foundHhmmss;
    }

    public void setFoundHhmmss(final String foundHhmmss) {
        this.foundHhmmss = foundHhmmss;
    }

    public String getLostName() {
        return lostName;
    }

    public void setLostName(final String lostName) {
        this.lostName = lostName;
    }

    public String getLostReason() {
        return lostReason;
    }

    public void setLostReason(final String lostReason) {
        this.lostReason = lostReason;
    }

    public List<Rl0f230SaveDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(final List<Rl0f230SaveDTO> saveList) {
        this.saveList = saveList;
    }

}

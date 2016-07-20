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
 * The Class Rl02ad0ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ad0ResultDTO", propOrder = { "Index", "ExpireYyymmdd", "ExpireHhmmss", "PersonId", "PersonName",
        "CardNo", "CellophaneNo", "ExpireReason", "Village", "Neighbor", "StreetDoorplate" })
@XmlRootElement(name = "Rl02ad0ResultDTO")
public class Rl02ad0ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 序號 */
    @FieldName("序號")
    @XmlElement(name = "Index")
    private String index;

    /** 註銷日期 */
    @FieldName("註銷日期")
    @XmlElement(name = "ExpireYyymmdd")
    private String expireYyymmdd;

    /** 註銷時間 */
    @FieldName("註銷時間")
    @XmlElement(name = "ExpireHhmmss")
    private String expireHhmmss;

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 空白證號 */
    @FieldName("空白證號")
    @XmlElement(name = "CardNo")
    private String cardNo;

    /** 膠膜號 */
    @FieldName("膠膜號")
    @XmlElement(name = "CellophaneNo")
    private String cellophaneNo;

    /** 註銷原因 */
    @FieldName("註銷原因")
    @XmlElement(name = "ExpireReason")
    private String expireReason;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "Village")
    private String village;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "Neighbor")
    private String neighbor;

    /** 街路門牌 */
    @FieldName("街路門牌")
    @XmlElement(name = "StreetDoorplate")
    private String streetDoorplate;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getExpireYyymmdd() {
        return expireYyymmdd;
    }

    public void setExpireYyymmdd(String expireYyymmdd) {
        this.expireYyymmdd = expireYyymmdd;
    }

    public String getExpireHhmmss() {
        return expireHhmmss;
    }

    public void setExpireHhmmss(String expireHhmmss) {
        this.expireHhmmss = expireHhmmss;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCellophaneNo() {
        return cellophaneNo;
    }

    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getExpireReason() {
        return expireReason;
    }

    public void setExpireReason(String expireReason) {
        this.expireReason = expireReason;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

}

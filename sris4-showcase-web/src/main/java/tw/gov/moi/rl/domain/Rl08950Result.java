/*
 * Copyright (final c) 2010-2020 IISI.
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
 * 所內記事資料結果.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08950Result", propOrder = { "personId", "personName", "registerCode", "householdHeadId",
        "householdHeadName", "area", "village", "neighbor", "streetDoorplate", "registerContent" })
@XmlRootElement(name = "Rl08950Result")
public class Rl08950Result implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    @FieldName("記事代碼")
    private String registerCode;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName;

    /** 行政區域. */
    @XmlElement(name = "Area")
    @FieldName("行政區域")
    private String area;

    /** 村(里). */
    @XmlElement(name = "Village")
    @FieldName("村(里)")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** 記事內容. */
    @XmlElement(name = "RegisterContent")
    @FieldName("記事內容")
    private String registerContent;

    /**
     * Constructor.
     * 
     * @param personId
     *            統一編號
     * @param personName
     *            姓名
     * @param registerCode
     *            記事代碼
     * @param householdHeadId
     *            戶長統號
     * @param householdHeadName
     *            戶長姓名
     * @param area
     *            行政區域
     * @param village
     *            村(里)
     * @param neighbor
     *            鄰
     * @param streetDoorplate
     *            街路門牌
     * @param registerContent
     *            記事內容
     */
    public Rl08950Result(final String personId, final String personName, final String registerCode,
            final String householdHeadId, final String householdHeadName, final String area, final String village,
            final String neighbor, final String streetDoorplate, final String registerContent) {
        super();
        this.personId = personId;
        this.personName = personName;
        this.registerCode = registerCode;
        this.householdHeadId = householdHeadId;
        this.householdHeadName = householdHeadName;
        this.area = area;
        this.village = village;
        this.neighbor = neighbor;
        this.streetDoorplate = streetDoorplate;
        this.registerContent = registerContent;
    }

    /**
     * 取得地址內容.
     * 
     * @return 地址內容
     */
    public String getAddress() {
        return this.area + this.village + this.neighbor + "鄰" + this.streetDoorplate;
    }

    /**
     * 取得行政區域.
     * 
     * @return 行政區域
     */
    public String getArea() {
        return area;
    }

    /**
     * 取得戶長統號.
     * 
     * @return 戶長統號
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * 取得戶長姓名.
     * 
     * @return 戶長姓名
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * 取得鄰.
     * 
     * @return 鄰
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * 取得統一編號.
     * 
     * @return 統一編號
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * 取得姓名.
     * 
     * @return 姓名
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 取得記事代碼.
     * 
     * @return 記事代碼
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * 取得記事內容.
     * 
     * @return 記事內容
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * 取得街路門牌.
     * 
     * @return 街路門牌
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * 取得村(里).
     * 
     * @return 村(里)
     */
    public String getVillage() {
        return village;
    }

    /**
     * 設定行政區域.
     * 
     * @param area
     *            行政區域
     */
    public void setArea(final String area) {
        this.area = area;
    }

    /**
     * 設定戶長統號.
     * 
     * @param householdHeadId
     *            戶長統號
     */
    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * 設定戶長姓名.
     * 
     * @param householdHeadName
     *            戶長姓名
     */
    public void setHouseholdHeadName(final String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * 設定鄰.
     * 
     * @param neighbor
     *            鄰
     */
    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * 設定統一編號.
     * 
     * @param personId
     *            統一編號
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * 設定姓名.
     * 
     * @param personName
     *            姓名
     */
    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    /**
     * 設定記事代碼.
     * 
     * @param registerCode
     *            記事代碼
     */
    public void setRegisterCode(final String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * 設定記事內容.
     * 
     * @param registerContent
     *            記事內容
     */
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * 設定街路門牌.
     * 
     * @param streetDoorplate
     *            街路門牌
     */
    public void setStreetDoorplate(final String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * 設定村(里).
     * 
     * @param village
     *            村(里)
     */
    public void setVillage(final String village) {
        this.village = village;
    }
}
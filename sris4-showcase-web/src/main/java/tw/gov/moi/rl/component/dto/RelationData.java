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
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;

/**
 * 關係人資料.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relationData", propOrder = { "personId", "siteId", "relationship", "personName", "person", "household" })
@XmlRootElement(name = "RelationData")
public class RelationData implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 統一編號. */
    @FieldName("統一編號")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 作業點代碼. */
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    /** 與當事人關係. */
    @FieldName("與當事人關係")
    @XmlElement(name = "Relationship", required = false)
    private String relationship;

    /** 姓名. */
    @FieldName("姓名")
    @XmlElement(name = "PersonName", required = false)
    private String personName;

    /** 關係人[個人基本資料]. */
    @FieldName("關係人[個人基本資料]")
    @XmlElement(name = "Person", required = true)
    private XLDF004M person;

    /** 關係人[全戶基本資料]. */
    @FieldName("關係人[全戶基本資料]")
    @XmlElement(name = "Household", required = true)
    private XLDF001M household;

    /**
     * Constructor.
     */
    public RelationData() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param personId
     *            統一編號
     * @param siteId
     *            作業點代碼
     * @param relationship
     *            與當事人關係
     * @param personName
     *            姓名
     */
    public RelationData(final String personId, final String siteId, final String relationship, final String personName) {
        super();
        this.personId = personId;
        this.siteId = siteId;
        this.relationship = relationship;
        this.personName = personName;
    }

    /**
     * 取得關係人[全戶基本資料].
     * 
     * @return 關係人[全戶基本資料]
     */
    public XLDF001M getHousehold() {
        return household;
    }

    /**
     * 取得關係人[個人基本資料].
     * 
     * @return 關係人[個人基本資料]
     */
    public XLDF004M getPerson() {
        return person;
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
     * 取得與當事人關係.
     * 
     * @return 與當事人關係
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * 取得作業點代碼.
     * 
     * @return 作業點代碼
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * 設定關係人[全戶基本資料].
     * 
     * @param household
     *            關係人[全戶基本資料]
     */
    public void setHousehold(final XLDF001M household) {
        this.household = household;
    }

    /**
     * 設定關係人[個人基本資料].
     * 
     * @param person
     *            關係人[個人基本資料]
     */
    public void setPerson(final XLDF004M person) {
        this.person = person;
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
     * 設定與當事人關係.
     * 
     * @param relationship
     *            與當事人關係
     */
    public void setRelationship(final String relationship) {
        this.relationship = relationship;
    }

    /**
     * 設定作業點代碼.
     * 
     * @param siteId
     *            作業點代碼
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

}

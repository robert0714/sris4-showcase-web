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
 * 姓名區分作業關係人姓名資料
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedPersonNameData", propOrder = { "relationship", "relationshipId", "name", "firstName", "lastName", "afterFirstName", "afterLastName", "backupAfterFirstName", "backupAfterLastName" })
@XmlRootElement(name = "RelatedPersonNameData")
public class RelatedPersonNameData implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 關係人名稱 */
    @XmlElement(name = "Relationship", required = true)
    @FieldName("關係人名稱")
    private String relationship;

    /** 關係人統號 */
    @XmlElement(name = "RelationshipId", required = true)
    @FieldName("關係人統號")
    private String relationshipId;

    /** 姓名 */
    @XmlElement(name = "Name", required = true)
    @FieldName("姓名")
    private String name;

    /** 名 */
    @XmlElement(name = "FirstName", required = true)
    @FieldName("名")
    private String firstName;

    /** 姓 */
    @XmlElement(name = "LastName", required = true)
    @FieldName("姓")
    private String lastName;

    /** 區分後名 */
    @XmlElement(name = "AfterFirstName", required = true)
    @FieldName("區分後名")
    private String afterFirstName;

    /** 區分後姓 */
    @XmlElement(name = "AfterLastName", required = true)
    @FieldName("區分後姓")
    private String afterLastName;

    /** 備份區分後名 */
    @XmlElement(name = "BackupAfterFirstName", required = true)
    @FieldName("備份區分後名")
    private String backupAfterFirstName;

    /** 備份區分後姓 */
    @XmlElement(name = "BackupAfterLastName", required = true)
    @FieldName("備份區分後姓")
    private String backupAfterLastName;

    /**
     * constructor
     */
    public RelatedPersonNameData() {
        super();
    }

    /**
     * constructor
     * 
     * @param relationship
     *            關係人名稱
     * @param relationshipId
     *            關係人統號
     * @param name
     *            姓名
     * @param firstName
     *            名
     * @param lastName
     *            姓
     * @param afterFirstName
     *            區分後名
     * @param afterLastName
     *            區分後姓
     */
    public RelatedPersonNameData(final String relationship, final String relationshipId, final String name, final String firstName, final String lastName, final String afterFirstName, final String afterLastName) {
        super();
        this.relationship = relationship;
        this.relationshipId = relationshipId;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.afterFirstName = afterFirstName;
        this.afterLastName = afterLastName;
    }

    /**
     * 取得區分後名
     * 
     * @return 區分後名
     */
    public String getAfterFirstName() {
        return afterFirstName;
    }

    /**
     * 取得區分後姓
     * 
     * @return 區分後姓
     */
    public String getAfterLastName() {
        return afterLastName;
    }

    /**
     * 取得備份區分後名
     * 
     * @return 備份區分後名
     */
    public String getBackupAfterFirstName() {
        return backupAfterFirstName;
    }

    /**
     * 取得備份區分後姓
     * 
     * @return 備份區分後姓
     */
    public String getBackupAfterLastName() {
        return backupAfterLastName;
    }

    /**
     * 取得名
     * 
     * @return 名
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 取得姓
     * 
     * @return 姓
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 取得姓名
     * 
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 取得關係人名稱
     * 
     * @return 關係人名稱
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * 取得關係人統號
     * 
     * @return 關係人統號
     */
    public String getRelationshipId() {
        return relationshipId;
    }

    /**
     * 設定區分後名
     * 
     * @param afterFirstName
     *            區分後名
     */
    public void setAfterFirstName(final String afterFirstName) {
        this.afterFirstName = afterFirstName;
    }

    /**
     * 設定區分後姓
     * 
     * @param afterLastName
     *            區分後姓
     */
    public void setAfterLastName(final String afterLastName) {
        this.afterLastName = afterLastName;
    }

    /**
     * 設定備份區分後名
     * 
     * @param backupAfterFirstName
     *            備份區分後名
     */
    public void setBackupAfterFirstName(final String backupAfterFirstName) {
        this.backupAfterFirstName = backupAfterFirstName;
    }

    /**
     * 設定備份區分後姓
     * 
     * @param backupAfterLastName
     *            備份區分後姓
     */
    public void setBackupAfterLastName(final String backupAfterLastName) {
        this.backupAfterLastName = backupAfterLastName;
    }

    /**
     * 設定名
     * 
     * @param firstName
     *            名
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * 設定姓
     * 
     * @param lastName
     *            姓
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * 設定姓名
     * 
     * @param name
     *            姓名
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 設定關係人名稱
     * 
     * @param relationship
     *            關係人名稱
     */
    public void setRelationship(final String relationship) {
        this.relationship = relationship;
    }

    /**
     * 設定關係人統號
     * 
     * @param relationshipId
     *            關係人統號
     */
    public void setRelationshipId(final String relationshipId) {
        this.relationshipId = relationshipId;
    }

}
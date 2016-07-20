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
 * The Class Rl01910ErrorDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01910ErrorDTO", propOrder = { "personId", "oriName", "newName", "oriBirth", "newBirth" })
@XmlRootElement(name = "Rl01910ErrorDTO")
public class Rl01910ErrorDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統一編號")
    private String personId;

    /** 原姓名 */
    @XmlElement(name = "OriName", required = true)
    @FieldName("原姓名")
    private String oriName;

    /** 補登姓名 */
    @XmlElement(name = "NewName", required = true)
    @FieldName("補登姓名")
    private String newName;

    /** 原出生日期 */
    @XmlElement(name = "OriBirth", required = true)
    @FieldName("原出生日期")
    private String oriBirth;

    /** 補登出生日期 */
    @XmlElement(name = "NewBirth", required = true)
    @FieldName("補登出生日期")
    private String newBirth;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getOriName() {
        return oriName;
    }

    public void setOriName(final String oriName) {
        this.oriName = oriName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(final String newName) {
        this.newName = newName;
    }

    public String getOriBirth() {
        return oriBirth;
    }

    public void setOriBirth(final String oriBirth) {
        this.oriBirth = oriBirth;
    }

    public String getNewBirth() {
        return newBirth;
    }

    public void setNewBirth(final String newBirth) {
        this.newBirth = newBirth;
    }

}

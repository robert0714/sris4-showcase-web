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
 * 戶籍人口統計月報表XX案件數統計表 DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlrp08190DTO", propOrder = { "area", "registerCount", "removeRegisterCount", "noLivePerson" })
@XmlRootElement(name = "Rlrp08190DTO")
public class Rlrp08190DTO implements Serializable {

    private static final long serialVersionUID = 8264513885422204861L;

    public Rlrp08190DTO() {

    }

    public Rlrp08190DTO(final String area) {
        this.area = area;
    }

    /** 區域別. */
    @XmlElement(name = "Area")
    @FieldName("區域別")
    private String area = "";

    /** 當月登記件數. */
    @XmlElement(name = "RegisterCount")
    @FieldName("當月登記件數")
    private String registerCount = "0";

    /** 當月撤銷登記件數. */
    @XmlElement(name = "RemoveRegisterCount")
    @FieldName("當月撤銷登記件數")
    private String removeRegisterCount = "0";

    /** 非現住人口數. */
    @XmlElement(name = "NoLivePerson")
    @FieldName("非現住人口數")
    private String noLivePerson = "0";

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRegisterCount() {
        return this.registerCount;
    }

    public void setRegisterCount(String registerCount) {
        this.registerCount = registerCount;
    }

    public String getRemoveRegisterCount() {
        return this.removeRegisterCount;
    }

    public void setRemoveRegisterCount(String removeRegisterCount) {
        this.removeRegisterCount = removeRegisterCount;
    }

    public String getNoLivePerson() {
        return this.noLivePerson;
    }

    public void setNoLivePerson(String noLivePerson) {
        this.noLivePerson = noLivePerson;
    }

}

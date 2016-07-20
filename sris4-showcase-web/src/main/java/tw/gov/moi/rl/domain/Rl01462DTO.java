/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf045mType;

/**
 * The Class Rl01462DTO.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01462DTO", propOrder = { "personId01", "personId02", "personId03", "personId04", "personId05",
        "results", "selecteds", "confirmMessage", "personIdList" })
@XmlRootElement(name = "Rl01462DTO")
public class Rl01462DTO {

    /** 統號01. */
    @XmlElement(name = "PersonId")
    @FieldName("統號01")
    private String personId01;

    /** 統號02. */
    @XmlElement(name = "PersonId")
    @FieldName("統號02")
    private String personId02;

    /** 統號03. */
    @XmlElement(name = "PersonId")
    @FieldName("統號03")
    private String personId03;

    /** 統號04. */
    @XmlElement(name = "PersonId")
    @FieldName("統號04")
    private String personId04;

    /** 統號05. */
    @XmlElement(name = "PersonId")
    @FieldName("統號05")
    private String personId05;

    /** 逕遷戶政事務所人口清單. */
    @XmlElement(name = "Results")
    @FieldName("逕遷戶政事務所人口清單")
    private List<Rldf045mType> results = new ArrayList<Rldf045mType>();

    /** 勾選逕遷戶政事務所人口清單. */
    @XmlElement(name = "Selecteds")
    @FieldName("勾選逕遷戶政事務所人口清單")
    private Rldf045mType[] selecteds;

    /** 通報詢問訊息 */
    @XmlElement(name = "ConfirmMessage")
    @FieldName("通報詢問訊息")
    private String confirmMessage;

    /** personIdList. */
    @XmlElement(name = "PersonIdList")
    @FieldName("personIdList")
    private List<String> personIdList = new ArrayList<String>();

    public List<Rldf045mType> getResults() {
        return results;
    }

    public void setResults(List<Rldf045mType> results) {
        this.results = results;
    }

    public Rldf045mType[] getSelecteds() {
        return selecteds;
    }

    public void setSelecteds(Rldf045mType[] selecteds) {
        this.selecteds = selecteds;
    }

    public String getConfirmMessage() {
        return confirmMessage;
    }

    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    public String getPersonId01() {
        return personId01;
    }

    public void setPersonId01(String personId01) {
        this.personId01 = personId01;
    }

    public String getPersonId02() {
        return personId02;
    }

    public void setPersonId02(String personId02) {
        this.personId02 = personId02;
    }

    public String getPersonId03() {
        return personId03;
    }

    public void setPersonId03(String personId03) {
        this.personId03 = personId03;
    }

    public String getPersonId04() {
        return personId04;
    }

    public void setPersonId04(String personId04) {
        this.personId04 = personId04;
    }

    public String getPersonId05() {
        return personId05;
    }

    public void setPersonId05(String personId05) {
        this.personId05 = personId05;
    }

    public List<String> getPersonIdList() {
        return personIdList;
    }

    public void setPersonIdList(List<String> personIdList) {
        this.personIdList = personIdList;
    }

}

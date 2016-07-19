/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */

package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.xldf.dto.XLDFM11M;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 姓名區分作業相關申請資料
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personData", propOrder = { "person", "xldfm11m", "afterFirstName", "afterMaidenName", "afterMarriedName", "relatedPersonNameDataList" })
@XmlRootElement(name = "PersonData")
public class PersonData implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 個人基本資料 */
    @XmlElement(name = "Person", required = true)
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject person;

    /** XLDFM11M */
    @XmlElement(name = "Xldfm11m", required = true)
    @FieldName("XLDFM11M")
    private XLDFM11M xldfm11m = new XLDFM11M();

    /** 區分後名 */
    @XmlElement(name = "AfterFirstName", required = true)
    @FieldName("區分後名")
    private String afterFirstName;

    /** 區分後本姓 */
    @XmlElement(name = "AfterMaidenName", required = true)
    @FieldName("區分後本姓")
    private String afterMaidenName;

    /** 區分後冠姓 */
    @XmlElement(name = "AfterMarriedName", required = true)
    @FieldName("區分後冠姓")
    private String afterMarriedName;

    /** 姓名區分作業關係人姓名資料清單 */
    @XmlElement(name = "RelatedPersonNameDataList", required = true)
    @FieldName("姓名區分作業關係人姓名資料清單")
    private List<RelatedPersonNameData> relatedPersonNameDataList = new ArrayList<RelatedPersonNameData>();

    /**
     * 取得個人基本資料
     * 
     * @return 個人基本資料
     */
    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    /**
     * 設定個人基本資料
     * 
     * @param person
     *            個人基本資料
     */
    public void setPerson(final XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    /**
     * 取得XLDFM11M
     * 
     * @return XLDFM11M
     */
    public XLDFM11M getXldfm11m() {
        return xldfm11m;
    }

    /**
     * 設定XLDFM11M
     * 
     * @param xldfm11m
     *            XLDFM11M
     */
    public void setXldfm11m(final XLDFM11M xldfm11m) {
        this.xldfm11m = xldfm11m;
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
     * 設定區分後名
     * 
     * @param afterFirstName
     *            區分後名
     */
    public void setAfterFirstName(final String afterFirstName) {
        this.afterFirstName = afterFirstName;
    }

    /**
     * 取得區分後本姓
     * 
     * @return 區分後本姓
     */
    public String getAfterMaidenName() {
        return afterMaidenName;
    }

    /**
     * 設定區分後本姓
     * 
     * @param afterMaidenName
     *            區分後本姓
     */
    public void setAfterMaidenName(final String afterMaidenName) {
        this.afterMaidenName = afterMaidenName;
    }

    /**
     * 取得區分後冠姓
     * 
     * @return 區分後冠姓
     */
    public String getAfterMarriedName() {
        return afterMarriedName;
    }

    /**
     * 設定區分後冠姓
     * 
     * @param afterMarriedName
     *            區分後冠姓
     */
    public void setAfterMarriedName(final String afterMarriedName) {
        this.afterMarriedName = afterMarriedName;
    }

    /**
     * 取得姓名區分作業關係人姓名資料清單
     * 
     * @return 姓名區分作業關係人姓名資料清單
     */
    public List<RelatedPersonNameData> getRelatedPersonNameDataList() {
        return relatedPersonNameDataList;
    }

    /**
     * 設定姓名區分作業關係人姓名資料清單
     * 
     * @param relatedPersonNameDataList
     *            姓名區分作業關係人姓名資料清單
     */
    public void setRelatedPersonNameDataList(final List<RelatedPersonNameData> relatedPersonNameDataList) {
        this.relatedPersonNameDataList = relatedPersonNameDataList;
    }

}
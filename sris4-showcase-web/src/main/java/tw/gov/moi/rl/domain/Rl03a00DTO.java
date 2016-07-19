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
import tw.gov.moi.domain.Rcdf002mType;
import tw.gov.moi.domain.Rcdf003mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rrdf004mType;

/**
 * 查詢同縣市姓名相同查詢.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl03a00DTO", propOrder = { "personId", "personName", "adminOfficeCode", "resultList", "dataObj",
        "dataObjRr04m", "dataObjRc02m", "dataObjRc03m" })
@XmlRootElement(name = "Rl03a00DTO")
public class Rl03a00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 身分證統號. */
    @XmlElement(name = "PersonId")
    @FieldName("身分證統號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 戶籍地戶所代碼. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶籍地戶所代碼")
    private String adminOfficeCode;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl03a00DTO> resultList;

    /** RL層級rldf004mType dataObj. */
    @XmlElement(name = "DataObj")
    @FieldName("rldf004mType dataobj")
    private Rldf004mType dataObj = new Rldf004mType();

    /** RC層級rrdf004mType dataObjRr04m. */
    @XmlElement(name = "DataObjRr04m")
    @FieldName("rrdf004mType dataobj")
    private Rrdf004mType dataObjRr04m = new Rrdf004mType();

    /** RC層級rcdf002mType dataObjRc02m. */
    @XmlElement(name = "DataObjRc02m")
    @FieldName("rcdf002mType dataobj")
    private Rcdf002mType dataObjRc02m = new Rcdf002mType();

    /** RC層級rcdf003mType dataObjRc03m. */
    @XmlElement(name = "DataObjRc03m")
    @FieldName("rcdf003mType dataobj")
    private Rcdf003mType dataObjRc03m = new Rcdf003mType();

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl03a00DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl03a00DTO> resultList) {
        this.resultList = resultList;
    }

    /**
     * Gets the data obj.
     * 
     * @return the data obj
     */
    public Rldf004mType getDataObj() {
        return dataObj;
    }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    public void setDataObj(Rldf004mType dataObj) {
        this.dataObj = dataObj;
    }

    /**
     * Gets the data obj rr04m.
     * 
     * @return the data obj rr04m
     */
    public Rrdf004mType getDataObjRr04m() {
        return dataObjRr04m;
    }

    /**
     * Sets the data obj rr04m.
     * 
     * @param dataObjRr04m
     *            the new data obj rr04m
     */
    public void setDataObjRr04m(Rrdf004mType dataObjRr04m) {
        this.dataObjRr04m = dataObjRr04m;
        if (dataObjRr04m != null) {
            this.setPersonId(dataObjRr04m.getPersonId());
            this.setPersonName(dataObjRr04m.getPersonName());
            this.setAdminOfficeCode(dataObjRr04m.getAdminOfficeCode());
        }
    }

    /**
     * Gets the data obj rc02m.
     * 
     * @return the data obj rc02m
     */
    public Rcdf002mType getDataObjRc02m() {
        return dataObjRc02m;
    }

    /**
     * Sets the data obj rc02m.
     * 
     * @param dataObjRc02m
     *            the new data obj rc02m
     */
    public void setDataObjRc02m(Rcdf002mType dataObjRc02m) {
        this.dataObjRc02m = dataObjRc02m;
    }

    /**
     * Gets the data obj rc03m.
     * 
     * @return the data obj rc03m
     */
    public Rcdf003mType getDataObjRc03m() {
        return dataObjRc03m;
    }

    /**
     * Sets the data obj rc03m.
     * 
     * @param dataObjRc03m
     *            the new data obj rc03m
     */
    public void setDataObjRc03m(Rcdf003mType dataObjRc03m) {
        this.dataObjRc03m = dataObjRc03m;
    }

}

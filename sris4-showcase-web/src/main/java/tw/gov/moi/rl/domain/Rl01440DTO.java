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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl01440DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01440DTO", propOrder = { "personId", "specialCode", "rldf001mObj", "rldf004mObj", "deleteArr",
        "queryList", "rldf001mObj" ,"rldf004mObj" })
@XmlRootElement(name = "Rl01440DTO")
public class Rl01440DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 特殊註記 */
    @XmlElement(name = "SpecialCode", required = true)
    @FieldName("特殊註記")
    private String specialCode;

    /** 刪除項目 */
    @XmlElement(name = "DeleteArr", required = true)
    @FieldName("刪除項目")
    private Rl01440EditDTO[] deleteArr;

    /** 查詢清單 */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("查詢清單")
    private List<Rl01440EditDTO> queryList;

    /** rldf001m資料 */
    @XmlElement(name = "Rldf001mObj", required = true)
    @FieldName("rldf001m資料")
    private Rldf001mType rldf001mObj;

    /** rldf004m資料 */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("rldf004m資料")
    private Rldf004mType rldf004mObj;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public Rl01440EditDTO[] getDeleteArr() {
        return deleteArr;
    }

    public void setDeleteArr(final Rl01440EditDTO[] deleteArr) {
        this.deleteArr = deleteArr;
    }

    public List<Rl01440EditDTO> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rl01440EditDTO> queryList) {
        this.queryList = queryList;
    }

    public Rldf001mType getRldf001mObj() {
        return rldf001mObj;
    }

    public void setRldf001mObj(final Rldf001mType rldf001mObj) {
        this.rldf001mObj = rldf001mObj;
    }

    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    public void setRldf004mObj(final Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(final String specialCode) {
        this.specialCode = specialCode;
    }

}

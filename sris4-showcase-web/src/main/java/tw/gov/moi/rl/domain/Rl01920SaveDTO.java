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
import tw.gov.moi.domain.Tldf001mType;
import tw.gov.moi.domain.Tldf004mType;

/**
 * The Class Rl01920SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01920SaveDTO", propOrder = { "tldf001mObj", "tldf004mObj", "isNewPersonId" })
@XmlRootElement(name = "Rl01920SaveDTO")
public class Rl01920SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Tldf001m Object */
    @XmlElement(name = "Tldf001mObj", required = true)
    @FieldName("Tldf001m")
    private Tldf001mType tldf001mObj;

    /** Tldf004m Object */
    @XmlElement(name = "Tldf004mObj", required = true)
    @FieldName("Tldf004m")
    private Tldf004mType tldf004mObj;

    /** 新配賦統號 */
    // @XmlElement(name = "IsNewPersonId", required = true)
    // @FieldName("新配賦統號")
    // private String isNewPersonId;

    /** 資料庫類型 */
    @XmlElement(name = "TableType", required = true)
    @FieldName("資料庫類型")
    private String tableType;

    public Tldf001mType getTldf001mObj() {
        return tldf001mObj;
    }

    public void setTldf001mObj(final Tldf001mType tldf001mObj) {
        this.tldf001mObj = tldf001mObj;
    }

    public Tldf004mType getTldf004mObj() {
        return tldf004mObj;
    }

    public void setTldf004mObj(final Tldf004mType tldf004mObj) {
        this.tldf004mObj = tldf004mObj;
    }

    // public String getIsNewPersonId() {
    // return isNewPersonId;
    // }
    //
    // public void setIsNewPersonId(String isNewPersonId) {
    // this.isNewPersonId = isNewPersonId;
    // }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

}

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
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 戶口名簿核發-記事選擇DTO.
 * 
 * @author Weiren.Jheng
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02510NoteDTO", propOrder = { "id", "personNote", "print", "mainType", "mainTypeName", "subType",
        "subTypeName", "type", "mainTypeQuantity", "subTypeQuantity", "mainTypeCheckedQuantity",
        "subTypeCheckedQuantity" })
@XmlRootElement(name = "Rl02510NoteDTO")
public class Rl02510NoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3016796682833913512L;

    /** 序號. */
    @XmlElement(name = "Id")
    @FieldName("序號")
    private Integer id;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNote")
    @FieldName("個人記事資料")
    private XLDFPersonNoteDomainObject personNote;

    /**
     * 是否選擇列印<BR>
     * Default: 否.
     */
    @XmlElement(name = "Print")
    @FieldName("是否選擇列印")
    private boolean print = true;

    /** 主分類. */
    @XmlElement(name = "MainType")
    @FieldName("主分類")
    private String mainType;

    /** 主分類名稱. */
    @XmlElement(name = "MainTypeName")
    @FieldName("主分類名稱")
    private String mainTypeName;

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類")
    private String subType;

    /** 次分類名稱. */
    @XmlElement(name = "SubTypeName")
    @FieldName("次分類名稱")
    private String subTypeName;

    /** 分類. */
    @XmlElement(name = "Type")
    @FieldName("分類")
    private String type;

    /** 屬於主分類的記事數量. */
    @XmlElement(name = "MainTypeQuantity")
    @FieldName("屬於主分類的記事數量")
    private int mainTypeQuantity = 0;

    /** 屬於次分類的記事數量. */
    @XmlElement(name = "SubTypeQuantity")
    @FieldName("屬於次分類的記事數量")
    private int subTypeQuantity = 0;

    /** 屬於主分類已勾選的記事數量. */
    @XmlElement(name = "MainTypeCheckedQuantity")
    @FieldName("屬於主分類已勾選的記事數量")
    private int mainTypeCheckedQuantity = 0;

    /** 屬於次分類已勾選的記事數量. */
    @XmlElement(name = "SubTypeCheckedQuantity")
    @FieldName("屬於次分類已勾選的記事數量")
    private int subTypeCheckedQuantity = 0;

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the person note.
     * 
     * @return the person note
     */
    public XLDFPersonNoteDomainObject getPersonNote() {
        return personNote;
    }

    /**
     * Sets the person note.
     * 
     * @param personNote
     *            the new person note
     */
    public void setPersonNote(XLDFPersonNoteDomainObject personNote) {
        this.personNote = personNote;
    }

    /**
     * Gets the sub type.
     * 
     * @return the sub type
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the sub type.
     * 
     * @param subType
     *            the new sub type
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * Gets the sub type name.
     * 
     * @return the sub type name
     */
    public String getSubTypeName() {
        return subTypeName;
    }

    /**
     * Sets the sub type name.
     * 
     * @param subTypeName
     *            the new sub type name
     */
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    /**
     * Checks if is prints the.
     * 
     * @return true, if is prints the
     */
    public boolean isPrint() {
        return print;
    }

    /**
     * Sets the prints the.
     * 
     * @param print
     *            the new prints the
     */
    public void setPrint(boolean print) {
        this.print = print;
    }

    /**
     * Gets the main type.
     * 
     * @return the main type
     */
    public String getMainType() {
        return mainType;
    }

    /**
     * Sets the main type.
     * 
     * @param mainType
     *            the new main type
     */
    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    /**
     * Gets the main type name.
     * 
     * @return the main type name
     */
    public String getMainTypeName() {
        return mainTypeName;
    }

    /**
     * Sets the main type name.
     * 
     * @param mainTypeName
     *            the new main type name
     */
    public void setMainTypeName(String mainTypeName) {
        this.mainTypeName = mainTypeName;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the main type quantity.
     * 
     * @return the main type quantity
     */
    public int getMainTypeQuantity() {
        return mainTypeQuantity;
    }

    /**
     * Sets the main type quantity.
     * 
     * @param mainTypeQuantity
     *            the new main type quantity
     */
    public void setMainTypeQuantity(int mainTypeQuantity) {
        this.mainTypeQuantity = mainTypeQuantity;
    }

    /**
     * Gets the sub type quantity.
     * 
     * @return the sub type quantity
     */
    public int getSubTypeQuantity() {
        return subTypeQuantity;
    }

    /**
     * Sets the sub type quantity.
     * 
     * @param subTypeQuantity
     *            the new sub type quantity
     */
    public void setSubTypeQuantity(int subTypeQuantity) {
        this.subTypeQuantity = subTypeQuantity;
    }

    /**
     * Gets the main type checked quantity.
     * 
     * @return the main type checked quantity
     */
    public int getMainTypeCheckedQuantity() {
        return mainTypeCheckedQuantity;
    }

    /**
     * Sets the main type checked quantity.
     * 
     * @param mainTypeCheckedQuantity
     *            the new main type checked quantity
     */
    public void setMainTypeCheckedQuantity(int mainTypeCheckedQuantity) {
        this.mainTypeCheckedQuantity = mainTypeCheckedQuantity;
    }

    /**
     * Gets the sub type checked quantity.
     * 
     * @return the sub type checked quantity
     */
    public int getSubTypeCheckedQuantity() {
        return subTypeCheckedQuantity;
    }

    /**
     * Sets the sub type checked quantity.
     * 
     * @param subTypeCheckedQuantity
     *            the new sub type checked quantity
     */
    public void setSubTypeCheckedQuantity(int subTypeCheckedQuantity) {
        this.subTypeCheckedQuantity = subTypeCheckedQuantity;
    }

}

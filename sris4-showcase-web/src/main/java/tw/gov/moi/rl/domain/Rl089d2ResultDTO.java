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
 * The Class Rl089d2ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089d2ResultDTO", propOrder = { "person_id", "result_mark", "result_content_1", "result_content_2", "resident_code", "remark", "birth_yyymmdd", "person_name", "id_card_yyymmdd", "tran_yyy", "tran_type", "street_doorplate", "master_phone", "master_cellphone", "family_name", "family_phome", "family_cellphone", "check_date", "check_code", "area_code", "admin_office_code", "village", "neighbor" })
@XmlRootElement(name = "Rl089d2ResultDTO")
public class Rl089d2ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統號. */
    @XmlElement(name = "PersonIid")
    @FieldName("統號")
    private String person_id = "";

    /** 查對成果. */
    @XmlElement(name = "ResultMmark")
    @FieldName("查對成果")
    private String result_mark = "";

    /** 查對內容1. */
    @XmlElement(name = "ResultContent1")
    @FieldName("查對內容1")
    private String result_content_1 = "";

    /** 查對內容2. */
    @XmlElement(name = "ResultContent2")
    @FieldName("查對內容2")
    private String result_content_2 = "";

    /** 居住現址原因. */
    @XmlElement(name = "ResidentCode")
    @FieldName("居住現址原因")
    private String resident_code = "";

    /** 備註. */
    @XmlElement(name = "Remark")
    @FieldName("備註")
    private String remark = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birth_yyymmdd = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String person_name = "";

    /** 換證日期. */
    @XmlElement(name = "IdCardYyymmdd")
    @FieldName("換證日期")
    private String id_card_yyymmdd = "";

    /** 清查年. */
    @XmlElement(name = "TranYyy")
    @FieldName("清查年")
    private String tran_yyy = "";

    /** 清查對象. */
    @XmlElement(name = "TranType")
    @FieldName("清查對象")
    private String tran_type = "";

    /** 戶籍地址. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("戶籍地址 ")
    private String street_doorplate = "";

    /** 當事人電話. */
    @XmlElement(name = "MasterPhone")
    @FieldName("當事人電話")
    private String master_phone = "";

    /** 當事人手機. */
    @XmlElement(name = "MasterCellphone")
    @FieldName("當事人手機")
    private String master_cellphone = "";

    /** 家屬姓名. */
    @XmlElement(name = "FamilyName")
    @FieldName("家屬姓名")
    private String family_name = "";

    /** 家屬電話. */
    @XmlElement(name = "FamilyPhome")
    @FieldName("家屬電話")
    private String family_phome = "";

    /** 家屬手機. */
    @XmlElement(name = "FamilyCellphone")
    @FieldName("家屬手機")
    private String family_cellphone = "";

    /** 訪查日期. */
    @XmlElement(name = "CheckDate")
    @FieldName("訪查日期")
    private String check_date = "";

    /** 訪查方式. */
    @XmlElement(name = "CheckCode")
    @FieldName("訪查方式")
    private String check_code = "";

    /** 行政區域. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域")
    private String area_code = "";

    /** 戶籍地. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶籍地")
    private String admin_office_code = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /**
     * Gets the person_id.
     * 
     * @return the person_id
     */
    public String getPerson_id() {
        return person_id;
    }

    /**
     * Sets the person_id.
     * 
     * @param person_id
     *            the new person_id
     */
    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    /**
     * Gets the result_mark.
     * 
     * @return the result_mark
     */
    public String getResult_mark() {
        return result_mark;
    }

    /**
     * Sets the result_mark.
     * 
     * @param result_mark
     *            the new result_mark
     */
    public void setResult_mark(String result_mark) {
        this.result_mark = result_mark;
    }

    /**
     * Gets the result_content_1.
     * 
     * @return the result_content_1
     */
    public String getResult_content_1() {
        return result_content_1;
    }

    /**
     * Sets the result_content_1.
     * 
     * @param result_content_1
     *            the new result_content_1
     */
    public void setResult_content_1(String result_content_1) {
        this.result_content_1 = result_content_1;
    }

    /**
     * Gets the result_content_2.
     * 
     * @return the result_content_2
     */
    public String getResult_content_2() {
        return result_content_2;
    }

    /**
     * Sets the result_content_2.
     * 
     * @param result_content_2
     *            the new result_content_2
     */
    public void setResult_content_2(String result_content_2) {
        this.result_content_2 = result_content_2;
    }

    /**
     * Gets the resident_code.
     * 
     * @return the resident_code
     */
    public String getResident_code() {
        return resident_code;
    }

    /**
     * Sets the resident_code.
     * 
     * @param resident_code
     *            the new resident_code
     */
    public void setResident_code(String resident_code) {
        this.resident_code = resident_code;
    }

    /**
     * Gets the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the remark.
     * 
     * @param remark
     *            the new remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets the birth_yyymmdd.
     * 
     * @return the birth_yyymmdd
     */
    public String getBirth_yyymmdd() {
        return birth_yyymmdd;
    }

    /**
     * Sets the birth_yyymmdd.
     * 
     * @param birth_yyymmdd
     *            the new birth_yyymmdd
     */
    public void setBirth_yyymmdd(String birth_yyymmdd) {
        this.birth_yyymmdd = birth_yyymmdd;
    }

    /**
     * Gets the person_name.
     * 
     * @return the person_name
     */
    public String getPerson_name() {
        return person_name;
    }

    /**
     * Sets the person_name.
     * 
     * @param person_name
     *            the new person_name
     */
    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    /**
     * Gets the id_card_yyymmdd.
     * 
     * @return the id_card_yyymmdd
     */
    public String getId_card_yyymmdd() {
        return id_card_yyymmdd;
    }

    /**
     * Sets the id_card_yyymmdd.
     * 
     * @param id_card_yyymmdd
     *            the new id_card_yyymmdd
     */
    public void setId_card_yyymmdd(String id_card_yyymmdd) {
        this.id_card_yyymmdd = id_card_yyymmdd;
    }

    /**
     * Gets the tran_yyy.
     * 
     * @return the tran_yyy
     */
    public String getTran_yyy() {
        return tran_yyy;
    }

    /**
     * Sets the tran_yyy.
     * 
     * @param tran_yyy
     *            the new tran_yyy
     */
    public void setTran_yyy(String tran_yyy) {
        this.tran_yyy = tran_yyy;
    }

    /**
     * Gets the street_doorplate.
     * 
     * @return the street_doorplate
     */
    public String getStreet_doorplate() {
        return street_doorplate;
    }

    /**
     * Sets the street_doorplate.
     * 
     * @param street_doorplate
     *            the new street_doorplate
     */
    public void setStreet_doorplate(String street_doorplate) {
        this.street_doorplate = street_doorplate;
    }

    /**
     * Gets the master_phone.
     * 
     * @return the master_phone
     */
    public String getMaster_phone() {
        return master_phone;
    }

    /**
     * Sets the master_phone.
     * 
     * @param master_phone
     *            the new master_phone
     */
    public void setMaster_phone(String master_phone) {
        this.master_phone = master_phone;
    }

    /**
     * Gets the master_cellphone.
     * 
     * @return the master_cellphone
     */
    public String getMaster_cellphone() {
        return master_cellphone;
    }

    /**
     * Sets the master_cellphone.
     * 
     * @param master_cellphone
     *            the new master_cellphone
     */
    public void setMaster_cellphone(String master_cellphone) {
        this.master_cellphone = master_cellphone;
    }

    /**
     * Gets the family_name.
     * 
     * @return the family_name
     */
    public String getFamily_name() {
        return family_name;
    }

    /**
     * Sets the family_name.
     * 
     * @param family_name
     *            the new family_name
     */
    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    /**
     * Gets the family_phome.
     * 
     * @return the family_phome
     */
    public String getFamily_phome() {
        return family_phome;
    }

    /**
     * Sets the family_phome.
     * 
     * @param family_phome
     *            the new family_phome
     */
    public void setFamily_phome(String family_phome) {
        this.family_phome = family_phome;
    }

    /**
     * Gets the family_cellphone.
     * 
     * @return the family_cellphone
     */
    public String getFamily_cellphone() {
        return family_cellphone;
    }

    /**
     * Sets the family_cellphone.
     * 
     * @param family_cellphone
     *            the new family_cellphone
     */
    public void setFamily_cellphone(String family_cellphone) {
        this.family_cellphone = family_cellphone;
    }

    /**
     * Gets the check_date.
     * 
     * @return the check_date
     */
    public String getCheck_date() {
        return check_date;
    }

    /**
     * Sets the check_date.
     * 
     * @param check_date
     *            the new check_date
     */
    public void setCheck_date(String check_date) {
        this.check_date = check_date;
    }

    /**
     * Gets the check_code.
     * 
     * @return the check_code
     */
    public String getCheck_code() {
        return check_code;
    }

    /**
     * Sets the check_code.
     * 
     * @param check_code
     *            the new check_code
     */
    public void setCheck_code(String check_code) {
        this.check_code = check_code;
    }

    /**
     * Gets the tran_type.
     * 
     * @return the tran_type
     */
    public String getTran_type() {
        return tran_type;
    }

    /**
     * Sets the tran_type.
     * 
     * @param tran_type
     *            the new tran_type
     */
    public void setTran_type(String tran_type) {
        this.tran_type = tran_type;
    }

    /**
     * Gets the area_code.
     * 
     * @return the area_code
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * Sets the area_code.
     * 
     * @param area_code
     *            the new area_code
     */
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    /**
     * Gets the admin_office_code.
     * 
     * @return the admin_office_code
     */
    public String getAdmin_office_code() {
        return admin_office_code;
    }

    /**
     * Sets the admin_office_code.
     * 
     * @param admin_office_code
     *            the new admin_office_code
     */
    public void setAdmin_office_code(String admin_office_code) {
        this.admin_office_code = admin_office_code;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    @Override
    public String toString() {
        return "Rl089d2ResultDTO [person_id=" + person_id + ", result_mark=" + result_mark + ", result_content_1=" + result_content_1 + ", result_content_2=" + result_content_2 + ", resident_code=" + resident_code + ", remark=" + remark + ", birth_yyymmdd=" + birth_yyymmdd + ", person_name=" + person_name + ", id_card_yyymmdd=" + id_card_yyymmdd + ", tran_yyy=" + tran_yyy + ", tran_type=" + tran_type + ", street_doorplate=" + street_doorplate + ", master_phone=" + master_phone + ", master_cellphone=" + master_cellphone + ", family_name=" + family_name + ", family_phome=" + family_phome + ", family_cellphone=" + family_cellphone + ", check_date=" + check_date + ", check_code=" + check_code + ", area_code=" + area_code + ", admin_office_code=" + admin_office_code + ", village=" + village + ", neighbor=" + neighbor + "]";
    }

}

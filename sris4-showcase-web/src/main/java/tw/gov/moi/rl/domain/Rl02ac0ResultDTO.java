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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Xldfs040Type;

/**
 * The Class Rl02ac0ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02ac0ResultDTO", propOrder = { "index", "personId", "personName", "birthYyymmdd", "birthPlaceCode",
        "freePhoto", "nophotoReason", "nophotoRemark", "cellPhoneNumber", "choosePhoneNumber", "dayPhoneAreacode",
        "dayPhoneNumber", "dayPhoneExtension", "xldfs040", "otherBirthPlace" })
@XmlRootElement(name = "Rl02ac0ResultDTO")
public class Rl02ac0ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 序號 */
    @FieldName("序號")
    @XmlElement(name = "Index")
    private String index = "";

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId = "";

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName = "";

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "BirthYyymmdd")
    private String birthYyymmdd = "";

    /** 出生地 */
    @FieldName("出生地")
    @XmlElement(name = "BirthPlaceCode")
    private String birthPlaceCode = "";

    /** 免列印相片 */
    @FieldName("免列印相片")
    @XmlElement(name = "FreePhoto")
    private String freePhoto = "";

    /** 免列印相片原因 */
    @FieldName("免列印相片原因")
    @XmlElement(name = "NophotoReason")
    private String nophotoReason = "";

    /** 免列印相片說明 */
    @FieldName("免列印相片說明")
    @XmlElement(name = "NophotoRemark")
    private String nophotoRemark = "";

    /** 行動電話 */
    @FieldName("行動電話")
    @XmlElement(name = "CellPhoneNumber")
    private String cellPhoneNumber = "";

    @FieldName("Rldf004m")
    @XmlElement(name = "Rldf004m")
    private Rldf004mType rldf004m = null;

    @FieldName("Rldf001m")
    @XmlElement(name = "Rldf001m")
    private Rldf001mType rldf001m = null;

    @FieldName("Rldf008m")
    @XmlElement(name = "Rldf008m")
    private Rldf008mType rldf008m = null;

    @FieldName("Rldf002d")
    @XmlElement(name = "Rldf002d")
    private Rldf002dType rldf002d = null;

    @FieldName("IsNophoto")
    @XmlElement(name = "IsNophoto")
    private Boolean isNophoto;

    @FieldName("IsOther")
    @XmlElement(name = "IsOther")
    private Boolean isOther;

    /** 選擇室內或行動電話. */
    @FieldName("ChoosePhoneNumber")
    @XmlElement(name = "選擇室內或行動電話")
    private String choosePhoneNumber = "";

    /** 室內電話區域號碼. */
    @FieldName("室內電話區域號碼")
    @XmlElement(name = "DayPhoneAreacode")
    private String dayPhoneAreacode = "";

    /** 室內電話. */
    @FieldName("室內電話")
    @XmlElement(name = "DayPhoneNumber")
    private String dayPhoneNumber = "";

    /** 室內電話分機. */
    @FieldName("室內電話分機")
    @XmlElement(name = "DayPhoneExtension")
    private String dayPhoneExtension = "";

    /** 申請書資料暫存檔. */
    @FieldName("申請書資料暫存檔")
    @XmlElement(name = "Xldfs040")
    private Xldfs040Type xldfs040;

    /** 其他出生地. */
    @FieldName("其他出生地")
    @XmlElement(name = "OtherBirthPlace")
    private String otherBirthPlace = "";

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public String getFreePhoto() {
        return freePhoto;
    }

    public void setFreePhoto(String freePhoto) {
        this.freePhoto = freePhoto;
    }

    public String getNophotoReason() {
        return nophotoReason;
    }

    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    public String getNophotoRemark() {
        return nophotoRemark;
    }

    public void setNophotoRemark(String nophotoRemark) {
        this.nophotoRemark = nophotoRemark;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    public Rldf001mType getRldf001m() {
        return rldf001m;
    }

    public void setRldf001m(Rldf001mType rldf001m) {
        this.rldf001m = rldf001m;
    }

    public Rldf008mType getRldf008m() {
        return rldf008m;
    }

    public void setRldf008m(Rldf008mType rldf008m) {
        this.rldf008m = rldf008m;
    }

    public Rldf002dType getRldf002d() {
        return rldf002d;
    }

    public void setRldf002d(Rldf002dType rldf002d) {
        this.rldf002d = rldf002d;
    }

    public Boolean getIsNophoto() {
        return isNophoto;
    }

    public void setIsNophoto(Boolean isNophoto) {
        this.isNophoto = isNophoto;
    }

    public Boolean getIsOther() {
        return isOther;
    }

    public void setIsOther(Boolean isOther) {
        this.isOther = isOther;
    }

    public String getChoosePhoneNumber() {
        return choosePhoneNumber;
    }

    public void setChoosePhoneNumber(String choosePhoneNumber) {
        this.choosePhoneNumber = choosePhoneNumber;
    }

    public String getDayPhoneAreacode() {
        return dayPhoneAreacode;
    }

    public void setDayPhoneAreacode(String dayPhoneAreacode) {
        this.dayPhoneAreacode = dayPhoneAreacode;
    }

    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    public void setDayPhoneNumber(String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    public void setDayPhoneExtension(String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
    }

    public Xldfs040Type getXldfs040() {
        return xldfs040;
    }

    public void setXldfs040(Xldfs040Type xldfs040) {
        this.xldfs040 = xldfs040;
    }

    public String getOtherBirthPlace() {
        return this.otherBirthPlace;
    }

    public void setOtherBirthPlace(String otherBirthPlace) {
        this.otherBirthPlace = otherBirthPlace;
    }

}

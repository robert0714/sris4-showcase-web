/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 兄弟姊妹基本資料 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a10FamilyImageDTO", propOrder = { "personId", "personName", "birthYyymmdd", "fatherId", "father",
        "motherId", "mother", "adminOfficeCode", "scanDate", "scanTime", "status", "image", "imagePath",
        "birthOrderSex" })
@XmlRootElement(name = "Rl02a10FamilyImageDTO")
public class Rl02a10FamilyImageDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The person id. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** The person name. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** The birth yyymmdd. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** The father id. */
    @XmlElement(name = "FatherId")
    @FieldName("父國民身分證統一編號")
    private String fatherId = "";

    /** The father. */
    @XmlElement(name = "Father")
    @FieldName("父姓名")
    private String father = "";

    /** The mother id. */
    @XmlElement(name = "MotherId")
    @FieldName("母國民身分證統一編號")
    private String motherId = "";

    /** The mother. */
    @XmlElement(name = "Mother")
    @FieldName("母姓名")
    private String mother = "";

    /** The admin office code. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶政事務所")
    private String adminOfficeCode = "";

    /** The scan date. */
    @XmlElement(name = "ScanDate")
    @FieldName("取像日期")
    private String scanDate = "";

    /** The scan time. */
    @XmlElement(name = "ScanTime")
    @FieldName("取像時間")
    private String scanTime = "";

    /** The status. */
    @XmlElement(name = "Status")
    @FieldName("影像狀態")
    private String status = "";

    /** 影像檔. */
    @XmlElement(name = "Image")
    @FieldName("影像檔")
    private byte[] image;

    /** 影像檔路徑. */
    @XmlElement(name = "ImagePath")
    @FieldName("影像檔路徑")
    private String imagePath = "";

    /** 出生別. */
    @XmlElement(name = "BirthOrderSex")
    @FieldName("出生別")
    private String birthOrderSex = "";

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
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the father id.
     * 
     * @return the father id
     */
    public String getFatherId() {
        return fatherId;
    }

    /**
     * Sets the father id.
     * 
     * @param fatherId
     *            the new father id
     */
    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * Gets the father.
     * 
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * Sets the father.
     * 
     * @param father
     *            the new father
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * Gets the mother id.
     * 
     * @return the mother id
     */
    public String getMotherId() {
        return motherId;
    }

    /**
     * Sets the mother id.
     * 
     * @param motherId
     *            the new mother id
     */
    public void setMotherId(String motherId) {
        this.motherId = motherId;
    }

    /**
     * Gets the mother.
     * 
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * Sets the mother.
     * 
     * @param mother
     *            the new mother
     */
    public void setMother(String mother) {
        this.mother = mother;
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
     * Gets the scan date.
     * 
     * @return the scan date
     */
    public String getScanDate() {
        return scanDate;
    }

    /**
     * Sets the scan date.
     * 
     * @param scanDate
     *            the new scan date
     */
    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    /**
     * Gets the scan time.
     * 
     * @return the scan time
     */
    public String getScanTime() {
        return scanTime;
    }

    /**
     * Sets the scan time.
     * 
     * @param scanTime
     *            the new scan time
     */
    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the image.
     * 
     * @return the image
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the image.
     * 
     * @param image
     *            the new image
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Rl02a10FamilyImageDTO [personId=" + personId + ", personName=" + personName + ", birthYyymmdd="
                + birthYyymmdd + ", fatherId=" + fatherId + ", father=" + father + ", motherId=" + motherId
                + ", mother=" + mother + ", adminOfficeCode=" + adminOfficeCode + ", scanDate=" + scanDate
                + ", scanTime=" + scanTime + ", status=" + status + ", image=" + Arrays.toString(image)
                + ", imagePath=" + imagePath + "]";
    }

    /**
     * Gets the image path.
     * 
     * @return the image path
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the image path.
     * 
     * @param imagePath
     *            the new image path
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

}

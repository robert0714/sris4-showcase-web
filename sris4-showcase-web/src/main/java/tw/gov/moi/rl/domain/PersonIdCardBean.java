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
 * 影像掃描 模擬DTO 用Bean Class.
 * 
 * @author Erice
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personIdCardBean", propOrder = { "pageBarcode", "order", "personId", "personImagePath", "personName", "imageType", "scanDate", "scaneTime", "scanSrc", "isSave", "color", "createByUser", "pageReturnCode" })
@XmlRootElement(name = "PersonIdCardBean")
public class PersonIdCardBean implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 申請書條碼. */
    @XmlElement(name = "PageBarcode")
    @FieldName("申請書條碼")
    private String pageBarcode = "";

    /** 掃描順序. */
    @XmlElement(name = "Order")
    @FieldName("掃描順序")
    private String order = "";

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 個人影像暫存檔位置. */
    @XmlElement(name = "PersonImagePath")
    @FieldName("個人影像暫存檔位置")
    private String personImagePath = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 影像種類. */
    @XmlElement(name = "ImageType")
    @FieldName("影像種類")
    private String imageType = "";

    /** 取像日期 民國日期七碼. */
    @XmlElement(name = "ScanDate")
    @FieldName("取像日期 民國日期七碼")
    private String scanDate = "";

    /** 取像時間 時分秒6碼. */
    @XmlElement(name = "ScaneTime")
    @FieldName("取像時間 時分秒6碼")
    private String scaneTime = "";

    /** 掃描原始圖檔 tif. */
    @XmlElement(name = "ScanSrc")
    @FieldName("掃描原始圖檔 tif")
    private String scanSrc = "";

    /** 是否存檔. */
    @XmlElement(name = "IsSave")
    @FieldName("是否存檔")
    private boolean isSave = Boolean.FALSE;

    /** 是否存檔. */
    @XmlElement(name = "Color")
    @FieldName("顏色")
    private String color = "";

    /** 是否戶籍員新增. */
    @XmlElement(name = "CreateByUser")
    @FieldName("是否戶籍員新增")
    private boolean createByUser = Boolean.FALSE;

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
     * Gets the person image path.
     * 
     * @return the person image path
     */
    public String getPersonImagePath() {
        return personImagePath;
    }

    /**
     * Sets the person image path.
     * 
     * @param personImagePath
     *            the new person image path
     */
    public void setPersonImagePath(String personImagePath) {
        this.personImagePath = personImagePath;
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
     * Gets the image type.
     * 
     * @return the image type
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Sets the image type.
     * 
     * @param imageType
     *            the new image type
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
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
     * Gets the scane time.
     * 
     * @return the scane time
     */
    public String getScaneTime() {
        return scaneTime;
    }

    /**
     * Sets the scane time.
     * 
     * @param scaneTime
     *            the new scane time
     */
    public void setScaneTime(String scaneTime) {
        this.scaneTime = scaneTime;
    }

    /**
     * Gets the scan src.
     * 
     * @return the scan src
     */
    public String getScanSrc() {
        return scanSrc;
    }

    /**
     * Sets the scan src.
     * 
     * @param scanSrc
     *            the new scan src
     */
    public void setScanSrc(String scanSrc) {
        this.scanSrc = scanSrc;
    }

    /**
     * Gets the page barcode.
     * 
     * @return the page barcode
     */
    public String getPageBarcode() {
        return pageBarcode;
    }

    /**
     * Sets the page barcode.
     * 
     * @param pageBarcode
     *            the new page barcode
     */
    public void setPageBarcode(String pageBarcode) {
        this.pageBarcode = pageBarcode;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param order
     *            the new order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "PersonIdCardBean [pageBarcode=" + pageBarcode + ", order=" + order + ", personId=" + personId + ", personImagePath=" + personImagePath + ", personName=" + personName + ", imageType=" + imageType + ", scanDate=" + scanDate + ", scaneTime=" + scaneTime + ", scanSrc=" + scanSrc
                + ", isSave=" + isSave + ", color=" + color + ", createByUser=" + createByUser + "]";
    }

    /**
     * Checks if is save.
     * 
     * @return true, if is save
     */
    public boolean isSave() {
        return isSave;
    }

    /**
     * Sets the save.
     * 
     * @param isSave
     *            the new save
     */
    public void setSave(boolean isSave) {
        this.isSave = isSave;
    }

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     * 
     * @param color
     *            the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if is creates the by user.
     * 
     * @return true, if is creates the by user
     */
    public boolean isCreateByUser() {
        return createByUser;
    }

    /**
     * Sets the creates the by user.
     * 
     * @param createByUser
     *            the new creates the by user
     */
    public void setCreateByUser(boolean createByUser) {
        this.createByUser = createByUser;
    }

}

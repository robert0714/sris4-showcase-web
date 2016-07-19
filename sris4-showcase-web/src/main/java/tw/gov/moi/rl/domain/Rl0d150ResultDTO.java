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
import tw.gov.moi.ae.personimage.domain.ImgInfoDto;
import tw.gov.moi.domain.Rldf012dType;

/**
 * 空白國民身分證及膠膜作廢狀況登錄查詢結果 DTO.
 * 
 * @author Marcus Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d150ResultDTO", propOrder = { "cardNo", "cellophaneNo", "personId", "useYyymmdd", "voidingReason",
        "voidingName", "remark", "imgInfoDto", "rldf012d_1", "rldf012d_2" })
@XmlRootElement(name = "Rl0d150ResultDTO")
public class Rl0d150ResultDTO implements Serializable {

    /** The Serail Id. */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 空白國民身分證號. */
    @XmlElement(name = "CardNo", required = true)
    @FieldName("空白國民身分證號 ")
    private String cardNo = "";

    /** 膠膜號. */
    @XmlElement(name = "CellophaneNo", required = true)
    @FieldName("膠膜號 ")
    private String cellophaneNo = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 使用日期. */
    @XmlElement(name = "UseYyymmdd", required = true)
    @FieldName("使用日期")
    private String useYyymmdd = "";

    /** 作廢原因. */
    @XmlElement(name = "VoidingCode", required = true)
    @FieldName("作廢原因")
    private String voidingCode = "";

    /** 造成作廢人員. */
    @XmlElement(name = "VoidingName", required = true)
    @FieldName("造成作廢人員")
    private String voidingName = "";

    /** 備註. */
    @XmlElement(name = "VoidingReason", required = true)
    @FieldName("備註")
    private String voidingReason = "";

    /** 影像索引資料. */
    @XmlElement(name = "ImgInfoDto", required = true)
    @FieldName("影像索引資料")
    private ImgInfoDto imgInfoDto;

    /** 空白國民身分證使用記錄檔. */
    @XmlElement(name = "Rldf012d_1", required = true)
    @FieldName("空白國民身分證使用記錄檔")
    private Rldf012dType rldf012d_1;

    /** 膠膜使用記錄檔. */
    @XmlElement(name = "Rldf012d_2", required = true)
    @FieldName("膠膜使用記錄檔")
    private Rldf012dType rldf012d_2;

    /**
     * Gets the card no.
     * 
     * @return the cardNo
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the card no.
     * 
     * @param cardNo
     *            the cardNo to set
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * Gets the cellophane no.
     * 
     * @return the cellophaneNo
     */
    public String getCellophaneNo() {
        return cellophaneNo;
    }

    /**
     * Sets the cellophane no.
     * 
     * @param cellophaneNo
     *            the cellophaneNo to set
     */
    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    /**
     * Gets the person id.
     * 
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the use yyymmdd.
     * 
     * @return the useYyymmdd
     */
    public String getUseYyymmdd() {
        return useYyymmdd;
    }

    /**
     * Sets the use yyymmdd.
     * 
     * @param useYyymmdd
     *            the useYyymmdd to set
     */
    public void setUseYyymmdd(String useYyymmdd) {
        this.useYyymmdd = useYyymmdd;
    }

    /**
     * Gets the voiding reason.
     * 
     * @return the voidingReason
     */
    public String getVoidingReason() {
        return voidingReason;
    }

    /**
     * Sets the voiding reason.
     * 
     * @param voidingReason
     *            the voidingReason to set
     */
    public void setVoidingReason(String voidingReason) {
        this.voidingReason = voidingReason;
    }

    /**
     * Gets the voiding name.
     * 
     * @return the voidingName
     */
    public String getVoidingName() {
        return voidingName;
    }

    /**
     * Sets the voiding name.
     * 
     * @param voidingName
     *            the voidingName to set
     */
    public void setVoidingName(String voidingName) {
        this.voidingName = voidingName;
    }

    /**
     * Gets the voiding code.
     * 
     * @return the voidingCode
     */
    public String getVoidingCode() {
        return voidingCode;
    }

    /**
     * Sets the voiding code.
     * 
     * @param voidingCode
     *            the voidingCode to set
     */
    public void setVoidingCode(String voidingCode) {
        this.voidingCode = voidingCode;
    }

    /**
     * Gets the img info dto.
     * 
     * @return the img info dto
     */
    public ImgInfoDto getImgInfoDto() {
        return imgInfoDto;
    }

    /**
     * Sets the img info dto.
     * 
     * @param imgInfoDto
     *            the new img info dto
     */
    public void setImgInfoDto(ImgInfoDto imgInfoDto) {
        this.imgInfoDto = imgInfoDto;
    }

    public Rldf012dType getRldf012d_1() {
        return rldf012d_1;
    }

    public void setRldf012d_1(Rldf012dType rldf012d_1) {
        this.rldf012d_1 = rldf012d_1;
    }

    public Rldf012dType getRldf012d_2() {
        return rldf012d_2;
    }

    public void setRldf012d_2(Rldf012dType rldf012d_2) {
        this.rldf012d_2 = rldf012d_2;
    }

}

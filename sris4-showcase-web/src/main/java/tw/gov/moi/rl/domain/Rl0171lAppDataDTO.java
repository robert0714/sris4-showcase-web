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

/**
 * 原住民身分及族別更正AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171lAppDataDTO", propOrder = { "beforeLivingStyleCode", "beforeLivingRaceType",
        "afterLivingStyleCode", "afterLivingRaceType", "updateYyymmdd", "quoteLowCode", "updateReasonCode",
        "otherUpdateReason", "otherCertificate", "certificateList", "nameRomanization" })
@XmlRootElement(name = "Rl0171lAppDataDTO")
public class Rl0171lAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2204891966711093351L;

    /** 原原住民身分. */
    @XmlElement(name = "BeforeLivingStyleCode")
    @FieldName("原原住民身分")
    private String beforeLivingStyleCode;

    /** 原原住民族別. */
    @XmlElement(name = "BeforeLivingRaceType")
    @FieldName("原原住民族別")
    private String beforeLivingRaceType;

    /** 新原住民身分. */
    @XmlElement(name = "AfterLivingStyleCode")
    @FieldName("新原住民身分")
    private String afterLivingStyleCode = "0";

    /** 新原住民族別. */
    @XmlElement(name = "AfterLivingRaceType")
    @FieldName("新原住民族別")
    private String afterLivingRaceType;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "01";

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因代碼")
    private String updateReasonCode = "01";

    /** 其他更正原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他更正原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 姓名羅馬拼音. */
    @XmlElement(name = "NameRomanization")
    @FieldName("姓名羅馬拼音")
    private String nameRomanization;

    /**
     * Gets the before living style code.
     * 
     * @return the before living style code
     */
    public String getBeforeLivingStyleCode() {
        return beforeLivingStyleCode;
    }

    /**
     * Sets the before living style code.
     * 
     * @param beforeLivingStyleCode
     *            the new before living style code
     */
    public void setBeforeLivingStyleCode(final String beforeLivingStyleCode) {
        this.beforeLivingStyleCode = beforeLivingStyleCode;
    }

    /**
     * Gets the before living race type.
     * 
     * @return the before living race type
     */
    public String getBeforeLivingRaceType() {
        return beforeLivingRaceType;
    }

    /**
     * Sets the before living race type.
     * 
     * @param beforeLivingRaceType
     *            the new before living race type
     */
    public void setBeforeLivingRaceType(final String beforeLivingRaceType) {
        this.beforeLivingRaceType = beforeLivingRaceType;
    }

    /**
     * Gets the after living style code.
     * 
     * @return the after living style code
     */
    public String getAfterLivingStyleCode() {
        return afterLivingStyleCode;
    }

    /**
     * Sets the after living style code.
     * 
     * @param afterLivingStyleCode
     *            the new after living style code
     */
    public void setAfterLivingStyleCode(final String afterLivingStyleCode) {
        this.afterLivingStyleCode = afterLivingStyleCode;
    }

    /**
     * Gets the after living race type.
     * 
     * @return the after living race type
     */
    public String getAfterLivingRaceType() {
        return afterLivingRaceType;
    }

    /**
     * Sets the after living race type.
     * 
     * @param afterLivingRaceType
     *            the new after living race type
     */
    public void setAfterLivingRaceType(final String afterLivingRaceType) {
        this.afterLivingRaceType = afterLivingRaceType;
    }

    /**
     * Gets the update yyymmdd.
     * 
     * @return the update yyymmdd
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * Sets the update yyymmdd.
     * 
     * @param updateYyymmdd
     *            the new update yyymmdd
     */
    public void setUpdateYyymmdd(final String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the quote low code.
     * 
     * @return the quote low code
     */
    public String getQuoteLowCode() {
        return quoteLowCode;
    }

    /**
     * Sets the quote low code.
     * 
     * @param quoteLowCode
     *            the new quote low code
     */
    public void setQuoteLowCode(final String quoteLowCode) {
        this.quoteLowCode = quoteLowCode;
    }

    /**
     * Gets the update reason code.
     * 
     * @return the update reason code
     */
    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    /**
     * Sets the update reason code.
     * 
     * @param updateReasonCode
     *            the new update reason code
     */
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * Gets the other update reason.
     * 
     * @return the other update reason
     */
    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    /**
     * Sets the other update reason.
     * 
     * @param otherUpdateReason
     *            the new other update reason
     */
    public void setOtherUpdateReason(final String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Gets the name romanization.
     * 
     * @return the name romanization
     */
    public String getNameRomanization() {
        return nameRomanization;
    }

    /**
     * Sets the name romanization.
     * 
     * @param nameRomanization
     *            the new name romanization
     */
    public void setNameRomanization(final String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterLivingRaceType == null) ? 0 : afterLivingRaceType.hashCode());
        result = prime * result + ((afterLivingStyleCode == null) ? 0 : afterLivingStyleCode.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((quoteLowCode == null) ? 0 : quoteLowCode.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl0171lAppDataDTO other = (Rl0171lAppDataDTO) obj;
        if (afterLivingRaceType == null) {
            if (other.afterLivingRaceType != null)
                return false;
        } else if (!afterLivingRaceType.equals(other.afterLivingRaceType))
            return false;
        if (afterLivingStyleCode == null) {
            if (other.afterLivingStyleCode != null)
                return false;
        } else if (!afterLivingStyleCode.equals(other.afterLivingStyleCode))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (otherUpdateReason == null) {
            if (other.otherUpdateReason != null)
                return false;
        } else if (!otherUpdateReason.equals(other.otherUpdateReason))
            return false;
        if (quoteLowCode == null) {
            if (other.quoteLowCode != null)
                return false;
        } else if (!quoteLowCode.equals(other.quoteLowCode))
            return false;
        if (updateReasonCode == null) {
            if (other.updateReasonCode != null)
                return false;
        } else if (!updateReasonCode.equals(other.updateReasonCode))
            return false;
        if (updateYyymmdd == null) {
            if (other.updateYyymmdd != null)
                return false;
        } else if (!updateYyymmdd.equals(other.updateYyymmdd))
            return false;
        return true;
    }
}

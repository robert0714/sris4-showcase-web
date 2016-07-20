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
 * 出生別更正登記 AppDataDTO.
 * 
 * @author Dan Tsai
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171gAppDataDTO", propOrder = { "beforeRelationship", "afterRelationship", "beforeBirthOrder",
        "afterBirthOrder", "updateYyymmdd", "updateReasonCode", "otherUpdateReason", "otherCertificate",
        "certificateList" })
@XmlRootElement(name = "Rl0171gAppDataDTO")
public class Rl0171gAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2175536277733271065L;

    /** 原稱謂. */
    @XmlElement(name = "BeforeRelationship")
    @FieldName("原稱謂")
    private String beforeRelationship;

    /** 更正後稱謂. */
    @XmlElement(name = "AfterRelationship")
    @FieldName("更正後稱謂")
    private String afterRelationship;

    /** 原出生別. */
    @XmlElement(name = "BeforeBirthOrder")
    @FieldName("原出生別")
    private String beforeBirthOrder;

    /** 更正後出生別. */
    @XmlElement(name = "AfterBirthOrder")
    @FieldName("更正後出生別")
    private String afterBirthOrder;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因代碼")
    private String updateReasonCode = "1";

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

    /**
     * Gets the before relationship.
     * 
     * @return the before relationship
     */
    public String getBeforeRelationship() {
        return beforeRelationship;
    }

    /**
     * Sets the before relationship.
     * 
     * @param beforeRelationship
     *            the new before relationship
     */
    public void setBeforeRelationship(final String beforeRelationship) {
        this.beforeRelationship = beforeRelationship;
    }

    /**
     * Gets the after relationship.
     * 
     * @return the after relationship
     */
    public String getAfterRelationship() {
        return afterRelationship;
    }

    /**
     * Sets the after relationship.
     * 
     * @param afterRelationship
     *            the new after relationship
     */
    public void setAfterRelationship(final String afterRelationship) {
        this.afterRelationship = afterRelationship;
    }

    /**
     * Gets the before birth order.
     * 
     * @return the before birth order
     */
    public String getBeforeBirthOrder() {
        return beforeBirthOrder;
    }

    /**
     * Sets the before birth order.
     * 
     * @param beforeBirthOrder
     *            the new before birth order
     */
    public void setBeforeBirthOrder(final String beforeBirthOrder) {
        this.beforeBirthOrder = beforeBirthOrder;
    }

    /**
     * Gets the after birth order.
     * 
     * @return the after birth order
     */
    public String getAfterBirthOrder() {
        return afterBirthOrder;
    }

    /**
     * Sets the after birth order.
     * 
     * @param afterBirthOrder
     *            the new after birth order
     */
    public void setAfterBirthOrder(final String afterBirthOrder) {
        this.afterBirthOrder = afterBirthOrder;
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
    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterBirthOrder == null) ? 0 : afterBirthOrder.hashCode());
        result = prime * result + ((afterRelationship == null) ? 0 : afterRelationship.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl0171gAppDataDTO other = (Rl0171gAppDataDTO) obj;
        if (afterBirthOrder == null) {
            if (other.afterBirthOrder != null)
                return false;
        } else if (!afterBirthOrder.equals(other.afterBirthOrder))
            return false;
        if (afterRelationship == null) {
            if (other.afterRelationship != null)
                return false;
        } else if (!afterRelationship.equals(other.afterRelationship))
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
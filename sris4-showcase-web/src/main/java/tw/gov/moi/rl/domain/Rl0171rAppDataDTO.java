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
 * 養母姓名更正登記 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171rAppDataDTO", propOrder = { "beforeFosterMother", "beforeFosterMotherLastName",
        "beforeFosterMotherFirstName", "afterFosterMother", "afterFosterMotherLastName", "afterFosterMotherFirstName",
        "updateYyymmdd", "quoteLowCode", "updateReasonCode", "otherUpdateReason", "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl0171rAppDataDTO")
public class Rl0171rAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6238511471568844209L;

    /** 原養母姓名. */
    @XmlElement(name = "BeforeFosterMother")
    @FieldName("原養母姓名")
    private String beforeFosterMother;

    /** 原養母姓. */
    @XmlElement(name = "BeforeFosterMotherLastName")
    @FieldName("原養母姓")
    private String beforeFosterMotherLastName;

    /** 原養母名. */
    @XmlElement(name = "BeforeFosterMotherFirstName")
    @FieldName("原養母名")
    private String beforeFosterMotherFirstName;

    /** 更正後養母姓名. */
    @XmlElement(name = "AfterFosterMother")
    @FieldName("更正後養母姓名")
    private String afterFosterMother;

    /** 更正後養母姓. */
    @XmlElement(name = "AfterFosterMotherLastName")
    @FieldName("更正後養母姓")
    private String afterFosterMotherLastName;

    /** 更正後養母名. */
    @XmlElement(name = "AfterFosterMotherFirstName")
    @FieldName("更正後養母名")
    private String afterFosterMotherFirstName;

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

    /**
     * Gets the before foster mother.
     * 
     * @return the before foster mother
     */
    public String getBeforeFosterMother() {
        return beforeFosterMother;
    }

    /**
     * Sets the before foster mother.
     * 
     * @param beforeFosterMother
     *            the new before foster mother
     */
    public void setBeforeFosterMother(final String beforeFosterMother) {
        this.beforeFosterMother = beforeFosterMother;
    }

    /**
     * Gets the before foster mother last name.
     * 
     * @return the before foster mother last name
     */
    public String getBeforeFosterMotherLastName() {
        return beforeFosterMotherLastName;
    }

    /**
     * Sets the before foster mother last name.
     * 
     * @param beforeFosterMotherLastName
     *            the new before foster mother last name
     */
    public void setBeforeFosterMotherLastName(final String beforeFosterMotherLastName) {
        this.beforeFosterMotherLastName = beforeFosterMotherLastName;
    }

    /**
     * Gets the before foster mother first name.
     * 
     * @return the before foster mother first name
     */
    public String getBeforeFosterMotherFirstName() {
        return beforeFosterMotherFirstName;
    }

    /**
     * Sets the before foster mother first name.
     * 
     * @param beforeFosterMotherFirstName
     *            the new before foster mother first name
     */
    public void setBeforeFosterMotherFirstName(final String beforeFosterMotherFirstName) {
        this.beforeFosterMotherFirstName = beforeFosterMotherFirstName;
    }

    /**
     * Gets the after foster mother.
     * 
     * @return the after foster mother
     */
    public String getAfterFosterMother() {
        return afterFosterMother;
    }

    /**
     * Sets the after foster mother.
     * 
     * @param afterFosterMother
     *            the new after foster mother
     */
    public void setAfterFosterMother(final String afterFosterMother) {
        this.afterFosterMother = afterFosterMother;
    }

    /**
     * Gets the after foster mother last name.
     * 
     * @return the after foster mother last name
     */
    public String getAfterFosterMotherLastName() {
        return afterFosterMotherLastName;
    }

    /**
     * Sets the after foster mother last name.
     * 
     * @param afterFosterMotherLastName
     *            the new after foster mother last name
     */
    public void setAfterFosterMotherLastName(final String afterFosterMotherLastName) {
        this.afterFosterMotherLastName = afterFosterMotherLastName;
    }

    /**
     * Gets the after foster mother first name.
     * 
     * @return the after foster mother first name
     */
    public String getAfterFosterMotherFirstName() {
        return afterFosterMotherFirstName;
    }

    /**
     * Sets the after foster mother first name.
     * 
     * @param afterFosterMotherFirstName
     *            the new after foster mother first name
     */
    public void setAfterFosterMotherFirstName(final String afterFosterMotherFirstName) {
        this.afterFosterMotherFirstName = afterFosterMotherFirstName;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterFosterMother == null) ? 0 : afterFosterMother.hashCode());
        result = prime * result + ((afterFosterMotherFirstName == null) ? 0 : afterFosterMotherFirstName.hashCode());
        result = prime * result + ((afterFosterMotherLastName == null) ? 0 : afterFosterMotherLastName.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
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
        Rl0171rAppDataDTO other = (Rl0171rAppDataDTO) obj;
        if (afterFosterMother == null) {
            if (other.afterFosterMother != null)
                return false;
        } else if (!afterFosterMother.equals(other.afterFosterMother))
            return false;
        if (afterFosterMotherFirstName == null) {
            if (other.afterFosterMotherFirstName != null)
                return false;
        } else if (!afterFosterMotherFirstName.equals(other.afterFosterMotherFirstName))
            return false;
        if (afterFosterMotherLastName == null) {
            if (other.afterFosterMotherLastName != null)
                return false;
        } else if (!afterFosterMotherLastName.equals(other.afterFosterMotherLastName))
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

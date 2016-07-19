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
import tw.gov.moi.rl.rl01700.service.Rl0172aService;

/**
 * 戶長變更AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0172aAppDataDTO", propOrder = { "beforeHouseholdHeadId", "beforeHeadName", "beforeHeadLastName",
        "beforeHeadFirstName", "beforeHouseholdId", "afterHouseholdHeadId", "afterHeadName", "afterHeadLastName",
        "afterHeadFirstName", "afterHouseholdId", "updateYyymmdd", "quoteLowCode", "updateReasonCode",
        "otherUpdateReason", "otherCertificate", "certificateList", "bigHousehold", "beforeConcurrentHeadMark",
        "afterConcurrentHeadMark", "householdHeadSiteId", "newHouseholdHeadId", "changeType",
        "afterHeadBeforeRelationship" })
@XmlRootElement(name = "Rl0172aAppDataDTO")
public class Rl0172aAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -241045853854850487L;

    /** 原戶長統編. */
    @XmlElement(name = "BeforeHouseholdHeadId")
    @FieldName("原戶長統編")
    private String beforeHouseholdHeadId;

    /** 原戶長姓名. */
    @XmlElement(name = "BeforeHeadName")
    @FieldName("原戶長姓名")
    private String beforeHeadName;

    /** 原戶長姓. */
    @XmlElement(name = "BeforeHeadLastName")
    @FieldName("原戶長姓")
    private String beforeHeadLastName;

    /** 原戶長名. */
    @XmlElement(name = "BeforeHeadFirstName")
    @FieldName("原戶長名")
    private String beforeHeadFirstName;

    /** 原戶號. */
    @XmlElement(name = "BeforeHouseholdId")
    @FieldName("原戶號")
    private String beforeHouseholdId;

    /** 新戶長統編. */
    @XmlElement(name = "AfterHouseholdHeadId")
    @FieldName("新戶長統編")
    private String afterHouseholdHeadId;

    /** 新戶長姓名. */
    @XmlElement(name = "AfterHeadName")
    @FieldName("新戶長姓名")
    private String afterHeadName;

    /** 新戶長姓. */
    @XmlElement(name = "AfterHeadLastName")
    @FieldName("新戶長姓")
    private String afterHeadLastName;

    /** 新戶長名. */
    @XmlElement(name = "AfterHeadFirstName")
    @FieldName("新戶長名")
    private String afterHeadFirstName;

    /** 新戶號. */
    @XmlElement(name = "AfterHouseholdId")
    @FieldName("新戶號")
    private String afterHouseholdId;

    /** 變更日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("變更日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode;

    /** 變更原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("變更原因代碼")
    private String updateReasonCode = "01";

    /** 其他變更原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他變更原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 是否為大戶. */
    @XmlElement(name = "BigHousehold")
    @FieldName("是否為大戶")
    private boolean bigHousehold;

    /** 舊兼任戶長註記. */
    @XmlElement(name = "BeforeConcurrentHeadMark")
    @FieldName("舊兼任戶長註記")
    private String beforeConcurrentHeadMark;

    /** 新兼任戶長註記. */
    @XmlElement(name = "AfterConcurrentHeadMark")
    @FieldName("新兼任戶長註記")
    private String afterConcurrentHeadMark;

    /** 戶長作業點代碼. */
    @XmlElement(name = "HouseholdHeadSiteId")
    @FieldName("戶長作業點代碼")
    private String householdHeadSiteId;

    /** 大戶新戶長統號. */
    @XmlElement(name = "NewHouseholdHeadId")
    @FieldName("大戶新戶長統號")
    private String newHouseholdHeadId;

    /** 更改類別. */
    @XmlElement(name = "ChangeType")
    @FieldName("更改類別")
    private Rl0172aService.ChangeType changeType = Rl0172aService.ChangeType.FULL_TO_FULL;

    /** 新戶長原稱謂. */
    @XmlElement(name = "AfterHeadBeforeRelationship")
    @FieldName("新戶長原稱謂")
    private String afterHeadBeforeRelationship;

    /**
     * Gets the before household head id.
     * 
     * @return the before household head id
     */
    public String getBeforeHouseholdHeadId() {
        return beforeHouseholdHeadId;
    }

    /**
     * Sets the before household head id.
     * 
     * @param beforeHouseholdHeadId
     *            the new before household head id
     */
    public void setBeforeHouseholdHeadId(final String beforeHouseholdHeadId) {
        this.beforeHouseholdHeadId = beforeHouseholdHeadId;
    }

    /**
     * Gets the before head name.
     * 
     * @return the before head name
     */
    public String getBeforeHeadName() {
        return beforeHeadName;
    }

    /**
     * Sets the before head name.
     * 
     * @param beforeHeadName
     *            the new before head name
     */
    public void setBeforeHeadName(final String beforeHeadName) {
        this.beforeHeadName = beforeHeadName;
    }

    /**
     * Gets the before head last name.
     * 
     * @return the before head last name
     */
    public String getBeforeHeadLastName() {
        return beforeHeadLastName;
    }

    /**
     * Sets the before head last name.
     * 
     * @param beforeHeadLastName
     *            the new before head last name
     */
    public void setBeforeHeadLastName(final String beforeHeadLastName) {
        this.beforeHeadLastName = beforeHeadLastName;
    }

    /**
     * Gets the before head first name.
     * 
     * @return the before head first name
     */
    public String getBeforeHeadFirstName() {
        return beforeHeadFirstName;
    }

    /**
     * Sets the before head first name.
     * 
     * @param beforeHeadFirstName
     *            the new before head first name
     */
    public void setBeforeHeadFirstName(final String beforeHeadFirstName) {
        this.beforeHeadFirstName = beforeHeadFirstName;
    }

    /**
     * Gets the before household id.
     * 
     * @return the before household id
     */
    public String getBeforeHouseholdId() {
        return beforeHouseholdId;
    }

    /**
     * Sets the before household id.
     * 
     * @param beforeHouseholdId
     *            the new before household id
     */
    public void setBeforeHouseholdId(final String beforeHouseholdId) {
        this.beforeHouseholdId = beforeHouseholdId;
    }

    /**
     * Gets the after household head id.
     * 
     * @return the after household head id
     */
    public String getAfterHouseholdHeadId() {
        return afterHouseholdHeadId;
    }

    /**
     * Sets the after household head id.
     * 
     * @param afterHouseholdHeadId
     *            the new after household head id
     */
    public void setAfterHouseholdHeadId(final String afterHouseholdHeadId) {
        this.afterHouseholdHeadId = afterHouseholdHeadId;
    }

    /**
     * Gets the after head name.
     * 
     * @return the after head name
     */
    public String getAfterHeadName() {
        return afterHeadName;
    }

    /**
     * Sets the after head name.
     * 
     * @param afterHeadName
     *            the new after head name
     */
    public void setAfterHeadName(final String afterHeadName) {
        this.afterHeadName = afterHeadName;
    }

    /**
     * Gets the after head last name.
     * 
     * @return the after head last name
     */
    public String getAfterHeadLastName() {
        return afterHeadLastName;
    }

    /**
     * Sets the after head last name.
     * 
     * @param afterHeadLastName
     *            the new after head last name
     */
    public void setAfterHeadLastName(final String afterHeadLastName) {
        this.afterHeadLastName = afterHeadLastName;
    }

    /**
     * Gets the after head first name.
     * 
     * @return the after head first name
     */
    public String getAfterHeadFirstName() {
        return afterHeadFirstName;
    }

    /**
     * Sets the after head first name.
     * 
     * @param afterHeadFirstName
     *            the new after head first name
     */
    public void setAfterHeadFirstName(final String afterHeadFirstName) {
        this.afterHeadFirstName = afterHeadFirstName;
    }

    /**
     * Gets the after household id.
     * 
     * @return the after household id
     */
    public String getAfterHouseholdId() {
        return afterHouseholdId;
    }

    /**
     * Sets the after household id.
     * 
     * @param afterHouseholdId
     *            the new after household id
     */
    public void setAfterHouseholdId(final String afterHouseholdId) {
        this.afterHouseholdId = afterHouseholdId;
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
     * Checks if is big household.
     * 
     * @return true, if is big household
     */
    public boolean isBigHousehold() {
        return bigHousehold;
    }

    /**
     * Sets the big household.
     * 
     * @param bigHousehold
     *            the new big household
     */
    public void setBigHousehold(final boolean bigHousehold) {
        this.bigHousehold = bigHousehold;
    }

    /**
     * Gets the before concurrent head mark.
     * 
     * @return the before concurrent head mark
     */
    public String getBeforeConcurrentHeadMark() {
        return beforeConcurrentHeadMark;
    }

    /**
     * Sets the before concurrent head mark.
     * 
     * @param beforeConcurrentHeadMark
     *            the new before concurrent head mark
     */
    public void setBeforeConcurrentHeadMark(final String beforeConcurrentHeadMark) {
        this.beforeConcurrentHeadMark = beforeConcurrentHeadMark;
    }

    /**
     * Gets the after concurrent head mark.
     * 
     * @return the after concurrent head mark
     */
    public String getAfterConcurrentHeadMark() {
        return afterConcurrentHeadMark;
    }

    /**
     * Sets the after concurrent head mark.
     * 
     * @param afterConcurrentHeadMark
     *            the new after concurrent head mark
     */
    public void setAfterConcurrentHeadMark(final String afterConcurrentHeadMark) {
        this.afterConcurrentHeadMark = afterConcurrentHeadMark;
    }

    /**
     * Gets the household head site id.
     * 
     * @return the household head site id
     */
    public String getHouseholdHeadSiteId() {
        return householdHeadSiteId;
    }

    /**
     * Sets the household head site id.
     * 
     * @param householdHeadSiteId
     *            the new household head site id
     */
    public void setHouseholdHeadSiteId(final String householdHeadSiteId) {
        this.householdHeadSiteId = householdHeadSiteId;
    }

    /**
     * Gets the new household head id.
     * 
     * @return the new household head id
     */
    public String getNewHouseholdHeadId() {
        return newHouseholdHeadId;
    }

    /**
     * Sets the new household head id.
     * 
     * @param newHouseholdHeadId
     *            the new new household head id
     */
    public void setNewHouseholdHeadId(final String newHouseholdHeadId) {
        this.newHouseholdHeadId = newHouseholdHeadId;
    }

    /**
     * Gets the change type.
     * 
     * @return the change type
     */
    public Rl0172aService.ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the change type.
     * 
     * @param changeType
     *            the new change type
     */
    public void setChangeType(final Rl0172aService.ChangeType changeType) {
        this.changeType = changeType;
    }

    /**
     * Gets the after head before relationship.
     * 
     * @return the after head before relationship
     */
    public String getAfterHeadBeforeRelationship() {
        return afterHeadBeforeRelationship;
    }

    /**
     * Sets the after head before relationship.
     * 
     * @param afterHeadBeforeRelationship
     *            the new after head before relationship
     */
    public void setAfterHeadBeforeRelationship(final String afterHeadBeforeRelationship) {
        this.afterHeadBeforeRelationship = afterHeadBeforeRelationship;
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
        result = prime * result + ((afterHeadName == null) ? 0 : afterHeadName.hashCode());
        result = prime * result + ((afterHouseholdHeadId == null) ? 0 : afterHouseholdHeadId.hashCode());
        result = prime * result + ((afterHouseholdId == null) ? 0 : afterHouseholdId.hashCode());
        result = prime * result + ((changeType == null) ? 0 : changeType.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
        result = prime * result + ((afterHeadBeforeRelationship == null) ? 0 : afterHeadBeforeRelationship.hashCode());
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
        Rl0172aAppDataDTO other = (Rl0172aAppDataDTO) obj;
        if (afterHeadName == null) {
            if (other.afterHeadName != null)
                return false;
        } else if (!afterHeadName.equals(other.afterHeadName))
            return false;
        if (afterHouseholdHeadId == null) {
            if (other.afterHouseholdHeadId != null)
                return false;
        } else if (!afterHouseholdHeadId.equals(other.afterHouseholdHeadId))
            return false;
        if (afterHouseholdId == null) {
            if (other.afterHouseholdId != null)
                return false;
        } else if (!afterHouseholdId.equals(other.afterHouseholdId))
            return false;
        if (changeType != other.changeType)
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
        if (afterHeadBeforeRelationship == null) {
            if (other.afterHeadBeforeRelationship != null)
                return false;
        } else if (!afterHeadBeforeRelationship.equals(other.afterHeadBeforeRelationship))
            return false;
        return true;
    }
}

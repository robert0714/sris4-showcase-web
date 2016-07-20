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
 * 出生別變更登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172cAppDataDTO", propOrder = { "beforeBirthOrderSex", "beforeRelationship", "afterBirthOrderSex",
        "afterRelationship", "relatedDate", "relatedPerson", "relatedPersonLastName", "relatedPersonFirstName",
        "changeSexDate", "broOrSisPersonId", "broOrSisSiteId", "broOrSisPersonName", "broOrSisLastName",
        "broOrSisFirstName", "updateYyymmdd", "updateReasonCode", "otherUpdateReason", "otherCertificate",
        "certificateList" })
@XmlRootElement(name = "Rl0172cAppDataDTO")
public class Rl0172cAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1997621216665273577L;

    /** 原出生別代碼. */
    @XmlElement(name = "BeforeBirthOrderSex")
    @FieldName("原出生別代碼")
    private String beforeBirthOrderSex;

    /** 原稱謂. */
    @XmlElement(name = "BeforeRelationship")
    @FieldName("原稱謂")
    private String beforeRelationship;

    /** 新出生別代碼. */
    @XmlElement(name = "AfterBirthOrderSex")
    @FieldName("新出生別代碼")
    private String afterBirthOrderSex;

    /** 新稱謂. */
    @XmlElement(name = "AfterRelationship")
    @FieldName("新稱謂")
    private String afterRelationship;

    /** 被領養日期. */
    @XmlElement(name = "RelatedDate")
    @FieldName("被領養日期")
    private String relatedDate;

    /** 領養人. */
    @XmlElement(name = "RelatedPerson")
    @FieldName("領養人")
    private String relatedPerson;

    /** 領養人姓. */
    @XmlElement(name = "RelatedPersonLastName")
    @FieldName("領養人姓")
    private String relatedPersonLastName;

    /** 領養人名. */
    @XmlElement(name = "RelatedPersonFirstName")
    @FieldName("領養人名")
    private String relatedPersonFirstName;

    /** 變更性別日. */
    @XmlElement(name = "ChangeSexDate")
    @FieldName("變更性別日")
    private String changeSexDate;

    /** 兄或姊統一編號. */
    @XmlElement(name = "BroOrSisPersonId")
    @FieldName("兄或姊統一編號")
    private String broOrSisPersonId;

    /** 兄或姊作業點代碼. */
    @XmlElement(name = "BroOrSisSiteId")
    @FieldName("兄或姊作業點代碼")
    private String broOrSisSiteId;

    /** 兄或姊姓名. */
    @XmlElement(name = "BroOrSisPersonName")
    @FieldName("兄或姊姓名")
    private String broOrSisPersonName;

    /** 兄或姊姓. */
    @XmlElement(name = "BroOrSisLastName")
    @FieldName("兄或姊姓")
    private String broOrSisLastName;

    /** 兄或姊名. */
    @XmlElement(name = "BroOrSisFirstName")
    @FieldName("兄或姊名")
    private String broOrSisFirstName;

    /** 變更日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("變更日期")
    private String updateYyymmdd;

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

    /**
     * Gets the before birth order sex.
     * 
     * @return the before birth order sex
     */
    public String getBeforeBirthOrderSex() {
        return beforeBirthOrderSex;
    }

    /**
     * Sets the before birth order sex.
     * 
     * @param beforeBirthOrderSex
     *            the new before birth order sex
     */
    public void setBeforeBirthOrderSex(final String beforeBirthOrderSex) {
        this.beforeBirthOrderSex = beforeBirthOrderSex;
    }

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
     * Gets the after birth order sex.
     * 
     * @return the after birth order sex
     */
    public String getAfterBirthOrderSex() {
        return afterBirthOrderSex;
    }

    /**
     * Sets the after birth order sex.
     * 
     * @param afterBirthOrderSex
     *            the new after birth order sex
     */
    public void setAfterBirthOrderSex(final String afterBirthOrderSex) {
        this.afterBirthOrderSex = afterBirthOrderSex;
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
     * Gets the related date.
     * 
     * @return the related date
     */
    public String getRelatedDate() {
        return relatedDate;
    }

    /**
     * Sets the related date.
     * 
     * @param relatedDate
     *            the new related date
     */
    public void setRelatedDate(final String relatedDate) {
        this.relatedDate = relatedDate;
    }

    /**
     * Gets the related person.
     * 
     * @return the related person
     */
    public String getRelatedPerson() {
        return relatedPerson;
    }

    /**
     * Sets the related person.
     * 
     * @param relatedPerson
     *            the new related person
     */
    public void setRelatedPerson(final String relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    /**
     * Gets the related person last name.
     * 
     * @return the related person last name
     */
    public String getRelatedPersonLastName() {
        return relatedPersonLastName;
    }

    /**
     * Sets the related person last name.
     * 
     * @param relatedPersonLastName
     *            the new related person last name
     */
    public void setRelatedPersonLastName(final String relatedPersonLastName) {
        this.relatedPersonLastName = relatedPersonLastName;
    }

    /**
     * Gets the related person first name.
     * 
     * @return the related person first name
     */
    public String getRelatedPersonFirstName() {
        return relatedPersonFirstName;
    }

    /**
     * Sets the related person first name.
     * 
     * @param relatedPersonFirstName
     *            the new related person first name
     */
    public void setRelatedPersonFirstName(final String relatedPersonFirstName) {
        this.relatedPersonFirstName = relatedPersonFirstName;
    }

    /**
     * Gets the change sex date.
     * 
     * @return the change sex date
     */
    public String getChangeSexDate() {
        return changeSexDate;
    }

    /**
     * Sets the change sex date.
     * 
     * @param changeSexDate
     *            the new change sex date
     */
    public void setChangeSexDate(final String changeSexDate) {
        this.changeSexDate = changeSexDate;
    }

    /**
     * Gets the bro or sis person id.
     * 
     * @return the bro or sis person id
     */
    public String getBroOrSisPersonId() {
        return broOrSisPersonId;
    }

    /**
     * Sets the bro or sis person id.
     * 
     * @param broOrSisPersonId
     *            the new bro or sis person id
     */
    public void setBroOrSisPersonId(final String broOrSisPersonId) {
        this.broOrSisPersonId = broOrSisPersonId;
    }

    /**
     * Gets the bro or sis site id.
     * 
     * @return the bro or sis site id
     */
    public String getBroOrSisSiteId() {
        return broOrSisSiteId;
    }

    /**
     * Sets the bro or sis site id.
     * 
     * @param broOrSisSiteId
     *            the new bro or sis site id
     */
    public void setBroOrSisSiteId(final String broOrSisSiteId) {
        this.broOrSisSiteId = broOrSisSiteId;
    }

    /**
     * Gets the bro or sis person name.
     * 
     * @return the bro or sis person name
     */
    public String getBroOrSisPersonName() {
        return broOrSisPersonName;
    }

    /**
     * Sets the bro or sis person name.
     * 
     * @param broOrSisPersonName
     *            the new bro or sis person name
     */
    public void setBroOrSisPersonName(final String broOrSisPersonName) {
        this.broOrSisPersonName = broOrSisPersonName;
    }

    /**
     * Gets the bro or sis last name.
     * 
     * @return the bro or sis last name
     */
    public String getBroOrSisLastName() {
        return broOrSisLastName;
    }

    /**
     * Sets the bro or sis last name.
     * 
     * @param broOrSisLastName
     *            the new bro or sis last name
     */
    public void setBroOrSisLastName(final String broOrSisLastName) {
        this.broOrSisLastName = broOrSisLastName;
    }

    /**
     * Gets the bro or sis first name.
     * 
     * @return the bro or sis first name
     */
    public String getBroOrSisFirstName() {
        return broOrSisFirstName;
    }

    /**
     * Sets the bro or sis first name.
     * 
     * @param broOrSisFirstName
     *            the new bro or sis first name
     */
    public void setBroOrSisFirstName(final String broOrSisFirstName) {
        this.broOrSisFirstName = broOrSisFirstName;
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
        result = prime * result + ((afterBirthOrderSex == null) ? 0 : afterBirthOrderSex.hashCode());
        result = prime * result + ((afterRelationship == null) ? 0 : afterRelationship.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((changeSexDate == null) ? 0 : changeSexDate.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((relatedDate == null) ? 0 : relatedDate.hashCode());
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
        Rl0172cAppDataDTO other = (Rl0172cAppDataDTO) obj;
        if (afterBirthOrderSex == null) {
            if (other.afterBirthOrderSex != null)
                return false;
        } else if (!afterBirthOrderSex.equals(other.afterBirthOrderSex))
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
        if (changeSexDate == null) {
            if (other.changeSexDate != null)
                return false;
        } else if (!changeSexDate.equals(other.changeSexDate))
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
        if (relatedDate == null) {
            if (other.relatedDate != null)
                return false;
        } else if (!relatedDate.equals(other.relatedDate))
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

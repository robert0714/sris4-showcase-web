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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008sType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.domain.Rldfs0z2Type;
import tw.gov.moi.domain.Rldfw0z2Type;
import tw.gov.moi.domain.Tldfs0z2Type;

/**
 * The Class Rl01b10DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01b10DTO", propOrder = { "victimId", "victimRldf004mType", "victimRldf001mType",
        "victimSettleSiteId", "beginYyymmdd", "endYyymmdd", "certificate_1", "certificate_2", "certificate_3",
        "certificate_4", "otherCertificate", "writPetitionCaseNo", "registerYyymmdd", "violatorId",
        "violatorRldf004mType", "violatorRldf001mType", "violatorSettleSiteId", "applyId", "applySettleSiteId",
        "applyRldf004mType", "applyRldf001mType", "commId", "commSettleSiteId", "commRldf004mType", "commRldf001mType",
        "applyRelationShip", "verification", "print", "registerOffice", "tldfs0z2Type", "reportURL", "noEndYyymmdd" })
@XmlRootElement(name = "Rl01b10DTO")
public class Rl01b10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4633804927218059034L;

    /** 被保護人統號. */
    @XmlElement(name = "VictimId")
    @FieldName("被保護人統號")
    private String victimId;

    /** 被保護人個人基本資料. */
    @XmlElement(name = "VictimRldf004mType")
    @FieldName("被保護人個人基本資料")
    private Rldf004mType victimRldf004mType;

    /** 被保護人全戶基本資料. */
    @XmlElement(name = "VictimRldf001mType")
    @FieldName("被保護人全戶基本資料")
    private Rldf001mType victimRldf001mType;

    /** 被保護人作業點代碼. */
    @XmlElement(name = "VictimSettleSiteId")
    @FieldName("被保護人作業點代碼")
    private String victimSettleSiteId;

    /** 保護令起始日期. */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("保護令起始日期")
    private String beginYyymmdd;

    /** 保護令終止日期. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("保護令終止日期")
    private String endYyymmdd;

    /** 附繳證件1. */
    @XmlElement(name = "Certificate_1")
    @FieldName("附繳證件1")
    private String certificate_1;

    /** 附繳證件2. */
    @XmlElement(name = "Certificate_2")
    @FieldName("附繳證件2")
    private String certificate_2;

    /** 附繳證件3. */
    @XmlElement(name = "Certificate_3")
    @FieldName("附繳證件3")
    private String certificate_3;

    /** 附繳證件4. */
    @XmlElement(name = "Certificate_4")
    @FieldName("附繳證件4")
    private String certificate_4;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 保護令機關日期文號. */
    @XmlElement(name = "WritPetitionCaseNo")
    @FieldName("保護令機關日期文號")
    private String writPetitionCaseNo;

    /** 申請日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("申請日期")
    private String registerYyymmdd;

    /** 相對人統號. */
    @XmlElement(name = "ViolatorId")
    @FieldName("相對人統號")
    private String violatorId;

    /** 相對人個人基本資料. */
    @XmlElement(name = "ViolatorRldf004mType")
    @FieldName("相對人個人基本資料")
    private Rldf004mType violatorRldf004mType;

    /** 相對人全戶基本資料. */
    @XmlElement(name = "ViolatorRldf001mType")
    @FieldName("相對人全戶基本資料")
    private Rldf001mType violatorRldf001mType;

    /** 相對人作業點代碼. */
    @XmlElement(name = "ViolatorSettleSiteId")
    @FieldName("相對人作業點代碼")
    private String violatorSettleSiteId;

    /** 申請人統號. */
    @XmlElement(name = "ApplyId")
    @FieldName("申請人統號")
    private String applyId;

    /** 申請人作業點代碼. */
    @XmlElement(name = "ApplySettleSiteId")
    @FieldName("申請人作業點代碼")
    private String applySettleSiteId;

    /** 申請人個人基本資料. */
    @XmlElement(name = "ApplyRldf004mType")
    @FieldName("申請人個人基本資料")
    private Rldf004mType applyRldf004mType;

    /** 申請人全戶基本資料. */
    @XmlElement(name = "ApplyRldf001mType")
    @FieldName("申請人全戶基本資料")
    private Rldf001mType applyRldf001mType;

    /** 受委託人統號. */
    @XmlElement(name = "CommId")
    @FieldName("受委託人統號")
    private String commId;

    /** 受委託人作業點代碼. */
    @XmlElement(name = "CommSettleSiteId")
    @FieldName("受委託人作業點代碼")
    private String commSettleSiteId;

    /** 受委託人個人基本資料. */
    @XmlElement(name = "CommRldf004mType")
    @FieldName("受委託人個人基本資料")
    private Rldf004mType commRldf004mType;

    /** 受委託人全戶基本資料. */
    @XmlElement(name = "CommRldf001mType")
    @FieldName("受委託人全戶基本資料")
    private Rldf001mType commRldf001mType;

    /** 與當事人關係. */
    @XmlElement(name = "ApplyRelationShip")
    @FieldName("與當事人關係")
    private String applyRelationShip;

    /** 確認旗標. */
    @XmlElement(name = "Verification")
    @FieldName("確認旗標")
    private boolean verification = false;

    /** 列印旗標. */
    @XmlElement(name = "Print")
    @FieldName("列印旗標")
    private boolean print = false;

    /** 登記戶所. */
    @XmlElement(name = "RegisterOffice")
    @FieldName("登記戶所")
    private String registerOffice;

    /** 保護家庭暴力資料註記申請書資料暫存檔. */
    @XmlElement(name = "RegisterOffice")
    @FieldName("保護家庭暴力資料註記申請書資料暫存檔")
    private Tldfs0z2Type tldfs0z2Type;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /** 無保護令到期日. */
    @XmlElement(name = "noEndYyymmdd")
    @FieldName("無保護令到期日")
    private boolean noEndYyymmdd = false;

    /** 保護家庭暴力資料. */
    @XmlElement(name = "Rldf049m")
    @FieldName("保護家庭暴力資料")
    private Rldf049mType rldf049m = new Rldf049mType();

    /** 本地申請書資料. */
    @XmlElement(name = "Rldfs0z2")
    @FieldName("本地申請書資料")
    private Rldfs0z2Type rldfs0z2 = new Rldfs0z2Type();

    /** 異地申請書資料. */
    @XmlElement(name = "Rldfw0z2")
    @FieldName("異地申請書資料")
    private Rldfw0z2Type rldfw0z2 = new Rldfw0z2Type();

    /** 本地申請書索引資料. */
    @XmlElement(name = "Rldf008s")
    @FieldName("本地申請書索引資料")
    private Rldf008sType rldf008s = new Rldf008sType();

    /**
     * Gets the victim id.
     * 
     * @return the victim id
     */
    public String getVictimId() {
        return victimId;
    }

    /**
     * Sets the victim id.
     * 
     * @param victimId
     *            the new victim id
     */
    public void setVictimId(final String victimId) {
        this.victimId = victimId;
    }

    /**
     * Gets the victim rldf004m type.
     * 
     * @return the victim rldf004m type
     */
    public Rldf004mType getVictimRldf004mType() {
        return victimRldf004mType;
    }

    /**
     * Sets the victim rldf004m type.
     * 
     * @param victimRldf004mType
     *            the new victim rldf004m type
     */
    public void setVictimRldf004mType(final Rldf004mType victimRldf004mType) {
        this.victimRldf004mType = victimRldf004mType;
    }

    /**
     * Gets the victim settle site id.
     * 
     * @return the victim settle site id
     */
    public String getVictimSettleSiteId() {
        return victimSettleSiteId;
    }

    /**
     * Sets the victim settle site id.
     * 
     * @param victimSettleSiteId
     *            the new victim settle site id
     */
    public void setVictimSettleSiteId(final String victimSettleSiteId) {
        this.victimSettleSiteId = victimSettleSiteId;
    }

    /**
     * Gets the begin yyymmdd.
     * 
     * @return the begin yyymmdd
     */
    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    /**
     * Sets the begin yyymmdd.
     * 
     * @param beginYyymmdd
     *            the new begin yyymmdd
     */
    public void setBeginYyymmdd(final String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    /**
     * Gets the end yyymmdd.
     * 
     * @return the end yyymmdd
     */
    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    /**
     * Sets the end yyymmdd.
     * 
     * @param endYyymmdd
     *            the new end yyymmdd
     */
    public void setEndYyymmdd(final String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    /**
     * Gets the certificate_1.
     * 
     * @return the certificate_1
     */
    public String getCertificate_1() {
        return certificate_1;
    }

    /**
     * Sets the certificate_1.
     * 
     * @param certificate_1
     *            the new certificate_1
     */
    public void setCertificate_1(final String certificate_1) {
        this.certificate_1 = certificate_1;
    }

    /**
     * Gets the certificate_2.
     * 
     * @return the certificate_2
     */
    public String getCertificate_2() {
        return certificate_2;
    }

    /**
     * Sets the certificate_2.
     * 
     * @param certificate_2
     *            the new certificate_2
     */
    public void setCertificate_2(final String certificate_2) {
        this.certificate_2 = certificate_2;
    }

    /**
     * Gets the certificate_3.
     * 
     * @return the certificate_3
     */
    public String getCertificate_3() {
        return certificate_3;
    }

    /**
     * Sets the certificate_3.
     * 
     * @param certificate_3
     *            the new certificate_3
     */
    public void setCertificate_3(final String certificate_3) {
        this.certificate_3 = certificate_3;
    }

    /**
     * Gets the certificate_4.
     * 
     * @return the certificate_4
     */
    public String getCertificate_4() {
        return certificate_4;
    }

    /**
     * Sets the certificate_4.
     * 
     * @param certificate_4
     *            the new certificate_4
     */
    public void setCertificate_4(final String certificate_4) {
        this.certificate_4 = certificate_4;
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
     * Gets the writ petition case no.
     * 
     * @return the writ petition case no
     */
    public String getWritPetitionCaseNo() {
        return writPetitionCaseNo;
    }

    /**
     * Sets the writ petition case no.
     * 
     * @param writPetitionCaseNo
     *            the new writ petition case no
     */
    public void setWritPetitionCaseNo(final String writPetitionCaseNo) {
        this.writPetitionCaseNo = writPetitionCaseNo;
    }

    /**
     * Gets the register yyymmdd.
     * 
     * @return the register yyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * Sets the register yyymmdd.
     * 
     * @param registerYyymmdd
     *            the new register yyymmdd
     */
    public void setRegisterYyymmdd(final String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * Gets the violator id.
     * 
     * @return the violator id
     */
    public String getViolatorId() {
        return violatorId;
    }

    /**
     * Sets the violator id.
     * 
     * @param violatorId
     *            the new violator id
     */
    public void setViolatorId(final String violatorId) {
        this.violatorId = violatorId;
    }

    /**
     * Gets the violator rldf004m type.
     * 
     * @return the violator rldf004m type
     */
    public Rldf004mType getViolatorRldf004mType() {
        return violatorRldf004mType;
    }

    /**
     * Sets the violator rldf004m type.
     * 
     * @param violatorRldf004mType
     *            the new violator rldf004m type
     */
    public void setViolatorRldf004mType(final Rldf004mType violatorRldf004mType) {
        this.violatorRldf004mType = violatorRldf004mType;
    }

    /**
     * Gets the violator settle site id.
     * 
     * @return the violator settle site id
     */
    public String getViolatorSettleSiteId() {
        return violatorSettleSiteId;
    }

    /**
     * Sets the violator settle site id.
     * 
     * @param violatorSettleSiteId
     *            the new violator settle site id
     */
    public void setViolatorSettleSiteId(final String violatorSettleSiteId) {
        this.violatorSettleSiteId = violatorSettleSiteId;
    }

    /**
     * Gets the apply id.
     * 
     * @return the apply id
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * Sets the apply id.
     * 
     * @param applyId
     *            the new apply id
     */
    public void setApplyId(final String applyId) {
        this.applyId = applyId;
    }

    /**
     * Gets the apply settle site id.
     * 
     * @return the apply settle site id
     */
    public String getApplySettleSiteId() {
        return applySettleSiteId;
    }

    /**
     * Sets the apply settle site id.
     * 
     * @param applySettleSiteId
     *            the new apply settle site id
     */
    public void setApplySettleSiteId(final String applySettleSiteId) {
        this.applySettleSiteId = applySettleSiteId;
    }

    /**
     * Gets the apply rldf004m type.
     * 
     * @return the apply rldf004m type
     */
    public Rldf004mType getApplyRldf004mType() {
        return applyRldf004mType;
    }

    /**
     * Sets the apply rldf004m type.
     * 
     * @param applyRldf004mType
     *            the new apply rldf004m type
     */
    public void setApplyRldf004mType(final Rldf004mType applyRldf004mType) {
        this.applyRldf004mType = applyRldf004mType;
    }

    /**
     * Gets the comm id.
     * 
     * @return the comm id
     */
    public String getCommId() {
        return commId;
    }

    /**
     * Sets the comm id.
     * 
     * @param commId
     *            the new comm id
     */
    public void setCommId(final String commId) {
        this.commId = commId;
    }

    /**
     * Gets the comm settle site id.
     * 
     * @return the comm settle site id
     */
    public String getCommSettleSiteId() {
        return commSettleSiteId;
    }

    /**
     * Sets the comm settle site id.
     * 
     * @param commSettleSiteId
     *            the new comm settle site id
     */
    public void setCommSettleSiteId(final String commSettleSiteId) {
        this.commSettleSiteId = commSettleSiteId;
    }

    /**
     * Gets the comm rldf004m type.
     * 
     * @return the comm rldf004m type
     */
    public Rldf004mType getCommRldf004mType() {
        return commRldf004mType;
    }

    /**
     * Sets the comm rldf004m type.
     * 
     * @param commRldf004mType
     *            the new comm rldf004m type
     */
    public void setCommRldf004mType(final Rldf004mType commRldf004mType) {
        this.commRldf004mType = commRldf004mType;
    }

    /**
     * Gets the victim rldf001m type.
     * 
     * @return the victim rldf001m type
     */
    public Rldf001mType getVictimRldf001mType() {
        return victimRldf001mType;
    }

    /**
     * Sets the victim rldf001m type.
     * 
     * @param victimRldf001mType
     *            the new victim rldf001m type
     */
    public void setVictimRldf001mType(final Rldf001mType victimRldf001mType) {
        this.victimRldf001mType = victimRldf001mType;
    }

    /**
     * Gets the violator rldf001m type.
     * 
     * @return the violator rldf001m type
     */
    public Rldf001mType getViolatorRldf001mType() {
        return violatorRldf001mType;
    }

    /**
     * Sets the violator rldf001m type.
     * 
     * @param violatorRldf001mType
     *            the new violator rldf001m type
     */
    public void setViolatorRldf001mType(final Rldf001mType violatorRldf001mType) {
        this.violatorRldf001mType = violatorRldf001mType;
    }

    /**
     * Gets the apply rldf001m type.
     * 
     * @return the apply rldf001m type
     */
    public Rldf001mType getApplyRldf001mType() {
        return applyRldf001mType;
    }

    /**
     * Sets the apply rldf001m type.
     * 
     * @param applyRldf001mType
     *            the new apply rldf001m type
     */
    public void setApplyRldf001mType(final Rldf001mType applyRldf001mType) {
        this.applyRldf001mType = applyRldf001mType;
    }

    /**
     * Gets the comm rldf001m type.
     * 
     * @return the comm rldf001m type
     */
    public Rldf001mType getCommRldf001mType() {
        return commRldf001mType;
    }

    /**
     * Sets the comm rldf001m type.
     * 
     * @param commRldf001mType
     *            the new comm rldf001m type
     */
    public void setCommRldf001mType(final Rldf001mType commRldf001mType) {
        this.commRldf001mType = commRldf001mType;
    }

    /**
     * Gets the apply relation ship.
     * 
     * @return the apply relation ship
     */
    public String getApplyRelationShip() {
        return applyRelationShip;
    }

    /**
     * Sets the apply relation ship.
     * 
     * @param applyRelationShip
     *            the new apply relation ship
     */
    public void setApplyRelationShip(final String applyRelationShip) {
        this.applyRelationShip = applyRelationShip;
    }

    /**
     * Checks if is verification.
     * 
     * @return true, if is verification
     */
    public boolean isVerification() {
        return verification;
    }

    /**
     * Sets the verification.
     * 
     * @param verification
     *            the new verification
     */
    public void setVerification(final boolean verification) {
        this.verification = verification;
    }

    /**
     * Checks if is prints the.
     * 
     * @return true, if is prints the
     */
    public boolean isPrint() {
        return print;
    }

    /**
     * Sets the prints the.
     * 
     * @param print
     *            the new prints the
     */
    public void setPrint(final boolean print) {
        this.print = print;
    }

    /**
     * Gets the register office.
     * 
     * @return the register office
     */
    public String getRegisterOffice() {
        return registerOffice;
    }

    /**
     * Sets the register office.
     * 
     * @param registerOffice
     *            the new register office
     */
    public void setRegisterOffice(final String registerOffice) {
        this.registerOffice = registerOffice;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl01b10DTO [victimId=" + victimId + ", victimRldf004mType=" + victimRldf004mType
                + ", victimRldf001mType=" + victimRldf001mType + ", victimSettleSiteId=" + victimSettleSiteId
                + ", beginYyymmdd=" + beginYyymmdd + ", endYyymmdd=" + endYyymmdd + ", certificate_1=" + certificate_1
                + ", certificate_2=" + certificate_2 + ", certificate_3=" + certificate_3 + ", certificate_4="
                + certificate_4 + ", otherCertificate=" + otherCertificate + ", writPetitionCaseNo="
                + writPetitionCaseNo + ", registerYyymmdd=" + registerYyymmdd + ", violatorId=" + violatorId
                + ", violatorRldf004mType=" + violatorRldf004mType + ", violatorRldf001mType=" + violatorRldf001mType
                + ", violatorSettleSiteId=" + violatorSettleSiteId + ", applyId=" + applyId + ", applySettleSiteId="
                + applySettleSiteId + ", applyRldf004mType=" + applyRldf004mType + ", applyRldf001mType="
                + applyRldf001mType + ", commId=" + commId + ", commSettleSiteId=" + commSettleSiteId
                + ", commRldf004mType=" + commRldf004mType + ", commRldf001mType=" + commRldf001mType
                + ", applyRelationShip=" + applyRelationShip + ", verification=" + verification + ", print=" + print
                + ", registerOffice=" + registerOffice + "]";
    }

    /**
     * Gets the tldfs0z2 type.
     * 
     * @return the tldfs0z2 type
     */
    public Tldfs0z2Type getTldfs0z2Type() {
        return tldfs0z2Type;
    }

    /**
     * Sets the tldfs0z2 type.
     * 
     * @param tldfs0z2Type
     *            the new tldfs0z2 type
     */
    public void setTldfs0z2Type(Tldfs0z2Type tldfs0z2Type) {
        this.tldfs0z2Type = tldfs0z2Type;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the report url.
     * 
     * @param reportURL
     *            the new report url
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    /**
     * Checks NoEndYyymmdd.
     * 
     * @return false, noEndYyymmdd
     */
    public boolean isNoEndYyymmdd() {
        return noEndYyymmdd;
    }

    /**
     * Sets the noEndYyymmdd.
     * 
     * @param noEndYyymmdd
     *            the new noEndYyymmdd
     */
    public void setNoEndYyymmdd(final boolean noEndYyymmdd) {
        this.noEndYyymmdd = noEndYyymmdd;
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
        result = prime * result + ((applyRelationShip == null) ? 0 : applyRelationShip.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((writPetitionCaseNo == null) ? 0 : writPetitionCaseNo.hashCode());
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
        Rl01b10DTO other = (Rl01b10DTO) obj;
        if (applyRelationShip == null) {
            if (other.applyRelationShip != null)
                return false;
        } else if (!applyRelationShip.equals(other.applyRelationShip))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (writPetitionCaseNo == null) {
            if (other.writPetitionCaseNo != null)
                return false;
        } else if (!writPetitionCaseNo.equals(other.writPetitionCaseNo))
            return false;
        return true;
    }

    public Rldfs0z2Type getRldfs0z2() {
        return rldfs0z2;
    }

    public void setRldfs0z2(Rldfs0z2Type rldfs0z2) {
        this.rldfs0z2 = rldfs0z2;
    }

    public Rldfw0z2Type getRldfw0z2() {
        return rldfw0z2;
    }

    public void setRldfw0z2(Rldfw0z2Type rldfw0z2) {
        this.rldfw0z2 = rldfw0z2;
    }

    public Rldf008sType getRldf008s() {
        return rldf008s;
    }

    public void setRldf008s(Rldf008sType rldf008s) {
        this.rldf008s = rldf008s;
    }

    public Rldf049mType getRldf049m() {
        return rldf049m;
    }

    public void setRldf049m(Rldf049mType rldf049m) {
        this.rldf049m = rldf049m;
    }

}

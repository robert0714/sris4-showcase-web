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
 * 姓名更改紀錄證明 DTO.
 * 
 * @author Dan Tsai
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02e00AppDataDTO", propOrder = { "isHouseholdHead", "certificateNo", "certificateNumber",
        "beginYyymmdd", "endYyymmdd", "acceptAdminOfficeCode", "remark", "certificateList", "otherCertificate",
        "backupBeginYyymmdd", "backupEndYyymmdd" })
@XmlRootElement(name = "Rl02e00AppDataDTO")
public class Rl02e00AppDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 發證編號. */
    @XmlElement(name = "CertificateNo")
    @FieldName("發證編號")
    private String certificateNo = "";

    /** 發證字號. */
    @XmlElement(name = "CertificateNumber")
    @FieldName("發證字號")
    private String certificateNumber = "";

    /** 資料期間. */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("資料期間起")
    private String beginYyymmdd = "";

    /** 資料期間. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("資料期間始")
    private String endYyymmdd = "";

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode = "";

    /** 申請書備註. */
    @XmlElement(name = "Remark")
    @FieldName("申請書備註")
    private String remark = "";

    /** 附送證件. */
    @XmlElement(name = "CertificateList")
    @FieldName("附送證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附送證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附送證件")
    private String otherCertificate = "";

    /** 更正日期備份. */
    @XmlElement(name = "BackupBeginYyymmdd")
    @FieldName("更正日期備份")
    private String backupBeginYyymmdd = "";

    /** 更正日期備份. */
    @XmlElement(name = "BackupEndYyymmdd")
    @FieldName("更正日期備份")
    private String backupEndYyymmdd = "";

    /** 戶籍地址. */
    @XmlElement(name = "SettleAddress")
    @FieldName("戶籍地址")
    private String settleAddress = "";

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    public void setBeginYyymmdd(String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public String getBackupBeginYyymmdd() {
        return backupBeginYyymmdd;
    }

    public void setBackupBeginYyymmdd(String backupBeginYyymmdd) {
        this.backupBeginYyymmdd = backupBeginYyymmdd;
    }

    public String getBackupEndYyymmdd() {
        return backupEndYyymmdd;
    }

    public void setBackupEndYyymmdd(String backupEndYyymmdd) {
        this.backupEndYyymmdd = backupEndYyymmdd;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getSettleAddress() {
        return settleAddress;
    }

    public void setSettleAddress(String settleAddress) {
        this.settleAddress = settleAddress;
    }

    public static class Rl02e00ResultDTO {

        /** 序號. */
        @XmlElement(name = "SeqNo")
        @FieldName("序號")
        private String seqNo = "";

        /** 統號. */
        @XmlElement(name = "PersonId")
        @FieldName("統號")
        private String personId = "";

        /** 登記日期. */
        @XmlElement(name = "ModifyYyymmdd")
        @FieldName("登記日期")
        private String modifyYyymmdd = "";

        /** 更改時間. */
        @XmlElement(name = "ModifyTime")
        @FieldName("更改時間")
        private String modifyTime = "";

        /** 作業點代碼. */
        @XmlElement(name = "SiteId")
        @FieldName("作業點代碼")
        private String siteId = "";

        /** 原姓名. */
        @XmlElement(name = "OriginalName")
        @FieldName("原姓名")
        private String originalName = "";

        /** 新姓名. */
        @XmlElement(name = "NewName")
        @FieldName("新姓名")
        private String newName = "";

        /** 更改原因. */
        @XmlElement(name = "ModifyReason")
        @FieldName("更改原因")
        private String modifyReason = "";

        public String getSeqNo() {
            return seqNo;
        }

        public void setSeqNo(String seqNo) {
            this.seqNo = seqNo;
        }

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getModifyYyymmdd() {
            return modifyYyymmdd;
        }

        public void setModifyYyymmdd(String modifyYyymmdd) {
            this.modifyYyymmdd = modifyYyymmdd;
        }

        public String getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getSiteId() {
            return siteId;
        }

        public void setSiteId(String siteId) {
            this.siteId = siteId;
        }

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public String getNewName() {
            return newName;
        }

        public void setNewName(String newName) {
            this.newName = newName;
        }

        public String getModifyReason() {
            return modifyReason;
        }

        public void setModifyReason(String modifyReason) {
            this.modifyReason = modifyReason;
        }
    }
}

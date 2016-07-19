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
 * 婚姻更改紀錄證明 Rl02g00AppDataDTO.
 * 
 * @author Dan Tsai
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02g00AppDataDTO", propOrder = { "certificateNo", "certificateNumber", "beginYyymmdd", "endYyymmdd",
        "acceptAdminOfficeCode", "remark", "certificateList", "otherCertificate", "backupBeginYyymmdd",
        "backupEndYyymmdd" })
@XmlRootElement(name = "Rl02g00AppDataDTO")
public class Rl02g00AppDataDTO implements Serializable {

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

    public static class Rl02g00ResultDTO {

        /** 序號. */
        @XmlElement(name = "SeqNo")
        @FieldName("序號")
        private String seqNo = "";

        /** 登記日期. */
        @XmlElement(name = "RegisterDate")
        @FieldName("登記日期")
        private String registerDate = "";

        /** 配偶國民身分證統一編號. */
        @XmlElement(name = "SpouseId")
        @FieldName("配偶國民身分證統一編號")
        private String spouseId = "";

        /** 生效日期. */
        @XmlElement(name = "ChangeDate")
        @FieldName("生效日期")
        private String changeDate = "";

        /** 配偶姓名. */
        @XmlElement(name = "SpouseName")
        @FieldName("配偶姓名")
        private String spouseName = "";

        /** 關係異動. */
        @XmlElement(name = "SpouseCode")
        @FieldName("關係異動")
        private String spouseCode = "";

        /** 登記地點. */
        @XmlElement(name = "AdminOfficeCode")
        @FieldName("登記地點")
        private String adminOfficeCode = "";

        public String getSeqNo() {
            return seqNo;
        }

        public void setSeqNo(String seqNo) {
            this.seqNo = seqNo;
        }

        public String getRegisterDate() {
            return registerDate;
        }

        public void setRegisterDate(String registerDate) {
            this.registerDate = registerDate;
        }

        public String getSpouseId() {
            return spouseId;
        }

        public void setSpouseId(String spouseId) {
            this.spouseId = spouseId;
        }

        public String getSpouseName() {
            return spouseName;
        }

        public void setSpouseName(String spouseName) {
            this.spouseName = spouseName;
        }

        public String getAdminOfficeCode() {
            return adminOfficeCode;
        }

        public void setAdminOfficeCode(String adminOfficeCode) {
            this.adminOfficeCode = adminOfficeCode;
        }

        public String getSpouseCode() {
            return spouseCode;
        }

        public void setSpouseCode(String spouseCode) {
            this.spouseCode = spouseCode;
        }

        public String getChangeDate() {
            return changeDate;
        }

        public void setChangeDate(String changeDate) {
            this.changeDate = changeDate;
        }
    }
}

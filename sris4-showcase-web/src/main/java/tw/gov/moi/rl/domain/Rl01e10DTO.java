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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;

/**
 * The Class Rl01e00DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01e00DTO", propOrder = { "householdHeadId", "siteId", "editList", "afterSave" })
@XmlRootElement(name = "Rl01e10DTO")
public class Rl01e10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** OpeningOperationDTO 4/18 */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** The after save. */
    @XmlElement(name = "AfterSave")
    @FieldName("是否存檔完成")
    private boolean afterSave;

    /** The after save. */
    @XmlElement(name = "SaveEnabled")
    @FieldName("是否可暫存")
    private boolean saveEnabled;

    /** 作業順序編號. */
    @XmlElement(name = "seqId")
    @FieldName("作業順序編號")
    private Integer seqId;

    /** 交易序號. */
    @XmlElement(name = "TxnId")
    @FieldName("交易序號")
    private String txnId;

    /** 交易序號. */
    @XmlElement(name = "TxnId")
    @FieldName("交易序號")
    private String userId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId")
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 當事人修改DTO. */
    @XmlElement(name = "PersonDataList")
    @FieldName("當事人修改DTO清單")
    private List<Rl01e10PersonDTO> personDataList = new ArrayList<Rl01e10PersonDTO>(20);

    /** 系統日期. */
    @XmlElement(name = "SystemDate")
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間. */
    @XmlElement(name = "SystemTime")
    @FieldName("系統時間")
    private String systemTime;

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    /**
     * Checks if is after save.
     * 
     * @return true, if is after save
     */
    public boolean isAfterSave() {
        return afterSave;
    }

    /**
     * Sets the after save.
     * 
     * @param afterSave
     *            the new after save
     */
    public void setAfterSave(final boolean afterSave) {
        this.afterSave = afterSave;
    }

    public static class Rl01e10EditDTO {
        @XmlElement(name = "Rldf004mObj")
        @FieldName("Rldf004m")
        private Rldf004mType rldf004mObj;

        @XmlElement(name = "Relationship")
        @FieldName("與戶長之關係")
        private String relationship;

        public Rl01e10EditDTO(Rldf004mType rldf004mObj) {
            this.rldf004mObj = rldf004mObj;
            this.relationship = rldf004mObj.getRelationship();
        }

        public Rldf004mType getRldf004mObj() {
            return rldf004mObj;
        }

        public void setRldf004mObj(Rldf004mType rldf004mObj) {
            this.rldf004mObj = rldf004mObj;
        }

        public String getRelationship() {
            return relationship;
        }

        public void setRelationship(String relationship) {
            this.relationship = relationship;
        }
    }

    public static class RlModifyRelationshipDTO implements Serializable {

        private static final long serialVersionUID = 1L;

        /** 國民身分證統一編號. */
        @XmlElement(name = "PersonId", required = true)
        @FieldName("國民身分證統一編號")
        private String personId = "";

        /** 交易序號. */
        @XmlElement(name = "ApplyTransactionId", required = true)
        @FieldName("交易序號")
        private String applyTransactionId = "";

        /** 作業順序編號. */
        @XmlElement(name = "ApplySequenceId", required = true)
        @FieldName("作業順序編號")
        private Integer applySequenceId = Integer.valueOf(0);

        /** 資料儲存地作業點代碼. */
        @XmlElement(name = "SiteId", required = true)
        @FieldName("資料儲存地作業點代碼")
        private String siteId = "";

        /** 申請書流水號. */
        @XmlElement(name = "ApplySeq", required = true)
        @FieldName("申請書流水號")
        private Integer applySeq = Integer.valueOf(0);

        /** 登記日期. */
        @XmlElement(name = "RegisterDate", required = true)
        @FieldName("登記日期")
        private String registerDate = "";

        /** 登記時間. */
        @XmlElement(name = "RegisterTime", required = true)
        @FieldName("登記時間")
        private String registerTime = "";

        /** 申請日期. */
        @XmlElement(name = "ApplyDate", required = true)
        @FieldName("申請日期")
        private String applyDate = "";

        /** 姓名. */
        @XmlElement(name = "PersonName", required = true)
        @FieldName("姓名")
        private String personName = "";

        /** 出生日期. */
        @XmlElement(name = "BirthYyymmdd", required = true)
        @FieldName("出生日期")
        private String birthYyymmdd = "";

        @XmlElement(name = "Relationship", required = true)
        @FieldName("稱號")
        private String relationship = "";

        @XmlElement(name = "BeforeRelationship", required = true)
        @FieldName("修改前稱號")
        private String beforeRelationship = "";

        /** 受理地作業點代碼. */
        @XmlElement(name = "AcceptSiteId", required = true)
        @FieldName("受理地作業點代碼")
        private String acceptSiteId = "";

        /** 受理地戶所代碼. */
        @XmlElement(name = "AcceptAdminOfficeCode", required = true)
        @FieldName("受理地戶所代碼")
        private String acceptAdminOfficeCode = "";

        /** 受理地行政區域代碼. */
        @XmlElement(name = "AcceptAreaCode", required = true)
        @FieldName("受理地行政區域代碼")
        private String acceptAreaCode = "";

        /** 戶籍地作業點代碼. */
        @XmlElement(name = "SettleSiteId", required = true)
        @FieldName("戶籍地作業點代碼")
        private String settleSiteId = "";

        /** 戶籍地戶所代碼. */
        @XmlElement(name = "SettleAdminOfficeCode", required = true)
        @FieldName("戶籍地戶所代碼")
        private String settleAdminOfficeCode = "";

        /** 戶籍地行政區域代碼. */
        @XmlElement(name = "SettleAreaCode", required = true)
        @FieldName("戶籍地行政區域代碼")
        private String settleAreaCode = "";

        /** 受理地戶籍員姓名. */
        @XmlElement(name = "AcceptRegistrarName", required = true)
        @FieldName("受理地戶籍員姓名")
        private String acceptRegistrarName = "";

        /** 受理地戶籍員帳號. */
        @XmlElement(name = "AcceptRegistrarId", required = true)
        @FieldName("受理地戶籍員帳號")
        private String acceptRegistrarId = "";

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getApplyTransactionId() {
            return applyTransactionId;
        }

        public void setApplyTransactionId(String applyTransactionId) {
            this.applyTransactionId = applyTransactionId;
        }

        public Integer getApplySequenceId() {
            return applySequenceId;
        }

        public void setApplySequenceId(Integer applySequenceId) {
            this.applySequenceId = applySequenceId;
        }

        public String getSiteId() {
            return siteId;
        }

        public void setSiteId(String siteId) {
            this.siteId = siteId;
        }

        public Integer getApplySeq() {
            return applySeq;
        }

        public void setApplySeq(Integer applySeq) {
            this.applySeq = applySeq;
        }

        public String getRegisterDate() {
            return registerDate;
        }

        public void setRegisterDate(String registerDate) {
            this.registerDate = registerDate;
        }

        public String getRegisterTime() {
            return registerTime;
        }

        public void setRegisterTime(String registerTime) {
            this.registerTime = registerTime;
        }

        public String getApplyDate() {
            return applyDate;
        }

        public void setApplyDate(String applyDate) {
            this.applyDate = applyDate;
        }

        public String getPersonName() {
            return personName;
        }

        public void setPersonName(String personName) {
            this.personName = personName;
        }

        public String getBirthYyymmdd() {
            return birthYyymmdd;
        }

        public void setBirthYyymmdd(String birthYyymmdd) {
            this.birthYyymmdd = birthYyymmdd;
        }

        public String getRelationship() {
            return relationship;
        }

        public void setRelationship(String relationship) {
            this.relationship = relationship;
        }

        public String getBeforeRelationship() {
            return beforeRelationship;
        }

        public void setBeforeRelationship(String beforeRelationship) {
            this.beforeRelationship = beforeRelationship;
        }

        public String getAcceptSiteId() {
            return acceptSiteId;
        }

        public void setAcceptSiteId(String acceptSiteId) {
            this.acceptSiteId = acceptSiteId;
        }

        public String getAcceptAdminOfficeCode() {
            return acceptAdminOfficeCode;
        }

        public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
            this.acceptAdminOfficeCode = acceptAdminOfficeCode;
        }

        public String getAcceptAreaCode() {
            return acceptAreaCode;
        }

        public void setAcceptAreaCode(String acceptAreaCode) {
            this.acceptAreaCode = acceptAreaCode;
        }

        public String getSettleSiteId() {
            return settleSiteId;
        }

        public void setSettleSiteId(String settleSiteId) {
            this.settleSiteId = settleSiteId;
        }

        public String getSettleAdminOfficeCode() {
            return settleAdminOfficeCode;
        }

        public void setSettleAdminOfficeCode(String settleAdminOfficeCode) {
            this.settleAdminOfficeCode = settleAdminOfficeCode;
        }

        public String getSettleAreaCode() {
            return settleAreaCode;
        }

        public void setSettleAreaCode(String settleAreaCode) {
            this.settleAreaCode = settleAreaCode;
        }

        public String getAcceptRegistrarName() {
            return acceptRegistrarName;
        }

        public void setAcceptRegistrarName(String acceptRegistrarName) {
            this.acceptRegistrarName = acceptRegistrarName;
        }

        public String getAcceptRegistrarId() {
            return acceptRegistrarId;
        }

        public void setAcceptRegistrarId(String acceptRegistrarId) {
            this.acceptRegistrarId = acceptRegistrarId;
        }
    }

    /**
     * @return the householdId
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * @param householdId
     *            the householdId to set
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * @return the seqId
     */
    public Integer getSeqId() {
        return seqId;
    }

    /**
     * @param seqId
     *            the seqId to set
     */
    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    /**
     * @return the personDataList
     */
    public List<Rl01e10PersonDTO> getPersonDataList() {
        return personDataList;
    }

    /**
     * @param personDataList
     *            the personDataList to set
     */
    public void setPersonDataList(List<Rl01e10PersonDTO> personDataList) {
        this.personDataList = personDataList;
    }

    /**
     * @return the saveEnabled
     */
    public boolean isSaveEnabled() {
        return saveEnabled;
    }

    /**
     * @param saveEnabled
     *            the saveEnabled to set
     */
    public void setSaveEnabled(boolean saveEnabled) {
        this.saveEnabled = saveEnabled;
    }

    /**
     * @return the txnId
     */
    public String getTxnId() {
        return txnId;
    }

    /**
     * @param txnId
     *            the txnId to set
     */
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     *            the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the acceptSiteId
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * @param acceptSiteId
     *            the acceptSiteId to set
     */
    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * @return the openingOperationDTO
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * @param openingOperationDTO
     *            the openingOperationDTO to set
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * @return the systemDate
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * @param systemDate
     *            the systemDate to set
     */
    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * @return the systemTime
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * @param systemTime
     *            the systemTime to set
     */
    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

}

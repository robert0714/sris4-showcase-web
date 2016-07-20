/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rs.annotations.FieldDescription;

/**
 * RemoveOldDataDTO
 * 
 * @author Marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emoveOldDataDTO", propOrder = { "seqId", "operationCode", "moveinSiteId", "householdHeadId",
        "householdId", "removeDate", "removeTime", "mainType", "subType", "registerCode", "registerContent",
        "moveinPersonIds" })
@XmlRootElement(name = "RemoveOldDataDTO")
public class RemoveOldDataDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** 作業順序編號 */
    @XmlElement(name = "SeqId")
    @FieldDescription(desc = "作業順序編號")
    private Integer seqId;

    /** 作業編號 */
    @XmlElement(name = "OperationCode")
    @FieldDescription(desc = "作業編號")
    private String operationCode;

    /** 擬入戶籍地作業點 */
    @XmlElement(name = "MoveinSiteId")
    @FieldDescription(desc = "擬入戶籍地作業點")
    private String moveinSiteId;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldDescription(desc = "戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId")
    @FieldDescription(desc = "戶號")
    private String householdId;

    /** 除戶日期 */
    @XmlElement(name = "removeDate")
    @FieldDescription(desc = "除戶日期")
    private String removeDate;

    /** 除戶時間 */
    @XmlElement(name = "removeTime")
    @FieldDescription(desc = "除戶時間")
    private String removeTime;
    /** 主分類 */
    @XmlElement(name = "mainType")
    @FieldDescription(desc = "主分類")
    private String mainType;

    /** 主分類 */
    @XmlElement(name = "subType")
    @FieldDescription(desc = "次分類")
    private String subType;

    /** 記事例代碼 */
    @XmlElement(name = "registerCode")
    @FieldDescription(desc = "記事例代碼")
    private String registerCode;

    /** 記事內容 */
    @XmlElement(name = "RegisterContent")
    @FieldDescription(desc = "記事內容")
    private String registerContent;

    /** 住變登記時原戶長是否遷出 */
    @XmlElement(name = "HeadOut")
    @FieldDescription(desc = "該原戶長是否遷出")
    private boolean chagneAddressHeadOut = Boolean.FALSE;

    /** 住變登記時是否沿用戶號與戶長 */
    @XmlElement(name = "ifRemainSameHouseIdAndHouseHead")
    @FieldDescription(desc = "是否沿用戶號與戶長")
    private boolean ifRemainSameHouseIdAndHouseHead = Boolean.FALSE;

    /** 遷出地作業點代碼 */
    @XmlElement(name = "moveoutSiteId")
    @FieldDescription(desc = "遷出地作業點代碼")
    private String moveoutSiteId;

    /** 指定的遷出類別 */
    @XmlElement(name = "moveoutSiteId")
    @FieldDescription(desc = "指定的遷出類別")
    private String moveoutType;

    /** 指定的遷出類別 */
    @XmlElement(name = "changeMarkPersonIds")
    @FieldDescription(desc = "指定的遷出類別")
    private List<String> changeMarkPersonIds = new ArrayList<String>();

    /** 指定的遷出類別 */
    @XmlElement(name = "moveinPersonIds")
    @FieldDescription(desc = "當事人的ID list")
    private Set<String> moveinPersonIds = new HashSet<String>();

    /** 當事人是否為遷入地除口,且遷出國外 */
    @XmlElement(name = "ifForeign")
    @FieldDescription(desc = "當事人是否為遷入地除口,且遷出國外")
    private boolean ifForeign = Boolean.FALSE;

    /** 大簿當事人ID */
    @XmlElement(name = "masterPersonId")
    private String masterPersonId;

    /** 是否僅餘兼任戶長 */
    @XmlElement(name = "LastConcurrentHead")
    private boolean lastConcurrentHead = Boolean.FALSE;

    /** 是否同個siteId遷徙 */
    @XmlElement(name = "SameSiteIdMove")
    private boolean sameSiteIdMove = Boolean.FALSE;

    /** 是否原住地為大戶 */
    @XmlElement(name = "BigHouseholdFlag")
    private boolean bigHouseholdFlag = Boolean.FALSE;

    public RemoveOldDataDTO() {

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
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode
     *            the operationCode to set
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * @return the moveinSiteId
     */
    public String getMoveinSiteId() {
        return moveinSiteId;
    }

    /**
     * @param moveinSiteId
     *            the moveinSiteId to set
     */
    public void setMoveinSiteId(String moveinSiteId) {
        this.moveinSiteId = moveinSiteId;
    }

    /**
     * @return the householdHeadId
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * @param householdHeadId
     *            the householdHeadId to set
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
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
     * @return the removeDate
     */
    public String getRemoveDate() {
        return removeDate;
    }

    /**
     * @param removeDate
     *            the removeDate to set
     */
    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate;
    }

    /**
     * @return the removeTime
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * @param removeTime
     *            the removeTime to set
     */
    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * @return the mainType
     */
    public String getMainType() {
        return mainType;
    }

    /**
     * @param mainType
     *            the mainType to set
     */
    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    /**
     * @return the subType
     */
    public String getSubType() {
        return subType;
    }

    /**
     * @param subType
     *            the subType to set
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * @return the registerCode
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * @param registerCode
     *            the registerCode to set
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * @return the registerContent
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * @param registerContent
     *            the registerContent to set
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * @return the chagneAddressHeadOut
     */
    public boolean isChagneAddressHeadOut() {
        return chagneAddressHeadOut;
    }

    /**
     * @param chagneAddressHeadOut
     *            the chagneAddressHeadOut to set
     */
    public void setChagneAddressHeadOut(boolean chagneAddressHeadOut) {
        this.chagneAddressHeadOut = chagneAddressHeadOut;
    }

    /**
     * @return the moveoutSiteId
     */
    public String getMoveoutSiteId() {
        return moveoutSiteId;
    }

    /**
     * @param moveoutSiteId
     *            the moveoutSiteId to set
     */
    public void setMoveoutSiteId(String moveoutSiteId) {
        this.moveoutSiteId = moveoutSiteId;
    }

    /**
     * @return the moveoutType
     */
    public String getMoveoutType() {
        return moveoutType;
    }

    /**
     * @param moveoutType
     *            the moveoutType to set
     */
    public void setMoveoutType(String moveoutType) {
        this.moveoutType = moveoutType;
    }

    /**
     * @return the changeMarkPersonIds
     */
    public List<String> getChangeMarkPersonIds() {
        return changeMarkPersonIds;
    }

    /**
     * @param changeMarkPersonIds
     *            the changeMarkPersonIds to set
     */
    public void setChangeMarkPersonIds(List<String> changeMarkPersonIds) {
        this.changeMarkPersonIds = changeMarkPersonIds;
    }

    /**
     * @return the ifRemainSameHouseIdAndHouseHead
     */
    public boolean isIfRemainSameHouseIdAndHouseHead() {
        return ifRemainSameHouseIdAndHouseHead;
    }

    /**
     * @param ifRemainSameHouseIdAndHouseHead
     *            the ifRemainSameHouseIdAndHouseHead to set
     */
    public void setIfRemainSameHouseIdAndHouseHead(boolean ifRemainSameHouseIdAndHouseHead) {
        this.ifRemainSameHouseIdAndHouseHead = ifRemainSameHouseIdAndHouseHead;
    }

    /**
     * @return the moveinPersonIds
     */
    public Set<String> getMoveinPersonIds() {
        return moveinPersonIds;
    }

    /**
     * @param moveinPersonIds
     *            the moveinPersonIds to set
     */
    public void setMoveinPersonIds(Set<String> moveinPersonIds) {
        this.moveinPersonIds = moveinPersonIds;
    }

    /**
     * @return the ifForeign
     */
    public boolean isIfForeign() {
        return ifForeign;
    }

    /**
     * @param ifForeign
     *            the ifForeign to set
     */
    public void setIfForeign(boolean ifForeign) {
        this.ifForeign = ifForeign;
    }

    /**
     * @return the masterPersonId
     */
    public String getMasterPersonId() {
        return masterPersonId;
    }

    /**
     * @param masterPersonId
     *            the masterPersonId to set
     */
    public void setMasterPersonId(String masterPersonId) {
        this.masterPersonId = masterPersonId;
    }

    /**
     * @return the lastConcurrentHead
     */
    public boolean isLastConcurrentHead() {
        return lastConcurrentHead;
    }

    /**
     * @param lastConcurrentHead
     *            the lastConcurrentHead to set
     */
    public void setLastConcurrentHead(boolean lastConcurrentHead) {
        this.lastConcurrentHead = lastConcurrentHead;
    }

    /**
     * @return the sameSiteIdMove
     */
    public boolean isSameSiteIdMove() {
        return sameSiteIdMove;
    }

    /**
     * @param sameSiteIdMove
     *            the sameSiteIdMove to set
     */
    public void setSameSiteIdMove(boolean sameSiteIdMove) {
        this.sameSiteIdMove = sameSiteIdMove;
    }

    /**
     * @return the bigHouseholdFlag
     */
    public boolean isBigHouseholdFlag() {
        return bigHouseholdFlag;
    }

    /**
     * @param bigHouseholdFlag
     *            the bigHouseholdFlag to set
     */
    public void setBigHouseholdFlag(boolean bigHouseholdFlag) {
        this.bigHouseholdFlag = bigHouseholdFlag;
    }

}

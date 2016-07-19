/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 處理RLDF的下除戶 參數DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlHouseholdRemoveDTO", propOrder = { "transactionId", "sequenceId", "personId", "siteId",
        "householdHeadId", "householdId", "processType", "removeYyymmdd", "removeTime", "mastterDeadFlag",
        "moveinPlacePersonFlag", "deleteType", "doCreateObnf", "operationCode", "specialUpdate", "useType",
        "masterPersonId" })
@XmlRootElement(name = "RlHouseholdRemoveDTO")
public class RlHouseholdRemoveDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** 交易序號 */
    @XmlElement(name = "TransactionId")
    @FieldName("交易序號")
    private String transactionId;

    /** 作業順序編號 */
    @XmlElement(name = "SequenceId")
    @FieldName("作業順序編號")
    private String sequenceId;

    /** 下除戶者的統號 */
    @XmlElement(name = "PersonId")
    @FieldName("下除戶者的統號")
    private String personId;

    /** 下除戶者的作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("下除戶者的作業點代碼")
    private String siteId;

    /** 下除戶者的戶長統號 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("下除戶者的戶長統號")
    private String householdHeadId;

    /** 下除戶者的戶號 */
    @XmlElement(name = "HouseholdId")
    @FieldName("下除戶者的戶號")
    private String householdId;

    /** 下除戶日期 */
    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("下除戶日期")
    private String removeYyymmdd;
    /** 下除戶時間 */
    @XmlElement(name = "RemoveTime")
    @FieldName("下除戶時間")
    private String removeTime;

    /** 除戶處理類型 */
    @XmlElement(name = "ProcessType")
    @FieldName("除戶處理類型")
    private RlHouseholdRemoveType processType;

    /** 此人是否為大簿當事人且為死亡者 */
    @XmlElement(name = "MastterDeadFlag")
    @FieldName("此人是否為大簿當事人且為死亡者")
    private boolean masterDeadFlag;

    /** 此人是否為遷徙當事人且代表遷入地的除口的4M的人 */
    @XmlElement(name = "MoveinPlacePersonFlag")
    @FieldName("此人是否為遷徙當事人且代表遷入地的除口的4M的人 ")
    private boolean moveinPlacePersonFlag;

    /** 作業代碼 */
    @XmlElement(name = "OperationCode")
    @FieldName("作業代碼")
    private String operationCode;

    /** 特殊更新的欄位與值 */
    @XmlElement(name = "SpecialUpdate")
    @FieldName("特殊更新的欄位與值")
    private String specialUpdate;

    /** 使用的類別 */
    @XmlElement(name = "UseType")
    @FieldName("使用的類別")
    private String useType;

    /** 刪除的類別 */
    @XmlElement(name = "DeleteType")
    @FieldName("刪除的類別")
    private RlHouseholdDeleteType deleteType;

    /** 是否要包通報至RR,RC */
    @XmlElement(name = "DoCreateObnf")
    @FieldName("是否要包通報至RR,RC")
    private boolean doCreateObnf = Boolean.FALSE;

    /** 是否不commit而是回傳值 */
    @XmlElement(name = "DoReturnDTO")
    @FieldName("是否不commit而是回傳值")
    private boolean doReturnDTO = Boolean.FALSE;

    /** 大簿當事人統號 */
    @XmlElement(name = "MasterPersonId")
    @FieldName("大簿當事人統號")
    private String masterPersonId;

    public RlHouseholdRemoveDTO(String personId, String siteId, String householdHeadId, String householdId,
            RlHouseholdRemoveType processType) {
        super();
        this.personId = personId;
        this.siteId = siteId;
        this.householdHeadId = householdHeadId;
        this.householdId = householdId;
        this.processType = processType;
    }

    public RlHouseholdRemoveDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * @param transactionId
     *            the transactionId to set
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
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
     * @return the processType
     */
    public RlHouseholdRemoveType getProcessType() {
        return processType;
    }

    /**
     * @param processType
     *            the processType to set
     */
    public void setProcessType(RlHouseholdRemoveType processType) {
        this.processType = processType;
    }

    /**
     * @return the moveinPlacePersonFlag
     */
    public boolean isMoveinPlacePersonFlag() {
        return moveinPlacePersonFlag;
    }

    /**
     * @param moveinPlacePersonFlag
     *            the moveinPlacePersonFlag to set
     */
    public void setMoveinPlacePersonFlag(boolean moveinPlacePersonFlag) {
        this.moveinPlacePersonFlag = moveinPlacePersonFlag;
    }

    /**
     * @return the removeYyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * @param removeYyymmdd
     *            the removeYyymmdd to set
     */
    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
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
     * @return the sequenceId
     */
    public String getSequenceId() {
        return sequenceId;
    }

    /**
     * @param sequenceId
     *            the sequenceId to set
     */
    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    /**
     * @return the masterDeadFlag
     */
    public boolean isMasterDeadFlag() {
        return masterDeadFlag;
    }

    /**
     * @param masterDeadFlag
     *            the masterDeadFlag to set
     */
    public void setMasterDeadFlag(boolean masterDeadFlag) {
        this.masterDeadFlag = masterDeadFlag;
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
     * @return the specialUpdate
     */
    public String getSpecialUpdate() {
        return specialUpdate;
    }

    /**
     * @param specialUpdate
     *            the specialUpdate to set
     */
    public void setSpecialUpdate(String specialUpdate) {
        this.specialUpdate = specialUpdate;
    }

    /**
     * @return the useType
     */
    public String getUseType() {
        return useType;
    }

    /**
     * @param useType
     *            the useType to set
     */
    public void setUseType(String useType) {
        this.useType = useType;
    }

    /**
     * @return the deleteType
     */
    public RlHouseholdDeleteType getDeleteType() {
        return deleteType;
    }

    /**
     * @param deleteType
     *            the deleteType to set
     */
    public void setDeleteType(RlHouseholdDeleteType deleteType) {
        this.deleteType = deleteType;
    }

    /**
     * @return the doCreateObnf
     */
    public boolean isDoCreateObnf() {
        return doCreateObnf;
    }

    /**
     * @param doCreateObnf
     *            the doCreateObnf to set
     */
    public void setDoCreateObnf(boolean doCreateObnf) {
        this.doCreateObnf = doCreateObnf;
    }

    /**
     * @return the doReturnDTO
     */
    public boolean isDoReturnDTO() {
        return doReturnDTO;
    }

    /**
     * @param doReturnDTO
     *            the doReturnDTO to set
     */
    public void setDoReturnDTO(boolean doReturnDTO) {
        this.doReturnDTO = doReturnDTO;
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

}

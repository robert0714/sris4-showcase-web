/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.rl.component.dto.RlHouseholdDeleteType;
import tw.gov.moi.rl.component.dto.SpecialNoticeParam;
import tw.gov.moi.rl.component.dto.XLDFDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rs.annotations.FieldDescription;
import tw.gov.moi.rs.dto.PairEntry;

/**
 * XLDF下除戶傳輸物件.
 * 
 * @author JL
 * 
 */
public class XLDFRemoveHouseholdDTO {

    /** The operation sequence id. */
    private Integer operationSequenceId;

    /** The operation code. */
    private String operationCode;

    /** The remove date. */
    private String removeDate;

    /** The remove time. */
    private String removeTime;

    /** The operation code. */
    private boolean masterDeadFlag = Boolean.FALSE;

    /** The operation code. */
    private boolean moveinPlacePerson = Boolean.FALSE;

    /** The useType. */
    private String useType;

    /** The xldf domain object. */
    private XLDFDomainObject xldfDomainObject;

    /** The removeSpecialUpdate */
    private List<PairEntry> removeSpecialUpdate;

    /** The spTableAndKey */
    private List<XLDFDomainKey> noRemoveEntryKey = new ArrayList<XLDFDomainKey>();

    /** The xldf domain object. */
    private Map<String, Map<String, SpecialNoticeParam>> specialNoticeObjMap;

    /** 加入判斷是否要處理大簿當事人:若否,則代表此4M不需要做有關大部當事人的資料更新，預設為是 */
    @XmlElement(name = "doMasterPersonProcess")
    private boolean doMasterPersonProcess = Boolean.TRUE;
    /** 刪除的類別 */
    @XmlElement(name = "DeleteType")
    @FieldDescription(desc = "刪除的類別")
    private RlHouseholdDeleteType deleteType;

    /** 當事人是否為遷入地除口,且遷出國外 */
    @XmlElement(name = "ifForeign")
    @FieldDescription(desc = "當事人是否為遷入地除口,且遷出國外")
    private boolean ifForeign = Boolean.FALSE;

    /** 大簿當事人統號 */
    @XmlElement(name = "masterPersonId")
    @FieldDescription(desc = "大簿當事人統號")
    private String masterPersonId;

    /**
     * Instantiates a new xLDF remove household dto.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param operationCode
     *            the operation code
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param xldfDomainObject
     *            the xldf domain object
     */
    public XLDFRemoveHouseholdDTO(final Integer operationSequenceId, final String operationCode,
            final String removeDate, final String removeTime, final XLDFDomainObject xldfDomainObject) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.xldfDomainObject = xldfDomainObject;
        this.specialNoticeObjMap = new HashMap<String, Map<String, SpecialNoticeParam>>();

    }

    /**
     * Instantiates a new xLDF remove household dto.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param operationCode
     *            the operation code
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param xldfDomainObject
     *            the xldf domain object
     */
    public XLDFRemoveHouseholdDTO(final Integer operationSequenceId, final String operationCode,
            final String removeDate, final String removeTime, final XLDFDomainObject xldfDomainObject,
            boolean doMasterPersonProcess) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.xldfDomainObject = xldfDomainObject;
        this.specialNoticeObjMap = new HashMap<String, Map<String, SpecialNoticeParam>>();
        this.doMasterPersonProcess = doMasterPersonProcess;
    }

    /**
     * 
     * @param operationSequenceId
     * @param operationCode
     * @param removeDate
     * @param removeTime
     * @param xldfDomainObject
     * @param doMasterPersonProcess
     * @param masterPersonId
     */
    public XLDFRemoveHouseholdDTO(final Integer operationSequenceId, final String operationCode,
            final String removeDate, final String removeTime, final XLDFDomainObject xldfDomainObject,
            boolean doMasterPersonProcess, final String masterPersonId) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.xldfDomainObject = xldfDomainObject;
        this.specialNoticeObjMap = new HashMap<String, Map<String, SpecialNoticeParam>>();
        this.doMasterPersonProcess = doMasterPersonProcess;
        this.masterPersonId = masterPersonId;
    }

    /**
     * Instantiates a new xLDF remove household dto. 13101804
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param operationCode
     *            the operation code
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param xldfDomainObject
     *            the xldf domain object
     */
    public XLDFRemoveHouseholdDTO(final Integer operationSequenceId, final String operationCode,
            final String removeDate, final String removeTime, final XLDFDomainObject xldfDomainObject,
            final Map<String, Map<String, SpecialNoticeParam>> specialNoticeObjMap) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.xldfDomainObject = xldfDomainObject;
        this.specialNoticeObjMap = specialNoticeObjMap;

    }

    /**
     * Instantiates a new xLDF remove household dto.13101804
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param operationCode
     *            the operation code
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param xldfDomainObject
     *            the xldf domain object
     */
    public XLDFRemoveHouseholdDTO(final Integer operationSequenceId, final String operationCode,
            final String removeDate, final String removeTime, final XLDFDomainObject xldfDomainObject,
            final Map<String, Map<String, SpecialNoticeParam>> specialNoticeObjMap, boolean doMasterPersonProcess) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.xldfDomainObject = xldfDomainObject;
        this.specialNoticeObjMap = specialNoticeObjMap;
        this.doMasterPersonProcess = doMasterPersonProcess;
    }

    /**
     * @return the noRemoveEntryKey
     */
    public List<XLDFDomainKey> getNoRemoveEntryKey() {

        return noRemoveEntryKey;
    }

    /**
     * @param noRemoveEntryKey
     *            the noRemoveEntryKey to set
     */
    public void setNoRemoveEntryKey(List<XLDFDomainKey> noRemoveEntryKey) {
        this.noRemoveEntryKey = noRemoveEntryKey;
    }

    /**
     * @return the removeSpecialUpdate
     */
    public List<PairEntry> getRemoveSpecialUpdate() {
        return removeSpecialUpdate;
    }

    /**
     * @param removeSpecialUpdate
     *            the removeSpecialUpdate to set
     */
    public void setRemoveSpecialUpdate(List<PairEntry> removeSpecialUpdate) {
        this.removeSpecialUpdate = removeSpecialUpdate;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(final Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the new operation code
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the removes the date.
     * 
     * @return the removes the date
     */
    public String getRemoveDate() {
        return removeDate;
    }

    /**
     * Sets the removes the date.
     * 
     * @param removeDate
     *            the new removes the date
     */
    public void setRemoveDate(final String removeDate) {
        this.removeDate = removeDate;
    }

    /**
     * Gets the removes the time.
     * 
     * @return the removes the time
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * Sets the removes the time.
     * 
     * @param removeTime
     *            the new removes the time
     */
    public void setRemoveTime(final String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * Gets the xldf domain object.
     * 
     * @return the xldf domain object
     */
    public XLDFDomainObject getXldfDomainObject() {
        return xldfDomainObject;
    }

    /**
     * Sets the xldf domain object.
     * 
     * @param xldfDomainObject
     *            the new xldf domain object
     */
    public void setXldfDomainObject(final XLDFDomainObject xldfDomainObject) {
        this.xldfDomainObject = xldfDomainObject;
    }

    /**
     * @return the specialNoticeObjMap
     */
    public Map<String, Map<String, SpecialNoticeParam>> getSpecialNoticeObjMap() {
        return specialNoticeObjMap;
    }

    /**
     * @param specialNoticeObjMap
     *            the specialNoticeObjMap to set
     */
    public void setSpecialNoticeObjMap(Map<String, Map<String, SpecialNoticeParam>> specialNoticeObjMap) {
        this.specialNoticeObjMap = specialNoticeObjMap;
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
     * @return the moveinPlacePerson
     */
    public boolean isMoveinPlacePerson() {
        return moveinPlacePerson;
    }

    /**
     * @param moveinPlacePerson
     *            the moveinPlacePerson to set
     */
    public void setMoveinPlacePerson(boolean moveinPlacePerson) {
        this.moveinPlacePerson = moveinPlacePerson;
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
     * @return the doMasterPersonProcess
     */
    public boolean isDoMasterPersonProcess() {
        return doMasterPersonProcess;
    }

    /**
     * @param doMasterPersonProcess
     *            the doMasterPersonProcess to set
     */
    public void setDoMasterPersonProcess(boolean doMasterPersonProcess) {
        this.doMasterPersonProcess = doMasterPersonProcess;
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

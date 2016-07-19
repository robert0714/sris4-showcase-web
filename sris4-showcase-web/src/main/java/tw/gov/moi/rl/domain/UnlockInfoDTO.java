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

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.dto.PairEntry;
import tw.gov.moi.util.DateUtil;
 
/**
 * The Class UnlockInfoDTO.
 * 
 * @author Jay Kan
 */
public class UnlockInfoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6204638476625265473L;

    /** The transaction id. */
    @FieldName("交易序號")
    private String transactionId;

    /** The accept site id. */
    @FieldName("受理作業點代碼")
    private String acceptSiteId;

    /** The data site ids. */
    @FieldName("資料作業點代碼字串")
    private String dataSiteIds;

    /** The accept register name. */
    @FieldName("受理使用者名稱")
    private String acceptRegisterName;

    /** The accept register id. */
    @FieldName("受理使用者代碼")
    private String acceptRegisterId;

    /** The person id. */
    @FieldName("被鎖定的民眾統號")
    private String personId;

    /** The lock status. */
    @FieldName("加鎖資料狀態")
    private String lockStatus;

    /** The lock detail. */
    @FieldName("加鎖資料詳細資訊")
    private UnlockDetailInfoDTO[] lockDetail;

    /** The action user ip. */
    @FieldName("加鎖人員ip")
    private String actionUserIp;

    /** The data table name. */
    @FieldName("鎖定資料table名稱")
    private String dataTableName;

    /** The pk content. */
    @FieldName("加鎖資料pk內容")
    private String pkContent;

    /** The action site id. */
    @FieldName("加鎖人員作業點")
    private String actionSiteId;

    /**
     * jsf頁面使用
     * *.
     *
     * @return the operation label
     */
    public String getOperationLabel() {
        String result = StringUtils.EMPTY;
        if (ArrayUtils.isNotEmpty(this.lockDetail)) {
            final List<String> operationNameList = new ArrayList<String>(this.lockDetail.length);
            for (UnlockDetailInfoDTO unit : this.lockDetail) {
                operationNameList.add(unit.getOperationName());
            }
            result = StringUtils.join(operationNameList, ",");
            final Set<String> unitDetailSet = new HashSet<String>();
            for (UnlockDetailInfoDTO unit : this.lockDetail) {
                operationNameList.add(unit.getOperationName());
                final PairEntry[] pp = unit.getLockTableNameContent();

                if (ArrayUtils.isNotEmpty(pp)) {
                    final List<String> data = new ArrayList<String>(pp.length);
                    for (PairEntry aPairEntry : pp) {
                        data.add(aPairEntry.getKey() + "-" + aPairEntry.getValue().toString());
                    }
                    unitDetailSet.add(StringUtils.join(data, ","));

                }
            }
            if (StringUtils.isNotBlank(result)) {
                result = new StringBuffer().append(result).append('(').append(StringUtils.join(unitDetailSet, ",")).append(')')
                        .toString();
            } else {
                result = StringUtils.join(unitDetailSet, ",");
            }

        }
        return result;
    }

    /**
     * jsf頁面使用
     * *.
     *
     * @return the time
     */
    public String getTime() {
        final String time = StringUtils.substring(this.transactionId, 12, 20);
        String result = StringUtils.substring(this.transactionId, 8, 10) + "月"
                + StringUtils.substring(this.transactionId, 10, 12) + "日 ";
        result = result + DateUtil.formatHhmmss(time);
        return result;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the accept site id.
     * 
     * @return the accept site id
     */
    public String getAcceptSiteId() {
        return this.acceptSiteId;
    }

    /**
     * Sets the accept site id.
     * 
     * @param acceptSiteId
     *            the new accept site id
     */
    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Gets the accept register name.
     * 
     * @return the accept register name
     */
    public String getAcceptRegisterName() {
        return this.acceptRegisterName;
    }

    /**
     * Sets the accept register name.
     * 
     * @param acceptRegisterName
     *            the new accept register name
     */
    public void setAcceptRegisterName(final String acceptRegisterName) {
        this.acceptRegisterName = acceptRegisterName;
    }

    /**
     * Gets the accept register id.
     * 
     * @return the accept register id
     */
    public String getAcceptRegisterId() {
        return this.acceptRegisterId;
    }

    /**
     * Sets the accept register id.
     * 
     * @param acceptRegisterId
     *            the new accept register id
     */
    public void setAcceptRegisterId(final String acceptRegisterId) {
        this.acceptRegisterId = acceptRegisterId;
    }

    /**
     * Gets the lock status.
     *
     * @return the lock status
     */
    public String getLockStatus() {
        return this.lockStatus;
    }

    /**
     * Sets the lock status.
     *
     * @param lockStatus the new lock status
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    /**
     * Gets the lock detail.
     *
     * @return the lock detail
     */
    public UnlockDetailInfoDTO[] getLockDetail() {
        return this.lockDetail;
    }

    /**
     * Sets the lock detail.
     *
     * @param lockDetail the new lock detail
     */
    public void setLockDetail(UnlockDetailInfoDTO[] lockDetail) {
        if (lockDetail != null) {
            this.lockDetail = lockDetail.clone();
        } else {
            this.lockDetail = null;
        }
    }

    /**
     * Gets the person id.
     *
     * @return the person id
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * Sets the person id.
     *
     * @param personId the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the data site ids.
     *
     * @return the data site ids
     */
    public String getDataSiteIds() {
        return this.dataSiteIds;
    }

    /**
     * Sets the data site ids.
     *
     * @param dataSiteIds the new data site ids
     */
    public void setDataSiteIds(String dataSiteIds) {
        this.dataSiteIds = dataSiteIds;
    }

    /**
     * Gets the action user ip.
     *
     * @return the action user ip
     */
    public String getActionUserIp() {
        return this.actionUserIp;
    }

    /**
     * Sets the action user ip.
     *
     * @param actionUserIp the new action user ip
     */
    public void setActionUserIp(String actionUserIp) {
        this.actionUserIp = actionUserIp;
    }

    /**
     * Gets the data table name.
     *
     * @return the data table name
     */
    public String getDataTableName() {
        return this.dataTableName;
    }

    /**
     * Sets the data table name.
     *
     * @param dataTableName the new data table name
     */
    public void setDataTableName(String dataTableName) {
        this.dataTableName = dataTableName;
    }

    /**
     * Gets the pk content.
     *
     * @return the pk content
     */
    public String getPkContent() {
        return this.pkContent;
    }

    /**
     * Sets the pk content.
     *
     * @param pkContent the new pk content
     */
    public void setPkContent(String pkContent) {
        this.pkContent = pkContent;
    }

    /**
     * Gets the action site id.
     *
     * @return the action site id
     */
    public String getActionSiteId() {
        return this.actionSiteId;
    }

    /**
     * Sets the action site id.
     *
     * @param actionSiteId the new action site id
     */
    public void setActionSiteId(String actionSiteId) {
        this.actionSiteId = actionSiteId;
    }

}

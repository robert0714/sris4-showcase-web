/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 更新新增動作XLDF設定參數
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFDeletedDomainKey", propOrder = { "transactionId", "operationSequenceId", "xldfType", "domainKey",
        "siteId" })
public class XLDFDeletedDomainKey {

    /** 交易序號. */
    @XmlElement(name = "transactionId")
    private String transactionId;

    /** 作業順序編號. */
    @XmlElement(name = "operationSequenceId")
    private Integer operationSequenceId;

    /** XLDF領域物件類別. */
    @XmlElement(name = "xldfType")
    protected Class<? extends XLDFDomainObject> xldfType;

    /** XLDF領域物件鍵值. */
    @XmlElement(name = "domainKey")
    private String domainKey;

    /** . XLDF領域物件鍵值對應的siteId的值 */
    @XmlElement(name = "siteId")
    private String siteId;

    public XLDFDeletedDomainKey() {

    }

    /**
     * 
     * @param transactionId
     * @param operationSequenceId
     * @param xldfType
     * @param domainKey
     * @param siteId
     */
    public XLDFDeletedDomainKey(String transactionId, Integer operationSequenceId,
            Class<? extends XLDFDomainObject> xldfType, String domainKey, String siteId) {
        super();
        this.transactionId = transactionId;
        this.operationSequenceId = operationSequenceId;
        this.xldfType = xldfType;
        this.domainKey = domainKey;
        this.siteId = siteId;
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
     * @return the operationSequenceId
     */
    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * @param operationSequenceId
     *            the operationSequenceId to set
     */
    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * @return the xldfType
     */
    public Class<? extends XLDFDomainObject> getXldfType() {
        return xldfType;
    }

    /**
     * @param xldfType
     *            the xldfType to set
     */
    public void setXldfType(Class<? extends XLDFDomainObject> xldfType) {
        this.xldfType = xldfType;
    }

    /**
     * @return the domainKey
     */
    public String getDomainKey() {
        return domainKey;
    }

    /**
     * @param domainKey
     *            the domainKey to set
     */
    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
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

}

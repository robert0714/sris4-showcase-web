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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶籍登記特殊通報處理單筆domain object物件
 * 
 * @author marcus chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xlDFRegDetailObnfParams", propOrder = { "xldfDomainObj", "operationCode", "sequenceId",
        "operationCode", "phase", "rcNoticeType", "rcEntityClassType", "rrNoticeType", "rrEntityClassType", "seqId" })
@XmlRootElement(name = "XLDFRegDetailObnfParams")
public class XLDFRegDetailObnfParams implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7702548442026091131L;

    /** domain object物件 */
    @XmlElement(name = "XldfDomainObj")
    @FieldName("domain object物件")
    private XLDFDomainObject xldfDomainObj;

    @XmlElement(name = "OperationCode")
    @FieldName("作業順序")
    private String operationCode;

    @XmlElement(name = "Phase")
    @FieldName("作業階段")
    private Integer phase;

    @XmlElement(name = "RcNoticeType")
    @FieldName("發送給RC的通報類別")
    private String rcNoticeType;

    @XmlElement(name = "RcChgType")
    @FieldName("發送給RC的異動類別")
    private String rcChgType;

    @XmlElement(name = "RcEntityClassType")
    @FieldName("發送給RC的接收型別")
    private Class<?> rcEntityClassType;

    @XmlElement(name = "RrNoticeType")
    @FieldName("發送給RR的接收型別")
    private String rrNoticeType;

    @XmlElement(name = "RrChgType")
    @FieldName("發送給RR的異動類別")
    private String rrChgType;

    @XmlElement(name = "RrEntityClassType")
    @FieldName("發送給RR的接收型別")
    private Class<?> rrEntityClassType;
    
    @XmlElement(name = "RlNoticeType")
    @FieldName("發送給RL的接收型別")
    private String rlNoticeType;

    @XmlElement(name = "RlChgType")
    @FieldName("發送給RL的異動類別")
    private String rlChgType;

    @XmlElement(name = "RlEntityClassType")
    @FieldName("發送給RL的接收型別")
    private Class<?> rlEntityClassType;

    @XmlElement(name = "SeqId")
    @FieldName("seqId")
    private Integer seqId;

    public XLDFRegDetailObnfParams() {
        super();

    }

    /**
     * 戶籍登記特殊通報處理單筆Constructor
     * 
     * @param xldfDomainObj
     *            domain object物件
     * @param sequenceId
     *            作業順序
     * @param operationCode
     *            作業代碼
     * @param phase
     *            作業階段
     * @param rcNoticeType
     *            發送給RC的通報類別
     * @param rcEntityClassType
     *            發送給RC的接收型別
     * @param rrNoteicType
     *            發送給RC的接收型別
     * @param rrEntityClassType
     *            發送給RR的接收型別
     */
    public XLDFRegDetailObnfParams(XLDFDomainObject xldfDomainObj, Integer phase, String operationCode,
            String rcNoticeType, Class<?> rcEntityClassType, String rrNoticeType, Class<?> rrEntityClassType) {
        super();
        this.xldfDomainObj = xldfDomainObj;
        this.operationCode = operationCode;
        this.phase = phase;
        this.rcNoticeType = rcNoticeType;
        this.rcEntityClassType = rcEntityClassType;
        this.rrNoticeType = rrNoticeType;
        this.rrEntityClassType = rrEntityClassType;

        if (StringUtils.isNotBlank(xldfDomainObj.getSequenceNumber())) {
            this.seqId = Integer.valueOf(xldfDomainObj.getSequenceNumber());
        } else {
            this.seqId = 0;
        }

    }

    public XLDFRegDetailObnfParams(XLDFDomainObject xldfDomainObj, Integer phase, String operationCode,
            String rcNoticeType, Class<?> rcEntityClassType, String rrNoticeType, Class<?> rrEntityClassType,
            Integer seqId) {
        super();
        this.xldfDomainObj = xldfDomainObj;
        this.operationCode = operationCode;
        this.phase = phase;
        this.rcNoticeType = rcNoticeType;
        this.rcEntityClassType = rcEntityClassType;
        this.rrNoticeType = rrNoticeType;
        this.rrEntityClassType = rrEntityClassType;
        this.seqId = seqId;

    }

    /**
     * @return the xldfDomainObj
     */
    public XLDFDomainObject getXldfDomainObj() {
        return xldfDomainObj;
    }

    /**
     * @param xldfDomainObj
     *            the xldfDomainObj to set
     */
    public void setXldfDomainObj(XLDFDomainObject xldfDomainObj) {
        this.xldfDomainObj = xldfDomainObj;
    }

    /**
     * @return the phase
     */
    public Integer getPhase() {
        return phase;
    }

    /**
     * @param phase
     *            the phase to set
     */
    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    /**
     * @return the rcNoticeType
     */
    public String getRcNoticeType() {
        return rcNoticeType;
    }

    /**
     * @param rcNoticeType
     *            the rcNoticeType to set
     */
    public void setRcNoticeType(String rcNoticeType) {
        this.rcNoticeType = rcNoticeType;
    }

    /**
     * @return the rcEntityClassType
     */
    public Class<?> getRcEntityClassType() {
        return rcEntityClassType;
    }

    /**
     * @param rcEntityClassType
     *            the rcEntityClassType to set
     */
    public void setRcEntityClassType(Class<?> rcEntityClassType) {
        this.rcEntityClassType = rcEntityClassType;
    }

    /**
     * @return the rrNoticeType
     */
    public String getRrNoticeType() {
        return rrNoticeType;
    }

    /**
     * @param rrNoticeType
     *            the rrNoticeType to set
     */
    public void setRrNoticeType(String rrNoticeType) {
        this.rrNoticeType = rrNoticeType;
    }

    /**
     * @return the rrEntityClassType
     */
    public Class<?> getRrEntityClassType() {
        return rrEntityClassType;
    }

    /**
     * @param rrEntityClassType
     *            the rrEntityClassType to set
     */
    public void setRrEntityClassType(Class<?> rrEntityClassType) {
        this.rrEntityClassType = rrEntityClassType;
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
     * @return the rcChgType
     */
    public String getRcChgType() {
        return rcChgType;
    }

    /**
     * @param rcChgType
     *            the rcChgType to set
     */
    public void setRcChgType(String rcChgType) {
        this.rcChgType = rcChgType;
    }

    /**
     * @return the rrChgType
     */
    public String getRrChgType() {
        return rrChgType;
    }

    /**
     * @param rrChgType
     *            the rrChgType to set
     */
    public void setRrChgType(String rrChgType) {
        this.rrChgType = rrChgType;
    }

    public String getRlNoticeType() {
        return rlNoticeType;
    }

    public void setRlNoticeType(String rlNoticeType) {
        this.rlNoticeType = rlNoticeType;
    }

    public String getRlChgType() {
        return rlChgType;
    }

    public void setRlChgType(String rlChgType) {
        this.rlChgType = rlChgType;
    }

    public Class<?> getRlEntityClassType() {
        return rlEntityClassType;
    }

    public void setRlEntityClassType(Class<?> rlEntityClassType) {
        this.rlEntityClassType = rlEntityClassType;
    }

}

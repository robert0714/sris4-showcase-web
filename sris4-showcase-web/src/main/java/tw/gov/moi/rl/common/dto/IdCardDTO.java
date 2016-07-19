/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rs.annotations.FieldDescription;

/**
 * IdCardDTO
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idCardDTO", propOrder = { "seqId", "personId", "moveinSiteId", "operationCode", "originalSiteId" })
@XmlRootElement(name = "IdCardDTO")
public class IdCardDTO implements Serializable {

    /**
     * serail id
     */
    private static final long serialVersionUID = 1L;

    /** 作業順序編號 */
    @XmlElement(name = "SeqId")
    @FieldDescription(desc = "作業順序編號")
    private Integer seqId;

    /** 當事人統號 */
    @XmlElement(name = "PersonId")
    @FieldDescription(desc = "當事人統號")
    private String personId;

    /** 擬入戶籍地作業點 */
    @XmlElement(name = "MoveinSiteId")
    @FieldDescription(desc = "擬入戶籍地作業點")
    private String moveinSiteId;

    /** 作業編號 */
    @XmlElement(name = "OperationCode")
    @FieldDescription(desc = "作業編號")
    private String operationCode;

    /** 原住地作業點代碼 */
    @XmlElement(name = "OriginalSiteId")
    @FieldDescription(desc = "原住地作業點代碼")
    private String originalSiteId;

    public IdCardDTO() {

    }

    /**
     * @param seqId
     * @param personId
     * @param moveinSiteId
     * @param operationCode
     */
    public IdCardDTO(Integer seqId, String personId, String moveinSiteId, String operationCode) {
        super();
        this.seqId = seqId;
        this.personId = personId;
        this.moveinSiteId = moveinSiteId;
        this.operationCode = operationCode;
    }

    public IdCardDTO(Integer seqId, String personId, String moveinSiteId, String operationCode, String originalSiteId) {
        super();
        this.seqId = seqId;
        this.personId = personId;
        this.moveinSiteId = moveinSiteId;
        this.operationCode = operationCode;
        this.originalSiteId = originalSiteId;
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
     * @return the originalSiteId
     */
    public String getOriginalSiteId() {
        return originalSiteId;
    }

    /**
     * @param originalSiteId
     *            the originalSiteId to set
     */
    public void setOriginalSiteId(String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }

}

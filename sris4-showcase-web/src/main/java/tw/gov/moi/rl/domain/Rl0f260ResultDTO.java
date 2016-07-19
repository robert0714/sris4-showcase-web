/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 空白國民身分證及膠膜瑕疵退回登錄 顯示結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f260ResultDTO", propOrder = { "rowIndex", "type", "option", "no", "acceptYyymmdd", "acceptHhmmss",
        "documentNo", "beenEdited", "entity", "documentNoEditDisabled", "queryKey" })
@XmlRootElement(name = "Rl0f260ResultDTO")
public class Rl0f260ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 序號 */
    @XmlElement(name = "rowIndex", required = true)
    @FieldName("序號 ")
    private String rowIndex;
    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 處理模式 (A/M/D) */
    @XmlElement(name = "option", required = true)
    @FieldName("處理模式")
    private String option;

    /** 號碼 */
    @XmlElement(name = "no", required = true)
    @FieldName("號碼 ")
    private String no;

    /** 點收日期 */
    @XmlElement(name = "acceptYyymmdd", required = true)
    @FieldName("點收日期 ")
    private String acceptYyymmdd;

    /** 點收時間 */
    @XmlElement(name = "acceptHhmmss", required = true)
    @FieldName("點收時間 ")
    private String acceptHhmmss;

    /** 發文號 */
    @XmlElement(name = "documentNo", required = true)
    @FieldName("發文號 ")
    private String documentNo;

    /** 是否有修改並有query出值 */
    @XmlElement(name = "beenEdited", required = true)
    @FieldName("是否有修改並有query出值 ")
    private boolean beenEdited;

    /** Rldf012dType */
    @XmlElement(name = "entity", required = true)
    @FieldName("rldf012物件 ")
    private Rldf012dType entity;

    /** 發文號不可編輯 */
    @XmlElement(name = "documentNoEditDisabled", required = true)
    @FieldName("發文號不可編輯 ")
    private boolean documentNoEditDisabled = Boolean.TRUE;

    /**
     * @return the documentNoEditDisabled
     */
    public boolean isDocumentNoEditDisabled() {
        // 當 動作模式為A或M ,且點收時間跟點收日期非空值 才可編輯
        if ((StringUtils.equals(RlConstant.STRING_A, option) || StringUtils.equals(RlConstant.STRING_M, option))
                && StringUtils.isNotBlank(acceptYyymmdd) && StringUtils.isNotBlank(acceptHhmmss)) {
            documentNoEditDisabled = Boolean.FALSE;
        } else {
            documentNoEditDisabled = Boolean.TRUE;
        }

        return documentNoEditDisabled;
    }

    /**
     * @param documentNoEditDisabled
     *            the documentNoEditDisabled to set
     */
    public void setDocumentNoEditDisabled(boolean documentNoEditDisabled) {
        this.documentNoEditDisabled = documentNoEditDisabled;
    }

    /**
     * @return the beenEdited
     */
    public boolean isBeenEdited() {
        if (StringUtils.isNotBlank(this.getNo()) && StringUtils.isNotBlank(this.getOption())) {
            beenEdited = Boolean.TRUE;
        } else {
            beenEdited = Boolean.FALSE;
        }
        return beenEdited;
    }

    /**
     * @param beenEdited
     *            the beenEdited to set
     */
    public void setBeenEdited(boolean beenEdited) {
        this.beenEdited = beenEdited;
    }

    /**
     * Default Constructor
     */
    public Rl0f260ResultDTO() {

    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the option
     */
    public String getOption() {
        return option;
    }

    /**
     * @param option
     *            the option to set
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * @return the no
     */
    public String getNo() {
        return no;
    }

    /**
     * @param no
     *            the no to set
     */
    public void setNo(String no) {
        this.no = no;
    }

    /**
     * @return the acceptYyymmdd
     */
    public String getAcceptYyymmdd() {
        return acceptYyymmdd;
    }

    /**
     * @param acceptYyymmdd
     *            the acceptYyymmdd to set
     */
    public void setAcceptYyymmdd(String acceptYyymmdd) {
        this.acceptYyymmdd = acceptYyymmdd;
    }

    /**
     * @return the acceptHhmmss
     */
    public String getAcceptHhmmss() {
        return acceptHhmmss;
    }

    /**
     * @param acceptHhmmss
     *            the acceptHhmmss to set
     */
    public void setAcceptHhmmss(String acceptHhmmss) {
        this.acceptHhmmss = acceptHhmmss;
    }

    /**
     * @return the documentNo
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * @param documentNo
     *            the documentNo to set
     */
    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    /**
     * @return the entity
     */
    public Rldf012dType getEntity() {
        return entity;
    }

    /**
     * @param entity
     *            the entity to set
     */
    public void setEntity(Rldf012dType entity) {
        this.entity = entity;
    }

    /**
     * @return the rowIndex
     */
    public String getRowIndex() {
        return rowIndex;
    }

    /**
     * @param rowIndex
     *            the rowIndex to set
     */
    public void setRowIndex(String rowIndex) {
        this.rowIndex = rowIndex;
    }

}

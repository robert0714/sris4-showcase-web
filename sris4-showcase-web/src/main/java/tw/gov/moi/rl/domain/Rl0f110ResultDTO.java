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

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 空白國民身分證（膠膜）保管人員移交 顯示結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f110ResultDTO", propOrder = { "type", "startNo", "endNo", "qty" })
@XmlRootElement(name = "Rl0f110ResultDTO")
public class Rl0f110ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 起始號碼 */
    @XmlElement(name = "StartNo", required = true)
    @FieldName("起始號碼")
    private String startNo;

    /** 終止號碼 */
    @XmlElement(name = "EndNo", required = true)
    @FieldName("終止號碼")
    private String endNo;

    /** 張數 */
    @XmlElement(name = "Qty", required = true)
    @FieldName("張數")
    private String qty;

    /**
     * Defalut Constructor
     */
    public Rl0f110ResultDTO() {

    }

    /**
     * Constructor
     * 
     * @param type
     * @param startNo
     * @param endNo
     * @param qty
     */
    public Rl0f110ResultDTO(String type, String startNo, String endNo, String qty) {
        super();
        this.type = type;
        this.startNo = startNo;
        this.endNo = endNo;
        this.qty = qty;
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
     * @return the startNo
     */
    public String getStartNo() {
        return startNo;
    }

    /**
     * @param startNo
     *            the startNo to set
     */
    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    /**
     * @return the endNo
     */
    public String getEndNo() {
        return endNo;
    }

    /**
     * @param endNo
     *            the endNo to set
     */
    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty
     *            the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

}

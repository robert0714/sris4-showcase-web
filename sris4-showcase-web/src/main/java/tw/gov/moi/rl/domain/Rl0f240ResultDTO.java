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
 * 空白國民身分證(膠膜)領用登錄顯示結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f240ResultDTO", propOrder = { "startNo", "endNo", "qty" })
@XmlRootElement(name = "Rl0f240ResultDTO")
public class Rl0f240ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 起始號碼 */
    @XmlElement(name = "startNo", required = true)
    @FieldName("起始號碼")
    private String startNo;

    /** 終止號碼 */
    @XmlElement(name = "endNo", required = true)
    @FieldName("終止號碼 ")
    private String endNo;

    /** 張數 */
    @XmlElement(name = "qty", required = true)
    @FieldName("張數")
    private String qty;

    /**
     * Constructor
     */
    public Rl0f240ResultDTO() {

    }

    /**
     * Constructor
     * 
     * @param startNo
     * @param endNo
     * @param qty
     */
    public Rl0f240ResultDTO(final String startNo, final String endNo, final String qty) {
        this.startNo = startNo;
        this.endNo = endNo;
        this.qty = qty;
    }

    /**
     * Constructor
     * 
     * @param startNo
     * @param endNo
     * @param qty
     */
    public Rl0f240ResultDTO(final Integer startNo, final Integer endNo, final Integer qty) {
        this.startNo = String.valueOf(startNo);
        this.endNo = String.valueOf(endNo);
        this.qty = String.valueOf(qty);
    }

    /**
     * Constructor
     * 
     * @param startNo
     * @param endNo
     * @param qty
     */
    public Rl0f240ResultDTO(final Integer startNo, final Integer endNo) {
        this.startNo = String.valueOf(startNo);
        this.endNo = String.valueOf(endNo);
        this.qty = String.valueOf(((endNo - startNo) + 1));
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

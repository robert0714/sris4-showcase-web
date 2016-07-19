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

/**
 * 
 * 空白國民身分證(膠膜)繳回確認顯示結果DTO
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f250ResultDTO", propOrder = { "startNo", "graspName", "endNo", "qty", "option" })
@XmlRootElement(name = "Rl0f250ResultDTO")
public class Rl0f250ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;
    /** 起始號碼 */
    @XmlElement(name = "startNo", required = true)
    private String startNo;

    /** 終止號碼 */
    @XmlElement(name = "endNo", required = true)
    private String endNo;

    /** 領用人員 */
    @XmlElement(name = "graspName", required = true)
    private String graspName;

    /** 張數 */
    @XmlElement(name = "qty", required = true)
    private String qty;

    /** 確認 */
    @XmlElement(name = "option", required = true)
    private String option;

    /**
     * Constructor
     */
    public Rl0f250ResultDTO() {

    }

    /**
     * Parameter Constructor
     * 
     * @param startNo
     * @param endNo
     * @param graspName
     * @param qty
     * @param option
     */
    public Rl0f250ResultDTO(String startNo, String endNo, String graspName, String qty, String option) {
        super();
        this.startNo = startNo;
        this.endNo = endNo;
        this.graspName = graspName;
        this.qty = qty;
        this.option = option;
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
     * @return the graspName
     */
    public String getGraspName() {
        return graspName;
    }

    /**
     * @param graspName
     *            the graspName to set
     */
    public void setGraspName(String graspName) {
        this.graspName = graspName;
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

}

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
 * 空白國民身分證(膠膜)領用確認 顯示結果DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d110ResultDTO", propOrder = { "startNo", "endNo", "qty", "graspYyymmdd", "graspHhmmss", "option" })
@XmlRootElement(name = "Rl0d110ResultDTO")
public class Rl0d110ResultDTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 起始號碼 */
    @XmlElement(name = "startNo", required = true)
    private String startNo;

    /** 終止號碼 */
    @XmlElement(name = "endNo", required = true)
    private String endNo;

    /** 張數 */
    @XmlElement(name = "qty", required = true)
    private String qty;

    /** 領用日期 */
    @XmlElement(name = "graspYyymmdd", required = true)
    private String graspYyymmdd;

    /** 領用時間 */
    @XmlElement(name = "graspHhmmss", required = true)
    private String graspHhmmss;

    /** 確認 */
    @XmlElement(name = "option", required = true)
    private String option;

    public Rl0d110ResultDTO() {

    }

    public Rl0d110ResultDTO(String startNo, String endNo, String qty, String graspYyymmdd, String graspHhmmss,
            String option) {
        super();
        this.startNo = startNo;
        this.endNo = endNo;
        this.qty = qty;
        this.graspYyymmdd = graspYyymmdd;
        this.graspHhmmss = graspHhmmss;
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
     * @return the graspYyymmdd
     */
    public String getGraspYyymmdd() {
        return graspYyymmdd;
    }

    /**
     * @param graspYyymmdd
     *            the graspYyymmdd to set
     */
    public void setGraspYyymmdd(String graspYyymmdd) {
        this.graspYyymmdd = graspYyymmdd;
    }

    /**
     * @return the graspHhmmss
     */
    public String getGraspHhmmss() {
        return graspHhmmss;
    }

    /**
     * @param graspHhmmss
     *            the graspHhmmss to set
     */
    public void setGraspHhmmss(String graspHhmmss) {
        this.graspHhmmss = graspHhmmss;
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

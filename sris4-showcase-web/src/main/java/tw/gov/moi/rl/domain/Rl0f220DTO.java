/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf013dType;

/**
 * 空白國民身分證(膠膜)配賦資料展開 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f220DTO", propOrder = { "type", "ccAssignQty", "ccInstigateQty", "resultList", "selectResultList",
        "detailResult" })
@XmlRootElement(name = "Rl0f220DTO")
public class Rl0f220DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別")
    private String type;

    /** 本月實領數 */
    @XmlElement(name = "ccAssignQty", required = true)
    @FieldName("本月實領數")
    private Integer ccAssignQty;

    /** 本月調撥數 */
    @XmlElement(name = "ccInstigateQty", required = true)
    @FieldName("本月調撥數")
    private Integer ccInstigateQty;

    /** 查詢結果 */
    @XmlElement(name = "resultList", required = true)
    private List<Rldf013dType> resultList;

    /** 被挑選要展開的查詢結果List */
    @XmlElement(name = "selectResultList", required = true)
    private Rldf013dType[] selectResultList;

    /** 被挑選要顯示詳細資訊的資料列 */
    @XmlElement(name = "detailResult", required = true)
    private Rldf013dType detailResult;

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
     * @return the ccAssignQty
     */
    public Integer getCcAssignQty() {
        return ccAssignQty;
    }

    /**
     * @param ccAssignQty
     *            the ccAssignQty to set
     */
    public void setCcAssignQty(Integer ccAssignQty) {
        this.ccAssignQty = ccAssignQty;
    }

    /**
     * @return the ccInstigateQty
     */
    public Integer getCcInstigateQty() {
        return ccInstigateQty;
    }

    /**
     * @param ccInstigateQty
     *            the ccInstigateQty to set
     */
    public void setCcInstigateQty(Integer ccInstigateQty) {
        this.ccInstigateQty = ccInstigateQty;
    }

    /**
     * @return the resultList
     */
    public List<Rldf013dType> getResultList() {
        return resultList;
    }

    /**
     * @param resultList
     *            the resultList to set
     */
    public void setResultList(List<Rldf013dType> resultList) {
        this.resultList = resultList;
    }

    /**
     * @return the selectResultList
     */
    public Rldf013dType[] getSelectResultList() {
        return selectResultList;
    }

    /**
     * @param selectResultList
     *            the selectResultList to set
     */
    public void setSelectResultList(Rldf013dType[] selectResultList) {
        this.selectResultList = selectResultList;
    }

    /**
     * @return the detailResult
     */
    public Rldf013dType getDetailResult() {
        return detailResult;
    }

    /**
     * @param detailResult
     *            the detailResult to set
     */
    public void setDetailResult(Rldf013dType detailResult) {
        this.detailResult = detailResult;
    }

}

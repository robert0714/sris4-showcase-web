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
import tw.gov.moi.domain.Rldf012dType;

/**
 * 空白國民身分證(膠膜)領用登錄DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f240DTO", propOrder = { "type", "graspName", "summaryCount", "rldf012dLockList", "resultShowList",
        "oldType", "oldGraspName", "oldSummaryCount", "rldf012dLockList", "resultShowList", "queryResult" })
@XmlRootElement(name = "Rl0f240DTO")
public class Rl0f240DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 領用人員 */
    @XmlElement(name = "graspName", required = true)
    @FieldName("領用人員")
    private String graspName;

    /** 總張數 */
    @XmlElement(name = "summaryCount", required = true)
    @FieldName("總張數")
    private String summaryCount;

    /** 類別(存放最近一次查詢的條件) */
    @XmlElement(name = "oldType", required = true)
    @FieldName("類別(存放最近一次查詢的條件) ")
    private String oldType;

    /** 領用人員(存放最近一次查詢的條件) */
    @XmlElement(name = "oldGraspName", required = true)
    @FieldName("領用人員(存放最近一次查詢的條件)")
    private String oldGraspName;

    /** 總張數(存放最近一次查詢的條件) */
    @XmlElement(name = "oldSummaryCount", required = true)
    @FieldName("總張數(存放最近一次查詢的條件) ")
    private String oldSummaryCount;

    /** 空白膠膜領用記錄須被lock的清單 */
    @XmlElement(name = "rldf012dLockList", required = true)
    @FieldName("空白膠膜領用記錄須被lock的清單 ")
    private List<Rldf012dType> rldf012dLockList;

    /** 查詢結果 */
    @XmlElement(name = "resultShowList", required = true)
    @FieldName("查詢結果 ")
    private List<Rl0f240ResultDTO> resultShowList;

    /** 查詢結果 */
    @XmlElement(name = "QueryResult", required = true)
    @FieldName("查詢結果 ")
    private List<Rldf012dType> queryResult;

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
     * @return the summaryCount
     */
    public String getSummaryCount() {
        return summaryCount;
    }

    /**
     * @param summaryCount
     *            the summaryCount to set
     */
    public void setSummaryCount(String summaryCount) {
        this.summaryCount = summaryCount;
    }

    /**
     * @return the rldf012dLockList
     */
    public List<Rldf012dType> getRldf012dLockList() {
        return rldf012dLockList;
    }

    /**
     * @param rldf012dLockList
     *            the rldf012dLockList to set
     */
    public void setRldf012dLockList(List<Rldf012dType> rldf012dLockList) {
        this.rldf012dLockList = rldf012dLockList;
    }

    /**
     * @return the resultShowList
     */
    public List<Rl0f240ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0f240ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
    }

    /**
     * @return the oldType
     */
    public String getOldType() {
        return oldType;
    }

    /**
     * @param oldType
     *            the oldType to set
     */
    public void setOldType(String oldType) {
        this.oldType = oldType;
    }

    /**
     * @return the oldGraspName
     */
    public String getOldGraspName() {
        return oldGraspName;
    }

    /**
     * @param oldGraspName
     *            the oldGraspName to set
     */
    public void setOldGraspName(String oldGraspName) {
        this.oldGraspName = oldGraspName;
    }

    /**
     * @return the oldSummaryCount
     */
    public String getOldSummaryCount() {
        return oldSummaryCount;
    }

    /**
     * @param oldSummaryCount
     *            the oldSummaryCount to set
     */
    public void setOldSummaryCount(String oldSummaryCount) {
        this.oldSummaryCount = oldSummaryCount;
    }

    public List<Rldf012dType> getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(List<Rldf012dType> queryResult) {
        this.queryResult = queryResult;
    }

}

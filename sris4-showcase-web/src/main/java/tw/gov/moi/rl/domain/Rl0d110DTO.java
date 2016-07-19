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
 * 
 * 空白國民身分證(膠膜)領用確認 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d110DTO", propOrder = { "type", "rldf012dList", "rldf012dLockList", "resultShowList", "graspName" })
@XmlRootElement(name = "Rl0d110DTO")
public class Rl0d110DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 查詢結果 */
    @XmlElement(name = "rldf012dList", required = true)
    private List<Rldf012dType> rldf012dList;

    /** 須被Lock的Rldf012d清單 */
    @XmlElement(name = "rldf012dLockList", required = true)
    private List<Rldf012dType> rldf012dLockList;

    /** 顯示結果 */
    @XmlElement(name = "resultShowList", required = true)
    private List<Rl0d110ResultDTO> resultShowList;

    /** 領用人員 */
    @XmlElement(name = "graspName", required = true)
    private String graspName;

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
     * @return the rldf012dList
     */
    public List<Rldf012dType> getRldf012dList() {
        return rldf012dList;
    }

    /**
     * @param rldf012dList
     *            the rldf012dList to set
     */
    public void setRldf012dList(List<Rldf012dType> rldf012dList) {
        this.rldf012dList = rldf012dList;
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
    public List<Rl0d110ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0d110ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
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

}

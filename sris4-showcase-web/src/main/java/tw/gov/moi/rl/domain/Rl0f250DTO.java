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
 * 空白國民身分證(膠膜)繳回確認DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f250DTO", propOrder = { "type", "resultShowList", "rldf012dLockList", "rldf012dList" })
@XmlRootElement(name = "Rl0f250DTO")
public class Rl0f250DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 查詢顯示結果 */
    @XmlElement(name = "ResultShowList", required = true)
    @FieldName("查詢顯示結果 ")
    private List<Rl0f250ResultDTO> resultShowList;

    /** 存放Lock後的Rldf012d Entity List */
    @XmlElement(name = "Rldf012dLockList", required = true)
    @FieldName(" 存放Lock後的Rldf012d Entity List")
    private List<Rldf012dType> rldf012dLockList;

    /** Rldf012d Entity List */
    @XmlElement(name = "Rldf012dList", required = true)
    @FieldName("Rldf012d Entity List")
    private List<Rldf012dType> rldf012dList;

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
     * @return the resultShowList
     */
    public List<Rl0f250ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0f250ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
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

    public List<Rldf012dType> getRldf012dList() {
        return rldf012dList;
    }

    public void setRldf012dList(List<Rldf012dType> rldf012dList) {
        this.rldf012dList = rldf012dList;
    }

}

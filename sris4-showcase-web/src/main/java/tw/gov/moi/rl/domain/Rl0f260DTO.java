/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf012dType;

/**
 * 空白國民身分證及膠膜瑕疵退回登錄DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f260DTO", propOrder = { "type", "resultShowList", "verifiedKeyList", "rldf012dLockList",
        "resultMap" })
@XmlRootElement(name = "Rl0f260DTO")
public class Rl0f260DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 查詢顯示結果 */
    @XmlElement(name = "resultShowList", required = true)
    @FieldName("查詢顯示結果 ")
    private List<Rl0f260ResultDTO> resultShowList;

    /** 被驗證後的資料列的鍵值 */
    @XmlElement(name = "verifiedKeyList", required = true)
    @FieldName("被驗證後的資料列的鍵值")
    private List<String> verifiedKeyList = new ArrayList<String>();

    /** 驗證後且鎖定的結果 */
    @XmlElement(name = "rldf012dLockList", required = true)
    @FieldName("查詢顯示結果 ")
    private List<Rldf012dType> rldf012dLockList;

    /** 欲鎖定的資料. */
    @XmlElement(name = "ResultMap", required = true)
    @FieldName("欲鎖定的資料 ")
    private Map<String, Rldf012dType> resultMap;

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
    public List<Rl0f260ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0f260ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
    }

    /**
     * @return the verifiedKeyList
     */
    public List<String> getVerifiedKeyList() {
        return verifiedKeyList;
    }

    /**
     * @param verifiedKeyList
     *            the verifiedKeyList to set
     */
    public void setVerifiedKeyList(List<String> verifiedKeyList) {
        this.verifiedKeyList = verifiedKeyList;
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

    public Map<String, Rldf012dType> getResultMap() {
        return resultMap;
    }

    public void setResultMap(Map<String, Rldf012dType> resultMap) {
        this.resultMap = resultMap;
    }

}

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
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rldf012dType;

/**
 * 空白國民身分證及膠膜瑕疵退回確認及通報 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f130DTO", propOrder = { "type", "resultShowList", "rldf012dLockList", "rrdf006yList",
        "selectedRl0f130ResultDTOs", "resultList" })
@XmlRootElement(name = "Rl0f130DTO")
public class Rl0f130DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "type", required = true)
    @FieldName("類別 ")
    private String type;

    /** 查詢顯示結果 */
    @XmlElement(name = "resultShowList", required = true)
    @FieldName(" 查詢顯示結果 ")
    private List<Rl0f130ResultDTO> resultShowList;

    /** Lock Obj List */
    @XmlElement(name = "rldf012dLockList", required = true)
    @FieldName(" lock結果 ")
    private List<Rldf012dType> rldf012dLockList;

    /** 被挑選的查詢結果List */
    @XmlElement(name = "rl0f130ResultDTOs")
    @FieldName("被挑選的查詢結果List")
    private Rl0f130ResultDTO[] selectedRl0f130ResultDTOs;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<SelectEntity<Rldf012dType>> resultList;

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
    public List<Rl0f130ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0f130ResultDTO> resultShowList) {
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

    public Rl0f130ResultDTO[] getSelectedRl0f130ResultDTOs() {
        return selectedRl0f130ResultDTOs;
    }

    public void setSelectedRl0f130ResultDTOs(Rl0f130ResultDTO[] selectedRl0f130ResultDTOs) {
        this.selectedRl0f130ResultDTOs = selectedRl0f130ResultDTOs;
    }

    public List<SelectEntity<Rldf012dType>> getResultList() {
        return resultList;
    }

    public void setResultList(List<SelectEntity<Rldf012dType>> resultList) {
        this.resultList = resultList;
    }
}

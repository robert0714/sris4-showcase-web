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

import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 遷入地除口資料DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlMoveinDataResultDTO", propOrder = { "rldf004mList", "rldf004hList", "rldf001mList" })
@XmlRootElement(name = "RlMoveinDataResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlMoveinDataResultDTO implements Serializable {

    public RlMoveinDataResultDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * serail Id
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Rldf004mList", required = false)
    private List<Rldf004mType> rldf004mList;

    @XmlElement(name = "Rldf004hList", required = false)
    private List<Rldf004hType> rldf004hList;

    @XmlElement(name = "Rldf001mList", required = false)
    private List<Rldf001mType> rldf001mList;

    /**
     * @return the rldf004mList
     */
    public List<Rldf004mType> getRldf004mList() {
        return rldf004mList;
    }

    /**
     * @param rldf004mList
     *            the rldf004mList to set
     */
    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    /**
     * @return the rldf004hList
     */
    public List<Rldf004hType> getRldf004hList() {
        return rldf004hList;
    }

    /**
     * @param rldf004hList
     *            the rldf004hList to set
     */
    public void setRldf004hList(List<Rldf004hType> rldf004hList) {
        this.rldf004hList = rldf004hList;
    }

    /**
     * @return the rldf001mList
     */
    public List<Rldf001mType> getRldf001mList() {
        return rldf001mList;
    }

    /**
     * @param rldf001mList
     *            the rldf001mList to set
     */
    public void setRldf001mList(List<Rldf001mType> rldf001mList) {
        this.rldf001mList = rldf001mList;
    }

}

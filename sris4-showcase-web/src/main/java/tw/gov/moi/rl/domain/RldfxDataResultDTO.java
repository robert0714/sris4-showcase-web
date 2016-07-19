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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class RldfxDataResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldfxDataResultDTO", propOrder = { "rldfxDataList" })
@XmlRootElement(name = "RldfxDataResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RldfxDataResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -910087388991688886L;

    /** 全戶記事欄位化清單. */
    @XmlElement(name = "RldfxDataList")
    @FieldName("全戶記事欄位化清單")
    private List<Object> rldfxDataList = new ArrayList<Object>();

    /**
     * Gets the rldfx data list.
     * 
     * @return the rldfx data list
     */
    public List<Object> getRldfxDataList() {
        return rldfxDataList;
    }

    /**
     * Sets the rldfx data list.
     * 
     * @param rldfxDataList
     *            the new rldfx data list
     */
    public void setRldfxDataList(final List<Object> rldfxDataList) {
        this.rldfxDataList = rldfxDataList;
    }
}

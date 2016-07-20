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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 總筆數DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlCountDTO", propOrder = { "count" })
@XmlRootElement(name = "RlCountDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlCountDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 總筆數 */
    @XmlElement(name = "Count", required = true)
    @FieldName("總筆數")
    private int count;

    public RlCountDTO() {
        super();
    }

    public RlCountDTO(final int count) {
        super();
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

}
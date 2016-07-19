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
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlEntityUtilResultDTO", propOrder = { "result" })
@XmlRootElement(name = "RlEntityUtilResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlEntityUtilResultDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Result", required = false)
    @FieldName("查詢結果")
    private String result;

    public RlEntityUtilResultDTO(String result) {
        super();
        this.result = result;
    }

    public RlEntityUtilResultDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     *            the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

}

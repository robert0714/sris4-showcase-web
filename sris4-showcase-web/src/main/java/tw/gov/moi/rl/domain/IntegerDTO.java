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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "integerDTO", propOrder = { "returnVal" })
@XmlRootElement(name = "IntegerDTO")
public class IntegerDTO implements Serializable {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1619484991781886105L;

    /** The true or false. */
    @FieldName("回傳值")
    private Integer returnVal;

    public IntegerDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public IntegerDTO(Integer returnVal) {
        super();
        this.returnVal = returnVal;
    }

    /**
     * @return the returnVal
     */
    public Integer getReturnVal() {
        return returnVal;
    }

    /**
     * @param returnVal
     *            the returnVal to set
     */
    public void setReturnVal(Integer returnVal) {
        this.returnVal = returnVal;
    }

}

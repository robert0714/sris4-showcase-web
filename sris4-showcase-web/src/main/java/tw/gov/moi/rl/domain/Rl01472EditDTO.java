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
import tw.gov.moi.domain.Rldf050mType;

/**
 * The Class Rl01472EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01472EditDTO", propOrder = { "rldf050mObj" })
@XmlRootElement(name = "Rl01472EditDTO")
public class Rl01472EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Rldf050m */
    @XmlElement(name = "Rldf050mObj", required = true)
    @FieldName("Rldf050m")
    private Rldf050mType rldf050mObj;

    public Rldf050mType getRldf050mObj() {
        return rldf050mObj;
    }

    public void setRldf050mObj(Rldf050mType rldf050mObj) {
        this.rldf050mObj = rldf050mObj;
    }

}

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
import tw.gov.moi.domain.Rldf045mType;

/**
 * The Class Rl01464QueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01464QueryDTO", propOrder = { "IsDelete", "Data" })
@XmlRootElement(name = "Rl01464QueryDTO")
public class Rl01464QueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Rldf045m資料 */
    @XmlElement(name = "Data", required = true)
    @FieldName("Rldf045m資料")
    private Rldf045mType data;

    public Rldf045mType getData() {
        return data;
    }

    public void setData(final Rldf045mType data) {
        this.data = data;
    }

}

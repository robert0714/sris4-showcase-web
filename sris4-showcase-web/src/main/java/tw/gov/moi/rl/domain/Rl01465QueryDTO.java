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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01465QueryDTO", propOrder = { "data" })
@XmlRootElement(name = "Rl01465QueryDTO")
public class Rl01465QueryDTO implements Serializable {

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

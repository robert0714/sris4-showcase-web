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

/**
 * The Class Rl02300PrintDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02300PrintDTO", propOrder = { "Value1", "Value2", "Value3", "Value4", "Value5", "Value6" })
@XmlRootElement(name = "Rl02300PrintDTO")
public class Rl02300PrintDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 字串1 */
    @XmlElement(name = "Value1")
    @FieldName("字串1")
    private String value1 = "";

    /** 字串2 */
    @XmlElement(name = "Value2")
    @FieldName("字串2")
    private String value2 = "";

    /** 字串3 */
    @XmlElement(name = "Value3")
    @FieldName("字串3")
    private String value3 = "";

    /** 字串4 */
    @XmlElement(name = "Value4")
    @FieldName("字串4")
    private String value4 = "";

    /** 字串5 */
    @XmlElement(name = "Value5")
    @FieldName("字串5")
    private String value5 = "";

    /** 字串6 */
    @XmlElement(name = "Value6")
    @FieldName("字串6")
    private String value6 = "";

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

}

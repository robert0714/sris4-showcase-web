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
 * The Class Rl0f230SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0f230SaveDTO", propOrder = { "StartNo1", "EndNo1", "StartNo2", "EndNo2" })
@XmlRootElement(name = "Rl0f230SaveDTO")
public class Rl0f230SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號-左 */
    @XmlElement(name = "StartIndex1", required = true)
    @FieldName("起始編號-左")
    private String startIndex1;

    /** 起始編號-左 */
    @XmlElement(name = "StartNo1", required = true)
    @FieldName("起始編號-左")
    private String startNo1;

    /** 結束編號-左 */
    @XmlElement(name = "EndNo1", required = true)
    @FieldName("結束編號-左")
    private String endNo1;

    /** 序號-右 */
    @XmlElement(name = "StartIndex2", required = true)
    @FieldName("起始編號-左")
    private String startIndex2;

    /** 起始編號-右 */
    @XmlElement(name = "StartNo2", required = true)
    @FieldName("起始編號-右")
    private String startNo2;

    /** 結束編號-右 */
    @XmlElement(name = "EndNo2", required = true)
    @FieldName("結束編號-右")
    private String endNo2;

    public String getStartNo1() {
        return startNo1;
    }

    public void setStartNo1(final String startNo1) {
        this.startNo1 = startNo1;
    }

    public String getEndNo1() {
        return endNo1;
    }

    public void setEndNo1(final String endNo1) {
        this.endNo1 = endNo1;
    }

    public String getStartNo2() {
        return startNo2;
    }

    public void setStartNo2(final String startNo2) {
        this.startNo2 = startNo2;
    }

    public String getEndNo2() {
        return endNo2;
    }

    public void setEndNo2(final String endNo2) {
        this.endNo2 = endNo2;
    }

    public String getStartIndex1() {
        return startIndex1;
    }

    public void setStartIndex1(String startIndex1) {
        this.startIndex1 = startIndex1;
    }

    public String getStartIndex2() {
        return startIndex2;
    }

    public void setStartIndex2(String startIndex2) {
        this.startIndex2 = startIndex2;
    }

}

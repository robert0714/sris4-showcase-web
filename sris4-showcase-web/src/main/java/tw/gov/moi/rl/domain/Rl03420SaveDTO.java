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
import tw.gov.moi.domain.Rldfj001Type;

/**
 * The Class Rl03420SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl03420SaveDTO", propOrder = { "Rldfj001Obj", "IsMonthLastDay", "IsMonthLastWeek" })
@XmlRootElement(name = "Rl03420SaveDTO")
public class Rl03420SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** rldfj001 Object */
    @XmlElement(name = "Rldfj001Obj", required = true)
    @FieldName("rldfj001 Object")
    private Rldfj001Type rldfj001Obj;

    /** 月份最後一天 */
    @XmlElement(name = "IsMonthLastDay", required = true)
    @FieldName("月份最後一天")
    private String isMonthLastDay;

    /** 月份最後一個星期 */
    @XmlElement(name = "IsMonthLastWeek", required = true)
    @FieldName("星期最後一天")
    private String isMonthLastWeek;

    /** 狀態 */
    @XmlElement(name = "Status", required = true)
    @FieldName("狀態")
    private String status;

    public Rldfj001Type getRldfj001Obj() {
        return rldfj001Obj;
    }

    public void setRldfj001Obj(final Rldfj001Type rldfj001Obj) {
        this.rldfj001Obj = rldfj001Obj;
    }

    public String getIsMonthLastDay() {
        return isMonthLastDay;
    }

    public void setIsMonthLastDay(final String isMonthLastDay) {
        this.isMonthLastDay = isMonthLastDay;
    }

    public String getIsMonthLastWeek() {
        return isMonthLastWeek;
    }

    public void setIsMonthLastWeek(final String isMonthLastWeek) {
        this.isMonthLastWeek = isMonthLastWeek;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

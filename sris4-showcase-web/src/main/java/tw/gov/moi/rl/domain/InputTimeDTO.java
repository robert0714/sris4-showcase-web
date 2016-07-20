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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class InputTimeDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputTimeDTO", propOrder = { "hour", "minute", "second" })
public class InputTimeDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2290558283689037499L;

    /** 時. */
    @XmlElement(name = "Hour", required = true)
    @FieldName("時")
    private String hour;

    /** 分. */
    @XmlElement(name = "Minute", required = true)
    @FieldName("分")
    private String minute;

    /** 秒. */
    @XmlElement(name = "Second", required = true)
    @FieldName("秒")
    private String second;

    /**
     * Gets the hour.
     * 
     * @return the hour
     */
    public String getHour() {
        return hour;
    }

    /**
     * Sets the hour.
     * 
     * @param hour
     *            the new hour
     */
    public void setHour(final String hour) {
        this.hour = hour;
    }

    /**
     * Gets the minute.
     * 
     * @return the minute
     */
    public String getMinute() {
        return minute;
    }

    /**
     * Sets the minute.
     * 
     * @param minute
     *            the new minute
     */
    public void setMinute(final String minute) {
        this.minute = minute;
    }

    /**
     * Gets the second.
     * 
     * @return the second
     */
    public String getSecond() {
        return second;
    }

    /**
     * Sets the second.
     * 
     * @param second
     *            the new second
     */
    public void setSecond(final String second) {
        this.second = second;
    }
}

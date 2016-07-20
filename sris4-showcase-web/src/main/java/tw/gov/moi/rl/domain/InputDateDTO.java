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
 * The Class InputDateDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputDateDTO", propOrder = { "year", "month", "day" })
public class InputDateDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5749513051363482050L;

    /** 年. */
    @XmlElement(name = "Year", required = true)
    @FieldName("時")
    private String year;

    /** 月. */
    @XmlElement(name = "Month", required = true)
    @FieldName("月")
    private String month;

    /** 日. */
    @XmlElement(name = "Day", required = true)
    @FieldName("日")
    private String day;

    /**
     * Gets the year.
     * 
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the year.
     * 
     * @param year
     *            the new year
     */
    public void setYear(final String year) {
        this.year = year;
    }

    /**
     * Gets the month.
     * 
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the month.
     * 
     * @param month
     *            the new month
     */
    public void setMonth(final String month) {
        this.month = month;
    }

    /**
     * Gets the day.
     * 
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the day.
     * 
     * @param day
     *            the new day
     */
    public void setDay(final String day) {
        this.day = day;
    }
}

/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
 * The Class Rl08171DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08171DTO", propOrder = { "dataYear" })
@XmlRootElement(name = "Rl08171DTO")
public class Rl08171DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計年度. */
    @XmlElement(name = "DataYear")
    @FieldName("統計年度")
    private String dataYear;

    /**
     * Gets the data year.
     * 
     * @return the data year
     */
    public String getDataYear() {
        return dataYear;
    }

    /**
     * Sets the data year.
     * 
     * @param dataYear
     *            the new data year
     */
    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }
}

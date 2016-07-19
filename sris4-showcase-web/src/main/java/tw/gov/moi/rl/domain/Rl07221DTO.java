/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶口校正資料登錄(新增)處理.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07221DTO", propOrder = { "correctYear", "correctVillage", "correctNeighbor", "rl07221ResultDTOs",
        "rl07221VerifyResultDTOList" })
@XmlRootElement(name = "Rl07221DTO")
public class Rl07221DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 校正年分. */
    @XmlElement(name = "CorrectYear")
    @FieldName("校正年分")
    private String correctYear;

    /** 校正村里. */
    @XmlElement(name = "CorrectVillage")
    @FieldName("校正村里")
    private String correctVillage;

    /** 校正鄰. */
    @XmlElement(name = "CorrectNeighbor")
    @FieldName("校正鄰")
    private String correctNeighbor;

    /** The rl07221 rl07221ResultDTOs. */
    @XmlElement(name = "Rl07221ResultDTOs")
    @FieldName("rl07221ResultDTOs")
    private List<Rl07221ResultDTO> rl07221ResultDTOs;

    /** The rl07221 rl07221VerifyResultDTOList. */
    @XmlElement(name = "Rl07221VerifyResultDTOList")
    @FieldName("rl07221VerifyResultDTOList")
    private List<Rl07221ResultDTO> rl07221VerifyResultDTOList;

    /**
     * Gets the correct year.
     * 
     * @return the correct year
     */
    public String getCorrectYear() {
        return correctYear;
    }

    /**
     * Sets the correct year.
     * 
     * @param correctYear
     *            the new correct year
     */
    public void setCorrectYear(final String correctYear) {
        this.correctYear = correctYear;
    }

    /**
     * Gets the correct village.
     * 
     * @return the correct village
     */
    public String getCorrectVillage() {
        return correctVillage;
    }

    /**
     * Sets the correct village.
     * 
     * @param correctVillage
     *            the new correct village
     */
    public void setCorrectVillage(final String correctVillage) {
        this.correctVillage = correctVillage;
    }

    /**
     * Gets the correct neighbor.
     * 
     * @return the correct neighbor
     */
    public String getCorrectNeighbor() {
        return correctNeighbor;
    }

    /**
     * Sets the correct neighbor.
     * 
     * @param correctNeighbor
     *            the new correct neighbor
     */
    public void setCorrectNeighbor(final String correctNeighbor) {
        this.correctNeighbor = correctNeighbor;
    }

    /**
     * Gets the rl07221 result dt os.
     * 
     * @return the rl07221 result dt os
     */
    public List<Rl07221ResultDTO> getRl07221ResultDTOs() {
        return rl07221ResultDTOs;
    }

    /**
     * Sets the rl07221 result dt os.
     * 
     * @param rl07221ResultDTOs
     *            the new rl07221 result dt os
     */
    public void setRl07221ResultDTOs(final List<Rl07221ResultDTO> rl07221ResultDTOs) {
        this.rl07221ResultDTOs = rl07221ResultDTOs;
    }

    /**
     * Gets the rl07221 verify result dto list.
     * 
     * @return the rl07221 verify result dto list
     */
    public List<Rl07221ResultDTO> getRl07221VerifyResultDTOList() {
        return rl07221VerifyResultDTOList;
    }

    /**
     * Sets the rl07221 verify result dto list.
     * 
     * @param rl07221VerifyResultDTOList
     *            the new rl07221 verify result dto list
     */
    public void setRl07221VerifyResultDTOList(List<Rl07221ResultDTO> rl07221VerifyResultDTOList) {
        this.rl07221VerifyResultDTOList = rl07221VerifyResultDTOList;
    }

}

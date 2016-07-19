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
 * 全面換證統計表DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0v700ResultDTO", propOrder = { "village", "neighbor", "personId", "idCardApplyYyymmdd",
        "idCardApplyCode", "specialMark", "processMark" })
@XmlRootElement(name = "Rl0v700ResultDTO")
public class Rl0v700ResultDTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 領補換日期. */
    @XmlElement(name = "IdCardApplyYyymmdd")
    @FieldName("領補換日期")
    private String idCardApplyYyymmdd = "";

    /** 領補換代碼. */
    @XmlElement(name = "IdCardApplyCode")
    @FieldName("領補換代碼")
    private String idCardApplyCode = "";

    /** 特殊註記. */
    @XmlElement(name = "SpecialMark")
    @FieldName("特殊註記")
    private String specialMark = "";

    /** 製程註記代碼. */
    @XmlElement(name = "ProcessMark")
    @FieldName("製程註記代碼")
    private String processMark = "";

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the id card apply yyymmdd.
     * 
     * @return the id card apply yyymmdd
     */
    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    /**
     * Sets the id card apply yyymmdd.
     * 
     * @param idCardApplyYyymmdd
     *            the new id card apply yyymmdd
     */
    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    /**
     * Gets the id card apply code.
     * 
     * @return the id card apply code
     */
    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    /**
     * Sets the id card apply code.
     * 
     * @param idCardApplyCode
     *            the new id card apply code
     */
    public void setIdCardApplyCode(final String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    /**
     * Gets the special mark.
     * 
     * @return the special mark
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /**
     * Sets the special mark.
     * 
     * @param specialMark
     *            the new special mark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /**
     * Gets the process mark.
     * 
     * @return the process mark
     */
    public String getProcessMark() {
        return processMark;
    }

    /**
     * Sets the process mark.
     * 
     * @param processMark
     *            the new process mark
     */
    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl0v700ResultDTO [village=" + village + ", neighbor=" + neighbor + ", personId=" + personId
                + ", idCardApplyYyymmdd=" + idCardApplyYyymmdd + ", specialMark=" + specialMark + ", processMark="
                + processMark + "]";
    }
}

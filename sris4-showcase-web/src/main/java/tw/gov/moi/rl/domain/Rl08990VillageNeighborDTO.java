/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08990VillageNeighborDTO.
 */
public class Rl08990VillageNeighborDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1321139563521145444L;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 起始鄰. */
    @XmlElement(name = "StartNeighbor")
    @FieldName("起始鄰")
    private String startNeighbor;

    /** 終止鄰. */
    @XmlElement(name = "EndNeighbor")
    @FieldName("終止條件")
    private String endNeighbor;

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
     * Gets the start neighbor.
     * 
     * @return the start neighbor
     */
    public String getStartNeighbor() {
        return startNeighbor;
    }

    /**
     * Sets the start neighbor.
     * 
     * @param startNeighbor
     *            the new start neighbor
     */
    public void setStartNeighbor(String startNeighbor) {
        this.startNeighbor = startNeighbor;
    }

    /**
     * Gets the end neighbor.
     * 
     * @return the end neighbor
     */
    public String getEndNeighbor() {
        return endNeighbor;
    }

    /**
     * Sets the end neighbor.
     * 
     * @param endNeighbor
     *            the new end neighbor
     */
    public void setEndNeighbor(String endNeighbor) {
        this.endNeighbor = endNeighbor;
    }
}

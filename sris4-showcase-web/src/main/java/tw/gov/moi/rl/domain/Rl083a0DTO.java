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
import tw.gov.moi.domain.Rldf034mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl083a0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl083a0DTO", propOrder = { "village", "neighbor", "changeType", "saveEnable", "rldf034mType" })
@XmlRootElement(name = "Rl083a0DTO")
public class Rl083a0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 9208403067741916243L;

    /** 村里名稱. */
    @XmlElement(name = "Village")
    @FieldName("村里名稱")
    private String village;

    /** 鄰數. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰數")
    private String neighbor;

    /** 異動模式. */
    @XmlElement(name = "ChangeType")
    @FieldName("異動模式")
    private String changeType ;

    /** The save enable. */
    @XmlElement(name = "SaveEnable")
    @FieldName("存檔旗標")
    private boolean saveEnable = false;

    /** 年終靜態鄰數資料. */
    @XmlElement(name = "Rldf034mType")
    @FieldName("年終靜態鄰數資料")
    private Rldf034mType rldf034mType;

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
    public void setVillage(final String village) {
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
    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the change type.
     * 
     * @return the change type
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the change type.
     * 
     * @param changeType
     *            the new change type
     */
    public void setChangeType(final String changeType) {
        this.changeType = changeType;
    }

    /**
     * Checks if is save enable.
     * 
     * @return true, if is save enable
     */
    public boolean isSaveEnable() {
        return saveEnable;
    }

    /**
     * Sets the save enable.
     * 
     * @param saveEnable
     *            the new save enable
     */
    public void setSaveEnable(final boolean saveEnable) {
        this.saveEnable = saveEnable;
    }

    /**
     * Gets the rldf034m type.
     * 
     * @return the rldf034m type
     */
    public Rldf034mType getRldf034mType() {
        return rldf034mType;
    }

    /**
     * Sets the rldf034m type.
     * 
     * @param rldf034mType
     *            the new rldf034m type
     */
    public void setRldf034mType(final Rldf034mType rldf034mType) {
        this.rldf034mType = rldf034mType;
    }
}

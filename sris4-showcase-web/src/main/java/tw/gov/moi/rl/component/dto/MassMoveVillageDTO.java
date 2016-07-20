/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "massMoveVillageDTO", propOrder = { "oldVillage", "newVillage", "oldSiteId", "newSiteId", "maleCount",
        "femaleCount" })
@XmlRootElement(name = "MassMoveVillageDTO")
public class MassMoveVillageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 舊的村里名稱 */
    @XmlElement(name = "OldVillage", required = true)
    @FieldName("舊的村里名稱")
    private String oldVillage;

    /** 舊的作業點代碼 */
    @XmlElement(name = "OldSiteId", required = true)
    @FieldName("舊的作業點代碼")
    private String oldSiteId;

    /** 新的村里名稱 */
    @XmlElement(name = "NewVillage", required = true)
    @FieldName("新的村里名稱")
    private String newVillage;

    /** 新的作業點代碼 */
    @XmlElement(name = "NewSiteId", required = true)
    @FieldName("新的作業點代碼")
    private String newSiteId;

    /** 男生人數 */
    @XmlElement(name = "MaleCount", required = true)
    @FieldName(" 男生人數")
    private Integer maleCount = 0;

    /** 女生人數 */
    @XmlElement(name = "FemaleCount", required = true)
    @FieldName("女生人數")
    private Integer femaleCount = 0;

    public MassMoveVillageDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MassMoveVillageDTO(String oldVillage, String newVillage) {
        super();
        this.oldVillage = oldVillage;
        this.newVillage = newVillage;
    }

    /**
     * @return the oldVillage
     */
    public String getOldVillage() {
        return oldVillage;
    }

    /**
     * @param oldVillage
     *            the oldVillage to set
     */
    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    /**
     * @return the newVillage
     */
    public String getNewVillage() {
        return newVillage;
    }

    /**
     * @param newVillage
     *            the newVillage to set
     */
    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    /**
     * @return the maleCount
     */
    public Integer getMaleCount() {
        return maleCount;
    }

    /**
     * @param maleCount
     *            the maleCount to set
     */
    public void setMaleCount(Integer maleCount) {
        this.maleCount = maleCount;
    }

    /**
     * @return the femaleCount
     */
    public Integer getFemaleCount() {
        return femaleCount;
    }

    /**
     * @param femaleCount
     *            the femaleCount to set
     */
    public void setFemaleCount(Integer femaleCount) {
        this.femaleCount = femaleCount;
    }

    /**
     * @return the oldSiteId
     */
    public String getOldSiteId() {
        return oldSiteId;
    }

    /**
     * @param oldSiteId
     *            the oldSiteId to set
     */
    public void setOldSiteId(String oldSiteId) {
        this.oldSiteId = oldSiteId;
    }

    /**
     * @return the newSiteId
     */
    public String getNewSiteId() {
        return newSiteId;
    }

    /**
     * @param newSiteId
     *            the newSiteId to set
     */
    public void setNewSiteId(String newSiteId) {
        this.newSiteId = newSiteId;
    }

}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf049mType;

/**
 * The Class Rl01b20DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01b20DTO", propOrder = { "victimId", "victimRldf004m", "victimSettleSiteId", "violatorId",
        "violatorSettleSiteId", "beginYyymmdd", "endYyymmdd", "rldf049mTypes", "noEndYyymmdd" })
@XmlRootElement(name = "Rl01b20DTO")
public class Rl01b20DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4624288094945054700L;

    /** 被保護人統號. */
    @XmlElement(name = "VictimId")
    @FieldName("被保護人統號") 
    private String victimId;

    /** 被保護人個人基本資料. */
    @XmlElement(name = "VictimRldf004m")
    @FieldName("被保護人個人基本資料") 
    private Rldf004mType victimRldf004m;

    /** 被保護人作業點代碼. */
    @XmlElement(name = "VictimSettleSiteId")
    @FieldName("被保護人作業點代碼") 
    private String victimSettleSiteId;

    /** 相對人統號. */
    @XmlElement(name = "ViolatorId")
    @FieldName("相對人統號") 
    private String violatorId;

    /** 保護令起始日期. */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("保護令起始日期") 
    private String beginYyymmdd;

    /** 保護令終止日期. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("保護令終止日期") 
    private String endYyymmdd;

    /** The rldf049m types. */
    @XmlElement(name = "Rldf049mTypes")
    @FieldName("被保護人家暴資料List") 
    private List<Rldf049mType> rldf049mTypes = new ArrayList<Rldf049mType>();

    /** The rldf049m type. */
    @XmlElement(name = "Rldf049mType")
    @FieldName("被保護人家暴資料") 
    private Rldf049mType rldf049mType;

    /** 無保護令到期日. */
    @XmlElement(name = "noEndYyymmdd")
    @FieldName("無保護令到期日")
    private boolean noEndYyymmdd = false;
    
    /**
     * Gets the victim id.
     * 
     * @return the victim id
     */
    public String getVictimId() {
        return victimId;
    }

    /**
     * Sets the victim id.
     * 
     * @param victimId
     *            the new victim id
     */
    public void setVictimId(final String victimId) {
        this.victimId = victimId;
    }

    /**
     * Gets the victim rldf004m.
     * 
     * @return the victim rldf004m
     */
    public Rldf004mType getVictimRldf004m() {
        return victimRldf004m;
    }

    /**
     * Sets the victim rldf004m.
     * 
     * @param victimRldf004m
     *            the new victim rldf004m
     */
    public void setVictimRldf004m(final Rldf004mType victimRldf004m) {
        this.victimRldf004m = victimRldf004m;
    }

    /**
     * Gets the victim settle site id.
     * 
     * @return the victim settle site id
     */
    public String getVictimSettleSiteId() {
        return victimSettleSiteId;
    }

    /**
     * Sets the victim settle site id.
     * 
     * @param victimSettleSiteId
     *            the new victim settle site id
     */
    public void setVictimSettleSiteId(final String victimSettleSiteId) {
        this.victimSettleSiteId = victimSettleSiteId;
    }

    /**
     * Gets the violator id.
     * 
     * @return the violator id
     */
    public String getViolatorId() {
        return violatorId;
    }

    /**
     * Sets the violator id.
     * 
     * @param violatorId
     *            the new violator id
     */
    public void setViolatorId(final String violatorId) {
        this.violatorId = violatorId;
    }

    /**
     * Gets the begin yyymmdd.
     * 
     * @return the begin yyymmdd
     */
    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    /**
     * Sets the begin yyymmdd.
     * 
     * @param beginYyymmdd
     *            the new begin yyymmdd
     */
    public void setBeginYyymmdd(final String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    /**
     * Gets the end yyymmdd.
     * 
     * @return the end yyymmdd
     */
    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    /**
     * Sets the end yyymmdd.
     * 
     * @param endYyymmdd
     *            the new end yyymmdd
     */
    public void setEndYyymmdd(final String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    /**
     * Gets the rldf049m types.
     * 
     * @return the rldf049m types
     */
    public List<Rldf049mType> getRldf049mTypes() {
        return rldf049mTypes;
    }

    /**
     * Sets the rldf049m types.
     * 
     * @param rldf049mTypes
     *            the new rldf049m types
     */
    public void setRldf049mTypes(final List<Rldf049mType> rldf049mTypes) {
        this.rldf049mTypes = rldf049mTypes;
    }

    /**
     * Gets the rldf049m type.
     * 
     * @return the rldf049m type
     */
    public Rldf049mType getRldf049mType() {
        return rldf049mType;
    }

    /**
     * Sets the rldf049m type.
     * 
     * @param rldf049mType
     *            the new rldf049m type
     */
    public void setRldf049mType(final Rldf049mType rldf049mType) {
        this.rldf049mType = rldf049mType;
    }
    
    /**
     * Checks NoEndYyymmdd.
     * 
     * @return false, noEndYyymmdd
     */
    public boolean isNoEndYyymmdd() {
        return noEndYyymmdd;
    }

    /**
     * Sets the noEndYyymmdd.
     * 
     * @param noEndYyymmdd
     *            the new noEndYyymmdd
     */
    public void setNoEndYyymmdd(final boolean noEndYyymmdd) {
        this.noEndYyymmdd = noEndYyymmdd;
    }
}

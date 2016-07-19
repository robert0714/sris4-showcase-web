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
 * The Class Rl01b30DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01b30DTO", propOrder = { "victimId", "VictimRldf004m", "victimSettleSiteId","violatorId", "rldf049mTypeList" })
@XmlRootElement(name = "Rl01b30DTO")
public class Rl01b30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1802213378375534151L;

    /** 被害保護人統號. */
    @XmlElement(name = "VictimId")
    @FieldName("被害保護人統號")
    private String victimId;

    /** 被保護人姓名. */
    @XmlElement(name = "VictimName")
    @FieldName("被保護人姓名")
    private String victimName = "";
   
    /** 被保護人作業點代碼. */
    @XmlElement(name = "VictimSiteId")
    @FieldName("被保護人作業點代碼")
    private String victimSiteId = "";

    /** 被保護人個人基本資料. */
    @XmlElement(name = "VictimRldf004m")
    @FieldName("被保護人個人基本資料")
    private Rldf004mType victimRldf004m;
    
    /** 相對人統號. */
    @XmlElement(name = "ViolatorId")
    @FieldName("相對人統號")
    private String violatorId;

//    /** 申請日期. */
//    @XmlElement(name = "RegisterYyymmdd")
//    @FieldName("申請日期")
//    private String registerYyymmdd = "";
//
//    /** 保護令起始日期. */
//    @XmlElement(name = "BeginYyymmdd")
//    @FieldName("保護令起始日期")
//    private String beginYyymmdd = "";
//
//    /** 保護令終止日期. */
//    @XmlElement(name = "EndYyymmdd")
//    @FieldName("保護令終止日期")
//    private String endYyymmdd = "";
//
//    /** 結案日期. */
//    @XmlElement(name = "CloseYyymmdd")
//    @FieldName("結案日期")
//    private String closeYyymmdd = "";

//    /** 結案戶所代碼. */
//    @XmlElement(name = "CloseSiteId")
//    @FieldName("結案戶所代碼")
//    private String closeSiteId = "";
//
//    /** 結案戶籍員姓名. */
//    @XmlElement(name = "CloseName")
//    @FieldName("結案戶籍員姓名")
//    private String closeName = "";
    
    /** The rldf049m type list. */
    @XmlElement(name = "Rldf049mTypeList")
    @FieldName("被保護人家暴資料List")
    private List<Rldf049mType> rldf049mTypeList = new ArrayList<Rldf049mType>();

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
     * Gets the victim name.
     * 
     * @return the victim name
     */
    public String getVictimName() {
        return victimName;
    }

    /**
     * Sets the victim name.
     * 
     * @param victimName
     *            the new victim name
     */
    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }
  
    /**
     * Gets the victim site id.
     * 
     * @return the victim site id
     */
    public String getVictimSiteId() {
        return victimSiteId;
    }

    /**
     * Sets the victim site id.
     * 
     * @param victimSiteId
     *            the new victim site id
     */
    public void setVictimSiteId(String victimSiteId) {
        this.victimSiteId = victimSiteId;
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
     * Gets the rldf049m type list.
     * 
     * @return the rldf049m type list
     */
    public List<Rldf049mType> getRldf049mTypeList() {
        return rldf049mTypeList;
    }

    /**
     * Sets the rldf049m type list.
     * 
     * @param rldf049mTypeList
     *            the new rldf049m type list
     */
    public void setRldf049mTypeList(final List<Rldf049mType> rldf049mTypeList) {
        this.rldf049mTypeList = rldf049mTypeList;
    }


/** 查詢結果. */
@XmlElement(name = "VictimSiteId")
@FieldName("查詢結果")
private List<Rl01b30DTO> resultList = new ArrayList<Rl01b30DTO>();

/**
 * Gets the result list.
 * 
 * @return the result list
 */
public List<Rl01b30DTO> getResultList() {
    return resultList;
}

/**
 * Sets the result list.
 * 
 * @param resultList
 *            the new result list
 */
public void setResultList(List<Rl01b30DTO> resultList) {
    this.resultList = resultList;
}


}
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

/**
 * 查詢本戶所總人數/總戶數處理.
 * 
 * @author Derek Wang
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl072a0DTO", propOrder = { "village", "houseHoldHeadId", "houseHoldId", "houseHoldCount",
        "neighborCount", "maleCount", "femaleCount", "totalCount", "gender", "resultList" })
@XmlRootElement(name = "Rl072a0DTO")
public class Rl072a0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 村里名稱. */
    @XmlElement(name = "Village")
    @FieldName("村里名稱")
    private String village;

    /** 戶長統號. */
    @XmlElement(name = "HouseHoldHeadId")
    @FieldName("戶長統號")
    private String houseHoldHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseHoldId")
    @FieldName("戶號")
    private String houseHoldId;

    /** 總戶口數. */
    @XmlElement(name = "HouseHoldCount")
    @FieldName("總戶口數")
    private Integer houseHoldCount;

    /** 鄰總數. */
    @XmlElement(name = "NeighborCount")
    @FieldName("鄰總數")
    private Integer neighborCount;

    /** 男人口數. */
    @XmlElement(name = "MaleCount")
    @FieldName("男人口數")
    private Long maleCount;

    /** 女人口數. */
    @XmlElement(name = "FemaleCount")
    @FieldName("女人口數")
    private Long femaleCount;

    /** 總人口數. */
    @XmlElement(name = "TotalCount")
    @FieldName("總人口數")
    private Long totalCount;

    /** 性別. */
    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    List<Rl072a0DTO> resultList = new ArrayList<Rl072a0DTO>();

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl072a0DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl072a0DTO> resultList) {
        this.resultList = resultList;
    }

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
     * Gets the house hold head id.
     * 
     * @return the house hold head id
     */
    public String getHouseHoldHeadId() {
        return houseHoldHeadId;
    }

    /**
     * Sets the house hold head id.
     * 
     * @param houseHoldHeadId
     *            the new house hold head id
     */
    public void setHouseHoldHeadId(String houseHoldHeadId) {
        this.houseHoldHeadId = houseHoldHeadId;
    }

    /**
     * Gets the house hold id.
     * 
     * @return the house hold id
     */
    public String getHouseHoldId() {
        return houseHoldId;
    }

    /**
     * Sets the house hold id.
     * 
     * @param houseHoldId
     *            the new house hold id
     */
    public void setHouseHoldId(String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    /**
     * Gets the neighbor count.
     * 
     * @return the neighbor count
     */
    public Integer getNeighborCount() {
        return neighborCount;
    }

    /**
     * Sets the neighbor count.
     * 
     * @param neighborCount
     *            the new neighbor count
     */
    public void setNeighborCount(Integer neighborCount) {
        this.neighborCount = neighborCount;
    }

    /**
     * Gets the male count.
     * 
     * @return the male count
     */
    public Long getMaleCount() {
        return maleCount;
    }

    /**
     * Sets the male count.
     * 
     * @param maleCount
     *            the new male count
     */
    public void setMaleCount(Long maleCount) {
        this.maleCount = maleCount;
    }

    /**
     * Gets the female count.
     * 
     * @return the female count
     */
    public Long getFemaleCount() {
        return femaleCount;
    }

    /**
     * Sets the female count.
     * 
     * @param femaleCount
     *            the new female count
     */
    public void setFemaleCount(Long femaleCount) {
        this.femaleCount = femaleCount;
    }

    /**
     * Gets the total count.
     * 
     * @return the total count
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the total count.
     * 
     * @param totalCount
     *            the new total count
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Gets the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * 
     * @param gender
     *            the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the house hold count.
     * 
     * @return the house hold count
     */
    public Integer getHouseHoldCount() {
        return houseHoldCount;
    }

    /**
     * Sets the house hold count.
     * 
     * @param houseHoldCount
     *            the new house hold count
     */
    public void setHouseHoldCount(Integer houseHoldCount) {
        this.houseHoldCount = houseHoldCount;
    }

}

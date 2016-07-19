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
 * The Class Rl03100RiConditionDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100RiConditionDTO", propOrder = { "volumeType", "volumeNumber", "imageSiteId", "householderName",
        "memberName", "symbol", "memberId", "volumeYearStart", "volumeYearEnd", "birthDateStart", "birthDateEnd",
        "reCityName", "townName", "villageName", "neighborName", "reRoadName", "prefectureName", "cityName",
        "divisionName", "cityBlock", "roadName", "doorPlate" })
@XmlRootElement(name = "Rl03100RiConditionDTO")
public class Rl03100RiConditionDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 1L;

    /** 戶籍簿冊種類 */
    @FieldName("戶籍簿冊種類")
    @XmlElement(name = "VolumeType")
    private String volumeType = "";

    /** 戶籍簿冊冊號 */
    @FieldName("戶籍簿冊冊號")
    @XmlElement(name = "VolumeNumber")
    private String volumeNumber = "";

    /** 戶所名稱 */
    @FieldName("戶所名稱")
    @XmlElement(name = "ImageSiteId")
    private String imageSiteId = "";

    /** 戶長姓名 */
    @FieldName("戶長姓名")
    @XmlElement(name = "HouseholderName")
    private String householderName = "";

    /** 成員姓名 */
    @FieldName("成員姓名")
    @XmlElement(name = "MemberName")
    private String memberName = "";

    /** 符號 */
    @FieldName("符號")
    @XmlElement(name = "Symbol")
    private String symbol = "";

    /** 身分證號碼 */
    @FieldName("身分證號碼")
    @XmlElement(name = "MemberId")
    private String memberId = "";

    /** 戶籍簿冊年度(起) */
    @FieldName("戶籍簿冊年度(起)")
    @XmlElement(name = "VolumeYearStart")
    private String volumeYearStart = "";

    /** 戶籍簿冊年度(迄) */
    @FieldName("戶籍簿冊年度(迄)")
    @XmlElement(name = "VolumeYearEnd")
    private String volumeYearEnd = "";

    /** 成員出生日期(起) */
    @FieldName("成員出生日期(起)")
    @XmlElement(name = "BirthDateStart")
    private String birthDateStart = "";

    /** 成員出生日期(迄) */
    @FieldName("成員出生日期(迄)")
    @XmlElement(name = "BirthDateEnd")
    private String birthDateEnd = "";

    /** 縣市名稱 */
    @FieldName("縣市名稱")
    @XmlElement(name = "ReCityName")
    private String reCityName = "";

    /** 鄉鎮市區名稱 */
    @FieldName("鄉鎮市區名稱")
    @XmlElement(name = "TownName")
    private String townName = "";

    /** 村里名稱 */
    @FieldName("村里名稱")
    @XmlElement(name = "VillageName")
    private String villageName = "";

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "NeighborName")
    private String neighborName = "";

    /** 路、街、大道 */
    @FieldName("路、街、大道")
    @XmlElement(name = "ReRoadName")
    private String reRoadName = "";

    /** 廳、州 */
    @FieldName("廳、州")
    @XmlElement(name = "PrefectureName")
    private String prefectureName = "";

    /** 郡、堡、市 */
    @FieldName("郡、堡、市")
    @XmlElement(name = "CityName")
    private String cityName = "";

    /** 町、庄、街 */
    @FieldName("町、庄、街")
    @XmlElement(name = "DivisionName")
    private String divisionName = "";

    /** 字 */
    @FieldName("字")
    @XmlElement(name = "CityBlock")
    private String cityBlock = "";

    /** 街、土名 */
    @FieldName("街、土名")
    @XmlElement(name = "RoadName")
    private String roadName = "";

    /** 番地 */
    @FieldName("番地")
    @XmlElement(name = "DoorPlate")
    private String doorPlate = "";

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public String getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(String volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public String getImageSiteId() {
        return imageSiteId;
    }

    public void setImageSiteId(String imageSiteId) {
        this.imageSiteId = imageSiteId;
    }

    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getVolumeYearStart() {
        return volumeYearStart;
    }

    public void setVolumeYearStart(String volumeYearStart) {
        this.volumeYearStart = volumeYearStart;
    }

    public String getVolumeYearEnd() {
        return volumeYearEnd;
    }

    public void setVolumeYearEnd(String volumeYearEnd) {
        this.volumeYearEnd = volumeYearEnd;
    }

    public String getBirthDateStart() {
        return birthDateStart;
    }

    public void setBirthDateStart(String birthDateStart) {
        this.birthDateStart = birthDateStart;
    }

    public String getBirthDateEnd() {
        return birthDateEnd;
    }

    public void setBirthDateEnd(String birthDateEnd) {
        this.birthDateEnd = birthDateEnd;
    }

    public String getReCityName() {
        return reCityName;
    }

    public void setReCityName(String reCityName) {
        this.reCityName = reCityName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getNeighborName() {
        return neighborName;
    }

    public void setNeighborName(String neighborName) {
        this.neighborName = neighborName;
    }

    public String getReRoadName() {
        return reRoadName;
    }

    public void setReRoadName(String reRoadName) {
        this.reRoadName = reRoadName;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getCityBlock() {
        return cityBlock;
    }

    public void setCityBlock(String cityBlock) {
        this.cityBlock = cityBlock;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getDoorPlate() {
        return doorPlate;
    }

    public void setDoorPlate(String doorPlate) {
        this.doorPlate = doorPlate;
    }

}

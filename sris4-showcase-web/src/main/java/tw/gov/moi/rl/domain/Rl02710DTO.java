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
 * The Class Rl02710DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02710DTO", propOrder = { "cityCountyCode", "townCode", "areaCode", "siteId", "village", "neighbor",
        "streetDoorplate", "householdType", "concurrentHeadMark", "registerCode", "registerContent", "householdHeadId",
        "householdId", "householdHeadName", "registerYyymmdd", "registerHhmmss", "stieId", "registerAdminOfficeCode",
        "registerName", "registerDelete", "personIdList", "personalMark_0", "personalMark_1", "personalMark_2",
        "deathIdList", "removeIdList", "removeIdMoveOutOneList", "removeNotClearIdList" })
@XmlRootElement(name = "Rl02710DTO")
public class Rl02710DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 縣市. */
    @XmlElement(name = "CityCountyCode")
    @FieldName("縣市")
    private String cityCountyCode = "";

    /** 鄉鎮. */
    @XmlElement(name = "TownCode")
    @FieldName("鄉鎮")
    private String townCode = "";

    /** 行政區域. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域")
    private String areaCode = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 戶別. */
    @XmlElement(name = "HouseholdType")
    @FieldName("戶別")
    private String householdType = "";

    /** 兼任戶長註記. */
    @XmlElement(name = "ConcurrentHeadMark")
    @FieldName("兼任戶長註記")
    private String concurrentHeadMark = "";

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    @FieldName("記事代碼")
    private String registerCode = "";

    /** 記事內容. */
    @XmlElement(name = "RegisterContent")
    @FieldName("記事內容")
    private String registerContent = "";

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 登記日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("登記日期")
    private String registerYyymmdd = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterHhmmss")
    @FieldName("登記時間")
    private String registerHhmmss = "";

    /** 登記戶所代碼. */
    @XmlElement(name = "RegisterAdminOfficeCode")
    @FieldName("登記戶所代碼")
    private String registerAdminOfficeCode = "";

    /** 戶籍員姓名. */
    @XmlElement(name = "RegisterName")
    @FieldName("戶籍員姓名")
    private String registerName = "";

    /** 刪除註記. */
    @XmlElement(name = "RegisterDelete")
    @FieldName("刪除註記")
    private boolean registerDelete = false;

    /** 現住統號. */
    @XmlElement(name = "PersonId")
    @FieldName("現住統號")
    private List<String> personIdList = new ArrayList<String>();

    /** 現住人口. */
    @XmlElement(name = "PersonId")
    @FieldName("現住人口")
    private int personalMark_0 = 0;

    /** 除戶人口. */
    @XmlElement(name = "PersonId")
    @FieldName("除戶人口")
    private int personalMark_1 = 0;

    /** 遷出未結人口. */
    @XmlElement(name = "PersonId")
    @FieldName("遷出未結人口")
    private int personalMark_2 = 0;

    /** 死亡統號. */
    @XmlElement(name = "DeathIdList")
    @FieldName("死亡統號")
    private List<String> deathIdList = new ArrayList<String>();

    /** 除戶統號. */
    @XmlElement(name = "RemoveIdList")
    @FieldName("除戶統號")
    private List<String> removeIdList = new ArrayList<String>();

    /** 除戶統號(遷出國內). */
    @XmlElement(name = "RemoveIdMoveOutOneList")
    @FieldName("除戶統號(遷出國內)")
    private List<String> removeIdMoveOutOneList = new ArrayList<String>();

    /** 除戶統號. */
    @XmlElement(name = "RemoveNotClearIdList")
    @FieldName("遷出未結人口統號")
    private List<String> removeNotClearIdList = new ArrayList<String>();

    /**
     * Gets the city county code.
     * 
     * @return the city county code
     */
    public String getCityCountyCode() {
        return cityCountyCode;
    }

    /**
     * Sets the city county code.
     * 
     * @param cityCountyCode
     *            the new city county code
     */
    public void setCityCountyCode(String cityCountyCode) {
        this.cityCountyCode = cityCountyCode;
    }

    /**
     * Gets the town code.
     * 
     * @return the town code
     */
    public String getTownCode() {
        return townCode;
    }

    /**
     * Sets the town code.
     * 
     * @param townCode
     *            the new town code
     */
    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
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
     * Gets the street doorplate.
     * 
     * @return the street doorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * Sets the street doorplate.
     * 
     * @param streetDoorplate
     *            the new street doorplate
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * Gets the household type.
     * 
     * @return the household type
     */
    public String getHouseholdType() {
        return householdType;
    }

    /**
     * Sets the household type.
     * 
     * @param householdType
     *            the new household type
     */
    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
    }

    /**
     * Gets the concurrent head mark.
     * 
     * @return the concurrent head mark
     */
    public String getConcurrentHeadMark() {
        return concurrentHeadMark;
    }

    /**
     * Sets the concurrent head mark.
     * 
     * @param concurrentHeadMark
     *            the new concurrent head mark
     */
    public void setConcurrentHeadMark(String concurrentHeadMark) {
        this.concurrentHeadMark = concurrentHeadMark;
    }

    /**
     * Gets the register code.
     * 
     * @return the register code
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * Sets the register code.
     * 
     * @param registerCode
     *            the new register code
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * Gets the household head name.
     * 
     * @return the household head name
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * Sets the household head name.
     * 
     * @param householdHeadName
     *            the new household head name
     */
    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * Gets the register yyymmdd.
     * 
     * @return the register yyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * Sets the register yyymmdd.
     * 
     * @param registerYyymmdd
     *            the new register yyymmdd
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * Gets the register hhmmss.
     * 
     * @return the register hhmmss
     */
    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    /**
     * Sets the register hhmmss.
     * 
     * @param registerHhmmss
     *            the new register hhmmss
     */
    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    /**
     * Gets the register admin office code.
     * 
     * @return the register admin office code
     */
    public String getRegisterAdminOfficeCode() {
        return registerAdminOfficeCode;
    }

    /**
     * Sets the register admin office code.
     * 
     * @param registerAdminOfficeCode
     *            the new register admin office code
     */
    public void setRegisterAdminOfficeCode(String registerAdminOfficeCode) {
        this.registerAdminOfficeCode = registerAdminOfficeCode;
    }

    /**
     * Gets the register name.
     * 
     * @return the register name
     */
    public String getRegisterName() {
        return registerName;
    }

    /**
     * Sets the register name.
     * 
     * @param registerName
     *            the new register name
     */
    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    /**
     * Checks if is register delete.
     * 
     * @return true, if is register delete
     */
    public boolean isRegisterDelete() {
        return registerDelete;
    }

    /**
     * Sets the register delete.
     * 
     * @param registerDelete
     *            the new register delete
     */
    public void setRegisterDelete(boolean registerDelete) {
        this.registerDelete = registerDelete;
    }

    /**
     * Gets the personal mark_0.
     * 
     * @return the personal mark_0
     */
    public int getPersonalMark_0() {
        return personalMark_0;
    }

    /**
     * Sets the personal mark_0.
     * 
     * @param personalMark_0
     *            the new personal mark_0
     */
    public void setPersonalMark_0(int personalMark_0) {
        this.personalMark_0 = personalMark_0;
    }

    /**
     * Gets the personal mark_1.
     * 
     * @return the personal mark_1
     */
    public int getPersonalMark_1() {
        return personalMark_1;
    }

    /**
     * Sets the personal mark_1.
     * 
     * @param personalMark_1
     *            the new personal mark_1
     */
    public void setPersonalMark_1(int personalMark_1) {
        this.personalMark_1 = personalMark_1;
    }

    /**
     * Gets the personal mark_2.
     * 
     * @return the personal mark_2
     */
    public int getPersonalMark_2() {
        return personalMark_2;
    }

    /**
     * Sets the personal mark_2.
     * 
     * @param personalMark_2
     *            the new personal mark_2
     */
    public void setPersonalMark_2(int personalMark_2) {
        this.personalMark_2 = personalMark_2;
    }

    /**
     * Gets the person id list.
     * 
     * @return the person id list
     */
    public List<String> getPersonIdList() {
        return personIdList;
    }

    /**
     * Sets the person id list.
     * 
     * @param personIdList
     *            the new person id list
     */
    public void setPersonIdList(List<String> personIdList) {
        this.personIdList = personIdList;
    }

    /**
     * Gets the death id list.
     * 
     * @return the death id list
     */
    public List<String> getDeathIdList() {
        return deathIdList;
    }

    /**
     * Sets the death id list.
     * 
     * @param deathIdList
     *            the new death id list
     */
    public void setDeathIdList(List<String> deathIdList) {
        this.deathIdList = deathIdList;
    }

    /**
     * Gets the removes the id list.
     * 
     * @return the removes the id list
     */
    public List<String> getRemoveIdList() {
        return removeIdList;
    }

    /**
     * Sets the removes the id list.
     * 
     * @param removeIdList
     *            the new removes the id list
     */
    public void setRemoveIdList(List<String> removeIdList) {
        this.removeIdList = removeIdList;
    }

    /**
     * Gets the removes the id move out one list.
     * 
     * @return the removes the id move out one list
     */
    public List<String> getRemoveIdMoveOutOneList() {
        return removeIdMoveOutOneList;
    }

    /**
     * Sets the removes the id move out one list.
     * 
     * @param removeIdMoveOutOneList
     *            the new removes the id move out one list
     */
    public void setRemoveIdMoveOutOneList(List<String> removeIdMoveOutOneList) {
        this.removeIdMoveOutOneList = removeIdMoveOutOneList;
    }

    /**
     * Gets the removes the not clear id list.
     * 
     * @return the removes the not clear id list
     */
    public List<String> getRemoveNotClearIdList() {
        return removeNotClearIdList;
    }

    /**
     * Sets the removes the not clear id list.
     * 
     * @param removeNotClearIdList
     *            the new removes the not clear id list
     */
    public void setRemoveNotClearIdList(List<String> removeNotClearIdList) {
        this.removeNotClearIdList = removeNotClearIdList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl02710DTO [cityCountyCode=" + cityCountyCode + ", townCode=" + townCode + ", areaCode=" + areaCode
                + ", siteId=" + siteId + ", village=" + village + ", neighbor=" + neighbor + ", streetDoorplate="
                + streetDoorplate + ", householdType=" + householdType + ", concurrentHeadMark=" + concurrentHeadMark
                + ", registerCode=" + registerCode + ", registerContent=" + registerContent + ", householdHeadId="
                + householdHeadId + ", householdId=" + householdId + ", householdHeadName=" + householdHeadName
                + ", registerYyymmdd=" + registerYyymmdd + ", registerHhmmss=" + registerHhmmss
                + ", registerAdminOfficeCode=" + registerAdminOfficeCode + ", registerName=" + registerName
                + ", registerDelete=" + registerDelete + ", personalMark_0=" + personalMark_0 + ", personalMark_1="
                + personalMark_1 + ", personalMark_2=" + personalMark_2 + "]";
    }

}

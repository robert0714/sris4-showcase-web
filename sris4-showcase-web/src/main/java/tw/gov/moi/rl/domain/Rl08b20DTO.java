/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08b20DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08b20DTO", propOrder = { "name", "type", "changeType", "lineSpacing", "applyFromDate",
        "applyFromYear", "applyFromMonth", "applyFromDay", "applyToDate", "applyToYear", "applyToMonth", "applyToDay",
        "villageList", "village", "order1", "order2", "registerItem", "gender", "birthType", "marriedState",
        "birthFromDate", "birthFromYear", "birthFromMonth", "birthFromDay", "birthToDate", "birthToYear",
        "birthToMonth", "birthToDay", "dieFromDate", "dieFromYear", "dieFromMonth", "dieFromDay", "dieToDate",
        "dieToYear", "dieToMonth", "dieToDay", "educationStart", "dieLocation", "aboriginal", "race",
        "militaryService", "address", "handinCard", "spouseAreaId" })
@XmlRootElement(name = "Rl08b20DTO")
public class Rl08b20DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    /** 名冊名稱. */
    @XmlElement(name = "Name", required = true)
    @FieldName("名冊名稱")
    private String name;

    /** 統計造冊. */
    @XmlElement(name = "Type", required = true)
    @FieldName("統計造冊")
    private String type;

    /** 換頁方式. */
    @XmlElement(name = "ChangeType", required = true)
    @FieldName("換頁方式")
    private String changeType;

    /** 增加行距. */
    @XmlElement(name = "LineSpacing", required = true)
    @FieldName("增加行距")
    private String lineSpacing;

    /** 申請日期起. */
    @XmlElement(name = "ApplyFromDate", required = true)
    @FieldName("申請日期起")
    private Date applyFromDate;

    /** 申請日期起(年). */
    @XmlElement(name = "ApplyFromYear", required = true)
    @FieldName("申請日期起(年)")
    private String applyFromYear;

    /** 申請日期起(月). */
    @XmlElement(name = "ApplyFromMonth", required = true)
    @FieldName("申請日期起(月)")
    private String applyFromMonth;

    /** 申請日期起(日). */
    @XmlElement(name = "ApplyFromDay", required = true)
    @FieldName("申請日期起(日)")
    private String applyFromDay;

    /** 申請日期迄. */
    @XmlElement(name = "ApplyToDate", required = true)
    @FieldName("申請日期迄")
    private Date applyToDate;

    /** 申請日期迄(年). */
    @XmlElement(name = "ApplyToYear", required = true)
    @FieldName("申請日期迄(年)")
    private String applyToYear;

    /** 申請日期迄(月). */
    @XmlElement(name = "ApplyToMonth", required = true)
    @FieldName("申請日期迄(月)")
    private String applyToMonth;

    /** 申請日期迄(日). */
    @XmlElement(name = "ApplyToDay", required = true)
    @FieldName("申請日期迄(日)")
    private String applyToDay;

    /** 村里清單. */
    @XmlElement(name = "VillageList", required = true)
    @FieldName("村里清單")
    private List<String> villageList;

    /** 村里. */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 排序順序-1. */
    @XmlElement(name = "Order1", required = true)
    @FieldName("排序順序-1")
    private String order1;

    /** 排序順序-2. */
    @XmlElement(name = "Order2", required = true)
    @FieldName("排序順序-2")
    private String order2;

    /** 登記項目. */
    @XmlElement(name = "RegisterItem", required = true)
    @FieldName("登記項目")
    private String registerItem;

    /** 性別. */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 出生別. */
    @XmlElement(name = "BirthType", required = true)
    @FieldName("出生別")
    private String birthType;

    /** 婚姻狀況. */
    @XmlElement(name = "MarriedState", required = true)
    @FieldName("婚姻狀況")
    private String marriedState;

    /** 出生日期起. */
    @XmlElement(name = "BirthFromDate", required = true)
    @FieldName("出生日期起")
    private Date birthFromDate;

    /** 出生日期起(年). */
    @XmlElement(name = "BirthFromYear", required = true)
    @FieldName("出生日期起(年)")
    private String birthFromYear;

    /** 出生日期起(月). */
    @XmlElement(name = "BirthFromMonth", required = true)
    @FieldName("出生日期起(月)")
    private String birthFromMonth;

    /** 出生日期起(日). */
    @XmlElement(name = "BirthFromDay", required = true)
    @FieldName("出生日期起(日)")
    private String birthFromDay;

    /** 出生日期迄. */
    @XmlElement(name = "BirthToDate", required = true)
    @FieldName("出生日期迄")
    private Date birthToDate;

    /** 出生日期迄(年). */
    @XmlElement(name = "BirthToYear", required = true)
    @FieldName("出生日期迄(年)")
    private String birthToYear;

    /** 出生日期迄(月). */
    @XmlElement(name = "BirthToMonth", required = true)
    @FieldName("出生日期迄(月)")
    private String birthToMonth;

    /** 出生日期迄(日). */
    @XmlElement(name = "BirthToDay", required = true)
    @FieldName("出生日期迄(日)")
    private String birthToDay;

    /** 死亡日期起. */
    @XmlElement(name = "DieFromDate", required = true)
    @FieldName("死亡日期起")
    private Date dieFromDate;

    /** 死亡日期起(年). */
    @XmlElement(name = "DieFromYear", required = true)
    @FieldName("死亡日期起(年)")
    private String dieFromYear;

    /** 死亡日期起(月). */
    @XmlElement(name = "DieFromMonth", required = true)
    @FieldName("死亡日期起(月)")
    private String dieFromMonth;

    /** 死亡日期起(日). */
    @XmlElement(name = "DieFromDay", required = true)
    @FieldName("死亡日期起(日)")
    private String dieFromDay;

    /** 死亡日期迄. */
    @XmlElement(name = "DieToDate", required = true)
    @FieldName("死亡日期迄")
    private Date dieToDate;

    /** 死亡日期迄(年). */
    @XmlElement(name = "DieToYear", required = true)
    @FieldName("死亡日期迄(年)")
    private String dieToYear;

    /** 死亡日期迄 (月). */
    @XmlElement(name = "DieToMonth", required = true)
    @FieldName("死亡日期迄 (月)")
    private String dieToMonth;

    /** 死亡日期迄 (日). */
    @XmlElement(name = "DieToDay", required = true)
    @FieldName("死亡日期迄 (日)")
    private String dieToDay;

    /** 教育程度. */
    @XmlElement(name = "EducationStart", required = true)
    @FieldName("教育程度")
    private String educationStart;

    /** 死亡地點性質. */
    @XmlElement(name = "DieLocation", required = true)
    @FieldName("死亡地點性質")
    private String dieLocation;

    /** 原住民身分. */
    @XmlElement(name = "Aboriginal", required = true)
    @FieldName("原住民身分")
    private String aboriginal;

    /** 族別. */
    @XmlElement(name = "Race", required = true)
    @FieldName("族別")
    private String race;

    /** 役別. */
    @XmlElement(name = "MilitaryService", required = true)
    @FieldName("役別")
    private String militaryService;

    /** 街路門牌. */
    @XmlElement(name = "Address", required = true)
    @FieldName("街路門牌")
    private String address;

    /** 附繳證件. */
    @XmlElement(name = "HandinCard", required = true)
    @FieldName("附繳證件")
    private String handinCard;

    /** 配偶國籍或區域代碼. */
    @XmlElement(name = "SpouseAreaId", required = true)
    @FieldName("配偶國籍或區域代碼")
    private String spouseAreaId;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
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
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * Gets the line spacing.
     * 
     * @return the line spacing
     */
    public String getLineSpacing() {
        return lineSpacing;
    }

    /**
     * Sets the line spacing.
     * 
     * @param lineSpacing
     *            the new line spacing
     */
    public void setLineSpacing(String lineSpacing) {
        this.lineSpacing = lineSpacing;
    }

    /**
     * Gets the apply from date.
     * 
     * @return the apply from date
     */
    public Date getApplyFromDate() {
        return applyFromDate;
    }

    /**
     * Sets the apply from date.
     * 
     * @param applyFromDate
     *            the new apply from date
     */
    public void setApplyFromDate(Date applyFromDate) {
        this.applyFromDate = applyFromDate;
    }

    /**
     * Gets the apply from year.
     * 
     * @return the apply from year
     */
    public String getApplyFromYear() {
        return applyFromYear;
    }

    /**
     * Sets the apply from year.
     * 
     * @param applyFromYear
     *            the new apply from year
     */
    public void setApplyFromYear(String applyFromYear) {
        this.applyFromYear = applyFromYear;
    }

    /**
     * Gets the apply from month.
     * 
     * @return the apply from month
     */
    public String getApplyFromMonth() {
        return applyFromMonth;
    }

    /**
     * Sets the apply from month.
     * 
     * @param applyFromMonth
     *            the new apply from month
     */
    public void setApplyFromMonth(String applyFromMonth) {
        this.applyFromMonth = applyFromMonth;
    }

    /**
     * Gets the apply from day.
     * 
     * @return the apply from day
     */
    public String getApplyFromDay() {
        return applyFromDay;
    }

    /**
     * Sets the apply from day.
     * 
     * @param applyFromDay
     *            the new apply from day
     */
    public void setApplyFromDay(String applyFromDay) {
        this.applyFromDay = applyFromDay;
    }

    /**
     * Gets the apply to date.
     * 
     * @return the apply to date
     */
    public Date getApplyToDate() {
        return applyToDate;
    }

    /**
     * Sets the apply to date.
     * 
     * @param applyToDate
     *            the new apply to date
     */
    public void setApplyToDate(Date applyToDate) {
        this.applyToDate = applyToDate;
    }

    /**
     * Gets the apply to year.
     * 
     * @return the apply to year
     */
    public String getApplyToYear() {
        return applyToYear;
    }

    /**
     * Sets the apply to year.
     * 
     * @param applyToYear
     *            the new apply to year
     */
    public void setApplyToYear(String applyToYear) {
        this.applyToYear = applyToYear;
    }

    /**
     * Gets the apply to month.
     * 
     * @return the apply to month
     */
    public String getApplyToMonth() {
        return applyToMonth;
    }

    /**
     * Sets the apply to month.
     * 
     * @param applyToMonth
     *            the new apply to month
     */
    public void setApplyToMonth(String applyToMonth) {
        this.applyToMonth = applyToMonth;
    }

    /**
     * Gets the apply to day.
     * 
     * @return the apply to day
     */
    public String getApplyToDay() {
        return applyToDay;
    }

    /**
     * Sets the apply to day.
     * 
     * @param applyToDay
     *            the new apply to day
     */
    public void setApplyToDay(String applyToDay) {
        this.applyToDay = applyToDay;
    }

    /**
     * Gets the village list.
     * 
     * @return the village list
     */
    public List<String> getVillageList() {
        if (null == villageList) {
            villageList = new ArrayList<String>();
        }
        return villageList;
    }

    /**
     * Sets the village list.
     * 
     * @param villageList
     *            the new village list
     */
    public void setVillageList(List<String> villageList) {
        this.villageList = villageList;
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
     * Gets the order1.
     * 
     * @return the order1
     */
    public String getOrder1() {
        return order1;
    }

    /**
     * Sets the order1.
     * 
     * @param order1
     *            the new order1
     */
    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    /**
     * Gets the order2.
     * 
     * @return the order2
     */
    public String getOrder2() {
        return order2;
    }

    /**
     * Sets the order2.
     * 
     * @param order2
     *            the new order2
     */
    public void setOrder2(String order2) {
        this.order2 = order2;
    }

    /**
     * Gets the register item.
     * 
     * @return the register item
     */
    public String getRegisterItem() {
        return registerItem;
    }

    /**
     * Sets the register item.
     * 
     * @param registerItem
     *            the new register item
     */
    public void setRegisterItem(String registerItem) {
        this.registerItem = registerItem;
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
     * Gets the birth type.
     * 
     * @return the birth type
     */
    public String getBirthType() {
        return birthType;
    }

    /**
     * Sets the birth type.
     * 
     * @param birthType
     *            the new birth type
     */
    public void setBirthType(String birthType) {
        this.birthType = birthType;
    }

    /**
     * Gets the married state.
     * 
     * @return the married state
     */
    public String getMarriedState() {
        return marriedState;
    }

    /**
     * Sets the married state.
     * 
     * @param marriedState
     *            the new married state
     */
    public void setMarriedState(String marriedState) {
        this.marriedState = marriedState;
    }

    /**
     * Gets the birth from date.
     * 
     * @return the birth from date
     */
    public Date getBirthFromDate() {
        return birthFromDate;
    }

    /**
     * Sets the birth from date.
     * 
     * @param birthFromDate
     *            the new birth from date
     */
    public void setBirthFromDate(Date birthFromDate) {
        this.birthFromDate = birthFromDate;
    }

    /**
     * Gets the birth from year.
     * 
     * @return the birth from year
     */
    public String getBirthFromYear() {
        return birthFromYear;
    }

    /**
     * Sets the birth from year.
     * 
     * @param birthFromYear
     *            the new birth from year
     */
    public void setBirthFromYear(String birthFromYear) {
        this.birthFromYear = birthFromYear;
    }

    /**
     * Gets the birth from month.
     * 
     * @return the birth from month
     */
    public String getBirthFromMonth() {
        return birthFromMonth;
    }

    /**
     * Sets the birth from month.
     * 
     * @param birthFromMonth
     *            the new birth from month
     */
    public void setBirthFromMonth(String birthFromMonth) {
        this.birthFromMonth = birthFromMonth;
    }

    /**
     * Gets the birth from day.
     * 
     * @return the birth from day
     */
    public String getBirthFromDay() {
        return birthFromDay;
    }

    /**
     * Sets the birth from day.
     * 
     * @param birthFromDay
     *            the new birth from day
     */
    public void setBirthFromDay(String birthFromDay) {
        this.birthFromDay = birthFromDay;
    }

    /**
     * Gets the birth to date.
     * 
     * @return the birth to date
     */
    public Date getBirthToDate() {
        return birthToDate;
    }

    /**
     * Sets the birth to date.
     * 
     * @param birthToDate
     *            the new birth to date
     */
    public void setBirthToDate(Date birthToDate) {
        this.birthToDate = birthToDate;
    }

    /**
     * Gets the birth to year.
     * 
     * @return the birth to year
     */
    public String getBirthToYear() {
        return birthToYear;
    }

    /**
     * Sets the birth to year.
     * 
     * @param birthToYear
     *            the new birth to year
     */
    public void setBirthToYear(String birthToYear) {
        this.birthToYear = birthToYear;
    }

    /**
     * Gets the birth to month.
     * 
     * @return the birth to month
     */
    public String getBirthToMonth() {
        return birthToMonth;
    }

    /**
     * Sets the birth to month.
     * 
     * @param birthToMonth
     *            the new birth to month
     */
    public void setBirthToMonth(String birthToMonth) {
        this.birthToMonth = birthToMonth;
    }

    /**
     * Gets the birth to day.
     * 
     * @return the birth to day
     */
    public String getBirthToDay() {
        return birthToDay;
    }

    /**
     * Sets the birth to day.
     * 
     * @param birthToDay
     *            the new birth to day
     */
    public void setBirthToDay(String birthToDay) {
        this.birthToDay = birthToDay;
    }

    /**
     * Gets the die from date.
     * 
     * @return the die from date
     */
    public Date getDieFromDate() {
        return dieFromDate;
    }

    /**
     * Sets the die from date.
     * 
     * @param dieFromDate
     *            the new die from date
     */
    public void setDieFromDate(Date dieFromDate) {
        this.dieFromDate = dieFromDate;
    }

    /**
     * Gets the die from year.
     * 
     * @return the die from year
     */
    public String getDieFromYear() {
        return dieFromYear;
    }

    /**
     * Sets the die from year.
     * 
     * @param dieFromYear
     *            the new die from year
     */
    public void setDieFromYear(String dieFromYear) {
        this.dieFromYear = dieFromYear;
    }

    /**
     * Gets the die from month.
     * 
     * @return the die from month
     */
    public String getDieFromMonth() {
        return dieFromMonth;
    }

    /**
     * Sets the die from month.
     * 
     * @param dieFromMonth
     *            the new die from month
     */
    public void setDieFromMonth(String dieFromMonth) {
        this.dieFromMonth = dieFromMonth;
    }

    /**
     * Gets the die from day.
     * 
     * @return the die from day
     */
    public String getDieFromDay() {
        return dieFromDay;
    }

    /**
     * Sets the die from day.
     * 
     * @param dieFromDay
     *            the new die from day
     */
    public void setDieFromDay(String dieFromDay) {
        this.dieFromDay = dieFromDay;
    }

    /**
     * Gets the die to date.
     * 
     * @return the die to date
     */
    public Date getDieToDate() {
        return dieToDate;
    }

    /**
     * Sets the die to date.
     * 
     * @param dieToDate
     *            the new die to date
     */
    public void setDieToDate(Date dieToDate) {
        this.dieToDate = dieToDate;
    }

    /**
     * Gets the die to year.
     * 
     * @return the die to year
     */
    public String getDieToYear() {
        return dieToYear;
    }

    /**
     * Sets the die to year.
     * 
     * @param dieToYear
     *            the new die to year
     */
    public void setDieToYear(String dieToYear) {
        this.dieToYear = dieToYear;
    }

    /**
     * Gets the die to month.
     * 
     * @return the die to month
     */
    public String getDieToMonth() {
        return dieToMonth;
    }

    /**
     * Sets the die to month.
     * 
     * @param dieToMonth
     *            the new die to month
     */
    public void setDieToMonth(String dieToMonth) {
        this.dieToMonth = dieToMonth;
    }

    /**
     * Gets the die to day.
     * 
     * @return the die to day
     */
    public String getDieToDay() {
        return dieToDay;
    }

    /**
     * Sets the die to day.
     * 
     * @param dieToDay
     *            the new die to day
     */
    public void setDieToDay(String dieToDay) {
        this.dieToDay = dieToDay;
    }

    /**
     * Gets the education start.
     * 
     * @return the education start
     */
    public String getEducationStart() {
        return educationStart;
    }

    /**
     * Sets the education start.
     * 
     * @param educationStart
     *            the new education start
     */
    public void setEducationStart(String educationStart) {
        this.educationStart = educationStart;
    }

    /**
     * Gets the die location.
     * 
     * @return the die location
     */
    public String getDieLocation() {
        return dieLocation;
    }

    /**
     * Sets the die location.
     * 
     * @param dieLocation
     *            the new die location
     */
    public void setDieLocation(String dieLocation) {
        this.dieLocation = dieLocation;
    }

    /**
     * Gets the aboriginal.
     * 
     * @return the aboriginal
     */
    public String getAboriginal() {
        return aboriginal;
    }

    /**
     * Sets the aboriginal.
     * 
     * @param aboriginal
     *            the new aboriginal
     */
    public void setAboriginal(String aboriginal) {
        this.aboriginal = aboriginal;
    }

    /**
     * Gets the race.
     * 
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the race.
     * 
     * @param race
     *            the new race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Gets the military service.
     * 
     * @return the military service
     */
    public String getMilitaryService() {
        return militaryService;
    }

    /**
     * Sets the military service.
     * 
     * @param militaryService
     *            the new military service
     */
    public void setMilitaryService(String militaryService) {
        this.militaryService = militaryService;
    }

    /**
     * Gets the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * 
     * @param address
     *            the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the handin card.
     * 
     * @return the handin card
     */
    public String getHandinCard() {
        return handinCard;
    }

    /**
     * Sets the handin card.
     * 
     * @param handinCard
     *            the new handin card
     */
    public void setHandinCard(String handinCard) {
        this.handinCard = handinCard;
    }

    /**
     * Gets the spouse area id.
     * 
     * @return the spouse area id
     */
    public String getSpouseAreaId() {
        return spouseAreaId;
    }

    /**
     * Sets the spouse area id.
     * 
     * @param spouseAreaId
     *            the new spouse area id
     */
    public void setSpouseAreaId(String spouseAreaId) {
        this.spouseAreaId = spouseAreaId;
    }

}

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
 * The Class Rl08b10DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08b10DTO", propOrder = { "name", "type", "changeType", "lineSpacing", "applyFromDate",
        "applyFromYear", "applyFromMonth", "applyFromDay", "applyToDate", "applyToYear", "applyToMonth", "applyToDay",
        "villageList", "village", "order1", "order2", "birthFromDate", "birthFromYear", "birthFromMonth",
        "birthFromDay", "birthToDate", "birthToYear", "birthToMonth", "birthToDay", "gender", "Identity", "aboriginal",
        "race", "fetalType", "fetalOrder", "birthType", "deliveredByIdentity", "birthLocation", "birthLocationNature",
        "conceiveWeeks", "weight", "address", "fBirthFromDate", "fBirthFromYear", "fBirthFromMonth", "fBirthFromDay",
        "fBirthToDate", "fBirthToYear", "fBirthToMonth", "fBirthToDay", "fAboriginal", "fRace", "fEducationStart",
        "fNationality", "mBirthFromDate", "mBirthFromYear", "mBirthFromMonth", "mBirthFromDay", "mBirthToDate",
        "mBirthToYear", "mBirthToMonth", "mBirthToDay", "mAboriginal", "mRace", "mEducationStart", "mNationality",
        "marriageFromDate", "marriageFromYear", "marriageFromMonth", "marriageFromDay", "marriageToDate",
        "marriageToYear", "marriageToMonth", "marriageToDay", "certificate" })
@XmlRootElement(name = "Rl08b10DTO")
public class Rl08b10DTO implements Serializable {

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

    /** 性別. */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 出生身分. */
    @XmlElement(name = "Identity", required = true)
    @FieldName("出生身分")
    private String Identity;

    /** 原住民身分. */
    @XmlElement(name = "Aboriginal", required = true)
    @FieldName("原住民身分")
    private String aboriginal;

    /** 族別. */
    @XmlElement(name = "Race", required = true)
    @FieldName("族別")
    private String race;

    /** 胎別. */
    @XmlElement(name = "FetalType", required = true)
    @FieldName("胎別")
    private String fetalType;

    /** 胎次. */
    @XmlElement(name = "FetalOrder", required = true)
    @FieldName("胎次")
    private String fetalOrder;

    /** 出生別. */
    @XmlElement(name = "BirthType", required = true)
    @FieldName("出生別")
    private String birthType;

    /** 接生者身分. */
    @XmlElement(name = "DeliveredByIdentity", required = true)
    @FieldName("接生者身分")
    private String deliveredByIdentity;

    /** 出生地. */
    @XmlElement(name = "BirthLocation", required = true)
    @FieldName("出生地")
    private String birthLocation;

    /** 出生場所性質. */
    @XmlElement(name = "BirthLocationNature", required = true)
    @FieldName("出生場所性質")
    private String birthLocationNature;

    /** 懷胎週數. */
    @XmlElement(name = "ConceiveWeeks", required = true)
    @FieldName("懷胎週數")
    private String conceiveWeeks;

    /** 出生體重. */
    @XmlElement(name = "Weight", required = true)
    @FieldName("出生體重")
    private String weight;

    /** 街路門牌. */
    @XmlElement(name = "Address", required = true)
    @FieldName("街路門牌")
    private String address;

    /** 父出生日期起. */
    @XmlElement(name = "FBirthFromDate", required = true)
    @FieldName("父出生日期起")
    private Date fBirthFromDate;

    /** 父出生日期起(年). */
    @XmlElement(name = "FBirthFromYear", required = true)
    @FieldName("父出生日期起(年)")
    private String fBirthFromYear;

    /** 父出生日期起 (月). */
    @XmlElement(name = "FBirthFromMonth", required = true)
    @FieldName("父出生日期起 (月)")
    private String fBirthFromMonth;

    /** 父出生日期起(日). */
    @XmlElement(name = "FBirthFromDay", required = true)
    @FieldName("父出生日期起(日)")
    private String fBirthFromDay;

    /** 父出生日期迄. */
    @XmlElement(name = "FBirthToDate", required = true)
    @FieldName("父出生日期迄")
    private Date fBirthToDate;

    /** 父出生日期迄(年). */
    @XmlElement(name = "FBirthToYear", required = true)
    @FieldName("父出生日期迄(年)")
    private String fBirthToYear;

    /** 父出生日期迄(月). */
    @XmlElement(name = "FBirthToMonth", required = true)
    @FieldName("父出生日期迄(月)")
    private String fBirthToMonth;

    /** 父出生日期迄(日). */
    @XmlElement(name = "FBirthToDay", required = true)
    @FieldName("父出生日期迄(日)")
    private String fBirthToDay;

    /** 父 原住民身分. */
    @XmlElement(name = "FAboriginal", required = true)
    @FieldName("父 原住民身分")
    private String fAboriginal;

    /** 父 族別. */
    @XmlElement(name = "FRace", required = true)
    @FieldName("父 族別")
    private String fRace;

    /** 父 教育程度. */
    @XmlElement(name = "FEducationStart", required = true)
    @FieldName("父 教育程度")
    private String fEducationStart;

    /** 父 國籍或區域代碼. */
    @XmlElement(name = "FNationality", required = true)
    @FieldName("父 國籍或區域代碼")
    private String fNationality;

    /** 母 出生日期起. */
    @XmlElement(name = "MBirthFromDate", required = true)
    @FieldName("母 出生日期起")
    private Date mBirthFromDate;

    /** 母 出生日期起(年). */
    @XmlElement(name = "MBirthFromYear", required = true)
    @FieldName("母 出生日期起(年)")
    private String mBirthFromYear;

    /** 母 出生日期起(月). */
    @XmlElement(name = "MBirthFromMonth", required = true)
    @FieldName("母 出生日期起(月)")
    private String mBirthFromMonth;

    /** 母 出生日期起(日). */
    @XmlElement(name = "MBirthFromDay", required = true)
    @FieldName("母 出生日期起(日)")
    private String mBirthFromDay;

    /** 母 出生日期迄. */
    @XmlElement(name = "MBirthToDate", required = true)
    @FieldName("母 出生日期迄")
    private Date mBirthToDate;

    /** 母 出生日期迄(年). */
    @XmlElement(name = "MBirthToYear", required = true)
    @FieldName("母 出生日期迄(年)")
    private String mBirthToYear;

    /** 母 出生日期迄(月). */
    @XmlElement(name = "MBirthToMonth", required = true)
    @FieldName("母 出生日期迄(月)")
    private String mBirthToMonth;

    /** 母 出生日期迄(日). */
    @XmlElement(name = "MBirthToDay", required = true)
    @FieldName("母 出生日期迄(日)")
    private String mBirthToDay;

    /** 母 原住民身分. */
    @XmlElement(name = "MAboriginal", required = true)
    @FieldName("母 原住民身分")
    private String mAboriginal;

    /** 母 族別. */
    @XmlElement(name = "MRace", required = true)
    @FieldName("母 族別")
    private String mRace;

    /** 母 教育程度. */
    @XmlElement(name = "MEducationStart", required = true)
    @FieldName("母 教育程度")
    private String mEducationStart;

    /** 母 國籍或區域代碼. */
    @XmlElement(name = "MNationality", required = true)
    @FieldName("母 國籍或區域代碼")
    private String mNationality;

    /** 父母結婚日期起. */
    @XmlElement(name = "MarriageFromDate", required = true)
    @FieldName("父母結婚日期起")
    private Date marriageFromDate;

    /** 父母結婚日期起(年). */
    @XmlElement(name = "MarriageFromYear", required = true)
    @FieldName("父母結婚日期起(年)")
    private String marriageFromYear;

    /** 父母結婚日期起(月). */
    @XmlElement(name = "MarriageFromMonth", required = true)
    @FieldName("父母結婚日期起(月)")
    private String marriageFromMonth;

    /** 父母結婚日期起(日). */
    @XmlElement(name = "MarriageFromDay", required = true)
    @FieldName("父母結婚日期起(日)")
    private String marriageFromDay;

    /** 父母結婚日期迄. */
    @XmlElement(name = "MarriageToDate", required = true)
    @FieldName("父母結婚日期迄")
    private Date marriageToDate;

    /** 父母結婚日期迄(年). */
    @XmlElement(name = "MarriageToYear", required = true)
    @FieldName("父母結婚日期迄(年)")
    private String marriageToYear;

    /** 父母結婚日期迄(月). */
    @XmlElement(name = "MarriageToMonth", required = true)
    @FieldName("父母結婚日期迄(月)")
    private String marriageToMonth;

    /** 父母結婚日期迄(日). */
    @XmlElement(name = "MarriageToDay", required = true)
    @FieldName("父母結婚日期迄(日)")
    private String marriageToDay;

    /** 附繳證件. */
    @XmlElement(name = "Certificate", required = true)
    @FieldName("附繳證件")
    private String certificate;

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
     * Gets the identity.
     * 
     * @return the identity
     */
    public String getIdentity() {
        return Identity;
    }

    /**
     * Sets the identity.
     * 
     * @param identity
     *            the new identity
     */
    public void setIdentity(String identity) {
        Identity = identity;
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
     * Gets the fetal type.
     * 
     * @return the fetal type
     */
    public String getFetalType() {
        return fetalType;
    }

    /**
     * Sets the fetal type.
     * 
     * @param fetalType
     *            the new fetal type
     */
    public void setFetalType(String fetalType) {
        this.fetalType = fetalType;
    }

    /**
     * Gets the fetal order.
     * 
     * @return the fetal order
     */
    public String getFetalOrder() {
        return fetalOrder;
    }

    /**
     * Sets the fetal order.
     * 
     * @param fetalOrder
     *            the new fetal order
     */
    public void setFetalOrder(String fetalOrder) {
        this.fetalOrder = fetalOrder;
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
     * Gets the delivered by identity.
     * 
     * @return the delivered by identity
     */
    public String getDeliveredByIdentity() {
        return deliveredByIdentity;
    }

    /**
     * Sets the delivered by identity.
     * 
     * @param deliveredByIdentity
     *            the new delivered by identity
     */
    public void setDeliveredByIdentity(String deliveredByIdentity) {
        this.deliveredByIdentity = deliveredByIdentity;
    }

    /**
     * Gets the birth location.
     * 
     * @return the birth location
     */
    public String getBirthLocation() {
        return birthLocation;
    }

    /**
     * Sets the birth location.
     * 
     * @param birthLocation
     *            the new birth location
     */
    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    /**
     * Gets the birth location nature.
     * 
     * @return the birth location nature
     */
    public String getBirthLocationNature() {
        return birthLocationNature;
    }

    /**
     * Sets the birth location nature.
     * 
     * @param birthLocationNature
     *            the new birth location nature
     */
    public void setBirthLocationNature(String birthLocationNature) {
        this.birthLocationNature = birthLocationNature;
    }

    /**
     * Gets the conceive weeks.
     * 
     * @return the conceive weeks
     */
    public String getConceiveWeeks() {
        return conceiveWeeks;
    }

    /**
     * Sets the conceive weeks.
     * 
     * @param conceiveWeeks
     *            the new conceive weeks
     */
    public void setConceiveWeeks(String conceiveWeeks) {
        this.conceiveWeeks = conceiveWeeks;
    }

    /**
     * Gets the weight.
     * 
     * @return the weight
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the weight.
     * 
     * @param weight
     *            the new weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
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
     * Gets the f birth from date.
     * 
     * @return the f birth from date
     */
    public Date getfBirthFromDate() {
        return fBirthFromDate;
    }

    /**
     * Sets the f birth from date.
     * 
     * @param fBirthFromDate
     *            the new f birth from date
     */
    public void setfBirthFromDate(Date fBirthFromDate) {
        this.fBirthFromDate = fBirthFromDate;
    }

    /**
     * Gets the f birth from year.
     * 
     * @return the f birth from year
     */
    public String getfBirthFromYear() {
        return fBirthFromYear;
    }

    /**
     * Sets the f birth from year.
     * 
     * @param fBirthFromYear
     *            the new f birth from year
     */
    public void setfBirthFromYear(String fBirthFromYear) {
        this.fBirthFromYear = fBirthFromYear;
    }

    /**
     * Gets the f birth from month.
     * 
     * @return the f birth from month
     */
    public String getfBirthFromMonth() {
        return fBirthFromMonth;
    }

    /**
     * Sets the f birth from month.
     * 
     * @param fBirthFromMonth
     *            the new f birth from month
     */
    public void setfBirthFromMonth(String fBirthFromMonth) {
        this.fBirthFromMonth = fBirthFromMonth;
    }

    /**
     * Gets the f birth from day.
     * 
     * @return the f birth from day
     */
    public String getfBirthFromDay() {
        return fBirthFromDay;
    }

    /**
     * Sets the f birth from day.
     * 
     * @param fBirthFromDay
     *            the new f birth from day
     */
    public void setfBirthFromDay(String fBirthFromDay) {
        this.fBirthFromDay = fBirthFromDay;
    }

    /**
     * Gets the f birth to date.
     * 
     * @return the f birth to date
     */
    public Date getfBirthToDate() {
        return fBirthToDate;
    }

    /**
     * Sets the f birth to date.
     * 
     * @param fBirthToDate
     *            the new f birth to date
     */
    public void setfBirthToDate(Date fBirthToDate) {
        this.fBirthToDate = fBirthToDate;
    }

    /**
     * Gets the f birth to year.
     * 
     * @return the f birth to year
     */
    public String getfBirthToYear() {
        return fBirthToYear;
    }

    /**
     * Sets the f birth to year.
     * 
     * @param fBirthToYear
     *            the new f birth to year
     */
    public void setfBirthToYear(String fBirthToYear) {
        this.fBirthToYear = fBirthToYear;
    }

    /**
     * Gets the f birth to month.
     * 
     * @return the f birth to month
     */
    public String getfBirthToMonth() {
        return fBirthToMonth;
    }

    /**
     * Sets the f birth to month.
     * 
     * @param fBirthToMonth
     *            the new f birth to month
     */
    public void setfBirthToMonth(String fBirthToMonth) {
        this.fBirthToMonth = fBirthToMonth;
    }

    /**
     * Gets the f birth to day.
     * 
     * @return the f birth to day
     */
    public String getfBirthToDay() {
        return fBirthToDay;
    }

    /**
     * Sets the f birth to day.
     * 
     * @param fBirthToDay
     *            the new f birth to day
     */
    public void setfBirthToDay(String fBirthToDay) {
        this.fBirthToDay = fBirthToDay;
    }

    /**
     * Gets the f aboriginal.
     * 
     * @return the f aboriginal
     */
    public String getfAboriginal() {
        return fAboriginal;
    }

    /**
     * Sets the f aboriginal.
     * 
     * @param fAboriginal
     *            the new f aboriginal
     */
    public void setfAboriginal(String fAboriginal) {
        this.fAboriginal = fAboriginal;
    }

    /**
     * Gets the f race.
     * 
     * @return the f race
     */
    public String getfRace() {
        return fRace;
    }

    /**
     * Sets the f race.
     * 
     * @param fRace
     *            the new f race
     */
    public void setfRace(String fRace) {
        this.fRace = fRace;
    }

    /**
     * Gets the f education start.
     * 
     * @return the f education start
     */
    public String getfEducationStart() {
        return fEducationStart;
    }

    /**
     * Sets the f education start.
     * 
     * @param fEducationStart
     *            the new f education start
     */
    public void setfEducationStart(String fEducationStart) {
        this.fEducationStart = fEducationStart;
    }

    /**
     * Gets the f nationality.
     * 
     * @return the f nationality
     */
    public String getfNationality() {
        return fNationality;
    }

    /**
     * Sets the f nationality.
     * 
     * @param fNationality
     *            the new f nationality
     */
    public void setfNationality(String fNationality) {
        this.fNationality = fNationality;
    }

    /**
     * Gets the m birth from date.
     * 
     * @return the m birth from date
     */
    public Date getmBirthFromDate() {
        return mBirthFromDate;
    }

    /**
     * Sets the m birth from date.
     * 
     * @param mBirthFromDate
     *            the new m birth from date
     */
    public void setmBirthFromDate(Date mBirthFromDate) {
        this.mBirthFromDate = mBirthFromDate;
    }

    /**
     * Gets the m birth from year.
     * 
     * @return the m birth from year
     */
    public String getmBirthFromYear() {
        return mBirthFromYear;
    }

    /**
     * Sets the m birth from year.
     * 
     * @param mBirthFromYear
     *            the new m birth from year
     */
    public void setmBirthFromYear(String mBirthFromYear) {
        this.mBirthFromYear = mBirthFromYear;
    }

    /**
     * Gets the m birth from month.
     * 
     * @return the m birth from month
     */
    public String getmBirthFromMonth() {
        return mBirthFromMonth;
    }

    /**
     * Sets the m birth from month.
     * 
     * @param mBirthFromMonth
     *            the new m birth from month
     */
    public void setmBirthFromMonth(String mBirthFromMonth) {
        this.mBirthFromMonth = mBirthFromMonth;
    }

    /**
     * Gets the m birth from day.
     * 
     * @return the m birth from day
     */
    public String getmBirthFromDay() {
        return mBirthFromDay;
    }

    /**
     * Sets the m birth from day.
     * 
     * @param mBirthFromDay
     *            the new m birth from day
     */
    public void setmBirthFromDay(String mBirthFromDay) {
        this.mBirthFromDay = mBirthFromDay;
    }

    /**
     * Gets the m birth to date.
     * 
     * @return the m birth to date
     */
    public Date getmBirthToDate() {
        return mBirthToDate;
    }

    /**
     * Sets the m birth to date.
     * 
     * @param mBirthToDate
     *            the new m birth to date
     */
    public void setmBirthToDate(Date mBirthToDate) {
        this.mBirthToDate = mBirthToDate;
    }

    /**
     * Gets the m birth to year.
     * 
     * @return the m birth to year
     */
    public String getmBirthToYear() {
        return mBirthToYear;
    }

    /**
     * Sets the m birth to year.
     * 
     * @param mBirthToYear
     *            the new m birth to year
     */
    public void setmBirthToYear(String mBirthToYear) {
        this.mBirthToYear = mBirthToYear;
    }

    /**
     * Gets the m birth to month.
     * 
     * @return the m birth to month
     */
    public String getmBirthToMonth() {
        return mBirthToMonth;
    }

    /**
     * Sets the m birth to month.
     * 
     * @param mBirthToMonth
     *            the new m birth to month
     */
    public void setmBirthToMonth(String mBirthToMonth) {
        this.mBirthToMonth = mBirthToMonth;
    }

    /**
     * Gets the m birth to day.
     * 
     * @return the m birth to day
     */
    public String getmBirthToDay() {
        return mBirthToDay;
    }

    /**
     * Sets the m birth to day.
     * 
     * @param mBirthToDay
     *            the new m birth to day
     */
    public void setmBirthToDay(String mBirthToDay) {
        this.mBirthToDay = mBirthToDay;
    }

    /**
     * Gets the m aboriginal.
     * 
     * @return the m aboriginal
     */
    public String getmAboriginal() {
        return mAboriginal;
    }

    /**
     * Sets the m aboriginal.
     * 
     * @param mAboriginal
     *            the new m aboriginal
     */
    public void setmAboriginal(String mAboriginal) {
        this.mAboriginal = mAboriginal;
    }

    /**
     * Gets the m race.
     * 
     * @return the m race
     */
    public String getmRace() {
        return mRace;
    }

    /**
     * Sets the m race.
     * 
     * @param mRace
     *            the new m race
     */
    public void setmRace(String mRace) {
        this.mRace = mRace;
    }

    /**
     * Gets the m education start.
     * 
     * @return the m education start
     */
    public String getmEducationStart() {
        return mEducationStart;
    }

    /**
     * Sets the m education start.
     * 
     * @param mEducationStart
     *            the new m education start
     */
    public void setmEducationStart(String mEducationStart) {
        this.mEducationStart = mEducationStart;
    }

    /**
     * Gets the m nationality.
     * 
     * @return the m nationality
     */
    public String getmNationality() {
        return mNationality;
    }

    /**
     * Sets the m nationality.
     * 
     * @param mNationality
     *            the new m nationality
     */
    public void setmNationality(String mNationality) {
        this.mNationality = mNationality;
    }

    /**
     * Gets the marriage from date.
     * 
     * @return the marriage from date
     */
    public Date getMarriageFromDate() {
        return marriageFromDate;
    }

    /**
     * Sets the marriage from date.
     * 
     * @param marriageFromDate
     *            the new marriage from date
     */
    public void setMarriageFromDate(Date marriageFromDate) {
        this.marriageFromDate = marriageFromDate;
    }

    /**
     * Gets the marriage from year.
     * 
     * @return the marriage from year
     */
    public String getMarriageFromYear() {
        return marriageFromYear;
    }

    /**
     * Sets the marriage from year.
     * 
     * @param marriageFromYear
     *            the new marriage from year
     */
    public void setMarriageFromYear(String marriageFromYear) {
        this.marriageFromYear = marriageFromYear;
    }

    /**
     * Gets the marriage from month.
     * 
     * @return the marriage from month
     */
    public String getMarriageFromMonth() {
        return marriageFromMonth;
    }

    /**
     * Sets the marriage from month.
     * 
     * @param marriageFromMonth
     *            the new marriage from month
     */
    public void setMarriageFromMonth(String marriageFromMonth) {
        this.marriageFromMonth = marriageFromMonth;
    }

    /**
     * Gets the marriage from day.
     * 
     * @return the marriage from day
     */
    public String getMarriageFromDay() {
        return marriageFromDay;
    }

    /**
     * Sets the marriage from day.
     * 
     * @param marriageFromDay
     *            the new marriage from day
     */
    public void setMarriageFromDay(String marriageFromDay) {
        this.marriageFromDay = marriageFromDay;
    }

    /**
     * Gets the marriage to date.
     * 
     * @return the marriage to date
     */
    public Date getMarriageToDate() {
        return marriageToDate;
    }

    /**
     * Sets the marriage to date.
     * 
     * @param marriageToDate
     *            the new marriage to date
     */
    public void setMarriageToDate(Date marriageToDate) {
        this.marriageToDate = marriageToDate;
    }

    /**
     * Gets the marriage to year.
     * 
     * @return the marriage to year
     */
    public String getMarriageToYear() {
        return marriageToYear;
    }

    /**
     * Sets the marriage to year.
     * 
     * @param marriageToYear
     *            the new marriage to year
     */
    public void setMarriageToYear(String marriageToYear) {
        this.marriageToYear = marriageToYear;
    }

    /**
     * Gets the marriage to month.
     * 
     * @return the marriage to month
     */
    public String getMarriageToMonth() {
        return marriageToMonth;
    }

    /**
     * Sets the marriage to month.
     * 
     * @param marriageToMonth
     *            the new marriage to month
     */
    public void setMarriageToMonth(String marriageToMonth) {
        this.marriageToMonth = marriageToMonth;
    }

    /**
     * Gets the marriage to day.
     * 
     * @return the marriage to day
     */
    public String getMarriageToDay() {
        return marriageToDay;
    }

    /**
     * Sets the marriage to day.
     * 
     * @param marriageToDay
     *            the new marriage to day
     */
    public void setMarriageToDay(String marriageToDay) {
        this.marriageToDay = marriageToDay;
    }

    /**
     * Gets the certificate.
     * 
     * @return the certificate
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Sets the certificate.
     * 
     * @param certificate
     *            the new certificate
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

}

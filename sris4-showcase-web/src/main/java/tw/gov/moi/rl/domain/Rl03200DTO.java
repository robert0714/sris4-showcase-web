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
 * The Class Rl03200DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03200DTO", propOrder = { "personName", "queryScope", "birthYyymmdd", "village", "neighbor",
        "streetDoorPlate", "livingStyleMark", "violenceMark", "removeYyy", "query1", "query2", "query3", "selectedm",
        "selectedh", "mList", "hList", "errorList", "showVPFlag", "vpIdList", "vpIdString", "personBirthYyymmdd",
        "sealApplyContent" })
@XmlRootElement(name = "Rl03200DTO")
public class Rl03200DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 查詢範圍 */
    @FieldName("查詢範圍")
    @XmlElement(name = "QueryScope")
    private String queryScope;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "BirthYyymmdd")
    private String birthYyymmdd;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "Village")
    private String village;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "Neighbor")
    private String neighbor;

    /** 街路門牌 */
    @FieldName("街路門牌")
    @XmlElement(name = "StreetDoorPlate")
    private String streetDoorPlate;

    /** 原住民身分 */
    @FieldName("已檢核申請人非保護家庭暴力資料之相對人")
    @XmlElement(name = "LivingStyleMark")
    private String livingStyleMark;

    /** 已檢核申請人非保護家庭暴力資料之相對人 */
    @FieldName("已檢核申請人非保護家庭暴力資料之相對人")
    @XmlElement(name = "ViolenceMark")
    private String violenceMark;

    /** 除戶年份 */
    @FieldName("除戶年份")
    @XmlElement(name = "RemoveYyy")
    private String removeYyy;

    /** 查詢條件一 */
    @FieldName("查詢條件一")
    @XmlElement(name = "Query1")
    private String query1;

    /** 查詢條件二 */
    @FieldName("查詢條件二")
    @XmlElement(name = "Query2")
    private String query2;

    /** 查詢條件三 */
    @FieldName("查詢條件三")
    @XmlElement(name = "Query3")
    private String query3;

    /** 選取全戶資料 */
    @FieldName("選取除戶資料")
    @XmlElement(name = "Selectedm")
    private Rl03200mDTO selectedm;

    /** 選取除戶資料 */
    @FieldName("選取除戶資料")
    @XmlElement(name = "Selectedh")
    private Rl03200hDTO selectedh;

    /** 全戶資料清單 */
    @FieldName("全戶資料清單")
    @XmlElement(name = "MList")
    private List<Rl03200mDTO> mList = new ArrayList<Rl03200mDTO>();

    /** 除戶資料清單 */
    @FieldName("除戶資料清單")
    @XmlElement(name = "HList")
    private List<Rl03200hDTO> hList = new ArrayList<Rl03200hDTO>();

    /** 錯誤記錄 */
    @FieldName("錯誤記錄")
    @XmlElement(name = "ErrorList")
    private List<Rl03200ErrorDTO> errorList = new ArrayList<Rl03200ErrorDTO>();

    /** 家暴註記旗標 */
    @FieldName("家暴註記旗標")
    @XmlElement(name = "ShowVPFlag")
    private boolean showVPFlag = false;

    /** 家暴註記統號清單 */
    @FieldName("家暴註記統號清單")
    @XmlElement(name = "VpIdList")
    private List<String> vpIdList = new ArrayList<String>();

    /** 家暴註記統號字串 */
    @FieldName("家暴註記統號字串")
    @XmlElement(name = "VpIdString")
    private String vpIdString = "";

    /** 被選取人的出生日期. */
    @FieldName("被選取人的出生日期")
    @XmlElement(name = "PersonBirthYyymmdd")
    private String personBirthYyymmdd = "";

    /** 印鑑登記內容. */
    @FieldName("印鑑登記內容")
    @XmlElement(name = "SealApplyContent")
    private String sealApplyContent = "";

    @FieldName("查詢條件")
    @XmlElement(name = "QueryType")
    private String queryType = "0";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getQueryScope() {
        return queryScope;
    }

    public void setQueryScope(String queryScope) {
        this.queryScope = queryScope;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

    public String getLivingStyleMark() {
        return livingStyleMark;
    }

    public void setLivingStyleMark(String livingStyleMark) {
        this.livingStyleMark = livingStyleMark;
    }

    public String getViolenceMark() {
        return violenceMark;
    }

    public void setViolenceMark(String violenceMark) {
        this.violenceMark = violenceMark;
    }

    public String getRemoveYyy() {
        return removeYyy;
    }

    public void setRemoveYyy(String removeYyy) {
        this.removeYyy = removeYyy;
    }

    public String getQuery1() {
        return query1;
    }

    public void setQuery1(String query1) {
        this.query1 = query1;
    }

    public String getQuery2() {
        return query2;
    }

    public void setQuery2(String query2) {
        this.query2 = query2;
    }

    public String getQuery3() {
        return query3;
    }

    public void setQuery3(String query3) {
        this.query3 = query3;
    }

    public Rl03200mDTO getSelectedm() {
        return selectedm;
    }

    public void setSelectedm(Rl03200mDTO selectedm) {
        this.selectedm = selectedm;
    }

    public Rl03200hDTO getSelectedh() {
        return selectedh;
    }

    public void setSelectedh(Rl03200hDTO selectedh) {
        this.selectedh = selectedh;
    }

    public List<Rl03200mDTO> getmList() {
        return mList;
    }

    public void setmList(List<Rl03200mDTO> mList) {
        this.mList = mList;
    }

    public List<Rl03200hDTO> gethList() {
        return hList;
    }

    public void sethList(List<Rl03200hDTO> hList) {
        this.hList = hList;
    }

    public List<Rl03200ErrorDTO> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<Rl03200ErrorDTO> errorList) {
        this.errorList = errorList;
    }

    public boolean isShowVPFlag() {
        return showVPFlag;
    }

    public void setShowVPFlag(boolean showVPFlag) {
        this.showVPFlag = showVPFlag;
    }

    public List<String> getVpIdList() {
        return vpIdList;
    }

    public void setVpIdList(List<String> vpIdList) {
        this.vpIdList = vpIdList;
    }

    public String getVpIdString() {
        return vpIdString;
    }

    public void setVpIdString(String vpIdString) {
        this.vpIdString = vpIdString;
    }

    public String getPersonBirthYyymmdd() {
        return personBirthYyymmdd;
    }

    public void setPersonBirthYyymmdd(String personBirthYyymmdd) {
        this.personBirthYyymmdd = personBirthYyymmdd;
    }

    public String getSealApplyContent() {
        return sealApplyContent;
    }

    public void setSealApplyContent(String sealApplyContent) {
        this.sealApplyContent = sealApplyContent;
    }

}

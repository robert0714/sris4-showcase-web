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
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.dto.XLDFDomainDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFEmptyRemoveDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * 全戶基本資料DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFHouseholdDataDTO", propOrder = { "householdHeadId", "householdId", "areaCode", "adminOfficeCode",
        "householdType", "village", "neighbor", "streetDoorplate", "section", "area", "lane", "alley", "doorNo",
        "xplace", "yplace", "concurrentHeadMark" })
public abstract class XLDFHouseholdDataDTO implements XLDFDomainDTO, Serializable {

    private static final long serialVersionUID = 1L;

    /** site id */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 行政區域代碼 */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼 */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 戶別代碼 */
    @XmlElement(name = "HouseholdType", required = true)
    @FieldName("戶別代碼")
    private String householdType;

    /** 村里 */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate", required = true)
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** 街(路段) */
    @XmlElement(name = "Section", required = true)
    @FieldName("街(路段)")
    private String section;

    /** 地區 */
    @XmlElement(name = "Area", required = true)
    @FieldName("地區")
    private String area;

    /** 巷 */
    @XmlElement(name = "Lane", required = true)
    @FieldName("巷")
    private String lane;

    /** 弄(衖、衕) */
    @XmlElement(name = "Alley", required = true)
    @FieldName("弄(衖、衕)")
    private String alley;

    /** 門牌號 */
    @XmlElement(name = "DoorNo", required = true)
    @FieldName("門牌號")
    private String doorNo;

    /** 橫座標 */
    @XmlElement(name = "Xplace", required = true)
    @FieldName("橫座標")
    private String xplace;

    /** 縱座標 */
    @XmlElement(name = "Yplace", required = true)
    @FieldName("縱座標")
    private String yplace;

    /** 兼任戶長註記 */
    @XmlElement(name = "ConcurrentHeadMark", required = true)
    @FieldName("兼任戶長註記")
    private String concurrentHeadMark;

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public String getAlley() {
        return alley;
    }

    public String getArea() {
        return area;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getConcurrentHeadMark() {
        return concurrentHeadMark;
    }

    /**
     * 取得行政區域代碼前5碼
     * 
     * @return String
     */
    public String getCountyCode() {
        String result = RlConstant.EMPTY_STRING;
        if (StringUtils.isNotEmpty(areaCode)) {
            result = areaCode.substring(0, 5);
        }
        return result;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public String getHouseholdType() {
        return householdType;
    }

    public String getLane() {
        return lane;
    }

    public String getNeighbor() {
        return neighbor;
    }

    /**
     * 取得除戶簿頁
     * 
     * @return XLDFRemoveDTO
     */
    public XLDFRemoveDTO getRemoveDTO() {
        return XLDFEmptyRemoveDTO.getInstance();
    }

    public String getSection() {
        return section;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * 取得行政區域代碼6-8碼
     * 
     * @return
     */
    public String getTownCode() {
        String result = RlConstant.EMPTY_STRING;
        if (StringUtils.isNotEmpty(areaCode)) {
            result = areaCode.substring(5, 8);
        }
        return result;
    }

    public String getVillage() {
        return village;
    }

    public String getXplace() {
        return xplace;
    }

    public String getYplace() {
        return yplace;
    }

    public void setAdminOfficeCode(final String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public void setAlley(final String alley) {
        this.alley = alley;
    }

    public void setArea(final String area) {
        this.area = area;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public void setConcurrentHeadMark(final String concurrentHeadMark) {
        this.concurrentHeadMark = concurrentHeadMark;
    }

    public void setDoorNo(final String doorNo) {
        this.doorNo = doorNo;
    }

    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    public void setHouseholdType(final String householdType) {
        this.householdType = householdType;
    }

    public void setLane(final String lane) {
        this.lane = lane;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public void setSection(final String section) {
        this.section = section;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public void setStreetDoorplate(final String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public void setXplace(final String xplace) {
        this.xplace = xplace;
    }

    public void setYplace(final String yplace) {
        this.yplace = yplace;
    }

}

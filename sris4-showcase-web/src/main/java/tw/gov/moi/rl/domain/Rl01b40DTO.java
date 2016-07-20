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
 * The Class Rl01b40DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01b40DTO", propOrder = { "victimId", "victimRldf004m", "victimSettleSiteId", "victimName",
        "violatorId", "violatorName", "registerYyymmdd", "beginYyymmdd", "endYyymmdd", "siteId", "areaCode",
        "adminOfficeCode", "stateFlag", "registerSiteId", "registrarName", "closeYyymmdd", "closeSiteId", "closeName",
        "reservedField", "violatorSiteId", "noEndYyymmdd" })
@XmlRootElement(name = "Rl01b40DTO")
public class Rl01b40DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 被保護人統號. */
    @XmlElement(name = "VictimId")
    @FieldName("被保護人統號")
    private String victimId = "";

    /** 被保護人個人基本資料. */
    @XmlElement(name = "VictimRldf004m")
    @FieldName("被保護人個人基本資料")
    private Rldf004mType victimRldf004m;

    /** 被保護人作業點代碼. */
    @XmlElement(name = "VictimSettleSiteId")
    @FieldName("被保護人作業點代碼")
    private String victimSettleSiteId;

    /** 被保護人姓名. */
    @XmlElement(name = "VictimName")
    @FieldName("被保護人姓名")
    private String victimName = "";

    /** 相對人統號. */
    @XmlElement(name = "ViolatorId")
    @FieldName("相對人統號")
    private String violatorId = "";

    /** 相對人姓名. */
    @XmlElement(name = "ViolatorName")
    @FieldName("相對人姓名")
    private String violatorName = "";

    /** 申請日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("申請日期")
    private String registerYyymmdd = "";

    /** 保護令起始日期. */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("保護令起始日期")
    private String beginYyymmdd = "";

    /** 保護令終止日期. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("保護令終止日期")
    private String endYyymmdd = "";

    /** The rldf049m types. */
    @XmlElement(name = "Rldf049mTypes")
    @FieldName("被保護人家暴資料List")
    private List<Rldf049mType> rldf049mTypes = new ArrayList<Rldf049mType>();

    /** The rldf049m type. */
    @XmlElement(name = "Rldf049mType")
    @FieldName("被保護人家暴資料")
    private Rldf049mType rldf049mType;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode = "";

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶所代碼")
    private String adminOfficeCode = "";

    /** 資料狀態. */
    @XmlElement(name = "StateFlag")
    @FieldName("資料狀態")
    private String stateFlag = "";

    /** 登記戶所代碼. */
    @XmlElement(name = "RegisterSiteId")
    @FieldName("登記戶所代碼")
    private String registerSiteId = "";

    /** 登記戶籍員姓名. */
    @XmlElement(name = "RegistrarName")
    @FieldName("登記戶籍員姓名")
    private String registrarName = "";

    /** 結案日期. */
    @XmlElement(name = "CloseYyymmdd")
    @FieldName("結案日期")
    private String closeYyymmdd = "";

    /** 結案戶所代碼. */
    @XmlElement(name = "CloseSiteId")
    @FieldName("結案戶所代碼")
    private String closeSiteId = "";

    /** 結案戶籍員姓名. */
    @XmlElement(name = "CloseName")
    @FieldName("結案戶籍員姓名")
    private String closeName = "";

    /** 保留欄位. */
    @XmlElement(name = "ReservedField")
    @FieldName("保留欄位")
    private String reservedField = "";

    // /** 被保護人作業點代碼. */
    // @XmlElement(name = "VictimSiteId")
    // @FieldName("被保護人作業點代碼")
    // private String victimSiteId = "";

    /** 查詢結果. */
    // @XmlElement(name = "ResultList")
    // @FieldName("查詢結果")
    // private List<Rl01b40DTO> resultList = new ArrayList<Rl01b40DTO>();

    /** 刪除物件. */
    @XmlElement(name = "DeleteList")
    @FieldName("刪除物件")
    private List<Rl01b40DTO> deleteList = new ArrayList<Rl01b40DTO>();

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
    public void setVictimId(String victimId) {
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
    public void setViolatorId(String violatorId) {
        this.violatorId = violatorId;
    }

    /**
     * Gets the violator name.
     * 
     * @return the violator name
     */
    public String getViolatorName() {
        return violatorName;
    }

    /**
     * Sets the violator name.
     * 
     * @param violatorName
     *            the new violator name
     */
    public void setViolatorName(String violatorName) {
        this.violatorName = violatorName;
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
    public void setBeginYyymmdd(String beginYyymmdd) {
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
    public void setEndYyymmdd(String endYyymmdd) {
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
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the state flag.
     * 
     * @return the state flag
     */
    public String getStateFlag() {
        return stateFlag;
    }

    /**
     * Sets the state flag.
     * 
     * @param stateFlag
     *            the new state flag
     */
    public void setStateFlag(String stateFlag) {
        this.stateFlag = stateFlag;
    }

    /**
     * Gets the register site id.
     * 
     * @return the register site id
     */
    public String getRegisterSiteId() {
        return registerSiteId;
    }

    /**
     * Sets the register site id.
     * 
     * @param registerSiteId
     *            the new register site id
     */
    public void setRegisterSiteId(String registerSiteId) {
        this.registerSiteId = registerSiteId;
    }

    /**
     * Gets the registrar name.
     * 
     * @return the registrar name
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * Sets the registrar name.
     * 
     * @param registrarName
     *            the new registrar name
     */
    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    /**
     * Gets the close yyymmdd.
     * 
     * @return the close yyymmdd
     */
    public String getCloseYyymmdd() {
        return closeYyymmdd;
    }

    /**
     * Sets the close yyymmdd.
     * 
     * @param closeYyymmdd
     *            the new close yyymmdd
     */
    public void setCloseYyymmdd(String closeYyymmdd) {
        this.closeYyymmdd = closeYyymmdd;
    }

    /**
     * Gets the close site id.
     * 
     * @return the close site id
     */
    public String getCloseSiteId() {
        return closeSiteId;
    }

    /**
     * Sets the close site id.
     * 
     * @param closeSiteId
     *            the new close site id
     */
    public void setCloseSiteId(String closeSiteId) {
        this.closeSiteId = closeSiteId;
    }

    /**
     * Gets the close name.
     * 
     * @return the close name
     */
    public String getCloseName() {
        return closeName;
    }

    /**
     * Sets the close name.
     * 
     * @param closeName
     *            the new close name
     */
    public void setCloseName(String closeName) {
        this.closeName = closeName;
    }

    /**
     * Gets the reserved field.
     * 
     * @return the reserved field
     */
    public String getReservedField() {
        return reservedField;
    }

    /**
     * Sets the reserved field.
     * 
     * @param reservedField
     *            the new reserved field
     */
    public void setReservedField(String reservedField) {
        this.reservedField = reservedField;
    }

    // /**
    // * Gets the victim site id.
    // *
    // * @return the victim site id
    // */
    // public String getVictimSiteId() {
    // return victimSiteId;
    // }
    //
    // /**
    // * Sets the victim site id.
    // *
    // * @param victimSiteId
    // * the new victim site id
    // */
    // public void setVictimSiteId(String victimSiteId) {
    // this.victimSiteId = victimSiteId;
    // }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl01b40DTO [victimId=" + victimId + ", victimName=" + victimName + ", violatorId=" + violatorId
                + ", violatorName=" + violatorName + ", registerYyymmdd=" + registerYyymmdd + ", beginYyymmdd="
                + beginYyymmdd + ", endYyymmdd=" + endYyymmdd + ", siteId=" + siteId + ", areaCode=" + areaCode
                + ", adminOfficeCode=" + adminOfficeCode + ", stateFlag=" + stateFlag + ", registerSiteId="
                + registerSiteId + ", registrarName=" + registrarName + ", closeYyymmdd=" + closeYyymmdd
                + ", closeSiteId=" + closeSiteId + ", closeName=" + closeName + ", reservedField=" + reservedField
                // + ", victimSiteId=" + victimSiteId + "]";
                + "]";
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    // public List<Rl01b40DTO> getResultList() {
    // return resultList;
    // }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    // public void setResultList(List<Rl01b40DTO> resultList) {
    // this.resultList = resultList;
    // }

    /**
     * Gets the delete list.
     * 
     * @return the delete list
     */
    public List<Rl01b40DTO> getDeleteList() {
        return deleteList;
    }

    /**
     * Sets the delete list.
     * 
     * @param deleteList
     *            the new delete list
     */
    public void setDeleteList(List<Rl01b40DTO> deleteList) {
        this.deleteList = deleteList;
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

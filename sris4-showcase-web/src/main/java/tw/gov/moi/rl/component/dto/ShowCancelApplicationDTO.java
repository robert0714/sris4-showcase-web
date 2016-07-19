/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 撤銷類選擇欲撤銷申請書呈現DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showCancelApplicationDTO", propOrder = { "personId", "personName", "registerYyymdd", "registerTime",
        "acceptAdminOfficeCode", "canBeSelected", "canBeViewed" })
@XmlRootElement(name = "ShowCancelApplicationDTO")
public class ShowCancelApplicationDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** personId 統號 */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** personName 姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** registerYyymdd 登記日期 */
    @XmlElement(name = "RegisterYyymdd")
    @FieldName("登記日期")
    private String registerYyymdd;

    /** RegisterTime 登記時間 */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** AcceptAdminOfficeCode 受理地戶所代碼 */
    @XmlElement(name = "acceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** canBeSelected 是否可被勾選 */
    @XmlElement(name = "CanBeSelected")
    @FieldName("是否可被勾選")
    private boolean canBeSelected;

    /** canBeViewed 是否可被檢視 */
    @XmlElement(name = "CanBeViewed")
    @FieldName("是否可被檢視")
    private boolean canBeViewed;

    public ShowCancelApplicationDTO() {
        super();

    }

    public ShowCancelApplicationDTO(String personId, String personName, String registerYyymdd, String registerTime,
            String acceptAdminOfficeCode, boolean canBeSelected, boolean canBeViewed) {
        super();
        this.personId = personId;
        this.personName = personName;
        this.registerYyymdd = registerYyymdd;
        this.registerTime = registerTime;
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
        this.canBeSelected = canBeSelected;
        this.canBeViewed = canBeViewed;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName
     *            the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return the registerYyymdd
     */
    public String getRegisterYyymdd() {
        return registerYyymdd;
    }

    /**
     * @param registerYyymdd
     *            the registerYyymdd to set
     */
    public void setRegisterYyymdd(String registerYyymdd) {
        this.registerYyymdd = registerYyymdd;
    }

    /**
     * @return the registerTime
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime
     *            the registerTime to set
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * @return the acceptAdminOfficeCode
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * @param acceptAdminOfficeCode
     *            the acceptAdminOfficeCode to set
     */
    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * @return the canBeSelected
     */
    public boolean isCanBeSelected() {
        return canBeSelected;
    }

    /**
     * @param canBeSelected
     *            the canBeSelected to set
     */
    public void setCanBeSelected(boolean canBeSelected) {
        this.canBeSelected = canBeSelected;
    }

    /**
     * @return the canBeViewed
     */
    public boolean isCanBeViewed() {
        return canBeViewed;
    }

    /**
     * @param canBeViewed
     *            the canBeViewed to set
     */
    public void setCanBeViewed(boolean canBeViewed) {
        this.canBeViewed = canBeViewed;
    }

}

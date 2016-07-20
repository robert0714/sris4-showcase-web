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

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 全國個人概要資料查詢處理DTO
 * 
 * @author David Wu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03910DTO", propOrder = { "siteId", "queryMode", "personId", "applyPersonId", "personName",
        "applyPersonName", "applyDate", "applyTime", "birthdayYear", "birthdayStartMonth", "birthdayEndMonth",
        "applyReasonById", "applyReasonByName", "isPermitted", "resultList", "personData" })
@XmlRootElement(name = "Rl03910DTO")
public class Rl03910DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1429524471973317341L;
    
    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId = "";
    
    @XmlElement(name = "QueryMode", required = true)
    @FieldName("查詢方式")
    private String queryMode = "";

    @XmlElement(name = "PersonId", required = false)
    @FieldName("統一編號")
    private String personId = "";

    @XmlElement(name = "ApplyPersonId", required = false)
    @FieldName("申請查詢之統一編號")
    private String applyPersonId = "";

    @XmlElement(name = "PersonName", required = false)
    @FieldName("姓名")
    private String personName = "";

    @XmlElement(name = "ApplyPersonName", required = false)
    @FieldName("姓名")
    private String applyPersonName = "";

    @XmlElement(name = "BirthdayYear", required = false)
    @FieldName("出生日期(年)")
    private String birthdayYear = "";
    
    @XmlElement(name = "BirthdayStartMonth", required = false)
    @FieldName("出生日期(月：起)")
    private String birthdayStartMonth = "";

    @XmlElement(name = "BirthdayEndMonth", required = false)
    @FieldName("出生日期(月：迄)")
    private String birthdayEndMonth = "";

    @XmlElement(name = "ApplyReasonById", required = false)
    @FieldName("申請原因(統號查詢)")
    private String applyReasonById = "";

    @XmlElement(name = "ApplyReasonByName", required = false)
    @FieldName("申請原因(姓名查詢)")
    private String applyReasonByName = "";
    
    @XmlElement(name = "ApplyDate", required = false)
    @FieldName("申請日期")
    private String applyDate = "";

    @XmlElement(name = "ApplyTime", required = false)
    @FieldName("申請時間")
    private String applyTime = "";

    @XmlElement(name = "IsPermitted", required = false)
    @FieldName("是否申請")
    private boolean isPermitted = false;
    
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果(存放RCDF001M或RLDF004M)")
    private List<Rl03910ResultDTO> resultList;
    
    @XmlElement(name = "PersonData")
    @FieldName("個人詳細資料檔")
    private Rl03910ResultDTO personData;

    private static final Logger log = LoggerFactory.getLogger(Rl03910DTO.class);
    
    public Rl03910DTO() {
        log.debug("Rl03910DTO is newed.");
        this.toString();
    }
    
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
    
    public String getQueryMode() {
        return queryMode;
    }

    public void setQueryMode(String queryMode) {
        this.queryMode = queryMode;
    }
    
    /**
     * Gets the person id.
     *
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     *
     * @param personId the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    
    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getApplyPersonName() {
        return applyPersonName;
    }

    public void setApplyPersonName(String applyPersonName) {
        this.applyPersonName = applyPersonName;
    }
    
    public String getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public String getBirthdayStartMonth() {
        return birthdayStartMonth;
    }

    public void setBirthdayStartMonth(String birthdayStartMonth) {
        this.birthdayStartMonth = birthdayStartMonth;
    }

    public String getBirthdayEndMonth() {
        return birthdayEndMonth;
    }

    public void setBirthdayEndMonth(String birthdayEndMonth) {
        this.birthdayEndMonth = birthdayEndMonth;
    }

    public String getApplyReasonById() {
        return applyReasonById;
    }

    public void setApplyReasonById(String applyReasonById) {
        this.applyReasonById = applyReasonById;
    }

    public String getApplyReasonByName() {
        return applyReasonByName;
    }

    public void setApplyReasonByName(String applyReasonByName) {
        this.applyReasonByName = applyReasonByName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public boolean isPermitted() {
        return isPermitted;
    }

    public void setPermitted(boolean isPermitted) {
        this.isPermitted = isPermitted;
    }

    public List<Rl03910ResultDTO> getResultList() {
        if(resultList == null){
            resultList = new ArrayList<Rl03910ResultDTO>();
        }
        return resultList;
    }

    public void setResultList(List<Rl03910ResultDTO> resultList) {
        this.resultList = resultList;
    }

    public Rl03910ResultDTO getPersonData() {
        if (personData == null) {
            personData = new Rl03910ResultDTO();
        }
        return personData;
    }

    public void setPersonData(Rl03910ResultDTO personData) {
        this.personData = personData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    public void clean() {
        this.applyDate = "";
        this.applyPersonId = "";
        this.applyPersonName = "";
        this.applyReasonById = "";
        this.applyReasonByName = "";
        this.applyTime = "";
        this.birthdayEndMonth = "";
        this.birthdayStartMonth = "";
        this.birthdayYear = "";
        this.personData = null;
        this.personId = "";
        this.personName = "";
        this.resultList = null;
        this.siteId = "";
    }
}

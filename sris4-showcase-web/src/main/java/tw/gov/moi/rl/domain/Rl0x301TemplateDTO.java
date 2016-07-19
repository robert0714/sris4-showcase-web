/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import tw.gov.moi.rs.annotations.FieldDescription;

/**
 * 全戶記事TemplateDTO
 * 
 * @author Marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emoveOldDataDTO", propOrder = { 
  "householdHeadId","householdId","applyDate","applyTime",
 "fields", "registerDate","registerTime"})
@XmlRootElement(name = "RemoveOldDataDTO")
public class Rl0x301TemplateDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldDescription(desc = "戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId")
    @FieldDescription(desc = "戶號")
    private String householdId;

    /** 登記日期 */
    @XmlElement(name = "applyDate")
    @FieldDescription(desc = "登記日期")
    private String applyDate;

    /**登記時間 */
    @XmlElement(name = "applyTime")
    @FieldDescription(desc = "登記時間")
    private String applyTime;
    
    /** 欄位修改資料 */
    @XmlElement(name = "fields")
    @FieldDescription(desc = "欄位修改資料")
    private String fields;
        
    /** 處理日期 */
    @XmlElement(name = "registerDate")
    @FieldDescription(desc = "處理日期")
    private String registerDate;
    
    /** 處理時間  */
    @XmlElement(name = "registerTime")
    @FieldDescription(desc = "處理時間 ")
    private String registerTime;


    public Rl0x301TemplateDTO (){
    }


    public String getHouseholdHeadId() {
        return this.householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return this.householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getApplyDate() {
        return this.applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return this.applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getFields() {
        return this.fields;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }


    public String getRegisterDate() {
        return this.registerDate;
    }


    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return this.registerTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}

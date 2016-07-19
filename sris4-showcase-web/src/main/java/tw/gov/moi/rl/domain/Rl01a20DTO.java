/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl01a20DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a20DTO", propOrder = { "personId", "siteId", "siteIdQuery", "rldf001mObj", "rldf004mObj",
        "rl01a20EditDto", "deleteArr", "editList", "templateWording" })
@XmlRootElement(name = "Rl01a20DTO")
public class Rl01a20DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteIdQuery", required = true)
    @FieldName("作業點代碼")
    private String siteIdQuery;
    /** 編修項目 */
    @XmlElement(name = "Rl01a20EditDto", required = true)
    @FieldName("編修項目")
    private Rl01a20EditDTO rl01a20EditDto;

    /** 刪除項目 */
    @XmlElement(name = "DeleteArr", required = true)
    @FieldName("刪除項目")
    private Rl01a20EditDTO[] deleteArr;

    /** 新增清單 */
    @XmlElement(name = "EditList", required = true)
    @FieldName("新增清單")
    private List<Rl01a20EditDTO> editList;
    
    /** 樣板文字 */
    @XmlElement(name = "templateWording", required = true)
    @FieldName("樣板文字")
    private String templateWording;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public Rl01a20EditDTO getRl01a20EditDto() {
        return rl01a20EditDto;
    }

    public void setRl01a20EditDto(final Rl01a20EditDTO rl01a20EditDto) {
        this.rl01a20EditDto = rl01a20EditDto;
    }

    public List<Rl01a20EditDTO> getEditList() {
        return editList;
    }

    public void setEditList(final List<Rl01a20EditDTO> editList) {
        this.editList = editList;
    }

    public Rl01a20EditDTO[] getDeleteArr() {
        return deleteArr;
    }

    public void setDeleteArr(final Rl01a20EditDTO[] deleteArr) {
        this.deleteArr = deleteArr;
    }

    public String getSiteIdQuery() {
        return siteIdQuery;
    }

    public void setSiteIdQuery(final String siteIdQuery) {
        this.siteIdQuery = siteIdQuery;
    }

    public String getTemplateWording() {
        return templateWording;
    }

    public void setTemplateWording(String templateWording) {
        this.templateWording = templateWording;
    }
    

}

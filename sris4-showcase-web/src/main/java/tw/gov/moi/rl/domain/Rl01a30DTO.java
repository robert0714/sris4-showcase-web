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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl01a30DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a30DTO", propOrder = { "personId", "siteId", "siteIdQuery", "rldf001mObj", "rldf004mObj",
        "modifyObj", "deleteArr", "queryList", "confirmSaveMessage" ,"rldf030tExist"})
@XmlRootElement(name = "Rl01a30DTO")
public class Rl01a30DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 細節項目 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("編修項目")
    private Rl01a30EditDTO modifyObj;

    /** 查詢清單 */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("查詢清單")
    private List<Rl01a30EditDTO> queryList;

    /** rldf001m資料 */
    @XmlElement(name = "Rldf001mObj", required = true)
    @FieldName("rldf001m資料")
    private Rldf001mType rldf001mObj;

    /** rldf004m資料 */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("rldf004m資料")
    private Rldf004mType rldf004mObj;

    /** Confirm 儲存訊息 */
    @XmlElement(name = "ConfirmSaveMessage", required = true)
    @FieldName("Confirm 儲存訊息")
    private String confirmSaveMessage;    
    
    @XmlElement(name = "Rldf030tExist")
    @FieldName("行政協助是否存在")
    private boolean rldf030tExist ;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public Rl01a30EditDTO getModifyObj() {
        return modifyObj;
    }

    public void setModifyObj(final Rl01a30EditDTO modifyObj) {
        this.modifyObj = modifyObj;
    }

    public List<Rl01a30EditDTO> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rl01a30EditDTO> queryList) {
        this.queryList = queryList;
    }

    public Rldf001mType getRldf001mObj() {
        return rldf001mObj;
    }

    public void setRldf001mObj(final Rldf001mType rldf001mObj) {
        this.rldf001mObj = rldf001mObj;
    }

    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    public void setRldf004mObj(final Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
    }

    public String getConfirmSaveMessage() {
        return confirmSaveMessage;
    }

    public void setConfirmSaveMessage(final String confirmSaveMessage) {
        this.confirmSaveMessage = confirmSaveMessage;
    }

    public boolean isRldf030tExist() {
        return rldf030tExist;
    }

    public void setRldf030tExist(boolean rldf030tExist) {
        this.rldf030tExist = rldf030tExist;
    }
    

}

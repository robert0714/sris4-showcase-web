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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfu003Type;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDFU003;

/**
 * 顯示規費明細DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowFeeDTO", propOrder = { "personId", "personName", "applyCopyCnt", "applyCopySheets",
        "feeCancelFlag", "fineFlag", "modifyFlag", "mannualAddFlag", "notCancelFlag", "orgFlag", "feeDetail",
        "rldfu003Type", "objSList", "objWList" })
@XmlRootElement(name = "ShowFeeDTO")
public class ShowFeeDTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 5896984733088428530L;

    /** 國民身分證的統號. */
    @FieldName("國民身分證的統號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 姓名. */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 修改申請書申請份數. */
    @FieldName("修改申請書申請份數")
    @XmlElement(name = "ApplyCopyCnt")
    private String applyCopyCnt;

    /** 修改申請書申請張數. */
    @FieldName("修改申請書申請張數")
    @XmlElement(name = "ApplyCopySheets")
    private String applyCopySheets;

    /** 規費作廢註記. */
    @FieldName("規費作廢註記")
    @XmlElement(name = "FeeCancelFlag")
    private Boolean feeCancelFlag;

    /** 罰鍰註記. */
    @FieldName("罰鍰註記")
    @XmlElement(name = "FineFlag")
    private Boolean fineFlag;

    /** 修改註記. */
    @FieldName("修改註記")
    @XmlElement(name = "ModifyFlag")
    private Boolean modifyFlag;

    /** 自行新增註記. */
    @FieldName("自行新增註記 ")
    @XmlElement(name = "MannualAddFlag")
    private Boolean mannualAddFlag;

    /** 不可作廢註記. */
    @FieldName("不可作廢註記")
    @XmlElement(name = "NotCancelFlag")
    private Boolean notCancelFlag;

    /** 原始規費. */
    @FieldName("原始規費")
    @XmlElement(name = "OrgFlag")
    private boolean orgFlag;

    /** (Xldf)規費明細. */
    @FieldName("(Xldf)規費明細")
    @XmlElement(name = "FeeDetail")
    private XLDFDomainObject feeDetail = new XLDFU003(StringUtils.EMPTY, StringUtils.EMPTY);

    /** (Rldf)規費明細. */
    @FieldName("(Rldf)規費明細")
    @XmlElement(name = "Rldfu003Type")
    private Rldfu003Type rldfu003Type = new Rldfu003Type();

    /** S申請書清單. */
    @FieldName("S申請書清單")
    @XmlElement(name = "ObjSList")
    private List<Object> objSList = new ArrayList<Object>();

    /** W申請書清單. */
    @FieldName("W申請書清單")
    @XmlElement(name = "ObjWList")
    private List<Object> objWList = new ArrayList<Object>();

    /**
     * Gets the fee cancel flag.
     * 
     * @return the fee cancel flag
     */
    public Boolean getFeeCancelFlag() {
        return feeCancelFlag;
    }

    /**
     * Sets the fee cancel flag.
     * 
     * @param feeCancelFlag
     *            the new fee cancel flag
     */
    public void setFeeCancelFlag(Boolean feeCancelFlag) {
        this.feeCancelFlag = feeCancelFlag;
    }

    /**
     * Gets the fine flag.
     * 
     * @return the fine flag
     */
    public Boolean getFineFlag() {
        return fineFlag;
    }

    /**
     * Sets the fine flag.
     * 
     * @param fineFlag
     *            the new fine flag
     */
    public void setFineFlag(Boolean fineFlag) {
        this.fineFlag = fineFlag;
    }

    /**
     * Gets the modify flag.
     * 
     * @return the modify flag
     */
    public Boolean getModifyFlag() {
        return modifyFlag;
    }

    /**
     * Sets the modify flag.
     * 
     * @param modifyFlag
     *            the new modify flag
     */
    public void setModifyFlag(Boolean modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    /**
     * Gets the mannual add flag.
     * 
     * @return the mannual add flag
     */
    public Boolean getMannualAddFlag() {
        return mannualAddFlag;
    }

    /**
     * Sets the mannual add flag.
     * 
     * @param mannualAddFlag
     *            the new mannual add flag
     */
    public void setMannualAddFlag(Boolean mannualAddFlag) {
        this.mannualAddFlag = mannualAddFlag;
    }

    /**
     * Gets the not cancel flag.
     * 
     * @return the not cancel flag
     */
    public Boolean getNotCancelFlag() {
        return notCancelFlag;
    }

    /**
     * Sets the not cancel flag.
     * 
     * @param notCancelFlag
     *            the new not cancel flag
     */
    public void setNotCancelFlag(Boolean notCancelFlag) {
        this.notCancelFlag = notCancelFlag;
    }

    /**
     * Gets the fee detail.
     * 
     * @return the fee detail
     */
    public XLDFDomainObject getFeeDetail() {
        return feeDetail;
    }

    /**
     * Sets the fee detail.
     * 
     * @param feeDetail
     *            the new fee detail
     */
    public void setFeeDetail(XLDFDomainObject feeDetail) {
        this.feeDetail = feeDetail;
    }

    /**
     * Gets the apply copy cnt.
     * 
     * @return the apply copy cnt
     */
    public String getApplyCopyCnt() {
        return applyCopyCnt;
    }

    /**
     * Sets the apply copy cnt.
     * 
     * @param applyCopyCnt
     *            the new apply copy cnt
     */
    public void setApplyCopyCnt(String applyCopyCnt) {
        this.applyCopyCnt = applyCopyCnt;
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
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply copy sheets.
     * 
     * @return the apply copy sheets
     */
    public String getApplyCopySheets() {
        return applyCopySheets;
    }

    /**
     * Sets the apply copy sheets.
     * 
     * @param applyCopySheets
     *            the new apply copy sheets
     */
    public void setApplyCopySheets(String applyCopySheets) {
        this.applyCopySheets = applyCopySheets;
    }

    /**
     * Gets the rldfu003 type.
     * 
     * @return the rldfu003 type
     */
    public Rldfu003Type getRldfu003Type() {
        return rldfu003Type;
    }

    /**
     * Sets the rldfu003 type.
     * 
     * @param rldfu003Type
     *            the new rldfu003 type
     */
    public void setRldfu003Type(final Rldfu003Type rldfu003Type) {
        this.rldfu003Type = rldfu003Type;
    }

    /**
     * Gets the org flag.
     * 
     * @return the org flag
     */
    public boolean getOrgFlag() {
        return orgFlag;
    }

    /**
     * Sets the org flag.
     * 
     * @param orgFlag
     *            the new org flag
     */
    public void setOrgFlag(final boolean orgFlag) {
        this.orgFlag = orgFlag;
    }

    /**
     * Gets the obj s list.
     * 
     * @return the obj s list
     */
    public List<Object> getObjSList() {
        return objSList;
    }

    /**
     * Sets the obj s list.
     * 
     * @param objSList
     *            the new obj s list
     */
    public void setObjSList(final List<Object> objSList) {
        this.objSList = objSList;
    }

    /**
     * Gets the obj w list.
     * 
     * @return the obj w list
     */
    public List<Object> getObjWList() {
        return objWList;
    }

    /**
     * Sets the obj w list.
     * 
     * @param objWList
     *            the new obj w list
     */
    public void setObjWList(final List<Object> objWList) {
        this.objWList = objWList;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(final String personName) {
        this.personName = personName;
    }

}

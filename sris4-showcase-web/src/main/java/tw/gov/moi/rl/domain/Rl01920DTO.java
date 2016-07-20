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
import tw.gov.moi.domain.Rdd5101mType;
import tw.gov.moi.domain.Rdd5201mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl01920DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01920DTO", propOrder = { "regType", "ncType", "siteId", "saveList", "deleteList", "modifyObj",
        "confirmMessageDelete", "confirmMessageSave", "confirmMessageAdd", "personId", "queryNcdf001m", "ncSelectData",
        "queryNcList", "selected" })
@XmlRootElement(name = "Rl01920DTO")
public class Rl01920DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 登記類別 */
    @XmlElement(name = "RegType", required = true)
    @FieldName("登記類別")
    private String regType = RlConstant.EMPTY_STRING;

    // /** 無戶籍類別 */
    // @XmlElement(name = "RegType", required = true)
    // @FieldName("登記類別")
    // private String ncType = RlConstant.STRING_Q;

    /** 作業點 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點")
    private String siteId;

    /** 補登資料清單 */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("補登資料清單")
    private List<Rl01920SaveDTO> saveList;

    /** 刪除補登資料清單 */
    @XmlElement(name = "DeleteList", required = true)
    @FieldName("刪除補登資料清單")
    private Rl01920SaveDTO[] deleteList;

    /** 修改或新增補登資料清單 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("修改或新增補登資料清單")
    private Rl01920SaveDTO modifyObj;

    /** 刪除詢問訊息 */
    @XmlElement(name = "ConfirmMessageDalete", required = true)
    @FieldName("刪除詢問訊息")
    private String confirmMessageDelete;

    /** 存檔詢問訊息 */
    @XmlElement(name = "ConfirmMessageSave", required = true)
    @FieldName("存檔詢問訊息")
    private String confirmMessageSave;

    /** 新增詢問訊息 */
    @XmlElement(name = "ConfirmMessageAdd", required = true)
    @FieldName("新增詢問訊息")
    private String confirmMessageAdd;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String personId;

    // /** 無戶籍查詢條件 */
    // @XmlElement(name = "QueryNcdf001m", required = true)
    // @FieldName("無戶籍查詢條件")
    // private Ncdf001mType queryNcdf001m = new Ncdf001mType();

    /** 大陸、港澳及無戶籍人士基本資料. */
    @XmlElement(name = "Rdd5101mType")
    @FieldName("查詢大陸、港澳及無戶籍人士基本資料")
    private Rdd5101mType queryRdd5101m = new Rdd5101mType();

    /** 外籍人士基本資料. */
    @XmlElement(name = "Rdd5201mType")
    @FieldName("查詢外籍人士基本資料")
    private Rdd5201mType queryRdd5201m = new Rdd5201mType();

    /** 傳送的無戶籍資料 */
    @XmlElement(name = "NcSelectData", required = true)
    @FieldName("傳送的無戶籍資料")
    private Rl01920SaveDTO ncSelectData;

    /** 無戶籍資料清單 */
    @XmlElement(name = "QueryNcList", required = true)
    @FieldName("無戶籍資料清單")
    private List<Rl01920SaveDTO> queryNcList;

    /** 性別 */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 請選擇 */
    @XmlElement(name = "Selected", required = true)
    @FieldName("請選擇")
    private String selected;

    /** 暫存男性配賦統號 */
    @XmlElement(name = "MalePersonId", required = true)
    @FieldName("暫存男性配賦統號")
    private String malePersonId;

    /** 暫存女性配賦統號 */
    @XmlElement(name = "FemalePersonId", required = true)
    @FieldName("暫存女性配賦統號")
    private String femalePersonId;

    /** 是否已配賦樴別統號. */
    @XmlElement(name = "CheckSpecialId")
    @FieldName("是否已配賦樴別統號")
    private boolean checkSpecialId;

    /** 是否為測試環境. */
    @XmlElement(name = "TestEnv")
    @FieldName("是否為測試環境")
    private boolean testEnv = false;

    /** 查詢類別 */
    @XmlElement(name = "QueryType", required = true)
    @FieldName("查詢類別")
    private String queryType;

    /** 識別統號. */
    @XmlElement(name = "SpecialId")
    @FieldName("識別統號")
    private String specialId;

    @XmlElement(name = "Tldf004mList")
    @FieldName("Tldf004mList")
    private List<Object[]> tldf004mList;

    /** 是否新增補登資料. */
    @XmlElement(name = "CheckCreateNc")
    @FieldName("是否新增補登資料")
    private boolean checkCreateNc;

    @XmlElement(name = "ObjDto")
    @FieldName("親等測試DTO")
    private Object objDto;

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    // public Ncdf001mType getQueryNcdf001m() {
    // return queryNcdf001m;
    // }
    //
    // public void setQueryNcdf001m(Ncdf001mType queryNcdf001m) {
    // this.queryNcdf001m = queryNcdf001m;
    // }

    public List<Rl01920SaveDTO> getQueryNcList() {
        return queryNcList;
    }

    public void setQueryNcList(final List<Rl01920SaveDTO> queryNcList) {
        this.queryNcList = queryNcList;
    }

    public Rl01920SaveDTO getNcSelectData() {
        return ncSelectData;
    }

    public void setNcSelectData(final Rl01920SaveDTO ncSelectData) {
        this.ncSelectData = ncSelectData;
    }

    public List<Rl01920SaveDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(final List<Rl01920SaveDTO> saveList) {
        this.saveList = saveList;
    }

    public Rl01920SaveDTO[] getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(final Rl01920SaveDTO[] deleteList) {
        this.deleteList = deleteList;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public Rl01920SaveDTO getModifyObj() {
        return modifyObj;
    }

    public void setModifyObj(final Rl01920SaveDTO modifyObj) {
        this.modifyObj = modifyObj;
    }

    public String getConfirmMessageDelete() {
        return confirmMessageDelete;
    }

    public void setConfirmMessageDelete(final String confirmMessageDelete) {
        this.confirmMessageDelete = confirmMessageDelete;
    }

    public String getConfirmMessageSave() {
        return confirmMessageSave;
    }

    public void setConfirmMessageSave(final String confirmMessageSave) {
        this.confirmMessageSave = confirmMessageSave;
    }

    public String getConfirmMessageAdd() {
        return confirmMessageAdd;
    }

    public void setConfirmMessageAdd(final String confirmMessageAdd) {
        this.confirmMessageAdd = confirmMessageAdd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getMalePersonId() {
        return malePersonId;
    }

    public void setMalePersonId(String malePersonId) {
        this.malePersonId = malePersonId;
    }

    public String getFemalePersonId() {
        return femalePersonId;
    }

    public void setFemalePersonId(String femalePersonId) {
        this.femalePersonId = femalePersonId;
    }

    public Object getObjDto() {
        return objDto;
    }

    public void setObjDto(Object objDto) {
        this.objDto = objDto;
    }

    public boolean isTestEnv() {
        return testEnv;
    }

    public void setTestEnv(boolean testEnv) {
        this.testEnv = testEnv;
    }

    public boolean isCheckSpecialId() {
        return checkSpecialId;
    }

    public void setCheckSpecialId(boolean checkSpecialId) {
        this.checkSpecialId = checkSpecialId;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public List<Object[]> getTldf004mList() {
        return tldf004mList;
    }

    public void setTldf004mList(List<Object[]> tldf004mList) {
        this.tldf004mList = tldf004mList;
    }

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public boolean isCheckCreateNc() {
        return checkCreateNc;
    }

    public void setCheckCreateNc(boolean checkCreateNc) {
        this.checkCreateNc = checkCreateNc;
    }

    public Rdd5101mType getQueryRdd5101m() {
        return queryRdd5101m;
    }

    public void setQueryRdd5101m(Rdd5101mType queryRdd5101m) {
        this.queryRdd5101m = queryRdd5101m;
    }

    public Rdd5201mType getQueryRdd5201m() {
        return queryRdd5201m;
    }

    public void setQueryRdd5201m(Rdd5201mType queryRdd5201m) {
        this.queryRdd5201m = queryRdd5201m;
    }

}

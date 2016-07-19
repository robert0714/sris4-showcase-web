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
import tw.gov.moi.domain.Tldf001mType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 遷入者補登DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01910DTO", propOrder = { "userId", "acceptSiteId", "initTime", "resetToAddMode",
        "resetToModifyMode", "editMode", "deleteMode", "tldf005m", "tldf006m", "tldf007m", "tldf008m", "tldf047m",
        "regType", "foreignMoveIn", "queryHisType", "siteId", "deleteList", "tldf001mSaveObj", "saveList",
        "confirmMessageDelete", "confirmMessageSave", "confirmMessageAdd", "personId", "dialogPersonId",
        "queryNcdf001m", "removeYyymmdd", "removeTime", "hhRemoveYear", "hhRemoveMon", "hhRemoveDay", "hhRemoveHour",
        "hhRemoveMin", "hhRemoveSec", "idSource", "gender", "isNewPersonId", "tldf001mQueryObj", "queryList",
        "tldf001mModifyObj", "modifyObj", "rl01910ErrorList", "selected", "message", "tempSpouseId", "spouseCheckbox",
        "tempFatherId", "fatherCheckbox", "tempFosterFatherId", "fosterFatherCheckbox", "tempMotherId",
        "motherCheckbox", "tempFosterMotherId", "fosterMotherCheckbox", "familyRelationCheckbox", "queryType",
        "viewPersonId", "checkNcdf001mPersonId", "flagACheckbox", "flagBInputText", "householdDataState",
        "isArtificialRersonId" })
@XmlRootElement(name = "Rl01910DTO")
public class Rl01910DTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** final variable */
    @XmlElement(name = "ResetToAddMode")
    @FieldName("常數類:resetToAddMode")
    public final String resetToAddMode = "resetToAdd";

    @XmlElement(name = "ResetToModifyMode")
    @FieldName("常數類:resetToModifyMode")
    public final String resetToModifyMode = "resetToModify";

    @XmlElement(name = "EditMode")
    @FieldName("常數類:editMode")
    public final String editMode = "edit";

    @XmlElement(name = "DeleteMode")
    @FieldName("常數類:deleteMode")
    public final String deleteMode = "delete";

    @XmlElement(name = "Tldf005m")
    @FieldName("常數類:tldf005m")
    public final String tldf005m = "tldf005m";

    @XmlElement(name = "Tldf006m")
    @FieldName("常數類:tldf006m")
    public final String tldf006m = "tldf006m";

    @XmlElement(name = "Tldf007m")
    @FieldName("常數類:tldf007m")
    public final String tldf007m = "tldf007m";

    @XmlElement(name = "Tldf008m")
    @FieldName("常數類:tldf008m")
    public final String tldf008m = "tldf008m";

    @XmlElement(name = "Tldf047m")
    @FieldName("常數類:tldf047m")
    public final String tldf047m = "tldf047m";

    /** 登記類別 */
    @XmlElement(name = "RegType", required = true)
    @FieldName("登記類別")
    private String regType = RlConstant.EMPTY_STRING;

    @XmlElement(name = "ForeignMoveIn", required = true)
    @FieldName("國外遷入")
    private boolean foreignMoveIn = false;

    /** 查詢除戶現戶類別 */
    @XmlElement(name = "QueryHisType", required = true)
    @FieldName("查詢除戶現戶類別")
    private String queryHisType = RlConstant.NO_CHAR;

    /** 作業點 */
    // @XmlElement(name = "SiteId", required = true)
    // @FieldName("作業點")
    // private String siteId;

    /** 刪除補登資料清單 */
    @XmlElement(name = "DeleteList", required = true)
    @FieldName("刪除補登資料清單")
    private Rl01910SaveDTO[] deleteList;

    /** 補登資料 Tldf001m Object - 儲存用 */
    @XmlElement(name = "Tldf001mSaveObj", required = true)
    @FieldName("補登資料 Tldf001m Object - 儲存用")
    private Tldf001mType tldf001mSaveObj;

    /** 補登資料清單 - 儲存用 */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("補登資料清單 - 儲存用")
    private List<Rl01910SaveDTO> saveList;

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

    /** 統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 統一編號 */
    @XmlElement(name = "DialogPersonId", required = true)
    @FieldName("統號")
    private String dialogPersonId;

    /** 無戶籍查詢條件 */
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

    /** 除戶日期 */
    @XmlElement(name = "RemoveYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間 */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    /** 除戶日期:年. */
    @XmlElement(name = "HhRemoveYear", required = true)
    @FieldName("除戶日期:年")
    private String hhRemoveYear;

    /** 除戶日期:月. */
    @XmlElement(name = "HhRemoveMon", required = true)
    @FieldName("除戶日期:月")
    private String hhRemoveMon;

    /** 除戶日期:日. */
    @XmlElement(name = "HhRemoveDay", required = true)
    @FieldName("除戶日期:日")
    private String hhRemoveDay;

    /** 除戶時間:時. */
    @XmlElement(name = "HhRemoveHour", required = true)
    @FieldName("除戶時間:時")
    private String hhRemoveHour;

    /** 除戶時間:分. */
    @XmlElement(name = "HhRemoveMin", required = true)
    @FieldName("除戶時間:分")
    private String hhRemoveMin;

    /** 除戶時間:秒. */
    @XmlElement(name = "HhRemoveSec", required = true)
    @FieldName("除戶時間:秒")
    private String hhRemoveSec;

    /** 身分別 */
    @XmlElement(name = "IdSource", required = true)
    @FieldName("身分別")
    private String idSource;

    /** 性別 */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 是否為新配賦統號 */
    @XmlElement(name = "IsNewPersonId", required = true)
    @FieldName("是否為新配賦統號")
    private String isNewPersonId;

    /** 補登資料 Tldf001m Object - 查詢用 */
    @XmlElement(name = "Tldf001mSaveObj", required = true)
    @FieldName("補登資料 Tldf001m Object - 查詢用 ")
    private Tldf001mType tldf001mQueryObj;

    /** 國籍列表清單 或 除戶資料清單 - 查詢用 */
    @XmlElement(name = "QueryList", required = true)
    @FieldName("國籍列表清單 或 除戶資料清單")
    private List<Rl01910SaveDTO> queryList;

    /** 補登資料 Tldf001m Object - 修改用 */
    @XmlElement(name = "Tldf001mModifyObj", required = true)
    @FieldName("補登資料 Tldf001m Object - 修改用 ")
    private Tldf001mType tldf001mModifyObj;

    /** 傳送的修改資料 - 修改用 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("傳送的修改資料")
    private Rl01910SaveDTO modifyObj;

    /** 不一致姓名、出生日期錯誤資料 */
    @XmlElement(name = "Rl01910ErrorDTO", required = true)
    @FieldName("不一致姓名、出生日期錯誤資料")
    private List<Rl01910ErrorDTO> rl01910ErrorList;

    /** 請選擇 */
    @XmlElement(name = "Selected", required = true)
    @FieldName("請選擇")
    private String selected;

    /** 警示資訊 */
    @XmlElement(name = "Message", required = true)
    @FieldName("警示資訊")
    private String message;

    /** 暫存配偶統號 */
    @XmlElement(name = "TempSpouseId", required = true)
    @FieldName("配偶")
    private String tempSpouseId;

    /** 配偶 */
    @XmlElement(name = "SpouseCheckbox", required = true)
    @FieldName("配偶")
    private boolean spouseCheckbox;

    /** 暫存父統號 */
    @XmlElement(name = "TempFatherId", required = true)
    @FieldName("暫存父統號")
    private String tempFatherId = "";

    /** 父 */
    @XmlElement(name = "FatherCheckbox", required = true)
    @FieldName("父")
    private boolean fatherCheckbox;

    /** 暫存養父統號 */
    @XmlElement(name = "TempFosterFatherId", required = true)
    @FieldName("暫存養父統號")
    private String tempFosterFatherId;

    /** 養父 */
    @XmlElement(name = "FosterFatherCheckbox", required = true)
    @FieldName("養父")
    private boolean fosterFatherCheckbox;

    /** 暫存母統號 */
    @XmlElement(name = "TempMotherId", required = true)
    @FieldName("暫存母統號")
    private String tempMotherId;

    /** 母 */
    @XmlElement(name = "MotherCheckbox", required = true)
    @FieldName("母")
    private boolean motherCheckbox;

    /** 暫存養母統號 */
    @XmlElement(name = "TempFosterMotherId", required = true)
    @FieldName("暫存養母統號")
    private String tempFosterMotherId;

    /** 養母 */
    @XmlElement(name = "FosterMotherCheckbox", required = true)
    @FieldName("養母")
    private boolean fosterMotherCheckbox;

    /** 親等關係Checkbox */
    @XmlElement(name = "FamilyRelationCheckbox", required = true)
    @FieldName("親等關係Checkbox")
    private boolean familyRelationCheckbox;

    /** 查詢類別 */
    @XmlElement(name = "QueryType", required = true)
    @FieldName("查詢類別")
    private String queryType;

    /** viewPersonId */
    @XmlElement(name = "ViewPersonId", required = true)
    @FieldName("viewPersonId")
    private String viewPersonId;

    /** checkNcdf001mPersonId */
    @XmlElement(name = "CheckNcdf001mPersonId", required = true)
    @FieldName("checkNcdf001mPersonId")
    private boolean checkNcdf001mPersonId = true;

    /** FlagACheckFatherAndMother */
    @XmlElement(name = "FlagACheckbox", required = true)
    @FieldName("FlagACheckbox")
    private boolean flagACheckbox;

    /** FlagBInputText */
    @XmlElement(name = "FlagBInputText", required = true)
    @FieldName("flagBInputText")
    private boolean flagBInputText;

    /** 戶籍狀態. */
    @XmlElement(name = "HouseholdDataState", required = true)
    @FieldName("戶籍狀態")
    private String householdDataState;

    /** 主分類. */
    @XmlElement(name = "MainType", required = true)
    @FieldName("主分類")
    private String mainType;

    /** 次分類. */
    @XmlElement(name = "SubType", required = true)
    @FieldName("次分類")
    private String subType;

    /** 自國外遷入訊息. */
    @XmlElement(name = "SubType", required = true)
    @FieldName("自國外遷入訊息")
    private String currentSiteIdMessage;

    /** 修改補登資料. */
    @XmlElement(name = "CheckModifyData", required = true)
    @FieldName("修改補登資料")
    private boolean checkModifyData;

    @XmlElement(name = "Tldf004mList")
    @FieldName("Tldf004mList")
    private List<Object[]> tldf004mList;

    /** 識別統號. */
    @XmlElement(name = "SpecialId")
    @FieldName("識別統號")
    private String specialId;

    /** 來源作業點代碼. */
    @XmlElement(name = "SourceSiteId")
    @FieldName("來源作業點代碼")
    private String sourceSiteId;

    /** 自立新戶. */
    @XmlElement(name = "NewHousehold")
    @FieldName("自立新戶")
    private String newHousehold;

    /** 複製登記類別. */
    @XmlElement(name = "CopyRegType")
    @FieldName("複製登記類別")
    private String copyRegType;

    /** 領證日期:年. */
    @XmlElement(name = "IdCardApplyYear", required = true)
    @FieldName("領證日期:年")
    private String idCardApplyYear;

    /** 領證日期:月. */
    @XmlElement(name = "IdCardApplyMon", required = true)
    @FieldName("領證日期:月")
    private String idCardApplyMon;

    /** 領證日期:日. */
    @XmlElement(name = "IdCardApplyDay", required = true)
    @FieldName("領證日期:日")
    private String idCardApplyDay;

    /** 是否新增補登資料. */
    @XmlElement(name = "CheckCreateNc")
    @FieldName("是否新增補登資料")
    private boolean checkCreateNc;

    /** 是否編輯. */
    @XmlElement(name = "checkEditor")
    @FieldName("編輯")
    private boolean checkEditor;

    /** Tldf004m Object */
    @XmlElement(name = "TempTldf004mObj", required = true)
    @FieldName("Tldf004m Object")
    private Tldf004mType tempTldf004mObj;

    /** 是否登記類別. */
    @XmlElement(name = "CheckRegType")
    @FieldName("是否登記類別")
    private boolean checkRegType;

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public boolean isForeignMoveIn() {
        return foreignMoveIn;
    }

    public void setForeignMoveIn(boolean foreignMoveIn) {
        this.foreignMoveIn = foreignMoveIn;
    }

    public String getQueryHisType() {
        return queryHisType;
    }

    public void setQueryHisType(String queryHisType) {
        this.queryHisType = queryHisType;
    }

    // public String getSiteId() {
    // return siteId;
    // }
    //
    // public void setSiteId(final String siteId) {
    // this.siteId = siteId;
    // }

    public Rl01910SaveDTO[] getDeleteList() {
        return deleteList;
    }

    public void setDeleteList(final Rl01910SaveDTO[] deleteList) {
        this.deleteList = deleteList;
    }

    public Tldf001mType getTldf001mSaveObj() {
        return tldf001mSaveObj;
    }

    public void setTldf001mSaveObj(final Tldf001mType tldf001mSaveObj) {
        this.tldf001mSaveObj = tldf001mSaveObj;
    }

    public List<Rl01910SaveDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(final List<Rl01910SaveDTO> saveList) {
        this.saveList = saveList;
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

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(final String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(final String removeTime) {
        this.removeTime = removeTime;
    }

    public String getIdSource() {
        return idSource;
    }

    public void setIdSource(final String idSource) {
        this.idSource = idSource;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public String getIsNewPersonId() {
        return isNewPersonId;
    }

    public void setIsNewPersonId(final String isNewPersonId) {
        this.isNewPersonId = isNewPersonId;
    }

    public Tldf001mType getTldf001mQueryObj() {
        return tldf001mQueryObj;
    }

    public void setTldf001mQueryObj(final Tldf001mType tldf001mQueryObj) {
        this.tldf001mQueryObj = tldf001mQueryObj;
    }

    public List<Rl01910SaveDTO> getQueryList() {
        return queryList;
    }

    public void setQueryList(final List<Rl01910SaveDTO> queryList) {
        this.queryList = queryList;
    }

    public Tldf001mType getTldf001mModifyObj() {
        return tldf001mModifyObj;
    }

    public void setTldf001mModifyObj(final Tldf001mType tldf001mModifyObj) {
        this.tldf001mModifyObj = tldf001mModifyObj;
    }

    public Rl01910SaveDTO getModifyObj() {
        return modifyObj;
    }

    public void setModifyObj(final Rl01910SaveDTO modifyObj) {
        this.modifyObj = modifyObj;
    }

    public String getEditMode() {
        return editMode;
    }

    public String getDeleteMode() {
        return deleteMode;
    }

    public String getTldf005m() {
        return tldf005m;
    }

    public String getTldf006m() {
        return tldf006m;
    }

    public String getTldf007m() {
        return tldf007m;
    }

    public String getTldf008m() {
        return tldf008m;
    }

    public String getTldf047m() {
        return tldf047m;
    }

    public String getResetToAddMode() {
        return resetToAddMode;
    }

    public String getResetToModifyMode() {
        return resetToModifyMode;
    }

    public List<Rl01910ErrorDTO> getRl01910ErrorList() {
        return rl01910ErrorList;
    }

    public void setRl01910ErrorList(List<Rl01910ErrorDTO> rl01910ErrorList) {
        this.rl01910ErrorList = rl01910ErrorList;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public boolean isSpouseCheckbox() {
        return spouseCheckbox;
    }

    public void setSpouseCheckbox(boolean spouseCheckbox) {
        this.spouseCheckbox = spouseCheckbox;
    }

    public boolean isFosterMotherCheckbox() {
        return fosterMotherCheckbox;
    }

    public void setFosterMotherCheckbox(boolean fosterMotherCheckbox) {
        this.fosterMotherCheckbox = fosterMotherCheckbox;
    }

    public boolean isMotherCheckbox() {
        return motherCheckbox;
    }

    public void setMotherCheckbox(boolean motherCheckbox) {
        this.motherCheckbox = motherCheckbox;
    }

    public boolean isFosterFatherCheckbox() {
        return fosterFatherCheckbox;
    }

    public void setFosterFatherCheckbox(boolean fosterFatherCheckbox) {
        this.fosterFatherCheckbox = fosterFatherCheckbox;
    }

    public boolean isFatherCheckbox() {
        return fatherCheckbox;
    }

    public void setFatherCheckbox(boolean fatherCheckbox) {
        this.fatherCheckbox = fatherCheckbox;
    }

    public String getTempSpouseId() {
        return tempSpouseId;
    }

    public void setTempSpouseId(String tempSpouseId) {
        this.tempSpouseId = tempSpouseId;
    }

    public String getTempFatherId() {
        return tempFatherId;
    }

    public void setTempFatherId(String tempFatherId) {
        this.tempFatherId = tempFatherId;
    }

    public String getTempFosterFatherId() {
        return tempFosterFatherId;
    }

    public void setTempFosterFatherId(String tempFosterFatherId) {
        this.tempFosterFatherId = tempFosterFatherId;
    }

    public String getTempMotherId() {
        return tempMotherId;
    }

    public void setTempMotherId(String tempMotherId) {
        this.tempMotherId = tempMotherId;
    }

    public String getTempFosterMotherId() {
        return tempFosterMotherId;
    }

    public void setTempFosterMotherId(String tempFosterMotherId) {
        this.tempFosterMotherId = tempFosterMotherId;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public boolean isCheckNcdf001mPersonId() {
        return checkNcdf001mPersonId;
    }

    public void setCheckNcdf001mPersonId(boolean checkNcdf001mPersonId) {
        this.checkNcdf001mPersonId = checkNcdf001mPersonId;
    }

    public String getViewPersonId() {
        return viewPersonId;
    }

    public void setViewPersonId(String viewPersonId) {
        this.viewPersonId = viewPersonId;
    }

    public String getDialogPersonId() {
        return dialogPersonId;
    }

    public void setDialogPersonId(String dialogPersonId) {
        this.dialogPersonId = dialogPersonId;
    }

    public boolean isFamilyRelationCheckbox() {
        return familyRelationCheckbox;
    }

    public void setFamilyRelationCheckbox(boolean familyRelationCheckbox) {
        this.familyRelationCheckbox = familyRelationCheckbox;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFlagACheckbox() {
        return flagACheckbox;
    }

    public void setFlagACheckbox(boolean flagACheckbox) {
        this.flagACheckbox = flagACheckbox;
    }

    public boolean isFlagBInputText() {
        return flagBInputText;
    }

    public void setFlagBInputText(boolean flagBInputText) {
        this.flagBInputText = flagBInputText;
    }

    public String getHhRemoveYear() {
        return hhRemoveYear;
    }

    public void setHhRemoveYear(String hhRemoveYear) {
        this.hhRemoveYear = hhRemoveYear;
    }

    public String getHhRemoveMon() {
        return hhRemoveMon;
    }

    public void setHhRemoveMon(String hhRemoveMon) {
        this.hhRemoveMon = hhRemoveMon;
    }

    public String getHhRemoveDay() {
        return hhRemoveDay;
    }

    public void setHhRemoveDay(String hhRemoveDay) {
        this.hhRemoveDay = hhRemoveDay;
    }

    public String getHhRemoveHour() {
        return hhRemoveHour;
    }

    public void setHhRemoveHour(String hhRemoveHour) {
        this.hhRemoveHour = hhRemoveHour;
    }

    public String getHhRemoveMin() {
        return hhRemoveMin;
    }

    public void setHhRemoveMin(String hhRemoveMin) {
        this.hhRemoveMin = hhRemoveMin;
    }

    public String getHhRemoveSec() {
        return hhRemoveSec;
    }

    public void setHhRemoveSec(String hhRemoveSec) {
        this.hhRemoveSec = hhRemoveSec;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public String getHouseholdDataState() {
        return householdDataState;
    }

    public void setHouseholdDataState(String householdDataState) {
        this.householdDataState = householdDataState;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getCurrentSiteIdMessage() {
        return currentSiteIdMessage;
    }

    public void setCurrentSiteIdMessage(String currentSiteIdMessage) {
        this.currentSiteIdMessage = currentSiteIdMessage;
    }

    public boolean isCheckModifyData() {
        return checkModifyData;
    }

    public void setCheckModifyData(boolean checkModifyData) {
        this.checkModifyData = checkModifyData;
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

    public String getSourceSiteId() {
        return sourceSiteId;
    }

    public void setSourceSiteId(String sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public String getNewHousehold() {
        return newHousehold;
    }

    public void setNewHousehold(String newHousehold) {
        this.newHousehold = newHousehold;
    }

    public String getCopyRegType() {
        return copyRegType;
    }

    public void setCopyRegType(String copyRegType) {
        this.copyRegType = copyRegType;
    }

    public String getIdCardApplyYear() {
        return idCardApplyYear;
    }

    public void setIdCardApplyYear(String idCardApplyYear) {
        this.idCardApplyYear = idCardApplyYear;
    }

    public String getIdCardApplyMon() {
        return idCardApplyMon;
    }

    public void setIdCardApplyMon(String idCardApplyMon) {
        this.idCardApplyMon = idCardApplyMon;
    }

    public String getIdCardApplyDay() {
        return idCardApplyDay;
    }

    public void setIdCardApplyDay(String idCardApplyDay) {
        this.idCardApplyDay = idCardApplyDay;
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

    public boolean isCheckCreateNc() {
        return checkCreateNc;
    }

    public void setCheckCreateNc(boolean checkCreateNc) {
        this.checkCreateNc = checkCreateNc;
    }

    public boolean isCheckEditor() {
        return checkEditor;
    }

    public void setCheckEditor(boolean checkEditor) {
        this.checkEditor = checkEditor;
    }

    public Tldf004mType getTempTldf004mObj() {
        return tempTldf004mObj;
    }

    public void setTempTldf004mObj(Tldf004mType tempTldf004mObj) {
        this.tempTldf004mObj = tempTldf004mObj;
    }

    public boolean isCheckRegType() {
        return checkRegType;
    }

    public void setCheckRegType(boolean checkRegType) {
        this.checkRegType = checkRegType;
    }

}

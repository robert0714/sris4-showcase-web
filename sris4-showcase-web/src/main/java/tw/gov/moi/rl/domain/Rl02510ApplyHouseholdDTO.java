/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 戶口名簿核發-戶內人口 DTO.
 * 
 * @author Weiren.Jheng
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02510ApplyHouseholdDTO", propOrder = { "selected", "printSequence", "personData", "printBirthPlace",
        "personNotes", "selectAllNote", "relationCode", "originFatherNameFlag", "originMotherNameFlag",
        "originRelationship", "fatherNameFlag", "motherNameFlag", "relationship", "birthPlace", "choicePrintItemDTO",
        "selectAllChoicePrintItem", "personalMarkContent", "commandButtonValue", "disabledFatherNameFlag",
        "disabledMotherNameFlag", "nameRomanization", "birthPlaceContent", "checkBirthPlaceContentFlag",
        "disabledChoicePrintFormat", "choicePrintFormat", "fatherNameMap", "motherNameMap", "birthFatherName",
        "birthMotherName", "birthFatherId", "birthMotherId", "personalMark", "disabledCommonButton" })
@XmlRootElement(name = "Rl02510ApplyHouseholdDTO")
public class Rl02510ApplyHouseholdDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * 是否選擇 <BR>
     * Default: 是.
     */
    @XmlElement(name = "Selected")
    @FieldName("是否選擇")
    private boolean selected = Boolean.TRUE;

    /** 列印順序. */
    @XmlElement(name = "PrintSequence")
    @FieldName("列印順序")
    private String printSequence;

    /** 個人基本資料. */
    @XmlElement(name = "PersonData")
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /**
     * 是否列印出生地 <BR>
     * Default: 是.
     */
    @XmlElement(name = "PrintBirthPlace")
    @FieldName("是否列印出生地")
    private boolean printBirthPlace = Boolean.TRUE;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事資料")
    private List<Rl02510NoteDTO> personNotes = new ArrayList<Rl02510NoteDTO>();

    /**
     * 是否選擇全部記事 <BR>
     * Default: 是.
     */
    @XmlElement(name = "SelectAllNote")
    @FieldName("是否選擇全部記事")
    private boolean selectAllNote = Boolean.TRUE;

    /** 稱謂代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("稱謂代碼")
    private String relationCode;

    /** 原列印父姓名. */
    @XmlElement(name = "OriginFatherNameFlag")
    @FieldName("原列印父姓名")
    private String originFatherNameFlag = "";

    /** 原列印母姓名. */
    @XmlElement(name = "OriginMotherNameFlag")
    @FieldName("原列印母姓名")
    private String originMotherNameFlag = "";

    /** 原稱謂. */
    @XmlElement(name = "OriginRelationship")
    @FieldName("原稱謂")
    private String originRelationship = "";

    /** 列印父姓名. */
    @XmlElement(name = "FatherNameFlag")
    @FieldName("列印父姓名")
    private String fatherNameFlag = "";

    /** 列印母姓名. */
    @XmlElement(name = "MotherNameFlag")
    @FieldName("列印母姓名")
    private String motherNameFlag = "";

    /** 稱謂. */
    @XmlElement(name = "Relationship")
    @FieldName("稱謂")
    private String relationship = "";

    /** 出生地. */
    // @XmlElement(name = "BirthPlace")
    // @FieldName("出生地")
    // private SelectItemDTO birthPlace;

    /** 列印選擇. */
    // @XmlElement(name = "ChoicePrintItemDTO")
    // @FieldName("列印選擇")
    // private Rl02510PersonalDTO choicePrintItemDTO = new Rl02510PersonalDTO();

    /**
     * 是否選擇列印全部 <BR>
     * Default: 是.
     */
    @XmlElement(name = "SelectAllChoicePrintItem")
    @FieldName("是否選擇列印全部")
    private boolean selectAllChoicePrintItem = Boolean.TRUE;

    /** 個人註記內容. */
    @XmlElement(name = "PersonalMarkContent")
    @FieldName("個人註記內容")
    private String personalMarkContent = "";

    // /** 是否選擇列印全部記事. */
    // @XmlElement(name = "personSelectedAllNote")
    // @FieldName("是否選擇列印全部記事")
    // private boolean personSelectedAllNote = Boolean.FALSE;

    /**
     * 記事選擇按鈕名稱<BR>
     * Default: 不印.
     */
    @XmlElement(name = "CommandButtonValue")
    @FieldName("記事選擇按鈕名稱")
    private String commandButtonValue = "全部";

    /**
     * 是否開放父姓名列印旗標<BR>
     * Default:TRUE.
     */
    @XmlElement(name = "DisabledFatherNameFlag")
    @FieldName("是否開放父姓名列印旗標")
    private boolean disabledFatherNameFlag = Boolean.FALSE;

    /**
     * 是否開放母姓名列印旗標<BR>
     * Default:TRUE.
     */
    @XmlElement(name = "DisabledMotherNameFlag")
    @FieldName("是否開放母姓名列印旗標")
    private boolean disabledMotherNameFlag = Boolean.FALSE;

    /** 姓名羅馬拼音. */
    @XmlElement(name = "NameRomanization")
    @FieldName("姓名羅馬拼音")
    private String nameRomanization = "";

    /** 顯示戶口名簿出生地. */
    @XmlElement(name = "BirthPlaceContent")
    @FieldName("顯示戶口名簿出生地")
    private String birthPlaceContent = "";

    /** 檢查出生地大陸地區或國外出生地是否有出生地變更登記. */
    @XmlElement(name = "CheckBirthPlaceContentFlag")
    @FieldName("檢查出生地大陸地區或國外出生地是否有出生地變更登記")
    private boolean checkBirthPlaceContentFlag = Boolean.TRUE;

    /**
     * 是否 Disabled 列印格式選擇<BR>
     * default:true.
     */
    @XmlElement(name = "disabledChoicePrintFormat")
    @FieldName("列印格式選擇")
    private boolean disabledChoicePrintFormat = Boolean.TRUE;

    /**
     * 列印格式選擇<BR>
     * option:A. 父, 母, B. 父, 母 + 生父, 生母
     */
    @XmlElement(name = "ChoicePrintFormat")
    @FieldName("列印格式選擇")
    private String choicePrintFormat = "";

    /** 列印父姓名選單. */
    @XmlElement(name = "FatherNameMap")
    @FieldName("列印父姓名選單")
    private Map<String, String> fatherNameMap = new LinkedHashMap<String, String>();

    /** 列印母姓名選單. */
    @XmlElement(name = "MotherNameMap")
    @FieldName("列印母姓名選單")
    private Map<String, String> motherNameMap = new LinkedHashMap<String, String>();

    /** 生父姓名. */
    @XmlElement(name = "BirthFatherName")
    @FieldName("生父姓名")
    private String birthFatherName = "";

    /** 生母姓名. */
    @XmlElement(name = "BirthMotherName")
    @FieldName("生母姓名")
    private String birthMotherName = "";

    /** 生父統號. */
    @XmlElement(name = "BirthMotherId")
    @FieldName("生父統號")
    private String birthFatherId = "";

    /** 生母統號. */
    @XmlElement(name = "BirthMotherId")
    @FieldName("生母統號")
    private String birthMotherId = "";

    /** 個人註記. */
    @XmlElement(name = "PersonalMark")
    @FieldName("個人註記")
    private String personalMark = "";

    /** 是否鎖定記事選擇按鈕. */
    @XmlElement(name = "DisabledCommonButton")
    @FieldName("是否鎖定記事選擇按鈕")
    private boolean disabledCommonButton = false;

    /**
     * Checks if is selected.
     * 
     * @return true, if is selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * Sets the selected.
     * 
     * @param selected
     *            the new selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * Gets the prints the sequence.
     * 
     * @return the prints the sequence
     */
    public String getPrintSequence() {
        return printSequence;
    }

    /**
     * Sets the prints the sequence.
     * 
     * @param printSequence
     *            the new prints the sequence
     */
    public void setPrintSequence(String printSequence) {
        this.printSequence = printSequence;
    }

    /**
     * Gets the person data.
     * 
     * @return the person data
     */
    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    /**
     * Sets the person data.
     * 
     * @param personData
     *            the new person data
     */
    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    /**
     * Checks if is prints the birth place.
     * 
     * @return true, if is prints the birth place
     */
    public boolean isPrintBirthPlace() {
        return printBirthPlace;
    }

    /**
     * Sets the prints the birth place.
     * 
     * @param printBirthPlace
     *            the new prints the birth place
     */
    public void setPrintBirthPlace(boolean printBirthPlace) {
        this.printBirthPlace = printBirthPlace;
    }

    /**
     * Gets the person notes.
     * 
     * @return the person notes
     */
    public List<Rl02510NoteDTO> getPersonNotes() {
        return personNotes;
    }

    /**
     * Sets the person notes.
     * 
     * @param personNotes
     *            the new person notes
     */
    public void setPersonNotes(List<Rl02510NoteDTO> personNotes) {
        this.personNotes = personNotes;
    }

    /**
     * Checks if is select all note.
     * 
     * @return true, if is select all note
     */
    public boolean isSelectAllNote() {
        return selectAllNote;
    }

    /**
     * Sets the select all note.
     * 
     * @param selectAllNote
     *            the new select all note
     */
    public void setSelectAllNote(boolean selectAllNote) {
        this.selectAllNote = selectAllNote;
    }

    /**
     * Gets the relation code.
     * 
     * @return the relation code
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * Sets the relation code.
     * 
     * @param relationCode
     *            the new relation code
     */
    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    /**
     * Gets the origin father name flag.
     * 
     * @return the origin father name flag
     */
    public String getOriginFatherNameFlag() {
        return originFatherNameFlag;
    }

    /**
     * Sets the origin father name flag.
     * 
     * @param originFatherNameFlag
     *            the new origin father name flag
     */
    public void setOriginFatherNameFlag(String originFatherNameFlag) {
        this.originFatherNameFlag = originFatherNameFlag;
    }

    /**
     * Gets the origin mother name flag.
     * 
     * @return the origin mother name flag
     */
    public String getOriginMotherNameFlag() {
        return originMotherNameFlag;
    }

    /**
     * Sets the origin mother name flag.
     * 
     * @param originMotherNameFlag
     *            the new origin mother name flag
     */
    public void setOriginMotherNameFlag(String originMotherNameFlag) {
        this.originMotherNameFlag = originMotherNameFlag;
    }

    /**
     * Gets the father name flag.
     * 
     * @return the father name flag
     */
    public String getFatherNameFlag() {
        return fatherNameFlag;
    }

    /**
     * Sets the father name flag.
     * 
     * @param fatherNameFlag
     *            the new father name flag
     */
    public void setFatherNameFlag(String fatherNameFlag) {
        this.fatherNameFlag = fatherNameFlag;
    }

    /**
     * Gets the mother name flag.
     * 
     * @return the mother name flag
     */
    public String getMotherNameFlag() {
        return motherNameFlag;
    }

    /**
     * Sets the mother name flag.
     * 
     * @param motherNameFlag
     *            the new mother name flag
     */
    public void setMotherNameFlag(String motherNameFlag) {
        this.motherNameFlag = motherNameFlag;
    }

    /**
     * Gets the origin relationship.
     * 
     * @return the origin relationship
     */
    public String getOriginRelationship() {
        return originRelationship;
    }

    /**
     * Sets the origin relationship.
     * 
     * @param originRelationship
     *            the new origin relationship
     */
    public void setOriginRelationship(String originRelationship) {
        this.originRelationship = originRelationship;
    }

    /**
     * Gets the relationship.
     * 
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the relationship.
     * 
     * @param relationship
     *            the new relationship
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * Checks if is select all choice print item.
     * 
     * @return true, if is select all choice print item
     */
    public boolean isSelectAllChoicePrintItem() {
        return selectAllChoicePrintItem;
    }

    /**
     * Sets the select all choice print item.
     * 
     * @param selectAllChoicePrintItem
     *            the new select all choice print item
     */
    public void setSelectAllChoicePrintItem(boolean selectAllChoicePrintItem) {
        this.selectAllChoicePrintItem = selectAllChoicePrintItem;
    }

    /**
     * Gets the personal mark.
     * 
     * @return the personal mark
     */
    public String getPersonalMarkContent() {
        return personalMarkContent;
    }

    /**
     * Sets the personal mark.
     * 
     * @param personalMarkContent
     *            the new personal mark content
     */
    public void setPersonalMarkContent(String personalMarkContent) {
        this.personalMarkContent = personalMarkContent;
    }

    /**
     * Gets the command button value.
     * 
     * @return the command button value
     */
    public String getCommandButtonValue() {
        return commandButtonValue;
    }

    /**
     * Sets the command button value.
     * 
     * @param commandButtonValue
     *            the new command button value
     */
    public void setCommandButtonValue(String commandButtonValue) {
        this.commandButtonValue = commandButtonValue;
    }

    /**
     * Checks if is disabled father name flag.
     * 
     * @return true, if is disabled father name flag
     */
    public boolean isDisabledFatherNameFlag() {
        return disabledFatherNameFlag;
    }

    /**
     * Sets the disabled father name flag.
     * 
     * @param disabledFatherNameFlag
     *            the new disabled father name flag
     */
    public void setDisabledFatherNameFlag(boolean disabledFatherNameFlag) {
        this.disabledFatherNameFlag = disabledFatherNameFlag;
    }

    /**
     * Checks if is disabled mother name flag.
     * 
     * @return true, if is disabled mother name flag
     */
    public boolean isDisabledMotherNameFlag() {
        return disabledMotherNameFlag;
    }

    /**
     * Sets the disabled mother name flag.
     * 
     * @param disabledMotherNameFlag
     *            the new disabled mother name flag
     */
    public void setDisabledMotherNameFlag(boolean disabledMotherNameFlag) {
        this.disabledMotherNameFlag = disabledMotherNameFlag;
    }

    /**
     * Gets the name romanization.
     * 
     * @return the name romanization
     */
    public String getNameRomanization() {
        return nameRomanization;
    }

    /**
     * Sets the name romanization.
     * 
     * @param nameRomanization
     *            the new name romanization
     */
    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    /**
     * Gets the birth place content.
     * 
     * @return the birth place content
     */
    public String getBirthPlaceContent() {
        return birthPlaceContent;
    }

    /**
     * Sets the birth place content.
     * 
     * @param birthPlaceContent
     *            the new birth place content
     */
    public void setBirthPlaceContent(String birthPlaceContent) {
        this.birthPlaceContent = birthPlaceContent;
    }

    /**
     * Checks if is check birth place content flag.
     * 
     * @return true, if is check birth place content flag
     */
    public boolean isCheckBirthPlaceContentFlag() {
        return checkBirthPlaceContentFlag;
    }

    /**
     * Sets the check birth place content flag.
     * 
     * @param checkBirthPlaceContentFlag
     *            the new check birth place content flag
     */
    public void setCheckBirthPlaceContentFlag(boolean checkBirthPlaceContentFlag) {
        this.checkBirthPlaceContentFlag = checkBirthPlaceContentFlag;
    }

    /**
     * Checks if is disabled choice print format.
     * 
     * @return true, if is disabled choice print format
     */
    public boolean isDisabledChoicePrintFormat() {
        return disabledChoicePrintFormat;
    }

    /**
     * Sets the disabled choice print format.
     * 
     * @param disabledChoicePrintFormat
     *            the new disabled choice print format
     */
    public void setDisabledChoicePrintFormat(boolean disabledChoicePrintFormat) {
        this.disabledChoicePrintFormat = disabledChoicePrintFormat;
    }

    /**
     * Gets the choice print format.
     * 
     * @return the choice print format
     */
    public String getChoicePrintFormat() {
        return choicePrintFormat;
    }

    /**
     * Sets the choice print format.
     * 
     * @param choicePrintFormat
     *            the new choice print format
     */
    public void setChoicePrintFormat(String choicePrintFormat) {
        this.choicePrintFormat = choicePrintFormat;
    }

    /**
     * Gets the father name map.
     * 
     * @return the father name map
     */
    public Map<String, String> getFatherNameMap() {
        return fatherNameMap;
    }

    /**
     * Sets the father name map.
     * 
     * @param fatherNameMap
     *            the father name map
     */
    public void setFatherNameMap(Map<String, String> fatherNameMap) {
        this.fatherNameMap = fatherNameMap;
    }

    /**
     * Gets the mother name map.
     * 
     * @return the mother name map
     */
    public Map<String, String> getMotherNameMap() {
        return motherNameMap;
    }

    /**
     * Sets the mother name map.
     * 
     * @param motherNameMap
     *            the mother name map
     */
    public void setMotherNameMap(Map<String, String> motherNameMap) {
        this.motherNameMap = motherNameMap;
    }

    /**
     * Gets the birth father name.
     * 
     * @return the birth father name
     */
    public String getBirthFatherName() {
        return birthFatherName;
    }

    /**
     * Sets the birth father name.
     * 
     * @param birthFatherName
     *            the new birth father name
     */
    public void setBirthFatherName(String birthFatherName) {
        this.birthFatherName = birthFatherName;
    }

    /**
     * Gets the birth mother name.
     * 
     * @return the birth mother name
     */
    public String getBirthMotherName() {
        return birthMotherName;
    }

    /**
     * Sets the birth mother name.
     * 
     * @param birthMotherName
     *            the new birth mother name
     */
    public void setBirthMotherName(String birthMotherName) {
        this.birthMotherName = birthMotherName;
    }

    /**
     * Gets the birth father id.
     * 
     * @return the birth father id
     */
    public String getBirthFatherId() {
        return birthFatherId;
    }

    /**
     * Sets the birth father id.
     * 
     * @param birthFatherId
     *            the new birth father id
     */
    public void setBirthFatherId(String birthFatherId) {
        this.birthFatherId = birthFatherId;
    }

    /**
     * Gets the birth mother id.
     * 
     * @return the birth mother id
     */
    public String getBirthMotherId() {
        return birthMotherId;
    }

    /**
     * Sets the birth mother id.
     * 
     * @param birthMotherId
     *            the new birth mother id
     */
    public void setBirthMotherId(String birthMotherId) {
        this.birthMotherId = birthMotherId;
    }

    /**
     * Gets the personal mark.
     * 
     * @return the personal mark
     */
    public String getPersonalMark() {
        return personalMark;
    }

    /**
     * Sets the personal mark.
     * 
     * @param personalMark
     *            the new personal mark
     */
    public void setPersonalMark(String personalMark) {
        this.personalMark = personalMark;
    }

    public boolean isDisabledCommonButton() {
        return disabledCommonButton;
    }

    public void setDisabledCommonButton(boolean disabledCommonButton) {
        this.disabledCommonButton = disabledCommonButton;
    }

}

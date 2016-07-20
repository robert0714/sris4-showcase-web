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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 戶籍滕本核發-申請現行戶籍謄本DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02100ApplyHouseholdDTO", propOrder = { "selected", "printSequence", "personData", "printBirthPlace",
        "personNotes", "selectAllNote", "relationCode", "printColumn", "commandButtonValue", "nameRomanization",
        "disabledCommonButton", "birthPlaceContent", "checkBirthPlaceContentFlag", "personalMark" })
@XmlRootElement(name = "Rl02100ApplyHouseholdDTO")
public class Rl02100ApplyHouseholdDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8102353018045259540L;

    /**
     * 是否選擇 <BR>
     * Default: 是.
     */
    @XmlElement(name = "Selected")
    @FieldName("是否選擇")
    private boolean selected = true;

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
    private boolean printBirthPlace = true;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事資料")
    private List<Rl02100NoteDTO> personNotes = new ArrayList<Rl02100NoteDTO>();

    /**
     * 是否選擇全部記事 <BR>
     * Default: 是.
     */
    @XmlElement(name = "SelectAllNote")
    @FieldName("是否選擇全部記事")
    private boolean selectAllNote = true;

    /** 稱謂代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("稱謂代碼")
    private String relationCode;

    /** 列印隱藏欄位 */
    @XmlElement(name = "PrintColumn")
    @FieldName("列印隱藏欄位")
    private Rl02100ColumnDTO printColumn;

    @XmlElement(name = "CommandButtonValue")
    @FieldName("按鈕文字")
    private String commandButtonValue = "全部";

    @XmlElement(name = "NameRomanization")
    @FieldName("羅馬拼音")
    private String nameRomanization;

    /** 是否鎖定記事選擇按鈕. */
    @XmlElement(name = "DisabledCommonButton")
    @FieldName("是否鎖定記事選擇按鈕")
    private boolean disabledCommonButton = false;

    /** 顯示戶籍謄本出生地. */
    @XmlElement(name = "BirthPlaceContent")
    @FieldName("顯示戶籍謄本出生地")
    private String birthPlaceContent = "";

    /** 檢查出生地大陸地區或國外出生地是否有出生地變更登記. */
    @XmlElement(name = "CheckBirthPlaceContentFlag")
    @FieldName("檢查出生地大陸地區或國外出生地是否有出生地變更登記")
    private boolean checkBirthPlaceContentFlag = Boolean.TRUE;

    /** 個人註記. */
    @XmlElement(name = "PersonalMark")
    @FieldName("個人註記")
    private String personalMark = "";

    public String getNameRomanization() {
        return nameRomanization;
    }

    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    public String getCommandButtonValue() {
        return commandButtonValue;
    }

    public void setCommandButtonValue(String commandButtonValue) {
        this.commandButtonValue = commandButtonValue;
    }

    public Rl02100ColumnDTO getPrintColumn() {
        return printColumn;
    }

    public void setPrintColumn(Rl02100ColumnDTO printColumn) {
        this.printColumn = printColumn;
    }

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
    public void setSelected(final boolean selected) {
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
    public void setPrintSequence(final String printSequence) {
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
    public void setPersonData(final XLDFPersonDataDomainObject personData) {
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
    public void setPrintBirthPlace(final boolean printBirthPlace) {
        this.printBirthPlace = printBirthPlace;
    }

    /**
     * Gets the person notes.
     * 
     * @return the person notes
     */
    public List<Rl02100NoteDTO> getPersonNotes() {
        return personNotes;
    }

    /**
     * Sets the person notes.
     * 
     * @param personNotes
     *            the new person notes
     */
    public void setPersonNotes(final List<Rl02100NoteDTO> personNotes) {
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
    public void setSelectAllNote(final boolean selectAllNote) {
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
    public void setRelationCode(final String relationCode) {
        this.relationCode = relationCode;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((personNotes == null) ? 0 : personNotes.hashCode());
        result = prime * result + (printBirthPlace ? 1231 : 1237);
        result = prime * result + ((printSequence == null) ? 0 : printSequence.hashCode());
        result = prime * result + (selectAllNote ? 1231 : 1237);
        result = prime * result + (selected ? 1231 : 1237);
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl02100ApplyHouseholdDTO other = (Rl02100ApplyHouseholdDTO) obj;
        if (personNotes == null) {
            if (other.personNotes != null)
                return false;
        } else if (!personNotes.equals(other.personNotes))
            return false;
        if (printBirthPlace != other.printBirthPlace)
            return false;
        if (printSequence == null) {
            if (other.printSequence != null)
                return false;
        } else if (!printSequence.equals(other.printSequence))
            return false;
        if (selectAllNote != other.selectAllNote)
            return false;
        if (selected != other.selected)
            return false;
        return true;
    }

    public boolean isDisabledCommonButton() {
        return disabledCommonButton;
    }

    public void setDisabledCommonButton(boolean disabledCommonButton) {
        this.disabledCommonButton = disabledCommonButton;
    }

    public String getBirthPlaceContent() {
        return birthPlaceContent;
    }

    public void setBirthPlaceContent(String birthPlaceContent) {
        this.birthPlaceContent = birthPlaceContent;
    }

    public boolean isCheckBirthPlaceContentFlag() {
        return checkBirthPlaceContentFlag;
    }

    public void setCheckBirthPlaceContentFlag(boolean checkBirthPlaceContentFlag) {
        this.checkBirthPlaceContentFlag = checkBirthPlaceContentFlag;
    }

    public String getPersonalMark() {
        return personalMark;
    }

    public void setPersonalMark(String personalMark) {
        this.personalMark = personalMark;
    }
}

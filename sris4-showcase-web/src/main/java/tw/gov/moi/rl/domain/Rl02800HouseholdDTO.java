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

import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 英文戶籍滕本核發-申請現行戶籍謄本DTO.
 * 
 * @author Josh hsu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rl02800HouseholdDTO")
public class Rl02800HouseholdDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8102353018045259540L;

    /**
     * 是否選擇 <BR>
     * Default: 是.
     */
    @XmlElement(name = "Selected")
    private boolean selected = true;

    /** 列印順序. */
    @XmlElement(name = "PrintSequence")
    private Integer printSequence;

    /** 個人基本資料. */
    @XmlElement(name = "PersonData")
    private XLDFPersonDataDomainObject personData;

    /**
     * 是否列印出生地 <BR>
     * Default: 是.
     */
    @XmlElement(name = "PrintBirthPlace")
    private boolean printBirthPlace = true;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNotes")
    private List<Rl02800NoteDTO> personNotes = new ArrayList<Rl02800NoteDTO>();
    
    /** 全戶記事資料. */
    @XmlElement(name = "HouseholdNotes")
    private List<Rl02800NoteDTO> householdNotes = new ArrayList<Rl02800NoteDTO>();

    /**
     * 是否選擇全部記事 <BR>
     * Default: 是.
     */
    @XmlElement(name = "SelectAllNote")
    private boolean selectAllNote = true;

    /** 稱謂代碼. */
    @XmlElement(name = "RelationCode")
    private String relationCode;

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
    public Integer getPrintSequence() {
        return printSequence;
    }

    /**
     * Sets the prints the sequence.
     * 
     * @param printSequence
     *            the new prints the sequence
     */
    public void setPrintSequence(final Integer printSequence) {
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
    public List<Rl02800NoteDTO> getPersonNotes() {
        return personNotes;
    }

    /**
     * Sets the person notes.
     * 
     * @param personNotes
     *            the new person notes
     */
    public void setPersonNotes(final List<Rl02800NoteDTO> personNotes) {
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

	public List<Rl02800NoteDTO> getHouseholdNotes() {
		return householdNotes;
	}

	public void setHouseholdNotes(List<Rl02800NoteDTO> householdNotes) {
		this.householdNotes = householdNotes;
	}
}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 英文戶籍滕本核發-記事選擇(電腦化前)DTO.
 * 
 * @author Josh hsu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl02800AddNoteDTO")
public class Rl02800AddNoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 23838367583747309L;

    /** 序號. */
    @XmlElement(name = "Id")
    private Integer id;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNote")
    private XLDFPersonNoteDomainObject personNote;
    
    /** 全戶記事資料. */
    @XmlElement(name = "HouseholdNote")
    private XLDFHouseholdNoteDomainObject householdNote;
    
    /** 記事內容. */
    @XmlElement(name = "RegisterContent")
    private String registerContent;
    
    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    private String registerCode;

    /**
     * 是否選擇不印<BR>
     * Default: 否.
     */
    @XmlElement(name = "NotPrint")
    private boolean notPrint = false;

    /** 次分類. */
    /*@XmlElement(name = "SubType")
    private String subType;*/

    /** 次分類名稱. */
    /*@XmlElement(name = "SubTypeName")
    private String subTypeName;*/

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * Gets the person note.
     * 
     * @return the person note
     */
    public XLDFPersonNoteDomainObject getPersonNote() {
        return personNote;
    }

    /**
     * Sets the person note.
     * 
     * @param personNote
     *            the new person note
     */
    public void setPersonNote(final XLDFPersonNoteDomainObject personNote) {
        this.personNote = personNote;
    }

    /**
     * Checks if is not print.
     * 
     * @return true, if is not print
     */
    public boolean isNotPrint() {
        return notPrint;
    }

    /**
     * Sets the not print.
     * 
     * @param notPrint
     *            the new not print
     */
    public void setNotPrint(final boolean notPrint) {
        this.notPrint = notPrint;
    }

	public String getRegisterContent() {
		return registerContent;
	}

	public void setRegisterContent(String registerContent) {
		this.registerContent = registerContent;
	}

	public String getRegisterCode() {
		return registerCode;
	}

	public void setRegisterCode(final String registerCode) {
		this.registerCode = registerCode;
	}

	public XLDFHouseholdNoteDomainObject getHouseholdNote() {
		return householdNote;
	}

	public void setHouseholdNote(XLDFHouseholdNoteDomainObject householdNote) {
		this.householdNote = householdNote;
	}

    /**
     * Gets the sub type.
     * 
     * @return the sub type
     */
    /*public String getSubType() {
        return subType;
    }*/

    /**
     * Sets the sub type.
     * 
     * @param subType
     *            the new sub type
     */
    /*public void setSubType(final String subType) {
        this.subType = subType;
    }*/

    /**
     * Gets the sub type name.
     * 
     * @return the sub type name
     */
    /*public String getSubTypeName() {
        return subTypeName;
    }*/

    /**
     * Sets the sub type name.
     * 
     * @param subTypeName
     *            the new sub type name
     */
   /* public void setSubTypeName(final String subTypeName) {
        this.subTypeName = subTypeName;
    }*/
}

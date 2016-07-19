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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 戶籍滕本核發-記事選擇DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl02100NoteDTO")
public class Rl02100NoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 23838367583747309L;

    /** 序號. */
    @XmlElement(name = "Id")
    @FieldName("序號")
    private Integer id;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNote")
    @FieldName("個人記事資料")
    private XLDFPersonNoteDomainObject personNote;

    /**
     * 是否選擇列印<BR>
     * Default: 是.
     */
    @XmlElement(name = "print")
    @FieldName("是否選擇列印")
    private boolean print = true;

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類")
    private String subType;

    /** 次分類名稱. */
    @XmlElement(name = "SubTypeName")
    @FieldName("次分類名稱")
    private String subTypeName;

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
     * Checks if is print.
     * 
     * @return true, if is print
     */
    public boolean isPrint() {
        return print;
    }

    /**
     * Sets the not print.
     * 
     * @param notPrint
     *            the new not print
     */
    public void setPrint(final boolean notPrint) {
        this.print = notPrint;
    }

    /**
     * Gets the sub type.
     * 
     * @return the sub type
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the sub type.
     * 
     * @param subType
     *            the new sub type
     */
    public void setSubType(final String subType) {
        this.subType = subType;
    }

    /**
     * Gets the sub type name.
     * 
     * @return the sub type name
     */
    public String getSubTypeName() {
        return subTypeName;
    }

    /**
     * Sets the sub type name.
     * 
     * @param subTypeName
     *            the new sub type name
     */
    public void setSubTypeName(final String subTypeName) {
        this.subTypeName = subTypeName;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + (print ? 1231 : 1237);
        result = prime * result + ((subType == null) ? 0 : subType.hashCode());
        result = prime * result + ((subTypeName == null) ? 0 : subTypeName.hashCode());
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
        Rl02100NoteDTO other = (Rl02100NoteDTO) obj;

        /**
         * if (id == null) { if (other.id != null) return false; } else if
         * (!id.equals(other.id)) return false;
         * 
         * if (notPrint != other.notPrint) return false;
         */
        if (subType == null) {
            if (other.subType != null)
                return false;
        } else if (!subType.equals(other.subType))
            return false;
        if (subTypeName == null) {
            if (other.subTypeName != null)
                return false;
        } else if (!subTypeName.equals(other.subTypeName))
            return false;
        return true;
    }
}

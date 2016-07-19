/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * SelectRegisterDTO(4/4)
 * 
 * @author Marcus Chen
 * 
 */
public class SelectRegisterDTO implements Serializable {

    /** Serial id. */
    private static final long serialVersionUID = 1L;

    /** 選擇. */
    @XmlElement(name = "Selected", required = true)
    @FieldName("選擇 ")
    private boolean selected;

    /** 個人記事資料. */
    @XmlElement(name = "Note", required = true)
    @FieldName("個人記事資料")
    private XLDFPersonNoteDomainObject note;

    /**
     * Constructor
     */
    public SelectRegisterDTO() {

    }

    /**
     * Constructor
     * 
     * @param note
     */
    public SelectRegisterDTO(XLDFPersonNoteDomainObject note) {
        this.selected = true;
        this.note = note;
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * 
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * @return the note
     */
    public XLDFPersonNoteDomainObject getNote() {
        return note;
    }

    /**
     * @param note
     *            the note to set
     */
    public void setNote(XLDFPersonNoteDomainObject note) {
        this.note = note;
    }
}

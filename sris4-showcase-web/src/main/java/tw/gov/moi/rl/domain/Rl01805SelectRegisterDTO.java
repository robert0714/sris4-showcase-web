/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * @author 1010486
 * 
 */
public class Rl01805SelectRegisterDTO implements Serializable {

    /** Serial id. */
    private static final long serialVersionUID = 1L;

    /** 選擇. */
    private boolean selected;

    /** 個人記事資料. */
    private XLDFPersonNoteDomainObject note;

    /**
     * Constructor
     */
    public Rl01805SelectRegisterDTO() {

    }

    /**
     * Constructor
     * 
     * @param note
     */
    public Rl01805SelectRegisterDTO(XLDFPersonNoteDomainObject note) {
        this.selected = true;
        this.note = note;
    }

    /**
     * @return the selected
     */
    public boolean getSelected() {
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

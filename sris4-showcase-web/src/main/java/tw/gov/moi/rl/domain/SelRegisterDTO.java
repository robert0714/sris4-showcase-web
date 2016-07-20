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
 * SelectRegisterDTO(4/4)
 * 
 * @author Marcus Chen
 * 
 */
public class SelRegisterDTO implements Serializable {

    /** Serial id. */
    private static final long serialVersionUID = 1L;

    /** 選擇. */
    private boolean selected;

    /** 選擇. */
    private boolean isHold;

    /** 個人記事資料. */
    private XLDFPersonNoteDomainObject note;

    /**
     * Constructor
     */
    public SelRegisterDTO() {

    }

    /**
     * Constructor
     * 
     * @param note
     */
    public SelRegisterDTO(XLDFPersonNoteDomainObject note) {
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

    /**
     * @return the isHold
     */
    public boolean isHold() {
        return isHold;
    }

    /**
     * @param isHold
     *            the isHold to set
     */
    public void setHold(boolean isHold) {
        this.isHold = isHold;
    }

}

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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf051mType;
import tw.gov.moi.domain.Rldf058mType;

/**
 * The Class Rl052a4ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052a4ResultDTO", propOrder = { "OriRldf058mObj", "EditRldf058mObj", "Rldf051mObj", "IsSign",
        "rowEdit" })
@XmlRootElement(name = "Rl052a4ResultDTO")
public class Rl052a4ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** original rldf058m Object */
    @XmlElement(name = "OriRldf058mObj", required = true)
    @FieldName("original rldf058m Object")
    private Rldf058mType oriRldf058mObj;

    /** edit rldf058m Object */
    @XmlElement(name = "EditRldf058mObj", required = true)
    @FieldName("edit rldf058m Object")
    private Rldf058mType editRldf058mObj;

    /** rldf051m Object */
    @XmlElement(name = "Rldf051mObj", required = true)
    @FieldName("rldf051m Object")
    private Rldf051mType rldf051mObj;

    /** row edit */
    @XmlElement(name = "RowEdit", required = true)
    @FieldName("rowEdit")
    private boolean rowEdit = false;

    public Rldf051mType getRldf051mObj() {
        return rldf051mObj;
    }

    public void setRldf051mObj(final Rldf051mType rldf051mObj) {
        this.rldf051mObj = rldf051mObj;
    }

    public Rldf058mType getOriRldf058mObj() {
        return oriRldf058mObj;
    }

    public void setOriRldf058mObj(final Rldf058mType oriRldf058mObj) {
        this.oriRldf058mObj = oriRldf058mObj;
    }

    public Rldf058mType getEditRldf058mObj() {
        return editRldf058mObj;
    }

    public void setEditRldf058mObj(final Rldf058mType editRldf058mObj) {
        this.editRldf058mObj = editRldf058mObj;
    }

    public boolean isRowEdit() {
        return rowEdit;
    }

    public void setRowEdit(boolean rowEdit) {
        this.rowEdit = rowEdit;
    }

}
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

/**
 * The Class Rl01626DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01626DTO", propOrder = { "editList", "saveBtn" })
@XmlRootElement(name = "Rl01626DTO")
public class Rl01626DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 編輯門牌清單. */
    @XmlElement(name = "EditList")
    @FieldName("編輯門牌清單")
    private List<Rl01626DTOResult> editList;

    @XmlElement(name = "EditList")
    @FieldName("修改門牌清單")
    private List<Rl01626DTOResult> modfiys = new ArrayList<Rl01626DTOResult>();

    /** 控制「存檔」按鈕. */
    @XmlElement(name = "SaveBtn")
    @FieldName("控制「存檔」按鈕")
    private boolean saveBtn;

    /**
     * Gets the edits the list.
     * 
     * @return the edits the list
     */
    public List<Rl01626DTOResult> getEditList() {
        if (editList == null) {
            editList = new ArrayList<Rl01626DTOResult>();
        }
        return editList;
    }

    /**
     * Sets the edits the list.
     * 
     * @param editList
     *            the new edits the list
     */
    public void setEditList(List<Rl01626DTOResult> editList) {
        this.editList = editList;
    }

    /**
     * Checks if is save btn.
     * 
     * @return true, if is save btn
     */
    public boolean isSaveBtn() {
        return saveBtn;
    }

    /**
     * Sets the save btn.
     * 
     * @param saveBtn
     *            the new save btn
     */
    public void setSaveBtn(boolean saveBtn) {
        this.saveBtn = saveBtn;
    }

    public List<Rl01626DTOResult> getModfiys() {
        return modfiys;
    }

    public void setModfiys(List<Rl01626DTOResult> modfiys) {
        this.modfiys = modfiys;
    }

}

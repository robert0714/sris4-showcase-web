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
 * The Class Rl08411DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08411DTO", propOrder = { "school", "villageCode", "openErrorDialog", "verification",
        "rl08411AdressDTOs", "errorAdressDTOs" })
@XmlRootElement(name = "Rl08411DTO")
public class Rl08411DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1590455689848241551L;

    /** 學區. */
    @XmlElement(name = "School")
    @FieldName("學區")
    private String school;

    /** The village code. */
    @XmlElement(name = "VillageCode")
    @FieldName("村里")
    private String villageCode;

    // /** The open error dialog. */
    // @XmlElement(name = "OpenErrorDialog")
    // @FieldName("Error Dialog")
    // private boolean openErrorDialog = false;

    /** The verification. */
    @XmlElement(name = "ActionMode")
    @FieldName("動作模式")
    private boolean actionMode = false;

    /** ModeFlag. */
    @XmlElement(name = "ModeFlag")
    @FieldName("ModeFlag")
    private String modeFlag = "";

    /** The rl08411 adress dtos. */
    @XmlElement(name = "Rl08411AdressDTOs")
    @FieldName("Adress DTOs")
    private List<Rl08411AdressDTO> rl08411AdressDTOs = new ArrayList<Rl08411AdressDTO>();

     /** The error adress dtos. */
     @XmlElement(name = "ErrorAdressDTOs")
     @FieldName("Error Adress DTOs")
     private List<Rl08411AdressDTO> errorAdressDTOs;

    /** QueryList. */
    @XmlElement(name = "QueryList")
    @FieldName("QueryList")
    private List<Rl08411AdressDTO> queryAdressDTOs;

    /** CopyQueryList. */
    @XmlElement(name = "CopyQueryList")
    @FieldName("CopyQueryList")
    private List<Rl08411AdressDTO> copyQueryAdressDTOs;

    /**
     * Gets the school.
     * 
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Sets the school.
     * 
     * @param school
     *            the new school
     */
    public void setSchool(final String school) {
        this.school = school;
    }

    /**
     * Gets the village code.
     * 
     * @return the village code
     */
    public String getVillageCode() {
        return villageCode;
    }

    /**
     * Sets the village code.
     * 
     * @param villageCode
     *            the new village code
     */
    public void setVillageCode(final String villageCode) {
        this.villageCode = villageCode;
    }

    /**
     * Checks if is open error dialog.
     * 
     * @return true, if is open error dialog
     */
    // public boolean isOpenErrorDialog() {
    // return openErrorDialog;
    // }

    /**
     * Sets the open error dialog.
     * 
     * @param openErrorDialog
     *            the new open error dialog
     */
    // public void setOpenErrorDialog(final boolean openErrorDialog) {
    // this.openErrorDialog = openErrorDialog;
    // }

    /**
     * Checks if is verification.
     * 
     * @return true, if is verification
     */
    // public boolean isVerification() {
    // return verification;
    // }

    /**
     * Sets the verification.
     * 
     * @param verification
     *            the new verification
     */
    // public void setVerification(final boolean verification) {
    // this.verification = verification;
    // }

    /**
     * Gets the rl08411 adress dt os.
     * 
     * @return the rl08411 adress dt os
     */
    public List<Rl08411AdressDTO> getRl08411AdressDTOs() {
        return rl08411AdressDTOs;
    }

    /**
     * Sets the rl08411 adress dt os.
     * 
     * @param rl08411AdressDTOs
     *            the new rl08411 adress dt os
     */
    public void setRl08411AdressDTOs(final List<Rl08411AdressDTO> rl08411AdressDTOs) {
        this.rl08411AdressDTOs = rl08411AdressDTOs;
    }

    /**
     * Gets the error adress dt os.
     * 
     * @return the error adress dt os
     */
     public List<Rl08411AdressDTO> getErrorAdressDTOs() {
     return errorAdressDTOs;
     }

    /**
     * Sets the error adress dt os.
     * 
     * @param errorAdressDTOs
     *            the new error adress dt os
     */
     public void setErrorAdressDTOs(final List<Rl08411AdressDTO>
     errorAdressDTOs) {
     this.errorAdressDTOs = errorAdressDTOs;
     }

    public List<Rl08411AdressDTO> getQueryAdressDTOs() {
        return queryAdressDTOs;
    }

    public void setQueryAdressDTOs(List<Rl08411AdressDTO> queryAdressDTOs) {
        this.queryAdressDTOs = queryAdressDTOs;
    }

    public List<Rl08411AdressDTO> getCopyQueryAdressDTOs() {
        return copyQueryAdressDTOs;
    }

    public void setCopyQueryAdressDTOs(List<Rl08411AdressDTO> copyQueryAdressDTOs) {
        this.copyQueryAdressDTOs = copyQueryAdressDTOs;
    }

    public boolean isActionMode() {
        return actionMode;
    }

    public void setActionMode(boolean actionMode) {
        this.actionMode = actionMode;
    }

    public String getModeFlag() {
        return modeFlag;
    }

    public void setModeFlag(String modeFlag) {
        this.modeFlag = modeFlag;
    }

}

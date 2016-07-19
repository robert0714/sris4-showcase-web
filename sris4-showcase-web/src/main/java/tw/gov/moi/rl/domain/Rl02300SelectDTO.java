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

/**
 * The Class Rl02300SelectDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02300SelectDTO", propOrder = { "Index", "Village", "Neighbor", "Doorplate", "Registeryyymmdd",
        "RegisterKind", "RegisterKindName", "ModifyKind", "FileKind", "OldVillage", "OldNeighbor", "OldDoorplate",
        "Newold" })
@XmlRootElement(name = "Rl02300SelectDTO")
public class Rl02300SelectDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Index")
    @FieldName("序次")
    private String index;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 門牌. */
    @XmlElement(name = "Doorplate")
    @FieldName("門牌")
    private String doorplate;

    /** 編釘日期. */
    @XmlElement(name = "Registeryyymmdd")
    @FieldName("編釘日期")
    private String registeryyymmdd;

    /** 編釘種類. */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘種類")
    private String registerKind;

    /** 編釘種類名稱. */
    @XmlElement(name = "RegisterKindName")
    @FieldName("編釘種類名稱")
    private String registerKindName;

    /** 異動類別. */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 門牌種類. */
    @XmlElement(name = "FileKind")
    @FieldName("門牌種類")
    private String fileKind;

    /** 異動前村里. */
    @XmlElement(name = "OldVillage")
    @FieldName("異動前村里")
    private String oldVillage;

    /** 異動前鄰. */
    @XmlElement(name = "OldNeighbor")
    @FieldName("異動前鄰")
    private String oldNeighbor;

    /** 異動前門牌. */
    @XmlElement(name = "OldDoorplate")
    @FieldName("異動前門牌")
    private String oldDoorplate;

    /** 異動前村里. */
    @XmlElement(name = "NewVillage")
    @FieldName("異動後村里")
    private String newVillage;

    /** 異動前鄰. */
    @XmlElement(name = "NewNeighbor")
    @FieldName("異動後前鄰")
    private String newNeighbor;

    /** 異動前門牌. */
    @XmlElement(name = "NewDoorplate")
    @FieldName("異動後門牌")
    private String newDoorplate;

    /** 門牌新舊註記. */
    @XmlElement(name = "Newold")
    @FieldName("門牌新舊註記")
    private String newold;

    public String getNewVillage() {
        return newVillage;
    }

    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    public String getNewNeighbor() {
        return newNeighbor;
    }

    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    public String getNewDoorplate() {
        return newDoorplate;
    }

    public void setNewDoorplate(String newDoorplate) {
        this.newDoorplate = newDoorplate;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getDoorplate() {
        return doorplate;
    }

    public void setDoorplate(String doorplate) {
        this.doorplate = doorplate;
    }

    public String getRegisteryyymmdd() {
        return registeryyymmdd;
    }

    public void setRegisteryyymmdd(String registeryyymmdd) {
        this.registeryyymmdd = registeryyymmdd;
    }

    public String getRegisterKind() {
        return registerKind;
    }

    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    public String getRegisterKindName() {
        return registerKindName;
    }

    public void setRegisterKindName(String registerKindName) {
        this.registerKindName = registerKindName;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getFileKind() {
        return fileKind;
    }

    public void setFileKind(String fileKind) {
        this.fileKind = fileKind;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOldNeighbor() {
        return oldNeighbor;
    }

    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    public String getOldDoorplate() {
        return oldDoorplate;
    }

    public void setOldDoorplate(String oldDoorplate) {
        this.oldDoorplate = oldDoorplate;
    }

    public String getNewold() {
        return newold;
    }

    public void setNewold(String newold) {
        this.newold = newold;
    }

}

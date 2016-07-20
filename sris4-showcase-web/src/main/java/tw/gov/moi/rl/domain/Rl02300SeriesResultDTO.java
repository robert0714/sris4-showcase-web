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
 * The Class Rl02300SeriesResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02300SeriesResultDTO", propOrder = { "Index", "Village", "Neighbor", "Doorplate", "Registeryyymmdd",
        "RegisterKind", "RegisterKindName", "ModifyKind", "FileKind" })
@XmlRootElement(name = "Rl02300SeriesResultDTO")
public class Rl02300SeriesResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Index")
    @FieldName("序次")
    private String index;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 門牌 */
    @XmlElement(name = "Doorplate")
    @FieldName("門牌")
    private String doorplate;

    /** 編釘日期 */
    @XmlElement(name = "Registeryyymmdd")
    @FieldName("編釘日期")
    private String registeryyymmdd;

    /** 編釘種類 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘種類")
    private String registerKind;

    /** 編釘種類名稱 */
    @XmlElement(name = "RegisterKindName")
    @FieldName("編釘種類名稱")
    private String registerKindName;

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 門牌種類 */
    @XmlElement(name = "FileKind")
    @FieldName("門牌種類")
    private String fileKind;

    @XmlElement(name = "Leavel")
    @FieldName("排序專用欄位")
    private String leavel;

    public String getLeavel() {
        return leavel;
    }

    public void setLeavel(String leavel) {
        this.leavel = leavel;
    }

    /**
     * 判斷是是否資料曾經出現過
     * 
     * @return
     */
    public String getkey() {
        return village + neighbor + doorplate + registeryyymmdd + registerKind;
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

}

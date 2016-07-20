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
import tw.gov.moi.ae.personimage.domain.ImgInfoDto;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf022dType;

/**
 * The Class Rl02a30DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a30ResultDTO", propOrder = { "index", "personId", "isCellophane", "personName", "birthYyymmdd",
        "applyYyymmdd", "applyHhmmss", "processMark", "processStatus", "newProcessStatus", "idCardApplyYyymmdd",
        "idCardApplyCode", "idCardApplyMark", "voidYyymmdd", "voidHhmmss", "voidCode", "voidName", "isOffsite",
        "rldf002d", "rldf022d", "rldf004m", "rldf004h", "rldf012d1", "rldf012d2", "imgInfoDto" })
@XmlRootElement(name = "Rl02a30ResultDTO")
public class Rl02a30ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 序號 */
    @FieldName("序號")
    @XmlElement(name = "Index")
    private String index;

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 是否已護貝 */
    @FieldName("是否已護貝 ")
    @XmlElement(name = "IsCellophane")
    private String isCellophane;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 出生日期 */
    @FieldName("出生日期 ")
    @XmlElement(name = "BirthYyymmdd")
    private String birthYyymmdd;

    /** 受理日期 */
    @FieldName("受理日期")
    @XmlElement(name = "ApplyYyymmdd")
    private String applyYyymmdd;

    /** 受理時間 */
    @FieldName("受理時間")
    @XmlElement(name = "ApplyHhmmss")
    private String applyHhmmss;

    /** 製程註記 */
    @FieldName("製程註記")
    @XmlElement(name = "ProcessMark")
    private String processMark;

    /** 前次處理狀況 */
    @FieldName("前次處理狀況")
    @XmlElement(name = "ProcessStatus")
    private String processStatus;

    /** 本次處理狀況 */
    @FieldName("本次處理狀況")
    @XmlElement(name = "NewProcessStatus")
    private String newProcessStatus;

    /** 原/異動後領補換日期 */
    @FieldName("原/異動後領補換日期 ")
    @XmlElement(name = "IdCardApplyYyymmdd")
    private String idCardApplyYyymmdd;

    /** 原/異動後領補換代碼 */
    @FieldName("原/異動後領補換代碼 ")
    @XmlElement(name = "IdCardApplyCode")
    private String idCardApplyCode;

    /** 國民身分證請領註記 */
    @FieldName("國民身分證請領註記")
    @XmlElement(name = "IdCardApplyMark")
    private String idCardApplyMark;

    /** 作廢日期 */
    @FieldName("作廢日期")
    @XmlElement(name = "VoidYyymmdd")
    private String voidYyymmdd;

    /** 作廢時間 */
    @FieldName("作廢時間 ")
    @XmlElement(name = "VoidHhmmss")
    private String voidHhmmss;

    /** 作廢註記 */
    @FieldName("作廢註記")
    @XmlElement(name = "VoidCode")
    private String voidCode;

    /** 造成作廢人員 */
    @FieldName("造成作廢人員")
    @XmlElement(name = "VoidName")
    private String voidName;

    /** 異地案件 */
    @FieldName("異地案件")
    @XmlElement(name = "IsOffsite")
    private Boolean isOffsite;

    @XmlElement(name = "Rldf002d")
    @FieldName("Rldf002d")
    private Rldf002dType rldf002d = null;

    @XmlElement(name = "Rldf022d")
    @FieldName("Rldf022d")
    private Rldf022dType rldf022d = null;

    @XmlElement(name = "Rldf004m")
    @FieldName("Rldf004m")
    private Rldf004mType rldf004m = null;

    @XmlElement(name = "Rldf004m")
    @FieldName("Rldf004m")
    private Rldf004hType rldf004h = null;

    @XmlElement(name = "Rldf012d1")
    @FieldName("Rldf012d1")
    private Rldf012dType rldf012d1 = null;

    @XmlElement(name = "Rldf012d2")
    @FieldName("Rldf012d2")
    private Rldf012dType rldf012d2 = null;

    /** 影像索引資料. */
    @XmlElement(name = "ImgInfoDto", required = true)
    @FieldName("影像索引資料")
    private ImgInfoDto imgInfoDto;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getIsCellophane() {
        return isCellophane;
    }

    public void setIsCellophane(String isCellophane) {
        this.isCellophane = isCellophane;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    public String getProcessMark() {
        return processMark;
    }

    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getNewProcessStatus() {
        return newProcessStatus;
    }

    public void setNewProcessStatus(String newProcessStatus) {
        this.newProcessStatus = newProcessStatus;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    public void setIdCardApplyCode(String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    public String getIdCardApplyMark() {
        return idCardApplyMark;
    }

    public void setIdCardApplyMark(String idCardApplyMark) {
        this.idCardApplyMark = idCardApplyMark;
    }

    public String getVoidYyymmdd() {
        return voidYyymmdd;
    }

    public void setVoidYyymmdd(String voidYyymmdd) {
        this.voidYyymmdd = voidYyymmdd;
    }

    public String getVoidHhmmss() {
        return voidHhmmss;
    }

    public void setVoidHhmmss(String voidHhmmss) {
        this.voidHhmmss = voidHhmmss;
    }

    public String getVoidCode() {
        return voidCode;
    }

    public void setVoidCode(String voidCode) {
        this.voidCode = voidCode;
    }

    public String getVoidName() {
        return voidName;
    }

    public void setVoidName(String voidName) {
        this.voidName = voidName;
    }

    public Boolean getIsOffsite() {
        return isOffsite;
    }

    public void setIsOffsite(Boolean isOffsite) {
        this.isOffsite = isOffsite;
    }

    public Rldf002dType getRldf002d() {
        return rldf002d;
    }

    public void setRldf002d(Rldf002dType rldf002d) {
        this.rldf002d = rldf002d;
    }

    public Rldf022dType getRldf022d() {
        return rldf022d;
    }

    public void setRldf022d(Rldf022dType rldf022d) {
        this.rldf022d = rldf022d;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    public Rldf004hType getRldf004h() {
        return rldf004h;
    }

    public void setRldf004h(Rldf004hType rldf004h) {
        this.rldf004h = rldf004h;
    }

    public Rldf012dType getRldf012d1() {
        return rldf012d1;
    }

    public void setRldf012d1(Rldf012dType rldf012d1) {
        this.rldf012d1 = rldf012d1;
    }

    public Rldf012dType getRldf012d2() {
        return rldf012d2;
    }

    public void setRldf012d2(Rldf012dType rldf012d2) {
        this.rldf012d2 = rldf012d2;
    }

    public ImgInfoDto getImgInfoDto() {
        return imgInfoDto;
    }

    public void setImgInfoDto(ImgInfoDto imgInfoDto) {
        this.imgInfoDto = imgInfoDto;
    }
}

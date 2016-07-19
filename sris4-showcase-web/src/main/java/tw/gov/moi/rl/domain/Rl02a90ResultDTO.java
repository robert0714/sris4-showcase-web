/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.personimage.domain.ImgInfoDto;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf003dType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf022dType;

/**
 * The Class Rl02a90ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a90ResultDTO", propOrder = { "index", "personId", "personName", "birthYyymmdd", "applyYyymmdd",
        "applyHhmmss", "isOffsite", "rldf002d", "rldf022d", "rldf004m", "rldf004h", "rldf012d1", "rldf012d2",
        "rldf003d", "imageList" })
@XmlRootElement(name = "Rl02a90ResultDTO")
public class Rl02a90ResultDTO implements Serializable {

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

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 出生日期 */
    @FieldName("出生日期")
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

    /** 異地案件 */
    @FieldName("異地案件")
    @XmlElement(name = "IsOffsite")
    private Boolean isOffsite;

    @FieldName("Rldf002d")
    @XmlElement(name = "Rldf002d")
    private Rldf002dType rldf002d;

    @FieldName("Rldf022d")
    @XmlElement(name = "Rldf022d")
    private Rldf022dType rldf022d;

    @FieldName("Rldf004m")
    @XmlElement(name = "Rldf004m")
    private Rldf004mType rldf004m;

    @FieldName("Rldf004h")
    @XmlElement(name = "Rldf004h")
    private Rldf004hType rldf004h;

    @FieldName("Rldf012d1")
    @XmlElement(name = "Rldf012d1")
    private Rldf012dType rldf012d1;

    @FieldName("Rldf012d2")
    @XmlElement(name = "Rldf012d2")
    private Rldf012dType rldf012d2;

    @FieldName("Rldf003d")
    @XmlElement(name = "Rldf003d")
    private Rldf003dType rldf003d;

    @FieldName("影像索引資料")
    @XmlElement(name = "ImageList")
    private List<ImgInfoDto> imageList;

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

    public Rldf003dType getRldf003d() {
        return rldf003d;
    }

    public void setRldf003d(Rldf003dType rldf003d) {
        this.rldf003d = rldf003d;
    }

    public List<ImgInfoDto> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImgInfoDto> imageList) {
        this.imageList = imageList;
    }

}

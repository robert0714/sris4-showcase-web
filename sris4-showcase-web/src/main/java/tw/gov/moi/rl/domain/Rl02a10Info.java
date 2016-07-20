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
import tw.gov.moi.domain.Rcdf001mType;
import tw.gov.moi.domain.Rldf022dType;
import tw.gov.moi.domain.Rldfm12mType;
import tw.gov.moi.domain.Xldf001aType;
import tw.gov.moi.domain.Xldf001mType;
import tw.gov.moi.domain.Xldf002dType;
import tw.gov.moi.domain.Xldf004mType;
import tw.gov.moi.domain.Xldf008aType;
import tw.gov.moi.domain.Xldf008mType;
import tw.gov.moi.domain.Xldfm06mType;

/**
 * 國民身分證請領申請人資料.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a10Info", propOrder = { "idn", "pfn", "name", "birthday", "bornPlace", "siteId", "save", "print",
        "color", "realApply", "xldf001aType", "xldf001mType", "xldf002dType", "xldf004mType", "xldf008aType",
        "xldf008mType", "rl02a10FamilyImageDTO", "rl02a10FamilyImageDTOList", "familyMemberSize", "applySeq",
        "imgPath", "rldfm12mType", "xldfm06mType", "brothersAndSistersData", "appData", "xldf008mList", "initSuccess",
        "xldfm06mTypeAfterSave", "rldf022dType", "sort" })
@XmlRootElement(name = "Rl02a10Info")
public class Rl02a10Info implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "Idn")
    @FieldName("國民身分證統一編號")
    private String idn = "";

    /** 戶號. */
    @XmlElement(name = "Pfn")
    @FieldName("戶號")
    private String pfn = "";

    /** 姓名. */
    @XmlElement(name = "Name")
    @FieldName("姓名")
    private String name = "";

    /** 出生日期. */
    @XmlElement(name = "Birthday")
    @FieldName("出生日期")
    private String birthday = "";

    /** 出生地. */
    @XmlElement(name = "BornPlace")
    @FieldName("出生地")
    private String bornPlace = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 是否暫存. */
    @XmlElement(name = "Save")
    @FieldName("是否暫存")
    private boolean save = Boolean.FALSE;

    /** 是否列印. */
    @XmlElement(name = "Print")
    @FieldName("是否列印")
    private boolean print = Boolean.FALSE;

    /** 背景顏色. */
    @XmlElement(name = "Color")
    @FieldName("背景顏色")
    private String color = "";

    /** 確定請領. */
    @XmlElement(name = "RealApply")
    @FieldName("確定請領")
    private boolean realApply = Boolean.FALSE;

    /** The xldf001a type. */
    @XmlElement(name = "Xldf001aType")
    @FieldName("臨時全面換證資料檔")
    private Xldf001aType xldf001aType;

    /** The xldf001m type. */
    @XmlElement(name = "Xldf001mType")
    @FieldName("臨時全戶基本資料檔")
    private Xldf001mType xldf001mType;

    /** The xldf002d type. */
    @XmlElement(name = "Xldf002dType")
    @FieldName("臨時新式國民身分證請領記錄檔")
    private Xldf002dType xldf002dType;

    /** The xldf004m type. */
    @XmlElement(name = "Xldf004mType")
    @FieldName("臨時個人基本資料檔")
    private Xldf004mType xldf004mType;

    /** The xldf008a type. */
    @XmlElement(name = "Xldf008aType")
    @FieldName("臨時全面換證起始日資料檔")
    private Xldf008aType xldf008aType;

    /** 臨時特殊人口資料檔只有 H I J K. */
    @XmlElement(name = "Xldf008mType")
    @FieldName("臨時特殊人口資料檔")
    private Xldf008mType xldf008mType;

    /** 兄弟姊妹影像檔. */
    @XmlElement(name = "Rl02a10FamilyImageDTO")
    @FieldName("兄弟姊妹影像檔")
    private Rl02a10FamilyImageDTO rl02a10FamilyImageDTO;

    /** 兄弟姊妹影像檔清單. */
    @XmlElement(name = "Rl02a10FamilyImageDTOList")
    @FieldName("兄弟姊妹影像檔清單")
    private List<Rl02a10FamilyImageDTO> rl02a10FamilyImageDTOList;

    /** 兄弟姊妹人數. */
    @XmlElement(name = "FamilyMemberSize")
    @FieldName("兄弟姊妹人數")
    private int familyMemberSize = 0;

    /** 申請書流水編號. */
    @XmlElement(name = "ApplySeq")
    @FieldName("申請書流水編號")
    private int applySeq = 0;

    /** 個人影像路徑. */
    @XmlElement(name = "ImgPath")
    @FieldName("個人影像路徑")
    private String imgPath = "";

    /** 國民身分證列印旗標資料檔 */
    @XmlElement(name = "Rldfm12mType")
    @FieldName("國民身分證列印旗標資料檔")
    private Rldfm12mType rldfm12mType;

    /** 臨時國民身分證掛失紀錄檔 */
    @XmlElement(name = "Xldfm06mType")
    @FieldName("臨時國民身分證掛失紀錄檔")
    private Xldfm06mType xldfm06mType;

    /** 兄弟姊妹資料. */
    @XmlElement(name = "BrothersAndSistersData")
    @FieldName("兄弟姊妹資料")
    private List<Rcdf001mType> brothersAndSistersData;

    /** 申請資料. */
    @XmlElement(name = "AppData")
    @FieldName("申請資料")
    private Rl02A10AppDataDTO appData;

    /** 所有臨時特殊人口資料檔不含HIJK. */
    @XmlElement(name = "Xldf008mList")
    @FieldName("所有臨時特殊人口資料檔不含HIJK")
    private List<Xldf008mType> xldf008mList;

    /** 所有臨時特殊人口資料檔不含HIJK. */
    @XmlElement(name = "Xldf008mList")
    @FieldName("初始化是否成功")
    private boolean initSuccess = false;

    /** 臨時國民身分證掛失紀錄檔暫存後. */
    @XmlElement(name = "Xldfm06mTypeAfterSave")
    @FieldName("臨時國民身分證掛失紀錄檔暫存後")
    private Xldfm06mType xldfm06mTypeAfterSave;

    /** 辦理他所新式國民身分證請領記錄檔. */
    @XmlElement(name = "Rldf022dType")
    @FieldName("辦理他所新式國民身分證請領記錄檔")
    private Rldf022dType rldf022dType;

    /** 請領清單排序. */
    @XmlElement(name = "Sort")
    @FieldName("請領清單排序")
    private int sort = 0;

    /**
     * Gets the idn.
     * 
     * @return the idn
     */
    public String getIdn() {
        return idn;
    }

    /**
     * Sets the idn.
     * 
     * @param idn
     *            the new idn
     */
    public void setIdn(String idn) {
        this.idn = idn;
    }

    /**
     * Gets the pfn.
     * 
     * @return the pfn
     */
    public String getPfn() {
        return pfn;
    }

    /**
     * Sets the pfn.
     * 
     * @param pfn
     *            the new pfn
     */
    public void setPfn(String pfn) {
        this.pfn = pfn;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the birthday.
     * 
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the birthday.
     * 
     * @param birthday
     *            the new birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Gets the born place.
     * 
     * @return the born place
     */
    public String getBornPlace() {
        return bornPlace;
    }

    /**
     * Sets the born place.
     * 
     * @param bornPlace
     *            the new born place
     */
    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Checks if is save.
     * 
     * @return true, if is save
     */
    public boolean isSave() {
        return save;
    }

    /**
     * Sets the save.
     * 
     * @param save
     *            the new save
     */
    public void setSave(boolean save) {
        this.save = save;
    }

    /**
     * Checks if is prints the.
     * 
     * @return true, if is prints the
     */
    public boolean isPrint() {
        return print;
    }

    /**
     * Sets the prints the.
     * 
     * @param print
     *            the new prints the
     */
    public void setPrint(boolean print) {
        this.print = print;
    }

    /**
     * Gets the color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     * 
     * @param color
     *            the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if is real apply.
     * 
     * @return true, if is real apply
     */
    public boolean isRealApply() {
        return realApply;
    }

    /**
     * Sets the real apply.
     * 
     * @param realApply
     *            the new real apply
     */
    public void setRealApply(boolean realApply) {
        this.realApply = realApply;
    }

    /**
     * Gets the xldf001a type.
     * 
     * @return the xldf001a type
     */
    public Xldf001aType getXldf001aType() {
        return xldf001aType;
    }

    /**
     * Sets the xldf001a type.
     * 
     * @param xldf001aType
     *            the new xldf001a type
     */
    public void setXldf001aType(Xldf001aType xldf001aType) {
        this.xldf001aType = xldf001aType;
    }

    /**
     * Gets the xldf001m type.
     * 
     * @return the xldf001m type
     */
    public Xldf001mType getXldf001mType() {
        return xldf001mType;
    }

    /**
     * Sets the xldf001m type.
     * 
     * @param xldf001mType
     *            the new xldf001m type
     */
    public void setXldf001mType(Xldf001mType xldf001mType) {
        this.xldf001mType = xldf001mType;
    }

    /**
     * Gets the xldf002d type.
     * 
     * @return the xldf002d type
     */
    public Xldf002dType getXldf002dType() {
        return xldf002dType;
    }

    /**
     * Sets the xldf002d type.
     * 
     * @param xldf002dType
     *            the new xldf002d type
     */
    public void setXldf002dType(Xldf002dType xldf002dType) {
        this.xldf002dType = xldf002dType;
    }

    /**
     * Gets the xldf004m type.
     * 
     * @return the xldf004m type
     */
    public Xldf004mType getXldf004mType() {
        return xldf004mType;
    }

    /**
     * Sets the xldf004m type.
     * 
     * @param xldf004mType
     *            the new xldf004m type
     */
    public void setXldf004mType(Xldf004mType xldf004mType) {
        this.xldf004mType = xldf004mType;
    }

    /**
     * Gets the xldf008a type.
     * 
     * @return the xldf008a type
     */
    public Xldf008aType getXldf008aType() {
        return xldf008aType;
    }

    /**
     * Sets the xldf008a type.
     * 
     * @param xldf008aType
     *            the new xldf008a type
     */
    public void setXldf008aType(Xldf008aType xldf008aType) {
        this.xldf008aType = xldf008aType;
    }

    /**
     * Gets the xldf008m type.
     * 
     * @return the xldf008m type
     */
    public Xldf008mType getXldf008mType() {
        return xldf008mType;
    }

    /**
     * Sets the xldf008m type.
     * 
     * @param xldf008mType
     *            the new xldf008m type
     */
    public void setXldf008mType(Xldf008mType xldf008mType) {
        this.xldf008mType = xldf008mType;
    }

    /**
     * Gets the rl02a10 family image dto.
     * 
     * @return the rl02a10 family image dto
     */
    public Rl02a10FamilyImageDTO getRl02a10FamilyImageDTO() {
        if (rl02a10FamilyImageDTO == null) {
            rl02a10FamilyImageDTO = new Rl02a10FamilyImageDTO();
        }
        return rl02a10FamilyImageDTO;
    }

    /**
     * Sets the rl02a10 family image dto.
     * 
     * @param rl02a10FamilyImageDTO
     *            the new rl02a10 family image dto
     */
    public void setRl02a10FamilyImageDTO(Rl02a10FamilyImageDTO rl02a10FamilyImageDTO) {
        this.rl02a10FamilyImageDTO = rl02a10FamilyImageDTO;
    }

    /**
     * Gets the rl02a10 family image dto list.
     * 
     * @return the rl02a10 family image dto list
     */
    public List<Rl02a10FamilyImageDTO> getRl02a10FamilyImageDTOList() {
        return rl02a10FamilyImageDTOList;
    }

    /**
     * Sets the rl02a10 family image dto list.
     * 
     * @param rl02a10FamilyImageDTOList
     *            the new rl02a10 family image dto list
     */
    public void setRl02a10FamilyImageDTOList(List<Rl02a10FamilyImageDTO> rl02a10FamilyImageDTOList) {
        this.rl02a10FamilyImageDTOList = rl02a10FamilyImageDTOList;
    }

    /**
     * Gets the family member size.
     * 
     * @return the family member size
     */
    public int getFamilyMemberSize() {
        return familyMemberSize;
    }

    /**
     * Sets the family member size.
     * 
     * @param familyMemberSize
     *            the new family member size
     */
    public void setFamilyMemberSize(int familyMemberSize) {
        this.familyMemberSize = familyMemberSize;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public int getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(int applySeq) {
        this.applySeq = applySeq;
    }

    @Override
    public String toString() {
        return "Rl02a10Info [idn=" + idn + ", pfn=" + pfn + ", name=" + name + ", birthday=" + birthday
                + ", bornPlace=" + bornPlace + ", siteId=" + siteId + ", save=" + save + ", print=" + print
                + ", color=" + color + ", realApply=" + realApply + ", xldf001aType=" + xldf001aType
                + ", xldf001mType=" + xldf001mType + ", xldf002dType=" + xldf002dType + ", xldf004mType="
                + xldf004mType + ", xldf008aType=" + xldf008aType + ", xldf008mType=" + xldf008mType
                + ", rl02a10FamilyImageDTO=" + rl02a10FamilyImageDTO + ", rl02a10FamilyImageDTOList="
                + rl02a10FamilyImageDTOList + ", familyMemberSize=" + familyMemberSize + ", applySeq=" + applySeq
                + ", imgPath=" + imgPath + "]";
    }

    /**
     * Gets the img path.
     * 
     * @return the img path
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * Sets the img path.
     * 
     * @param imgPath
     *            the new img path
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * Gets the rldfm12m type.
     * 
     * @return the rldfm12m type
     */
    public Rldfm12mType getRldfm12mType() {
        return rldfm12mType;
    }

    /**
     * Sets the rldfm12m type.
     * 
     * @param rldfm12mType
     *            the new rldfm12m type
     */
    public void setRldfm12mType(Rldfm12mType rldfm12mType) {
        this.rldfm12mType = rldfm12mType;
    }

    /**
     * Gets the xldfm06m type.
     * 
     * @return the xldfm06m type
     */
    public Xldfm06mType getXldfm06mType() {
        return xldfm06mType;
    }

    /**
     * Sets the xldfm06m type.
     * 
     * @param xldfm06mType
     *            the new xldfm06m type
     */
    public void setXldfm06mType(Xldfm06mType xldfm06mType) {
        this.xldfm06mType = xldfm06mType;
    }

    public List<Rcdf001mType> getBrothersAndSistersData() {
        return brothersAndSistersData;
    }

    public void setBrothersAndSistersData(List<Rcdf001mType> brothersAndSistersData) {
        this.brothersAndSistersData = brothersAndSistersData;
    }

    public Rl02A10AppDataDTO getAppData() {
        return appData;
    }

    public void setAppData(Rl02A10AppDataDTO appData) {
        this.appData = appData;
    }

    public List<Xldf008mType> getXldf008mList() {
        return xldf008mList;
    }

    public void setXldf008mList(List<Xldf008mType> xldf008mList) {
        this.xldf008mList = xldf008mList;
    }

    public boolean isInitSuccess() {
        return initSuccess;
    }

    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    public Xldfm06mType getXldfm06mTypeAfterSave() {
        return xldfm06mTypeAfterSave;
    }

    public void setXldfm06mTypeAfterSave(Xldfm06mType xldfm06mTypeAfterSave) {
        this.xldfm06mTypeAfterSave = xldfm06mTypeAfterSave;
    }

    public Rldf022dType getRldf022dType() {
        return rldf022dType;
    }

    public void setRldf022dType(Rldf022dType rldf022dType) {
        this.rldf022dType = rldf022dType;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

}

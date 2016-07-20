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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfp100Type;

/**
 * The Class Rl0p100DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0p100DTO", propOrder = { "personId", "applySiteId", "relationType", "relationPersonId",
        "relaPersonId", "relationSiteId", "relaSiteId", "commPersonId", "commSiteId", "rldfp100", "rldfp100Old",
        "imgPath", "countyTown", "fileName" })
@XmlRootElement(name = "Rl0p100DTO")
public class Rl0p100DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 護照申請人統號. */
    @XmlElement(name = "PersonId")
    @FieldName("護照申請人統號")
    private String personId = "";

    /** 護照申請人統號. */
    @XmlElement(name = "PersonBirthDate")
    @FieldName("護照申請人出生日期")
    private String personBirthDate = "";

    /** 護照申請人作業點代碼. */
    @XmlElement(name = "ApplySiteId")
    @FieldName("護照申請人作業點代碼")
    private String applySiteId = "";

    /** 關係人關係. */
    @XmlElement(name = "RelationType")
    @FieldName("關係人關係")
    private String relationType = "";

    /** 關係人統號. */
    @XmlElement(name = "RelationPersonId")
    @FieldName("關係人統號")
    private String relationPersonId = "";

    /** 關係人統一證號. */
    @XmlElement(name = "RelaPersonId")
    @FieldName("關係人統一證號")
    private String relaPersonId = "";

    /** 關係人統號作業點代碼. */
    @XmlElement(name = "RelationSiteId")
    @FieldName("關係人統號作業點代碼")
    private String relationSiteId = "";

    /** 關係人統一證號作業點代碼. */
    @XmlElement(name = "RelaSiteId")
    @FieldName("關係人統一證號作業點代碼")
    private String relaSiteId = "";

    /** 受委任人統號. */
    @XmlElement(name = "CommPersonId")
    @FieldName("受委任人統號")
    private String commPersonId = "";

    /** 受委任人作業點代碼. */
    @XmlElement(name = "CommSiteId")
    @FieldName("受委任人作業點代碼")
    private String commSiteId = "";

    /** rldfp100. */
    @XmlElement(name = "Rldfp100")
    @FieldName("rldfp100")
    private Rldfp100Type rldfp100 = new Rldfp100Type();

    /** rldfp100Old. */
    @XmlElement(name = "Rldfp100Old")
    @FieldName("rldfp100Old")
    private Rldfp100Type rldfp100Old = new Rldfp100Type();

    /** 相片路徑. */
    @XmlElement(name = "ImgPath")
    @FieldName("相片路徑")
    private String imgPath = "";

    /** countyTown. */
    @XmlElement(name = "CountyTown")
    @FieldName("countyTown")
    private String countyTown = "";

    /** 掃描檔案名稱. */
    @XmlElement(name = "FileName")
    @FieldName("掃描檔案名稱")
    private String fileName = "";

    /** 掃描檔案大小. */
    @XmlElement(name = "FileSize")
    @FieldName("掃描檔案大小")
    private long fileSize = 0;

    /** 儲存狀態控制. */
    @XmlElement(name = "IsSaveing")
    @FieldName("儲存狀態控制")
    private boolean IsSaveing = false;

    /** 警告訊息清單 */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessge", required = false)
    private String warningMessge;

    /** Rldf004mType */
    @FieldName("Rldf004mType")
    @XmlElement(name = "Rldf004mObj", required = false)
    private Rldf004mType rldf004mObj;

    /** Rldf001mType */
    @FieldName("Rldf001mType")
    @XmlElement(name = "Rldf001mObj", required = false)
    private Rldf001mType rldf001mObj;

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the person BirthDate.
     * 
     * @return the person BirthDate
     */
    public String getPersonBirthDate() {
        return personBirthDate;
    }

    /**
     * Sets the person BirthDate.
     * 
     * @param personBirthDate
     *            the new person BirthDate
     */
    public void setPersonBirthDate(String personBirthDate) {
        this.personBirthDate = personBirthDate;
    }

    /**
     * Gets the relation type.
     * 
     * @return the relation type
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Sets the relation type.
     * 
     * @param relationType
     *            the new relation type
     */
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    /**
     * Gets the relation person id.
     * 
     * @return the relation person id
     */
    public String getRelationPersonId() {
        return relationPersonId;
    }

    /**
     * Sets the relation person id.
     * 
     * @param relationPersonId
     *            the new relation person id
     */
    public void setRelationPersonId(String relationPersonId) {
        this.relationPersonId = relationPersonId;
    }

    /**
     * Gets the comm person id.
     * 
     * @return the comm person id
     */
    public String getCommPersonId() {
        return commPersonId;
    }

    /**
     * Sets the comm person id.
     * 
     * @param commPersonId
     *            the new comm person id
     */
    public void setCommPersonId(String commPersonId) {
        this.commPersonId = commPersonId;
    }

    /**
     * Gets the rldfp100.
     * 
     * @return the rldfp100
     */
    public Rldfp100Type getRldfp100() {
        return rldfp100;
    }

    /**
     * Sets the rldfp100.
     * 
     * @param rldfp100
     *            the new rldfp100
     */
    public void setRldfp100(Rldfp100Type rldfp100) {
        this.rldfp100 = rldfp100;
    }

    /**
     * Gets the rldfp100 old.
     * 
     * @return the rldfp100 old
     */
    public Rldfp100Type getRldfp100Old() {
        return rldfp100Old;
    }

    /**
     * Sets the rldfp100 old.
     * 
     * @param rldfp100Old
     *            the new rldfp100 old
     */
    public void setRldfp100Old(Rldfp100Type rldfp100Old) {
        this.rldfp100Old = rldfp100Old;
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
     * Gets the county town.
     * 
     * @return the county town
     */
    public String getCountyTown() {
        return countyTown;
    }

    /**
     * Sets the county town.
     * 
     * @param countyTown
     *            the new county town
     */
    public void setCountyTown(String countyTown) {
        this.countyTown = countyTown;
    }

    /**
     * Gets the file name.
     * 
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the file name.
     * 
     * @param fileName
     *            the new file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets the file size.
     * 
     * @return the file size
     */
    public long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the file size.
     * 
     * @param fileSize
     *            the new file name
     */
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * Gets the comm site id.
     * 
     * @return the comm site id
     */
    public String getCommSiteId() {
        return commSiteId;
    }

    /**
     * Sets the comm site id.
     * 
     * @param commSiteId
     *            the new comm site id
     */
    public void setCommSiteId(String commSiteId) {
        this.commSiteId = commSiteId;
    }

    /**
     * Gets the relation site id.
     * 
     * @return the relation site id
     */
    public String getRelationSiteId() {
        return relationSiteId;
    }

    /**
     * Sets the relation site id.
     * 
     * @param relationSiteId
     *            the new relation site id
     */
    public void setRelationSiteId(String relationSiteId) {
        this.relationSiteId = relationSiteId;
    }

    /**
     * Gets the apply site id.
     * 
     * @return the apply site id
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * Sets the apply site id.
     * 
     * @param applySiteId
     *            the new apply site id
     */
    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getRelaPersonId() {
        return relaPersonId;
    }

    public void setRelaPersonId(String relaPersonId) {
        this.relaPersonId = relaPersonId;
    }

    public String getRelaSiteId() {
        return relaSiteId;
    }

    public void setRelaSiteId(String relaSiteId) {
        this.relaSiteId = relaSiteId;
    }

    // public List<RlWarningMessage> getWarningMessgeList() {
    // return warningMessgeList;
    // }
    //
    // public void setWarningMessgeList(List<RlWarningMessage>
    // warningMessgeList) {
    // this.warningMessgeList = warningMessgeList;
    // }

    public boolean getIsSaveing() {
        return IsSaveing;
    }

    public void setIsSaveing(boolean isSaveing) {
        IsSaveing = isSaveing;
    }

    public String getWarningMessge() {
        return warningMessge;
    }

    public void setWarningMessge(String warningMessge) {
        this.warningMessge = warningMessge;
    }

    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    public void setRldf004mObj(Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
    }

    public Rldf001mType getRldf001mObj() {
        return rldf001mObj;
    }

    public void setRldf001mObj(Rldf001mType rldf001mObj) {
        this.rldf001mObj = rldf001mObj;
    }

}
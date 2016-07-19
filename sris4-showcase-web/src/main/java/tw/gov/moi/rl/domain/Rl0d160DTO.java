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
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf022dType;

/**
 * 例行品管作業 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d160DTO", propOrder = { "imgMap", "imgPath", "scanDate", "scanTime", "personId", "siteId",
        "imageFlag", "cardNo", "cellophaneNo", "applyYyymmdd", "applyHhmmss", "birthYyymmdd", "processStatus",
        "processMark", "acceptAdminOfficeCode", "type", "qualifyYyymmdd", "qualifyHhmmss", "qualifyName", "proxy",
        "IsAdminOfficeCodeInSameHost", "rldf002dType", "rldf022dType", "rlf012dType_1", "rlf012dType_2",
        "disabledSaveBtn" })
@XmlRootElement(name = "Rl0d160DTO")
public class Rl0d160DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The img map. */
    @XmlElement(name = "ImgMap")
    @FieldName("當事人影像")
    private byte[] imgMap;

    @XmlElement(name = "ImgPath")
    @FieldName("影像路徑")
    private String imgPath = "";

    /** The scan date. */
    @XmlElement(name = "ScanDate")
    @FieldName("取像日期")
    private String scanDate = "";

    /** The scan time. */
    @XmlElement(name = "ScanTime")
    @FieldName("取像時間")
    private String scanTime = "";

    /** The person id. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** The site id. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** The image flag. */
    @XmlElement(name = "ImageFlag")
    @FieldName("相片列印方式")
    private String imageFlag = "";

    /** The card no. */
    @XmlElement(name = "CardNo")
    @FieldName("空白證號")
    private String cardNo = "";

    /** The cellophane no. */
    @XmlElement(name = "CellophaneNo")
    @FieldName("膠膜號")
    private String cellophaneNo = "";

    /** The apply yyymmdd. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** The apply hhmmss. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** The birth yyymmdd. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** The process status. */
    @XmlElement(name = "ProcessStatus")
    @FieldName("處理狀況")
    private String processStatus = "";

    /** The process mark. */
    @XmlElement(name = "ProcessMark")
    @FieldName("製程註記")
    private String processMark = "";

    /** The accept admin office code. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("發證戶所(受理地戶所代碼)")
    private String acceptAdminOfficeCode = "";

    /** The type. */
    @XmlElement(name = "Type")
    @FieldName("類別")
    private String type = "";

    /** The qualify yyymmdd. */
    @XmlElement(name = "QualifyYyymmdd")
    @FieldName("品管日期")
    private String qualifyYyymmdd = "";

    /** The qualify hhmmss. */
    @XmlElement(name = "QualifyHhmmss")
    @FieldName("品管時間")
    private String qualifyHhmmss = "";

    /** The qualify name. */
    @XmlElement(name = "QualifyName")
    @FieldName("品管人員")
    private String qualifyName = "";

    @XmlElement(name = "Proxy")
    @FieldName("代辦案件")
    private String proxy = "";

    @XmlElement(name = "IsAdminOfficeCodeInSameHost")
    @FieldName("是否同戶籍地戶所")
    private boolean isAdminOfficeCodeInSameHost = Boolean.FALSE;

    @XmlElement(name = "Rldf002dType")
    @FieldName("新式國民身分證請領記錄檔")
    private Rldf002dType rldf002dType;

    @XmlElement(name = "Rldf022dType")
    @FieldName("辦理他所新式國民身分證請領記錄檔")
    private Rldf022dType rldf022dType;

    @XmlElement(name = "Rlf012dType_1")
    @FieldName("空白證號使用記錄")
    private Rldf012dType rlf012dType_1;

    @XmlElement(name = "Rlf012dType_2")
    @FieldName("膠膜號使用記錄")
    private Rldf012dType rlf012dType_2;

    @XmlElement(name = "DisabledSaveBtn")
    @FieldName("禁用儲存按鈕")
    private boolean disabledSaveBtn = true;

    /**
     * Gets the scan date.
     * 
     * @return the scan date
     */
    public String getScanDate() {
        return scanDate;
    }

    /**
     * Sets the scan date.
     * 
     * @param scanDate
     *            the new scan date
     */
    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    /**
     * Gets the scan time.
     * 
     * @return the scan time
     */
    public String getScanTime() {
        return scanTime;
    }

    /**
     * Sets the scan time.
     * 
     * @param scanTime
     *            the new scan time
     */
    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

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
     * Gets the image flag.
     * 
     * @return the image flag
     */
    public String getImageFlag() {
        return imageFlag;
    }

    /**
     * Sets the image flag.
     * 
     * @param imageFlag
     *            the new image flag
     */
    public void setImageFlag(String imageFlag) {
        this.imageFlag = imageFlag;
    }

    /**
     * Gets the card no.
     * 
     * @return the card no
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the card no.
     * 
     * @param cardNo
     *            the new card no
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * Gets the cellophane no.
     * 
     * @return the cellophane no
     */
    public String getCellophaneNo() {
        return cellophaneNo;
    }

    /**
     * Sets the cellophane no.
     * 
     * @param cellophaneNo
     *            the new cellophane no
     */
    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    /**
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the apply hhmmss.
     * 
     * @return the apply hhmmss
     */
    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    /**
     * Sets the apply hhmmss.
     * 
     * @param applyHhmmss
     *            the new apply hhmmss
     */
    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the process status.
     * 
     * @return the process status
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the process status.
     * 
     * @param processStatus
     *            the new process status
     */
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * Gets the process mark.
     * 
     * @return the process mark
     */
    public String getProcessMark() {
        return processMark;
    }

    /**
     * Sets the process mark.
     * 
     * @param processMark
     *            the new process mark
     */
    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the qualify yyymmdd.
     * 
     * @return the qualify yyymmdd
     */
    public String getQualifyYyymmdd() {
        return qualifyYyymmdd;
    }

    /**
     * Sets the qualify yyymmdd.
     * 
     * @param qualifyYyymmdd
     *            the new qualify yyymmdd
     */
    public void setQualifyYyymmdd(String qualifyYyymmdd) {
        this.qualifyYyymmdd = qualifyYyymmdd;
    }

    /**
     * Gets the qualify hhmmss.
     * 
     * @return the qualify hhmmss
     */
    public String getQualifyHhmmss() {
        return qualifyHhmmss;
    }

    /**
     * Sets the qualify hhmmss.
     * 
     * @param qualifyHhmmss
     *            the new qualify hhmmss
     */
    public void setQualifyHhmmss(String qualifyHhmmss) {
        this.qualifyHhmmss = qualifyHhmmss;
    }

    /**
     * Gets the qualify name.
     * 
     * @return the qualify name
     */
    public String getQualifyName() {
        return qualifyName;
    }

    /**
     * Sets the qualify name.
     * 
     * @param qualifyName
     *            the new qualify name
     */
    public void setQualifyName(String qualifyName) {
        this.qualifyName = qualifyName;
    }

    /**
     * Gets the img map.
     * 
     * @return the img map
     */
    public byte[] getImgMap() {
        return imgMap;
    }

    /**
     * Sets the img map.
     * 
     * @param imgMap
     *            the new img map
     */
    public void setImgMap(byte[] imgMap) {
        this.imgMap = imgMap;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Rl0d160DTO [imgPath=" + imgPath + ", scanDate=" + scanDate + ", scanTime=" + scanTime + ", personId="
                + personId + ", siteId=" + siteId + ", imageFlag=" + imageFlag + ", cardNo=" + cardNo
                + ", cellophaneNo=" + cellophaneNo + ", applyYyymmdd=" + applyYyymmdd + ", applyHhmmss=" + applyHhmmss
                + ", birthYyymmdd=" + birthYyymmdd + ", processStatus=" + processStatus + ", processMark="
                + processMark + ", acceptAdminOfficeCode=" + acceptAdminOfficeCode + ", type=" + type
                + ", qualifyYyymmdd=" + qualifyYyymmdd + ", qualifyHhmmss=" + qualifyHhmmss + ", qualifyName="
                + qualifyName + ", proxy=" + proxy + ", isAdminOfficeCodeInSameHost=" + isAdminOfficeCodeInSameHost
                + "]";
    }

    public boolean isAdminOfficeCodeInSameHost() {
        return isAdminOfficeCodeInSameHost;
    }

    public void setAdminOfficeCodeInSameHost(boolean isAdminOfficeCodeInSameHost) {
        this.isAdminOfficeCodeInSameHost = isAdminOfficeCodeInSameHost;
    }

    public Rldf002dType getRldf002dType() {
        return rldf002dType;
    }

    public void setRldf002dType(Rldf002dType rldf002dType) {
        this.rldf002dType = rldf002dType;
    }

    public Rldf022dType getRldf022dType() {
        return rldf022dType;
    }

    public void setRldf022dType(Rldf022dType rldf022dType) {
        this.rldf022dType = rldf022dType;
    }

    public Rldf012dType getRlf012dType_1() {
        return rlf012dType_1;
    }

    public void setRlf012dType_1(Rldf012dType rlf012dType_1) {
        this.rlf012dType_1 = rlf012dType_1;
    }

    public Rldf012dType getRlf012dType_2() {
        return rlf012dType_2;
    }

    public void setRlf012dType_2(Rldf012dType rlf012dType_2) {
        this.rlf012dType_2 = rlf012dType_2;
    }

    public boolean isDisabledSaveBtn() {
        return disabledSaveBtn;
    }

    public void setDisabledSaveBtn(boolean disabledSaveBtn) {
        this.disabledSaveBtn = disabledSaveBtn;
    }

}

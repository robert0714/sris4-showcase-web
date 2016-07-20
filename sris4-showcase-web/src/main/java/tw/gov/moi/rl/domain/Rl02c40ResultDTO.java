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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Xldfs043Type;
import tw.gov.moi.domain.Xldfs043bType;

/**
 * The Class Rl02c40ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02c40ResultDTO", propOrder = { "personId", "personName", "birthYyymmdd", "birthPlaceCode",
        "isNophotoFlag", "nophotoReason", "nophotoRemark", "cellPhoneNumber", "rldf004mType", "rldf001mType",
        "rldf002dType", "rldf008mType", "commSiteId", "renderedNophotoReason", "renderedNophotoRemark", "applyYyymmdd",
        "applyHhmmss", "xldfs043Type", "xldfs043bList" })
@XmlRootElement(name = "Rl02c40ResultDTO")
public class Rl02c40ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 出生地. */
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地")
    private String birthPlaceCode = "";

    /** 免列印相片. */
    @XmlElement(name = "IsNophotoFlag")
    @FieldName("免列印相片")
    private String isNophotoFlag = "";

    /** 免列印相片原因. */
    @XmlElement(name = "NophotoReason")
    @FieldName("免列印相片原因")
    private String nophotoReason = "";

    /** 免列印相片說明. */
    @XmlElement(name = "NophotoRemark")
    @FieldName("免列印相片說明")
    private String nophotoRemark = "";

    // /** 受委託人姓名 */
    // @XmlElement(name = "CommPersonName")
    // @FieldName("受委託人姓名")
    // private String commPersonName = "";
    //
    // /** 受委託人戶所代碼 */
    // @XmlElement(name = "CommAdminOfficeCode")
    // @FieldName("受委託人戶所代碼")
    // private String commAdminOfficeCode = "";

    /** 聯絡電話. */
    @XmlElement(name = "CellPhoneNumber")
    @FieldName("聯絡電話")
    private String cellPhoneNumber = "";

    /** 當事人Rldf004m. */
    @XmlElement(name = "Rldf004mType")
    @FieldName("當事人Rldf004m")
    private Rldf004mType rldf004mType;

    /** 當事人Rldf001m. */
    @XmlElement(name = "Rldf001mType")
    @FieldName("當事人Rldf001m")
    private Rldf001mType rldf001mType;

    // /** 受委託人Rldf004m */
    // @XmlElement(name = "CommRldf004mType")
    // @FieldName("受委託人Rldf004m")
    // private Rldf004mType commRldf004mType;
    //
    // /** 受委託人Rldf001m */
    // @XmlElement(name = "CommRldf001mType")
    // @FieldName("受委託人Rldf001m")
    // private Rldf001mType commRldf001mType;

    /** 當事人國民身分證請領記錄. */
    @XmlElement(name = "Rldf002dType")
    @FieldName("當事人國民身分證請領記錄")
    private Rldf002dType rldf002dType;

    /** 當事人特殊註記. */
    @XmlElement(name = "Rldf008mType")
    @FieldName("當事人特殊註記")
    private Rldf008mType rldf008mType;

    /** 受委託人作業點代碼. */
    @XmlElement(name = "CommSiteId")
    @FieldName("受委託人作業點代碼")
    private String commSiteId = "";

    /** 是否顯示免列印相片原因. */
    @XmlElement(name = "RenderedNophotoReason")
    @FieldName("是否顯示免列印相片原因")
    private boolean renderedNophotoReason = Boolean.FALSE;

    /** 是否顯示免列印相片說明. */
    @XmlElement(name = "RenderedNophotoRemark")
    @FieldName("是否顯示免列印相片說明")
    private boolean renderedNophotoRemark = Boolean.FALSE;

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 受理時間. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** 當事人Xldfs043. */
    @XmlElement(name = "Xldfs043Type")
    @FieldName("當事人Xldfs043")
    private Xldfs043Type xldfs043Type;

    /** 國民身分證換領附繳證件清單. */
    @XmlElement(name = "xldfs043bList")
    @FieldName("國民身分證換領附繳證件清單")
    private List<Xldfs043bType> xldfs043bList = new ArrayList<Xldfs043bType>();

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
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
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
     * Gets the birth place code.
     * 
     * @return the birth place code
     */
    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Sets the birth place code.
     * 
     * @param birthPlaceCode
     *            the new birth place code
     */
    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    /**
     * Gets the checks if is nophoto flag.
     * 
     * @return the checks if is nophoto flag
     */
    public String getIsNophotoFlag() {
        return isNophotoFlag;
    }

    /**
     * Sets the checks if is nophoto flag.
     * 
     * @param isNophotoFlag
     *            the new checks if is nophoto flag
     */
    public void setIsNophotoFlag(String isNophotoFlag) {
        this.isNophotoFlag = isNophotoFlag;
    }

    /**
     * Gets the nophoto reason.
     * 
     * @return the nophoto reason
     */
    public String getNophotoReason() {
        return nophotoReason;
    }

    /**
     * Sets the nophoto reason.
     * 
     * @param nophotoReason
     *            the new nophoto reason
     */
    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    /**
     * Gets the nophoto remark.
     * 
     * @return the nophoto remark
     */
    public String getNophotoRemark() {
        return nophotoRemark;
    }

    /**
     * Sets the nophoto remark.
     * 
     * @param nophotoRemark
     *            the new nophoto remark
     */
    public void setNophotoRemark(String nophotoRemark) {
        this.nophotoRemark = nophotoRemark;
    }

    // public String getCommPersonName() {
    // return commPersonName;
    // }
    //
    // public void setCommPersonName(String commPersonName) {
    // this.commPersonName = commPersonName;
    // }
    //
    // public String getCommAdminOfficeCode() {
    // return commAdminOfficeCode;
    // }
    //
    // public void setCommAdminOfficeCode(String commAdminOfficeCode) {
    // this.commAdminOfficeCode = commAdminOfficeCode;
    // }

    /**
     * Gets the cell phone number.
     * 
     * @return the cell phone number
     */
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    /**
     * Sets the cell phone number.
     * 
     * @param cellPhoneNumber
     *            the new cell phone number
     */
    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    /**
     * Gets the rldf004m type.
     * 
     * @return the rldf004m type
     */
    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    /**
     * Sets the rldf004m type.
     * 
     * @param rldf004mType
     *            the new rldf004m type
     */
    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

    /**
     * Gets the rldf001m type.
     * 
     * @return the rldf001m type
     */
    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    /**
     * Sets the rldf001m type.
     * 
     * @param rldf001mType
     *            the new rldf001m type
     */
    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
    }

    // public Rldf004mType getCommRldf004mType() {
    // return commRldf004mType;
    // }
    //
    // public void setCommRldf004mType(Rldf004mType commRldf004mType) {
    // this.commRldf004mType = commRldf004mType;
    // }
    //
    // public Rldf001mType getCommRldf001mType() {
    // return commRldf001mType;
    // }
    //
    // public void setCommRldf001mType(Rldf001mType commRldf001mType) {
    // this.commRldf001mType = commRldf001mType;
    // }

    /**
     * Gets the rldf002d type.
     * 
     * @return the rldf002d type
     */
    public Rldf002dType getRldf002dType() {
        return rldf002dType;
    }

    /**
     * Sets the rldf002d type.
     * 
     * @param rldf002dType
     *            the new rldf002d type
     */
    public void setRldf002dType(Rldf002dType rldf002dType) {
        this.rldf002dType = rldf002dType;
    }

    /**
     * Gets the rldf008m type.
     * 
     * @return the rldf008m type
     */
    public Rldf008mType getRldf008mType() {
        return rldf008mType;
    }

    /**
     * Sets the rldf008m type.
     * 
     * @param rldf008mType
     *            the new rldf008m type
     */
    public void setRldf008mType(Rldf008mType rldf008mType) {
        this.rldf008mType = rldf008mType;
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
     * Checks if is rendered nophoto reason.
     * 
     * @return true, if is rendered nophoto reason
     */
    public boolean isRenderedNophotoReason() {
        return renderedNophotoReason;
    }

    /**
     * Sets the rendered nophoto reason.
     * 
     * @param renderedNophotoReason
     *            the new rendered nophoto reason
     */
    public void setRenderedNophotoReason(boolean renderedNophotoReason) {
        this.renderedNophotoReason = renderedNophotoReason;
    }

    /**
     * Checks if is rendered nophoto remark.
     * 
     * @return true, if is rendered nophoto remark
     */
    public boolean isRenderedNophotoRemark() {
        return renderedNophotoRemark;
    }

    /**
     * Sets the rendered nophoto remark.
     * 
     * @param renderedNophotoRemark
     *            the new rendered nophoto remark
     */
    public void setRenderedNophotoRemark(boolean renderedNophotoRemark) {
        this.renderedNophotoRemark = renderedNophotoRemark;
    }

    // @Override
    // public String toString() {
    // return "Rl02c40ResultDTO [personId=" + personId + ", personName=" +
    // personName + ", birthYyymmdd=" + birthYyymmdd + ", birthPlaceCode=" +
    // birthPlaceCode + ", isNophotoFlag=" + isNophotoFlag + ", nophotoReason="
    // + nophotoReason + ", nophotoRemark=" + nophotoRemark +
    // ", commPersonName="
    // + commPersonName + ", commAdminOfficeCode=" + commAdminOfficeCode +
    // ", cellPhoneNumber=" + cellPhoneNumber + ", rldf004mType=" + rldf004mType
    // + ", rldf001mType=" + rldf001mType + ", commRldf004mType=" +
    // commRldf004mType + ", commRldf001mType=" + commRldf001mType +
    // ", rldf002dType="
    // + rldf002dType + ", rldf008mType=" + rldf008mType + ", commSiteId=" +
    // commSiteId + ", renderedNophotoReason=" + renderedNophotoReason +
    // ", renderedNophotoRemark=" + renderedNophotoRemark + ", applyYyymmdd=" +
    // applyYyymmdd + ", applyHhmmss=" + applyHhmmss + "]";
    // }

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

    @Override
    public String toString() {
        return "Rl02c40ResultDTO [personId=" + personId + ", personName=" + personName + ", birthYyymmdd="
                + birthYyymmdd + ", birthPlaceCode=" + birthPlaceCode + ", isNophotoFlag=" + isNophotoFlag
                + ", nophotoReason=" + nophotoReason + ", nophotoRemark=" + nophotoRemark + ", cellPhoneNumber="
                + cellPhoneNumber + ", rldf004mType=" + rldf004mType + ", rldf001mType=" + rldf001mType
                + ", rldf002dType=" + rldf002dType + ", rldf008mType=" + rldf008mType + ", commSiteId=" + commSiteId
                + ", renderedNophotoReason=" + renderedNophotoReason + ", renderedNophotoRemark="
                + renderedNophotoRemark + ", applyYyymmdd=" + applyYyymmdd + ", applyHhmmss=" + applyHhmmss + "]";
    }

    /**
     * Gets the xldfs043 type.
     * 
     * @return the xldfs043 type
     */
    public Xldfs043Type getXldfs043Type() {
        return xldfs043Type;
    }

    /**
     * Sets the xldfs043 type.
     * 
     * @param xldfs043Type
     *            the new xldfs043 type
     */
    public void setXldfs043Type(Xldfs043Type xldfs043Type) {
        this.xldfs043Type = xldfs043Type;
    }

    public List<Xldfs043bType> getXldfs043bList() {
        return xldfs043bList;
    }

    public void setXldfs043bList(List<Xldfs043bType> xldfs043bList) {
        this.xldfs043bList = xldfs043bList;
    }

}

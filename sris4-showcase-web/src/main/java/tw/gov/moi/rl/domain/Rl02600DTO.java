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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Tldf004mType;

/**
 * The Class Rl02600DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02600DTO", propOrder = { "applyCode", "applyContant", "applyOthercontent", "applyKindNum",
        "quantity", "feeAmount", "feeReceiptId", "personId", "siteId", "personName", "village", "neighbor",
        "doorplate", "applyDate", "applyTime", "reportURL", "unitFee", "otherFreeReason", "freeReason", "feeCode",
        "payType", "isFreeFlag", "isPrintFee", "rldfu001List", "selectFee", "tldf004mType", "rldf004mType" })
@XmlRootElement(name = "Rl02600DTO")
public class Rl02600DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 申請資料代碼 */
    @XmlElement(name = "ApplyCode")
    @FieldName("申請資料代碼")
    private String applyCode = "";

    /** 申請資料內容 */
    @XmlElement(name = "ApplyContant")
    @FieldName("申請資料內容")
    private String applyContant = "";

    /** 其他申請資料內容 */
    @XmlElement(name = "ApplyOthercontent")
    @FieldName("其他申請資料內容")
    private String applyOthercontent;

    /** 申請資料數種 */
    @XmlElement(name = "ApplyKindNum")
    @FieldName("申請資料數種")
    private String applyKindNum = "";

    /** 申請張數 */
    @XmlElement(name = "Quantity")
    @FieldName("申請張數")
    private String quantity;

    /** 申請規費 */
    @XmlElement(name = "FeeAmount")
    @FieldName("申請規費")
    private String feeAmount = "";

    /** 收據編號 */
    @XmlElement(name = "FeeReceiptId")
    @FieldName("收據編號")
    private String feeReceiptId = "";

    /** 申請人統編 */
    @XmlElement(name = "PersonId")
    @FieldName("申請人統編")
    private String personId = "";

    /** 受理地代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("受理地代碼")
    private String siteId = "";

    /** 申請人姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("申請人姓名")
    private String personName = "";

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌 */
    @XmlElement(name = "Doorplate")
    @FieldName("街路門牌")
    private String doorplate = "";

    /** 申請日期 */
    @XmlElement(name = "ApplyDate")
    @FieldName("申請日期")
    private String applyDate;

    /** 申請時間 */
    @XmlElement(name = "ApplyTime")
    @FieldName("申請時間")
    private String applyTime;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    @XmlElement(name = "UnitFee")
    @FieldName("規費單價")
    private String unitFee;

    @XmlElement(name = "OtherFreeReason")
    @FieldName("免收規費其他原因")
    private String otherFreeReason;

    @XmlElement(name = "FreeReason")
    @FieldName("免收規費其他原因")
    private String freeReason;

    @XmlElement(name = "FeeCode")
    @FieldName("規費代碼")
    private String feeCode;

    @XmlElement(name = "PayType")
    @FieldName("付費方式")
    private String payType = "1";

    @XmlElement(name = "IsFreeFlag")
    @FieldName("是否免費")
    private String isFreeFlag = "N";

    @XmlElement(name = "IsPrintFee")
    @FieldName("是否列印規費")
    private String isPrintFee = "Y";

    @XmlElement(name = "Rldfu001List")
    @FieldName("規費項目")
    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    @XmlElement(name = "SelectFee")
    @FieldName("選擇到的規費項目")
    private Rldfu001Type selectFee = new Rldfu001Type();

    /** 申請人資料 */
    @XmlElement(name = "Tldf004mType")
    @FieldName("申請人資料")
    private Tldf004mType tldf004mType;

    /** 申請人資料 */
    @XmlElement(name = "Rldf004mType")
    @FieldName("申請人資料")
    private Rldf004mType rldf004mType;

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    public String getApplyContant() {
        return applyContant;
    }

    public void setApplyContant(final String applyContant) {
        this.applyContant = applyContant;
    }

    public String getApplyOthercontent() {
        return applyOthercontent;
    }

    public void setApplyOthercontent(final String applyOthercontent) {
        this.applyOthercontent = applyOthercontent;
    }

    public String getApplyKindNum() {
        return applyKindNum;
    }

    public void setApplyKindNum(final String applyKindNum) {
        this.applyKindNum = applyKindNum;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(final String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeReceiptId() {
        return feeReceiptId;
    }

    public void setFeeReceiptId(final String feeReceiptId) {
        this.feeReceiptId = feeReceiptId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public String getDoorplate() {
        return doorplate;
    }

    public void setDoorplate(final String doorplate) {
        this.doorplate = doorplate;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(final String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(final String applyTime) {
        this.applyTime = applyTime;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public String getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(String unitFee) {
        this.unitFee = unitFee;
    }

    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getIsFreeFlag() {
        return isFreeFlag;
    }

    public void setIsFreeFlag(String isFreeFlag) {
        this.isFreeFlag = isFreeFlag;
    }

    public String getIsPrintFee() {
        return isPrintFee;
    }

    public void setIsPrintFee(String isPrintFee) {
        this.isPrintFee = isPrintFee;
    }

    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    public void setRldfu001List(List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
    }

    public Rldfu001Type getSelectFee() {
        return selectFee;
    }

    public void setSelectFee(Rldfu001Type selectFee) {
        this.selectFee = selectFee;
    }

    public Tldf004mType getTldf004mType() {
        return tldf004mType;
    }

    public void setTldf004mType(Tldf004mType tldf004mType) {
        this.tldf004mType = tldf004mType;
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }
}

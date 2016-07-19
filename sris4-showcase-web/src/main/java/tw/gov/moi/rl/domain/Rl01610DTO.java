/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.Xldfs051Type;
import tw.gov.moi.domain.Xldfs051bType;
import tw.gov.moi.domain.Xldfs052Type;
import tw.gov.moi.domain.Xldfs052bType;
import tw.gov.moi.domain.Xldfs053Type;
import tw.gov.moi.domain.Xldfs053bType;
import tw.gov.moi.domain.Xldfs054Type;
import tw.gov.moi.domain.Xldfs054bType;
import tw.gov.moi.domain.Xldfs055Type;
import tw.gov.moi.domain.Xldfs055bType;
import tw.gov.moi.domain.Xldfs056Type;
import tw.gov.moi.domain.Xldfs056bType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.common.dto.FeeDTO;

/**
 * The Class Rl01610DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01610DTO", propOrder = { "applyDate", "regBatch", "applyKind", "siteId", "printHousemap",
        "personId", "applyAdminOffice", "applyName", "applyTel1", "applyTel2", "applyOfficeName",
        "applyOfficeAddressCity", "applyOfficeAddressTown", "applyOfficeAddressVillage", "applyOfficeAddressNeighbor",
        "applyOfficeAddressStreetDoor", "applyRole", "applyAddressCity", "applyAddressTown", "applyAddressVillage",
        "applyAddressNeighbor", "applyAddressStreetDoor", "receiveAdress", "applyVillage", "applyNeighbor",
        "orignStreetDoor", "houseAddress", "qryHouseAdress", "commId", "commApplyAdminOffice", "commName",
        "commAddressCity", "commAddressTown", "commAddressVillage", "commAddressNeighbor", "commAddressStreetDoor",
        "buildingKind", "buildingKindMark", "regDate", "dropDoorPlateCode", "freeReasonCode", "otherFreeReason",
        "receiptId", "copies", "quantity", "chkSol", "total", "chkMark", "reportUrl", "buildingId", "buildingNo",
        "buildingId_1", "buildingNo_1", "otherContent", "IsAdminUser", "feeDTO", "feeDTOList", "rldfu001List",
        "freeFlag", "applyCode", "otherCertificate", "certificateList", "enableOtherCertificate", "xldfs051Types",
        "xldfs052Types", "xldfs053Types", "xldfs054Types", "xldfs055Types", "xldfs056Types", "xldfs051bTypes",
        "xldfs052bTypes", "xldfs053bTypes", "xldfs054bTypes", "xldfs055bTypes", "xldfs056bTypes", "memoryPerson",
        "printReceiptFlag", "haveCertificate", "haveDoorplate", "paymentWay", "certificateOrDoorplate",
        "certificateCount", "doorplateCount", "applicantComputerizedPredecessor", "applicantBookStatus",
        "delegatedPersonComputerizedPredecessor", "delegatedPersonBookStatus" })
@XmlRootElement(name = "Rl01610DTO")
public class Rl01610DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7240429321427007642L;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 編釘批號. */
    @XmlElement(name = "RegBatch", required = true)
    @FieldName("編釘批號")
    private String regBatch;

    /** 申請種類. */
    @XmlElement(name = "ApplyKind", required = true)
    @FieldName("申請種類")
    private String applyKind = "0";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** 列印房屋略圖. */
    @XmlElement(name = "PrintHousemap", required = true)
    @FieldName("列印房屋略圖")
    private String printHousemap = "N";

    /** 申請人統編. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("申請人統編")
    private String personId;

    /** 申請人戶所. */
    @XmlElement(name = "ApplyAdminOffice", required = true)
    @FieldName("申請人戶所")
    private String applyAdminOffice;

    /** 申請人姓名. */
    @XmlElement(name = "ApplyName", required = true)
    @FieldName("申請人姓名")
    private String applyName;

    /** 申請人連絡電話1. */
    @XmlElement(name = "ApplyTel1", required = true)
    @FieldName("申請人連絡電話1")
    private String applyTel1;

    /** 申請人連絡電話2. */
    @XmlElement(name = "ApplyTel2", required = true)
    @FieldName("申請人連絡電話2")
    private String applyTel2;

    /** 申請人公司名稱. */
    @XmlElement(name = "ApplyOfficeName", required = true)
    @FieldName("申請人公司名稱")
    private String applyOfficeName;

    /** 申請人公司地址(縣市). */
    @XmlElement(name = "ApplyOfficeAddressCity", required = true)
    @FieldName("申請人公司地址(縣市)")
    private String applyOfficeAddressCity;

    /** 申請人公司地址(鄉鎮). */
    @XmlElement(name = "ApplyOfficeAddressTown", required = true)
    @FieldName("申請人公司地址(鄉鎮)")
    private String applyOfficeAddressTown;

    /** 申請人公司地址(村里). */
    @XmlElement(name = "ApplyOfficeAddressVillage", required = true)
    @FieldName("申請人公司地址(村里)")
    private String applyOfficeAddressVillage;

    /** 申請人公司地址(鄰). */
    @XmlElement(name = "ApplyOfficeAddressNeighbor", required = true)
    @FieldName("申請人公司地址(鄰)")
    private String applyOfficeAddressNeighbor;

    /** 申請人公司地址(街路門牌). */
    @XmlElement(name = "ApplyOfficeAddressStreetDoor", required = true)
    @FieldName("申請人公司地址(街路門牌)")
    private String applyOfficeAddressStreetDoor;

    /** 申請人身分. */
    @XmlElement(name = "ApplyRole", required = true)
    @FieldName("申請人身分")
    private String applyRole = "1";

    /** 申請人地址(縣市). */
    @XmlElement(name = "ApplyAddressCity", required = true)
    @FieldName("申請人地址(縣市)")
    private String applyAddressCity;

    /** 申請人地址(鄉鎮). */
    @XmlElement(name = "ApplyAddressTown", required = true)
    @FieldName("申請人地址(鄉鎮)")
    private String applyAddressTown;

    /** 申請人地址(村里). */
    @XmlElement(name = "ApplyAddressVillage", required = true)
    @FieldName("申請人地址(村里)")
    private String applyAddressVillage;

    /** 申請人地址(鄰). */
    @XmlElement(name = "ApplyAddressNeighbor", required = true)
    @FieldName("申請人地址(鄰)")
    private String applyAddressNeighbor;

    /** 申請人地址(街路門牌). */
    @XmlElement(name = "ApplyAddressStreetDoor", required = true)
    @FieldName("申請人地址(街路門牌)")
    private String applyAddressStreetDoor;

    /** 指定送達地點. */
    @XmlElement(name = "ReceiveAdress", required = true)
    @FieldName("指定送達地點")
    private String receiveAdress;

    /** 房屋村里. */
    @XmlElement(name = "ApplyVillage", required = true)
    @FieldName("房屋村里")
    private String applyVillage;

    /** 房屋鄰. */
    @XmlElement(name = "ApplyNeighbor", required = true)
    @FieldName("房屋鄰")
    private String applyNeighbor;

    /** 原編房屋門牌. */
    @XmlElement(name = "OrignStreetDoor", required = true)
    @FieldName("原編房屋門牌")
    private String orignStreetDoor;

    /** 房屋地點. */
    @XmlElement(name = "HouseAddress", required = true)
    @FieldName("房屋地點")
    private String houseAddress;

    /** 查編房屋門牌. */
    @XmlElement(name = "QryHouseAdress", required = true)
    @FieldName("查編房屋門牌")
    private String qryHouseAdress = "";

    /** 受委託人統編. */
    @XmlElement(name = "CommId", required = true)
    @FieldName("受委託人統編")
    private String commId;

    /** 受委託人戶所. */
    @XmlElement(name = "CommApplyAdminOffice", required = true)
    @FieldName("受委託人戶所")
    private String commApplyAdminOffice;

    /** 受委託人姓名. */
    @XmlElement(name = "CommName", required = true)
    @FieldName("受委託人姓名")
    private String commName;

    /** 受委託人地址(縣市). */
    @XmlElement(name = "CommAddressCity", required = true)
    @FieldName("受委託人地址(縣市)")
    private String commAddressCity;

    /** 受委託人地址(鄉鎮). */
    @XmlElement(name = "CommAddressTown", required = true)
    @FieldName("受委託人地址(鄉鎮)")
    private String commAddressTown;

    /** 受委託人地址(村里). */
    @XmlElement(name = "CommAddressVillage", required = true)
    @FieldName("受委託人地址(村里)")
    private String commAddressVillage;

    /** 受委託人地址(鄰). */
    @XmlElement(name = "CommAddressNeighbor", required = true)
    @FieldName("受委託人地址(鄰)")
    private String commAddressNeighbor;

    /** 受委託人地址(街路門牌). */
    @XmlElement(name = "CommAddressStreetDoor", required = true)
    @FieldName("受委託人地址(街路門牌)")
    private String commAddressStreetDoor;

    /** 類別. */
    @XmlElement(name = "BuildingKind", required = true)
    @FieldName("類別")
    private String buildingKind = "1";

    /** 類別註記. */
    @XmlElement(name = "BuildingKindMark", required = true)
    @FieldName("類別註記")
    private String buildingKindMark;

    /** 編釘日期. */
    @XmlElement(name = "RegDate", required = true)
    @FieldName("編釘日期")
    private String regDate;

    /** 廢止門牌原因. */
    @XmlElement(name = "DropDoorPlateCode", required = true)
    @FieldName("廢止門牌原因")
    private String dropDoorPlateCode = "4";

    /** 規費收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("規費收據號碼")
    private String receiptId;

    /** 證明書份數. */
    @XmlElement(name = "Copies", required = true)
    @FieldName("證明書份數")
    private String copies = RlConstant.STRING_ZERO;

    /** 門牌張數. */
    @XmlElement(name = "Quantity", required = true)
    @FieldName("門牌張數")
    private String quantity = RlConstant.STRING_ZERO;

    /** 檢查結果. */
    @XmlElement(name = "ChkSol", required = true)
    @FieldName("檢查結果")
    private boolean chkSol = false;

    /** 規費合計. */
    @XmlElement(name = "Total", required = true)
    @FieldName("規費合計")
    private String total = RlConstant.STRING_ZERO;

    /** 處理註記. */
    @XmlElement(name = "ChkMark", required = true)
    @FieldName("處理註記")
    private String chkMark = RlConstant.STRING_A;

    /** 報表檔URL. */
    @XmlElement(name = "ReportUrl", required = true)
    @FieldName("報表檔URL")
    private String reportUrl;

    /** The building id. */
    @XmlElement(name = "BuildingId", required = true)
    @FieldName("buildingId")
    private String buildingId;

    /** The building no. */
    @XmlElement(name = "BuildingNo", required = true)
    @FieldName("buildingNo")
    private String buildingNo;

    /** The building id_1. */
    @XmlElement(name = "BuildingId_1", required = true)
    @FieldName("buildingId_1")
    private String buildingId_1;

    /** The building no_1. */
    @XmlElement(name = "BuildingNo_1", required = true)
    @FieldName("buildingNo_1")
    private String buildingNo_1;

    /** 其他說明. */
    @XmlElement(name = "OtherContent", required = true)
    @FieldName("其他說明")
    private String otherContent;

    /** 是否為戶所主任辦理. */
    @XmlElement(name = "IsAdminUser", required = true)
    @FieldName("是否為戶所主任辦理")
    private Boolean isAdminUser = false;

    /** 規費DTO. */
    @XmlElement(name = "FeeDTO", required = true)
    @FieldName("規費DTO")
    private FeeDTO feeDTO = new FeeDTO();

    /** 規費清單. */
    @XmlElement(name = "FeeDTOList", required = true)
    @FieldName("規費清單")
    private List<FeeDTO> feeDTOList = new ArrayList<FeeDTO>();

    /** 規費項目清單. */
    @FieldName("規費項目清單")
    @XmlElement(name = "Rldfu001List", required = false)
    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    /**
     * 是否免費 <BR>
     * Default: N.
     */
    @FieldName("是否免費")
    @XmlElement(name = "FreeFlag", required = false)
    private String freeFlag = RlConstant.NO_CHAR;

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

    /** 申請書類別. */
    @FieldName("申請書類別")
    @XmlElement(name = "ApplyCode", required = false)
    private String applyCode;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 門牌初編申請書檔. */
    @XmlElement(name = "Xldfs051Types")
    @FieldName("門牌初編申請書檔")
    private List<Xldfs051Type> xldfs051Types;

    /** 門牌改編申請書檔. */
    @XmlElement(name = "Xldfs052Types")
    @FieldName("門牌改編申請書檔")
    private List<Xldfs052Type> xldfs052Types;

    /** 門牌增編申請書檔. */
    @XmlElement(name = "Xldfs053Types")
    @FieldName("門牌增編申請書檔")
    private List<Xldfs053Type> xldfs053Types;

    /** 門牌合併申請書檔. */
    @XmlElement(name = "Xldfs054Types")
    @FieldName("門牌合併申請書檔")
    private List<Xldfs054Type> xldfs054Types;

    /** 門牌廢止申請書檔. */
    @XmlElement(name = "Xldfs055Types")
    @FieldName("門牌廢止申請書檔")
    private List<Xldfs055Type> xldfs055Types;

    /** 門牌補發申請書檔. */
    @XmlElement(name = "Xldfs056Types")
    @FieldName("門牌補發申請書檔")
    private List<Xldfs056Type> xldfs056Types;

    /** 門牌初編附繳證件檔. */
    @XmlElement(name = "Xldfs051bTypes")
    @FieldName("門牌初編附繳證件檔")
    private List<Xldfs051bType> xldfs051bTypes;

    /** 門牌改編附繳證件檔. */
    @XmlElement(name = "Xldfs052bTypes")
    @FieldName("門牌改編附繳證件檔")
    private List<Xldfs052bType> xldfs052bTypes;

    /** 門牌增編附繳證件檔. */
    @XmlElement(name = "Xldfs053bTypes")
    @FieldName("門牌增編附繳證件檔")
    private List<Xldfs053bType> xldfs053bTypes;

    /** 門牌合併附繳證件檔. */
    @XmlElement(name = "Xldfs054bTypes")
    @FieldName("門牌合併附繳證件檔")
    private List<Xldfs054bType> xldfs054bTypes;

    /** 門牌廢止附繳證件檔. */
    @XmlElement(name = "Xldfs055bTypes")
    @FieldName("門牌廢止附繳證件檔")
    private List<Xldfs055bType> xldfs055bTypes;

    /** 門牌補發附繳證件檔. */
    @XmlElement(name = "Xldfs056bTypes")
    @FieldName("門牌補發附繳證件檔")
    private List<Xldfs056bType> xldfs056bTypes;

    /** 記憶人. */
    @XmlElement(name = "MemoryPerson")
    @FieldName("記憶人")
    private Tldf004mType memoryPerson;

    /** 是否列印收據. */
    @XmlElement(name = "PrintReceiptFlag")
    @FieldName("是否列印收據")
    private String printReceiptFlag = "1";

    /** 是否有證明書. */
    @XmlElement(name = "HaveCertificate")
    @FieldName("是否有證明書")
    private boolean haveCertificate;

    /** 是否有門牌. */
    @XmlElement(name = "HaveDoorplate")
    @FieldName("是否有門牌")
    private boolean haveDoorplate;

    /** 繳費方式. */
    @XmlElement(name = "PaymentWay")
    @FieldName("繳費方式")
    private String paymentWay = "1";

    /** 證明書或門牌. 1:證明書 2:門牌 */
    @XmlElement(name = "CertificateOrDoorplate")
    @FieldName("證明書或門牌")
    private String certificateOrDoorplate;

    /** 證明書份數. */
    @XmlElement(name = "CertificateCount")
    @FieldName("證明書份數")
    private String certificateCount = "0";

    /** 門牌面數. */
    @XmlElement(name = "DoorplateCount")
    @FieldName("門牌面數")
    private String doorplateCount = "0";

    /** 申請人是否為電腦化前人口. */
    @XmlElement(name = "ApplicantComputerizedPredecessor")
    @FieldName("申請人是否為電腦化前人口")
    private boolean applicantComputerizedPredecessor;

    /** 申請人簿頁狀態. 1:現戶簿頁; 2:除戶簿頁 */
    @XmlElement(name = "ApplicantBookStatus")
    @FieldName("簿頁狀態")
    private String applicantBookStatus = "1";

    /** 受委託人是否為電腦化前人口. */
    @XmlElement(name = "DelegatedPersonComputerizedPredecessor")
    @FieldName("申請人是否為電腦化前人口")
    private boolean delegatedPersonComputerizedPredecessor;

    /** 受委託人簿頁狀態. 1:現戶簿頁; 2:除戶簿頁 */
    @XmlElement(name = "DelegatedPersonBookStatus")
    @FieldName("簿頁狀態")
    private String delegatedPersonBookStatus = "1";

    /**
     * Gets the apply date.
     * 
     * @return the apply date
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the apply date.
     * 
     * @param applyDate
     *            the new apply date
     */
    public void setApplyDate(final String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Gets the reg batch.
     * 
     * @return the reg batch
     */
    public String getRegBatch() {
        return regBatch;
    }

    /**
     * Sets the reg batch.
     * 
     * @param regBatch
     *            the new reg batch
     */
    public void setRegBatch(final String regBatch) {
        this.regBatch = regBatch;
    }

    /**
     * Gets the apply kind.
     * 
     * @return the apply kind
     */
    public String getApplyKind() {
        return applyKind;
    }

    /**
     * Sets the apply kind.
     * 
     * @param applyKind
     *            the new apply kind
     */
    public void setApplyKind(final String applyKind) {
        this.applyKind = applyKind;
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
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the prints the housemap.
     * 
     * @return the prints the housemap
     */
    public String getPrintHousemap() {
        return printHousemap;
    }

    /**
     * Sets the prints the housemap.
     * 
     * @param printHousemap
     *            the new prints the housemap
     */
    public void setPrintHousemap(final String printHousemap) {
        this.printHousemap = printHousemap;
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
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply admin office.
     * 
     * @return the apply admin office
     */
    public String getApplyAdminOffice() {
        return applyAdminOffice;
    }

    /**
     * Sets the apply admin office.
     * 
     * @param applyAdminOffice
     *            the new apply admin office
     */
    public void setApplyAdminOffice(final String applyAdminOffice) {
        this.applyAdminOffice = applyAdminOffice;
    }

    /**
     * Gets the apply name.
     * 
     * @return the apply name
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * Sets the apply name.
     * 
     * @param applyName
     *            the new apply name
     */
    public void setApplyName(final String applyName) {
        this.applyName = applyName;
    }

    /**
     * Gets the apply tel1.
     * 
     * @return the apply tel1
     */
    public String getApplyTel1() {
        return applyTel1;
    }

    /**
     * Sets the apply tel1.
     * 
     * @param applyTel1
     *            the new apply tel1
     */
    public void setApplyTel1(final String applyTel1) {
        this.applyTel1 = applyTel1;
    }

    /**
     * Gets the apply tel2.
     * 
     * @return the apply tel2
     */
    public String getApplyTel2() {
        return applyTel2;
    }

    /**
     * Sets the apply tel2.
     * 
     * @param applyTel2
     *            the new apply tel2
     */
    public void setApplyTel2(final String applyTel2) {
        this.applyTel2 = applyTel2;
    }

    /**
     * Gets the apply office name.
     * 
     * @return the apply office name
     */
    public String getApplyOfficeName() {
        return applyOfficeName;
    }

    /**
     * Sets the apply office name.
     * 
     * @param applyOfficeName
     *            the new apply office name
     */
    public void setApplyOfficeName(final String applyOfficeName) {
        this.applyOfficeName = applyOfficeName;
    }

    /**
     * Gets the apply office address city.
     * 
     * @return the apply office address city
     */
    public String getApplyOfficeAddressCity() {
        return applyOfficeAddressCity;
    }

    /**
     * Sets the apply office address city.
     * 
     * @param applyOfficeAddressCity
     *            the new apply office address city
     */
    public void setApplyOfficeAddressCity(final String applyOfficeAddressCity) {
        this.applyOfficeAddressCity = applyOfficeAddressCity;
    }

    /**
     * Gets the apply office address town.
     * 
     * @return the apply office address town
     */
    public String getApplyOfficeAddressTown() {
        return applyOfficeAddressTown;
    }

    /**
     * Sets the apply office address town.
     * 
     * @param applyOfficeAddressTown
     *            the new apply office address town
     */
    public void setApplyOfficeAddressTown(final String applyOfficeAddressTown) {
        this.applyOfficeAddressTown = applyOfficeAddressTown;
    }

    /**
     * Gets the apply office address village.
     * 
     * @return the apply office address village
     */
    public String getApplyOfficeAddressVillage() {
        return applyOfficeAddressVillage;
    }

    /**
     * Sets the apply office address village.
     * 
     * @param applyOfficeAddressVillage
     *            the new apply office address village
     */
    public void setApplyOfficeAddressVillage(final String applyOfficeAddressVillage) {
        this.applyOfficeAddressVillage = applyOfficeAddressVillage;
    }

    /**
     * Gets the apply office address neighbor.
     * 
     * @return the apply office address neighbor
     */
    public String getApplyOfficeAddressNeighbor() {
        return applyOfficeAddressNeighbor;
    }

    /**
     * Sets the apply office address neighbor.
     * 
     * @param applyOfficeAddressNeighbor
     *            the new apply office address neighbor
     */
    public void setApplyOfficeAddressNeighbor(final String applyOfficeAddressNeighbor) {
        this.applyOfficeAddressNeighbor = applyOfficeAddressNeighbor;
    }

    /**
     * Gets the apply office address street door.
     * 
     * @return the apply office address street door
     */
    public String getApplyOfficeAddressStreetDoor() {
        return applyOfficeAddressStreetDoor;
    }

    /**
     * Sets the apply office address street door.
     * 
     * @param applyOfficeAddressStreetDoor
     *            the new apply office address street door
     */
    public void setApplyOfficeAddressStreetDoor(final String applyOfficeAddressStreetDoor) {
        this.applyOfficeAddressStreetDoor = applyOfficeAddressStreetDoor;
    }

    /**
     * Gets the apply role.
     * 
     * @return the apply role
     */
    public String getApplyRole() {
        return applyRole;
    }

    /**
     * Sets the apply role.
     * 
     * @param applyRole
     *            the new apply role
     */
    public void setApplyRole(final String applyRole) {
        this.applyRole = applyRole;
    }

    /**
     * Gets the apply address city.
     * 
     * @return the apply address city
     */
    public String getApplyAddressCity() {
        return applyAddressCity;
    }

    /**
     * Sets the apply address city.
     * 
     * @param applyAddressCity
     *            the new apply address city
     */
    public void setApplyAddressCity(final String applyAddressCity) {
        this.applyAddressCity = applyAddressCity;
    }

    /**
     * Gets the apply address town.
     * 
     * @return the apply address town
     */
    public String getApplyAddressTown() {
        return applyAddressTown;
    }

    /**
     * Sets the apply address town.
     * 
     * @param applyAddressTown
     *            the new apply address town
     */
    public void setApplyAddressTown(final String applyAddressTown) {
        this.applyAddressTown = applyAddressTown;
    }

    /**
     * Gets the apply address village.
     * 
     * @return the apply address village
     */
    public String getApplyAddressVillage() {
        return applyAddressVillage;
    }

    /**
     * Sets the apply address village.
     * 
     * @param applyAddressVillage
     *            the new apply address village
     */
    public void setApplyAddressVillage(final String applyAddressVillage) {
        this.applyAddressVillage = applyAddressVillage;
    }

    /**
     * Gets the apply address neighbor.
     * 
     * @return the apply address neighbor
     */
    public String getApplyAddressNeighbor() {
        return applyAddressNeighbor;
    }

    /**
     * Sets the apply address neighbor.
     * 
     * @param applyAddressNeighbor
     *            the new apply address neighbor
     */
    public void setApplyAddressNeighbor(final String applyAddressNeighbor) {
        this.applyAddressNeighbor = applyAddressNeighbor;
    }

    /**
     * Gets the apply address street door.
     * 
     * @return the apply address street door
     */
    public String getApplyAddressStreetDoor() {
        return applyAddressStreetDoor;
    }

    /**
     * Sets the apply address street door.
     * 
     * @param applyAddressStreetDoor
     *            the new apply address street door
     */
    public void setApplyAddressStreetDoor(final String applyAddressStreetDoor) {
        this.applyAddressStreetDoor = applyAddressStreetDoor;
    }

    /**
     * Gets the receive adress.
     * 
     * @return the receive adress
     */
    public String getReceiveAdress() {
        return receiveAdress;
    }

    /**
     * Sets the receive adress.
     * 
     * @param receiveAdress
     *            the new receive adress
     */
    public void setReceiveAdress(final String receiveAdress) {
        this.receiveAdress = receiveAdress;
    }

    /**
     * Gets the apply village.
     * 
     * @return the apply village
     */
    public String getApplyVillage() {
        return applyVillage;
    }

    /**
     * Sets the apply village.
     * 
     * @param applyVillage
     *            the new apply village
     */
    public void setApplyVillage(final String applyVillage) {
        this.applyVillage = applyVillage;
    }

    /**
     * Gets the apply neighbor.
     * 
     * @return the apply neighbor
     */
    public String getApplyNeighbor() {
        return applyNeighbor;
    }

    /**
     * Sets the apply neighbor.
     * 
     * @param applyNeighbor
     *            the new apply neighbor
     */
    public void setApplyNeighbor(final String applyNeighbor) {
        this.applyNeighbor = applyNeighbor;
    }

    /**
     * Gets the orign street door.
     * 
     * @return the orign street door
     */
    public String getOrignStreetDoor() {
        return orignStreetDoor;
    }

    /**
     * Sets the orign street door.
     * 
     * @param orignStreetDoor
     *            the new orign street door
     */
    public void setOrignStreetDoor(final String orignStreetDoor) {
        this.orignStreetDoor = orignStreetDoor;
    }

    /**
     * Gets the house address.
     * 
     * @return the house address
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * Sets the house address.
     * 
     * @param houseAddress
     *            the new house address
     */
    public void setHouseAddress(final String houseAddress) {
        this.houseAddress = houseAddress;
    }

    /**
     * Gets the qry house adress.
     * 
     * @return the qry house adress
     */
    public String getQryHouseAdress() {
        return qryHouseAdress;
    }

    /**
     * Sets the qry house adress.
     * 
     * @param qryHouseAdress
     *            the new qry house adress
     */
    public void setQryHouseAdress(final String qryHouseAdress) {
        this.qryHouseAdress = qryHouseAdress;
    }

    /**
     * Gets the comm id.
     * 
     * @return the comm id
     */
    public String getCommId() {
        return commId;
    }

    /**
     * Sets the comm id.
     * 
     * @param commId
     *            the new comm id
     */
    public void setCommId(final String commId) {
        this.commId = commId;
    }

    /**
     * Gets the comm apply admin office.
     * 
     * @return the comm apply admin office
     */
    public String getCommApplyAdminOffice() {
        return commApplyAdminOffice;
    }

    /**
     * Sets the comm apply admin office.
     * 
     * @param commApplyAdminOffice
     *            the new comm apply admin office
     */
    public void setCommApplyAdminOffice(final String commApplyAdminOffice) {
        this.commApplyAdminOffice = commApplyAdminOffice;
    }

    /**
     * Gets the comm name.
     * 
     * @return the comm name
     */
    public String getCommName() {
        return commName;
    }

    /**
     * Sets the comm name.
     * 
     * @param commName
     *            the new comm name
     */
    public void setCommName(final String commName) {
        this.commName = commName;
    }

    /**
     * Gets the comm address city.
     * 
     * @return the comm address city
     */
    public String getCommAddressCity() {
        return commAddressCity;
    }

    /**
     * Sets the comm address city.
     * 
     * @param commAddressCity
     *            the new comm address city
     */
    public void setCommAddressCity(final String commAddressCity) {
        this.commAddressCity = commAddressCity;
    }

    /**
     * Gets the comm address town.
     * 
     * @return the comm address town
     */
    public String getCommAddressTown() {
        return commAddressTown;
    }

    /**
     * Sets the comm address town.
     * 
     * @param commAddressTown
     *            the new comm address town
     */
    public void setCommAddressTown(final String commAddressTown) {
        this.commAddressTown = commAddressTown;
    }

    /**
     * Gets the comm address village.
     * 
     * @return the comm address village
     */
    public String getCommAddressVillage() {
        return commAddressVillage;
    }

    /**
     * Sets the comm address village.
     * 
     * @param commAddressVillage
     *            the new comm address village
     */
    public void setCommAddressVillage(final String commAddressVillage) {
        this.commAddressVillage = commAddressVillage;
    }

    /**
     * Gets the comm address neighbor.
     * 
     * @return the comm address neighbor
     */
    public String getCommAddressNeighbor() {
        return commAddressNeighbor;
    }

    /**
     * Sets the comm address neighbor.
     * 
     * @param commAddressNeighbor
     *            the new comm address neighbor
     */
    public void setCommAddressNeighbor(final String commAddressNeighbor) {
        this.commAddressNeighbor = commAddressNeighbor;
    }

    /**
     * Gets the comm address street door.
     * 
     * @return the comm address street door
     */
    public String getCommAddressStreetDoor() {
        return commAddressStreetDoor;
    }

    /**
     * Sets the comm address street door.
     * 
     * @param commAddressStreetDoor
     *            the new comm address street door
     */
    public void setCommAddressStreetDoor(final String commAddressStreetDoor) {
        this.commAddressStreetDoor = commAddressStreetDoor;
    }

    /**
     * Gets the building kind.
     * 
     * @return the building kind
     */
    public String getBuildingKind() {
        return buildingKind;
    }

    /**
     * Sets the building kind.
     * 
     * @param buildingKind
     *            the new building kind
     */
    public void setBuildingKind(final String buildingKind) {
        this.buildingKind = buildingKind;
    }

    /**
     * Gets the building kind mark.
     * 
     * @return the building kind mark
     */
    public String getBuildingKindMark() {
        return buildingKindMark;
    }

    /**
     * Sets the building kind mark.
     * 
     * @param buildingKindMark
     *            the new building kind mark
     */
    public void setBuildingKindMark(final String buildingKindMark) {
        this.buildingKindMark = buildingKindMark;
    }

    /**
     * Gets the reg date.
     * 
     * @return the reg date
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the reg date.
     * 
     * @param regDate
     *            the new reg date
     */
    public void setRegDate(final String regDate) {
        this.regDate = regDate;
    }

    /**
     * Gets the drop door plate code.
     * 
     * @return the drop door plate code
     */
    public String getDropDoorPlateCode() {
        return dropDoorPlateCode;
    }

    /**
     * Sets the drop door plate code.
     * 
     * @param dropDoorPlateCode
     *            the new drop door plate code
     */
    public void setDropDoorPlateCode(final String dropDoorPlateCode) {
        this.dropDoorPlateCode = dropDoorPlateCode;
    }

    /**
     * Gets the receipt id.
     * 
     * @return the receipt id
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the receipt id.
     * 
     * @param receiptId
     *            the new receipt id
     */
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * Gets the copies.
     * 
     * @return the copies
     */
    public String getCopies() {
        return copies;
    }

    /**
     * Sets the copies.
     * 
     * @param copies
     *            the new copies
     */
    public void setCopies(final String copies) {
        this.copies = copies;
    }

    /**
     * Gets the quantity.
     * 
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param quantity
     *            the new quantity
     */
    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    /**
     * Checks if is chk sol.
     * 
     * @return true, if is chk sol
     */
    public boolean isChkSol() {
        return chkSol;
    }

    /**
     * Sets the chk sol.
     * 
     * @param chkSol
     *            the new chk sol
     */
    public void setChkSol(final boolean chkSol) {
        this.chkSol = chkSol;
    }

    /**
     * Gets the total.
     * 
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the total.
     * 
     * @param total
     *            the new total
     */
    public void setTotal(final String total) {
        this.total = total;
    }

    /**
     * Gets the chk mark.
     * 
     * @return the chk mark
     */
    public String getChkMark() {
        return chkMark;
    }

    /**
     * Sets the chk mark.
     * 
     * @param chkMark
     *            the new chk mark
     */
    public void setChkMark(final String chkMark) {
        this.chkMark = chkMark;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Gets the building id.
     * 
     * @return the building id
     */
    public String getBuildingId() {
        return buildingId;
    }

    /**
     * Sets the building id.
     * 
     * @param buildingId
     *            the new building id
     */
    public void setBuildingId(final String buildingId) {
        this.buildingId = buildingId;
    }

    /**
     * Gets the building no.
     * 
     * @return the building no
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * Sets the building no.
     * 
     * @param buildingNo
     *            the new building no
     */
    public void setBuildingNo(final String buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * Gets the building id_1.
     * 
     * @return the building id_1
     */
    public String getBuildingId_1() {
        return buildingId_1;
    }

    /**
     * Sets the building id_1.
     * 
     * @param buildingId_1
     *            the new building id_1
     */
    public void setBuildingId_1(final String buildingId_1) {
        this.buildingId_1 = buildingId_1;
    }

    /**
     * Gets the building no_1.
     * 
     * @return the building no_1
     */
    public String getBuildingNo_1() {
        return buildingNo_1;
    }

    /**
     * Sets the building no_1.
     * 
     * @param buildingNo_1
     *            the new building no_1
     */
    public void setBuildingNo_1(final String buildingNo_1) {
        this.buildingNo_1 = buildingNo_1;
    }

    /**
     * Gets the other content.
     * 
     * @return the other content
     */
    public String getOtherContent() {
        return otherContent;
    }

    /**
     * Sets the other content.
     * 
     * @param otherContent
     *            the new other content
     */
    public void setOtherContent(final String otherContent) {
        this.otherContent = otherContent;
    }

    /**
     * Gets the checks if is admin user.
     * 
     * @return the checks if is admin user
     */
    public Boolean getIsAdminUser() {
        return isAdminUser;
    }

    /**
     * Sets the checks if is admin user.
     * 
     * @param isAdminUser
     *            the new checks if is admin user
     */
    public void setIsAdminUser(final Boolean isAdminUser) {
        this.isAdminUser = isAdminUser;
    }

    /**
     * Gets the fee dto.
     * 
     * @return the fee dto
     */
    public FeeDTO getFeeDTO() {
        return feeDTO;
    }

    /**
     * Sets the fee dto.
     * 
     * @param feeDTO
     *            the new fee dto
     */
    public void setFeeDTO(final FeeDTO feeDTO) {
        this.feeDTO = feeDTO;
    }

    /**
     * Gets the fee dto list.
     * 
     * @return the fee dto list
     */
    public List<FeeDTO> getFeeDTOList() {
        return feeDTOList;
    }

    /**
     * Sets the fee dto list.
     * 
     * @param feeDTOList
     *            the new fee dto list
     */
    public void setFeeDTOList(final List<FeeDTO> feeDTOList) {
        this.feeDTOList = feeDTOList;
    }

    /**
     * Gets the rldfu001 list.
     * 
     * @return the rldfu001 list
     */
    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    /**
     * Sets the rldfu001 list.
     * 
     * @param rldfu001List
     *            the new rldfu001 list
     */
    public void setRldfu001List(final List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
    }

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Checks if is enable other certificate.
     * 
     * @return true, if is enable other certificate
     */
    public boolean isEnableOtherCertificate() {
        return enableOtherCertificate;
    }

    /**
     * Sets the enable other certificate.
     * 
     * @param enableOtherCertificate
     *            the new enable other certificate
     */
    public void setEnableOtherCertificate(final boolean enableOtherCertificate) {
        this.enableOtherCertificate = enableOtherCertificate;
    }

    /**
     * Gets the xldfs051 types.
     * 
     * @return the xldfs051 types
     */
    public List<Xldfs051Type> getXldfs051Types() {
        return xldfs051Types;
    }

    /**
     * Sets the xldfs051 types.
     * 
     * @param xldfs051Types
     *            the new xldfs051 types
     */
    public void setXldfs051Types(final List<Xldfs051Type> xldfs051Types) {
        this.xldfs051Types = xldfs051Types;
    }

    /**
     * Gets the xldfs052 types.
     * 
     * @return the xldfs052 types
     */
    public List<Xldfs052Type> getXldfs052Types() {
        return xldfs052Types;
    }

    /**
     * Sets the xldfs052 types.
     * 
     * @param xldfs052Types
     *            the new xldfs052 types
     */
    public void setXldfs052Types(final List<Xldfs052Type> xldfs052Types) {
        this.xldfs052Types = xldfs052Types;
    }

    /**
     * Gets the xldfs053 types.
     * 
     * @return the xldfs053 types
     */
    public List<Xldfs053Type> getXldfs053Types() {
        return xldfs053Types;
    }

    /**
     * Sets the xldfs053 types.
     * 
     * @param xldfs053Types
     *            the new xldfs053 types
     */
    public void setXldfs053Types(final List<Xldfs053Type> xldfs053Types) {
        this.xldfs053Types = xldfs053Types;
    }

    /**
     * Gets the xldfs054 types.
     * 
     * @return the xldfs054 types
     */
    public List<Xldfs054Type> getXldfs054Types() {
        return xldfs054Types;
    }

    /**
     * Sets the xldfs054 types.
     * 
     * @param xldfs054Types
     *            the new xldfs054 types
     */
    public void setXldfs054Types(final List<Xldfs054Type> xldfs054Types) {
        this.xldfs054Types = xldfs054Types;
    }

    /**
     * Gets the xldfs055 types.
     * 
     * @return the xldfs055 types
     */
    public List<Xldfs055Type> getXldfs055Types() {
        return xldfs055Types;
    }

    /**
     * Sets the xldfs055 types.
     * 
     * @param xldfs055Types
     *            the new xldfs055 types
     */
    public void setXldfs055Types(final List<Xldfs055Type> xldfs055Types) {
        this.xldfs055Types = xldfs055Types;
    }

    /**
     * Gets the xldfs056 types.
     * 
     * @return the xldfs056 types
     */
    public List<Xldfs056Type> getXldfs056Types() {
        return xldfs056Types;
    }

    /**
     * Sets the xldfs056 types.
     * 
     * @param xldfs056Types
     *            the new xldfs056 types
     */
    public void setXldfs056Types(final List<Xldfs056Type> xldfs056Types) {
        this.xldfs056Types = xldfs056Types;
    }

    /**
     * Gets the xldfs051b types.
     * 
     * @return the xldfs051b types
     */
    public List<Xldfs051bType> getXldfs051bTypes() {
        return xldfs051bTypes;
    }

    /**
     * Sets the xldfs051b types.
     * 
     * @param xldfs051bTypes
     *            the new xldfs051b types
     */
    public void setXldfs051bTypes(final List<Xldfs051bType> xldfs051bTypes) {
        this.xldfs051bTypes = xldfs051bTypes;
    }

    /**
     * Gets the xldfs052b types.
     * 
     * @return the xldfs052b types
     */
    public List<Xldfs052bType> getXldfs052bTypes() {
        return xldfs052bTypes;
    }

    /**
     * Sets the xldfs052b types.
     * 
     * @param xldfs052bTypes
     *            the new xldfs052b types
     */
    public void setXldfs052bTypes(final List<Xldfs052bType> xldfs052bTypes) {
        this.xldfs052bTypes = xldfs052bTypes;
    }

    /**
     * Gets the xldfs053b types.
     * 
     * @return the xldfs053b types
     */
    public List<Xldfs053bType> getXldfs053bTypes() {
        return xldfs053bTypes;
    }

    /**
     * Sets the xldfs053b types.
     * 
     * @param xldfs053bTypes
     *            the new xldfs053b types
     */
    public void setXldfs053bTypes(final List<Xldfs053bType> xldfs053bTypes) {
        this.xldfs053bTypes = xldfs053bTypes;
    }

    /**
     * Gets the xldfs054b types.
     * 
     * @return the xldfs054b types
     */
    public List<Xldfs054bType> getXldfs054bTypes() {
        return xldfs054bTypes;
    }

    /**
     * Sets the xldfs054b types.
     * 
     * @param xldfs054bTypes
     *            the new xldfs054b types
     */
    public void setXldfs054bTypes(final List<Xldfs054bType> xldfs054bTypes) {
        this.xldfs054bTypes = xldfs054bTypes;
    }

    /**
     * Gets the xldfs055b types.
     * 
     * @return the xldfs055b types
     */
    public List<Xldfs055bType> getXldfs055bTypes() {
        return xldfs055bTypes;
    }

    /**
     * Sets the xldfs055b types.
     * 
     * @param xldfs055bTypes
     *            the new xldfs055b types
     */
    public void setXldfs055bTypes(final List<Xldfs055bType> xldfs055bTypes) {
        this.xldfs055bTypes = xldfs055bTypes;
    }

    /**
     * Gets the xldfs056b types.
     * 
     * @return the xldfs056b types
     */
    public List<Xldfs056bType> getXldfs056bTypes() {
        return xldfs056bTypes;
    }

    /**
     * Sets the xldfs056b types.
     * 
     * @param xldfs056bTypes
     *            the new xldfs056b types
     */
    public void setXldfs056bTypes(final List<Xldfs056bType> xldfs056bTypes) {
        this.xldfs056bTypes = xldfs056bTypes;
    }

    /**
     * Gets the free flag.
     * 
     * @return the free flag
     */
    public String getFreeFlag() {
        return freeFlag;
    }

    /**
     * Sets the free flag.
     * 
     * @param freeFlag
     *            the new free flag
     */
    public void setFreeFlag(final String freeFlag) {
        this.freeFlag = freeFlag;
    }

    /**
     * Gets the memory person.
     * 
     * @return the memory person
     */
    public Tldf004mType getMemoryPerson() {
        return memoryPerson;
    }

    /**
     * Sets the memory person.
     * 
     * @param memoryPerson
     *            the new memory person
     */
    public void setMemoryPerson(final Tldf004mType memoryPerson) {
        this.memoryPerson = memoryPerson;
    }

    /**
     * Gets the prints the receipt flag.
     * 
     * @return the prints the receipt flag
     */
    public String getPrintReceiptFlag() {
        return printReceiptFlag;
    }

    /**
     * Sets the prints the receipt flag.
     * 
     * @param printReceiptFlag
     *            the new prints the receipt flag
     */
    public void setPrintReceiptFlag(final String printReceiptFlag) {
        this.printReceiptFlag = printReceiptFlag;
    }

    /**
     * Checks if is have certificate.
     * 
     * @return true, if is have certificate
     */
    public boolean isHaveCertificate() {
        return haveCertificate;
    }

    /**
     * Sets the have certificate.
     * 
     * @param haveCertificate
     *            the new have certificate
     */
    public void setHaveCertificate(final boolean haveCertificate) {
        this.haveCertificate = haveCertificate;
    }

    /**
     * Checks if is have doorplate.
     * 
     * @return true, if is have doorplate
     */
    public boolean isHaveDoorplate() {
        return haveDoorplate;
    }

    /**
     * Sets the have doorplate.
     * 
     * @param haveDoorplate
     *            the new have doorplate
     */
    public void setHaveDoorplate(final boolean haveDoorplate) {
        this.haveDoorplate = haveDoorplate;
    }

    /**
     * Gets the payment way.
     * 
     * @return the payment way
     */
    public String getPaymentWay() {
        return paymentWay;
    }

    /**
     * Sets the payment way.
     * 
     * @param paymentWay
     *            the new payment way
     */
    public void setPaymentWay(final String paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * Gets the certificate or doorplate.
     * 
     * @return the certificate or doorplate
     */
    public String getCertificateOrDoorplate() {
        return certificateOrDoorplate;
    }

    /**
     * Sets the certificate or doorplate.
     * 
     * @param certificateOrDoorplate
     *            the new certificate or doorplate
     */
    public void setCertificateOrDoorplate(final String certificateOrDoorplate) {
        this.certificateOrDoorplate = certificateOrDoorplate;
    }

    /**
     * Gets the certificate count.
     * 
     * @return the certificate count
     */
    public String getCertificateCount() {
        return certificateCount;
    }

    /**
     * Sets the certificate count.
     * 
     * @param certificateCount
     *            the new certificate count
     */
    public void setCertificateCount(final String certificateCount) {
        this.certificateCount = certificateCount;
    }

    /**
     * Gets the doorplate count.
     * 
     * @return the doorplate count
     */
    public String getDoorplateCount() {
        return doorplateCount;
    }

    /**
     * Sets the doorplate count.
     * 
     * @param doorplateCount
     *            the new doorplate count
     */
    public void setDoorplateCount(final String doorplateCount) {
        this.doorplateCount = doorplateCount;
    }

    /**
     * Checks if is applicant computerized predecessor.
     * 
     * @return true, if is applicant computerized predecessor
     */
    public boolean isApplicantComputerizedPredecessor() {
        return applicantComputerizedPredecessor;
    }

    /**
     * Sets the applicant computerized predecessor.
     * 
     * @param applicantComputerizedPredecessor
     *            the new applicant computerized predecessor
     */
    public void setApplicantComputerizedPredecessor(boolean applicantComputerizedPredecessor) {
        this.applicantComputerizedPredecessor = applicantComputerizedPredecessor;
    }

    /**
     * Gets the applicant book status.
     * 
     * @return the applicant book status
     */
    public String getApplicantBookStatus() {
        return applicantBookStatus;
    }

    /**
     * Sets the applicant book status.
     * 
     * @param applicantBookStatus
     *            the new applicant book status
     */
    public void setApplicantBookStatus(String applicantBookStatus) {
        this.applicantBookStatus = applicantBookStatus;
    }

    /**
     * Checks if is delegated person computerized predecessor.
     * 
     * @return true, if is delegated person computerized predecessor
     */
    public boolean isDelegatedPersonComputerizedPredecessor() {
        return delegatedPersonComputerizedPredecessor;
    }

    /**
     * Sets the delegated person computerized predecessor.
     * 
     * @param delegatedPersonComputerizedPredecessor
     *            the new delegated person computerized predecessor
     */
    public void setDelegatedPersonComputerizedPredecessor(boolean delegatedPersonComputerizedPredecessor) {
        this.delegatedPersonComputerizedPredecessor = delegatedPersonComputerizedPredecessor;
    }

    /**
     * Gets the delegated person book status.
     * 
     * @return the delegated person book status
     */
    public String getDelegatedPersonBookStatus() {
        return delegatedPersonBookStatus;
    }

    /**
     * Sets the delegated person book status.
     * 
     * @param delegatedPersonBookStatus
     *            the new delegated person book status
     */
    public void setDelegatedPersonBookStatus(String delegatedPersonBookStatus) {
        this.delegatedPersonBookStatus = delegatedPersonBookStatus;
    }
}

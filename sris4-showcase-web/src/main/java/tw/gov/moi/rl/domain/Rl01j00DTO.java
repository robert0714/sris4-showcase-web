package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rcdfm06mType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf019dType;
import tw.gov.moi.domain.Rldfm06mType;
import tw.gov.moi.domain.Xldfm06mType;

/**
 * 國民身分證新增掛失紀錄 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01j00DTO", propOrder = { "applyYyymmdd", "applyHhmmss", "trMode", "applyMode", "personId",
        "dayPhoneAreacode", "dayPhoneNumber", "dayPhoneExtension", "nightPhoneAreacode", "nightPhoneNumber",
        "nightPhoneExtension", "cellPhoneNumber", "emailAddress", "personName", "personBirthDate", "cityCountyCode",
        "townCode", "village", "neighbor", "streetDoorplate", "siteId", "areaCode", "adminOfficeCode",
        "clientPersonId", "clientDayPhoneAreacode", "clientDayPhoneNumber", "clientDayPhoneExtension",
        "clientNightPhoneAreacode", "clientNightPhoneNumber", "clientNightPhoneExtension", "clientCellPhoneNumber",
        "clientEmailAddress", "clientPersonName", "clientPersonBirthDate", "clientCityCountyCode", "clientTownCode",
        "clientVillage", "clientNeighbor", "clientStreetDoorplate", "clientSiteId", "clientAreaCode",
        "clientAdminOfficeCode", "personalMark", "clientPersonalMark", "rcdfm06mType", "rldf004mType",
        "rldf004mClientType", "rldf001mType", "rldf001mClientType", "trModeOld", "applyModeOld", "personIdOld",
        "siteIdOld", "clientPersonIdOld", "clientSiteIdOld", "acceptSiteId", "reportURL", "rldfm06mTypeQuery",
        "xldfm06mType", "rldf019dList", "createSiteId019d", "applyYyymmdd019d", "applyHhmmss019d", "reason" })
@XmlRootElement(name = "Rl01j00DTO")
public class Rl01j00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 申請日期 */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("申請日期")
    private String applyYyymmdd;

    /** 申請時間 */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("申請時間")
    private String applyHhmmss;

    /** 掛失類別 */
    @XmlElement(name = "TrMode")
    @FieldName("掛失類別")
    private String trMode;

    /** 申請類別 */
    @XmlElement(name = "ApplyMode")
    @FieldName("申請類別")
    private String applyMode;

    /** 當事人國民身分證統一編號 */
    @XmlElement(name = "PersonId")
    @FieldName("當事人國民身分證統一編號")
    private String personId;

    /** 日間連絡電話-區碼 */
    @XmlElement(name = "DayPhoneAreacode")
    @FieldName("日間連絡電話-區碼")
    private String dayPhoneAreacode;

    /** 日間連絡電話-號碼 */
    @XmlElement(name = "DayPhoneNumber")
    @FieldName("日間連絡電話-號碼")
    private String dayPhoneNumber;

    /** 日間連絡電話-分機 */
    @XmlElement(name = "DayPhoneExtension")
    @FieldName("日間連絡電話-分機")
    private String dayPhoneExtension;

    /** 夜間連絡電話-區碼 */
    @XmlElement(name = "NightPhoneAreacode")
    @FieldName("夜間連絡電話-區碼")
    private String nightPhoneAreacode;

    /** 夜間連絡電話-號碼 */
    @XmlElement(name = "NightPhoneNumber")
    @FieldName("夜間連絡電話-號碼")
    private String nightPhoneNumber;

    /** 夜間連絡電話-分機 */
    @XmlElement(name = "NightPhoneExtension")
    @FieldName("夜間連絡電話-分機")
    private String nightPhoneExtension;

    /** 行動電話 */
    @XmlElement(name = "CellPhoneNumber")
    @FieldName("行動電話")
    private String cellPhoneNumber;

    /** 電子信箱 */
    @XmlElement(name = "EmailAddress")
    @FieldName("電子信箱")
    private String emailAddress;

    /** 當事人姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("當事人姓名")
    private String personName;

    /** 出生年月日 */
    @XmlElement(name = "PersonBirthDate")
    @FieldName("出生年月日")
    private String personBirthDate;

    /** 戶籍地址-縣市 */
    @XmlElement(name = "CityCountyCode")
    @FieldName("戶籍地址-縣市")
    private String cityCountyCode;

    /** 戶籍地址-鄉鎮市區 */
    @XmlElement(name = "TownCode")
    @FieldName("戶籍地址-鄉鎮市區")
    private String townCode;

    /** 戶籍地址-村里 */
    @XmlElement(name = "Village")
    @FieldName("戶籍地址-村里")
    private String village;

    /** 戶籍地址-鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("戶籍地址-鄰")
    private String neighbor;

    /** 戶籍地址-門牌號碼 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("戶籍地址-門牌號碼")
    private String streetDoorplate;

    /** SiteId */
    @XmlElement(name = "SiteId ")
    @FieldName("SiteId")
    private String siteId;

    /** AreaCode */
    @XmlElement(name = "AreaCode")
    @FieldName("AreaCode")
    private String areaCode;

    /** AdminOfficeCode */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("AdminOfficeCode")
    private String adminOfficeCode;

    /** 代理人國民身分證統一編號 */
    @XmlElement(name = "ClientPersonId")
    @FieldName("代理人國民身分證統一編號")
    private String clientPersonId;

    /** 代理人-日間連絡電話-區碼 */
    @XmlElement(name = "ClientDayPhoneAreacode")
    @FieldName("代理人-日間連絡電話-區碼")
    private String clientDayPhoneAreacode;

    /** 代理人-日間連絡電話-號碼 */
    @XmlElement(name = "ClientDayPhoneNumber")
    @FieldName("代理人-日間連絡電話-號碼")
    private String clientDayPhoneNumber;

    /** 代理人-日間連絡電話-分機 */
    @XmlElement(name = "ClientDayPhoneExtension")
    @FieldName("代理人-日間連絡電話-分機")
    private String clientDayPhoneExtension;

    /** 代理人-夜間連絡電話-區碼 */
    @XmlElement(name = "ClientNightPhoneAreacode")
    @FieldName("代理人-夜間連絡電話-區碼")
    private String clientNightPhoneAreacode;

    /** 代理人-夜間連絡電話-號碼 */
    @XmlElement(name = "ClientNightPhoneNumber")
    @FieldName("代理人-夜間連絡電話-號碼")
    private String clientNightPhoneNumber;

    /** 代理人-夜間連絡電話-分機 */
    @XmlElement(name = "ClientNightPhoneExtension")
    @FieldName("代理人-夜間連絡電話-分機")
    private String clientNightPhoneExtension;

    /** 代理人-行動電話 */
    @XmlElement(name = "ClientCellPhoneNumber")
    @FieldName("代理人-行動電話")
    private String clientCellPhoneNumber;

    /** 代理人-電子信箱 */
    @XmlElement(name = "ClientEmailAddress")
    @FieldName("代理人-電子信箱")
    private String clientEmailAddress;

    /** 代理人-姓名 */
    @XmlElement(name = "ClientPersonName")
    @FieldName("代理人-姓名")
    private String clientPersonName;

    /** 代理人出生年月日 */
    @XmlElement(name = "ClientPersonBirthDate")
    @FieldName("代理人-出生年月日")
    private String clientPersonBirthDate;

    /** 代理人戶籍地址-縣市 */
    @XmlElement(name = "ClientCityCountyCode")
    @FieldName("代理人戶籍地址-縣市")
    private String clientCityCountyCode;

    /** 代理人戶籍地址-鄉鎮市區 */
    @XmlElement(name = "ClientTownCode")
    @FieldName("代理人戶籍地址-鄉鎮市區")
    private String clientTownCode;

    /** 代理人戶籍地址-村里 */
    @XmlElement(name = "ClientVillage")
    @FieldName("代理人戶籍地址-村里")
    private String clientVillage;

    /** 代理人戶籍地址-鄰 */
    @XmlElement(name = "ClientNeighbor")
    @FieldName("代理人戶籍地址-鄰")
    private String clientNeighbor;

    /** 代理人戶籍地址-門牌號碼 */
    @XmlElement(name = "ClientStreetDoorplate")
    @FieldName("代理人戶籍地址-門牌號碼")
    private String clientStreetDoorplate;

    /** ClientSiteId */
    @XmlElement(name = "ClientSiteI")
    @FieldName("ClientSiteId")
    private String clientSiteId;

    /** ClientAreaCode */
    @XmlElement(name = "ClientAreaCode")
    @FieldName("ClientAreaCode")
    private String clientAreaCode;

    /** ClientAdminOfficeCode */
    @XmlElement(name = "ClientAdminOfficeCode")
    @FieldName("ClientAdminOfficeCode")
    private String clientAdminOfficeCode;

    /** PersonalMark */
    @XmlElement(name = "PersonalMark")
    @FieldName("PersonalMark")
    private String personalMark;

    /** ClientPersonalMark */
    @XmlElement(name = "ClientPersonalMark")
    @FieldName("ClientPersonalMark")
    private String clientPersonalMark;

    /** Rcdfm06mType */
    @XmlElement(name = "Rcdfm06mType")
    @FieldName("Rcdfm06mType")
    private Rcdfm06mType rcdfm06mType = new Rcdfm06mType();

    /** Rldfm06mType */
    @XmlElement(name = "Rldfm06mType")
    @FieldName("Rldfm06mType")
    private Rldfm06mType rldfm06mType = new Rldfm06mType();

    /** Rldf004mType */
    @XmlElement(name = "Rldf004mType")
    @FieldName("Rldf004mType")
    private Rldf004mType rldf004mType = new Rldf004mType();

    /** Rldf004mClientType */
    @XmlElement(name = "Rldf004mClientType")
    @FieldName("Rldf004mClientType")
    private Rldf004mType rldf004mClientType = new Rldf004mType();

    /** Rldf001mType */
    @XmlElement(name = "Rldf001mType")
    @FieldName("Rldf001mType")
    private Rldf001mType rldf001mType = new Rldf001mType();

    /** Rldf001mClientType */
    @XmlElement(name = "Rldf001mClientType")
    @FieldName("Rldf001mClientType")
    private Rldf001mType rldf001mClientType = new Rldf001mType();

    /** 掛失類別-舊 */
    @XmlElement(name = "TrModeOld")
    @FieldName("掛失類別-舊")
    private String trModeOld;

    /** 申請類別-舊 */
    @XmlElement(name = "ApplyModeOld")
    @FieldName("申請類別-舊")
    private String applyModeOld;

    /** 當事人國民身分證統一編號-舊 */
    @XmlElement(name = "PersonIdOld")
    @FieldName("當事人國民身分證統一編號-舊")
    private String personIdOld;

    /** SiteIdOld */
    @XmlElement(name = "SiteIdOld")
    @FieldName("SiteIdOld")
    private String siteIdOld;

    /** 代理人國民身分證統一編號-舊 */
    @XmlElement(name = "ClientPersonIdOld")
    @FieldName("代理人國民身分證統一編號-舊")
    private String clientPersonIdOld;

    /** ClientSiteIdOld */
    @XmlElement(name = "ClientSiteIdOld")
    @FieldName("ClientSiteIdOld")
    private String clientSiteIdOld;

    /** 當下的作業點代碼 */
    @XmlElement(name = "AcceptSiteId")
    @FieldName("當下的作業點代碼")
    private String acceptSiteId;

    /** 報表URL */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    /** Rldfm06mType */
    @XmlElement(name = "Rldfm06mTypeQuery")
    @FieldName("查詢掛失紀錄")
    private Rldfm06mType rldfm06mTypeQuery;

    /** 查詢掛失紀錄暫存檔. */
    @XmlElement(name = "Xldfm06mType")
    @FieldName("查詢掛失紀錄暫存檔")
    private Xldfm06mType xldfm06mType;

    /** 辦理他所國民身分證掛失紀錄檔. */
    @XmlElement(name = "Rldf019dList")
    @FieldName("辦理他所國民身分證掛失紀錄檔")
    private List<Rldf019dType> rldf019dList = null;

    /** 建檔者作業點代碼. */
    @XmlElement(name = "CreateSiteId019d")
    @FieldName("建檔者作業點代碼")
    private String createSiteId019d = "";

    /** 掛失申請日期. */
    @XmlElement(name = "ApplyYyymmdd019d")
    @FieldName("掛失申請日期")
    private String applyYyymmdd019d = "";

    /** 掛失申請時間. */
    @XmlElement(name = "ApplyHhmmss019d")
    @FieldName("掛失申請時間")
    private String applyHhmmss019d = "";

    /** 辦理原因. */
    @XmlElement(name = "Reason")
    @FieldName("辦理原因")
    private String reason = "";

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(final String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(final String P161747192) {
        this.applyHhmmss = P161747192;
    }

    public String getTrMode() {
        return trMode;
    }

    public void setTrMode(final String trMode) {
        this.trMode = trMode;
    }

    public String getApplyMode() {
        return applyMode;
    }

    public void setApplyMode(final String applyMode) {
        this.applyMode = applyMode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(final String cellPhone) {
        this.cellPhoneNumber = cellPhone;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    public String getPersonBirthDate() {
        return personBirthDate;
    }

    public void setPersonBirthDate(final String personBirthDate) {
        this.personBirthDate = personBirthDate;
    }

    public String getClientPersonId() {
        return clientPersonId;
    }

    public void setClientPersonId(final String clientPersonId) {
        this.clientPersonId = clientPersonId;
    }

    public String getClientCellPhoneNumber() {
        return clientCellPhoneNumber;
    }

    public void setClientCellPhoneNumber(final String clientCellPhoneNumber) {
        this.clientCellPhoneNumber = clientCellPhoneNumber;
    }

    public String getClientPersonName() {
        return clientPersonName;
    }

    public void setClientPersonName(final String clientPersonName) {
        this.clientPersonName = clientPersonName;
    }

    public String getClientPersonBirthDate() {
        return clientPersonBirthDate;
    }

    public void setClientPersonBirthDate(final String clientPersonBirthDate) {
        this.clientPersonBirthDate = clientPersonBirthDate;
    }

    public String getDayPhoneAreacode() {
        return dayPhoneAreacode;
    }

    public void setDayPhoneAreacode(String dayPhoneAreacode) {
        this.dayPhoneAreacode = dayPhoneAreacode;
    }

    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    public void setDayPhoneNumber(String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    public void setDayPhoneExtension(String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
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

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getClientDayPhoneAreacode() {
        return clientDayPhoneAreacode;
    }

    public void setClientDayPhoneAreacode(String clientDayPhoneAreacode) {
        this.clientDayPhoneAreacode = clientDayPhoneAreacode;
    }

    public String getClientDayPhoneNumber() {
        return clientDayPhoneNumber;
    }

    public void setClientDayPhoneNumber(String clientDayPhoneNumber) {
        this.clientDayPhoneNumber = clientDayPhoneNumber;
    }

    public String getClientDayPhoneExtension() {
        return clientDayPhoneExtension;
    }

    public void setClientDayPhoneExtension(String clientDayPhoneExtension) {
        this.clientDayPhoneExtension = clientDayPhoneExtension;
    }

    public String getClientVillage() {
        return clientVillage;
    }

    public void setClientVillage(String clientVillage) {
        this.clientVillage = clientVillage;
    }

    public String getClientNeighbor() {
        return clientNeighbor;
    }

    public void setClientNeighbor(String clientNeighbor) {
        this.clientNeighbor = clientNeighbor;
    }

    public String getClientStreetDoorplate() {
        return clientStreetDoorplate;
    }

    public void setClientStreetDoorplate(String clientStreetDoorplate) {
        this.clientStreetDoorplate = clientStreetDoorplate;
    }

    public Rcdfm06mType getRcdfm06mType() {
        return rcdfm06mType;
    }

    public void setRcdfm06mType(Rcdfm06mType rcdfm06mType) {
        this.rcdfm06mType = rcdfm06mType;
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

    public Rldf004mType getRldf004mClientType() {
        return rldf004mClientType;
    }

    public void setRldf004mClientType(Rldf004mType rldf004mClientType) {
        this.rldf004mClientType = rldf004mClientType;
    }

    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
    }

    public Rldf001mType getRldf001mClientType() {
        return rldf001mClientType;
    }

    public void setRldf001mClientType(Rldf001mType rldf001mClientType) {
        this.rldf001mClientType = rldf001mClientType;
    }

    public String getCityCountyCode() {
        return cityCountyCode;
    }

    public void setCityCountyCode(String cityCountyCode) {
        this.cityCountyCode = cityCountyCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getClientCityCountyCode() {
        return clientCityCountyCode;
    }

    public void setClientCityCountyCode(String clientCityCountyCode) {
        this.clientCityCountyCode = clientCityCountyCode;
    }

    public String getClientTownCode() {
        return clientTownCode;
    }

    public void setClientTownCode(String clientTownCode) {
        this.clientTownCode = clientTownCode;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getClientSiteId() {
        return clientSiteId;
    }

    public void setClientSiteId(String clientSiteId) {
        this.clientSiteId = clientSiteId;
    }

    public String getClientAreaCode() {
        return clientAreaCode;
    }

    public void setClientAreaCode(String clientAreaCode) {
        this.clientAreaCode = clientAreaCode;
    }

    public String getClientAdminOfficeCode() {
        return clientAdminOfficeCode;
    }

    public void setClientAdminOfficeCode(String clientAdminOfficeCode) {
        this.clientAdminOfficeCode = clientAdminOfficeCode;
    }

    public String getTrModeOld() {
        return trModeOld;
    }

    public void setTrModeOld(String trModeOld) {
        this.trModeOld = trModeOld;
    }

    public String getApplyModeOld() {
        return applyModeOld;
    }

    public void setApplyModeOld(String applyModeOld) {
        this.applyModeOld = applyModeOld;
    }

    public String getPersonIdOld() {
        return personIdOld;
    }

    public void setPersonIdOld(String personIdOld) {
        this.personIdOld = personIdOld;
    }

    public String getSiteIdOld() {
        return siteIdOld;
    }

    public void setSiteIdOld(String siteIdOld) {
        this.siteIdOld = siteIdOld;
    }

    public String getClientPersonIdOld() {
        return clientPersonIdOld;
    }

    public void setClientPersonIdOld(String clientPersonIdOld) {
        this.clientPersonIdOld = clientPersonIdOld;
    }

    public String getClientSiteIdOld() {
        return clientSiteIdOld;
    }

    public void setClientSiteIdOld(String clientSiteIdOld) {
        this.clientSiteIdOld = clientSiteIdOld;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public Rldfm06mType getRldfm06mType() {
        return rldfm06mType;
    }

    public void setRldfm06mType(Rldfm06mType rldfm06mType) {
        this.rldfm06mType = rldfm06mType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getNightPhoneAreacode() {
        return nightPhoneAreacode;
    }

    public void setNightPhoneAreacode(String nightPhoneAreacode) {
        this.nightPhoneAreacode = nightPhoneAreacode;
    }

    public String getNightPhoneNumber() {
        return nightPhoneNumber;
    }

    public void setNightPhoneNumber(String nightPhoneNumber) {
        this.nightPhoneNumber = nightPhoneNumber;
    }

    public String getNightPhoneExtension() {
        return nightPhoneExtension;
    }

    public void setNightPhoneExtension(String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getClientNightPhoneAreacode() {
        return clientNightPhoneAreacode;
    }

    public void setClientNightPhoneAreacode(String clientNightPhoneAreacode) {
        this.clientNightPhoneAreacode = clientNightPhoneAreacode;
    }

    public String getClientNightPhoneNumber() {
        return clientNightPhoneNumber;
    }

    public void setClientNightPhoneNumber(String clientNightPhoneNumber) {
        this.clientNightPhoneNumber = clientNightPhoneNumber;
    }

    public String getClientNightPhoneExtension() {
        return clientNightPhoneExtension;
    }

    public void setClientNightPhoneExtension(String clientNightPhoneExtension) {
        this.clientNightPhoneExtension = clientNightPhoneExtension;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    public void setClientEmailAddress(String clientEmailAddress) {
        this.clientEmailAddress = clientEmailAddress;
    }

    public String getPersonalMark() {
        return personalMark;
    }

    public void setPersonalMark(String personalMark) {
        this.personalMark = personalMark;
    }

    public String getClientPersonalMark() {
        return clientPersonalMark;
    }

    public void setClientPersonalMark(String clientPersonalMark) {
        this.clientPersonalMark = clientPersonalMark;
    }

    public Rldfm06mType getRldfm06mTypeQuery() {
        return rldfm06mTypeQuery;
    }

    public void setRldfm06mTypeQuery(Rldfm06mType rldfm06mTypeQuery) {
        this.rldfm06mTypeQuery = rldfm06mTypeQuery;
    }

    public Xldfm06mType getXldfm06mType() {
        return xldfm06mType;
    }

    public void setXldfm06mType(Xldfm06mType xldfm06mType) {
        this.xldfm06mType = xldfm06mType;
    }

    public List<Rldf019dType> getRldf019dList() {
        return rldf019dList;
    }

    public void setRldf019dList(List<Rldf019dType> rldf019dList) {
        this.rldf019dList = rldf019dList;
    }

    public String getCreateSiteId019d() {
        return createSiteId019d;
    }

    public void setCreateSiteId019d(String createSiteId019d) {
        this.createSiteId019d = createSiteId019d;
    }

    public String getApplyYyymmdd019d() {
        return applyYyymmdd019d;
    }

    public void setApplyYyymmdd019d(String applyYyymmdd019d) {
        this.applyYyymmdd019d = applyYyymmdd019d;
    }

    public String getApplyHhmmss019d() {
        return applyHhmmss019d;
    }

    public void setApplyHhmmss019d(String applyHhmmss019d) {
        this.applyHhmmss019d = applyHhmmss019d;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

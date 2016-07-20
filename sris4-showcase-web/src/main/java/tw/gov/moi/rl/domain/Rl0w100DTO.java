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
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFForeignPersonDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0w100DTO", propOrder = {"memoryPerson1","memoryPerson2" , "registryKind", "mrgPlace", "mrgPlaceCode", "otherMrgPlace", "mrgWitnessA", "mrgWitnessB", "registerDate",
	"registerTime", "applyDate", "executeDate", "applicant1", "applicant2", "delegatedPerson", "otherCertificate", "certificateList", "certificateFlag",
	"deleteFineDTOFlag", "registerContent", "openingOperationDTO", "hhSiteId", "hhAttorneyFlag", "hhPersonRole", "hhCityCountyCode", "hhTownCode",
	"hhVillageCode", "hhNeighbor", "hhNeighborChar", "hhStreetDoorplate", "hhMrgStatusBCode", "hhAttorneyCode", "wwSiteId", "wwAttorneyFlag",
	"wwPersonRole", "wwCityCountyCode", "wwTownCode", "wwVillageCode", "wwNeighbor", "wwNeighborChar", "wwStreetDoorplate", "wwMrgStatusBCode",
	"wwAttorneyCode", "rolePersonFlag", "flagQueryForeignDataHWFlag", "flagGetSpouseDataHWFlag", "hMainPersonData", "hMainPersonForeignPersonData",
	"pMainPersonData", "wMainPersonData", "wMainPersonForeignPersonData", "transactionId", "applySequenceId", "fineReceiptId", "isPunish",
	"modifyToUnPunish", "removeFeeReason", "lawDate", "checkFine", "operateDate", "applyPersonId", "applySiteId", "applyCaseNo", "previousDoFineCheckFlag",
	"previousFineEventDate", "saveButtonShow", "fineButtonShow", "doFineCheckFlagOpen", "needFineFlag", "fineFreeFlag", "finePerson" ,"initErrorMessageList" ,"warningMessgeList"})
@XmlRootElement(name = "Rl0w100DTO")
public class Rl0w100DTO implements Serializable {

    /**
     * 現無戶籍者結離婚登記DTO
     * 
     * @author josh
     */
    private static final long serialVersionUID = -4222450748995865352L;

    /** 警告訊息清單 */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單 ")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();
    
    /** 錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();
    
    /** 夫. */
    @XmlElement(name = "MemoryPerson1")
    @FieldName("夫-補登個人基本資料")
    private Tldf004mType memoryPerson1;

    /** 記憶妻. */
    @XmlElement(name = "MemoryPerson2")
    @FieldName("妻-補登個人基本資料")
    private Tldf004mType memoryPerson2;
    
    /** 登記類別. */
    @XmlElement(name = "RegistryKind", required = true)
    @FieldName("登記類別")
    private String registryKind;

    /** 結(離)婚地點. */
    @XmlElement(name = "MrgPlace", required = true)
    @FieldName("結(離)婚地點")
    private String mrgPlace;

    /** 結(離)婚地點代碼. */
    @XmlElement(name = "MrgPlaceCode", required = true)
    @FieldName("結(離)婚地點代碼")
    private String mrgPlaceCode;

    /** 其它結(離)婚地點. */
    @XmlElement(name = "OtherMrgPlace", required = true)
    @FieldName("其它結(離)婚地點")
    private String otherMrgPlace;

    /** 證人1姓名. */
    @XmlElement(name = "MrgWitnessA", required = true)
    @FieldName("證人1姓名")
    private String mrgWitnessA;

    /** 證人2姓名. */
    @XmlElement(name = "MrgWitnessB", required = true)
    @FieldName("證人2姓名")
    private String mrgWitnessB;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate", required = true)
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime", required = true)
    @FieldName("登記時間")
    private String registerTime;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /** 生效日期. */
    @XmlElement(name = "ExecuteDate", required = true)
    @FieldName("生效日期")
    private String executeDate;
      
    /** 申請人1 */
    @XmlElement(name = "Applicant1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO applicant1;

    /** 申請人2 */
    @XmlElement(name = "Applicant2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO applicant2;

    /** 委託人 */
    @XmlElement(name = "DelegatedPerson", required = true)
    @FieldName("委託人")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 其它附繳證件. */
    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("其它附繳證件")
    private String otherCertificate;

    /** 申請資料【附繳證件】 */
    @XmlElement(name = "CertificateList", required = true)
    @FieldName("申請資料附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 附繳證件Flag */
    @XmlElement(name = "CertificateFlag", required = true)
    @FieldName("附繳證件Flag")
    private String certificateFlag;

    /** 刪除罰鍰處理資料旗標 */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag;
    
    /** 備註 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 大簿控制各作業之資訊 */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 夫-資料儲存地作業點代碼 */
    @XmlElement(name = "HhSiteId", required = true)
    @FieldName("夫-資料儲存地作業點代碼")
    private String hhSiteId;

    /** 夫-法定代理人同意-旗標. */
    @XmlElement(name = "HhAttorneyFlag", required = true)
    @FieldName("夫-法定代理人同意-旗標")
    private String hhAttorneyFlag;

    /** 夫-身分. */
    @XmlElement(name = "HhPersonRole", required = true)
    @FieldName("夫-身分")
    private String hhPersonRole;


    /** 夫-街路門牌 */
    @XmlElement(name = "hhCityCountyCode", required = true)
    @FieldName("夫-市")
    private String hhCityCountyCode;

    /** 夫-街路門牌 */
    @XmlElement(name = "hhTownCode", required = true)
    @FieldName("夫-鎮")
    private String hhTownCode;

    /** 夫-街路門牌 */
    @XmlElement(name = "hhVillageCode", required = true)
    @FieldName("夫-村里")
    private String hhVillageCode;

    /** 夫-街路門牌 */
    @XmlElement(name = "hhNeighbor", required = true)
    @FieldName("夫-鄰")
    private String hhNeighbor;

    /** 夫-街路門牌 */
    @XmlElement(name = "hhNeighborChar", required = true)
    @FieldName("夫-鄰字串")
    private String hhNeighborChar;

    /** 夫-街路門牌 */
    @XmlElement(name = "HhStreetDoorplate", required = true)
    @FieldName("夫-街路門牌")
    private String hhStreetDoorplate;

    /** 夫-婚前婚姻狀況代碼 */
    @XmlElement(name = "HhMrgStatusBCode", required = true)
    @FieldName("夫-婚前婚姻狀況代碼")
    private String hhMrgStatusBCode;

    /** 夫-當事人是否有民法1049條之情事代碼 */
    @XmlElement(name = "HhAttorneyCode", required = true)
    @FieldName("夫-當事人是否有民法1049條之情事代碼")
    private String hhAttorneyCode;

    /** 妻-資料儲存地作業點代碼 */
    @XmlElement(name = "WwSiteId", required = true)
    @FieldName("妻-資料儲存地作業點代碼")
    private String wwSiteId;

    /** 妻-法定代理人同意-旗標. */
    @XmlElement(name = "WwAttorneyFlag", required = true)
    @FieldName("妻-法定代理人同意-旗標")
    private String wwAttorneyFlag;

    /** 妻-者身分. */
    @XmlElement(name = "WwPersonRole", required = true)
    @FieldName("妻-者身分")
    private String wwPersonRole;

    @XmlElement(name = "wwCityCountyCode", required = true)
    @FieldName("妻-市")
    private String wwCityCountyCode;

    @XmlElement(name = "wwTownCode", required = true)
    @FieldName("妻-鎮")
    private String wwTownCode;

    @XmlElement(name = "wwVillageCode", required = true)
    @FieldName("妻-村里")
    private String wwVillageCode;

    @XmlElement(name = "wwNeighbor", required = true)
    @FieldName("妻-鄰")
    private String wwNeighbor;

    @XmlElement(name = "wwNeighborChar", required = true)
    @FieldName("妻-鄰字串")
    private String wwNeighborChar;

    /** 妻-街路門牌 */
    @XmlElement(name = "WwStreetDoorplate", required = true)
    @FieldName("妻-街路門牌")
    private String wwStreetDoorplate;

    /** 妻-婚前婚姻狀況代碼 */
    @XmlElement(name = "WwMrgStatusBCode", required = true)
    @FieldName("妻-婚前婚姻狀況代碼")
    private String wwMrgStatusBCode;

    /** 妻-當事人是否有民法1049條之情事代碼 */
    @XmlElement(name = "WwAttorneyCode", required = true)
    @FieldName("妻-當事人是否有民法1049條之情事代碼")
    private String wwAttorneyCode;

    /** 大簿角色 h表示夫 w表示妻 */
    @XmlElement(name = "RolePersonFlag", required = true)
    @FieldName("大簿角色 h表示夫 w表示妻")
    private String rolePersonFlag;

    /** The flag query foreign data hw flag. */
    @XmlElement(name = "FlagQueryForeignDataHWFlag", required = true)
    @FieldName("The flag query foreign data hw flag")
    private String flagQueryForeignDataHWFlag;

    /** The flag get spouse data hw flag. */
    @XmlElement(name = "FlagGetSpouseDataHWFlag", required = true)
    @FieldName("The flag get spouse data hw flag")
    private String flagGetSpouseDataHWFlag;

    /** (夫)個人基本資料 */
    @XmlElement(name = "HmainPersonData", required = true)
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDomainObject hMainPersonData;

    /** (夫)外籍者資料1 */
    @XmlElement(name = "HmainPersonForeignPersonData", required = true)
    @FieldName("(夫)外籍者資料1")
    private XLDFForeignPersonDTO hMainPersonForeignPersonData = new XLDFForeignPersonDTO();
    
    /** (當事人)個人基本資料 */
    @XmlElement(name = "PmainPersonData", required = true)
    @FieldName("(當事人)個人基本資料")
    private XLDFPersonDataDomainObject pMainPersonData;

    /** (妻)個人基本資料 */
    @XmlElement(name = "WMainPersonData", required = true)
    @FieldName("(妻)個人基本資料 ")
    private XLDFPersonDataDomainObject wMainPersonData;

    /** (妻)外籍者資料1 */
    @XmlElement(name = "WMainPersonForeignPersonData", required = true)
    @FieldName("(妻)外籍者資料1")
    private XLDFForeignPersonDTO wMainPersonForeignPersonData = new XLDFForeignPersonDTO();
    
    /** 交易序號 */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 作業順序編號*/
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;
    
    /** 收據號碼*/
    @XmlElement(name = "FineReceiptId", required = true)
    @FieldName("收據號碼")
    private String fineReceiptId;
    
    @XmlElement(name = "IsPunish", required = true)
    @FieldName("是否需要罰鍰")
    private boolean isPunish = Boolean.FALSE;

    @XmlElement(name = "ModifyToUnPunish", required = true)
    @FieldName("改為免罰")
    private boolean modifyToUnPunish;

    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason;
    
    @XmlElement(name = "LawDate", required = true)
    @FieldName("法定應申報日期事件發生(確定)日期")
    private String lawDate;
    
    @XmlElement(name = "CheckFine", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;
     
    @XmlElement(name = "OperateDate", required = true)
    @FieldName("系統日期")
    private String operateDate;
    
    @XmlElement(name = "ApplyPersonId", required = true)
    @FieldName("申請罰鍰ID")
    private String applyPersonId;
    
    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("申請罰鍰作業點代碼")
    private String applySiteId;
    
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申請罰鍰申請書類別")
    private String applyCaseNo;
    
    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標 */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private boolean previousDoFineCheckFlag;

    /** 前一次資料驗證之事件發生(確定)日期 */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate;
    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;
    
    /** 罰鍰處理按鈕是否顯示 */
    @XmlElement(name = "FineButtonShow", required = true)
    @FieldName("罰鍰處理按鈕是否顯示")
    private boolean fineButtonShow;

    /** 進行逾期申報之罰鍰檢視核取方塊是否開放 */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("進行逾期申報之罰鍰檢視核取方塊是否開放")
    private boolean doFineCheckFlagOpen;
    
    /** 判斷是否罰鍰旗標 */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag;

    /** 免罰旗標 */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("免罰旗標")
    private boolean fineFreeFlag;
    
    /** 受處分人 */
    @XmlElement(name = "FinePerson", required = true)
    @FieldName("受處分人")
    private XLDFPersonBriefDataDTO finePerson = new XLDFPersonBriefDataDTO();
    
    public String getRegistryKind() {
	return registryKind;
    }

    public void setRegistryKind(String registryKind) {
	this.registryKind = registryKind;
    }

    public String getMrgPlace() {
	return mrgPlace;
    }

    public void setMrgPlace(String mrgPlace) {
	this.mrgPlace = mrgPlace;
    }

    public String getMrgPlaceCode() {
	return mrgPlaceCode;
    }

    public void setMrgPlaceCode(String mrgPlaceCode) {
	this.mrgPlaceCode = mrgPlaceCode;
    }

    public String getOtherMrgPlace() {
	return otherMrgPlace;
    }

    public void setOtherMrgPlace(String otherMrgPlace) {
	this.otherMrgPlace = otherMrgPlace;
    }

    public String getMrgWitnessA() {
	return mrgWitnessA;
    }

    public void setMrgWitnessA(String mrgWitnessA) {
	this.mrgWitnessA = mrgWitnessA;
    }

    public String getMrgWitnessB() {
	return mrgWitnessB;
    }

    public void setMrgWitnessB(String mrgWitnessB) {
	this.mrgWitnessB = mrgWitnessB;
    }

    public String getRegisterDate() {
	return registerDate;
    }

    public void setRegisterDate(String registerDate) {
	this.registerDate = registerDate;
    }

    public String getApplyDate() {
	return applyDate;
    }

    public void setApplyDate(String applyDate) {
	this.applyDate = applyDate;
    }

    public String getExecuteDate() {
	return executeDate;
    }

    public void setExecuteDate(String executeDate) {
	this.executeDate = executeDate;
    }

    public String getOtherCertificate() {
	return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
	this.otherCertificate = otherCertificate;
    }

    public List<String> getCertificateList() {
	return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
	this.certificateList = certificateList;
    }

    public String getCertificateFlag() {
	return certificateFlag;
    }

    public void setCertificateFlag(String certificateFlag) {
	this.certificateFlag = certificateFlag;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
	return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
	this.openingOperationDTO = openingOperationDTO;
    }

    public String getRegisterContent() {
	return registerContent;
    }

    public void setRegisterContent(String registerContent) {
	this.registerContent = registerContent;
    }

    public String getHhMrgStatusBCode() {
	return hhMrgStatusBCode;
    }

    public XLDFApplicantDataDTO getApplicant1() {
	return applicant1;
    }

    public void setApplicant1(XLDFApplicantDataDTO applicant1) {
	this.applicant1 = applicant1;
    }

    public XLDFApplicantDataDTO getApplicant2() {
	return applicant2;
    }

    public void setApplicant2(XLDFApplicantDataDTO applicant2) {
	this.applicant2 = applicant2;
    }

    public XLDFPersonBriefDataDTO getDelegatedPerson() {
	return delegatedPerson;
    }

    public void setDelegatedPerson(XLDFPersonBriefDataDTO delegatedPerson) {
	this.delegatedPerson = delegatedPerson;
    }

    public void setHhMrgStatusBCode(String hhMrgStatusBCode) {
	this.hhMrgStatusBCode = hhMrgStatusBCode;
    }

    public String getHhAttorneyCode() {
	return hhAttorneyCode;
    }

    public void setHhAttorneyCode(String hhAttorneyCode) {
	this.hhAttorneyCode = hhAttorneyCode;
    }

    public String getWwMrgStatusBCode() {
	return wwMrgStatusBCode;
    }

    public void setWwMrgStatusBCode(String wwMrgStatusBCode) {
	this.wwMrgStatusBCode = wwMrgStatusBCode;
    }

    public String getWwAttorneyCode() {
	return wwAttorneyCode;
    }

    public void setWwAttorneyCode(String wwAttorneyCode) {
	this.wwAttorneyCode = wwAttorneyCode;
    }

//    public String getHhPersonName() {
//	return hhPersonName;
//    }
//
//    public void setHhPersonName(String hhPersonName) {
//	this.hhPersonName = hhPersonName;
//    }

//    public String getHhBirthYyymmdd() {
//	return hhBirthYyymmdd;
//    }
//
//    public void setHhBirthYyymmdd(String hhBirthYyymmdd) {
//	this.hhBirthYyymmdd = hhBirthYyymmdd;
//    }

    public String getWwStreetDoorplate() {
	return wwStreetDoorplate;
    }

    public void setWwStreetDoorplate(String wwStreetDoorplate) {
	this.wwStreetDoorplate = wwStreetDoorplate;
    }

    public String getHhStreetDoorplate() {
	return hhStreetDoorplate;
    }

    public void setHhStreetDoorplate(String hhStreetDoorplate) {
	this.hhStreetDoorplate = hhStreetDoorplate;
    }

    public String getHhSiteId() {
	return hhSiteId;
    }

    public void setHhSiteId(String hhSiteId) {
	this.hhSiteId = hhSiteId;
    }

    public String getWwSiteId() {
	return wwSiteId;
    }

    public void setWwSiteId(String wwSiteId) {
	this.wwSiteId = wwSiteId;
    }

    public String getRolePersonFlag() {
	return rolePersonFlag;
    }

    public void setRolePersonFlag(String rolePersonFlag) {
	this.rolePersonFlag = rolePersonFlag;
    }

    public String getWwPersonRole() {
	return wwPersonRole;
    }

    public void setWwPersonRole(String wwPersonRole) {
	this.wwPersonRole = wwPersonRole;
    }

    public String getHhPersonRole() {
	return hhPersonRole;
    }

    public void setHhPersonRole(String hhPersonRole) {
	this.hhPersonRole = hhPersonRole;
    }

    public String getFlagQueryForeignDataHWFlag() {
	return flagQueryForeignDataHWFlag;
    }

    public void setFlagQueryForeignDataHWFlag(String flagQueryForeignDataHWFlag) {
	this.flagQueryForeignDataHWFlag = flagQueryForeignDataHWFlag;
    }

    public String getHhAttorneyFlag() {
	return hhAttorneyFlag;
    }

    public void setHhAttorneyFlag(String hhAttorneyFlag) {
	this.hhAttorneyFlag = hhAttorneyFlag;
    }

    public String getWwAttorneyFlag() {
	return wwAttorneyFlag;
    }

    public void setWwAttorneyFlag(String wwAttorneyFlag) {
	this.wwAttorneyFlag = wwAttorneyFlag;
    }

    public XLDFPersonDataDomainObject gethMainPersonData() {
	return hMainPersonData;
    }

    public void sethMainPersonData(XLDFPersonDataDomainObject hMainPersonData) {
	this.hMainPersonData = hMainPersonData;
    }

    public XLDFForeignPersonDTO gethMainPersonForeignPersonData() {
	return hMainPersonForeignPersonData;
    }

    public void sethMainPersonForeignPersonData(XLDFForeignPersonDTO hMainPersonForeignPersonData) {
	this.hMainPersonForeignPersonData = hMainPersonForeignPersonData;
    }

    public XLDFPersonDataDomainObject getwMainPersonData() {
	return wMainPersonData;
    }

    public void setwMainPersonData(XLDFPersonDataDomainObject wMainPersonData) {
	this.wMainPersonData = wMainPersonData;
    }

    public XLDFForeignPersonDTO getwMainPersonForeignPersonData() {
	return wMainPersonForeignPersonData;
    }

    public void setwMainPersonForeignPersonData(XLDFForeignPersonDTO wMainPersonForeignPersonData) {
	this.wMainPersonForeignPersonData = wMainPersonForeignPersonData;
    }

    public String getFlagGetSpouseDataHWFlag() {
	return flagGetSpouseDataHWFlag;
    }

    public void setFlagGetSpouseDataHWFlag(String flagGetSpouseDataHWFlag) {
	this.flagGetSpouseDataHWFlag = flagGetSpouseDataHWFlag;
    }

    public String getRegisterTime() {
	return registerTime;
    }

    public void setRegisterTime(String registerTime) {
	this.registerTime = registerTime;
    }

    public String getHhCityCountyCode() {
        return hhCityCountyCode;
    }

    public void setHhCityCountyCode(String hhCityCountyCode) {
        this.hhCityCountyCode = hhCityCountyCode;
    }

    public String getHhTownCode() {
        return hhTownCode;
    }

    public void setHhTownCode(String hhTownCode) {
        this.hhTownCode = hhTownCode;
    }

    public String getHhVillageCode() {
        return hhVillageCode;
    }

    public void setHhVillageCode(String hhVillageCode) {
        this.hhVillageCode = hhVillageCode;
    }

    public String getHhNeighbor() {
        return hhNeighbor;
    }

    public void setHhNeighbor(String hhNeighbor) {
        this.hhNeighbor = hhNeighbor;
    }

    public String getHhNeighborChar() {
        return hhNeighborChar;
    }

    public void setHhNeighborChar(String hhNeighborChar) {
        this.hhNeighborChar = hhNeighborChar;
    }

//    public String getWwBirthYyymmdd() {
//        return wwBirthYyymmdd;
//    }
//
//    public void setWwBirthYyymmdd(String wwBirthYyymmdd) {
//        this.wwBirthYyymmdd = wwBirthYyymmdd;
//    }

    public String getWwCityCountyCode() {
        return wwCityCountyCode;
    }

    public void setWwCityCountyCode(String wwCityCountyCode) {
        this.wwCityCountyCode = wwCityCountyCode;
    }

    public String getWwTownCode() {
        return wwTownCode;
    }

    public void setWwTownCode(String wwTownCode) {
        this.wwTownCode = wwTownCode;
    }

    public String getWwVillageCode() {
        return wwVillageCode;
    }

    public void setWwVillageCode(String wwVillageCode) {
        this.wwVillageCode = wwVillageCode;
    }

    public String getWwNeighbor() {
        return wwNeighbor;
    }

    public void setWwNeighbor(String wwNeighbor) {
        this.wwNeighbor = wwNeighbor;
    }

    public String getWwNeighborChar() {
        return wwNeighborChar;
    }

    public void setWwNeighborChar(String wwNeighborChar) {
        this.wwNeighborChar = wwNeighborChar;
    }

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getApplySequenceId() {
		return applySequenceId;
	}

	public void setApplySequenceId(String applySequenceId) {
		this.applySequenceId = applySequenceId;
	}

	public String getFineReceiptId() {
		return fineReceiptId;
	}

	public void setFineReceiptId(String fineReceiptId) {
		this.fineReceiptId = fineReceiptId;
	}

	public boolean isPunish() {
		return isPunish;
	}

	public void setPunish(boolean isPunish) {
		this.isPunish = isPunish;
	}

	public boolean isModifyToUnPunish() {
		return modifyToUnPunish;
	}

	public void setModifyToUnPunish(boolean modifyToUnPunish) {
		this.modifyToUnPunish = modifyToUnPunish;
	}

	public String getRemoveFeeReason() {
		return removeFeeReason;
	}

	public void setRemoveFeeReason(String removeFeeReason) {
		this.removeFeeReason = removeFeeReason;
	}

	public String getLawDate() {
		return lawDate;
	}

	public void setLawDate(String lawDate) {
		this.lawDate = lawDate;
	}

	public boolean isCheckFine() {
		return checkFine;
	}

	public void setCheckFine(boolean checkFine) {
		this.checkFine = checkFine;
	}

	public String getOperateDate() {
		return operateDate;
	}

	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}

	public XLDFPersonDataDomainObject getpMainPersonData() {
		return pMainPersonData;
	}

	public void setpMainPersonData(XLDFPersonDataDomainObject pMainPersonData) {
		this.pMainPersonData = pMainPersonData;
	}

	public String getApplyPersonId() {
		return applyPersonId;
	}

	public void setApplyPersonId(String applyPersonId) {
		this.applyPersonId = applyPersonId;
	}

	public String getApplySiteId() {
		return applySiteId;
	}

	public void setApplySiteId(String applySiteId) {
		this.applySiteId = applySiteId;
	}

	public String getApplyCaseNo() {
		return applyCaseNo;
	}

	public void setApplyCaseNo(String applyCaseNo) {
		this.applyCaseNo = applyCaseNo;
	}

	public XLDFPersonBriefDataDTO getFinePerson() {
	    return finePerson;
	}

	public void setFinePerson(XLDFPersonBriefDataDTO finePerson) {
	    this.finePerson = finePerson;
	}

	public boolean isPreviousDoFineCheckFlag() {
	    return previousDoFineCheckFlag;
	}

	public void setPreviousDoFineCheckFlag(boolean previousDoFineCheckFlag) {
	    this.previousDoFineCheckFlag = previousDoFineCheckFlag;
	}

	public String getPreviousFineEventDate() {
	    return previousFineEventDate;
	}

	public void setPreviousFineEventDate(String previousFineEventDate) {
	    this.previousFineEventDate = previousFineEventDate;
	}

	public boolean isSaveButtonShow() {
	    return saveButtonShow;
	}

	public void setSaveButtonShow(boolean saveButtonShow) {
	    this.saveButtonShow = saveButtonShow;
	}

	public boolean isFineButtonShow() {
	    return fineButtonShow;
	}

	public void setFineButtonShow(boolean fineButtonShow) {
	    this.fineButtonShow = fineButtonShow;
	}

	public boolean isDoFineCheckFlagOpen() {
	    return doFineCheckFlagOpen;
	}

	public void setDoFineCheckFlagOpen(boolean doFineCheckFlagOpen) {
	    this.doFineCheckFlagOpen = doFineCheckFlagOpen;
	}

	public String getNeedFineFlag() {
	    return needFineFlag;
	}

	public void setNeedFineFlag(String needFineFlag) {
	    this.needFineFlag = needFineFlag;
	}

	public boolean isFineFreeFlag() {
	    return fineFreeFlag;
	}

	public void setFineFreeFlag(boolean fineFreeFlag) {
	    this.fineFreeFlag = fineFreeFlag;
	}

	public boolean isDeleteFineDTOFlag() {
	    return deleteFineDTOFlag;
	}

	public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
	    this.deleteFineDTOFlag = deleteFineDTOFlag;
	}

	public Tldf004mType getMemoryPerson1() {
	    return memoryPerson1;
	}

	public void setMemoryPerson1(Tldf004mType memoryPerson1) {
	    this.memoryPerson1 = memoryPerson1;
	}

	public Tldf004mType getMemoryPerson2() {
	    return memoryPerson2;
	}

	public void setMemoryPerson2(Tldf004mType memoryPerson2) {
	    this.memoryPerson2 = memoryPerson2;
	}

	public List<List<String>> getInitErrorMessageList() {
	    return initErrorMessageList;
	}

	public void setInitErrorMessageList(List<List<String>> initErrorMessageList) {
	    this.initErrorMessageList = initErrorMessageList;
	}

	public List<RlWarningMessage> getWarningMessgeList() {
	    return warningMessgeList;
	}

	public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
	    this.warningMessgeList = warningMessgeList;
	}
    
}

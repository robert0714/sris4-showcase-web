package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde214wType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDF087T;
import tw.gov.moi.rl.component.xldf.dto.XLDF089T;
import tw.gov.moi.rl.domain.InputDateDTO;
import tw.gov.moi.rl.domain.InputTimeDTO;
import tw.gov.moi.rl.domain.RlWarningMessage;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFForeignPersonDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.XLDFSimpleForeignRoleDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class Rl02d00DTO implements Serializable {

    /**
     * 結離婚證明書核發DTO
     * 
     * @author josh
     */
    private static final long serialVersionUID = -4222450748995865352L;

    @FieldName("當事人統號")
    private String txnPersonId;
    
    /***
     * 會放入此,是因為如果是操作多本除戶簿頁散落不同主機點...8s,s申請書是必須存放簿頁所在主機點,無法使用RCDF001mRL上的主機點描述
     * **/
    @FieldName("當事人所抓到的作業點")
    private String txnSiteId;
    
    @FieldName("夫-國內地址資料")
    private String hhChtAddress ;
    
    @FieldName("妻-國內地址資料")
    private String wwChtAddress ;
    /** 夫. */
    @XmlElement(name = "MemoryPerson1")
    @FieldName("夫-補登個人基本資料")
    private Tldf004mType memoryPerson1;

    /** 記憶妻. */
    @XmlElement(name = "MemoryPerson2")
    @FieldName("妻-補登個人基本資料")
    private Tldf004mType memoryPerson2;
    
    /** 當事人是否為電腦化前人口. */
    @XmlElement(name = "ComputerizedPredecessor", required = true)
    @FieldName("當事人是否為電腦化前人口")
    private boolean computerizedPredecessor = false;
    
    
    /** 當事人是否為電腦化前人口. */
    @XmlElement(name = "applicant1IscomputerizedPredecessor", required = true)
    @FieldName("申請人1是否為電腦化前人口")
    private boolean applicant1IscomputerizedPredecessor = false;
    
    
    /** 當事人是否為電腦化前人口. */
    @XmlElement(name = "applicant2IscomputerizedPredecessor", required = true)
    @FieldName("申請人2是否為電腦化前人口")
    private boolean applicant2IscomputerizedPredecessor = false;
    
    /** 當事人是否為電腦化前人口. */
    @XmlElement(name = "delegatedPersonIscomputerizedPredecessor", required = true)
    @FieldName("受委託人是否為電腦化前人口")
    private boolean delegatedPersonIscomputerizedPredecessor = false;
    
    /** 錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    
    @XmlElement(name = "printURL", required = true)
    @FieldName("列印檔案資訊")
    private String printURL;
    
    @XmlElement(name = "add87Data", required = true)
    @FieldName("是否為新增97t資料")
    private Boolean add87Data;
    
    /** 登記戶所代碼 */
    @XmlElement(name = "registerAdminOfficeCode", required = true)
    @FieldName("登記戶所代碼")
    private String registerAdminOfficeCode;
    
    /** 登記戶所名稱-由於行政區域調整,戶所整併會造成相同代碼對應不同戶所名稱 */
    @XmlElement(name = "registerAdminOfficeName", required = true)
    @FieldName("登記戶所中文名稱")
    private String registerAdminOfficeName;
    
    /** 登記戶所名稱-由於行政區域調整,戶所整併會造成相同代碼對應不同戶所名稱 */
    @XmlElement(name = "registerAdminOfficeEngName", required = true)
    @FieldName("登記戶所英文名稱")
    private String registerAdminOfficeEngName;
    
    @FieldName("登記戶所資料")
    private Rlde214wType regAdminOfficeData;
    
    @FieldName("核發證明書戶所資料")
    private Rlde214wType  certAdminOfficeData;
    
    @FieldName("核發證明書戶所代碼")    
    private String certAdminOfficeCode;
    
    /** 警告訊息清單 */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單 ")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();
    
    /** 應該使用的附繳證件代碼 */
    @XmlElement(name = "certificateSymbolCode", required = true)
    @FieldName("使用的附繳證件代碼")
    private String certificateSymbolCode;
    
    @XmlElement(name = "beginno", required = true)
    @FieldName("證號編號")
    private List<String> numberList ;
    
    @XmlElement(name = "beginno", required = true)
    @FieldName("證號起號")
    private String beginno;
    @XmlElement(name = "endno", required = true)
    @FieldName("證號迄號")
    private String endno;
    
    
    /** 除戶日期年月日. */
    @XmlElement(name = "husbandInputDateDTO", required = true)
    @FieldName("夫-除戶日期年月日")
    private InputDateDTO husbandInputDateDTO = new InputDateDTO();

    /** 除戶時間時分秒. */
    @XmlElement(name = "husbandInputTimeDTO", required = true)
    @FieldName("夫-除戶時間時分秒")
    private InputTimeDTO husbandInputTimeDTO = new InputTimeDTO();
    
    /** 除戶日期年月日. */
    @XmlElement(name = "wifeInputDateDTO", required = true)
    @FieldName("夫-除戶日期年月日")
    private InputDateDTO wifeInputDateDTO = new InputDateDTO();

    /** 除戶時間時分秒. */
    @XmlElement(name = "wifeInputTimeDTO", required = true)
    @FieldName("夫-除戶時間時分秒")
    private InputTimeDTO wifeInputTimeDTO = new InputTimeDTO();
    

    @XmlElement(name = "RecordDataList", required = true)
    @FieldName("證書紀錄檔清單")
    private List<Rl02d00CandidateDTO> recordDataList;

    @XmlElement(name = "CurrentPersonRole", required = true)
    @FieldName("當事人角色")
    private String currentPersonRole;

    @XmlElement(name = "QueryDataList", required = true)
    @FieldName("查詢結果")
    private List<String[]> queryDataList;

    @XmlElement(name = "QueryDTO", required = true)
    @FieldName("查詢條件")
    private Rl02d00QueryDTO queryDTO = new Rl02d00QueryDTO();

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    @XmlElement(name = "placeEngName", required = true)
    @FieldName("受理地行政區域英文名稱")
    private String placeEngName;


    /** 婚姻關係 */
    @XmlElement(name = "Relationship", required = true)
    @FieldName("婚姻關係")
    private String relationship;

    /** 證明書別 */
    @XmlElement(name = "Classification", required = true)
    @FieldName("證明書別")
    private String classification;

    /** 中英文證明書 */
    @XmlElement(name = "ChtOrEng", required = true)
    @FieldName("中英文證明書")
    private String chtOrEng;

    /** 拼音法 */
    @XmlElement(name = "IME", required = true)
    @FieldName("拼音法")
    private String iME;

    /** 勾選 */
    @XmlElement(name = "NeedEdit", required = true)
    @FieldName("勾選")
    private boolean needEdit;

    /** 登記日期 */
    @XmlElement(name = "RegisterYyymmdd", required = true)
    @FieldName("結離婚登記日期")
    private String registerYyymmdd;

    /** 生效日期 */
    @XmlElement(name = "ExecuteYyymmdd", required = true)
    @FieldName("生效日期")
    private String executeYyymmdd;

    /** 結(離)婚地點. */
    @XmlElement(name = "MdPlace", required = true)
    @FieldName("結(離)婚地點")
    private String mdPlace;
    
    /** 結(離)婚地點. */
    @XmlElement(name = "MdPlaceCode", required = true)
    @FieldName("結(離)婚地點代碼")
    private String mdPlaceCode;

    /** 其它結(離)婚地點. */
    @XmlElement(name = "OtherMDPlace", required = true)
    @FieldName("其它結(離)婚地點")
    private String otherMDPlace;

    /** 規費金額 */
    @XmlElement(name = "Fee", required = true)
    @FieldName("規費金額")
    private String fee;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate", required = true)
    @FieldName("證書核發申請日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime", required = true)
    @FieldName("登記時間")
    private String registerTime;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

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

    /** 列印資料-總金額. */
    @XmlElement(name = "FeeAmount", required = true)
    @FieldName("列印資料-總金額")
    private String feeAmount = "0";

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

    /** 備註 */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 大簿控制各作業之資訊 */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;
    
    @XmlElement(name = "HhTwEngAddress", required = true)
    @FieldName("(夫)英文國內地址")
    private String hhTwEngAddress;
    
    @XmlElement(name = "WwTwEngAddress", required = true)
    @FieldName("(妻)英文國內地址")
    private String wwTwEngAddress;

    /** (夫)除戶日期. */
    @XmlElement(name = "HhRemoveDate", required = true)
    @FieldName("(夫)除戶日期")
    private String hhRemoveDate;

    /** (夫)除戶時間. */
    @XmlElement(name = "HhRemoveTime", required = true)
    @FieldName("(夫)除戶時間")
    private String hhRemoveTime;

    /** 夫-身分. */
    @XmlElement(name = "HhPersonRole", required = true)
    @FieldName("夫-身分")
    private String hhPersonRole;

    /** (夫)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(夫)戶籍現況")
    private String hhNowStateCode;

    /** (夫)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "HhHouseholdState", required = true)
    @FieldName("(夫)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String hhHouseholdState;

    /** (妻)除戶日期. */
    @XmlElement(name = "WwRemoveDate", required = true)
    @FieldName("(妻)除戶日期")
    private String wwRemoveDate;

    /** (妻)除戶時間. */
    @XmlElement(name = "WwRemoveTime", required = true)
    @FieldName("(妻)除戶時間")
    private String wwRemoveTime;


    /** 妻-者身分. */
    @XmlElement(name = "wwPersonRole", required = true)
    @FieldName("妻-者身分")
    private String wwPersonRole;

    /** 列印資料-免收規費原因. */
    @XmlElement(name = "FreeReason", required = true)
    @FieldName("列印資料-免收規費原因")
    private String freeReason;



    /** (妻)戶籍現況. */
    @XmlElement(name = "HhNowStateCode", required = true)
    @FieldName("(妻)戶籍現況")
    private String wwNowStateCode;

    /** (妻)戶籍簿頁狀態（M現戶）、（H除戶）. */
    @XmlElement(name = "WwHouseholdState", required = true)
    @FieldName("(妻)戶籍簿頁狀態（M現戶）、（H除戶）")
    private String wwHouseholdState;

    /** 大簿角色 h表示夫 w表示妻 */
    @XmlElement(name = "RolePersonFlag", required = true)
    @FieldName("大簿角色 h表示夫 w表示妻")
    private String rolePersonFlag;


    /** The flag get spouse data hw flag. */
    @XmlElement(name = "HusbandHouseholdData", required = true)
    @FieldName("The flag get spouse data hw flag.")
    private String flagGetSpouseDataHWFlag;

    /** (夫)全戶基本資料. */
    @XmlElement(name = "HusbandHouseholdData", required = true)
    @FieldName("(夫)全戶基本資料")
    private XLDFHouseholdDataDomainObject husbandHouseholdData;

    /** (夫)戶長個人基本資料. */
    @XmlElement(name = "HusbandHPersonData", required = true)
    @FieldName("(夫)戶長個人基本資料")
    private XLDFPersonDataDomainObject husbandHPersonData;

    /** (夫)個人基本資料 */
    @XmlElement(name = "HmainPersonData", required = true)
    @FieldName("(夫)個人基本資料")
    private XLDFPersonDataDomainObject hMainPersonData;

    /** (夫)外籍者資料1 */
    @XmlElement(name = "HmainPersonForeignPersonData", required = true)
    @FieldName("(夫)外籍者資料1")
    private XLDFForeignPersonDTO hMainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** (夫)外籍者資料2. */
    @XmlElement(name = "HmainPersonSimpleForeignRoleDTO", required = true)
    @FieldName("(夫)外籍者資料")
    private XLDFSimpleForeignRoleDTO hMainPersonSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);

    /** (妻)全戶基本資料. */
    @XmlElement(name = "WifeHouseholdData", required = true)
    @FieldName("(妻)全戶基本資料")
    private XLDFHouseholdDataDomainObject wifeHouseholdData;

    /** (妻)戶長個人基本資料. */
    @XmlElement(name = "WifeHPersonData", required = true)
    @FieldName("(妻)戶長個人基本資料")
    private XLDFPersonDataDomainObject wifeHPersonData;

    /** (妻)個人基本資料 */
    @XmlElement(name = "WmainPersonData", required = true)
    @FieldName("(妻)外籍者資料")
    private XLDFPersonDataDomainObject wMainPersonData;

    /** (妻)外籍者資料1 */
    @XmlElement(name = "WmainPersonForeignPersonData", required = true)
    @FieldName("(妻)外籍者資料1")
    private XLDFForeignPersonDTO wMainPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** (妻)外籍者資料2. */
    @XmlElement(name = "HmainPersonSimpleForeignRoleDTO", required = true)
    @FieldName("(妻)外籍者資料2")
    private XLDFSimpleForeignRoleDTO wMainPersonSimpleForeignRoleDTO = new XLDFSimpleForeignRoleDTO(StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY);

    /** 列印資料-其他免收規費原因. */
    @XmlElement(name = "OtherFreeReason", required = true)
    @FieldName("列印資料-其他免收規費原因")
    private String otherFreeReason;

    /** 列印資料-份數. */
    @XmlElement(name = "Quantity", required = true)
    @FieldName("列印資料-份數")
    private String quantity = "0";

    /** 需要建立的89t資料. */
    @XmlElement(name = "needCreateXLDF089TList", required = true)
    @FieldName("需要建立的89t資料")
    private List<XLDF089T> needCreateXLDF089TList;

    /** 需要建立的87t資料. */
    @XmlElement(name = "needCreateXLDF087TList", required = true)
    @FieldName("需要建立的87t資料")
    private List<XLDF087T> needCreateXLDF087TList;

    public List<XLDF089T> getNeedCreateXLDF089TList() {
	if (needCreateXLDF089TList == null) {
	    needCreateXLDF089TList = new ArrayList<XLDF089T>();
	}
	return needCreateXLDF089TList;
    }

    public void setNeedCreateXLDF089TList(List<XLDF089T> needCreateXLDF089TList) {
	this.needCreateXLDF089TList = needCreateXLDF089TList;
    }

    public List<XLDF087T> getNeedCreateXLDF087TList() {
	if (needCreateXLDF087TList == null) {
	    needCreateXLDF087TList = new ArrayList<XLDF087T>();
	}
	return needCreateXLDF087TList;
    }

    public void setNeedCreateXLDF087TList(List<XLDF087T> needCreateXLDF087TList) {
	this.needCreateXLDF087TList = needCreateXLDF087TList;
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

    public XLDFSimpleForeignRoleDTO gethMainPersonSimpleForeignRoleDTO() {
	return hMainPersonSimpleForeignRoleDTO;
    }

    public void sethMainPersonSimpleForeignRoleDTO(XLDFSimpleForeignRoleDTO hMainPersonSimpleForeignRoleDTO) {
	this.hMainPersonSimpleForeignRoleDTO = hMainPersonSimpleForeignRoleDTO;
    }

    public XLDFSimpleForeignRoleDTO getwMainPersonSimpleForeignRoleDTO() {
	return wMainPersonSimpleForeignRoleDTO;
    }

    public void setwMainPersonSimpleForeignRoleDTO(XLDFSimpleForeignRoleDTO wMainPersonSimpleForeignRoleDTO) {
	this.wMainPersonSimpleForeignRoleDTO = wMainPersonSimpleForeignRoleDTO;
    }

    public String getHhHouseholdState() {
	return hhHouseholdState;
    }

    public void setHhHouseholdState(String hhHouseholdState) {
	this.hhHouseholdState = hhHouseholdState;
    }

    public String getWwHouseholdState() {
	return wwHouseholdState;
    }

    public void setWwHouseholdState(String wwHouseholdState) {
	this.wwHouseholdState = wwHouseholdState;
    }

    public String getHhNowStateCode() {
	return hhNowStateCode;
    }

    public void setHhNowStateCode(String hhNowStateCode) {
	this.hhNowStateCode = hhNowStateCode;
    }

    public String getWwNowStateCode() {
	return wwNowStateCode;
    }

    public void setWwNowStateCode(String wwNowStateCode) {
	this.wwNowStateCode = wwNowStateCode;
    }

    public String getHhRemoveDate() {
	return hhRemoveDate;
    }

    public void setHhRemoveDate(String hhRemoveDate) {
	this.hhRemoveDate = hhRemoveDate;
    }

    public String getHhRemoveTime() {
	return hhRemoveTime;
    }

    public void setHhRemoveTime(String hhRemoveTime) {
	this.hhRemoveTime = hhRemoveTime;
    }

    public String getWwRemoveDate() {
	return wwRemoveDate;
    }

    public void setWwRemoveDate(String wwRemoveDate) {
	this.wwRemoveDate = wwRemoveDate;
    }

    public String getWwRemoveTime() {
	return wwRemoveTime;
    }

    public void setWwRemoveTime(String wwRemoveTime) {
	this.wwRemoveTime = wwRemoveTime;
    }

    public XLDFHouseholdDataDomainObject getHusbandHouseholdData() {
	return husbandHouseholdData;
    }

    public void setHusbandHouseholdData(XLDFHouseholdDataDomainObject husbandHouseholdData) {
	this.husbandHouseholdData = husbandHouseholdData;
    }

    public XLDFPersonDataDomainObject getHusbandHPersonData() {
	return husbandHPersonData;
    }

    public void setHusbandHPersonData(XLDFPersonDataDomainObject husbandHPersonData) {
	this.husbandHPersonData = husbandHPersonData;
    }

    public XLDFHouseholdDataDomainObject getWifeHouseholdData() {
	return wifeHouseholdData;
    }

    public void setWifeHouseholdData(XLDFHouseholdDataDomainObject wifeHouseholdData) {
	this.wifeHouseholdData = wifeHouseholdData;
    }

    public XLDFPersonDataDomainObject getWifeHPersonData() {
	return wifeHPersonData;
    }

    public void setWifeHPersonData(XLDFPersonDataDomainObject wifeHPersonData) {
	this.wifeHPersonData = wifeHPersonData;
    }

    public String getRelationship() {
	return relationship;
    }

    public void setRelationship(String relationship) {
	this.relationship = relationship;
    }

    public String getClassification() {
	return classification;
    }

    public void setClassification(String classification) {
	this.classification = classification;
    }

    public String getChtOrEng() {
	return chtOrEng;
    }

    public void setChtOrEng(String chtOrEng) {
	this.chtOrEng = chtOrEng;
    }

    public String getiME() {
	return iME;
    }

    public void setiME(String iME) {
	this.iME = iME;
    }

    public boolean isNeedEdit() {
	return needEdit;
    }

    public void setNeedEdit(boolean needEdit) {
	this.needEdit = needEdit;
    }

    public String getRegisterYyymmdd() {
	return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
	this.registerYyymmdd = registerYyymmdd;
    }

    public String getExecuteYyymmdd() {
	return executeYyymmdd;
    }

    public void setExecuteYyymmdd(String executeYyymmdd) {
	this.executeYyymmdd = executeYyymmdd;
    }

    public String getMdPlace() {
	return mdPlace;
    }

    public void setMdPlace(String mdPlace) {
	this.mdPlace = mdPlace;
    }

    public String getOtherMDPlace() {
	return otherMDPlace;
    }

    public void setOtherMDPlace(String otherMDPlace) {
	this.otherMDPlace = otherMDPlace;
    }

    public String getFee() {
	return fee;
    }

    public void setFee(String fee) {
	this.fee = fee;
    }

    public List<Rl02d00CandidateDTO> getRecordDataList() {
	return recordDataList;
    }

    public void setRecordDataList(List<Rl02d00CandidateDTO> recordDataList) {
	this.recordDataList = recordDataList;
    }

    public String getRegisterAdminOfficeCode() {
	return registerAdminOfficeCode;
    }

    public void setRegisterAdminOfficeCode(String registerAdminOfficeCode) {
	this.registerAdminOfficeCode = registerAdminOfficeCode;
    }

    public String getReceiptId() {
	return receiptId;
    }

    public void setReceiptId(String receiptId) {
	this.receiptId = receiptId;
    }

    public String getFeeAmount() {
	return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
	this.feeAmount = feeAmount;
    }

    public String getFreeReason() {
	return freeReason;
    }

    public void setFreeReason(String freeReason) {
	this.freeReason = freeReason;
    }

    public String getOtherFreeReason() {
	return otherFreeReason;
    }

    public void setOtherFreeReason(String otherFreeReason) {
	this.otherFreeReason = otherFreeReason;
    }

    public String getQuantity() {
	return quantity;
    }

    public void setQuantity(String quantity) {
	this.quantity = quantity;
    }

    public Rl02d00QueryDTO getQueryDTO() {
	return queryDTO;
    }

    public void setQueryDTO(Rl02d00QueryDTO queryDTO) {
	this.queryDTO = queryDTO;
    }

    public List<String[]> getQueryDataList() {
	return queryDataList;
    }

    public void setQueryDataList(List<String[]> queryDataList) {
	this.queryDataList = queryDataList;
    }

    public String getCurrentPersonRole() {
	return currentPersonRole;
    }

    public void setCurrentPersonRole(String currentPersonRole) {
	this.currentPersonRole = currentPersonRole;
    }

    public String getBeginno() {
	return beginno;
    }

    public void setBeginno(String beginno) {
	this.beginno = beginno;
    }

    public String getEndno() {
	return endno;
    }

    public void setEndno(String endno) {
	this.endno = endno;
    }

    public List<String> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<String> numberList) {
        this.numberList = numberList;
    }

    public String getPlaceEngName() {
        return placeEngName;
    }

    public void setPlaceEngName(String placeEngName) {
        this.placeEngName = placeEngName;
    }

    public String getCertificateSymbolCode() {
        return certificateSymbolCode;
    }

    public void setCertificateSymbolCode(String certificateSymbolCode) {
        this.certificateSymbolCode = certificateSymbolCode;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public String getPrintURL() {
        return printURL;
    }

    public void setPrintURL(String printURL) {
        this.printURL = printURL;
    }

    public String getCertAdminOfficeCode() {
        return certAdminOfficeCode;
    }

    public void setCertAdminOfficeCode(String certAdminOfficeCode) {
        this.certAdminOfficeCode = certAdminOfficeCode;
    }

    public Rlde214wType getCertAdminOfficeData() {
        return certAdminOfficeData;
    }

    public void setCertAdminOfficeData(Rlde214wType certAdminOfficeData) {
        this.certAdminOfficeData = certAdminOfficeData;
    }

    public Rlde214wType getRegAdminOfficeData() {
        return regAdminOfficeData;
    }

    public void setRegAdminOfficeData(Rlde214wType regAdminOfficeData) {
        this.regAdminOfficeData = regAdminOfficeData;
    }

    public Boolean getAdd87Data() {
        return add87Data;
    }

    public void setAdd87Data(Boolean add87Data) {
        this.add87Data = add87Data;
    }

    public List<List<String>> getInitErrorMessageList() {
        return initErrorMessageList;
    }

    public void setInitErrorMessageList(List<List<String>> initErrorMessageList) {
        this.initErrorMessageList = initErrorMessageList;
    }

    public InputDateDTO getHusbandInputDateDTO() {
        return husbandInputDateDTO;
    }

    public void setHusbandInputDateDTO(InputDateDTO husbandInputDateDTO) {
        this.husbandInputDateDTO = husbandInputDateDTO;
    }

    public InputTimeDTO getHusbandInputTimeDTO() {
        return husbandInputTimeDTO;
    }

    public void setHusbandInputTimeDTO(InputTimeDTO husbandInputTimeDTO) {
        this.husbandInputTimeDTO = husbandInputTimeDTO;
    }

    public InputDateDTO getWifeInputDateDTO() {
        return wifeInputDateDTO;
    }

    public void setWifeInputDateDTO(InputDateDTO wifeInputDateDTO) {
        this.wifeInputDateDTO = wifeInputDateDTO;
    }

    public InputTimeDTO getWifeInputTimeDTO() {
        return wifeInputTimeDTO;
    }

    public void setWifeInputTimeDTO(InputTimeDTO wifeInputTimeDTO) {
        this.wifeInputTimeDTO = wifeInputTimeDTO;
    }

    public String getHhTwEngAddress() {
        return hhTwEngAddress;
    }

    public void setHhTwEngAddress(String hhTwEngAddress) {
        this.hhTwEngAddress = hhTwEngAddress;
    }

    public String getWwTwEngAddress() {
        return wwTwEngAddress;
    }

    public void setWwTwEngAddress(String wwTwEngAddress) {
        this.wwTwEngAddress = wwTwEngAddress;
    }

    public boolean isComputerizedPredecessor() {
        return computerizedPredecessor;
    }

    public void setComputerizedPredecessor(boolean computerizedPredecessor) {
        this.computerizedPredecessor = computerizedPredecessor;
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

    public String getRegisterAdminOfficeName() {
        return registerAdminOfficeName;
    }

    public void setRegisterAdminOfficeName(String registerAdminOfficeName) {
        this.registerAdminOfficeName = registerAdminOfficeName;
    }

    public String getRegisterAdminOfficeEngName() {
        return registerAdminOfficeEngName;
    }

    public void setRegisterAdminOfficeEngName(String registerAdminOfficeEngName) {
        this.registerAdminOfficeEngName = registerAdminOfficeEngName;
    }

    public String getHhChtAddress() {
        return hhChtAddress;
    }

    public void setHhChtAddress(String hhChtAddress) {
        this.hhChtAddress = hhChtAddress;
    }

    public String getWwChtAddress() {
        return wwChtAddress;
    }

    public void setWwChtAddress(String wwChtAddress) {
        this.wwChtAddress = wwChtAddress;
    }

    public boolean isApplicant1IscomputerizedPredecessor() {
        return applicant1IscomputerizedPredecessor;
    }

    public void setApplicant1IscomputerizedPredecessor(boolean applicant1IscomputerizedPredecessor) {
        this.applicant1IscomputerizedPredecessor = applicant1IscomputerizedPredecessor;
    }

    public boolean isApplicant2IscomputerizedPredecessor() {
        return applicant2IscomputerizedPredecessor;
    }

    public void setApplicant2IscomputerizedPredecessor(boolean applicant2IscomputerizedPredecessor) {
        this.applicant2IscomputerizedPredecessor = applicant2IscomputerizedPredecessor;
    }

    public boolean isDelegatedPersonIscomputerizedPredecessor() {
        return delegatedPersonIscomputerizedPredecessor;
    }

    public void setDelegatedPersonIscomputerizedPredecessor(boolean delegatedPersonIscomputerizedPredecessor) {
        this.delegatedPersonIscomputerizedPredecessor = delegatedPersonIscomputerizedPredecessor;
    }

    public String getTxnPersonId() {
        return txnPersonId;
    }

    public void setTxnPersonId(String txnPersonId) {
        this.txnPersonId = txnPersonId;
    }

    public String getTxnSiteId() {
        return txnSiteId;
    }

    public void setTxnSiteId(String txnSiteId) {
        this.txnSiteId = txnSiteId;
    }

    public String getMdPlaceCode() {
        return this.mdPlaceCode;
    }

    public void setMdPlaceCode(String mdPlaceCode) {
        this.mdPlaceCode = mdPlaceCode;
    }
    
}
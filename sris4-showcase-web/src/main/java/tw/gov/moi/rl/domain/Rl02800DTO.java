package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf003yType;
import tw.gov.moi.domain.Rldf004yType;
import tw.gov.moi.domain.Rldf006yType;
import tw.gov.moi.domain.Rldf010yType;
import tw.gov.moi.domain.Rldf011yType;
import tw.gov.moi.domain.Rldf013yType;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02800DTO", propOrder = { "reportUrl", "applyPage", "applyTerm", "printType", "removeDate", "removeTime",
		"applyNote", "sysDate", "sysTime", "printMark", "otherCertificateFlag", "otherCertificate", "applyType", 
		"householdSerialNo", "openingOperationDTO", "enableApply", "crossSiteEnabled", "pages", "amount", "apply1", "apply2",
		"delegated", "xldfHouseholdData", "xldfPersonData", "xldfHousePersonData", "isCrossSite", "certificateList",
		"isVerifyBtn", "isTempBtn", "isTempFileBtn", "isEBookBtn", "isReEBookBtn", "sitId", "pSiteId",
//		"isAddENameBtn", "isAddNewBFullNoteBtn", "isAddNewBPersonBtn", "isAddNewBHousePersonBtn",
		"activeIndex", "applyCount", "householdSelectedAll", "householdList", "houseNotes", "tempPersonNotes", "selectDTO",
		"selectPersonDTO", "selectNote", "selectFullNote", "householdNameList", "tempHouseholdNameList", "householdFullData",
		"personUpNoteCode", "tempCode", "tempFullCode",
		"originalCopies", "duplicateCopies", "quantity", "originalFee", "duplicateFee", "oFeeAmount", "dFeeAmount",
		"freeReason", "freeReasonOther", "freeReasonShow", "oReceiptId", "dReceiptId", "personContentDemo", 
        "personPageCodeDemo", "houseCotetDemo", "housePageCodeDemo", "personDemoMain", "personDemoSub", "houseDemoMain", "houseDemoSub",
        "householdMemberList", "selectedPersonData", "selectedPersonDataId", "personNotes", "HouseholdNotes", "HouseholdData",
        "selectPersonNote", "removeYear", "qRemoveYear", "qHouseholdId", "qHouseholdHeadName",// "IsOldData",
        "villageC", "streetDoorplateC", "countryCode", "birthPlaceCode", "areaCode", "translateList", "buttonShow", "msgList",
        "appellation", "isRemove", "xldfDomainObject", "haveCurrentPerson", "oFeeData", "dFeeData", "copies", "selectPersonList",
        "haveCurrentApply1", "haveCurrentDelegated"
})
@XmlRootElement(name = "Rl02800DTO")
public class Rl02800DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 報表路徑 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = StringUtils.EMPTY;

    /**
     * 申請資料-申請簿頁. <BR>
     * Default: 1
     */
    @XmlElement(name = "ApplyPage")
    @FieldName("申請資料-申請簿頁")
    private String applyPage = "1";

    /**
     * 申請資料-拼音法. <BR>
     * Default: 1
     */
    @XmlElement(name = "ApplyTerm")
    @FieldName("申請資料-拼音法")
    private String applyTerm = "1";

    /** 列印種類 */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType;

    /** 申請資料-除戶日期. */
    @FieldName("申請資料-除戶日期")
    @XmlElement(name = "RemoveDate")
    private String removeDate;

    /** 申請資料-除戶時間. */
    @FieldName("申請資料-除戶時間")
    @XmlElement(name = "RemoveTime")
    private String removeTime;

    /** 備註. */
    @FieldName("備註")
    @XmlElement(name = "ApplyNote")
    private String applyNote;

    /** 系統日期. */
    @FieldName("系統日期")
    @XmlElement(name = "SysDate")
    private String sysDate;

    /** 系統時間. */
    @FieldName("系統時間")
    @XmlElement(name = "SysTime")
    private String sysTime;

    /**
     * 列印資料-列印戶籍謄本申請書 <BR>
     * Default: 要印
     */
    @FieldName("列印資料-列印戶籍謄本申請書")
    @XmlElement(name = "PrintMark")
    private boolean printMark = true;

    /**
     * 附繳證件-其它說明開關 <BR>
     * Default: hide
     * */
    @FieldName("附繳證件-其它說明開關")
    @XmlElement(name = "OtherCertificateFlag")
    private boolean otherCertificateFlag = false;

    /** 附繳證件-其他說明 */
    @FieldName("附繳證件-其他說明")
    @XmlElement(name = "OtherCertificate")
    private String otherCertificate;

    /**
     * 申請資料-申請種類. <BR>
     * Default: 1
     */
    @FieldName("申請資料-申請種類")
    @XmlElement(name = "ApplyType")
    private String applyType = "1";

    /** 戶籍謄本號碼. */
    @FieldName("戶籍謄本號碼")
    @XmlElement(name = "HouseholdSerialNo")
    private String householdSerialNo;

    /** 大簿控制各作業之資訊 */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 是否列印申請書 */
    @FieldName("是否列印申請書")
    @XmlElement(name = "EnableApply")
    private boolean enableApply = Boolean.FALSE;

    /** 異地辦理 */
    @FieldName("異地辦理")
    @XmlElement(name = "CrossSiteEnabled")
    private boolean crossSiteEnabled = Boolean.FALSE;

    /** 張數 */
    @FieldName("張數")
    @XmlElement(name = "Pages")
    private String pages;

    /** 總金額 */
    @FieldName("總金額")
    @XmlElement(name = "Amount")
    private String amount;

    /** 申請人1 */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1")
    private XLDFApplicantDataDTO apply1;

    /** 申請人2 */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2")
    private XLDFApplicantDataDTO apply2;

    /** 受委託人 */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated")
    private XLDFPersonBriefDataDTO delegated;

    /** 全戶基本資料. */
    @FieldName("全戶基本資料")
    @XmlElement(name = "XldfHouseholdData")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 當事人資料. */
    @FieldName("當事人資料")
    @XmlElement(name = "XldfPersonData")
    private XLDFPersonDataDomainObject xldfPersonData;

    @FieldName("全戶資料")
    @XmlElement(name = "XldfHousePersonData")
    private XLDFPersonDataDomainObject xldfHousePersonData;

    /**
     * 是否異地辦理
     */
    @FieldName("是否異地辦理")
    @XmlElement(name = "IsCrossSite")
    private Boolean isCrossSite;

    /** 申請資料-附繳證件 */
    @FieldName("申請資料-附繳證件")
    @XmlElement(name = "CertificateList")
    private List<String> certificateList = new ArrayList<String>();

    // ///////////按鈕/////////////////////////

    /**
     * 驗證按鈕 <li>True:驗證過 <li>False:尚未驗證
     * */
    @FieldName("驗證按鈕")
    @XmlElement(name = "IsVerifyBtn")
    private Boolean isVerifyBtn = Boolean.FALSE;

    /**
     * 暫存按鈕
     */
    @FieldName("暫存按鈕")
    @XmlElement(name = "IsTempBtn")
    private Boolean isTempBtn = Boolean.FALSE;

    /**
     * 暫存案件按鈕
     */
    @FieldName("暫存案件按鈕")
    @XmlElement(name = "IsTempFileBtn")
    private Boolean isTempFileBtn = Boolean.FALSE;

    /** 列印英文按鈕 */
    @FieldName("列印英文按鈕")
    @XmlElement(name = "IsEBookBtn")
    private Boolean isEBookBtn = Boolean.FALSE;

    /** 重印英文按鈕 */
    @FieldName("重印英文按鈕")
    @XmlElement(name = "IsReEBookBtn")
    private Boolean isReEBookBtn = Boolean.FALSE;

    /**
     * 現在工作站
     */
    @FieldName("現在工作站")
    @XmlElement(name = "SitId")
    private String sitId = StringUtils.EMPTY;

    /**
     * 當事人工作站
     */
    @FieldName("當事人工作站")
    @XmlElement(name = "PSiteId")
    private String pSiteId = StringUtils.EMPTY;

    // 電腦化前

//    /** 電腦化前 登錄相關英文姓名按鈕 */
//    @FieldName("電腦化前 登錄相關英文姓名按鈕")
//    @XmlElement(name = "IsAddENameBtn")
//    private Boolean isAddENameBtn = Boolean.FALSE;
//
//    /** 電腦化前 登錄登錄英文戶籍謄本全戶記事按鈕 */
//    @FieldName("電腦化前 登錄登錄英文戶籍謄本全戶記事按鈕")
//    @XmlElement(name = "IsAddNewBFullNoteBtn")
//    private Boolean isAddNewBFullNoteBtn = Boolean.FALSE;
//
//    /** 電腦化前 新增電腦化前當事人按鈕 */
//    @FieldName("電腦化前 新增電腦化前當事人按鈕")
//    @XmlElement(name = "IsAddNewBPersonBtn")
//    private Boolean isAddNewBPersonBtn = Boolean.FALSE;
//
//    /** 登錄英文全戶資料按鈕 */
//    @FieldName("登錄英文全戶資料按鈕")
//    @XmlElement(name = "IsAddNewBHousePersonBtn")
//    private Boolean isAddNewBHousePersonBtn = Boolean.FALSE;

    // /////////////////////////////////////////

    @XmlElement(name = "ActiveIndex")
    @FieldName("頁籤")
    private String activeIndex = RlConstant.STRING_ZERO;

    @XmlElement(name = "ApplyCount")
    @FieldName("人數")
    private Integer applyCount;

    @XmlElement(name = "HouseholdSelectedAll")
    @FieldName("是否選擇全戶")
    private boolean householdSelectedAll = true;

    @XmlElement(name = "HouseholdList")
    @FieldName("申請人相關資料List")
    private List<Rl02800ApplyHouseholdDTO> householdList = new ArrayList<Rl02800ApplyHouseholdDTO>();

    /** 全戶記事 */
    @FieldName("全戶記事")
    @XmlElement(name = "HouseNotes")
    private List<Rl02800NoteDTO> houseNotes = new ArrayList<Rl02800NoteDTO>();

    /** 暫存個人記事 */
    @FieldName("暫存個人記事")
    @XmlElement(name = "TempPersonNotes")
    private List<Rl02800NoteDTO> tempPersonNotes = new ArrayList<Rl02800NoteDTO>();

    @XmlElement(name = "SelectDTO")
    @FieldName("被選到的相關人")
    private Rl02800ApplyHouseholdDTO selectDTO = new Rl02800ApplyHouseholdDTO();

    @XmlElement(name = "SelectPersonDTO")
    @FieldName("被選到的個人")
    private Rldf006yType selectPersonDTO = new Rldf006yType();

    @XmlElement(name = "SelectNote")
    @FieldName("被選到的記事")
    private Rl02800NoteDTO selectNote = new Rl02800NoteDTO();

    @XmlElement(name = "SelectFullNote")
    @FieldName("被選到的全戶記事")
    private Rl02800NoteDTO selectFullNote = new Rl02800NoteDTO();

    @XmlElement(name = "HouseholdNameList")
    @FieldName("申請人相關資料List")
    private List<Rldf003yType> householdNameList = new ArrayList<Rldf003yType>();
    
    @XmlElement(name = "TempHouseholdNameList")
    @FieldName("暫存申請人相關資料List")
    private List<Rldf003yType> tempHouseholdNameList = new ArrayList<Rldf003yType>();

    @XmlElement(name = "HouseholdFullData")
    @FieldName("全戶資料檔")
    private Rldf004yType householdFullData = new Rldf004yType();

    @XmlElement(name = "PersonUpNoteCode")
    @FieldName("記事說明代碼")
    private List<String> personUpNoteCode = new ArrayList<String>();

    @XmlElement(name = "TempCode")
    @FieldName("暫時記事代碼")
    private String tempCode = StringUtils.EMPTY;

    @XmlElement(name = "TempCodeE")
    @FieldName("暫時記事英文內容")
    private String tempCodeE = StringUtils.EMPTY;

    /**
     * 列印資料-正本份數. <BR>
     * Default: 1.
     */
    @FieldName("列印資料-正本份數")
    @XmlElement(name = "OriginalCopies")
    private String originalCopies = "1";

    /**
     * 列印資料-副本份數. <BR>
     * Default: 0.
     */
    @FieldName("列印資料-副本份數")
    @XmlElement(name = "Duplicatecopies")
    private String duplicateCopies = "0";

    /** 列印資料-張數. */
    @FieldName("列印資料-張數")
    @XmlElement(name = "Quantity")
    private String quantity = "0";

    /** 列印資料-正本單價. */
    @FieldName("列印資料-正本單價")
    @XmlElement(name = "OriginalFee")
    private String originalFee = "0";

    /** 列印資料-副本單價. */
    @FieldName("列印資料-副本單價")
    @XmlElement(name = "DuplicateFee")
    private String duplicateFee = "0";

    /** 列印資料-正本金額. */
    @FieldName("列印資料-正本金額")
    @XmlElement(name = "OFeeAmount")
    private String oFeeAmount = "0";

    /** 列印資料-副本金額. */
    @FieldName("列印資料-副本金額")
    @XmlElement(name = "DFeeAmount")
    private String dFeeAmount = "0";

    /** 列印資料-免收費原因. */
    @FieldName("列印資料-免收費原因")
    @XmlElement(name = "FreeReason")
    private String freeReason;

    /** 列印資料-免收費其他原因. */
    @FieldName("列印資料-免收費其他原因")
    @XmlElement(name = "FreeReasonOther")
    private String freeReasonOther;

    /** 列印資料-是否免收費. */
    @FieldName("列印資料-是否免收費")
    @XmlElement(name = "FreeReasonShow")
    private String freeReasonShow = "N";

    /** 正本收據號碼. */
    @XmlElement(name = "OReceiptId")
    @FieldName("正本收據號碼")
    private String oReceiptId;

    /** 副本收據號碼. */
    @XmlElement(name = "DReceiptId")
    @FieldName("副本收據號碼")
    private String dReceiptId;

    /** 示範個人記事內容 */
    @XmlElement(name = "PersonContentDemo")
    @FieldName("示範個人記事內容")
    private String personContentDemo = StringUtils.EMPTY;

    /** 示範個人記事代碼 */
    @XmlElement(name = "PersonPageCodeDemo")
    @FieldName("示範個人記事代碼")
    private String personPageCodeDemo = StringUtils.EMPTY;

    /** 示範全戶記事內容 */
    @XmlElement(name = "HouseCotetDemo")
    @FieldName("示範全戶記事內容")
    private String houseCotetDemo = StringUtils.EMPTY;

    /** 示範全戶記事代碼 */
    @XmlElement(name = "HousePageCodeDemo")
    @FieldName("示範全戶記事代碼")
    private String housePageCodeDemo = StringUtils.EMPTY;

    @XmlElement(name = "PersonDemoMain")
    @FieldName("示範個人記事主代碼")
    private String personDemoMain = StringUtils.EMPTY;

    @XmlElement(name = "PersonDemoSub")
    @FieldName("示範個人記事次代碼")
    private String personDemoSub = StringUtils.EMPTY;

    @XmlElement(name = "HouseDemoMain")
    @FieldName("示範全戶記事主代碼")
    private String houseDemoMain = StringUtils.EMPTY;

    @XmlElement(name = "HouseDemoSub")
    @FieldName("示範全戶記事次代碼")
    private String houseDemoSub = StringUtils.EMPTY;
    
    @XmlElement(name = "HouseholdMemberList")
    @FieldName("電腦化前-戶內成員資料")
    private List<Rl02800MemberDTO> householdMemberList = new ArrayList<Rl02800MemberDTO>();
    
    @XmlElement(name = "SelectedPersonData")
    @FieldName("電腦化前-戶內成員")
    private Rldf006yType selectedPersonData = new Rldf006yType();
    
    @XmlElement(name = "SelectedPersonDataId")
    @FieldName("電腦化前-戶內成員ID")
    private String selectedPersonDataId = "";
    
    @XmlElement(name = "HouseholdData")
    @FieldName("電腦化前-全戶資料")
    private Rldf010yType householdData = new Rldf010yType();
    
    @XmlElement(name = "HouseholdNotes")
    @FieldName("電腦化前-全戶記事")
    private List<Rldf011yType> householdNotes = new ArrayList<Rldf011yType>();
    
    @XmlElement(name = "PersonNotes")
    @FieldName("電腦化前-個人記事")
    private List<Rldf013yType> personNotes = new ArrayList<Rldf013yType>();
    
    @XmlElement(name = "SelectPersonNote")
    @FieldName("電腦化前-選取的個人記事")
    private Rldf013yType selectPersonNote = new Rldf013yType();
    
    @XmlElement(name = "SelectHouseholdNote")
    @FieldName("電腦化前-選取的全戶記事")
    private Rldf011yType selectHouseholdNote = new Rldf011yType();
    
    @XmlElement(name = "RemoveYear")
    @FieldName("電腦化前-除戶年分")
    private String removeYear;
    
    @XmlElement(name = "QRemoveYear")
    @FieldName("電腦化前-查詢-除戶年分")
    private String qRemoveYear;
    
    @XmlElement(name = "QHouseholdId")
    @FieldName("電腦化前-查詢-戶號")
    private String qHouseholdId;
    
    @XmlElement(name = "QHouseholdHeadName")
    @FieldName("電腦化前-查詢-戶長姓名")
    private String qHouseholdHeadName;
    
//    @XmlElement(name = "IsOldData")
//    @FieldName("電腦化前-查詢-是否載入資料")
//    private boolean isOldData = false;
    
    @XmlElement(name = "VillageC")
    @FieldName("村里")
    private String villageC;
    
    @XmlElement(name = "StreetDoorplateC")
    @FieldName("門牌")
    private String streetDoorplateC;
    
    @XmlElement(name = "CountryCode")
    @FieldName("國籍 /中文資料")
    private String countryCode;
    
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地/中文資料")
    private String birthPlaceCode;
    
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域/中文資料")
    private String areaCode;
    
    @XmlElement(name = "TranslateList")
    @FieldName("翻譯資料")
    private List<Rl02800TranslateDTO> translateList = new ArrayList<Rl02800TranslateDTO>();
    
    @XmlElement(name = "ButtonShow")
    @FieldName("按鈕是否顯示")
    private boolean buttonShow = true;
    
    @XmlElement(name = "MsgList")
    @FieldName("訊息")
    private List<String> msgList = new ArrayList<String>();
    
    @XmlElement(name = "Appellation")
    @FieldName("稱謂")
    private String appellation;
    
    @XmlElement(name = "IsRemove")
    @FieldName("是否除戶")
    private boolean isRemove;
    
    @XmlElement(name = "Xldfdomainobject")
    @FieldName("當事人")
    private XLDFDomainObject xldfDomainObject;
    
    @XmlElement(name = "HaveCurrentPerson")
    @FieldName("是否有當事人資料")
    private boolean haveCurrentPerson = true;

    @XmlElement(name = "HaveCurrentApply1")
    @FieldName("是否有申請人1資料")
    private boolean haveCurrentApply1 = true;

    @XmlElement(name = "HaveDelegate")
    @FieldName("是否有受委託人資料")
    private boolean haveCurrentDelegated = true;

    @FieldName("正本規費資料")
    @XmlElement(name = "OFeeData")
    private Rldfu001Type oFeeData = new Rldfu001Type();

    @FieldName("副本規費資料")
    @XmlElement(name = "DFeeData")
    private Rldfu001Type dFeeData = new Rldfu001Type();

    @FieldName("列印資料-份數")
    @XmlElement(name = "Copies")
    private String copies = "1";

    @XmlElement(name = "SelectPersonList")
    @FieldName("登錄選取人員")
    private List<Rldf006yType> selectPersonList = new ArrayList<Rldf006yType>();
    
	public XLDFDomainObject getXldfDomainObject() {
		return xldfDomainObject;
	}

	public void setXldfDomainObject(XLDFDomainObject xldfDomainObject) {
		this.xldfDomainObject = xldfDomainObject;
	}

	public boolean isRemove() {
		return isRemove;
	}

	public void setRemove(boolean isRemove) {
		this.isRemove = isRemove;
	}

	public List<Rldf003yType> getTempHouseholdNameList() {
		return tempHouseholdNameList;
	}

	public void setTempHouseholdNameList(List<Rldf003yType> tempHouseholdNameList) {
		this.tempHouseholdNameList = tempHouseholdNameList;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public List<String> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<String> msgList) {
		this.msgList = msgList;
	}

	public boolean isButtonShow() {
		return buttonShow;
	}

	public void setButtonShow(boolean buttonShow) {
		this.buttonShow = buttonShow;
	}

	public List<Rl02800TranslateDTO> getTranslateList() {
		return translateList;
	}

	public void setTranslateList(List<Rl02800TranslateDTO> translateList) {
		this.translateList = translateList;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getBirthPlaceCode() {
		return birthPlaceCode;
	}

	public void setBirthPlaceCode(String birthPlaceCode) {
		this.birthPlaceCode = birthPlaceCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getVillageC() {
		return villageC;
	}

	public void setVillageC(String villageC) {
		this.villageC = villageC;
	}

	public String getStreetDoorplateC() {
		return streetDoorplateC;
	}

	public void setStreetDoorplateC(String streetDoorplateC) {
		this.streetDoorplateC = streetDoorplateC;
	}

//	public boolean isOldData() {
//		return isOldData;
//	}
//
//	public void setOldData(boolean isOldData) {
//		this.isOldData = isOldData;
//	}

	public String getqHouseholdId() {
		return qHouseholdId;
	}

	public void setqHouseholdId(String qHouseholdId) {
		this.qHouseholdId = qHouseholdId;
	}

	public String getqHouseholdHeadName() {
		return qHouseholdHeadName;
	}

	public void setqHouseholdHeadName(String qHouseholdHeadName) {
		this.qHouseholdHeadName = qHouseholdHeadName;
	}

	public void setqRemoveYear(String qRemoveYear) {
		this.qRemoveYear = qRemoveYear;
	}

	public String getqRemoveYear() {
		return qRemoveYear;
	}
    
	public String getRemoveYear() {
		return removeYear;
	}

	public void setRemoveYear(String removeYear) {
		this.removeYear = removeYear;
	}

	public Rldf013yType getSelectPersonNote() {
		return selectPersonNote;
	}

	public void setSelectPersonNote(Rldf013yType selectPersonNote) {
		this.selectPersonNote = selectPersonNote;
	}

	public Rldf011yType getSelectHouseholdNote() {
		return selectHouseholdNote;
	}

	public void setSelectHouseholdNote(Rldf011yType selectHouseholdNote) {
		this.selectHouseholdNote = selectHouseholdNote;
	}

	public List<Rldf011yType> getHouseholdNotes() {
		return householdNotes;
	}

	public void setHouseholdNotes(List<Rldf011yType> householdNotes) {
		this.householdNotes = householdNotes;
	}

	public List<Rldf013yType> getPersonNotes() {
		return personNotes;
	}

	public void setPersonNotes(List<Rldf013yType> personNotes) {
		this.personNotes = personNotes;
	}

	public Rldf010yType getHouseholdData() {
		return householdData;
	}

	public void setHouseholdData(Rldf010yType householdData) {
		this.householdData = householdData;
	}

	public String getSelectedPersonDataId() {
		return selectedPersonDataId;
	}

	public void setSelectedPersonDataId(String selectedPersonDataId) {
		this.selectedPersonDataId = selectedPersonDataId;
	}

	public Rldf006yType getSelectedPersonData() {
		return selectedPersonData;
	}

	public void setSelectedPersonData(Rldf006yType selectedPersonData) {
		this.selectedPersonData = selectedPersonData;
	}

	public List<Rl02800MemberDTO> getHouseholdMemberList() {
		return householdMemberList;
	}

	public void setHouseholdMemberList(List<Rl02800MemberDTO> householdMemberList) {
		this.householdMemberList = householdMemberList;
	}

	public List<Rldf003yType> getHouseholdNameList() {
        return householdNameList;
    }

    public void setHouseholdNameList(List<Rldf003yType> householdNameList) {
        this.householdNameList = householdNameList;
    }

    public String getActiveIndex() {
        return activeIndex;
    }

    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    public boolean isHouseholdSelectedAll() {
        return householdSelectedAll;
    }

    public void setHouseholdSelectedAll(boolean householdSelectedAll) {
        this.householdSelectedAll = householdSelectedAll;
    }

    public XLDFPersonDataDomainObject getXldfHousePersonData() {
        return xldfHousePersonData;
    }

    public void setXldfHousePersonData(XLDFPersonDataDomainObject xldfHousePersonData) {
        this.xldfHousePersonData = xldfHousePersonData;
    }

    public Integer getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    public List<Rl02800ApplyHouseholdDTO> getHouseholdList() {
        return householdList;
    }

    public void setHouseholdList(List<Rl02800ApplyHouseholdDTO> householdList) {
        this.householdList = householdList;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getApplyPage() {
        return applyPage;
    }

    public void setApplyPage(String applyPage) {
        this.applyPage = applyPage;
    }

    public String getApplyTerm() {
        return applyTerm;
    }

    public void setApplyTerm(String applyTerm) {
        this.applyTerm = applyTerm;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public String getApplyNote() {
        return applyNote;
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getSysTime() {
        return sysTime;
    }

    public void setSysTime(String sysTime) {
        this.sysTime = sysTime;
    }

    public boolean isOtherCertificateFlag() {
        return otherCertificateFlag;
    }

    public void setOtherCertificateFlag(boolean otherCertificateFlag) {
        this.otherCertificateFlag = otherCertificateFlag;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getHouseholdSerialNo() {
        return householdSerialNo;
    }

    public void setHouseholdSerialNo(String householdSerialNo) {
        this.householdSerialNo = householdSerialNo;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public boolean isEnableApply() {
        return enableApply;
    }

    public void setEnableApply(boolean enableApply) {
        this.enableApply = enableApply;
    }

    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    public void setCrossSiteEnabled(boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    public Boolean getIsVerifyBtn() {
        return isVerifyBtn;
    }

    public void setIsVerifyBtn(Boolean isVerifyBtn) {
        this.isVerifyBtn = isVerifyBtn;
    }

    public Boolean getIsTempBtn() {
        return isTempBtn;
    }

    public void setIsTempBtn(Boolean isTempBtn) {
        this.isTempBtn = isTempBtn;
    }

    public Boolean getIsTempFileBtn() {
        return isTempFileBtn;
    }

    public void setIsTempFileBtn(Boolean isTempFileBtn) {
        this.isTempFileBtn = isTempFileBtn;
    }

    public Boolean getIsEBookBtn() {
        return isEBookBtn;
    }

    public void setIsEBookBtn(Boolean isEBookBtn) {
        this.isEBookBtn = isEBookBtn;
    }

    public Boolean getIsReEBookBtn() {
        return isReEBookBtn;
    }

    public void setIsReEBookBtn(Boolean isReEBookBtn) {
        this.isReEBookBtn = isReEBookBtn;
    }

//    public Boolean getIsAddENameBtn() {
//        return isAddENameBtn;
//    }
//
//    public void setIsAddENameBtn(Boolean isAddENameBtn) {
//        this.isAddENameBtn = isAddENameBtn;
//    }
//
//    public Boolean getIsAddNewBFullNoteBtn() {
//        return isAddNewBFullNoteBtn;
//    }
//
//    public void setIsAddNewBFullNoteBtn(Boolean isAddNewBFullNoteBtn) {
//        this.isAddNewBFullNoteBtn = isAddNewBFullNoteBtn;
//    }
//
//    public Boolean getIsAddNewBPersonBtn() {
//        return isAddNewBPersonBtn;
//    }
//
//    public void setIsAddNewBPersonBtn(Boolean isAddNewBPersonBtn) {
//        this.isAddNewBPersonBtn = isAddNewBPersonBtn;
//    }
//
//    public Boolean getIsAddNewBHousePersonBtn() {
//        return isAddNewBHousePersonBtn;
//    }
//
//    public void setIsAddNewBHousePersonBtn(Boolean isAddNewBHousePersonBtn) {
//        this.isAddNewBHousePersonBtn = isAddNewBHousePersonBtn;
//    }

    public Boolean getIsCrossSite() {
        return isCrossSite;
    }

    public void setIsCrossSite(Boolean isCrossSite) {
        this.isCrossSite = isCrossSite;
    }

    public String getSitId() {
        return sitId;
    }

    public void setSitId(String sitId) {
        this.sitId = sitId;
    }

    public XLDFHouseholdDataDomainObject getXldfHouseholdData() {
        return xldfHouseholdData;
    }

    public void setXldfHouseholdData(XLDFHouseholdDataDomainObject xldfHouseholdData) {
        this.xldfHouseholdData = xldfHouseholdData;
    }

    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    public String getpSiteId() {
        return pSiteId;
    }

    public void setpSiteId(String pSiteId) {
        this.pSiteId = pSiteId;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public Rldf004yType getHouseholdFullData() {
        return householdFullData;
    }

    public void setHouseholdFullData(Rldf004yType householdFullData) {
        this.householdFullData = householdFullData;
    }

    public Rl02800ApplyHouseholdDTO getSelectDTO() {
        return selectDTO;
    }

    public void setSelectDTO(Rl02800ApplyHouseholdDTO selectDTO) {
        this.selectDTO = selectDTO;
    }

    public Rl02800NoteDTO getSelectNote() {
        return selectNote;
    }

    public void setSelectNote(Rl02800NoteDTO selectNote) {
        this.selectNote = selectNote;
    }

    public List<Rl02800NoteDTO> getHouseNotes() {
        return houseNotes;
    }

    public void setHouseNotes(List<Rl02800NoteDTO> houseNotes) {
        this.houseNotes = houseNotes;
    }

    public Rl02800NoteDTO getSelectFullNote() {
        return selectFullNote;
    }

    public void setSelectFullNote(Rl02800NoteDTO selectFullNote) {
        this.selectFullNote = selectFullNote;
    }

    public List<Rl02800NoteDTO> getTempPersonNotes() {
        return tempPersonNotes;
    }

    public void setTempPersonNotes(List<Rl02800NoteDTO> tempPersonNotes) {
        this.tempPersonNotes = tempPersonNotes;
    }

    public List<String> getPersonUpNoteCode() {
        return personUpNoteCode;
    }

    public void setPersonUpNoteCode(List<String> personUpNoteCode) {
        this.personUpNoteCode = personUpNoteCode;
    }

    public String getTempCode() {
        return tempCode;
    }

    public void setTempCode(String tempCode) {
        this.tempCode = tempCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOriginalCopies() {
        return originalCopies;
    }

    public void setOriginalCopies(String originalCopies) {
        this.originalCopies = originalCopies;
    }

    public String getDuplicateCopies() {
        return duplicateCopies;
    }

    public void setDuplicateCopies(String duplicateCopies) {
        this.duplicateCopies = duplicateCopies;
    }

    public String getOriginalFee() {
        return originalFee;
    }

    public void setOriginalFee(String originalFee) {
        this.originalFee = originalFee;
    }

    public String getDuplicateFee() {
        return duplicateFee;
    }

    public void setDuplicateFee(String duplicateFee) {
        this.duplicateFee = duplicateFee;
    }

    public String getoFeeAmount() {
        return oFeeAmount;
    }

    public void setoFeeAmount(String oFeeAmount) {
        this.oFeeAmount = oFeeAmount;
    }

    public String getdFeeAmount() {
        return dFeeAmount;
    }

    public void setdFeeAmount(String dFeeAmount) {
        this.dFeeAmount = dFeeAmount;
    }

    public String getoReceiptId() {
        return oReceiptId;
    }

    public void setoReceiptId(String oReceiptId) {
        this.oReceiptId = oReceiptId;
    }

    public String getdReceiptId() {
        return dReceiptId;
    }

    public void setdReceiptId(String dReceiptId) {
        this.dReceiptId = dReceiptId;
    }

    public boolean isPrintMark() {
        return printMark;
    }

    public void setPrintMark(boolean printMark) {
        this.printMark = printMark;
    }

    public String getPersonContentDemo() {
        return personContentDemo;
    }

    public void setPersonContentDemo(String personContentDemo) {
        this.personContentDemo = personContentDemo;
    }

    public String getPersonPageCodeDemo() {
        return personPageCodeDemo;
    }

    public void setPersonPageCodeDemo(String personPageCodeDemo) {
        this.personPageCodeDemo = personPageCodeDemo;
    }

    public String getHouseCotetDemo() {
        return houseCotetDemo;
    }

    public void setHouseCotetDemo(String houseCotetDemo) {
        this.houseCotetDemo = houseCotetDemo;
    }

    public String getHousePageCodeDemo() {
        return housePageCodeDemo;
    }

    public void setHousePageCodeDemo(String housePageCodeDemo) {
        this.housePageCodeDemo = housePageCodeDemo;
    }

    public String getPersonDemoMain() {
        return personDemoMain;
    }

    public void setPersonDemoMain(String personDemoMain) {
        this.personDemoMain = personDemoMain;
    }

    public String getPersonDemoSub() {
        return personDemoSub;
    }

    public void setPersonDemoSub(String personDemoSub) {
        this.personDemoSub = personDemoSub;
    }

    public String getHouseDemoMain() {
        return houseDemoMain;
    }

    public void setHouseDemoMain(String houseDemoMain) {
        this.houseDemoMain = houseDemoMain;
    }

    public String getHouseDemoSub() {
        return houseDemoSub;
    }

    public void setHouseDemoSub(String houseDemoSub) {
        this.houseDemoSub = houseDemoSub;
    }

    @Override
    public String toString() {
        return "Rl02800DTO [reportUrl=" + reportUrl + ", applyPage=" + applyPage + ", applyTerm=" + applyTerm + ", printType=" + printType + ", removeDate=" + removeDate + ", removeTime=" + removeTime + ", applyNote=" + applyNote + ", sysDate=" + sysDate + ", sysTime=" + sysTime + ", printMark=" + printMark + ", otherCertificateFlag=" + otherCertificateFlag + ", otherCertificate=" + otherCertificate 
        		+ ", applyType=" + applyType + ", householdSerialNo=" + householdSerialNo + ", openingOperationDTO=" + openingOperationDTO + ", enableApply=" + enableApply + ", crossSiteEnabled=" + crossSiteEnabled + ", pages=" + pages + ", amount=" + amount + ", apply1=" + apply1 + ", delegated=" + delegated + ", xldfHouseholdData=" + xldfHouseholdData + ", xldfPersonData=" + xldfPersonData
                + ", xldfHousePersonData=" + xldfHousePersonData + ", isCrossSite=" + isCrossSite + ", certificateList=" + certificateList + ", isVerifyBtn=" + isVerifyBtn + ", isTempBtn=" + isTempBtn + ", isTempFileBtn=" + isTempFileBtn + ", isEBookBtn=" + isEBookBtn + ", isReEBookBtn=" + isReEBookBtn + ", sitId=" + sitId + ", pSiteId=" + pSiteId 
//                + ", isAddENameBtn=" + isAddENameBtn + ", isAddNewBFullNoteBtn=" + isAddNewBFullNoteBtn + ", isAddNewBPersonBtn=" + isAddNewBPersonBtn + ", isAddNewBHousePersonBtn=" + isAddNewBHousePersonBtn 
                + ", activeIndex=" + activeIndex + ", applyCount=" + applyCount + ", householdSelectedAll=" + householdSelectedAll + ", householdList=" + householdList + ", houseNotes=" + houseNotes + ", tempPersonNotes=" + tempPersonNotes + ", selectDTO=" + selectDTO
                + ", selectNote=" + selectNote + ", selectFullNote=" + selectFullNote + ", householdNameList=" + householdNameList + ", householdFullData=" + householdFullData + ", personUpNoteCode=" + personUpNoteCode + ", personDownNoteCode="
                + ", tempCode=" + tempCode + ", tempCodeE=" + tempCodeE + ", originalCopies=" + originalCopies + ", duplicateCopies=" + duplicateCopies + ", quantity=" + quantity + ", originalFee=" + originalFee + ", duplicateFee=" + duplicateFee + ", oFeeAmount=" + oFeeAmount + ", dFeeAmount=" + dFeeAmount + ", freeReason=" + freeReason + ", freeReasonOther=" + freeReasonOther + ", freeReasonShow=" + freeReasonShow
                + ", oReceiptId=" + oReceiptId + ", dReceiptId=" + dReceiptId + ", personContentDemo=" + personContentDemo + ", personPageCodeDemo=" + personPageCodeDemo + ", houseCotetDemo=" + houseCotetDemo + ", housePageCodeDemo=" + housePageCodeDemo + ", personDemoMain=" + personDemoMain + ", personDemoSub=" + personDemoSub + ", houseDemoMain=" + houseDemoMain + ", houseDemoSub=" + houseDemoSub + "]";
    }

	public Rldfu001Type getoFeeData() {
		return oFeeData;
	}

	public void setoFeeData(Rldfu001Type oFeeData) {
		this.oFeeData = oFeeData;
	}

	public Rldfu001Type getdFeeData() {
		return dFeeData;
	}

	public void setdFeeData(Rldfu001Type dFeeData) {
		this.dFeeData = dFeeData;
	}

	public String getFreeReason() {
		return freeReason;
	}

	public void setFreeReason(String freeReason) {
		this.freeReason = freeReason;
	}

	public String getFreeReasonOther() {
		return freeReasonOther;
	}

	public void setFreeReasonOther(String freeReasonOther) {
		this.freeReasonOther = freeReasonOther;
	}

	public String getFreeReasonShow() {
		return freeReasonShow;
	}

	public void setFreeReasonShow(String freeReasonShow) {
		this.freeReasonShow = freeReasonShow;
	}

	public String getCopies() {
		return copies;
	}

	public void setCopies(String copies) {
		this.copies = copies;
	}

	public Rldf006yType getSelectPersonDTO() {
		return selectPersonDTO;
	}

	public void setSelectPersonDTO(Rldf006yType selectPersonDTO) {
		this.selectPersonDTO = selectPersonDTO;
	}

	public List<Rldf006yType> getSelectPersonList() {
		return selectPersonList;
	}

	public void setSelectPersonList(List<Rldf006yType> selectPersonList) {
		this.selectPersonList = selectPersonList;
	}

	public XLDFApplicantDataDTO getApply2() {
		return apply2;
	}

	public void setApply2(XLDFApplicantDataDTO apply2) {
		this.apply2 = apply2;
	}

	public boolean isHaveCurrentPerson() {
		return haveCurrentPerson;
	}

	public void setHaveCurrentPerson(boolean haveCurrentPerson) {
		this.haveCurrentPerson = haveCurrentPerson;
	}

	public boolean isHaveCurrentApply1() {
		return haveCurrentApply1;
	}

	public void setHaveCurrentApply1(boolean haveCurrentApply1) {
		this.haveCurrentApply1 = haveCurrentApply1;
	}

	public boolean isHaveCurrentDelegated() {
		return haveCurrentDelegated;
	}

	public void setHaveCurrentDelegated(boolean haveCurrentDelegated) {
		this.haveCurrentDelegated = haveCurrentDelegated;
	}

	public String getTempCodeE() {
		return tempCodeE;
	}

	public void setTempCodeE(String tempCodeE) {
		this.tempCodeE = tempCodeE;
	}

}

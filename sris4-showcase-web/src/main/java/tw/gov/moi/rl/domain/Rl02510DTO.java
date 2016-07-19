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
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDF018D;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * The Class Rl02510DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02510DTO", propOrder = { "apply1", "apply2", "delegated", "openingOperationDTO",
        "householdHeadName", "householdHeadId", "householdId", "xldfPersonData", "xldfHouseholdData", "applyCode",
        "applyDate", "keeperId", "keeperName", "keeper", "deliveryType", "registerCode", "registerContent",
        "certificates", "otherCertificate", "applyCount", "householdList", "activeIndex", "householdSelectedAll",
        "selectedIndex", "isSiteIdInSameHost", "disabledPrintHouseholdBtn", "sysDate", "sysTime", "feePrice",
        "householdSerialNo", "controlNo", "seqNo", "receiptId", "siteId", "pdfUrl", "quantity", "disableSaveBtn",
        "changeNoteList", "beforeChangeNoteList", "copies", "feeAmount", "freeReason", "otherFreeReason",
        "isNewControl", "xldf018d", "disableReprintBtn", "disableHouseholdSelectedCbx",
        "canApplyHouseholdRegistration", "choiceLivePerson", "disabledChoicePrintFormat", "choicePrintFormat",
        "rlWarningMessageList", "disabledVerifyButton", "coverNo", "coverNo1", "coverNo2", "showBirthFatherColumn",
        "showBirthMotherColumn", "showChoicePrintFormatColumn", "printHouseholdNote", "printRelationId", "coverNoList",
        "feeItem", "isFree", "feeCode", "violenceSelectedList", "formType", "rldf002mList", "rldf005mList" })
@XmlRootElement(name = "Rl02510DTO", namespace = "http://tw.gov.moi/rl/dto")
public class Rl02510DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2668789239015040893L;

    /** 申請人1. */
    @XmlElement(name = "Apply1")
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2. */
    @XmlElement(name = "Apply2")
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人. */
    @XmlElement(name = "Delegated")
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 作業順序DTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("作業順序DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 請領種類. */
    @XmlElement(name = "ApplyCode")
    @FieldName("請領種類")
    private String applyCode = "";

    /** 申請日期. */
    @XmlElement(name = "ApplyDate")
    @FieldName("申請日期")
    private String applyDate = "";

    /** 戶口名簿領取人統編. */
    @XmlElement(name = "KeeperId")
    @FieldName("戶口名簿領取人統編")
    private String keeperId = "";

    /** 戶口名簿領取人姓名. */
    @XmlElement(name = "KeeperName")
    @FieldName("戶口名簿領取人姓名")
    private String keeperName = "";

    /** 戶口名簿領取人. */
    @XmlElement(name = "Keeper")
    @FieldName("戶口名簿領取人")
    private String keeper = "";

    /** 領取方式. */
    @XmlElement(name = "DeliveryType")
    @FieldName("領取方式")
    private String deliveryType = "";

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    @FieldName("記事代碼")
    private String registerCode = "";

    /** 備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("備註")
    private String registerContent = "";

    /** 附繳證件. */
    @XmlElement(name = "Certificates")
    @FieldName("附繳證件")
    private List<String> certificates = new ArrayList<String>();

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate = "";

    /** 人數. */
    @XmlElement(name = "ApplyCount")
    @FieldName("人數")
    private Integer applyCount = 0;

    /** 申請資料-申請戶口名簿. */
    @XmlElement(name = "HouseholdList")
    @FieldName("申請資料-申請戶口名簿")
    private List<Rl02510ApplyHouseholdDTO> householdList = new ArrayList<Rl02510ApplyHouseholdDTO>();

    /**
     * 頁籤索引. <BR>
     * Default: 0
     */
    @XmlElement(name = "ActiveIndex")
    @FieldName("頁籤索引")
    private String activeIndex = "0";

    /**
     * 全選申請戶口名簿 <BR>
     * Default: true.
     */
    @XmlElement(name = "HouseholdSelectedAll")
    @FieldName("全選申請現行戶籍謄本")
    private boolean householdSelectedAll = Boolean.TRUE;

    /**
     * 所選列數 <BR>
     * Default: 0.
     */
    @XmlElement(name = "SelectedIndex")
    @FieldName("所選列數")
    private Integer selectedIndex = Integer.valueOf(0);

    /** 是否異地辦理. */
    @XmlElement(name = "IsSiteIdInSameHost")
    @FieldName("是否異地辦理")
    private boolean isSiteIdInSameHost = Boolean.FALSE;

    /**
     * 「列印戶口名簿」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisabledPrintHouseholdBtn")
    @FieldName("「列印戶口名簿」按鈕")
    private boolean disabledPrintHouseholdBtn = Boolean.TRUE;

    /** 系統日期. */
    @XmlElement(name = "SysDate")
    @FieldName("系統日期")
    private String sysDate;

    /** 系統時間. */
    @XmlElement(name = "SysTime")
    @FieldName("系統時間")
    private String sysTime;

    /** 規費. */
    @XmlElement(name = "FeePrice")
    @FieldName("規費")
    private String feePrice = "0";

    /** 戶口名簿請補換發編號. */
    @XmlElement(name = "HouseholdSerialNo")
    @FieldName("戶口名簿請補換發編號")
    private String householdSerialNo;

    /** 控制號. */
    @XmlElement(name = "ControlNo")
    @FieldName("控制號")
    private String controlNo = "";

    /** 流水碼. */
    @XmlElement(name = "SeqNo")
    @FieldName("流水碼")
    private String seqNo = "";

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 報表路徑. */
    @XmlElement(name = "PdfUrl")
    @FieldName("報表路徑")
    private String pdfUrl = "";

    /** 列印資料-張數. */
    @XmlElement(name = "Quantity")
    @FieldName("列印資料-張數")
    private String quantity = "0";

    /**
     * 「暫存」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisableSaveBtn")
    @FieldName("「暫存」按鈕")
    private boolean disableSaveBtn = Boolean.TRUE;

    /** 有被修改記事分類的記事. */
    @XmlElement(name = "ChangeNoteList")
    @FieldName("有被修改記事分類的記事")
    private List<XLDFPersonNoteDomainObject> changeNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 尚未被修改記事分類的記事. */
    @XmlElement(name = "BeforeChangeNoteList")
    @FieldName("尚未被修改記事分類的記事")
    private List<XLDFPersonNoteDomainObject> beforeChangeNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /**
     * 列印資料-份數. <BR>
     * Default: 1.
     */
    @XmlElement(name = "Copies")
    @FieldName("列印資料-份數")
    private String copies = "1";

    /** 列印資料-總金額. */
    @XmlElement(name = "FeeAmount")
    @FieldName("列印資料-總金額")
    private String feeAmount = "0";

    /** 列印資料-免收規費原因. */
    @XmlElement(name = "FreeReason")
    @FieldName("列印資料-免收規費原因")
    private String freeReason = "";

    /** 列印資料-其他免收規費原因. */
    @XmlElement(name = "OtherFreeReason")
    @FieldName("列印資料-其他免收規費原因")
    private String otherFreeReason = "";

    /** 是否為新版本的戶口名簿 Default: false. */
    @XmlElement(name = "IsNewControl")
    @FieldName("是否為新版本")
    private boolean isNewControl = Boolean.FALSE;

    /** 臨時-戶口名簿領補換記錄檔. */
    @XmlElement(name = "Xldf018d")
    @FieldName("臨時-戶口名簿領補換記錄檔")
    private XLDF018D xldf018d;

    /**
     * 「重印」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisableReprintBtn")
    @FieldName("「重印」按鈕")
    private boolean disableReprintBtn = Boolean.TRUE;

    /**
     * 選擇全戶選項核取方塊 <BR>
     * Default: false.
     */
    @XmlElement(name = "disableHouseholdSelectedCbx")
    @FieldName("選擇全戶選項核取方塊")
    private boolean disableHouseholdSelectedCbx = Boolean.FALSE;

    /**
     * 是否可以申請戶口名簿 <BR>
     * Default: true.
     */
    @XmlElement(name = "CanApplyHouseholdRegistration")
    @FieldName("是否可以申請戶口名簿")
    private boolean CanApplyHouseholdRegistration = Boolean.TRUE;

    /** 家暴被保護人清單. */
    @XmlElement(name = "ViolenceList")
    @FieldName("家暴被保護人清單")
    private List<String> violenceList = new ArrayList<String>();

    /**
     * 是否含非現住人口<BR>
     * option:1. 含非現住人口, 2. 現住人口
     */
    @XmlElement(name = "LivePerson")
    @FieldName("是否含非現住人口")
    private String choiceLivePerson = "";

    /**
     * 是否 Disabled 列印格式選擇<BR>
     * default:true.
     */
    @XmlElement(name = "disabledChoicePrintFormat")
    @FieldName("列印格式選擇")
    private boolean disabledChoicePrintFormat = Boolean.TRUE;

    /**
     * 列印格式選擇<BR>
     * option:1. 父, 母, 2. 父, 母 + 養父, 養母
     */
    @XmlElement(name = "ChoicePrintFormat")
    @FieldName("列印格式選擇")
    private String choicePrintFormat = "";

    /** 警告訊息清單. */
    @XmlElement(name = "RlWarningMessageList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> rlWarningMessageList = new ArrayList<RlWarningMessage>();

    /** 控制驗證按鈕. */
    @XmlElement(name = "DisabledVerifyButton", required = true)
    @FieldName("控制驗證按鈕")
    private boolean disabledVerifyButton = Boolean.TRUE;

    /** 戶口名簿封面編號. */
    @XmlElement(name = "CoverNo", required = true)
    @FieldName("戶口名簿封面編號")
    private String coverNo = "";

    /** 戶口名簿封面編號1. */
    @XmlElement(name = "CoverNo1", required = true)
    @FieldName("戶口名簿封面編號1")
    private String coverNo1 = "";

    /** 戶口名簿封面編號2. */
    @XmlElement(name = "CoverNo2", required = true)
    @FieldName("戶口名簿封面編號2")
    private String coverNo2 = "";

    /** 顯示生父欄位. */
    @XmlElement(name = "ShowBirthFatherColumn")
    @FieldName("顯示生父欄位")
    private boolean showBirthFatherColumn = Boolean.FALSE;

    /** 顯示生母欄位. */
    @XmlElement(name = "ShowBirthMotherColumn")
    @FieldName("顯示生母欄位")
    private boolean showBirthMotherColumn = Boolean.FALSE;

    /** 顯示列印格式選擇欄位. */
    @XmlElement(name = "ShowBirthMotherColumn")
    @FieldName("顯示列印格式選擇欄位")
    private boolean showChoicePrintFormatColumn = Boolean.FALSE;

    /** 列印全戶動態記事. */
    @XmlElement(name = "PrintHouseholdNote")
    @FieldName("列印全戶動態記事")
    private String printHouseholdNote = "";

    /** 列印關係人統號. */
    @XmlElement(name = "printRelationId")
    @FieldName("列印關係人統號")
    private String printRelationId = "";

    /** 輸入過的戶口名簿封面編號. */
    @XmlElement(name = "CoverNoList")
    @FieldName("輸入過的戶口名簿封面編號")
    private List<String> coverNoList = new ArrayList<String>();

    /** 收費項目. */
    @XmlElement(name = "FeeItem")
    @FieldName("收費項目")
    private String feeItem = "";

    /** 是否免費. */
    @XmlElement(name = "IsFree")
    @FieldName("是否免費")
    private String isFree = "";

    /** 規費代碼. */
    @XmlElement(name = "FeeCode")
    @FieldName("規費代碼")
    private String feeCode = "";

    /** 家暴被保護人被選擇列印記事清單. */
    @XmlElement(name = "ViolenceSelectedList")
    @FieldName("家暴被保護人被選擇列印記事清單")
    private List<String> violenceSelectedList = new ArrayList<String>();

    /** 列印種類. */
    @XmlElement(name = "FormType")
    @FieldName("列印種類")
    private String formType = "";

    /** 全戶記事. */
    @XmlElement(name = "Rldf002mList")
    @FieldName("全戶記事")
    private List<Rldf002mType> rldf002mList;

    /** 全戶個人記事. */
    @XmlElement(name = "Rldf005mList")
    @FieldName("全戶個人記事")
    private List<Rldf005mType> rldf005mList;

    /**
     * Gets the apply1.
     * 
     * @return the apply1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * Sets the apply1.
     * 
     * @param apply1
     *            the new apply1
     */
    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * Gets the apply2.
     * 
     * @return the apply2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * Sets the apply2.
     * 
     * @param apply2
     *            the new apply2
     */
    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * Gets the delegated.
     * 
     * @return the delegated
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * Sets the delegated.
     * 
     * @param delegated
     *            the new delegated
     */
    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the household head name.
     * 
     * @return the household head name
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * Sets the household head name.
     * 
     * @param householdHeadName
     *            the new household head name
     */
    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Gets the xldf household data.
     * 
     * @return the xldf household data
     */
    public XLDFHouseholdDataDomainObject getXldfHouseholdData() {
        return xldfHouseholdData;
    }

    /**
     * Sets the xldf household data.
     * 
     * @param xldfHouseholdData
     *            the new xldf household data
     */
    public void setXldfHouseholdData(XLDFHouseholdDataDomainObject xldfHouseholdData) {
        this.xldfHouseholdData = xldfHouseholdData;
    }

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

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
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Gets the keeper id.
     * 
     * @return the keeper id
     */
    public String getKeeperId() {
        return keeperId;
    }

    /**
     * Sets the keeper id.
     * 
     * @param keeperId
     *            the new keeper id
     */
    public void setKeeperId(String keeperId) {
        this.keeperId = keeperId;
    }

    /**
     * Gets the keeper name.
     * 
     * @return the keeper name
     */
    public String getKeeperName() {
        return keeperName;
    }

    /**
     * Sets the keeper name.
     * 
     * @param keeperName
     *            the new keeper name
     */
    public void setKeeperName(String keeperName) {
        this.keeperName = keeperName;
    }

    /**
     * Gets the keeper.
     * 
     * @return the keeper
     */
    public String getKeeper() {
        return keeper;
    }

    /**
     * Sets the keeper.
     * 
     * @param keeper
     *            the new keeper
     */
    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }

    /**
     * Gets the delivery type.
     * 
     * @return the delivery type
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the delivery type.
     * 
     * @param deliveryType
     *            the new delivery type
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
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
    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the register code.
     * 
     * @return the register code
     */
    public String getRegisterCode() {
        return registerCode;
    }

    /**
     * Sets the register code.
     * 
     * @param registerCode
     *            the new register code
     */
    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
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
    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificates.
     * 
     * @return the certificates
     */
    public List<String> getCertificates() {
        return certificates;
    }

    /**
     * Sets the certificates.
     * 
     * @param certificates
     *            the new certificates
     */
    public void setCertificates(List<String> certificates) {
        this.certificates = certificates;
    }

    /**
     * Gets the apply count.
     * 
     * @return the apply count
     */
    public Integer getApplyCount() {
        return applyCount;
    }

    /**
     * Sets the apply count.
     * 
     * @param applyCount
     *            the new apply count
     */
    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

    /**
     * Gets the household list.
     * 
     * @return the household list
     */
    public List<Rl02510ApplyHouseholdDTO> getHouseholdList() {
        return householdList;
    }

    /**
     * Sets the household list.
     * 
     * @param householdList
     *            the new household list
     */
    public void setHouseholdList(List<Rl02510ApplyHouseholdDTO> householdList) {
        this.householdList = householdList;
    }

    /**
     * Gets the active index.
     * 
     * @return the active index
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * Sets the active index.
     * 
     * @param activeIndex
     *            the new active index
     */
    public void setActiveIndex(String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * Checks if is household selected all.
     * 
     * @return true, if is household selected all
     */
    public boolean isHouseholdSelectedAll() {
        return householdSelectedAll;
    }

    /**
     * Sets the household selected all.
     * 
     * @param householdSelectedAll
     *            the new household selected all
     */
    public void setHouseholdSelectedAll(boolean householdSelectedAll) {
        this.householdSelectedAll = householdSelectedAll;
    }

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public Integer getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * Sets the selected index.
     * 
     * @param selectedIndex
     *            the new selected index
     */
    public void setSelectedIndex(Integer selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    /**
     * Checks if is site id in same host.
     * 
     * @return true, if is site id in same host
     */
    public boolean isSiteIdInSameHost() {
        return isSiteIdInSameHost;
    }

    /**
     * Sets the site id in same host.
     * 
     * @param isSiteIdInSameHost
     *            the new site id in same host
     */
    public void setSiteIdInSameHost(boolean isSiteIdInSameHost) {
        this.isSiteIdInSameHost = isSiteIdInSameHost;
    }

    /**
     * Checks if is disable print household btn.
     * 
     * @return true, if is disable print household btn
     */
    public boolean isDisabledPrintHouseholdBtn() {
        return disabledPrintHouseholdBtn;
    }

    /**
     * Sets the disable print household btn.
     * 
     * @param disabledPrintHouseholdBtn
     *            the new disabled print household btn
     */
    public void setDisabledPrintHouseholdBtn(boolean disabledPrintHouseholdBtn) {
        this.disabledPrintHouseholdBtn = disabledPrintHouseholdBtn;
    }

    /**
     * Gets the sys date.
     * 
     * @return the sys date
     */
    public String getSysDate() {
        return sysDate;
    }

    /**
     * Sets the sys date.
     * 
     * @param sysDate
     *            the new sys date
     */
    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    /**
     * Gets the sys time.
     * 
     * @return the sys time
     */
    public String getSysTime() {
        return sysTime;
    }

    /**
     * Sets the sys time.
     * 
     * @param sysTime
     *            the new sys time
     */
    public void setSysTime(String sysTime) {
        this.sysTime = sysTime;
    }

    /**
     * Gets the fee price.
     * 
     * @return the fee price
     */
    public String getFeePrice() {
        return feePrice;
    }

    /**
     * Sets the fee price.
     * 
     * @param feePrice
     *            the new fee price
     */
    public void setFeePrice(String feePrice) {
        this.feePrice = feePrice;
    }

    /**
     * Gets the household serial no.
     * 
     * @return the household serial no
     */
    public String getHouseholdSerialNo() {
        return householdSerialNo;
    }

    /**
     * Sets the household serial no.
     * 
     * @param householdSerialNo
     *            the new household serial no
     */
    public void setHouseholdSerialNo(String householdSerialNo) {
        this.householdSerialNo = householdSerialNo;
    }

    /**
     * Gets the control no.
     * 
     * @return the control no
     */
    public String getControlNo() {
        return controlNo;
    }

    /**
     * Sets the control no.
     * 
     * @param controlNo
     *            the new control no
     */
    public void setControlNo(String controlNo) {
        this.controlNo = controlNo;
    }

    /**
     * Gets the seq no.
     * 
     * @return the seq no
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the seq no.
     * 
     * @param seqNo
     *            the new seq no
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
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
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
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
     * Gets the pdf url.
     * 
     * @return the pdf url
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * Sets the pdf url.
     * 
     * @param pdfUrl
     *            the new pdf url
     */
    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
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
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Checks if is disable save btn.
     * 
     * @return true, if is disable save btn
     */
    public boolean isDisableSaveBtn() {
        return disableSaveBtn;
    }

    /**
     * Sets the disable save btn.
     * 
     * @param disableSaveBtn
     *            the new disable save btn
     */
    public void setDisableSaveBtn(boolean disableSaveBtn) {
        this.disableSaveBtn = disableSaveBtn;
    }

    /**
     * Gets the change note list.
     * 
     * @return the change note list
     */
    public List<XLDFPersonNoteDomainObject> getChangeNoteList() {
        return changeNoteList;
    }

    /**
     * Sets the change note list.
     * 
     * @param changeNoteList
     *            the new change note list
     */
    public void setChangeNoteList(List<XLDFPersonNoteDomainObject> changeNoteList) {
        this.changeNoteList = changeNoteList;
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
    public void setCopies(String copies) {
        this.copies = copies;
    }

    /**
     * Gets the fee amount.
     * 
     * @return the fee amount
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the fee amount.
     * 
     * @param feeAmount
     *            the new fee amount
     */
    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Gets the free reason.
     * 
     * @return the free reason
     */
    public String getFreeReason() {
        return freeReason;
    }

    /**
     * Sets the free reason.
     * 
     * @param freeReason
     *            the new free reason
     */
    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
    }

    /**
     * Gets the other free reason.
     * 
     * @return the other free reason
     */
    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    /**
     * Sets the other free reason.
     * 
     * @param otherFreeReason
     *            the new other free reason
     */
    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    /**
     * Checks if is new control.
     * 
     * @return true, if is new control
     */
    public boolean isNewControl() {
        return isNewControl;
    }

    /**
     * Sets the new control.
     * 
     * @param isNewControl
     *            the new new control
     */
    public void setNewControl(boolean isNewControl) {
        this.isNewControl = isNewControl;
    }

    /**
     * Gets the xldf018d.
     * 
     * @return the xldf018d
     */
    public XLDF018D getXldf018d() {
        return xldf018d;
    }

    /**
     * Sets the xldf018d.
     * 
     * @param xldf018d
     *            the new xldf018d
     */
    public void setXldf018d(XLDF018D xldf018d) {
        this.xldf018d = xldf018d;
    }

    /**
     * Checks if is disable reprint btn.
     * 
     * @return true, if is disable reprint btn
     */
    public boolean isDisableReprintBtn() {
        return disableReprintBtn;
    }

    /**
     * Sets the disable reprint btn.
     * 
     * @param disableReprintBtn
     *            the new disable reprint btn
     */
    public void setDisableReprintBtn(boolean disableReprintBtn) {
        this.disableReprintBtn = disableReprintBtn;
    }

    /**
     * Checks if is disable household selected cbx.
     * 
     * @return true, if is disable household selected cbx
     */
    public boolean isDisableHouseholdSelectedCbx() {
        return disableHouseholdSelectedCbx;
    }

    /**
     * Sets the disable household selected cbx.
     * 
     * @param disableHouseholdSelectedCbx
     *            the new disable household selected cbx
     */
    public void setDisableHouseholdSelectedCbx(boolean disableHouseholdSelectedCbx) {
        this.disableHouseholdSelectedCbx = disableHouseholdSelectedCbx;
    }

    /**
     * Checks if is can apply household registration.
     * 
     * @return true, if is can apply household registration
     */
    public boolean isCanApplyHouseholdRegistration() {
        return CanApplyHouseholdRegistration;
    }

    /**
     * Sets the can apply household registration.
     * 
     * @param canApplyHouseholdRegistration
     *            the new can apply household registration
     */
    public void setCanApplyHouseholdRegistration(boolean canApplyHouseholdRegistration) {
        CanApplyHouseholdRegistration = canApplyHouseholdRegistration;
    }

    /**
     * Gets the violence list.
     * 
     * @return the violence list
     */
    public List<String> getViolenceList() {
        return violenceList;
    }

    /**
     * Sets the violence list.
     * 
     * @param violenceList
     *            the new violence list
     */
    public void setViolenceList(List<String> violenceList) {
        this.violenceList = violenceList;
    }

    /**
     * Gets the choice live person.
     * 
     * @return the choice live person
     */
    public String getChoiceLivePerson() {
        return choiceLivePerson;
    }

    /**
     * Sets the choice live person.
     * 
     * @param choiceLivePerson
     *            the new choice live person
     */
    public void setChoiceLivePerson(String choiceLivePerson) {
        this.choiceLivePerson = choiceLivePerson;
    }

    /**
     * Checks if is disabled choice print format.
     * 
     * @return true, if is disabled choice print format
     */
    public boolean isDisabledChoicePrintFormat() {
        return disabledChoicePrintFormat;
    }

    /**
     * Sets the disabled choice print format.
     * 
     * @param disabledChoicePrintFormat
     *            the new disabled choice print format
     */
    public void setDisabledChoicePrintFormat(boolean disabledChoicePrintFormat) {
        this.disabledChoicePrintFormat = disabledChoicePrintFormat;
    }

    /**
     * Gets the choice print format.
     * 
     * @return the choice print format
     */
    public String getChoicePrintFormat() {
        return choicePrintFormat;
    }

    /**
     * Sets the choice print format.
     * 
     * @param choicePrintFormat
     *            the new choice print format
     */
    public void setChoicePrintFormat(String choicePrintFormat) {
        this.choicePrintFormat = choicePrintFormat;
    }

    /**
     * Gets the before change note list.
     * 
     * @return the before change note list
     */
    public List<XLDFPersonNoteDomainObject> getBeforeChangeNoteList() {
        return beforeChangeNoteList;
    }

    /**
     * Sets the before change note list.
     * 
     * @param beforeChangeNoteList
     *            the new before change note list
     */
    public void setBeforeChangeNoteList(List<XLDFPersonNoteDomainObject> beforeChangeNoteList) {
        this.beforeChangeNoteList = beforeChangeNoteList;
    }

    /**
     * Gets the rl warning message list.
     * 
     * @return the rl warning message list
     */
    public List<RlWarningMessage> getRlWarningMessageList() {
        return rlWarningMessageList;
    }

    /**
     * Sets the rl warning message list.
     * 
     * @param rlWarningMessageList
     *            the new rl warning message list
     */
    public void setRlWarningMessageList(List<RlWarningMessage> rlWarningMessageList) {
        this.rlWarningMessageList = rlWarningMessageList;
    }

    /**
     * Checks if is disabled verify button.
     * 
     * @return true, if is disabled verify button
     */
    public boolean isDisabledVerifyButton() {
        return disabledVerifyButton;
    }

    /**
     * Sets the disabled verify button.
     * 
     * @param disabledVerifyButton
     *            the new disabled verify button
     */
    public void setDisabledVerifyButton(boolean disabledVerifyButton) {
        this.disabledVerifyButton = disabledVerifyButton;
    }

    /**
     * Gets the cover no.
     * 
     * @return the cover no
     */
    public String getCoverNo() {
        return coverNo;
    }

    /**
     * Sets the cover no.
     * 
     * @param coverNo
     *            the new cover no
     */
    public void setCoverNo(String coverNo) {
        this.coverNo = coverNo;
    }

    /**
     * Gets the cover no1.
     * 
     * @return the cover no1
     */
    public String getCoverNo1() {
        return coverNo1;
    }

    /**
     * Sets the cover no1.
     * 
     * @param coverNo1
     *            the new cover no1
     */
    public void setCoverNo1(String coverNo1) {
        this.coverNo1 = coverNo1;
    }

    /**
     * Gets the cover no2.
     * 
     * @return the cover no2
     */
    public String getCoverNo2() {
        return coverNo2;
    }

    /**
     * Sets the cover no2.
     * 
     * @param coverNo2
     *            the new cover no2
     */
    public void setCoverNo2(String coverNo2) {
        this.coverNo2 = coverNo2;
    }

    /**
     * Checks if is show birth father column.
     * 
     * @return true, if is show birth father column
     */
    public boolean isShowBirthFatherColumn() {
        return showBirthFatherColumn;
    }

    /**
     * Sets the show birth father column.
     * 
     * @param showBirthFatherColumn
     *            the new show birth father column
     */
    public void setShowBirthFatherColumn(boolean showBirthFatherColumn) {
        this.showBirthFatherColumn = showBirthFatherColumn;
    }

    /**
     * Checks if is show birth mother column.
     * 
     * @return true, if is show birth mother column
     */
    public boolean isShowBirthMotherColumn() {
        return showBirthMotherColumn;
    }

    /**
     * Sets the show birth mother column.
     * 
     * @param showBirthMotherColumn
     *            the new show birth mother column
     */
    public void setShowBirthMotherColumn(boolean showBirthMotherColumn) {
        this.showBirthMotherColumn = showBirthMotherColumn;
    }

    /**
     * Checks if is show choice print format column.
     * 
     * @return true, if is show choice print format column
     */
    public boolean isShowChoicePrintFormatColumn() {
        return showChoicePrintFormatColumn;
    }

    /**
     * Sets the show choice print format column.
     * 
     * @param showChoicePrintFormatColumn
     *            the new show choice print format column
     */
    public void setShowChoicePrintFormatColumn(boolean showChoicePrintFormatColumn) {
        this.showChoicePrintFormatColumn = showChoicePrintFormatColumn;
    }

    /**
     * Gets the prints the household note.
     * 
     * @return the prints the household note
     */
    public String getPrintHouseholdNote() {
        return printHouseholdNote;
    }

    /**
     * Sets the prints the household note.
     * 
     * @param printHouseholdNote
     *            the new prints the household note
     */
    public void setPrintHouseholdNote(String printHouseholdNote) {
        this.printHouseholdNote = printHouseholdNote;
    }

    /**
     * Gets the prints the relation id.
     * 
     * @return the prints the relation id
     */
    public String getPrintRelationId() {
        return printRelationId;
    }

    /**
     * Sets the prints the relation id.
     * 
     * @param printRelationId
     *            the new prints the relation id
     */
    public void setPrintRelationId(String printRelationId) {
        this.printRelationId = printRelationId;
    }

    /**
     * Gets the cover no list.
     * 
     * @return the cover no list
     */
    public List<String> getCoverNoList() {
        return coverNoList;
    }

    /**
     * Sets the cover no list.
     * 
     * @param coverNoList
     *            the new cover no list
     */
    public void setCoverNoList(List<String> coverNoList) {
        this.coverNoList = coverNoList;
    }

    /**
     * Gets the fee item.
     * 
     * @return the fee item
     */
    public String getFeeItem() {
        return feeItem;
    }

    /**
     * Sets the fee item.
     * 
     * @param feeItem
     *            the new fee item
     */
    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    /**
     * Gets the checks if is free.
     * 
     * @return the checks if is free
     */
    public String getIsFree() {
        return isFree;
    }

    /**
     * Sets the checks if is free.
     * 
     * @param isFree
     *            the new checks if is free
     */
    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public List<String> getViolenceSelectedList() {
        return violenceSelectedList;
    }

    public void setViolenceSelectedList(List<String> violenceSelectedList) {
        this.violenceSelectedList = violenceSelectedList;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public List<Rldf002mType> getRldf002mList() {
        return rldf002mList;
    }

    public void setRldf002mList(List<Rldf002mType> rldf002mList) {
        this.rldf002mList = rldf002mList;
    }

    public List<Rldf005mType> getRldf005mList() {
        return rldf005mList;
    }

    public void setRldf005mList(List<Rldf005mType> rldf005mList) {
        this.rldf005mList = rldf005mList;
    }

}

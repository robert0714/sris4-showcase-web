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
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl02h00AppDataDTO.Rl02h00ResultDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 姓名更改紀錄證明 Rl02e00DTO.
 * 
 * @author Dan.Tsai
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02h00DTO", propOrder = { "apply1", "apply2", "delegated", "openingOperationDTO", "enforceMode",
        "xldfefaplcType", "xldfPersonDataDomainObject", "xldfPersonDataDomainObjectByHousehold",
        "xldfHouseholdDataDomainObject", "xldf007mList", "appDataDTO", "xldf007mType", "registerFlag", "changeTitle" })
@XmlRootElement(name = "Rl02h00DTO")
public class Rl02h00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

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

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private transient XldfefaplcType xldfefaplcType;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonDataDomainObject")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonDataDomainObject;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfPersonDataDomainObjectByHousehold")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject xldfPersonDataDomainObjectByHousehold;

    /** 全戶資料. */
    @XmlElement(name = "XldfHouseholdDataDomainObject")
    @FieldName("全戶資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdDataDomainObject;

    /** 個人記事清單. */
    @XmlElement(name = "ResultList")
    @FieldName("個人記事清單")
    private List<Rl02h00ResultDTO> resultList = new ArrayList<Rl02h00ResultDTO>();

    /** 更正個人記事申請資料 DTO. */
    @XmlElement(name = "AppDataDto")
    @FieldName("更正個人記事申請資料 DTO")
    private Rl02h00AppDataDTO appDataDTO = new Rl02h00AppDataDTO();

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 規費

    /** 列印資料-單價. */
    @XmlElement(name = "Fee")
    @FieldName("列印單價")
    private String fee = "0";

    @XmlElement(name = "receiptId")
    @FieldName("收據號碼")
    private String receiptId;
    @XmlElement(name = "feeAmount")
    @FieldName("規費")
    private String feeAmount;
    @XmlElement(name = "freeReason")
    @FieldName("免收規費代碼")
    private String freeReason;
    @XmlElement(name = "otherFreeReason")
    @FieldName("免收規費原因")
    private String otherFreeReason;

    @XmlElement(name = "feeList")
    @FieldName("規費資料")
    private List<Rldfu001Type> feeList;
    @XmlElement(name = "feeSelect")
    @FieldName("規費選擇")
    private Rldfu001Type feeSelect;

    @XmlElement(name = "feeCode")
    @FieldName("規費選擇")
    private String feeCode;

    @XmlElement(name = "copies")
    @FieldName("份數")
    private String copies = "1";

    @XmlElement(name = "quantity")
    @FieldName("張數")
    private String quantity = "1";

    @XmlElement(name = "selectFree")
    @FieldName("是否免費")
    private String selectFree = "N";

    @XmlElement(name = "acceptSiteId")
    @FieldName("受理地代碼")
    private String acceptSiteId;

    // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    @XmlElement(name = "warningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /**
     * Gets the apply1.
     * 
     * @return the apply1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
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

    public List<Rldfu001Type> getFeeList() {
        return feeList;
    }

    public void setFeeList(List<Rldfu001Type> feeList) {
        this.feeList = feeList;
    }

    public Rldfu001Type getFeeSelect() {
        return feeSelect;
    }

    public void setFeeSelect(Rldfu001Type feeSelect) {
        this.feeSelect = feeSelect;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSelectFree() {
        return selectFree;
    }

    public void setSelectFree(String selectFree) {
        this.selectFree = selectFree;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
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
     * Gets the xldfefaplc type.
     * 
     * @return the xldfefaplc type
     */
    public XldfefaplcType getXldfefaplcType() {
        return xldfefaplcType;
    }

    /**
     * Sets the xldfefaplc type.
     * 
     * @param xldfefaplcType
     *            the new xldfefaplc type
     */
    public void setXldfefaplcType(XldfefaplcType xldfefaplcType) {
        this.xldfefaplcType = xldfefaplcType;
    }

    /**
     * Gets the xldf person data domain object.
     * 
     * @return the xldf person data domain object
     */
    public XLDFPersonDataDomainObject getXldfPersonDataDomainObject() {
        return xldfPersonDataDomainObject;
    }

    /**
     * Sets the xldf person data domain object.
     * 
     * @param xldfPersonDataDomainObject
     *            the new xldf person data domain object
     */
    public void setXldfPersonDataDomainObject(XLDFPersonDataDomainObject xldfPersonDataDomainObject) {
        this.xldfPersonDataDomainObject = xldfPersonDataDomainObject;
    }

    /**
     * Gets the xldf person data domain object by household.
     * 
     * @return the xldf person data domain object by household
     */
    public XLDFPersonDataDomainObject getXldfPersonDataDomainObjectByHousehold() {
        return xldfPersonDataDomainObjectByHousehold;
    }

    /**
     * Sets the xldf person data domain object by household.
     * 
     * @param xldfPersonDataDomainObjectByHousehold
     *            the new xldf person data domain object by household
     */
    public void setXldfPersonDataDomainObjectByHousehold(
            XLDFPersonDataDomainObject xldfPersonDataDomainObjectByHousehold) {
        this.xldfPersonDataDomainObjectByHousehold = xldfPersonDataDomainObjectByHousehold;
    }

    /**
     * Gets the xldf household data domain object.
     * 
     * @return the xldf household data domain object
     */
    public XLDFHouseholdDataDomainObject getXldfHouseholdDataDomainObject() {
        return xldfHouseholdDataDomainObject;
    }

    /**
     * Sets the xldf household data domain object.
     * 
     * @param xldfHouseholdDataDomainObject
     *            the new xldf household data domain object
     */
    public void setXldfHouseholdDataDomainObject(XLDFHouseholdDataDomainObject xldfHouseholdDataDomainObject) {
        this.xldfHouseholdDataDomainObject = xldfHouseholdDataDomainObject;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public List<Rl02h00ResultDTO> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rl02h00ResultDTO> resultList) {
        this.resultList = resultList;
    }

    public Rl02h00AppDataDTO getAppDataDTO() {
        return appDataDTO;
    }

    public void setAppDataDTO(Rl02h00AppDataDTO appDataDTO) {
        this.appDataDTO = appDataDTO;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

}

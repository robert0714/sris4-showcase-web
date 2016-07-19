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
import tw.gov.moi.domain.Rldf001eType;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.util.DateUtil;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01520DTO", propOrder = { "personData", "houseData", "holdData", "sealNumber", "sealApplYYYMMDD",
        "certificateList", "otherCertificate", "SealReason", "registerContent", "fee", "apply1",
        "apply1_relatioinship", "apply2", "apply2_relatioinship", "delegated", "systemDate", "systemTime",
        "openingOperationDTO", "warningMessgeList", "crossSiteEnabled", "rldf001e", "acceptSiteId" })
@XmlRootElement(name = "Rl01520DTO")
public class Rl01520DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonData", required = true)
    @FieldName("當事人-個人基本資料")
    private XLDFPersonDataDomainObject personData;

    @XmlElement(name = "HouseData", required = true)
    @FieldName("當事人-全戶基本資料")
    private XLDFHouseholdDataDomainObject houseData;

    @XmlElement(name = "HoldData", required = true)
    @FieldName("戶長-個人基本資料")
    private XLDFPersonDataDomainObject holdData;

    @XmlElement(name = "SealNumber", required = true)
    @FieldName("印登字號")
    private String sealNumber;

    @XmlElement(name = "SealApplYYYMMDD", required = true)
    @FieldName("印登日期")
    private String sealApplYYYMMDD;

    @XmlElement(name = "CertificateList", required = true)
    @FieldName("附繳證件")
    private List certificateList = new ArrayList();

    @XmlElement(name = "OtherCertificate", required = true)
    @FieldName("附繳證件-其他")
    private String otherCertificate;

    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("備註")
    private String registerContent;

    /** 變更原因. */
    @XmlElement(name = "SealReason", required = true)
    @FieldName("變更原因")
    private String sealReason;

    @XmlElement(name = "Fee", required = true)
    @FieldName("規費")
    private String fee;

    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1;

    @XmlElement(name = "Apply1_Relatioinship", required = true)
    @FieldName("申請人1-與當事人關係")
    private String apply1_relatioinship;

    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2;

    @XmlElement(name = "Apply2_Relatioinship", required = true)
    @FieldName("申請人2-與當事人關係")
    private String apply2_relatioinship;

    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated;

    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    @XmlElement(name = "Rldf001e", required = true)
    @FieldName("號碼控制檔")
    private Rldf001eType rldf001e;

    /** 列印資料-法定代理人統號1. */
    @XmlElement(name = "CommId1")
    @FieldName("列印法定代理人統號1")
    private String commId1;
    /** 列印資料-法定代理人姓名1. */
    @XmlElement(name = "CommName1")
    @FieldName("列印法定代理人姓名1")
    private String commName1;

    /** 列印資料-法定代理人統號2. */
    @XmlElement(name = "CommId2")
    @FieldName("列印法定代理人統號2")
    private String commId2;
    /** 列印資料-法定代理人姓名2. */
    @XmlElement(name = "CommName2")
    @FieldName("列印法定代理人姓名2")
    private String commName2;
    
    
  //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 規費
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
    
    @XmlElement(name = "selectFree")
    @FieldName("是否免費")
    private String selectFree = "N";
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    
    @XmlElement(name = "cancelAgent1")
    @FieldName("取消法定代理人1")
    private boolean cancelAgent1;
    
    @XmlElement(name = "cancelAgent2")
    @FieldName("取消法定代理人2")
    private boolean cancelAgent2;
    
    @XmlElement(name = "acceptSiteId")
    @FieldName("受理地代碼")
    private String acceptSiteId;
    
    public String getCopies() {
        return copies;
    }

    public void setCopies(String copies) {
        this.copies = copies;
    }

    public boolean isCancelAgent1() {
        return cancelAgent1;
    }

    public void setCancelAgent1(boolean cancelAgent1) {
        this.cancelAgent1 = cancelAgent1;
    }

    public boolean isCancelAgent2() {
        return cancelAgent2;
    }

    public void setCancelAgent2(boolean cancelAgent2) {
        this.cancelAgent2 = cancelAgent2;
    }
    
    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public List<Rldfu001Type> getFeeList() {
        return feeList;
    }

    public Rldfu001Type getFeeSelect() {
        return feeSelect;
    }

    public void setFeeSelect(Rldfu001Type feeSelect) {
        this.feeSelect = feeSelect;
    }

    public void setFeeList(List<Rldfu001Type> feeList) {
        this.feeList = feeList;
    }
    

    public String getCommId1() {
        return commId1;
    }

    public void setCommId1(String commId1) {
        this.commId1 = commId1;
    }

    public String getCommName1() {
        return commName1;
    }

    public void setCommName1(String commName1) {
        this.commName1 = commName1;
    }

    public String getCommId2() {
        return commId2;
    }

    public void setCommId2(String commId2) {
        this.commId2 = commId2;
    }

    public String getCommName2() {
        return commName2;
    }

    public void setCommName2(String commName2) {
        this.commName2 = commName2;
    }

    /** 交易順序 */
    public int getOpertionSequenceID() {

        return Integer.valueOf(this.openingOperationDTO.getOperationSequenceId());
    }

    /** 民國年月日 */
    public String getSystemDate() {

        return DateUtil.getNowRisDate().getRocDate();

    }

    /** 現在時間 */
    public String getSystemTime() {
        return DateUtil.getNowRisDate().getRocTime();
    }

    public XLDFHouseholdDataDomainObject getHouseData() {
        return houseData;
    }

    public void setHouseData(XLDFHouseholdDataDomainObject houseData) {
        this.houseData = houseData;
    }

    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    public XLDFPersonDataDomainObject getHoldData() {
        return holdData;
    }

    public void setHoldData(XLDFPersonDataDomainObject holdData) {
        this.holdData = holdData;
    }

    public String getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public String getSealApplYYYMMDD() {
        return sealApplYYYMMDD;
    }

    public void setSealApplYYYMMDD(String sealApplYYYMMDD) {
        this.sealApplYYYMMDD = sealApplYYYMMDD;
    }

    public List getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * @return the sealReason
     */
    public String getSealReason() {
        return sealReason;
    }

    /**
     * @param sealReason
     *            the sealReason to set
     */
    public void setSealReason(String sealReason) {
        this.sealReason = sealReason;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public String getApply1_relatioinship() {
        return apply1_relatioinship;
    }

    public void setApply1_relatioinship(String apply1_relatioinship) {
        this.apply1_relatioinship = apply1_relatioinship;
    }

    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    public String getApply2_relatioinship() {
        return apply2_relatioinship;
    }

    public void setApply2_relatioinship(String apply2_relatioinship) {
        this.apply2_relatioinship = apply2_relatioinship;
    }

    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    public void setCrossSiteEnabled(boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    public void setSystemDate(String systemDate) {
        this.systemDate = systemDate;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public Rldf001eType getRldf001e() {
        return rldf001e;
    }

    public void setRldf001e(Rldf001eType rldf001e) {
        this.rldf001e = rldf001e;
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

	@Override
    public String toString() {
        return "Rl01520DTO [personData=" + personData + ", houseData=" + houseData + ", holdData=" + holdData
                + ", sealNumber=" + sealNumber + ", sealApplYYYMMDD=" + sealApplYYYMMDD + ", certificateList="
                + certificateList + ", otherCertificate=" + otherCertificate + ", registerContent=" + registerContent
                + ", fee=" + fee + ", apply1=" + apply1 + ", apply1_relatioinship=" + apply1_relatioinship
                + ", apply2=" + apply2 + ", apply2_relatioinship=" + apply2_relatioinship + ", delegated=" + delegated
                + ", systemDate=" + systemDate + ", systemTime=" + systemTime + ", openingOperationDTO="
                + openingOperationDTO + ", warningMessgeList=" + warningMessgeList + ", crossSiteEnabled="
                + crossSiteEnabled + "]";
    }

}

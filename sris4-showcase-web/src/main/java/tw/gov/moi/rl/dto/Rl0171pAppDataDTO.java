package tw.gov.moi.rl.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;

public class Rl0171pAppDataDTO {

    private String registerDate; // 登記日期
    private String registerTime; // 登記時間
    private String acceptAdminOfficeCode; // 受理地戶所代碼
    private String beforeHouseholdId; // 原戶號
    private String afterHouseholdId; // 更正戶號
    private String updateYyymmdd; // 更正日期
    private String updateReasonCode; // 更正原因代碼
    private String updateReason; // 更正原因
    private String otherUpdateReason; // 其他更正原因
    private String certificate1; // 附繳證件1
    private String certificate1Name; // 附繳證件1名稱
    private String certificate2; // 附繳證件2
    private String certificate2Name; // 附繳證件2名稱
    private String certificate3; // 附繳證件3
    private String certificate3Name; // 附繳證件3名稱
    private String certificate4; // 附繳證件4
    private String certificate4Name; // 附繳證件4名稱
    private String certificate5; // 附繳證件5
    private String certificate5Name; // 附繳證件5名稱
    private String certificate6; // 附繳證件6
    private String certificate6Name; // 附繳證件6名稱
    private String certificate7; // 附繳證件7
    private String otherCertificate; // 其他附繳證件
    private String enforcedFlag; // 逕為登記旗標
    private String registerContent; // 備註
    private String needFineFlag; // 須進行罰鍰處理
    private String fineOverdueruleMark; // 戶籍罰鍰條款註記
    private String fineMoney; // 戶籍罰鍰金鍰
    private String acceptRegistrarName; // 受理地戶籍員姓名
    private String receiptId; // 收據號碼
    private boolean personForeignFlag; // 當事人統號是否為外籍者
    private boolean householdHeadFlag; // 當事人是否為戶長旗標

    private XldfefaplcType xldfefaplcType;// 逕為登記旗標物件

    /** 戶號配賦方式. */
    @XmlElement(name = "HouseholdIdAssignType")
    @FieldName("戶號配賦方式")
    private String householdIdAssignType = "1";

    public XldfefaplcType getXldfefaplcType() {
        return xldfefaplcType;
    }

    public void setXldfefaplcType(XldfefaplcType xldfefaplcType) {
        this.xldfefaplcType = xldfefaplcType;
    }

    private List<String> attachDocs = new ArrayList<String>();// 附繳證件

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getBeforeHouseholdId() {
        return beforeHouseholdId;
    }

    public void setBeforeHouseholdId(String beforeHouseholdId) {
        this.beforeHouseholdId = beforeHouseholdId;
    }

    public String getAfterHouseholdId() {
        return afterHouseholdId;
    }

    public void setAfterHouseholdId(String afterHouseholdId) {
        this.afterHouseholdId = afterHouseholdId;
    }

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    public void setOtherUpdateReason(String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    public String getCertificate1() {
        return certificate1;
    }

    public void setCertificate1(String certificate1) {
        this.certificate1 = certificate1;
    }

    public String getCertificate1Name() {
        return certificate1Name;
    }

    public void setCertificate1Name(String certificate1Name) {
        this.certificate1Name = certificate1Name;
    }

    public String getCertificate2() {
        return certificate2;
    }

    public void setCertificate2(String certificate2) {
        this.certificate2 = certificate2;
    }

    public String getCertificate2Name() {
        return certificate2Name;
    }

    public void setCertificate2Name(String certificate2Name) {
        this.certificate2Name = certificate2Name;
    }

    public String getCertificate3() {
        return certificate3;
    }

    public void setCertificate3(String certificate3) {
        this.certificate3 = certificate3;
    }

    public String getCertificate3Name() {
        return certificate3Name;
    }

    public void setCertificate3Name(String certificate3Name) {
        this.certificate3Name = certificate3Name;
    }

    public String getCertificate4() {
        return certificate4;
    }

    public void setCertificate4(String certificate4) {
        this.certificate4 = certificate4;
    }

    public String getCertificate4Name() {
        return certificate4Name;
    }

    public void setCertificate4Name(String certificate4Name) {
        this.certificate4Name = certificate4Name;
    }

    public String getCertificate5() {
        return certificate5;
    }

    public void setCertificate5(String certificate5) {
        this.certificate5 = certificate5;
    }

    public String getCertificate5Name() {
        return certificate5Name;
    }

    public void setCertificate5Name(String certificate5Name) {
        this.certificate5Name = certificate5Name;
    }

    public String getCertificate6() {
        return certificate6;
    }

    public void setCertificate6(String certificate6) {
        this.certificate6 = certificate6;
    }

    public String getCertificate6Name() {
        return certificate6Name;
    }

    public void setCertificate6Name(String certificate6Name) {
        this.certificate6Name = certificate6Name;
    }

    public String getCertificate7() {
        return certificate7;
    }

    public void setCertificate7(String certificate7) {
        this.certificate7 = certificate7;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getFineOverdueruleMark() {
        return fineOverdueruleMark;
    }

    public void setFineOverdueruleMark(String fineOverdueruleMark) {
        this.fineOverdueruleMark = fineOverdueruleMark;
    }

    public String getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(String fineMoney) {
        this.fineMoney = fineMoney;
    }

    public String getAcceptRegistrarName() {
        return acceptRegistrarName;
    }

    public void setAcceptRegistrarName(String acceptRegistrarName) {
        this.acceptRegistrarName = acceptRegistrarName;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public boolean isPersonForeignFlag() {
        return personForeignFlag;
    }

    public void setPersonForeignFlag(boolean personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    public boolean isHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setHouseholdHeadFlag(boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public List<String> getAttachDocs() {
        return attachDocs;
    }

    public void setAttachDocs(List<String> attachDocs) {
        this.attachDocs = attachDocs;
    }

    public String getHouseholdIdAssignType() {
        return householdIdAssignType;
    }

    public void setHouseholdIdAssignType(String householdIdAssignType) {
        this.householdIdAssignType = householdIdAssignType;
    }
}

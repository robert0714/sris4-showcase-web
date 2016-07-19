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
import tw.gov.moi.domain.Rldfm03mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0172nAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "enforcedFlag", "orgEducationMark", "afterPersonId", "orgAfterPersonId", "updateType", "updateReasonCode",
        "reAssignReasonCode", "recoverReasonCode", "tempAssignReasonCode", "cancelTempAssignReasonCode",
        "otherUpdateReason", "updateYyymmdd", "certificateList", "otherCertificateFlag", "otherCertificate",
        "bookFlag", "householdHeadFlag", "personForeignFlag", "registerContent", "doFineCheckFlag", "fineEventDate",
        "needFineFlag", "fineFreeFlag", "removeFeeReason", "receiptId", "restoreIdList", "removeflag", "removeYear",
        "removeMonth", "removeDay", "removeHour", "removeMinute", "removeSecond", "removeSiteId", "outliveCaseFlag",
        "birthOrderSex", "assignNewMaleId", "assignNewFemaleId", "assignWay" })
@XmlRootElement(name = "Rl0172nAppDataDTO")
public class Rl0172nAppDataDTO implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = -6605953489202988790L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 受理地戶所代碼 */
    @FieldName("受理地戶所代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 新統一編號 */
    @FieldName("新統一編號")
    @XmlElement(name = "AfterPersonId", required = false)
    private String afterPersonId;

    /** 原配賦新統一編號 */
    @FieldName("原配賦新統一編號")
    @XmlElement(name = "OrgAfterPersonId", required = false)
    private String orgAfterPersonId;

    /** 變更類別 */
    @FieldName("變更類別")
    @XmlElement(name = "UpdateType", required = false)
    private String updateType;

    /** 變更原因代碼 */
    @FieldName("變更原因代碼")
    @XmlElement(name = "UpdateReasonCode", required = false)
    private String updateReasonCode;

    /** 重配原因代碼 */
    @FieldName("重配原因代碼")
    @XmlElement(name = "ReAssignReasonCode", required = false)
    private String reAssignReasonCode;

    /** 回復原因代碼 */
    @FieldName("回復原因代碼")
    @XmlElement(name = "RecoverReasonCode", required = false)
    private String recoverReasonCode;

    /** 暫配原因代碼 */
    @FieldName("暫配原因代碼")
    @XmlElement(name = "TempAssignReasonCode", required = false)
    private String tempAssignReasonCode;

    /** 撤銷暫配原因代碼 */
    @FieldName("撤銷暫配原因代碼")
    @XmlElement(name = "CancelTempAssignReasonCode", required = false)
    private String cancelTempAssignReasonCode;

    /** 其他更正原因 */
    @FieldName("其他更正原因")
    @XmlElement(name = "OtherUpdateReason", required = false)
    private String otherUpdateReason;

    /** 變更日期 */
    @FieldName("變更日期")
    @XmlElement(name = "UpdateYyymmdd", required = false)
    private String updateYyymmdd;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OtherCertificate", required = false)
    private String otherCertificate;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 當事人是否為戶長旗標 */
    @FieldName("當事人是否為戶長旗標")
    @XmlElement(name = "HouseholdHeadFlag", required = false)
    private Boolean householdHeadFlag;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "PersonForeignFlag", required = false)
    private Boolean personForeignFlag;

    /** 申請書備註 */
    @FieldName("申請書備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 進行逾期申報之罰鍰檢視 */
    @FieldName("進行逾期申報之罰鍰檢視")
    @XmlElement(name = "DoFineCheckFlag", required = false)
    private String doFineCheckFlag;

    /** 判斷罰鍰之事件發生(確定)日期 */
    @FieldName("判斷罰鍰之事件發生(確定)日期")
    @XmlElement(name = "FineEventDate", required = false)
    private String fineEventDate;

    /** 判斷是否罰鍰旗標 */
    @FieldName("判斷是否罰鍰旗標")
    @XmlElement(name = "NeedFineFlag", required = false)
    private String needFineFlag;

    /** 免罰旗標 */
    @FieldName("免罰旗標")
    @XmlElement(name = "FineFreeFlag", required = false)
    private String fineFreeFlag;

    /** 免罰原因 */
    @FieldName("免罰原因")
    @XmlElement(name = "RemoveFeeReason", required = false)
    private String removeFeeReason;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

    /** 回復統號 */
    @FieldName("回復統號")
    @XmlElement(name = "RestoreIdList", required = false)
    private List<Rldfm03mType> restoreIdList;

    /** 補填除戶簿頁記事 */
    @FieldName("補填除戶簿頁記事")
    @XmlElement(name = "Removeflag", required = false)
    private String removeflag;

    /** 除戶日期-年 */
    @FieldName("除戶日期-年")
    @XmlElement(name = "RemoveYear", required = false)
    private String removeYear;

    /** 除戶日期-年 */
    @FieldName("除戶日期-月")
    @XmlElement(name = "RemoveMonth", required = false)
    private String removeMonth;

    /** 除戶日期-年 */
    @FieldName("除戶日期-日")
    @XmlElement(name = "RemoveDay", required = false)
    private String removeDay;

    /** 除戶時間-時 */
    @FieldName("除戶時間-時")
    @XmlElement(name = "RemoveHour", required = false)
    private String removeHour;

    /** 除戶時間-分 */
    @FieldName("除戶時間-分")
    @XmlElement(name = "RemoveMinute", required = false)
    private String removeMinute;

    /** 除戶時間-秒 */
    @FieldName("除戶時間-秒")
    @XmlElement(name = "RemoveSecond", required = false)
    private String removeSecond;

    /** 除戶作業點代碼 */
    @FieldName("除戶作業點代碼")
    @XmlElement(name = "RemoveSiteId", required = false)
    private String removeSiteId;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "outliveCaseFlag", required = false)
    private String outliveCaseFlag;

    /** 出生別代碼 */
    @FieldName("出生別代碼")
    @XmlElement(name = "BirthOrderSex", required = false)
    private String birthOrderSex;

    /** 配賦之男性統號 */
    @FieldName("配賦之男性統號")
    @XmlElement(name = "AssignNewMaleId", required = false)
    private String assignNewMaleId;

    /** 配賦之女性統號 */
    @FieldName("配賦之女性統號")
    @XmlElement(name = "AssignNewFemaleId", required = false)
    private String assignNewFemaleId;

    /** 統號配賦方式 */
    @FieldName("統號配賦方式")
    @XmlElement(name = "AssignWay", required = false)
    private String assignWay;

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

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getAfterPersonId() {
        return afterPersonId;
    }

    public void setAfterPersonId(String afterPersonId) {
        this.afterPersonId = afterPersonId;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    public void setOtherUpdateReason(String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    public String getRecoverReasonCode() {
        return recoverReasonCode;
    }

    public void setRecoverReasonCode(String recoverReasonCode) {
        this.recoverReasonCode = recoverReasonCode;
    }

    public String getCancelTempAssignReasonCode() {
        return cancelTempAssignReasonCode;
    }

    public void setCancelTempAssignReasonCode(String cancelTempAssignReasonCode) {
        this.cancelTempAssignReasonCode = cancelTempAssignReasonCode;
    }

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public Boolean getHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setHouseholdHeadFlag(Boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public Boolean getPersonForeignFlag() {
        return personForeignFlag;
    }

    public void setPersonForeignFlag(Boolean personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
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

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getReAssignReasonCode() {
        return reAssignReasonCode;
    }

    public void setReAssignReasonCode(String reAssignReasonCode) {
        this.reAssignReasonCode = reAssignReasonCode;
    }

    public String getTempAssignReasonCode() {
        return tempAssignReasonCode;
    }

    public void setTempAssignReasonCode(String tempAssignReasonCode) {
        this.tempAssignReasonCode = tempAssignReasonCode;
    }

    public String getDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    public void setDoFineCheckFlag(String doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    public String getFineEventDate() {
        return fineEventDate;
    }

    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    public String getFineFreeFlag() {
        return fineFreeFlag;
    }

    public void setFineFreeFlag(String fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public List<Rldfm03mType> getRestoreIdList() {
        return restoreIdList;
    }

    public void setRestoreIdList(List<Rldfm03mType> restoreIdList) {
        this.restoreIdList = restoreIdList;
    }

    public String getRemoveflag() {
        return removeflag;
    }

    public void setRemoveflag(String removeflag) {
        this.removeflag = removeflag;
    }

    public String getRemoveYear() {
        return removeYear;
    }

    public void setRemoveYear(String removeYear) {
        this.removeYear = removeYear;
    }

    public String getRemoveMonth() {
        return removeMonth;
    }

    public void setRemoveMonth(String removeMonth) {
        this.removeMonth = removeMonth;
    }

    public String getRemoveDay() {
        return removeDay;
    }

    public void setRemoveDay(String removeDay) {
        this.removeDay = removeDay;
    }

    public String getRemoveHour() {
        return removeHour;
    }

    public void setRemoveHour(String removeHour) {
        this.removeHour = removeHour;
    }

    public String getRemoveMinute() {
        return removeMinute;
    }

    public void setRemoveMinute(String removeMinute) {
        this.removeMinute = removeMinute;
    }

    public String getRemoveSecond() {
        return removeSecond;
    }

    public void setRemoveSecond(String removeSecond) {
        this.removeSecond = removeSecond;
    }

    public String getRemoveSiteId() {
        return removeSiteId;
    }

    public void setRemoveSiteId(String removeSiteId) {
        this.removeSiteId = removeSiteId;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    public String getAssignNewMaleId() {
        return assignNewMaleId;
    }

    public void setAssignNewMaleId(String assignNewMaleId) {
        this.assignNewMaleId = assignNewMaleId;
    }

    public String getAssignNewFemaleId() {
        return assignNewFemaleId;
    }

    public void setAssignNewFemaleId(String assignNewFemaleId) {
        this.assignNewFemaleId = assignNewFemaleId;
    }

    public boolean isOtherCertificateFlag() {
        return otherCertificateFlag;
    }

    public void setOtherCertificateFlag(boolean otherCertificateFlag) {
        this.otherCertificateFlag = otherCertificateFlag;
    }

    public String getAssignWay() {
        return assignWay;
    }

    public void setAssignWay(String assignWay) {
        this.assignWay = assignWay;
    }

    public String getOrgAfterPersonId() {
        return orgAfterPersonId;
    }

    public void setOrgAfterPersonId(String orgAfterPersonId) {
        this.orgAfterPersonId = orgAfterPersonId;
    }

}

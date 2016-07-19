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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01824AppDataDTO", propOrder = { "registerDate", "registerTime", "applyDate",
        "acceptAdminOfficeCode", "registerContent", "needFineFlag", "fineFreeFlag", "removeFeeReason", "enforcedFlag",
        "orgEducationMark", "beforeWork", "revokeItem", "updateDate", "afterPersonName", "afterLastName",
        "afterFirstName", "afterMidenName", "afterMarriedName", "revokeReasonCode", "otherRevokeReason",
        "revokeYyymmdd", "lawCode", "eventDate", "certificateList", "certificate_1", "certificate_2", "certificate_3",
        "certificate_4", "certificate_5", "certificate_6", "certificate_7", "certificate_8", "certificate_9",
        "certificate_10", "otherCertificate", "doFineCheckFlag", "bookFlag", "householdHeadFlag", "personForeignFlag",
        "beforePersonName", "beforeLastName", "beforeFirstName", "beforeMidenName", "beforeMarriedName",
        "outliveCaseFlag" })
@XmlRootElement(name = "Rl01824AppDataDTO")
public class Rl01824AppDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1442634348672263238L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "registerDate", required = false)
    private String registerDate;
    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "registerTime", required = false)
    private String registerTime;
    /** 申請日期 */
    @FieldName("申請日期")
    @XmlElement(name = "applyDate", required = false)
    private String applyDate;
    /** 受理地作業點代碼 */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "acceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;
    /** 申請書備註 */
    @FieldName("申請書備註")
    @XmlElement(name = "registerContent", required = false)
    private String registerContent;
    /** 判斷是否罰鍰旗標 */
    @FieldName("判斷是否罰鍰旗標")
    @XmlElement(name = "needFineFlag", required = false)
    private String needFineFlag;
    /** 免罰旗標 */
    @FieldName("免罰旗標")
    @XmlElement(name = "fineFreeFlag", required = false)
    private String fineFreeFlag;
    /** 免罰原因 */
    @FieldName("免罰原因")
    @XmlElement(name = "removeFeeReason", required = false)
    private String removeFeeReason;
    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "enforcedFlag", required = false)
    private String enforcedFlag;
    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "orgEducationMark", required = false)
    private String orgEducationMark;
    /** 原登記事項 */
    @FieldName("原登記事項")
    @XmlElement(name = "beforeWork", required = false)
    private String beforeWork;
    /** 撤銷事項 */
    @FieldName("撤銷事項")
    @XmlElement(name = "revokeItem", required = false)
    private String revokeItem;
    /** 冠姓日期 */
    @FieldName("冠姓日期")
    @XmlElement(name = "updateDate", required = false)
    private String updateDate;
    /** 撤銷後姓名 */
    @FieldName("撤銷後姓名")
    @XmlElement(name = "afterPersonName", required = false)
    private String afterPersonName;
    /** 撤銷後姓 */
    @FieldName("撤銷後姓")
    @XmlElement(name = "afterLastName", required = false)
    private String afterLastName;
    /** 撤銷後名 */
    @FieldName("撤銷後名")
    @XmlElement(name = "afterFirstName", required = false)
    private String afterFirstName;
    /** 撤銷後本姓 */
    @FieldName("撤銷後本姓")
    @XmlElement(name = "afterMidenName", required = false)
    private String afterMidenName;
    /** 撤銷後冠姓 */
    @FieldName("撤銷後冠姓")
    @XmlElement(name = "afterMarriedName", required = false)
    private String afterMarriedName;
    /** 撤銷原因代碼 */
    @FieldName("撤銷原因代碼")
    @XmlElement(name = "revokeReasonCode", required = false)
    private String revokeReasonCode;
    /** 其他撤銷原因 */
    @FieldName("其他撤銷原因")
    @XmlElement(name = "otherRevokeReason", required = false)
    private String otherRevokeReason;
    /** 撤銷日期 */
    @FieldName("撤銷日期")
    @XmlElement(name = "revokeYyymmdd", required = false)
    private String revokeYyymmdd;
    /** 引用法條代碼 */
    @FieldName("引用法條代碼")
    @XmlElement(name = "lawCode", required = false)
    private String lawCode;
    /** 事件發生（確定）日期 */
    @FieldName("事件發生（確定）日期")
    @XmlElement(name = "eventDate", required = false)
    private String eventDate;
    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "certificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();
    /** 附繳證件1 */
    @FieldName("附繳證件1")
    @XmlElement(name = "certificate_1", required = false)
    private String certificate_1;
    /** 附繳證件2 */
    @FieldName("附繳證件2")
    @XmlElement(name = "certificate_2", required = false)
    private String certificate_2;
    /** 附繳證件3 */
    @FieldName("附繳證件3")
    @XmlElement(name = "certificate_3", required = false)
    private String certificate_3;
    /** 附繳證件4 */
    @FieldName("附繳證件4")
    @XmlElement(name = "certificate_4", required = false)
    private String certificate_4;
    /** 附繳證件5 */
    @FieldName("附繳證件5")
    @XmlElement(name = "certificate_5", required = false)
    private String certificate_5;
    /** 附繳證件6 */
    @FieldName("附繳證件6")
    @XmlElement(name = "certificate_6", required = false)
    private String certificate_6;
    /** 附繳證件7 */
    @FieldName("附繳證件7")
    @XmlElement(name = "certificate_7", required = false)
    private String certificate_7;
    /** 附繳證件8 */
    @FieldName("附繳證件8")
    @XmlElement(name = "certificate_8", required = false)
    private String certificate_8;
    /** 附繳證件9 */
    @FieldName("附繳證件9")
    @XmlElement(name = "certificate_9", required = false)
    private String certificate_9;
    /** 附繳證件10 */
    @FieldName("附繳證件10")
    @XmlElement(name = "certificate_10", required = false)
    private String certificate_10;
    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "otherCertificate", required = false)
    private String otherCertificate;
    /** 進行逾期申報之罰鍰檢視 */
    @FieldName("進行逾期申報之罰鍰檢視")
    @XmlElement(name = "doFineCheckFlag", required = false)
    private String doFineCheckFlag;
    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "bookFlag", required = false)
    private String bookFlag;
    /** 當事人是否為戶長旗標 */
    @FieldName("當事人是否為戶長旗標")
    @XmlElement(name = "householdHeadFlag", required = false)
    private Boolean householdHeadFlag;
    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "personForeignFlag", required = false)
    private Boolean personForeignFlag;
    /** 原姓名 */
    @FieldName("原姓名")
    @XmlElement(name = "beforePersonName", required = false)
    private String beforePersonName;
    /** 原姓 */
    @FieldName("原姓")
    @XmlElement(name = "beforeLastName", required = false)
    private String beforeLastName;
    /** 原名 */
    @FieldName("原名")
    @XmlElement(name = "beforeFirstName", required = false)
    private String beforeFirstName;
    /** 原本姓 */
    @FieldName("原本姓")
    @XmlElement(name = "beforeMidenName", required = false)
    private String beforeMidenName;
    /** 原冠姓 */
    @FieldName("原冠姓")
    @XmlElement(name = "beforeMarriedName", required = false)
    private String beforeMarriedName;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "outliveCaseFlag", required = false)
    private String outliveCaseFlag;

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

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
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

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getBeforeWork() {
        return beforeWork;
    }

    public void setBeforeWork(String beforeWork) {
        this.beforeWork = beforeWork;
    }

    public String getRevokeItem() {
        return revokeItem;
    }

    public void setRevokeItem(String revokeItem) {
        this.revokeItem = revokeItem;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getAfterPersonName() {
        return afterPersonName;
    }

    public void setAfterPersonName(String afterPersonName) {
        this.afterPersonName = afterPersonName;
    }

    public String getAfterLastName() {
        return afterLastName;
    }

    public void setAfterLastName(String afterLastName) {
        this.afterLastName = afterLastName;
    }

    public String getAfterFirstName() {
        return afterFirstName;
    }

    public void setAfterFirstName(String afterFirstName) {
        this.afterFirstName = afterFirstName;
    }

    public String getAfterMidenName() {
        return afterMidenName;
    }

    public void setAfterMidenName(String afterMidenName) {
        this.afterMidenName = afterMidenName;
    }

    public String getAfterMarriedName() {
        return afterMarriedName;
    }

    public void setAfterMarriedName(String afterMarriedName) {
        this.afterMarriedName = afterMarriedName;
    }

    public String getRevokeReasonCode() {
        return revokeReasonCode;
    }

    public void setRevokeReasonCode(String revokeReasonCode) {
        this.revokeReasonCode = revokeReasonCode;
    }

    public String getOtherRevokeReason() {
        return otherRevokeReason;
    }

    public void setOtherRevokeReason(String otherRevokeReason) {
        this.otherRevokeReason = otherRevokeReason;
    }

    public String getRevokeYyymmdd() {
        return revokeYyymmdd;
    }

    public void setRevokeYyymmdd(String revokeYyymmdd) {
        this.revokeYyymmdd = revokeYyymmdd;
    }

    public String getLawCode() {
        return lawCode;
    }

    public void setLawCode(String lawCode) {
        this.lawCode = lawCode;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getCertificate_1() {
        return certificate_1;
    }

    public void setCertificate_1(String certificate_1) {
        this.certificate_1 = certificate_1;
    }

    public String getCertificate_2() {
        return certificate_2;
    }

    public void setCertificate_2(String certificate_2) {
        this.certificate_2 = certificate_2;
    }

    public String getCertificate_3() {
        return certificate_3;
    }

    public void setCertificate_3(String certificate_3) {
        this.certificate_3 = certificate_3;
    }

    public String getCertificate_4() {
        return certificate_4;
    }

    public void setCertificate_4(String certificate_4) {
        this.certificate_4 = certificate_4;
    }

    public String getCertificate_5() {
        return certificate_5;
    }

    public void setCertificate_5(String certificate_5) {
        this.certificate_5 = certificate_5;
    }

    public String getCertificate_6() {
        return certificate_6;
    }

    public void setCertificate_6(String certificate_6) {
        this.certificate_6 = certificate_6;
    }

    public String getCertificate_7() {
        return certificate_7;
    }

    public void setCertificate_7(String certificate_7) {
        this.certificate_7 = certificate_7;
    }

    public String getCertificate_8() {
        return certificate_8;
    }

    public void setCertificate_8(String certificate_8) {
        this.certificate_8 = certificate_8;
    }

    public String getCertificate_9() {
        return certificate_9;
    }

    public void setCertificate_9(String certificate_9) {
        this.certificate_9 = certificate_9;
    }

    public String getCertificate_10() {
        return certificate_10;
    }

    public void setCertificate_10(String certificate_10) {
        this.certificate_10 = certificate_10;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    public void setDoFineCheckFlag(String doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
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

    public String getBeforePersonName() {
        return beforePersonName;
    }

    public void setBeforePersonName(String beforePersonName) {
        this.beforePersonName = beforePersonName;
    }

    public String getBeforeLastName() {
        return beforeLastName;
    }

    public void setBeforeLastName(String beforeLastName) {
        this.beforeLastName = beforeLastName;
    }

    public String getBeforeFirstName() {
        return beforeFirstName;
    }

    public void setBeforeFirstName(String beforeFirstName) {
        this.beforeFirstName = beforeFirstName;
    }

    public String getBeforeMidenName() {
        return beforeMidenName;
    }

    public void setBeforeMidenName(String beforeMidenName) {
        this.beforeMidenName = beforeMidenName;
    }

    public String getBeforeMarriedName() {
        return beforeMarriedName;
    }

    public void setBeforeMarriedName(String beforeMarriedName) {
        this.beforeMarriedName = beforeMarriedName;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

}

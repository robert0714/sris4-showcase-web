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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl01140AppDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01140AppDataDTO", propOrder = { "changeTitle", "registerDate", "registerTime",
        "acceptAdminOfficeCode", "beforeRegisterContent", "mainType", "subType", "registerCode",
        "afterRegisterContent", "updateYyymmdd", "updateReason", "certificate_1", "certificate_1_name",
        "certificate_2", "certificate_2_name", "certificate_3", "certificate_3_name", "certificate_4",
        "certificate_4_name", "certificate_5", "certificate_5_name", "certificate_6", "certificate_6_name",
        "certificate_7", "otherCertificate", "enforcedFlag", "registerContent", "needFineFlag", "fineOverdueruleMark",
        "fineMoney", "acceptRegisterName", "receiptId", "householdHeadFlag" })
@XmlRootElement(name = "Rl01140AppDataDTO")
public class Rl01140AppDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 作業類別. */
    @XmlElement(name = "ChangeTitle")
    @FieldName("作業類別")
    private String changeTitle;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 原事項. */
    @XmlElement(name = "BeforeRegisterContent")
    @FieldName("原事項")
    private String beforeRegisterContent;

    /** 主分類. */
    @XmlElement(name = "MainType")
    @FieldName("主分類")
    private String mainType;

    /** 次分類. */
    @XmlElement(name = "SubType")
    @FieldName("次分類")
    private String subType;

    /** 記事代碼. */
    @XmlElement(name = "RegisterCode")
    @FieldName("記事代碼")
    private String registerCode;

    /** 補填\更正事項. */
    @XmlElement(name = "AfterRegisterContent")
    @FieldName("補填\\更正事項")
    private String afterRegisterContent;

    /** 補填\更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("補填\\更正日期")
    private String updateYyymmdd;

    /** 補填\更正原因. */
    @XmlElement(name = "UpdateReason")
    @FieldName("補填\\更正原因")
    private String updateReason;

    /** 附繳證件1. */
    @XmlElement(name = "Certificate_1")
    @FieldName("附繳證件1")
    private String certificate_1;

    /** 附繳證件1名稱. */
    @XmlElement(name = "Certificate_1_name")
    @FieldName("附繳證件1名稱")
    private String certificate_1_name;

    /** 附繳證件2. */
    @XmlElement(name = "Certificate_2")
    @FieldName("附繳證件2")
    private String certificate_2;

    /** 附繳證件2名稱. */
    @XmlElement(name = "Certificate_2_name")
    @FieldName("附繳證件2名稱")
    private String certificate_2_name;

    /** 附繳證件3. */
    @XmlElement(name = "Certificate_3")
    @FieldName("附繳證件3")
    private String certificate_3;

    /** 附繳證件3名稱. */
    @XmlElement(name = "Certificate_3_name")
    @FieldName("附繳證件3名稱")
    private String certificate_3_name;

    /** 附繳證件4. */
    @XmlElement(name = "Certificate_4")
    @FieldName("附繳證件4")
    private String certificate_4;

    /** 附繳證件4名稱. */
    @XmlElement(name = "Certificate_4_name")
    @FieldName("附繳證件4名稱")
    private String certificate_4_name;

    /** 附繳證件5. */
    @XmlElement(name = "Certificate_5")
    @FieldName("附繳證件5")
    private String certificate_5;

    /** 附繳證件5名稱. */
    @XmlElement(name = "Certificate_5_name")
    @FieldName("附繳證件5名稱")
    private String certificate_5_name;

    /** 附繳證件6. */
    @XmlElement(name = "Certificate_6")
    @FieldName("附繳證件6")
    private String certificate_6;

    /** 附繳證件6名稱. */
    @XmlElement(name = "Certificate_6_name")
    @FieldName("附繳證件6名稱")
    private String certificate_6_name;

    /** 附繳證件7. */
    @XmlElement(name = "certificate_7")
    @FieldName("附繳證件7")
    private String certificate_7;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("申請書備註")
    private String registerContent;

    /** 須進行罰鍰處理. */
    @XmlElement(name = "NeedFineFlag")
    @FieldName("須進行罰鍰處理")
    private String needFineFlag = RlConstant.STRING_TWO;

    /** 戶籍罰鍰條款註記. */
    @XmlElement(name = "FineOverdueruleMark")
    @FieldName("戶籍罰鍰條款註記")
    private String fineOverdueruleMark;

    /** 戶籍罰鍰金鍰. */
    @XmlElement(name = "FineMoney")
    @FieldName("戶籍罰鍰金鍰")
    private String fineMoney;

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegisterName")
    @FieldName("受理地戶籍員姓名")
    private String acceptRegisterName;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

    /** 當事人是否為戶長旗標. */
    @XmlElement(name = "HouseholdHeadFlag")
    @FieldName("當事人是否為戶長旗標")
    private boolean householdHeadFlag = false;

    public String getChangeTitle() {
        return changeTitle;
    }

    public void setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
    }

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

    public String getBeforeRegisterContent() {
        return beforeRegisterContent;
    }

    public void setBeforeRegisterContent(String beforeRegisterContent) {
        this.beforeRegisterContent = beforeRegisterContent;
    }

    public String getMainType() {
        return mainType;
    }

    public void setMainType(String mainType) {
        this.mainType = mainType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getAfterRegisterContent() {
        return afterRegisterContent;
    }

    public void setAfterRegisterContent(String afterRegisterContent) {
        this.afterRegisterContent = afterRegisterContent;
    }

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public String getCertificate_1() {
        return certificate_1;
    }

    public void setCertificate_1(String certificate_1) {
        this.certificate_1 = certificate_1;
    }

    public String getCertificate_1_name() {
        return certificate_1_name;
    }

    public void setCertificate_1_name(String certificate_1_name) {
        this.certificate_1_name = certificate_1_name;
    }

    public String getCertificate_2() {
        return certificate_2;
    }

    public void setCertificate_2(String certificate_2) {
        this.certificate_2 = certificate_2;
    }

    public String getCertificate_2_name() {
        return certificate_2_name;
    }

    public void setCertificate_2_name(String certificate_2_name) {
        this.certificate_2_name = certificate_2_name;
    }

    public String getCertificate_3() {
        return certificate_3;
    }

    public void setCertificate_3(String certificate_3) {
        this.certificate_3 = certificate_3;
    }

    public String getCertificate_3_name() {
        return certificate_3_name;
    }

    public void setCertificate_3_name(String certificate_3_name) {
        this.certificate_3_name = certificate_3_name;
    }

    public String getCertificate_4() {
        return certificate_4;
    }

    public void setCertificate_4(String certificate_4) {
        this.certificate_4 = certificate_4;
    }

    public String getCertificate_4_name() {
        return certificate_4_name;
    }

    public void setCertificate_4_name(String certificate_4_name) {
        this.certificate_4_name = certificate_4_name;
    }

    public String getCertificate_5() {
        return certificate_5;
    }

    public void setCertificate_5(String certificate_5) {
        this.certificate_5 = certificate_5;
    }

    public String getCertificate_5_name() {
        return certificate_5_name;
    }

    public void setCertificate_5_name(String certificate_5_name) {
        this.certificate_5_name = certificate_5_name;
    }

    public String getCertificate_6() {
        return certificate_6;
    }

    public void setCertificate_6(String certificate_6) {
        this.certificate_6 = certificate_6;
    }

    public String getCertificate_6_name() {
        return certificate_6_name;
    }

    public void setCertificate_6_name(String certificate_6_name) {
        this.certificate_6_name = certificate_6_name;
    }

    public String getCertificate_7() {
        return certificate_7;
    }

    public void setCertificate_7(String certificate_7) {
        this.certificate_7 = certificate_7;
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

    public String getAcceptRegisterName() {
        return acceptRegisterName;
    }

    public void setAcceptRegisterName(String acceptRegisterName) {
        this.acceptRegisterName = acceptRegisterName;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public boolean isHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setHouseholdHeadFlag(boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

}

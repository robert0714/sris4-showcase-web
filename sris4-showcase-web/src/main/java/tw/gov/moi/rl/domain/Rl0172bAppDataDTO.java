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
@XmlType(name = "rl0172bAppDataDTO", propOrder = { "registerDate", "registerTime", "applyDate",
        "acceptAdminOfficeCode", "registerContent", "enforcedFlag", "orgEducationMark", "changeNameFlag",
        "noChangeReasonCode", "afterPersonName", "afterLastName", "afterFirstName", "afterMidenName",
        "afterMarriedName", "updateYyymmdd", "afterItem", "lawCode", "updateReasonCode", "nameChangeType",
        "nameChangeNum", "orgNameType", "orgLastName", "orgNameWay", "certificateList", "certificate1", "certificate2",
        "certificate3", "certificate4", "certificate5", "certificate6", "certificate7", "certificate8", "certificate9",
        "certificate10", "certificate11", "certificate12", "certificate13", "certificate14", "certificate15",
        "certificate16", "certificate17", "certificate18", "certificate19", "certificate20", "certificate21",
        "certificate22", "certificate23", "certificate24", "certificate25", "certificate26", "certificate27",
        "certificate28", "certificate29", "certificate30", "otherCertificate", "bookFlag", "householdHeadFlag",
        "personForeignFlag", "nameChangeTypeShow", "nameChangeNumShow", "orgNameTypeShow", "orgNameWayShow",
        "beforePersonName", "beforeLastName", "beforeFirstName", "beforeMidenName", "beforeMarriedName",
        "outliveCaseFlag" })
@XmlRootElement(name = "Rl0172bAppDataDTO")
public class Rl0172bAppDataDTO implements Serializable {

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
    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "enforcedFlag", required = false)
    private String enforcedFlag;
    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "orgEducationMark", required = false)
    private String orgEducationMark;
    /** 是否變更姓名 */
    @FieldName("是否變更姓名")
    @XmlElement(name = "changeNameFlag", required = false)
    private String changeNameFlag;
    /** 不變更原因代碼 */
    @FieldName("不變更原因代碼")
    @XmlElement(name = "noChangeReasonCode", required = false)
    private String noChangeReasonCode;
    /** 新姓名 */
    @FieldName("新姓名")
    @XmlElement(name = "afterPersonName", required = false)
    private String afterPersonName;
    /** 新姓 */
    @FieldName("新姓")
    @XmlElement(name = "afterLastName", required = false)
    private String afterLastName;
    /** 新名 */
    @FieldName("新名")
    @XmlElement(name = "afterFirstName", required = false)
    private String afterFirstName;
    /** 新本姓 */
    @FieldName("新本姓")
    @XmlElement(name = "afterMidenName", required = false)
    private String afterMidenName;
    /** 新冠姓 */
    @FieldName("新冠姓")
    @XmlElement(name = "afterMarriedName", required = false)
    private String afterMarriedName;
    /** 變更日期 */
    @FieldName("變更日期")
    @XmlElement(name = "updateYyymmdd", required = false)
    private String updateYyymmdd;
    /** 變更項目 */
    @FieldName("變更項目")
    @XmlElement(name = "afterItem", required = false)
    private String afterItem;
    /** 引用法條代碼 */
    @FieldName("引用法條代碼")
    @XmlElement(name = "lawCode", required = false)
    private String lawCode;
    /** 變更原因代碼 */
    @FieldName("變更原因代碼")
    @XmlElement(name = "updateReasonCode", required = false)
    private String updateReasonCode;
    /** 姓名變更類別 */
    @FieldName("姓名變更類別")
    @XmlElement(name = "nameChangeType", required = false)
    private String nameChangeType;
    /** 改名次數 */
    @FieldName("改名次數")
    @XmlElement(name = "nameChangeNum", required = false)
    private String nameChangeNum;
    /** 原從姓類別 */
    @FieldName("原從姓類別")
    @XmlElement(name = "orgNameType", required = false)
    private String orgNameType;
    /** 原從姓 */
    @FieldName("原從姓")
    @XmlElement(name = "orgLastName", required = false)
    private String orgLastName;
    /** 原命名方式 */
    @FieldName("原命名方式")
    @XmlElement(name = "orgNameWay", required = false)
    private String orgNameWay;
    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "certificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();
    /** 附繳證件1 */
    @FieldName("附繳證件1")
    @XmlElement(name = "certificate1", required = false)
    private String certificate1;
    /** 附繳證件2 */
    @FieldName("附繳證件2")
    @XmlElement(name = "certificate2", required = false)
    private String certificate2;
    /** 附繳證件3 */
    @FieldName("附繳證件3")
    @XmlElement(name = "certificate3", required = false)
    private String certificate3;
    /** 附繳證件4 */
    @FieldName("附繳證件4")
    @XmlElement(name = "certificate4", required = false)
    private String certificate4;
    /** 附繳證件5 */
    @FieldName("附繳證件5")
    @XmlElement(name = "certificate5", required = false)
    private String certificate5;
    /** 附繳證件6 */
    @FieldName("附繳證件6")
    @XmlElement(name = "certificate6", required = false)
    private String certificate6;
    /** 附繳證件7 */
    @FieldName("附繳證件7")
    @XmlElement(name = "certificate7", required = false)
    private String certificate7;
    /** 附繳證件8 */
    @FieldName("附繳證件8")
    @XmlElement(name = "certificate8", required = false)
    private String certificate8;
    /** 附繳證件9 */
    @FieldName("附繳證件9")
    @XmlElement(name = "certificate9", required = false)
    private String certificate9;
    /** 附繳證件10 */
    @FieldName("附繳證件10")
    @XmlElement(name = "certificate10", required = false)
    private String certificate10;
    /** 附繳證件11 */
    @FieldName("附繳證件11")
    @XmlElement(name = "certificate11", required = false)
    private String certificate11;
    /** 附繳證件12 */
    @FieldName("附繳證件12")
    @XmlElement(name = "certificate12", required = false)
    private String certificate12;
    /** 附繳證件13 */
    @FieldName("附繳證件13")
    @XmlElement(name = "certificate13", required = false)
    private String certificate13;
    /** 附繳證件14 */
    @FieldName("附繳證件14")
    @XmlElement(name = "certificate14", required = false)
    private String certificate14;
    /** 附繳證件15 */
    @FieldName("附繳證件15")
    @XmlElement(name = "certificate15", required = false)
    private String certificate15;
    /** 附繳證件16 */
    @FieldName("附繳證件16")
    @XmlElement(name = "certificate16", required = false)
    private String certificate16;
    /** 附繳證件17 */
    @FieldName("附繳證件17")
    @XmlElement(name = "certificate17", required = false)
    private String certificate17;
    /** 附繳證件18 */
    @FieldName("附繳證件18")
    @XmlElement(name = "certificate18", required = false)
    private String certificate18;
    /** 附繳證件19 */
    @FieldName("附繳證件19")
    @XmlElement(name = "certificate19", required = false)
    private String certificate19;
    /** 附繳證件20 */
    @FieldName("附繳證件20")
    @XmlElement(name = "certificate20", required = false)
    private String certificate20;
    /** 附繳證件21 */
    @FieldName("附繳證件21")
    @XmlElement(name = "certificate21", required = false)
    private String certificate21;
    /** 附繳證件22 */
    @FieldName("附繳證件22")
    @XmlElement(name = "certificate22", required = false)
    private String certificate22;
    /** 附繳證件23 */
    @FieldName("附繳證件23")
    @XmlElement(name = "certificate23", required = false)
    private String certificate23;
    /** 附繳證件24 */
    @FieldName("附繳證件24")
    @XmlElement(name = "certificate24", required = false)
    private String certificate24;
    /** 附繳證件25 */
    @FieldName("附繳證件25")
    @XmlElement(name = "certificate25", required = false)
    private String certificate25;
    /** 附繳證件26 */
    @FieldName("附繳證件26")
    @XmlElement(name = "certificate26", required = false)
    private String certificate26;
    /** 附繳證件27 */
    @FieldName("附繳證件27")
    @XmlElement(name = "certificate27", required = false)
    private String certificate27;
    /** 附繳證件28 */
    @FieldName("附繳證件28")
    @XmlElement(name = "certificate28", required = false)
    private String certificate28;
    /** 附繳證件29 */
    @FieldName("附繳證件29")
    @XmlElement(name = "certificate29", required = false)
    private String certificate29;
    /** 附繳證件30 */
    @FieldName("附繳證件30")
    @XmlElement(name = "certificate30", required = false)
    private String certificate30;
    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "otherCertificate", required = false)
    private String otherCertificate;
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
    /** 姓名變更類別 是否顯示 */
    @FieldName("姓名變更類別是否顯示")
    @XmlElement(name = "nameChangeTypeShow", required = false)
    private Boolean nameChangeTypeShow;
    /** 改名次數 是否顯示 */
    @FieldName("改名次數是否顯示")
    @XmlElement(name = "nameChangeNumShow", required = false)
    private Boolean nameChangeNumShow;
    /** 原從姓類別 是否顯示 */
    @FieldName("原從姓類別是否顯示")
    @XmlElement(name = "orgNameTypeShow", required = false)
    private Boolean orgNameTypeShow;
    /** 原命名方式 是否顯示 */
    @FieldName("原命名方式是否顯示")
    @XmlElement(name = "orgNameWayShow", required = false)
    private Boolean orgNameWayShow;
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

    public String getChangeNameFlag() {
        return changeNameFlag;
    }

    public void setChangeNameFlag(String changeNameFlag) {
        this.changeNameFlag = changeNameFlag;
    }

    public String getNoChangeReasonCode() {
        return noChangeReasonCode;
    }

    public void setNoChangeReasonCode(String noChangeReasonCode) {
        this.noChangeReasonCode = noChangeReasonCode;
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

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    public String getAfterItem() {
        return afterItem;
    }

    public void setAfterItem(String afterItem) {
        this.afterItem = afterItem;
    }

    public String getLawCode() {
        return lawCode;
    }

    public void setLawCode(String lawCode) {
        this.lawCode = lawCode;
    }

    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    public String getNameChangeType() {
        return nameChangeType;
    }

    public void setNameChangeType(String nameChangeType) {
        this.nameChangeType = nameChangeType;
    }

    public String getNameChangeNum() {
        return nameChangeNum;
    }

    public void setNameChangeNum(String nameChangeNum) {
        this.nameChangeNum = nameChangeNum;
    }

    public String getOrgNameType() {
        return orgNameType;
    }

    public void setOrgNameType(String orgNameType) {
        this.orgNameType = orgNameType;
    }

    public String getOrgLastName() {
        return orgLastName;
    }

    public void setOrgLastName(String orgLastName) {
        this.orgLastName = orgLastName;
    }

    public String getOrgNameWay() {
        return orgNameWay;
    }

    public void setOrgNameWay(String orgNameWay) {
        this.orgNameWay = orgNameWay;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getCertificate1() {
        return certificate1;
    }

    public void setCertificate1(String certificate1) {
        this.certificate1 = certificate1;
    }

    public String getCertificate2() {
        return certificate2;
    }

    public void setCertificate2(String certificate2) {
        this.certificate2 = certificate2;
    }

    public String getCertificate3() {
        return certificate3;
    }

    public void setCertificate3(String certificate3) {
        this.certificate3 = certificate3;
    }

    public String getCertificate4() {
        return certificate4;
    }

    public void setCertificate4(String certificate4) {
        this.certificate4 = certificate4;
    }

    public String getCertificate5() {
        return certificate5;
    }

    public void setCertificate5(String certificate5) {
        this.certificate5 = certificate5;
    }

    public String getCertificate6() {
        return certificate6;
    }

    public void setCertificate6(String certificate6) {
        this.certificate6 = certificate6;
    }

    public String getCertificate7() {
        return certificate7;
    }

    public void setCertificate7(String certificate7) {
        this.certificate7 = certificate7;
    }

    public String getCertificate8() {
        return certificate8;
    }

    public void setCertificate8(String certificate8) {
        this.certificate8 = certificate8;
    }

    public String getCertificate9() {
        return certificate9;
    }

    public void setCertificate9(String certificate9) {
        this.certificate9 = certificate9;
    }

    public String getCertificate10() {
        return certificate10;
    }

    public void setCertificate10(String certificate10) {
        this.certificate10 = certificate10;
    }

    public String getCertificate11() {
        return certificate11;
    }

    public void setCertificate11(String certificate11) {
        this.certificate11 = certificate11;
    }

    public String getCertificate12() {
        return certificate12;
    }

    public void setCertificate12(String certificate12) {
        this.certificate12 = certificate12;
    }

    public String getCertificate13() {
        return certificate13;
    }

    public void setCertificate13(String certificate13) {
        this.certificate13 = certificate13;
    }

    public String getCertificate14() {
        return certificate14;
    }

    public void setCertificate14(String certificate14) {
        this.certificate14 = certificate14;
    }

    public String getCertificate15() {
        return certificate15;
    }

    public void setCertificate15(String certificate15) {
        this.certificate15 = certificate15;
    }

    public String getCertificate16() {
        return certificate16;
    }

    public void setCertificate16(String certificate16) {
        this.certificate16 = certificate16;
    }

    public String getCertificate17() {
        return certificate17;
    }

    public void setCertificate17(String certificate17) {
        this.certificate17 = certificate17;
    }

    public String getCertificate18() {
        return certificate18;
    }

    public String getCertificate19() {
        return certificate19;
    }

    public void setCertificate19(String certificate19) {
        this.certificate19 = certificate19;
    }

    public String getCertificate20() {
        return certificate20;
    }

    public void setCertificate20(String certificate20) {
        this.certificate20 = certificate20;
    }

    public String getCertificate21() {
        return certificate21;
    }

    public void setCertificate21(String certificate21) {
        this.certificate21 = certificate21;
    }

    public String getCertificate22() {
        return certificate22;
    }

    public void setCertificate22(String certificate22) {
        this.certificate22 = certificate22;
    }

    public String getCertificate23() {
        return certificate23;
    }

    public void setCertificate23(String certificate23) {
        this.certificate23 = certificate23;
    }

    public String getCertificate24() {
        return certificate24;
    }

    public void setCertificate24(String certificate24) {
        this.certificate24 = certificate24;
    }

    public String getCertificate25() {
        return certificate25;
    }

    public void setCertificate25(String certificate25) {
        this.certificate25 = certificate25;
    }

    public String getCertificate26() {
        return certificate26;
    }

    public void setCertificate26(String certificate26) {
        this.certificate26 = certificate26;
    }

    public String getCertificate27() {
        return certificate27;
    }

    public void setCertificate27(String certificate27) {
        this.certificate27 = certificate27;
    }

    public String getCertificate28() {
        return certificate28;
    }

    public void setCertificate28(String certificate28) {
        this.certificate28 = certificate28;
    }

    public String getCertificate29() {
        return certificate29;
    }

    public void setCertificate29(String certificate29) {
        this.certificate29 = certificate29;
    }

    public String getCertificate30() {
        return certificate30;
    }

    public void setCertificate30(String certificate30) {
        this.certificate30 = certificate30;
    }

    public void setCertificate18(String certificate18) {
        this.certificate18 = certificate18;
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

    public Boolean getNameChangeTypeShow() {
        return nameChangeTypeShow;
    }

    public void setNameChangeTypeShow(Boolean nameChangeTypeShow) {
        this.nameChangeTypeShow = nameChangeTypeShow;
    }

    public Boolean getNameChangeNumShow() {
        return nameChangeNumShow;
    }

    public void setNameChangeNumShow(Boolean nameChangeNumShow) {
        this.nameChangeNumShow = nameChangeNumShow;
    }

    public Boolean getOrgNameTypeShow() {
        return orgNameTypeShow;
    }

    public void setOrgNameTypeShow(Boolean orgNameTypeShow) {
        this.orgNameTypeShow = orgNameTypeShow;
    }

    public Boolean getOrgNameWayShow() {
        return orgNameWayShow;
    }

    public void setOrgNameWayShow(Boolean orgNameWayShow) {
        this.orgNameWayShow = orgNameWayShow;
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

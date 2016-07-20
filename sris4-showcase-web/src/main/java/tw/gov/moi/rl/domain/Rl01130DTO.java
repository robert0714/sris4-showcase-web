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
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.Xldfs0ahType;
import tw.gov.moi.domain.Xldfs0c9Type;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl01130DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01130DTO", propOrder = { "openingOperationDTO", "rl01130AppDataDTO", "rldf005hList", "rldf005hType",
        "xldfPersonData", "xldfHouseholdHeadPersonData", "xldfHouseholdData", "applicant1", "applicant2",
        "delegatedPerson", "xldfefaplcType", "xldfs0ahType", "registerFlag", "changeTitle" })
@XmlRootElement(name = "Rl01130DTO")
public class Rl01130DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 開啟作業DTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 申請資料. */
    @XmlElement(name = "Rl01130AppDataDTO")
    @FieldName("申請資料")
    private Rl01130AppDataDTO rl01130AppDataDTO = new Rl01130AppDataDTO();

    /** 除戶個人記事清單. */
    @XmlElement(name = "Rldf005hList")
    @FieldName("除戶個人記事清單")
    private List<Rldf005hType> rldf005hList = new ArrayList<Rldf005hType>();

    /** 除戶個人記事清單. */
    @XmlElement(name = "Rldf005hType")
    @FieldName("除戶個人記事清單")
    private Rldf005hType rldf005hType;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("作業類別")
    private XLDFPersonDataDomainObject xldfHouseholdHeadPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 申請人1資料. */
    @XmlElement(name = "Applicant1")
    @FieldName("申請人1資料")
    private XLDFApplicantDataDTO applicant1 = new XLDFApplicantDataDTO();

    /** 申請人2資料. */
    @XmlElement(name = "Applicant2")
    @FieldName("申請人2資料")
    private XLDFApplicantDataDTO applicant2 = new XLDFApplicantDataDTO();

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 逕為登記申請人. */
    @XmlElement(name = "XldfefaplcType")
    @FieldName("逕為登記申請人")
    private transient XldfefaplcType xldfefaplcType;

    /** 除戶個人記事. */
    @XmlElement(name = "Xldfs0ahType")
    @FieldName("除戶個人記事")
    private Xldfs0ahType xldfs0ahType;

    /** 除戶個人記事. */
    @XmlElement(name = "Xldfs0c9Type")
    @FieldName("除戶個人記事")
    private Xldfs0c9Type xldfs0c9Type;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    /** 補填或更正. */
    @XmlElement(name = "ChangeTitle")
    @FieldName("補填或更正")
    private String changeTitle;

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public Rl01130AppDataDTO getRl01130AppDataDTO() {
        return rl01130AppDataDTO;
    }

    public void setRl01130AppDataDTO(Rl01130AppDataDTO rl01130AppDataDTO) {
        this.rl01130AppDataDTO = rl01130AppDataDTO;
    }

    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    public XLDFPersonDataDomainObject getXldfHouseholdHeadPersonData() {
        return xldfHouseholdHeadPersonData;
    }

    public void setXldfHouseholdHeadPersonData(XLDFPersonDataDomainObject xldfHouseholdHeadPersonData) {
        this.xldfHouseholdHeadPersonData = xldfHouseholdHeadPersonData;
    }

    public XLDFHouseholdDataDomainObject getXldfHouseholdData() {
        return xldfHouseholdData;
    }

    public void setXldfHouseholdData(XLDFHouseholdDataDomainObject xldfHouseholdData) {
        this.xldfHouseholdData = xldfHouseholdData;
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

    public XldfefaplcType getXldfefaplcType() {
        return xldfefaplcType;
    }

    public void setXldfefaplcType(XldfefaplcType xldfefaplcType) {
        this.xldfefaplcType = xldfefaplcType;
    }

    public Xldfs0ahType getXldfs0ahType() {
        return xldfs0ahType;
    }

    public void setXldfs0ahType(Xldfs0ahType xldfs0ahType) {
        this.xldfs0ahType = xldfs0ahType;
    }

    public List<Rldf005hType> getRldf005hList() {
        return rldf005hList;
    }

    public void setRldf005hList(List<Rldf005hType> rldf005hList) {
        this.rldf005hList = rldf005hList;
    }

    public Rldf005hType getRldf005hType() {
        return rldf005hType;
    }

    public void setRldf005hType(Rldf005hType rldf005hType) {
        this.rldf005hType = rldf005hType;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getChangeTitle() {
        return changeTitle;
    }

    public void setChangeTitle(String changeTitle) {
        this.changeTitle = changeTitle;
    }

    public Xldfs0c9Type getXldfs0c9Type() {
        return xldfs0c9Type;
    }

    public void setXldfs0c9Type(Xldfs0c9Type xldfs0c9Type) {
        this.xldfs0c9Type = xldfs0c9Type;
    }

}

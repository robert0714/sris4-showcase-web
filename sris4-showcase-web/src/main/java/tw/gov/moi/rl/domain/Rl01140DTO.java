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
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.Xldfs0aiType;
import tw.gov.moi.domain.Xldfs0caType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl01140DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01140DTO", propOrder = { "openingOperationDTO", "rl01140AppDataDTO", "rldf002hList", "rldf002hType",
        "xldfPersonData", "xldfHouseholdHeadPersonData", "xldfHouseholdData", "applicant1", "applicant2",
        "delegatedPerson", "xldfefaplcType", "xldfs0aiType", "registerFlag", "changeTitle" })
@XmlRootElement(name = "Rl01140DTO")
public class Rl01140DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 開啟作業DTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 申請資料. */
    @XmlElement(name = "Rl01140AppDataDTO")
    @FieldName("申請資料")
    private Rl01140AppDataDTO rl01140AppDataDTO = new Rl01140AppDataDTO();

    /** 除戶個人記事清單. */
    @XmlElement(name = "Rldf002hList")
    @FieldName("除戶個人記事清單")
    private List<Rldf002hType> rldf002hList = new ArrayList<Rldf002hType>();

    /** 除戶個人記事清單. */
    @XmlElement(name = "Rldf002hType")
    @FieldName("除戶個人記事清單")
    private Rldf002hType rldf002hType;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 戶長個人資料. */
    @XmlElement(name = "XldfHouseholdHeadPersonData")
    @FieldName("戶長個人資料")
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
    @XmlElement(name = "Xldfs0aiType")
    @FieldName("除戶個人記事")
    private Xldfs0aiType xldfs0aiType;

    /** 除戶個人記事. */
    @XmlElement(name = "Xldfs0caType")
    @FieldName("除戶個人記事")
    private Xldfs0caType xldfs0caType;

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

    public Rl01140AppDataDTO getRl01140AppDataDTO() {
        return rl01140AppDataDTO;
    }

    public void setRl01140AppDataDTO(Rl01140AppDataDTO rl01140AppDataDTO) {
        this.rl01140AppDataDTO = rl01140AppDataDTO;
    }

    public Xldfs0aiType getXldfs0aiType() {
        return xldfs0aiType;
    }

    public void setXldfs0aiType(Xldfs0aiType xldfs0aiType) {
        this.xldfs0aiType = xldfs0aiType;
    }

    public List<Rldf002hType> getRldf002hList() {
        return rldf002hList;
    }

    public void setRldf002hList(List<Rldf002hType> rldf002hList) {
        this.rldf002hList = rldf002hList;
    }

    public Rldf002hType getRldf002hType() {
        return rldf002hType;
    }

    public void setRldf002hType(Rldf002hType rldf002hType) {
        this.rldf002hType = rldf002hType;
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

    public Xldfs0caType getXldfs0caType() {
        return xldfs0caType;
    }

    public void setXldfs0caType(Xldfs0caType xldfs0caType) {
        this.xldfs0caType = xldfs0caType;
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl052b6DTO", propOrder = { "personId", "birthYyymmdd", "personName", "deathYyymmdd", "noticeYyymmdd",
        "regYyymmdd", "organKind", "organName", "ogranAddress", "proofDocument", "caseNo", "openYyymmdd", "reMark",
        "dataShow" })
@XmlRootElement(name = "Rl052b6DTO")
public class Rl052b6DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2181385595173649545L;

    /** 統一編號 */
    @FieldName("統一編號")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "BirthYyymmdd", required = false)
    private String birthYyymmdd;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName", required = false)
    private String personName;

    /** 死亡日期 */
    @FieldName("死亡日期")
    @XmlElement(name = "DeathYyymmdd", required = false)
    private String deathYyymmdd;

    /** 通報日期 */
    @FieldName("通報日期")
    @XmlElement(name = "NoticeYyymmdd", required = false)
    private String noticeYyymmdd;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegYyymmdd", required = false)
    private String regYyymmdd;

    /** 機關類別 */
    @FieldName("機關類別")
    @XmlElement(name = "OrganKind", required = false)
    private String organKind;

    /** 機關名稱 */
    @FieldName("機關名稱")
    @XmlElement(name = "OrganName", required = false)
    private String organName;

    /** 醫療院所地址 */
    @FieldName("醫療院所地址")
    @XmlElement(name = "OgranAddress", required = false)
    private String ogranAddress;

    /** 證明文件代碼 */
    @FieldName("證明文件代碼")
    @XmlElement(name = "ProofDocument", required = false)
    private String proofDocument;

    /** 證書字號 */
    @FieldName("證書字號")
    @XmlElement(name = "CaseNo", required = false)
    private String caseNo;

    /** 開立日期 */
    @FieldName("開立日期")
    @XmlElement(name = "OpenYyymmdd", required = false)
    private String openYyymmdd;

    /** 備註 */
    @FieldName("備註")
    @XmlElement(name = "ReMark", required = false)
    private String reMark;

    /** 是否顯示查詢結果 */
    @FieldName("是否顯示查詢結果")
    @XmlElement(name = "DataShow", required = false)
    private String dataShow;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDeathYyymmdd() {
        return deathYyymmdd;
    }

    public void setDeathYyymmdd(String deathYyymmdd) {
        this.deathYyymmdd = deathYyymmdd;
    }

    public String getNoticeYyymmdd() {
        return noticeYyymmdd;
    }

    public void setNoticeYyymmdd(String noticeYyymmdd) {
        this.noticeYyymmdd = noticeYyymmdd;
    }

    public String getRegYyymmdd() {
        return regYyymmdd;
    }

    public void setRegYyymmdd(String regYyymmdd) {
        this.regYyymmdd = regYyymmdd;
    }

    public String getOrganKind() {
        return organKind;
    }

    public void setOrganKind(String organKind) {
        this.organKind = organKind;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getOgranAddress() {
        return ogranAddress;
    }

    public void setOgranAddress(String ogranAddress) {
        this.ogranAddress = ogranAddress;
    }

    public String getProofDocument() {
        return proofDocument;
    }

    public void setProofDocument(String proofDocument) {
        this.proofDocument = proofDocument;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getOpenYyymmdd() {
        return openYyymmdd;
    }

    public void setOpenYyymmdd(String openYyymmdd) {
        this.openYyymmdd = openYyymmdd;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

    public String getDataShow() {
        return dataShow;
    }

    public void setDataShow(String dataShow) {
        this.dataShow = dataShow;
    }

}

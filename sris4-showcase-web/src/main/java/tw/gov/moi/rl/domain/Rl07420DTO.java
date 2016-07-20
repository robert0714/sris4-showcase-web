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
import tw.gov.moi.domain.Rlde009eType;
import tw.gov.moi.domain.Rldf009eType;
import tw.gov.moi.rl.component.RlGet4m1mComponent.Rl4m1mDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07420DTO", propOrder = { "areaCode1", "personId", "personIdFind", "registerDate", "registerTime",
        "document", "transactionCaseCode", "applyCaseCode", "nowUseNo", "personName", "birthYyymmdd", "gender",
        "endingDate", "assignAddr", "areaCode", "village", "neighbor", "streetDoorplate", "householdHeadId",
        "householdId", "householdHeadName", "transactionId", "gist", "fact", "laws", "annotation", "incidentDate",
        "siteType", "reportURL", "printFlag", "personIdFlag", "transactionCaseCodeFlag", "incidentDateFlag",
        "applyCaseCodeFlag", "endingDateFlag", "siteTypeFlag", "addVerifyDataButtonFlag", "addConfirmDataButtonFlag",
        "selectedRl07420PeopleDTO", "listRl07420PeopleDTO", "selselectedRldf009eType", "editedRldf009eType",
        "listRldf009eType", "listRlde009e01Type", "listRlde009e02Type", "listRlde009e03Type", "listRlde009e04Type",
        "editClause01Data", "editClause02Data", "officeAddress", "departmentName", "officeTel", "officeUserName",
        "officeFax", "streetZip" })
@XmlRootElement(name = "Rl07420DTO")
public class Rl07420DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 行政區域 */
    @XmlElement(name = "areaCode1")
    @FieldName("行政區域")
    private String areaCode1 = "";

    /** 統號 */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** 用來查詢的統號 */
    @XmlElement(name = "personIdFind")
    @FieldName("用來查詢的統號")
    private String personIdFind = "";

    /** 開單日期 */
    @XmlElement(name = "registerDate")
    @FieldName("開單日期")
    private String registerDate;

    /** 開單時間 */
    @XmlElement(name = "registerTime")
    @FieldName("開單時間")
    private String registerTime;

    /** 催告文號 */
    @XmlElement(name = "document")
    @FieldName("催告文號")
    private String document;

    /** 催告書類別 */
    @XmlElement(name = "transactionCaseCode")
    @FieldName("催告書類別")
    private String transactionCaseCode;

    /** 申登案別 */
    @XmlElement(name = "applyCaseCode")
    @FieldName("申登案別")
    private String applyCaseCode;

    /** 目前使用編號 */
    @XmlElement(name = "nowUseNo")
    @FieldName("目前使用編號")
    private String nowUseNo;

    /** 受催人姓名 */
    @XmlElement(name = "personName")
    @FieldName("受催人姓名")
    private String personName = "";

    /** 出生日期 */
    @XmlElement(name = "birthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 性別 */
    @XmlElement(name = "gender")
    @FieldName("性別")
    private String gender = "";

    /** 申登期限 */
    @XmlElement(name = "endingDate")
    @FieldName("申登期限")
    private String endingDate = "";

    /** 居住所 */
    @XmlElement(name = "assignAddr")
    @FieldName("居住所")
    private String assignAddr = "";

    /** 行政區域代碼 */
    @XmlElement(name = "areaCode")
    @FieldName("行政區域代碼")
    private String areaCode = "";

    /** 村里 */
    @XmlElement(name = "village")
    @FieldName("村里")
    private String village = "";

    /** 鄰 */
    @XmlElement(name = "neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌 */
    @XmlElement(name = "streetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 戶長統號 */
    @XmlElement(name = "householdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號 */
    @XmlElement(name = "householdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 戶長姓名 */
    @XmlElement(name = "householdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 催告個案交易序號 */
    @XmlElement(name = "transactionId")
    @FieldName("催告個案交易序號")
    private String transactionId = "";

    /** 主旨 */
    @XmlElement(name = "gist")
    @FieldName("主旨")
    private String gist = "";

    /** 事實 */
    @XmlElement(name = "fact")
    @FieldName("事實")
    private String fact = "";

    /** 法令依據及理由 */
    @XmlElement(name = "laws")
    @FieldName("法令依據及理由")
    private String laws = "";

    /** 附註 */
    @XmlElement(name = "annotation")
    @FieldName("附註")
    private String annotation = "";

    /** 發生日期 */
    @XmlElement(name = "incidentDate")
    @FieldName("發生日期")
    private String incidentDate = "";

    /** 辦理戶所 */
    @XmlElement(name = "siteType")
    @FieldName("辦理戶所")
    private String siteType = "";

    /** 報表檔案URL. */
    @XmlElement(name = "reportURL")
    @FieldName("報表檔案URL")
    private String reportURL;

    /** 頁面控制:按鈕狀態<LI>註解:true = disabled ，false = enabled */
    /** printFlag */
    @XmlElement(name = "printFlag")
    @FieldName("列印旗標")
    private Boolean printFlag;

    /** personIdFlag */
    @XmlElement(name = "personIdFlag")
    @FieldName("personIdFlag")
    private String personIdFlag = "true";

    /** transactionCaseCodeFlag */
    @XmlElement(name = "transactionCaseCodeFlag")
    @FieldName("transactionCaseCodeFlag")
    private String transactionCaseCodeFlag = "true";

    /** incidentDateFlag */
    @XmlElement(name = "incidentDateFlag")
    @FieldName("incidentDateFlag")
    private String incidentDateFlag = "true";

    /** applyCaseCodeFlag */
    @XmlElement(name = "applyCaseCodeFlag")
    @FieldName("applyCaseCodeFlag")
    private String applyCaseCodeFlag = "true";

    /** endingDateFlag */
    @XmlElement(name = "endingDateFlag")
    @FieldName("endingDateFlag")
    private String endingDateFlag = "true";

    /** siteTypeFlag */
    @XmlElement(name = "siteTypeFlag")
    @FieldName("siteTypeFlag")
    private String siteTypeFlag = "true";

    /** addVerifyDataButtonFlag */
    @XmlElement(name = "addVerifyDataButtonFlag")
    @FieldName("addVerifyDataButtonFlag")
    private String addVerifyDataButtonFlag = "true";

    /** addConfirmDataButtonFlag */
    @XmlElement(name = "addConfirmDataButtonFlag")
    @FieldName("addConfirmDataButtonFlag")
    private String addConfirmDataButtonFlag = "false";

    /** 要刪除的人員 */
    @XmlElement(name = "selectedRl07420PeopleDTO")
    @FieldName("刪除的人員")
    private Rl07420PeopleDTO selectedRl07420PeopleDTO = new Rl07420PeopleDTO();

    /** 人員列表 */
    @XmlElement(name = "listRl07420PeopleDTO")
    @FieldName("人員列表")
    private List<Rl07420PeopleDTO> listRl07420PeopleDTO = new ArrayList<Rl07420PeopleDTO>(0);

    /** 使用者選取的 */
    @XmlElement(name = "selectedRldf009eType")
    @FieldName("選取的資料")
    private Rldf009eType selectedRldf009eType = new Rldf009eType();

    /** 使用者編輯的 */
    @XmlElement(name = "editedRldf009eType")
    @FieldName("編輯的資料")
    private Rldf009eType editedRldf009eType = new Rldf009eType();

    /** 查詢結果 */
    @XmlElement(name = "listRldf009eType")
    @FieldName("查詢結果")
    private List<Rldf009eType> listRldf009eType = new ArrayList<Rldf009eType>(0);

    /** 主旨 */
    @XmlElement(name = "listRlde009e01Type")
    @FieldName("主旨")
    private List<Rlde009eType> listRlde009e01Type = new ArrayList<Rlde009eType>(0);

    /** 事實 */
    @XmlElement(name = "listRlde009e02Type")
    @FieldName("事實")
    private List<Rlde009eType> listRlde009e02Type = new ArrayList<Rlde009eType>(0);

    /** 法令依據或理由 */
    @XmlElement(name = "listRlde009e03Type")
    @FieldName("法令依據或理由")
    private List<Rlde009eType> listRlde009e03Type = new ArrayList<Rlde009eType>(0);

    /** 附註 */
    @XmlElement(name = "listRlde009e04Type")
    @FieldName("附註")
    private List<Rlde009eType> listRlde009e04Type = new ArrayList<Rlde009eType>(0);

    /** editClause01Data */
    @XmlElement(name = "editClause01Data")
    @FieldName("editClause01Data")
    private String editClause01Data = "";

    /** editClause02Data */
    @XmlElement(name = "editClause02Data")
    @FieldName("editClause02Data")
    private String editClause02Data = "";

    /** officeAddress */
    @XmlElement(name = "officeAddress")
    @FieldName("officeAddress")
    private String officeAddress = "";

    /** departmentName */
    @XmlElement(name = "departmentName")
    @FieldName("departmentName")
    private String departmentName = "";

    /** officeTel */
    @XmlElement(name = "officeTel")
    @FieldName("officeTel")
    private String officeTel = "";

    /** officeUserName */
    @XmlElement(name = "officeUserName")
    @FieldName("officeUserName")
    private String officeUserName = "";

    /** officeFax */
    @XmlElement(name = "officeFax")
    @FieldName("officeFax")
    private String officeFax = "";

    /** streetZip */
    @XmlElement(name = "streetZip")
    @FieldName("streetZip")
    private String streetZip = "";
    
    @XmlElement(name = "newAdd")
    @FieldName("是否為新增")
    private boolean newAdd;
    
    //↓↓↓↓↓
    @XmlElement(name = "rl4m1mDto")
    @FieldName("rl4m1mDto")
    private Rl4m1mDTO rl4m1mDto;
    @XmlElement(name = "siteIdFind")
    @FieldName("siteIdFind")
    private String siteIdFind;
    //↑↑↑↑↑
    
    @XmlElement(name = "siteIdMoveOutFind")
    @FieldName("出境人員siteId")
    private String siteIdMoveOutFind;
    
    @XmlElement(name = "personIdMoveOutFind")
    @FieldName("出境人員personId")
    private String personIdMoveOutFind;
    
    @XmlElement(name = "personNameMoveOutFind")
    @FieldName("出境人員personName")
    private String personNameMoveOutFind;
    
    public String getPersonIdMoveOutFind() {
        return personIdMoveOutFind;
    }

    public void setPersonIdMoveOutFind(String personIdMoveOutFind) {
        this.personIdMoveOutFind = personIdMoveOutFind;
    }

    public String getPersonNameMoveOutFind() {
        return personNameMoveOutFind;
    }

    public void setPersonNameMoveOutFind(String personNameMoveOutFind) {
        this.personNameMoveOutFind = personNameMoveOutFind;
    }

    public String getSiteIdMoveOutFind() {
        return siteIdMoveOutFind;
    }

    public void setSiteIdMoveOutFind(String siteIdMoveOutFind) {
        this.siteIdMoveOutFind = siteIdMoveOutFind;
    }

    public boolean isNewAdd() {
        return newAdd;
    }

    public Rl4m1mDTO getRl4m1mDto() {
        return rl4m1mDto;
    }

    public void setRl4m1mDto(Rl4m1mDTO rl4m1mDto) {
        this.rl4m1mDto = rl4m1mDto;
    }

    public String getSiteIdFind() {
        return siteIdFind;
    }

    public void setSiteIdFind(String siteIdFind) {
        this.siteIdFind = siteIdFind;
    }

    public void setNewAdd(boolean newAdd) {
        this.newAdd = newAdd;
    }

    public Rldf009eType getSelectedRldf009eType() {
        return selectedRldf009eType;
    }

    public void setSelectedRldf009eType(Rldf009eType selectedRldf009eType) {
        this.selectedRldf009eType = selectedRldf009eType;
    }

    public List<Rldf009eType> getListRldf009eType() {
        return listRldf009eType;
    }

    public void setListRldf009eType(List<Rldf009eType> listRldf009eType) {
        this.listRldf009eType = listRldf009eType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getTransactionCaseCode() {
        return transactionCaseCode;
    }

    public void setTransactionCaseCode(String transactionCaseCode) {
        this.transactionCaseCode = transactionCaseCode;
    }

    public String getApplyCaseCode() {
        return applyCaseCode;
    }

    public void setApplyCaseCode(String applyCaseCode) {
        this.applyCaseCode = applyCaseCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getAssignAddr() {
        return assignAddr;
    }

    public void setAssignAddr(String assignAddr) {
        this.assignAddr = assignAddr;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getLaws() {
        return laws;
    }

    public void setLaws(String laws) {
        this.laws = laws;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Rlde009eType> getListRlde009e01Type() {
        return listRlde009e01Type;
    }

    public void setListRlde009e01Type(List<Rlde009eType> listRlde009e01Type) {
        this.listRlde009e01Type = listRlde009e01Type;
    }

    public List<Rlde009eType> getListRlde009e02Type() {
        return listRlde009e02Type;
    }

    public void setListRlde009e02Type(List<Rlde009eType> listRlde009e02Type) {
        this.listRlde009e02Type = listRlde009e02Type;
    }

    public List<Rlde009eType> getListRlde009e03Type() {
        return listRlde009e03Type;
    }

    public void setListRlde009e03Type(List<Rlde009eType> listRlde009e03Type) {
        this.listRlde009e03Type = listRlde009e03Type;
    }

    public List<Rlde009eType> getListRlde009e04Type() {
        return listRlde009e04Type;
    }

    public void setListRlde009e04Type(List<Rlde009eType> listRlde009e04Type) {
        this.listRlde009e04Type = listRlde009e04Type;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Rldf009eType getEditedRldf009eType() {
        return editedRldf009eType;
    }

    public void setEditedRldf009eType(Rldf009eType editedRldf009eType) {
        this.editedRldf009eType = editedRldf009eType;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public Boolean getPrintFlag() {
        return printFlag;
    }

    public void setPrintFlag(Boolean printFlag) {
        this.printFlag = printFlag;
    }

    public Rl07420PeopleDTO getSelectedRl07420PeopleDTO() {
        return selectedRl07420PeopleDTO;
    }

    public void setSelectedRl07420PeopleDTO(Rl07420PeopleDTO selectedRl07420PeopleDTO) {
        this.selectedRl07420PeopleDTO = selectedRl07420PeopleDTO;
    }

    public List<Rl07420PeopleDTO> getListRl07420PeopleDTO() {
        return listRl07420PeopleDTO;
    }

    public void setListRl07420PeopleDTO(List<Rl07420PeopleDTO> listRl07420PeopleDTO) {
        this.listRl07420PeopleDTO = listRl07420PeopleDTO;
    }

    public String getPersonIdFlag() {
        return personIdFlag;
    }

    public void setPersonIdFlag(String personIdFlag) {
        this.personIdFlag = personIdFlag;
    }

    public String getTransactionCaseCodeFlag() {
        return transactionCaseCodeFlag;
    }

    public void setTransactionCaseCodeFlag(String transactionCaseCodeFlag) {
        this.transactionCaseCodeFlag = transactionCaseCodeFlag;
    }

    public String getIncidentDateFlag() {
        return incidentDateFlag;
    }

    public void setIncidentDateFlag(String incidentDateFlag) {
        this.incidentDateFlag = incidentDateFlag;
    }

    public String getApplyCaseCodeFlag() {
        return applyCaseCodeFlag;
    }

    public void setApplyCaseCodeFlag(String applyCaseCodeFlag) {
        this.applyCaseCodeFlag = applyCaseCodeFlag;
    }

    public String getEndingDateFlag() {
        return endingDateFlag;
    }

    public void setEndingDateFlag(String endingDateFlag) {
        this.endingDateFlag = endingDateFlag;
    }

    public String getSiteTypeFlag() {
        return siteTypeFlag;
    }

    public void setSiteTypeFlag(String siteTypeFlag) {
        this.siteTypeFlag = siteTypeFlag;
    }

    public String getAddVerifyDataButtonFlag() {
        return addVerifyDataButtonFlag;
    }

    public void setAddVerifyDataButtonFlag(String addVerifyDataButtonFlag) {
        this.addVerifyDataButtonFlag = addVerifyDataButtonFlag;
    }

    public String getAddConfirmDataButtonFlag() {
        return addConfirmDataButtonFlag;
    }

    public void setAddConfirmDataButtonFlag(String addConfirmDataButtonFlag) {
        this.addConfirmDataButtonFlag = addConfirmDataButtonFlag;
    }

    public String getPersonIdFind() {
        return personIdFind;
    }

    public void setPersonIdFind(String personIdFind) {
        this.personIdFind = personIdFind;
    }

    public String getAreaCode1() {
        return areaCode1;
    }

    public void setAreaCode1(String areaCode1) {
        this.areaCode1 = areaCode1;
    }

    public String getEditClause01Data() {
        return editClause01Data;
    }

    public void setEditClause01Data(String editClause01Data) {
        this.editClause01Data = editClause01Data;
    }

    public String getEditClause02Data() {
        return editClause02Data;
    }

    public void setEditClause02Data(String editClause02Data) {
        this.editClause02Data = editClause02Data;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getOfficeUserName() {
        return officeUserName;
    }

    public void setOfficeUserName(String officeUserName) {
        this.officeUserName = officeUserName;
    }

    public String getOfficeFax() {
        return officeFax;
    }

    public void setOfficeFax(String officeFax) {
        this.officeFax = officeFax;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getNowUseNo() {
        return nowUseNo;
    }

    public void setNowUseNo(String nowUseNo) {
        this.nowUseNo = nowUseNo;
    }

    public String getStreetZip() {
        return streetZip;
    }

    public void setStreetZip(String streetZip) {
        this.streetZip = streetZip;
    }

}

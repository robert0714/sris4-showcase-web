package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfd009Type;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 通訊中斷後遷出登記DTO
 * 
 * 本作業辦理通訊中斷後之遷出登記
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01380DTO", propOrder = { "moveOutSiteId", "moveType", "originSiteId", "personDataList",
        "originDataList", "selectRegisterList", "originInHousePerson", "inHousePerson", "householdData",
        "newInHousehold", "memberList", "applyPersonList", "commPerson", "enforceApplyPerson", "enforceMode",
        "personNoteList", "householdNoteList", "masterPerson", "openingOperationDTO", "operateDate", "operateTime",
        "removeHouseHoldDate", "removeHouseHoldTime", "originHeadName", "originHeadPersonId", "newHeadName",
        "newHeadPersonId", "isHeadOut", "hasMember", "householdMoveOutFlag", "memberIdList", "otherPersonIdList",
        "personNum", "conCurrentRealHousehold", "conCurrentRealPerson", "substituteFlag", "certificateList",
        "personDataKind", "fineReceiptId", "applyDate", "houseId", "householdType", "concurrentHeadMark", "AcceptSiteIdName" })
@XmlRootElement(name = "Rl01380DTO")
public class Rl01380DTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1;

    @XmlElement(name = "MoveOutSiteId")
    @FieldName("遷出地")
    private String moveOutSiteId;

    @XmlElement(name = "MoveInSiteId")
    @FieldName("遷出地")
    private String moveInSiteId;

    @XmlElement(name = "MoveType")
    @FieldName("申請種類")
    private String moveType;

    @XmlElement(name = "OriginSiteId")
    @FieldName("原住地作業點")
    private String originSiteId;

    @XmlElement(name = "PersonDataList")
    @FieldName("當事人個人資料")
    private List<Rl01380MoveOutDTO> personDataList;

    @XmlElement(name = "OriginDataList")
    @FieldName("原住地個人資料")
    private List<Rl01380OriginDataDTO> originDataList;

    @XmlElement(name = "SelectRegisterList")
    @FieldName("當事人個人記事資料")
    private List<Rl01380MoveOutRegisterDTO> selectRegisterList;

    @XmlElement(name = "OriginInHousePerson")
    @FieldName("原戶長個人資料")
    private XLDFPersonDataDomainObject originInHousePerson;

    @XmlElement(name = "InHousePerson")
    @FieldName("戶長個人資料")
    private XLDFPersonDataDomainObject inHousePerson;

    @XmlElement(name = "HouseholdData")
    @FieldName("原住地原全戶資料")
    private XLDFHouseholdDataDomainObject householdData;

    @XmlElement(name = "NewInHousehold")
    @FieldName("原住地新全戶資料")
    private XLDFHouseholdDataDomainObject newInHousehold;

    @XmlElement(name = "MemberList")
    @FieldName("戶內成員清單")
    private List<Rl01380MemberDTO> memberList;

    @XmlElement(name = "ApplyPersonList")
    @FieldName("申請人資料")
    private List<XLDFApplicantDataDTO> applyPersonList;

    @XmlElement(name = "CommPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO commPerson;

    @XmlElement(name = "EnforceApplyPerson")
    @FieldName("逕為申請人")
    private XldfefaplcType enforceApplyPerson;

    @XmlElement(name = "EnforceMode")
    @FieldName("是否逕為登記")
    private boolean enforceMode;

    @XmlElement(name = "PersonNoteList")
    @FieldName("個人記事清單資料")
    private List<XLDFPersonNoteDomainObject> personNoteList;

    @XmlElement(name = "HouseholdNoteList")
    @FieldName("全戶記事清單資料")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList;

    @XmlElement(name = "MasterPerson")
    @FieldName("大簿當事人個人資料")
    private XLDFPersonDataDomainObject masterPerson;

    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    @XmlElement(name = "OperateDate")
    @FieldName("系統日期")
    private String operateDate;

    @XmlElement(name = "OperateTime")
    @FieldName("系統時間")
    private String operateTime;

    @XmlElement(name = "RemoveHouseHoldDate")
    @FieldName("除戶日期")
    private String removeHouseHoldDate;

    @XmlElement(name = "RemoveHouseHoldTime")
    @FieldName("除戶時間")
    private String removeHouseHoldTime;

    @XmlElement(name = "OriginHeadName")
    @FieldName("原住地原戶長姓名")
    private String originHeadName;

    @XmlElement(name = "OriginHeadPersonId")
    @FieldName("原住地原戶長統號")
    private String originHeadPersonId;

    @XmlElement(name = "NewHeadName")
    @FieldName("原住地新戶長姓名")
    private String newHeadName;

    @XmlElement(name = "NewHeadPersonId")
    @FieldName("原住地新戶長統號")
    private String newHeadPersonId;

    @XmlElement(name = "isHeadOut")
    @FieldName("是否原住地戶長遷出")
    private boolean isHeadOut;

    // @XmlElement(name = "HasMember")
    // @FieldName("是否有戶內成員")
    // private boolean hasMember;

    // @XmlElement(name = "HouseholdMoveOutFlag")
    // @FieldName("全戶遷出旗標")
    // private boolean householdMoveOutFlag;

    @XmlElement(name = "MemberIdList")
    @FieldName("戶內現住人口統號清單")
    private List<String> memberIdList;

    @XmlElement(name = "OtherPersonIdList")
    @FieldName("戶內非現住人口統號清單")
    private List<String> otherPersonIdList;

    @XmlElement(name = "PersonNum")
    @FieldName("現住人口數")
    private String personNum;

    // @XmlElement(name = "ConCurrentRealHousehold")
    // @FieldName("兼任戶長本人全戶資料")
    // private XLDFHouseholdDataDomainObject conCurrentRealHousehold;

    // @XmlElement(name = "ConCurrentRealPerson")
    // @FieldName("兼任戶長本人個人資料")
    // private XLDFPersonDataDomainObject conCurrentRealPerson;

    @XmlElement(name = "SubstituteFlag")
    @FieldName("提供異地辦理旗標")
    private boolean substituteFlag;

    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList;

    @XmlElement(name = "PersonDataKind")
    @FieldName("當事人資料種類")
    private String personDataKind;

    @XmlElement(name = "FineReceiptId")
    @FieldName("收據號碼")
    private String fineReceiptId;

    @XmlElement(name = "FineList")
    @FieldName("罰鍰法令依據清單")
    private List<Rldfd009Type> fineList;

    @XmlElement(name = "FineAmount")
    @FieldName("罰鍰金額")
    private String fineAmount;

    /* ↓↓↓↓↓ 當事人新增視窗 ↓↓↓↓↓ */
    @XmlElement(name = "AddPersonId")
    @FieldName("國民身分證統一編號")
    private String addPersonId;
    /* ↑↑↑↑↑ 當事人新增視窗 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 當事人資料-頁籤 ↓↓↓↓↓ */
    @XmlElement(name = "OrginalSiteId")
    @FieldName("原住地")
    private String orginalSiteId;
    /* ↑↑↑↑↑ 當事人資料-頁籤 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 其他相關申請資料-頁籤 ↓↓↓↓↓ */
    @XmlElement(name = "ApplyDate")
    @FieldName("申請日期")
    private String applyDate;

    @XmlElement(name = "HouseId")
    @FieldName("戶號")
    private String houseId;

    @XmlElement(name = "MoveoutReason")
    @FieldName("遷出原因")
    private String moveoutReason;

    @XmlElement(name = "ApplyRegister")
    @FieldName("(申請書)備註")
    private String applyRegister;

    @XmlElement(name = "MoveInAreaCode")
    @FieldName("遷入地行政區代碼")
    private String moveInAreaCode;

    @XmlElement(name = "MoveInVillage")
    @FieldName("遷入地村里")
    private String moveInVillage;

    @XmlElement(name = "MoveInNeighbor")
    @FieldName("遷入地鄰")
    private String moveInNeighbor;

    @XmlElement(name = "MoveInStreet")
    @FieldName("遷入地門牌號碼")
    private String moveInStreet;

    @XmlElement(name = "MoveInHeadName")
    @FieldName("遷出地戶長姓名")
    private String moveInHeadName;

    @XmlElement(name = "MoveInHeadPersonId")
    @FieldName("遷出地原戶長統號")
    private String moveInHeadPersonId;

    // @XmlElement(name = "DepartDate")
    // @FieldName("出境日期")
    // private String departDate;

    @XmlElement(name = "CheckFine")
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean checkFine;

    @XmlElement(name = "LawDate")
    @FieldName("法定應申報日期")
    private String lawDate;

    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;
    /* ↑↑↑↑↑ 其他相關申請資料-頁籤 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 原住地資料-頁籤 ↓↓↓↓↓ */
    @XmlElement(name = "IsChangeHead")
    @FieldName("換新戶長")
    private boolean isChangeHead;

    @XmlElement(name = "HouseholdType")
    @FieldName("戶別")
    private String householdType;

    @XmlElement(name = "ConcurrentHeadMark")
    @FieldName("兼任戶長註記")
    private String concurrentHeadMark;

    @XmlElement(name = "SelectedOriginDataDTO")
    @FieldName("被挑選的戶長")
    private Rl01380OriginDataDTO selectedOriginDataDTO;

    @XmlElement(name = "ShowSelectHead")
    @FieldName("是否顯示戶長資料")
    private boolean showSelectHead;

    /* ↑↑↑↑↑ 原住地資料-頁籤 ↑↑↑↑↑ */

    /* ↓↓↓↓↓ 戶籍記事／罰鍰清單-頁籤 ↓↓↓↓↓ */
    @XmlElement(name = "IsPunish")
    @FieldName("是否需要罰鍰")
    private boolean isPunish;

    @XmlElement(name = "ModifyToUnPunish")
    @FieldName("改為免罰")
    private boolean modifyToUnPunish;

    @XmlElement(name = "RemoveFeeReason")
    @FieldName("免罰原因")
    private String removeFeeReason;
    
    @XmlElement(name = "AcceptSiteIdName")
    @FieldName("戶政事務所名稱")
    private String acceptSiteIdName;

    /* ↑↑↑↑↑ 戶籍記事／罰鍰清單-頁籤 ↑↑↑↑↑ */

    public String getMoveOutSiteId() {
        return moveOutSiteId;
    }

    public String getAcceptSiteIdName() {
		return acceptSiteIdName;
	}

	public void setAcceptSiteIdName(String acceptSiteIdName) {
		this.acceptSiteIdName = acceptSiteIdName;
	}

	public void setMoveOutSiteId(String moveOutSiteId) {
        this.moveOutSiteId = moveOutSiteId;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    public String getOriginSiteId() {
        return originSiteId;
    }

    public void setOriginSiteId(String originSiteId) {
        this.originSiteId = originSiteId;
    }

    public List<Rl01380MoveOutDTO> getPersonDataList() {
        if (personDataList == null) {
            personDataList = new ArrayList<Rl01380MoveOutDTO>();
        }
        return personDataList;
    }

    public void setPersonDataList(List<Rl01380MoveOutDTO> personDataList) {
        this.personDataList = personDataList;
    }

    public List<Rl01380OriginDataDTO> getOriginDataList() {
        if (originDataList == null) {
            originDataList = new ArrayList<Rl01380OriginDataDTO>();
        }
        return originDataList;
    }

    public void setOriginDataList(List<Rl01380OriginDataDTO> originDataList) {
        this.originDataList = originDataList;
    }

    public List<Rl01380MoveOutRegisterDTO> getSelectRegisterList() {
        if (selectRegisterList == null) {
            selectRegisterList = new ArrayList<Rl01380MoveOutRegisterDTO>();
        }
        return selectRegisterList;
    }

    public void setSelectRegisterList(List<Rl01380MoveOutRegisterDTO> selectRegisterList) {
        this.selectRegisterList = selectRegisterList;
    }

    public XLDFPersonDataDomainObject getOriginInHousePerson() {
        return originInHousePerson;
    }

    public void setOriginInHousePerson(XLDFPersonDataDomainObject originInHousePerson) {
        this.originInHousePerson = originInHousePerson;
    }

    public XLDFPersonDataDomainObject getInHousePerson() {
        return inHousePerson;
    }

    public void setInHousePerson(XLDFPersonDataDomainObject inHousePerson) {
        this.inHousePerson = inHousePerson;
    }

    public XLDFHouseholdDataDomainObject getHouseholdData() {
        return householdData;
    }

    public void setHouseholdData(XLDFHouseholdDataDomainObject householdData) {
        this.householdData = householdData;
    }

    public XLDFHouseholdDataDomainObject getNewInHousehold() {
        return newInHousehold;
    }

    public void setNewInHousehold(XLDFHouseholdDataDomainObject newInHousehold) {
        this.newInHousehold = newInHousehold;
    }

    public List<Rl01380MemberDTO> getMemberList() {
        if (memberList == null) {
            memberList = new ArrayList<Rl01380MemberDTO>();
        }
        return memberList;
    }

    public void setMemberList(List<Rl01380MemberDTO> memberList) {
        this.memberList = memberList;
    }

    public List<XLDFApplicantDataDTO> getApplyPersonList() {
        if (applyPersonList == null) {
            applyPersonList = new ArrayList<XLDFApplicantDataDTO>();
        }
        return applyPersonList;
    }

    public void setApplyPersonList(List<XLDFApplicantDataDTO> applyPersonList) {
        this.applyPersonList = applyPersonList;
    }

    public XLDFPersonBriefDataDTO getCommPerson() {
        return commPerson;
    }

    public void setCommPerson(XLDFPersonBriefDataDTO commPerson) {
        this.commPerson = commPerson;
    }

    public XldfefaplcType getEnforceApplyPerson() {
        return enforceApplyPerson;
    }

    public void setEnforceApplyPerson(XldfefaplcType enforceApplyPerson) {
        this.enforceApplyPerson = enforceApplyPerson;
    }

    public boolean isEnforceMode() {
        return enforceMode;
    }

    public void setEnforceMode(boolean enforceMode) {
        this.enforceMode = enforceMode;
    }

    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        if (personNoteList == null) {
            personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();
        }
        return personNoteList;
    }

    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
    }

    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        if (householdNoteList == null) {
            householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();
        }
        return householdNoteList;
    }

    public void setHouseholdNoteList(List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    public XLDFPersonDataDomainObject getMasterPerson() {
        return masterPerson;
    }

    public void setMasterPerson(XLDFPersonDataDomainObject masterPerson) {
        this.masterPerson = masterPerson;
    }

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getRemoveHouseHoldDate() {
        return removeHouseHoldDate;
    }

    public void setRemoveHouseHoldDate(String removeHouseHoldDate) {
        this.removeHouseHoldDate = removeHouseHoldDate;
    }

    public String getRemoveHouseHoldTime() {
        return removeHouseHoldTime;
    }

    public void setRemoveHouseHoldTime(String removeHouseHoldTime) {
        this.removeHouseHoldTime = removeHouseHoldTime;
    }

    public String getOriginHeadName() {
        return originHeadName;
    }

    public void setOriginHeadName(String originHeadName) {
        this.originHeadName = originHeadName;
    }

    public String getOriginHeadPersonId() {
        return originHeadPersonId;
    }

    public void setOriginHeadPersonId(String originHeadPersonId) {
        this.originHeadPersonId = originHeadPersonId;
    }

    public String getNewHeadName() {
        return newHeadName;
    }

    public void setNewHeadName(String newHeadName) {
        this.newHeadName = newHeadName;
    }

    public String getNewHeadPersonId() {
        return newHeadPersonId;
    }

    public void setNewHeadPersonId(String newHeadPersonId) {
        this.newHeadPersonId = newHeadPersonId;
    }

    public boolean isHeadOut() {
        return isHeadOut;
    }

    public void setHeadOut(boolean isHeadOut) {
        this.isHeadOut = isHeadOut;
    }

    // public boolean isHasMember() {
    // return hasMember;
    // }
    //
    // public void setHasMember(boolean hasMember) {
    // this.hasMember = hasMember;
    // }

    // public boolean isHouseholdMoveOutFlag() {
    // return householdMoveOutFlag;
    // }
    //
    // public void setHouseholdMoveOutFlag(boolean householdMoveOutFlag) {
    // this.householdMoveOutFlag = householdMoveOutFlag;
    // }

    public List<String> getMemberIdList() {
        if (memberIdList == null) {
            memberIdList = new ArrayList<String>();
        }
        return memberIdList;
    }

    public void setMemberIdList(List<String> memberIdList) {
        this.memberIdList = memberIdList;
    }

    public List<String> getOtherPersonIdList() {
        if (otherPersonIdList == null) {
            otherPersonIdList = new ArrayList<String>();
        }
        return otherPersonIdList;
    }

    public void setOtherPersonIdList(List<String> otherPersonIdList) {
        this.otherPersonIdList = otherPersonIdList;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

    // public XLDFHouseholdDataDomainObject getConCurrentRealHousehold() {
    // return conCurrentRealHousehold;
    // }
    //
    // public void setConCurrentRealHousehold(XLDFHouseholdDataDomainObject
    // conCurrentRealHousehold) {
    // this.conCurrentRealHousehold = conCurrentRealHousehold;
    // }

    // public XLDFPersonDataDomainObject getConCurrentRealPerson() {
    // return conCurrentRealPerson;
    // }
    //
    // public void setConCurrentRealPerson(XLDFPersonDataDomainObject
    // conCurrentRealPerson) {
    // this.conCurrentRealPerson = conCurrentRealPerson;
    // }

    public boolean isSubstituteFlag() {
        return substituteFlag;
    }

    public void setSubstituteFlag(boolean substituteFlag) {
        this.substituteFlag = substituteFlag;
    }

    public List<String> getCertificateList() {
        if (certificateList == null) {
            certificateList = new ArrayList<String>();
        }
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getPersonDataKind() {
        return personDataKind;
    }

    public void setPersonDataKind(String personDataKind) {
        this.personDataKind = personDataKind;
    }

    public String getFineReceiptId() {
        return fineReceiptId;
    }

    public void setFineReceiptId(String fineReceiptId) {
        this.fineReceiptId = fineReceiptId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }

    public String getHouseholdType() {
        return householdType;
    }

    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
    }

    public String getConcurrentHeadMark() {
        return concurrentHeadMark;
    }

    public void setConcurrentHeadMark(String concurrentHeadMark) {
        this.concurrentHeadMark = concurrentHeadMark;
    }

    public List<Rldfd009Type> getFineList() {
        if (fineList == null) {
            fineList = new ArrayList<Rldfd009Type>();
        }
        return fineList;
    }

    public void setFineList(List<Rldfd009Type> fineList) {
        this.fineList = fineList;
    }

    public String getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(String fineAmount) {
        this.fineAmount = fineAmount;
    }

    public String getAddPersonId() {
        return addPersonId;
    }

    public void setAddPersonId(String addPersonId) {
        this.addPersonId = addPersonId;
    }

    public String getOrginalSiteId() {
        return orginalSiteId;
    }

    public void setOrginalSiteId(String orginalSiteId) {
        this.orginalSiteId = orginalSiteId;
    }

    public String getMoveoutReason() {
        return moveoutReason;
    }

    public void setMoveoutReason(String moveoutReason) {
        this.moveoutReason = moveoutReason;
    }

    public String getApplyRegister() {
        return applyRegister;
    }

    public void setApplyRegister(String applyRegister) {
        this.applyRegister = applyRegister;
    }

    // public String getDepartDate() {
    // return departDate;
    // }
    //
    // public void setDepartDate(String departDate) {
    // this.departDate = departDate;
    // }

    public String getLawDate() {
        return lawDate;
    }

    public void setLawDate(String lawDate) {
        this.lawDate = lawDate;
    }

    public boolean isChangeHead() {
        return isChangeHead;
    }

    public void setChangeHead(boolean isChangeHead) {
        this.isChangeHead = isChangeHead;
    }

    public boolean isPunish() {
        return isPunish;
    }

    public void setPunish(boolean isPunish) {
        this.isPunish = isPunish;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public Rl01380OriginDataDTO getSelectedOriginDataDTO() {
        return selectedOriginDataDTO;
    }

    public void setSelectedOriginDataDTO(Rl01380OriginDataDTO selectedOriginDataDTO) {
        this.selectedOriginDataDTO = selectedOriginDataDTO;
    }

    public boolean isModifyToUnPunish() {
        return modifyToUnPunish;
    }

    public void setModifyToUnPunish(boolean modifyToUnPunish) {
        this.modifyToUnPunish = modifyToUnPunish;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public boolean isCheckFine() {
        return checkFine;
    }

    public void setCheckFine(boolean checkFine) {
        this.checkFine = checkFine;
    }

    public boolean isShowSelectHead() {
        return showSelectHead;
    }

    public void setShowSelectHead(boolean showSelectHead) {
        this.showSelectHead = showSelectHead;
    }

    public String getMoveInSiteId() {
        return moveInSiteId;
    }

    public void setMoveInSiteId(String moveInSiteId) {
        this.moveInSiteId = moveInSiteId;
    }

    public String getMoveInAreaCode() {
        return moveInAreaCode;
    }

    public void setMoveInAreaCode(String moveInAreaCode) {
        this.moveInAreaCode = moveInAreaCode;
    }

    public String getMoveInVillage() {
        return moveInVillage;
    }

    public void setMoveInVillage(String moveInVillage) {
        this.moveInVillage = moveInVillage;
    }

    public String getMoveInNeighbor() {
        return moveInNeighbor;
    }

    public void setMoveInNeighbor(String moveInNeighbor) {
        this.moveInNeighbor = moveInNeighbor;
    }

    public String getMoveInStreet() {
        return moveInStreet;
    }

    public void setMoveInStreet(String moveInStreet) {
        this.moveInStreet = moveInStreet;
    }

    public String getMoveInHeadName() {
        return moveInHeadName;
    }

    public void setMoveInHeadName(String moveInHeadName) {
        this.moveInHeadName = moveInHeadName;
    }

    public String getMoveInHeadPersonId() {
        return moveInHeadPersonId;
    }

    public void setMoveInHeadPersonId(String moveInHeadPersonId) {
        this.moveInHeadPersonId = moveInHeadPersonId;
    }

}

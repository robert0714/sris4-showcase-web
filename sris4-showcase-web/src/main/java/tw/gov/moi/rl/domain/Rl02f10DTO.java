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
import tw.gov.moi.domain.Rldf2f10Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02f10DTO", propOrder = { "applyKind", "closeMark", "applyName", "resultList", "applyDateStart",
        "applyDateEnd", "applyMemberCnt", "index", "modifyApplyName", "modifyApplyMemberCnt", "applyType", "applyId",
        "applyStreetDoorplate", "applyAreaCode", "applyVillage", "applyNeighbor", "modifyApplyId",
        "modifyApplyStreetDoorplate", "rldf004mAndRldf001mDTO", "modifyApplyType", "modifyApplyAreaCode",
        "modifyApplyVillage", "modifyApplyNeighbor", "applySiteId", "modifyApplySiteId" })
@XmlRootElement(name = "Rl02f10DTO")
public class Rl02f10DTO implements Serializable {

    private static final long serialVersionUID = -3844783072388493702L;

    /** 受理類別. */
    @XmlElement(name = "ApplyKind")
    @FieldName("受理類別")
    private String applyKind = "";

    /** 結案註記. */
    @XmlElement(name = "CloseMark")
    @FieldName("結案註記")
    private String closeMark = "";

    /** 申請人（申請機關）. */
    @XmlElement(name = "ApplyName")
    @FieldName("申請人（申請機關）")
    private String applyName = "";

    /** 大宗戶籍謄本案件檔查詢清單. */
    @XmlElement(name = "ResultList")
    @FieldName("大宗戶籍謄本案件檔查詢清單")
    private List<Rldf2f10Type> resultList = new ArrayList<Rldf2f10Type>();

    /** 受理日期起. */
    @XmlElement(name = "ApplyDateStart")
    @FieldName("受理日期起")
    private String applyDateStart = "";

    /** 受理日期迄. */
    @XmlElement(name = "ApplyDateEnd")
    @FieldName("受理日期迄")
    private String applyDateEnd = "";

    /** 申請人數. */
    @XmlElement(name = "ApplyMemberCnt")
    @FieldName("申請人數")
    private String applyMemberCnt = "";

    /** 大宗戶籍謄本案件檔查詢清單索引. */
    @XmlElement(name = "ApplyMemberCnt")
    @FieldName("大宗戶籍謄本案件檔查詢清單索引")
    private Integer index = 0;

    /** 修改申請人（申請機關）. */
    @XmlElement(name = "ModifyApplyName")
    @FieldName("修改申請人（申請機關）")
    private String modifyApplyName = "";

    /** 修改申請人數. */
    @XmlElement(name = "ModifyApplyMemberCnt")
    @FieldName("修改申請人數")
    private String modifyApplyMemberCnt = "";

    /** 申請人類別. */
    @XmlElement(name = "ApplyType")
    @FieldName("申請人類別")
    private String applyType = "";

    /** 申請人統號. */
    @XmlElement(name = "ApplyId")
    @FieldName("申請人統號")
    private String applyId = "";

    /** 申請人街路門牌. */
    @XmlElement(name = "ApplyStreetDoorplate")
    @FieldName("申請人街路門牌")
    private String applyStreetDoorplate = "";

    /** 申請人行政區域代碼. */
    @XmlElement(name = "ApplyAreaCode")
    @FieldName("申請人行政區域代碼")
    private String applyAreaCode = "";

    /** 申請人村里. */
    @XmlElement(name = "ApplyVillage")
    @FieldName("申請人村里")
    private String applyVillage = "";

    /** 申請人鄰. */
    @XmlElement(name = "ApplyNeighbor")
    @FieldName("申請人鄰")
    private String applyNeighbor = "";

    /** 修改申請人統號. */
    @XmlElement(name = "ModifyApplyId")
    @FieldName("修改申請人統號")
    private String modifyApplyId = "";

    /** 修改申請人街路門牌. */
    @XmlElement(name = "ModifyApplyStreetDoorplate")
    @FieldName("修改申請人街路門牌")
    private String modifyApplyStreetDoorplate = "";

    /** 申請人1M4M資料. */
    @XmlElement(name = "rldf004mAndRldf001mDTO")
    @FieldName("申請人1M4M資料")
    private Rldf004mAndRldf001mDTO rldf004mAndRldf001mDTO;

    /** 修改申請人類別. */
    @XmlElement(name = "ModifyApplyType")
    @FieldName("修改申請人類別")
    private String modifyApplyType = "";

    /** 修改申請人行政區域代碼. */
    @XmlElement(name = "ModifyApplyAreaCode")
    @FieldName("修改申請人行政區域代碼")
    private String modifyApplyAreaCode = "";

    /** 修改申請人村里. */
    @XmlElement(name = "ModifyApplyVillage")
    @FieldName("修改申請人村里")
    private String modifyApplyVillage = "";

    /** 修改申請人鄰. */
    @XmlElement(name = "ModifyApplyNeighbor")
    @FieldName("修改申請人鄰")
    private String modifyApplyNeighbor = "";

    /** 申請人作業點代碼. */
    @XmlElement(name = "ApplySiteId")
    @FieldName("申請人作業點代碼")
    private String applySiteId = "";

    /** 修改申請人作業點代碼. */
    @XmlElement(name = "modifyApplySiteId")
    @FieldName("修改申請人作業點代碼")
    private String modifyApplySiteId = "";

    public String getApplyKind() {
        return applyKind;
    }

    public void setApplyKind(String applyKind) {
        this.applyKind = applyKind;
    }

    public String getCloseMark() {
        return closeMark;
    }

    public void setCloseMark(String closeMark) {
        this.closeMark = closeMark;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public List<Rldf2f10Type> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rldf2f10Type> resultList) {
        this.resultList = resultList;
    }

    public String getApplyDateStart() {
        return applyDateStart;
    }

    public void setApplyDateStart(String applyDateStart) {
        this.applyDateStart = applyDateStart;
    }

    public String getApplyDateEnd() {
        return applyDateEnd;
    }

    public void setApplyDateEnd(String applyDateEnd) {
        this.applyDateEnd = applyDateEnd;
    }

    public String getApplyMemberCnt() {
        return applyMemberCnt;
    }

    public void setApplyMemberCnt(String applyMemberCnt) {
        this.applyMemberCnt = applyMemberCnt;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getModifyApplyName() {
        return modifyApplyName;
    }

    public void setModifyApplyName(String modifyApplyName) {
        this.modifyApplyName = modifyApplyName;
    }

    public String getModifyApplyMemberCnt() {
        return modifyApplyMemberCnt;
    }

    public void setModifyApplyMemberCnt(String modifyApplyMemberCnt) {
        this.modifyApplyMemberCnt = modifyApplyMemberCnt;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyStreetDoorplate() {
        return applyStreetDoorplate;
    }

    public void setApplyStreetDoorplate(String applyStreetDoorplate) {
        this.applyStreetDoorplate = applyStreetDoorplate;
    }

    public String getApplyAreaCode() {
        return applyAreaCode;
    }

    public void setApplyAreaCode(String applyAreaCode) {
        this.applyAreaCode = applyAreaCode;
    }

    public String getApplyVillage() {
        return applyVillage;
    }

    public void setApplyVillage(String applyVillage) {
        this.applyVillage = applyVillage;
    }

    public String getApplyNeighbor() {
        return applyNeighbor;
    }

    public void setApplyNeighbor(String applyNeighbor) {
        this.applyNeighbor = applyNeighbor;
    }

    public String getModifyApplyId() {
        return modifyApplyId;
    }

    public void setModifyApplyId(String modifyApplyId) {
        this.modifyApplyId = modifyApplyId;
    }

    public String getModifyApplyStreetDoorplate() {
        return modifyApplyStreetDoorplate;
    }

    public void setModifyApplyStreetDoorplate(String modifyApplyStreetDoorplate) {
        this.modifyApplyStreetDoorplate = modifyApplyStreetDoorplate;
    }

    public Rldf004mAndRldf001mDTO getRldf004mAndRldf001mDTO() {
        return rldf004mAndRldf001mDTO;
    }

    public void setRldf004mAndRldf001mDTO(Rldf004mAndRldf001mDTO rldf004mAndRldf001mDTO) {
        this.rldf004mAndRldf001mDTO = rldf004mAndRldf001mDTO;
    }

    public String getModifyApplyType() {
        return modifyApplyType;
    }

    public void setModifyApplyType(String modifyApplyType) {
        this.modifyApplyType = modifyApplyType;
    }

    public String getModifyApplyAreaCode() {
        return modifyApplyAreaCode;
    }

    public void setModifyApplyAreaCode(String modifyApplyAreaCode) {
        this.modifyApplyAreaCode = modifyApplyAreaCode;
    }

    public String getModifyApplyVillage() {
        return modifyApplyVillage;
    }

    public void setModifyApplyVillage(String modifyApplyVillage) {
        this.modifyApplyVillage = modifyApplyVillage;
    }

    public String getModifyApplyNeighbor() {
        return modifyApplyNeighbor;
    }

    public void setModifyApplyNeighbor(String modifyApplyNeighbor) {
        this.modifyApplyNeighbor = modifyApplyNeighbor;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getModifyApplySiteId() {
        return modifyApplySiteId;
    }

    public void setModifyApplySiteId(String modifyApplySiteId) {
        this.modifyApplySiteId = modifyApplySiteId;
    }

}

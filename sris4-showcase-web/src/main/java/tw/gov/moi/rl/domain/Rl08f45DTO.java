package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde801wType;

public class Rl08f45DTO {
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteCode;

    @XmlElement(name = "personIdQuery", required = true)
    @FieldName("選舉組合代碼 ")
    private String personIdQuery;

    @XmlElement(name = "personId", required = true)
    @FieldName("選舉組合代碼 ")
    private String personId;
    @XmlElement(name = "passId", required = true)
    @FieldName("選舉組合代碼 ")
    private String passId;//護照號碼
    @XmlElement(name = "voteData", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteData;//第XX任總動副總統選舉
    @XmlElement(name = "acceptName", required = true)
    @FieldName("選舉組合代碼 ")
    private String acceptName;//代收人
    @XmlElement(name = "personName", required = true)
    @FieldName("選舉組合代碼 ")
    private String personName;
    @XmlElement(name = "personName", required = true)
    @FieldName("選舉組合代碼 ")
    private String sex;
    @XmlElement(name = "birthYyymmdd", required = true)
    @FieldName("選舉組合代碼 ")
    private String birthYyymmdd;//出生日期
    @XmlElement(name = "votePoint", required = true)
    @FieldName("選舉組合代碼 ")
    private String votePoint;//投票所
    @XmlElement(name = "village", required = true)
    @FieldName("選舉組合代碼 ")
    private String village;//村里
    @XmlElement(name = "neighbor", required = true)
    @FieldName("選舉組合代碼 ")
    private String neighbor;//鄰
    @XmlElement(name = "streetDoorplate", required = true)
    @FieldName("選舉組合代碼 ")
    private String streetDoorplate;//街路門牌
    @XmlElement(name = "voteDate", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteDate;//投票日期
    @XmlElement(name = "docDate", required = true)
    @FieldName("選舉組合代碼 ")
    private String docDate;//發文日期
    @XmlElement(name = "doc1", required = true)
    @FieldName("選舉組合代碼 ")
    private String doc1;//發文字號1
    @XmlElement(name = "doc2", required = true)
    @FieldName("選舉組合代碼 ")
    private String doc2;//發文字號2
    @XmlElement(name = "applyYes", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean applyYes;//符合規定
    @XmlElement(name = "applyNo", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean applyNo;//不符合規定
    @XmlElement(name = "noReason1", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason1;//不符規定原因1
    @XmlElement(name = "noReason2", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason2;//不符規定原因2
    @XmlElement(name = "noReason3", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason3;//不符規定原因3
    @XmlElement(name = "noReason4", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason4;//不符規定原因4
    @XmlElement(name = "noReason5", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason5;//不符規定原因5
    @XmlElement(name = "noReason6", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason6;//不符規定原因6
    @XmlElement(name = "noReason7", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason7;//不符規定原因7
    @XmlElement(name = "noReason8", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason8;//不符規定原因8
    @XmlElement(name = "noReason9", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason9;//不符規定原因9
    @XmlElement(name = "noReason10", required = true)
    @FieldName("選舉組合代碼 ")
    private boolean noReason10;//不符規定原因10
    @XmlElement(name = "applyNoOther", required = true)
    @FieldName("選舉組合代碼 ")
    private String applyNoOther;//不符規定原因10其他
    @XmlElement(name = "remark", required = true)
    @FieldName("選舉組合代碼 ")
    private String remark;//備註
    @XmlElement(name = "deleteRec", required = true)
    @FieldName("選舉組合代碼 ")
    private String deleteRec;//是否刪除本筆資料
    @XmlElement(name = "rlde801wType", required = true)
    @FieldName("選舉組合代碼 ")
    private Rlde801wType rlde801wType;
    @FieldName("查詢結果 ")
    @XmlElement(name = "Rc0x300ResultList")
    private String reportUrl;
    
    @XmlElement(name = "TitleName", required = true)
    @FieldName("標題名稱")
    private String titleName = "";

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getPersonIdQuery() {
        return personIdQuery;
    }

    public void setPersonIdQuery(String personIdQuery) {
        this.personIdQuery = personIdQuery;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }

    public String getVoteData() {
        return voteData;
    }

    public void setVoteData(String voteData) {
        this.voteData = voteData;
    }

    public String getAcceptName() {
        return acceptName;
    }

    public void setAcceptName(String acceptName) {
        this.acceptName = acceptName;
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

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
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

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getDoc1() {
        return doc1;
    }

    public void setDoc1(String doc1) {
        this.doc1 = doc1;
    }

    public String getDoc2() {
        return doc2;
    }

    public void setDoc2(String doc2) {
        this.doc2 = doc2;
    }

    public boolean isApplyYes() {
        return applyYes;
    }

    public void setApplyYes(boolean applyYes) {
        this.applyYes = applyYes;
    }

    public boolean isApplyNo() {
        return applyNo;
    }

    public void setApplyNo(boolean applyNo) {
        this.applyNo = applyNo;
    }

    public boolean isNoReason1() {
        return noReason1;
    }

    public void setNoReason1(boolean noReason1) {
        this.noReason1 = noReason1;
    }

    public boolean isNoReason2() {
        return noReason2;
    }

    public void setNoReason2(boolean noReason2) {
        this.noReason2 = noReason2;
    }

    public boolean isNoReason3() {
        return noReason3;
    }

    public void setNoReason3(boolean noReason3) {
        this.noReason3 = noReason3;
    }

    public boolean isNoReason4() {
        return noReason4;
    }

    public void setNoReason4(boolean noReason4) {
        this.noReason4 = noReason4;
    }

    public boolean isNoReason5() {
        return noReason5;
    }

    public void setNoReason5(boolean noReason5) {
        this.noReason5 = noReason5;
    }

    public boolean isNoReason6() {
        return noReason6;
    }

    public void setNoReason6(boolean noReason6) {
        this.noReason6 = noReason6;
    }

    public boolean isNoReason7() {
        return noReason7;
    }

    public void setNoReason7(boolean noReason7) {
        this.noReason7 = noReason7;
    }

    public boolean isNoReason8() {
        return noReason8;
    }

    public void setNoReason8(boolean noReason8) {
        this.noReason8 = noReason8;
    }

    public boolean isNoReason9() {
        return noReason9;
    }

    public void setNoReason9(boolean noReason9) {
        this.noReason9 = noReason9;
    }

    public boolean isNoReason10() {
        return noReason10;
    }

    public void setNoReason10(boolean noReason10) {
        this.noReason10 = noReason10;
    }

    public String getApplyNoOther() {
        return applyNoOther;
    }

    public void setApplyNoOther(String applyNoOther) {
        this.applyNoOther = applyNoOther;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleteRec() {
        return deleteRec;
    }

    public void setDeleteRec(String deleteRec) {
        this.deleteRec = deleteRec;
    }

    public Rlde801wType getRlde801wType() {
        return rlde801wType;
    }

    public void setRlde801wType(Rlde801wType rlde801wType) {
        this.rlde801wType = rlde801wType;
    }

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }
    
    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

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
import tw.gov.moi.domain.Rldf018dType;
import tw.gov.moi.rs.domain.TxCodeMsgDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0251zDTO", propOrder = { "householdheadId", "householdId", "seqNo", "applyYyymmdd", "siteId",
        "verifyId", "personIdQueryList", "changeDateList", "verifyList", "queryType", "household18d", "fromHousehold",
        "applyCount" })
@XmlRootElement(name = "Rl0251zDTO")
public class Rl0251zDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 戶長統號
     */
    @XmlElement(name = "HouseholdheadId")
    @FieldName("戶長統號")
    private String householdheadId;

    /**
     * 戶號
     */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /**
     * 流水號
     */
    @XmlElement(name = "SeqNo")
    @FieldName("流水號")
    private String seqNo;

    // 請領日期
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("請領日期")
    private String applyYyymmdd;

    /**
     * 作業點
     */
    @XmlElement(name = "SiteId")
    @FieldName("作業點")
    private String siteId;

    /**
     * 驗證統號
     */
    @XmlElement(name = "VerifyId")
    @FieldName("驗證統號")
    private String verifyId;

    /** 身分證統一編號清單 */
    @XmlElement(name = "PersonIdQueryList")
    @FieldName("身分證統一編號清單")
    private List<String> personIdQueryList = new ArrayList<String>();

    /** 異動資料 */
    @XmlElement(name = "ChangeDateList")
    @FieldName("異動資料")
    private List<Rl0251zChangeDateDTO> changeDateList = new ArrayList<Rl0251zChangeDateDTO>();

    /** 查驗資料 */
    @XmlElement(name = "VerifyList")
    @FieldName("查驗資料")
    private List<TxCodeMsgDTO> verifyList = new ArrayList<TxCodeMsgDTO>();

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType;

    @XmlElement(name = "Household18d")
    @FieldName("請領紀錄(全戶)")
    private Rldf018dType household18d;

    @XmlElement(name = "FromHousehold")
    @FieldName("進入點")
    private boolean fromHousehold;

    /** 戶口名簿戶內人口申請人數. */
    @XmlElement(name = "ApplyCount")
    @FieldName("戶口名簿戶內人口申請人數")
    private String applyCount = "";

    public String getHouseholdheadId() {
        return householdheadId;
    }

    public void setHouseholdheadId(String householdheadId) {
        this.householdheadId = householdheadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getVerifyId() {
        return verifyId;
    }

    public void setVerifyId(String verifyId) {
        this.verifyId = verifyId;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    @Override
    public String toString() {
        return "Rl0251zDTO [householdheadId=" + householdheadId + ", householdId=" + householdId + ", seqNo=" + seqNo
                + ", siteId=" + siteId + ", verifyId=" + verifyId + "]";
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public List<String> getPersonIdQueryList() {
        return personIdQueryList;
    }

    public void setPersonIdQueryList(List<String> personIdQueryList) {
        this.personIdQueryList = personIdQueryList;
    }

    public List<Rl0251zChangeDateDTO> getChangeDateList() {
        return changeDateList;
    }

    public void setChangeDateList(List<Rl0251zChangeDateDTO> changeDateList) {
        this.changeDateList = changeDateList;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public Rldf018dType getHousehold18d() {
        return household18d;
    }

    public void setHousehold18d(Rldf018dType household18d) {
        this.household18d = household18d;
    }

    public boolean isFromHousehold() {
        return fromHousehold;
    }

    public void setFromHousehold(boolean fromHousehold) {
        this.fromHousehold = fromHousehold;
    }

    public List<TxCodeMsgDTO> getVerifyList() {
        return verifyList;
    }

    public void setVerifyList(List<TxCodeMsgDTO> verifyList) {
        this.verifyList = verifyList;
    }

    public String getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(String applyCount) {
        this.applyCount = applyCount;
    }

}

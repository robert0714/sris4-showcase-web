package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0251zWsDTO", propOrder = { "householdheadId", "householdId", "seqNo", "applyYyymmdd", "siteId" })
@XmlRootElement(name = "Rl0251zWsDTO")
public class Rl0251zWsDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8358394021996686093L;

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

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02f30ResultDTO", propOrder = { "applyTxnId", "serialNumber", "personId", "personName", "applyName",
        "applyDate", "applyTime", "feeAmount", "selected", "siteId" })
@XmlRootElement(name = "Rl02f30ResultDTO")
public class Rl02f30ResultDTO implements Serializable {

    private static final long serialVersionUID = -7071408608289899502L;

    /** 交易序號. */
    @XmlElement(name = "ApplyTxnId")
    @FieldName("交易序號")
    private String applyTxnId = "";

    /** 序號. */
    @XmlElement(name = "SerialNumber")
    @FieldName("序號")
    private String serialNumber = "";

    /** 被申請人統號. */
    @XmlElement(name = "PersonId")
    @FieldName("被申請人統號")
    private String personId = "";

    /** 被申請人姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("被申請人姓名")
    private String personName = "";

    /** 申請人. */
    @XmlElement(name = "ApplyName")
    @FieldName("申請人")
    private String applyName = "";

    /** 受理日期. */
    @XmlElement(name = "ApplyDate")
    @FieldName("受理日期")
    private String applyDate = "";

    /** 受理時間. */
    @XmlElement(name = "ApplyTime")
    @FieldName("受理時間")
    private String applyTime = "";

    /** 規費. */
    @XmlElement(name = "FeeAmount")
    @FieldName("規費")
    private Integer feeAmount = 0;

    /** 是否被選取列印. */
    @XmlElement(name = "Selected")
    @FieldName("是否被選取列印")
    private boolean selected = false;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    public String getApplyTxnId() {
        return applyTxnId;
    }

    public void setApplyTxnId(String applyTxnId) {
        this.applyTxnId = applyTxnId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Integer feeAmount) {
        this.feeAmount = feeAmount;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

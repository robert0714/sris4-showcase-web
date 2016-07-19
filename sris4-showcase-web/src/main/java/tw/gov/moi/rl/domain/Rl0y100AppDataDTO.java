package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0y100AppDataDTO", propOrder = { "registerDate", "registerTime", "applyDate",
        "acceptAdminOfficeCode", "orgEducationMark", "saveXldfFlag", "enforcedFlag" })
@XmlRootElement(name = "Rl0y100AppDataDTO")
public class Rl0y100AppDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7867089268706708481L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "registerDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "registerTime", required = false)
    private String registerTime;

    /** 申請日期 */
    @FieldName("申請日期")
    @XmlElement(name = "applyDate", required = false)
    private String applyDate;

    /** 受理地戶所代碼 */
    @FieldName("受理地戶所代碼")
    @XmlElement(name = "acceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "orgEducationMark", required = false)
    private String orgEducationMark;

    /** 暫存旗標 */
    @FieldName("暫存旗標")
    @XmlElement(name = "saveXldfFlag", required = false)
    private Boolean saveXldfFlag;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "enforcedFlag", required = false)
    private String enforcedFlag;

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public Boolean getSaveXldfFlag() {
        return saveXldfFlag;
    }

    public void setSaveXldfFlag(Boolean saveXldfFlag) {
        this.saveXldfFlag = saveXldfFlag;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

}

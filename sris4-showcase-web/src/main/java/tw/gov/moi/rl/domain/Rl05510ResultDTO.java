package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05510ResultDTO", propOrder = { "index", "noticeOption", "personId", "perosnName", "birthYyymmdd",
        "applyYyymmdd", "applyHhmmss", "applyReason", "processStatus", "idCardApplyYyymmdd", "idCardApplyCode",
        "siteId", "areaCode", "settleAdminOfficeCode", "acceptAdminOfficeCode" })
@XmlRootElement(name = "Rl05510ResultDTO")
public class Rl05510ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 */
    @XmlElement(name = "index")
    @FieldName("序號")
    private String index = "";

    /** 是否通報 */
    @XmlElement(name = "noticeOption")
    @FieldName("是否通報")
    private String noticeOption = "";

    /** 統號 */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** 姓名 */
    @XmlElement(name = "personName")
    @FieldName("姓名")
    private String personName = "";

    /** 出生日期 */
    @XmlElement(name = "birthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 受理日期 */
    @XmlElement(name = "applyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd;

    /** 受理時間 */
    @XmlElement(name = "applyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** 申請事由 */
    @XmlElement(name = "applyReason")
    @FieldName("申請事由")
    private String applyReason = "";

    /** 處理狀況 */
    @XmlElement(name = "processStatus")
    @FieldName("處理狀況")
    private String processStatus = "";

    /** 原／異動後領補換日期 */
    @XmlElement(name = "idCardApplyYyymmdd")
    @FieldName("原／異動後領補換日期")
    private String idCardApplyYyymmdd = "";

    /** 原／異動後領補換代碼 */
    @XmlElement(name = "idCardApplyCode")
    @FieldName("原／異動後領補換代碼")
    private String idCardApplyCode = "";

    /** 作業點代碼 */
    @XmlElement(name = "siteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 行政區域代碼 */
    @XmlElement(name = "assignAddr")
    @FieldName("行政區域代碼")
    private String assignAddr = "";

    /** 行政區域代碼 */
    @XmlElement(name = "areaCode")
    @FieldName("行政區域代碼")
    private String areaCode = "";

    /** 戶籍地戶所代碼 */
    @XmlElement(name = "settleAdminOfficeCode")
    @FieldName("戶籍地戶所代碼")
    private String settleAdminOfficeCode = "";

    /** 受理地戶所代碼 */
    @XmlElement(name = "acceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode = "";

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNoticeOption() {
        return noticeOption;
    }

    public void setNoticeOption(String noticeOption) {
        this.noticeOption = noticeOption;
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

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    public void setIdCardApplyCode(String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAssignAddr() {
        return assignAddr;
    }

    public void setAssignAddr(String assignAddr) {
        this.assignAddr = assignAddr;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getSettleAdminOfficeCode() {
        return settleAdminOfficeCode;
    }

    public void setSettleAdminOfficeCode(String settleAdminOfficeCode) {
        this.settleAdminOfficeCode = settleAdminOfficeCode;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

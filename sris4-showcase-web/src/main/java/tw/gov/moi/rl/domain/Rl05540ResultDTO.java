package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05540ResultDTO", propOrder = { "index", "noticeOption", "personId", "perosnName", "birthYyymmdd",
        "applyYyymmdd", "applyHhmmss", "applyReason", "processStatus", "idCardApplyYyymmdd", "idCardApplyCode",
        "siteId", "areaCode", "settleAdminOfficeCode", "acceptAdminOfficeCode", "cardNo", "cellophaneNo",
        "currentYyymmdd", "currentHhmmss", "currentSiteId", "imageFlag", "nophotoReason" })
@XmlRootElement(name = "Rl05540ResultDTO")
public class Rl05540ResultDTO implements Serializable {

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
    @FieldName("受理時間 ")
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

    /** 空白證號 */
    @XmlElement(name = "cardNo")
    @FieldName("空白證號")
    private String cardNo = "";

    /** 膠膜號 */
    @XmlElement(name = "cellophaneNo")
    @FieldName("膠膜號")
    private String cellophaneNo = "";

    /** 最新受理日期 */
    @XmlElement(name = "currentYyymmdd")
    @FieldName("最新受理日期")
    private String currentYyymmdd = "";

    /** 最新受理時間 */
    @XmlElement(name = "currentHhmmss")
    @FieldName("最新受理時間")
    private String currentHhmmss = "";

    /** 最新紀錄所在發證機關 */
    @XmlElement(name = "currentSiteId")
    @FieldName("最新紀錄所在發證機關")
    private String currentSiteId = "";

    /** 相片列印方式 */
    @XmlElement(name = "imageFlag")
    @FieldName("相片列印方式")
    private String imageFlag = "";

    /** 免列印相片原因 */
    @XmlElement(name = "nophotoReason")
    @FieldName("免列印相片原因")
    private String nophotoReason = "";

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCellophaneNo() {
        return cellophaneNo;
    }

    public void setCellophaneNo(String cellophaneNo) {
        this.cellophaneNo = cellophaneNo;
    }

    public String getCurrentYyymmdd() {
        return currentYyymmdd;
    }

    public void setCurrentYyymmdd(String currentYyymmdd) {
        this.currentYyymmdd = currentYyymmdd;
    }

    public String getCurrentHhmmss() {
        return currentHhmmss;
    }

    public void setCurrentHhmmss(String currentHhmmss) {
        this.currentHhmmss = currentHhmmss;
    }

    public String getCurrentSiteId() {
        return currentSiteId;
    }

    public void setCurrentSiteId(String currentSiteId) {
        this.currentSiteId = currentSiteId;
    }

    public String getImageFlag() {
        return imageFlag;
    }

    public void setImageFlag(String imageFlag) {
        this.imageFlag = imageFlag;
    }

    public String getNophotoReason() {
        return nophotoReason;
    }

    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

}

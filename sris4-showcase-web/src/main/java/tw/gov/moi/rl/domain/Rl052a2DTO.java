package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * The Class Rl052a2DTO.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl052a2DTO", propOrder = { "beginYyymmddS", "beginYyymmddE", "processStatus", "noMaritalStatusFlag",
        "pendingFlag", "announceYyymmddS", "announceYyymmddE", "noRegReason", "reportFormat", "selectRadio" })
@XmlRootElement(name = "Rl052a2DTO")
public class Rl052a2DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 通報處理日期起 */
    @XmlElement(name = "BeginYyymmddS", required = true)
    @FieldName("通報處理日期起")
    private String beginYyymmddS;

    /** 通報處理日期迄 */
    @XmlElement(name = "BeginYyymmddE", required = true)
    @FieldName("通報處理日期迄 ")
    private String beginYyymmddE;

    /** 處理狀況 */
    @XmlElement(name = "ProcessStatus", required = true)
    @FieldName("處理狀況")
    private String processStatus;

    /** 不列印未辦原因為婚姻狀況證明 */
    @XmlElement(name = "NoMaritalStatusFlag", required = true)
    @FieldName("不列印未辦原因為婚姻狀況證明")
    private String noMaritalStatusFlag;

    /** 未結案未催告 */
    @XmlElement(name = "PendingFlag", required = true)
    @FieldName("未結案未催告")
    private String pendingFlag;

    /** 催告日期起 */
    @XmlElement(name = "AnnounceYyymmddS", required = true)
    @FieldName("催告日期起")
    private String announceYyymmddS;

    /** 催告日期迄 */
    @XmlElement(name = "AnnounceYyymmddE", required = true)
    @FieldName("催告日期迄")
    private String announceYyymmddE;

    /** 未辦原因 */
    @XmlElement(name = "NoRegReason", required = true)
    @FieldName("未辦原因")
    private String noRegReason;

    /** 另存檔案格式 */
    @XmlElement(name = "ReportFormat", required = true)
    @FieldName("另存檔案格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 儲存選擇radio使用 */
    @XmlElement(name = "SelectRadio", required = true)
    @FieldName("儲存選擇radio使用")
    private String selectRadio;

    /**
     * Get the beginYyymmddS
     * 
     * @return the beginYyymmddS
     */
    public String getBeginYyymmddS() {
        return beginYyymmddS;
    }

    /**
     * Set the beginYyymmddS
     * 
     * @param beginYyymmddS
     *            the beginYyymmddS to set
     */
    public void setBeginYyymmddS(String beginYyymmddS) {
        this.beginYyymmddS = beginYyymmddS;
    }

    /**
     * Get the beginYyymmddE
     * 
     * @return the beginYyymmddE
     */
    public String getBeginYyymmddE() {
        return beginYyymmddE;
    }

    /**
     * Set the beginYyymmddE
     * 
     * @param beginYyymmddE
     *            the beginYyymmddE to set
     */
    public void setBeginYyymmddE(String beginYyymmddE) {
        this.beginYyymmddE = beginYyymmddE;
    }

    /**
     * Get the processStatus
     * 
     * @return the processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Set the processStatus
     * 
     * @param processStatus
     *            the processStatus to set
     */
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * Get the noMaritalStatusFlag
     * 
     * @return the noMaritalStatusFlag
     */
    public String getNoMaritalStatusFlag() {
        return noMaritalStatusFlag;
    }

    /**
     * Set the noMaritalStatusFlag
     * 
     * @param noMaritalStatusFlag
     *            the noMaritalStatusFlag to set
     */
    public void setNoMaritalStatusFlag(String noMaritalStatusFlag) {
        this.noMaritalStatusFlag = noMaritalStatusFlag;
    }

    /**
     * Get the pendingFlag
     * 
     * @return the pendingFlag
     */
    public String getPendingFlag() {
        return pendingFlag;
    }

    /**
     * Set the pendingFlag
     * 
     * @param pendingFlag
     *            the pendingFlag to set
     */
    public void setPendingFlag(String pendingFlag) {
        this.pendingFlag = pendingFlag;
    }

    /**
     * Get the announceYyymmddS
     * 
     * @return the announceYyymmddS
     */
    public String getAnnounceYyymmddS() {
        return announceYyymmddS;
    }

    /**
     * Set the announceYyymmddS
     * 
     * @param announceYyymmddS
     *            the announceYyymmddS to set
     */
    public void setAnnounceYyymmddS(String announceYyymmddS) {
        this.announceYyymmddS = announceYyymmddS;
    }

    /**
     * Get the announceYyymmddE
     * 
     * @return the announceYyymmddE
     */
    public String getAnnounceYyymmddE() {
        return announceYyymmddE;
    }

    /**
     * Set the announceYyymmddE
     * 
     * @param announceYyymmddE
     *            the announceYyymmddE to set
     */
    public void setAnnounceYyymmddE(String announceYyymmddE) {
        this.announceYyymmddE = announceYyymmddE;
    }

    /**
     * Get the noRegReason
     * 
     * @return the noRegReason
     */
    public String getNoRegReason() {
        return noRegReason;
    }

    /**
     * Set the noRegReason
     * 
     * @param noRegReason
     *            the noRegReason to set
     */
    public void setNoRegReason(String noRegReason) {
        this.noRegReason = noRegReason;
    }

    /**
     * Get the reportFormat
     * 
     * @return the reportFormat
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * Set the reportFormat
     * 
     * @param reportFormat
     *            the reportFormat to set
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * Get the selectRadio
     * 
     * @return the selectRadio
     */
    public String getSelectRadio() {
        return selectRadio;
    }

    /**
     * Set the selectRadio
     * 
     * @param selectRadio
     *            the selectRadio to set
     */
    public void setSelectRadio(String selectRadio) {
        this.selectRadio = selectRadio;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}

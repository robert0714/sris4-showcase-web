package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 列印未校正人口名冊處理服務.
 * 
 * @author Derek Wang
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07270DTO", propOrder = { "verifyUserId", "result", "adjustYear", "reportType", "reportURL" })
@XmlRootElement(name = "Rl07270DTO")
public class Rl07270DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 驗證使用者ID */
    @XmlElement(name = "VerifyUserId")
    @FieldName("驗證使用者ID")
    private String verifyUserId;

    /** result */
    @XmlElement(name = "Result")
    @FieldName("result")
    private String result;

    /** 校正年份 */
    @XmlElement(name = "AdjustYear")
    @FieldName("校正年份")
    private String adjustYear;

    /** 報表格式 */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * @return the verifyUserId
     */
    public String getVerifyUserId() {
        return verifyUserId;
    }

    /**
     * @param verifyUserId
     *            the verifyUserId to set
     */
    public void setVerifyUserId(String verifyUserId) {
        this.verifyUserId = verifyUserId;
    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result
     *            the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the adjustYear
     */
    public String getAdjustYear() {
        return adjustYear;
    }

    /**
     * @param adjustYear
     *            the adjustYear to set
     */
    public void setAdjustYear(String adjustYear) {
        this.adjustYear = adjustYear;
    }

    /**
     * @return the reportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType
     *            the reportType to set
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * @return the reportURL
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * @param reportURL
     *            the reportURL to set
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}

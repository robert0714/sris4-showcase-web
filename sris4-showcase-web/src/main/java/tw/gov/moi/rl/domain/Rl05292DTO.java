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
import tw.gov.moi.domain.Rldf048mType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05292DTO", propOrder = { "Select", "PersonId", "LoginFromDate", "LoginToDate", "DetailResult", "ReportFormat", "FileURL", "ReportUrl" })
@XmlRootElement(name = "Rl05292DTO")
public class Rl05292DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 預設為統一編號 */
    @XmlElement(name = "Select")
    @FieldName("查詢條件")
    private String select = RlConstant.STRING_TWO;

    /** 國民身分證 */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證")
    private String personId;

    /** loginFromDate */
    @XmlElement(name = "LoginFromDate")
    @FieldName("loginFromDate")
    private String loginFromDate;

    /** loginToDate */
    @XmlElement(name = "LoginToDate")
    @FieldName("loginToDate")
    private String loginToDate;

    /** detailResult */
    @XmlElement(name = "DetailResult")
    @FieldName("detailResult")
    private List<Rldf048mType> detailResult = new ArrayList<Rldf048mType>();

    @XmlElement(name = "ReportFormat")
    @FieldName("reportFormat")
    private String reportFormat = "";

    @XmlElement(name = "FileURL")
    @FieldName("fileURL")
    private String fileURL = "";

    @XmlElement(name = "ReportUrl")
    @FieldName("reportUrl")
    private String reportUrl = "";

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<Rldf048mType> getDetailResult() {
        return detailResult;
    }

    public void setDetailResult(List<Rldf048mType> detailResult) {
        this.detailResult = detailResult;
    }

    public String getLoginFromDate() {
        return loginFromDate;
    }

    public void setLoginFromDate(String loginFromDate) {
        this.loginFromDate = loginFromDate;
    }

    public String getLoginToDate() {
        return loginToDate;
    }

    public void setLoginToDate(String loginToDate) {
        this.loginToDate = loginToDate;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    @Override
    public String toString() {
        return "Rl05292DTO [select=" + select + ", personId=" + personId + ", loginFromDate=" + loginFromDate + ", loginToDate=" + loginToDate + ", detailResult=" + detailResult + ", reportFormat=" + reportFormat + ", fileURL=" + fileURL + ", reportUrl=" + reportUrl + "]";
    }

}

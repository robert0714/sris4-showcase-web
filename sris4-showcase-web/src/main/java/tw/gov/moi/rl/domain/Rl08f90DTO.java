package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f90DTO", propOrder = { "labelHead", "voteCode", "voteDate", "votePointStart", "votePointEnd",
        "countyCode", "reportDate", "reportName", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08f90DTO")
public class Rl08f90DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題 */
    @XmlElement(name = "labelHead")
    @FieldName("標題")
    private String labelHead;

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 投票所(起) */
    @XmlElement(name = "votePointStart")
    @FieldName("投票所(起)")
    private String votePointStart;

    /** 投票所(迄) */
    @XmlElement(name = "votePointEnd")
    @FieldName("投票所(迄)")
    private String votePointEnd;

    /** 遷出地省市縣市代碼 */
    @XmlElement(name = "countyCode")
    @FieldName("遷出地省市縣市代碼")
    private String countyCode;

    /** 製表日期 */
    @XmlElement(name = "reportDate")
    @FieldName("製表日期")
    private String reportDate;

    /** 報表名稱 */
    @XmlElement(name = "reportName")
    @FieldName("報表名稱")
    private String reportName;

    /** 檔案格式 */
    @XmlElement(name = "reportFormat")
    @FieldName("檔案格式")
    private String reportFormat;

    /** 回傳PDF URL */
    @XmlElement(name = "reportURL")
    @FieldName("回傳PDF URL")
    private String reportURL;

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String getVotePointStart() {
        return votePointStart;
    }

    public void setVotePointStart(String votePointStart) {
        this.votePointStart = votePointStart;
    }

    public String getVotePointEnd() {
        return votePointEnd;
    }

    public void setVotePointEnd(String votePointEnd) {
        this.votePointEnd = votePointEnd;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl052501DTO
 * 
 * @author Alan Lo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05250DTO", propOrder = { "printType", "noticeDataStart", "noticeDataEnd", "reportType",
        "reportFormat", "fileURL", "reportURL" })
@XmlRootElement(name = "Rl05250")
public class Rl05250DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 頁面選項 */
    @XmlElement(name = "PrintType")
    @FieldName("頁面選項")
    private String printType;

    /** 通報日期起日 */
    @XmlElement(name = "NoticeDataStart")
    @FieldName("通報日期起日")
    private String noticeDataStart;

    /** 通報日期迄日 */
    @XmlElement(name = "NoticeDataEnd")
    @FieldName("通報日期迄日")
    private String noticeDataEnd;

    /** 報表格式 */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 檔案格式：頁面檔案格式欄位. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式：頁面檔案格式欄位")
    private String reportFormat;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 接ReportingComponet回傳的報表位置. */
    @XmlElement(name = "ReportURL")
    @FieldName("接ReportingComponet回傳的報表位置")
    private String reportURL;

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getNoticeDataStart() {
        return noticeDataStart;
    }

    public void setNoticeDataStart(String noticeDataStart) {
        this.noticeDataStart = noticeDataStart;
    }

    public String getNoticeDataEnd() {
        return noticeDataEnd;
    }

    public void setNoticeDataEnd(String noticeDataEnd) {
        this.noticeDataEnd = noticeDataEnd;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);

    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089b0DTO", propOrder = { "startYyymmdd", "endYyymmdd", "sortBy", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl089b0DTO")
public class Rl089b0DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 登記日期(起). */
    @XmlElement(name = "StartYYYMMDD")
    @FieldName("登記日期(起)")
    private String startYyymmdd;

    /** 登記日期(迄). */
    @XmlElement(name = "EndYYYMMDD")
    @FieldName("登記日期(迄)")
    private String endYyymmdd;

    /** 排序方式. */
    @XmlElement(name = "SortBy")
    @FieldName("排序方式")
    private String sortBy;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    public String getStartYyymmdd() {
        return startYyymmdd;
    }

    public void setStartYyymmdd(String startYyymmdd) {
        this.startYyymmdd = startYyymmdd;
    }

    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
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

}

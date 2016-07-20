package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08330DTO", propOrder = { "dataYear", "dataMonth", "dataDay", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08330DTO")
public class Rl08330DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 資料日期(年) */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期(年)")
    private String dataYear;

    /** 資料日期(月) */
    @XmlElement(name = "DataMonth")
    @FieldName("資料日期(月)")
    private String dataMonth;

    /** 資料日期(月) */
    @XmlElement(name = "DataDay")
    @FieldName("資料日期(月)")
    private String dataDay;

    /** 報表格式 */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表URL */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(final String dataYear) {
        this.dataYear = dataYear;
    }

    public String getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(final String dataMonth) {
        this.dataMonth = dataMonth;
    }

    public String getDataDay() {
        return dataDay;
    }

    public void setDataDay(String dataDay) {
        this.dataDay = dataDay;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(final String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }
}

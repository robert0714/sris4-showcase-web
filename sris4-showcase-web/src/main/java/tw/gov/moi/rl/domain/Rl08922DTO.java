package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl08922DTO
 * 
 * @author Alan Lo
 */
public class Rl08922DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 資料日期（年月） */
    @XmlElement(name = "DataYearMonth")
    @FieldName("資料日期（年月）")
    private String dataYearMonth;

    /** 資料日期（年） */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期（年）")
    private String dataYear;

    /** 資料日期（月） */
    @XmlElement(name = "DataMonth")
    @FieldName("資料日期（月）")
    private String dataMonth;

    /** 另存檔案格式 */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

    /** 報表網址 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表網址")
    private String reportUrl;

    public String getDataYearMonth() {
        return dataYearMonth;
    }

    public void setDataYearMonth(String dataYearMonth) {
        this.dataYearMonth = dataYearMonth;
    }

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    public String getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(String dataMonth) {
        this.dataMonth = dataMonth;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}

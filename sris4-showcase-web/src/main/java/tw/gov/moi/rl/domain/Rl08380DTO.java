package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08380DTO", propOrder = { "option", "reportFormat", "reportURL", "isNotice", "dataYear", "dataMonth",
        "dataDay" })
@XmlRootElement(name = "Rl08380DTO")
public class Rl08380DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    @XmlElement(name = "Option")
    @FieldName("選擇項目")
    private String option;

    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /** 是否通報. */
    @XmlElement(name = "IsNotice", required = true)
    @FieldName("是否通報")
    private String isNotice = "";

    /** 資料日期(年) */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期(年)")
    private String dataYear;

    // /** 資料日期(月) */
    // @XmlElement(name = "DataMonth")
    // @FieldName("資料日期(月)")
    // private String dataMonth;
    //
    // /** 資料日期(月) */
    // @XmlElement(name = "DataDay")
    // @FieldName("資料日期(月)")
    // private String dataDay;

    public String getOption() {
        return option;
    }

    public void setOption(final String option) {
        this.option = option;
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

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    // public String getDataMonth() {
    // return dataMonth;
    // }
    //
    // public void setDataMonth(String dataMonth) {
    // this.dataMonth = dataMonth;
    // }
    //
    // public String getDataDay() {
    // return dataDay;
    // }
    //
    // public void setDataDay(String dataDay) {
    // this.dataDay = dataDay;
    // }
}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08b40DTO", propOrder = { "reportType", "dataYear", "dataMonth" })
@XmlRootElement(name = "Rl08b40DTO")
public class Rl08b40DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 報表格式 */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式 ")
    private String reportType;

    /** 資料日期(年) */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期(年)")
    private String dataYear;

    /** 資料日期(月) */
    @XmlElement(name = "DataMonth")
    @FieldName("資料日期(月)")
    private String dataMonth;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
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
}

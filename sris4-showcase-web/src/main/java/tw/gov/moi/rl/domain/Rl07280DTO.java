package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 列印戶口校正成果統計表處理.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07280DTO", propOrder = { "adjustYear", "printType", "reportType", "reportURL" })
public class Rl07280DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6292519506293759409L;

    /** 校正年份 */
    @FieldName("校正年份")
    @XmlElement(name = "AdjustYear", required = false)
    private String adjustYear;

    /** 列印類別 */
    @FieldName("列印類別")
    @XmlElement(name = "PrintType", required = false)
    private String printType;

    /** 報表格式 */
    @FieldName("報表格式")
    @XmlElement(name = "ReportType", required = false)
    private String reportType;

    /** 報表路徑 */
    @FieldName("報表路徑")
    @XmlElement(name = "ReportURL", required = false)
    private String reportURL;

    public String getAdjustYear() {
        return adjustYear;
    }

    public void setAdjustYear(String adjustYear) {
        this.adjustYear = adjustYear;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}

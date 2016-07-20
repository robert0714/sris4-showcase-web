package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 製作戶口校正未接受校正人口數及其原因統計表處理.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07290DTO", propOrder = { "adjustYear", "printType", "isSendMessage", "reportType", "reportURL" })
public class Rl07290DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5266426009927133983L;

    /** 校正年份 */
    @FieldName("校正年份")
    @XmlElement(name = "AdjustYear", required = false)
    private String adjustYear;

    /** 列印類別 */
    @FieldName("列印類別")
    @XmlElement(name = "PrintType", required = false)
    private String printType;

    /** 是否通報 */
    @FieldName("是否通報 ")
    @XmlElement(name = "IsSendMessage", required = false)
    private String isSendMessage;

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

    public String getIsSendMessage() {
        return isSendMessage;
    }

    public void setIsSendMessage(String isSendMessage) {
        this.isSendMessage = isSendMessage;
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

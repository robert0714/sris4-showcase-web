package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl08942DTO
 * 
 * @author Alan Lo
 */
public class Rl08942DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 資料日期(年) */
    @XmlElement(name = "DataYear")
    @FieldName("資料日期(年)")
    private String dataYear;

    /** 資料日期(月) */
    @XmlElement(name = "DataMonth")
    @FieldName("資料日期(月)")
    private String dataMonth;

    /** 是否通報 */
    @XmlElement(name = "IsNotice")
    @FieldName("是否通報")
    private String isNotice;

    /** 另存檔案格式 */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

    /** 報表網址 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表網址")
    private String reportUrl;

    /** 縣市. */
    @XmlElement(name = "PrintCountyArea")
    @FieldName("縣市")
    private String printCountyArea;

    /** 鄉鎮市區. */
    @XmlElement(name = "PrintTownArea")
    @FieldName("鄉鎮市區")
    private String printTownArea;

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

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
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

    public String getPrintCountyArea() {
        return printCountyArea;
    }

    public void setPrintCountyArea(String printCountyArea) {
        this.printCountyArea = printCountyArea;
    }

    public String getPrintTownArea() {
        return printTownArea;
    }

    public void setPrintTownArea(String printTownArea) {
        this.printTownArea = printTownArea;
    }

}

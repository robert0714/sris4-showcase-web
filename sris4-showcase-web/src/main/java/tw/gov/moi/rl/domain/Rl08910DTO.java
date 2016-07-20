package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 核准更改姓名通報單.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08910DTO", propOrder = { "docNo", "dateStart", "dateEnd", "changePage", "reportType", "reportURL" })
@XmlRootElement(name = "Rl08910DTO")
public class Rl08910DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 字號(起) */
    @FieldName("字號(起)")
    @XmlElement(name = "DocNo", required = false)
    private String docNo;

    /** 更改期間(起) */
    @FieldName("更改期間(起)")
    @XmlElement(name = "DateStart", required = false)
    private String dateStart;

    /** 更改期間(迄) */
    @FieldName("更改期間(迄)")
    @XmlElement(name = "DateEnd", required = false)
    private String dateEnd;

    /** 是否依更改日期跳頁 */
    @FieldName("是否依更改日期跳頁")
    @XmlElement(name = "ChangePage", required = false)
    private String changePage = "N";

    /** 報表格式 */
    @FieldName("報表格式 ")
    @XmlElement(name = "ReportType", required = false)
    private String reportType;

    /** 報表路徑 */
    @FieldName("報表路徑")
    @XmlElement(name = "ReportURL", required = false)
    private String reportURL;

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getChangePage() {
        return changePage;
    }

    public void setChangePage(String changePage) {
        this.changePage = changePage;
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

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01450DTO", propOrder = { "specialMark", "isPrint", "reportName", "reportUrl" })
@XmlRootElement(name = "Rl01450")
public class Rl01450DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 特殊註記 */
    @XmlElement(name = "SpecialMark")
    @FieldName("特殊註記")
    private String specialMark = "";

    /** 是否列印 */
    @XmlElement(name = "IsPrint")
    @FieldName("是否列印")
    private String isPrint = RlConstant.YES_CHAR;

    /** 報表名稱. */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "RLRP01450";

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    public String getIsPrint() {
        return isPrint;
    }

    public void setIsPrint(String isPrint) {
        this.isPrint = isPrint;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}

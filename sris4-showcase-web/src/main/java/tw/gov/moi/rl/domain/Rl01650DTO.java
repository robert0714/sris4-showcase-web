package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 製作門牌改編通報單.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01650DTO", propOrder = { "modifyDate", "modifyBatch", "modifyKind", "reportType", "reportURL" })
@XmlRootElement(name = "Rl01650DTO")
public class Rl01650DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1585962737961943208L;

    /** 編釘日期 */
    @FieldName("編釘日期 ")
    @XmlElement(name = "ModifyDate", required = false)
    private String modifyDate;

    /** 編釘批號 */
    @FieldName("編釘批號 ")
    @XmlElement(name = "ModifyBatch", required = false)
    private String modifyBatch;

    /** 申請種類 */
    @FieldName("申請種類 ")
    @XmlElement(name = "ModifyKind", required = false)
    private String modifyKind;

    /** 報表格式 */
    @FieldName("報表格式 ")
    @XmlElement(name = "ReportType", required = false)
    private String reportType;

    /** 報表路徑 */
    @FieldName("報表路徑 ")
    @XmlElement(name = "ReportURL", required = false)
    private String reportURL;

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
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

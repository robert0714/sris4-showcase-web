package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 製作門牌編釘報告表.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01640DTO", propOrder = { "registerKindCode", "registerDate_s", "registerDate_e", "registerBatch",
        "reportType", "reportURL" })
@XmlRootElement(name = "Rl01640DTO")
public class Rl01640DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6260712318654389700L;
    /** 編釘種類代號 */
    @FieldName("編釘種類代號 ")
    @XmlElement(name = "RegisterKindCode", required = false)
    private String registerKindCode;

    /** 編釘起始日期 */
    @FieldName("編釘起始日期 ")
    @XmlElement(name = "RegisterDate_s", required = false)
    private String registerDate_s;

    /** 編釘迄止日期 */
    @FieldName("編釘迄止日期  ")
    @XmlElement(name = "RegisterDate_e", required = false)
    private String registerDate_e;

    /** 編釘批號 */
    @FieldName("編釘批號 ")
    @XmlElement(name = "RegisterBatch", required = false)
    private String registerBatch;

    /** 報表格式 */
    @FieldName("報表格 ")
    @XmlElement(name = "ReportType", required = false)
    private String reportType;

    /** 報表路徑 */
    @FieldName("報表路徑 ")
    @XmlElement(name = "ReportURL", required = false)
    private String reportURL;

    private String reportyKey;

    public String getRegisterKindCode() {
        return registerKindCode;
    }

    public void setRegisterKindCode(String registerKindCode) {
        this.registerKindCode = registerKindCode;
    }

    public String getRegisterDate_s() {
        return registerDate_s;
    }

    public void setRegisterDate_s(String registerDate_s) {
        this.registerDate_s = registerDate_s;
    }

    public String getRegisterDate_e() {
        return registerDate_e;
    }

    public void setRegisterDate_e(String registerDate_e) {
        this.registerDate_e = registerDate_e;
    }

    public String getRegisterBatch() {
        return registerBatch;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
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

    public String getReportyKey() {
        return reportyKey;
    }

    public void setReportyKey(String reportyKey) {
        this.reportyKey = reportyKey;
    }

    @Override
    public String toString() {
        return "Rl01640DTO [registerKindCode=" + registerKindCode + " registerDate_s=" + registerDate_s
                + ", registerDate_e=" + registerDate_e + ", registerBatch=" + registerBatch + ", reportType="
                + reportType + ", reportURL=" + reportURL + "]";
    }

}

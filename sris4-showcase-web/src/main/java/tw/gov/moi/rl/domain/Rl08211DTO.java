package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08211DTO", propOrder = { "statYear", "applyList", "status", "reportURL" })
@XmlRootElement(name = "Rl08211DTO")
public class Rl08211DTO implements Serializable {

    private static final long serialVersionUID = 1652284573644087246L;

    /** 資料年份. */
    @XmlElement(name = "StatYear")
    @FieldName("資料年份")
    private String statYear;

    /** 申請書項目. */
    @XmlElement(name = "Apply")
    @FieldName("申請書項目")
    private List<String> applyList = new ArrayList<String>();

    /** 紀錄狀態. */
    @XmlElement(name = "Status")
    @FieldName("紀錄狀態")
    private boolean status = false;

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    public String getStatYear() {
        return statYear;
    }

    public void setStatYear(String statYear) {
        this.statYear = statYear;
    }

    /**
     * Get the status
     * 
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Set the status
     * 
     * @param status
     *            the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public List<String> getApplyList() {
        return applyList;
    }

    public void setApplyList(List<String> applyList) {
        this.applyList = applyList;
    }

}

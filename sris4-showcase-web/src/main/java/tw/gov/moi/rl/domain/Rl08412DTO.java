package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl08412DTO
 * 
 * @author Alan Lo
 */
public class Rl08412DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 學區名稱 */
    @XmlElement(name = "School")
    @FieldName("學區名稱")
    private String school;

    /** 另存檔案格式 */
    @XmlElement(name = "ReportType")
    @FieldName("另存檔案格式")
    private String reportType;

    /** 報表網址 */
    @XmlElement(name = "ReportUrl")
    @FieldName("reportType")
    private String reportUrl;

    /** 學區名稱List. */
    @XmlElement(name = "SchoolZoneList")
    @FieldName("學區名稱List")
    private List<String> schoolZoneList;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public List<String> getSchoolZoneList() {
        if (schoolZoneList == null) {
            schoolZoneList = new ArrayList<String>();
        }
        return schoolZoneList;
    }

    public void setSchoolZoneList(List<String> schoolZoneList) {
        this.schoolZoneList = schoolZoneList;
    }
}

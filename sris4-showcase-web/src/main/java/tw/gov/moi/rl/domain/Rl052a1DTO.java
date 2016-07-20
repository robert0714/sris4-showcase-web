package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl052a1DTO", propOrder = { "reportURL" })
@XmlRootElement(name = "Rl052a1DTO")
public class Rl052a1DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}

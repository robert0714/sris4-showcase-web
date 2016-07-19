package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07112DTO", propOrder = { "village", "neighborStart", "neighborEnd", "yyymmdd", "reportFormat",
        "reportUrl", "fileUrl" })
@XmlRootElement(name = "Rl07112DTO")
public class Rl07112DTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 村里 */
    @XmlElement(name = "village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰起 */
    @XmlElement(name = "neighborStart", required = true)
    @FieldName("鄰起 ")
    private String neighborStart;

    /** 鄰迄 */
    @XmlElement(name = "neighborEnd", required = true)
    @FieldName("鄰迄")
    private String neighborEnd;

    /** 轉入日期 */
    @XmlElement(name = "yyymmdd", required = true)
    @FieldName("轉入日期 ")
    private String yyymmdd;

    @XmlElement(name = "reportFormat", required = true)
    @FieldName("檔案格式")
    private String reportFormat;

    @XmlElement(name = "reportUrl", required = true)
    @FieldName("報表URL")
    private String reportUrl;

    @XmlElement(name = "fileUrl", required = true)
    @FieldName("下載URL")
    private String fileUrl;

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighborStart() {
        return neighborStart;
    }

    public void setNeighborStart(String neighborStart) {
        this.neighborStart = neighborStart;
    }

    public String getNeighborEnd() {
        return neighborEnd;
    }

    public void setNeighborEnd(String neighborEnd) {
        this.neighborEnd = neighborEnd;
    }

    public String getYyymmdd() {
        return yyymmdd;
    }

    public void setYyymmdd(String yyymmdd) {
        this.yyymmdd = yyymmdd;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "Rl07112DTO [village=" + village + ", neighborStart=" + neighborStart + ", neighborEnd=" + neighborEnd
                + ", yyymmdd=" + yyymmdd + ", reportFormat=" + reportFormat + ", reportUrl=" + reportUrl + ", fileUrl="
                + fileUrl + "]";
    }

}

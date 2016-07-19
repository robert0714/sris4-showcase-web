package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05274DTO", propOrder = { "type", "moveNoticeStart", "moveNoticeEnd", "houseDateStart", "houseDateEnd", "fileType", "ReportUrl" })
@XmlRootElement(name = "Rl05274DTO")
public class Rl05274DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 類型 */
    @XmlElement(name = "type")
    @FieldName(" 類型")
    private String type = "2";

    /** 移民起日期 */
    @XmlElement(name = "moveNoticeStart")
    @FieldName("移民起日期")
    private String moveNoticeStart;

    /** 移民迄日期 */
    @XmlElement(name = "moveNoticeEnd")
    @FieldName("移民迄日期")
    private String moveNoticeEnd;

    /** 戶所處理時間起 */
    @XmlElement(name = "houseDateStart")
    @FieldName("戶所處理時間起")
    private String houseDateStart;

    /** 戶所處理時間迄 */
    @XmlElement(name = "houseDateEnd")
    @FieldName("戶所處理時間迄")
    private String houseDateEnd;

    /** 檔案日期 */
    @XmlElement(name = "fileType")
    @FieldName("檔案日期")
    private String fileType;

    @XmlElement(name = "ReportUrl")
    @FieldName("報表url")
    private String reportUrl;

    @XmlElement(name = "ReportUrl")
    @FieldName("下載url")
    private String fildUrl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoveNoticeStart() {
        return moveNoticeStart;
    }

    public void setMoveNoticeStart(String moveNoticeStart) {
        this.moveNoticeStart = moveNoticeStart;
    }

    public String getMoveNoticeEnd() {
        return moveNoticeEnd;
    }

    public void setMoveNoticeEnd(String moveNoticeEnd) {
        this.moveNoticeEnd = moveNoticeEnd;
    }

    public String getHouseDateStart() {
        return houseDateStart;
    }

    public void setHouseDateStart(String houseDateStart) {
        this.houseDateStart = houseDateStart;
    }

    public String getHouseDateEnd() {
        return houseDateEnd;
    }

    public void setHouseDateEnd(String houseDateEnd) {
        this.houseDateEnd = houseDateEnd;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getFildUrl() {
        return fildUrl;
    }

    public void setFildUrl(String fildUrl) {
        this.fildUrl = fildUrl;
    }

    @Override
    public String toString() {
        return "Rl05274DTO [type=" + type + ", moveNoticeStart=" + moveNoticeStart + ", moveNoticeEnd=" + moveNoticeEnd + ", houseDateStart=" + houseDateStart + ", houseDateEnd=" + houseDateEnd + ", fileType=" + fileType + ", reportUrl=" + reportUrl + "]";
    }

}

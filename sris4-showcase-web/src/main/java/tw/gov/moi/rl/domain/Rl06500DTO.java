package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rsdfz412Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06500DTO", propOrder = { "yymm", "fileURL", "isNotice", "fileType", "rldfr212List", "rldf022mList", "reportUrl" })
@XmlRootElement(name = "Rl06500DTO")
public class Rl06500DTO {
    @XmlElement(name = "Yymm")
    @FieldName("年月")
    private String yymm;

    @FieldName("fileURL")
    @XmlElement(name = "FileURL")
    private String fileURL;

    @FieldName("isNotice")
    @XmlElement(name = "IsNotice")
    private String isNotice;

    @FieldName("fileType")
    @XmlElement(name = "FileType")
    private String fileType;

    // @XmlElement(name = "Rldfr212List")
    // private List<Rldfr212Type> rldfr212List = new ArrayList<Rldfr212Type>();

    @FieldName("rldf022mList")
    @XmlElement(name = "Rldf022mList")
    private List<Rl06500QueryDTO> rldf022mList = new ArrayList<Rl06500QueryDTO>();

    @FieldName("rsdfz412Type")
    @XmlElement(name = "Rldf022mList")
    private List<Rsdfz412Type> rsdfz412Type = new ArrayList<Rsdfz412Type>();

    @FieldName("reportUrl")
    @XmlElement(name = "ReportUrl")
    private String reportUrl = "";

    public String getYymm() {
        return yymm;
    }

    public void setYymm(String yymm) {
        this.yymm = yymm;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getIsNotice() {
        return isNotice;
    }

    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public List<Rl06500QueryDTO> getRldf022mList() {
        return rldf022mList;
    }

    public void setRldf022mList(List<Rl06500QueryDTO> rldf022mList) {
        this.rldf022mList = rldf022mList;
    }

    public List<Rsdfz412Type> getRsdfz412Type() {
        return rsdfz412Type;
    }

    public void setRsdfz412Type(List<Rsdfz412Type> rsdfz412Type) {
        this.rsdfz412Type = rsdfz412Type;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    @Override
    public String toString() {
        return "Rl06500DTO [yymm=" + yymm + ", fileURL=" + fileURL + ", isNotice=" + isNotice + ", fileType=" + fileType + "]";
    }

}

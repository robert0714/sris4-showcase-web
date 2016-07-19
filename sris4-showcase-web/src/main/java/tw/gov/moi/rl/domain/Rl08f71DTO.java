package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 重印未滿選舉居住期間者名冊控制器 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f71DTO", propOrder = { "VoteCode", "VoteDate", "VotePoint", "StartPage1", "StartPage2",
        "EndPage1", "EndPage2", "VoteReportName", "VoteType", "MakeDate", "VotePointList", "ReportParams", "ReportName", "labelHead" })
@XmlRootElement(name = "Rl08f71DTO")
public class Rl08f71DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate;

    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint;

    @XmlElement(name = "StartPage1")
    @FieldName("(起)頁次1")
    private String startPage1;

    @XmlElement(name = "StartPage2")
    @FieldName("(起)頁次2")
    private String startPage2;

    @XmlElement(name = "EndPage1")
    @FieldName("(迄)頁次1")
    private String endPage1;

    @XmlElement(name = "EndPage2")
    @FieldName("(迄)頁次2")
    private String endPage2;

    @XmlElement(name = "VoteReportName")
    @FieldName("選舉名冊名稱")
    private String voteReportName;

    @XmlElement(name = "VoteType")
    @FieldName("公民投票種類")
    private String voteType;

    @XmlElement(name = "MakeDate")
    @FieldName("製表日期")
    private String makeDate;

    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(final String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(final String voteDate) {
        this.voteDate = voteDate;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(final String votePoint) {
        this.votePoint = votePoint;
    }

    public String getStartPage1() {
        return startPage1;
    }

    public void setStartPage1(final String startPage1) {
        this.startPage1 = startPage1;
    }

    public String getStartPage2() {
        return startPage2;
    }

    public void setStartPage2(final String startPage2) {
        this.startPage2 = startPage2;
    }

    public String getEndPage1() {
        return endPage1;
    }

    public void setEndPage1(final String endPage1) {
        this.endPage1 = endPage1;
    }

    public String getEndPage2() {
        return endPage2;
    }

    public void setEndPage2(final String endPage2) {
        this.endPage2 = endPage2;
    }

    public String getVoteReportName() {
        return voteReportName;
    }

    public void setVoteReportName(final String voteReportName) {
        this.voteReportName = voteReportName;
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(final String voteType) {
        this.voteType = voteType;
    }

    public String getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(final String makeDate) {
        this.makeDate = makeDate;
    }

    public List<String> getVotePointList() {
        return votePointList;
    }

    public void setVotePointList(final List<String> votePointList) {
        this.votePointList = votePointList;
    }

    public HashMap<String, String> getReportParams() {
        return reportParams;
    }

    public void setReportParams(HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
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
    
    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

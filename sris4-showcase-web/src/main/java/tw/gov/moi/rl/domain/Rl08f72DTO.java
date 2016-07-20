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
import tw.gov.moi.domain.Rlde800wType;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 重印選舉人名冊 DTO.
 * 
 * @author Stnaley.Li
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f72DTO", propOrder = { "voteCode", "voteDate", "votePoint", "startPage1", "startPage2",
        "endPage1", "endPage2", "pageNO1", "pageNO2", "voteReportName", "voteName1", "voteName2", "voteName3",
        "voteName4", "voteName5", "voteLivingStyle2", "voteLivingStyle3", "reportDate", "voteName1_2", "voteName2_2",
        "voteName3_2", "votePointList", "voteType", "issueNumber", "issueName1", "issueName2", "issueName3",
        "issueName4", "issueName5", "reportUrl", "reportParams", "reportName", "rlde808wFlag", "rlde808w", "labelHead",
        "voterRollsInfoDTO", "subTitle" })
@XmlRootElement(name = "Rl08f72DTO")
public class Rl08f72DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

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

    @XmlElement(name = "PageNO1")
    @FieldName("編號1")
    private String pageNO1;

    @XmlElement(name = "PageNO2")
    @FieldName("編號2")
    private String pageNO2;

    @XmlElement(name = "VoteReportName")
    @FieldName("選舉名冊名稱")
    private String voteReportName = "";

    @XmlElement(name = "VoteName1")
    @FieldName("選舉名冊選舉權名稱（一）")
    private String voteName1 = "";

    @XmlElement(name = "VoteName2")
    @FieldName("選舉名冊選舉權名稱（二）")
    private String voteName2 = "";

    @XmlElement(name = "VoteName3")
    @FieldName("選舉名冊選舉權名稱（三）")
    private String voteName3 = "";

    @XmlElement(name = "VoteName4")
    @FieldName("選舉名冊選舉權名稱（四）")
    private String voteName4 = "";

    @XmlElement(name = "VoteName5")
    @FieldName("選舉名冊選舉權名稱（五）")
    private String voteName5 = "";

    @XmlElement(name = "VoteLivingStyle2")
    @FieldName("選舉權（二）選舉人身分名稱")
    private List<String> voteLivingStyle2 = new ArrayList<String>();

    @XmlElement(name = "VoteLivingStyle3")
    @FieldName("選舉權（三）選舉人身分名稱")
    private List<String> voteLivingStyle3 = new ArrayList<String>();

    @XmlElement(name = "ReportDate")
    @FieldName("製表日期")
    private String reportDate = "";

    @XmlElement(name = "VoteName1_2")
    @FieldName("選舉名冊選舉權名稱（一）之二")
    private String voteName1_2 = "";

    @XmlElement(name = "VoteName2_2")
    @FieldName("選舉名冊選舉權名稱（二）之二")
    private String voteName2_2 = "";

    @XmlElement(name = "VoteName3_2")
    @FieldName("選舉名冊選舉權名稱（三）之二")
    private String voteName3_2 = "";

    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    @XmlElement(name = "VoteType")
    @FieldName("公民投票種類")
    private String voteType = "";

    @XmlElement(name = "IssueNumber")
    @FieldName("議題個數")
    private String issueNumber = "";

    @XmlElement(name = "IssueName1")
    @FieldName("議題個數名稱1")
    private String issueName1 = "";

    @XmlElement(name = "IssueName2")
    @FieldName("議題個數名稱2")
    private String issueName2 = "";

    @XmlElement(name = "IssueName3")
    @FieldName("議題個數名稱3")
    private String issueName3 = "";

    @XmlElement(name = "IssueName4")
    @FieldName("議題個數名稱4")
    private String issueName4 = "";

    @XmlElement(name = "IssueName5")
    @FieldName("議題個數名稱5")
    private String issueName5 = "";

    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "";

    @XmlElement(name = "Rlde800wFlag")
    @FieldName("是否有選舉組合作用檔")
    private boolean rlde800wFlag = false;

    @XmlElement(name = "Rlde800w")
    @FieldName("選舉組合作用檔")
    private Rlde800wType rlde800w;

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    /** 選舉名冊資訊DTO */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO;

    /** 選舉名冊種類 */
    @XmlElement(name = "LabelHead")
    @FieldName("選舉名冊種")
    private String subTitle = "";

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

    public String getPageNO1() {
        return pageNO1;
    }

    public void setPageNO1(final String pageNO1) {
        this.pageNO1 = pageNO1;
    }

    public String getPageNO2() {
        return pageNO2;
    }

    public void setPageNO2(final String pageNO2) {
        this.pageNO2 = pageNO2;
    }

    public String getVoteReportName() {
        return voteReportName;
    }

    public void setVoteReportName(final String voteReportName) {
        this.voteReportName = voteReportName;
    }

    public String getVoteName1() {
        return voteName1;
    }

    public void setVoteName1(final String voteName1) {
        this.voteName1 = voteName1;
    }

    public String getVoteName2() {
        return voteName2;
    }

    public void setVoteName2(final String voteName2) {
        this.voteName2 = voteName2;
    }

    public String getVoteName3() {
        return voteName3;
    }

    public void setVoteName3(final String voteName3) {
        this.voteName3 = voteName3;
    }

    public List<String> getVoteLivingStyle2() {
        return voteLivingStyle2;
    }

    public void setVoteLivingStyle2(final List<String> voteLivingStyle2) {
        this.voteLivingStyle2 = voteLivingStyle2;
    }

    public List<String> getVoteLivingStyle3() {
        return voteLivingStyle3;
    }

    public void setVoteLivingStyle3(final List<String> voteLivingStyle3) {
        this.voteLivingStyle3 = voteLivingStyle3;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(final String reportDate) {
        this.reportDate = reportDate;
    }

    public String getVoteName1_2() {
        return voteName1_2;
    }

    public void setVoteName1_2(final String voteName1_2) {
        this.voteName1_2 = voteName1_2;
    }

    public String getVoteName2_2() {
        return voteName2_2;
    }

    public void setVoteName2_2(final String voteName2_2) {
        this.voteName2_2 = voteName2_2;
    }

    public String getVoteName3_2() {
        return voteName3_2;
    }

    public void setVoteName3_2(final String voteName3_2) {
        this.voteName3_2 = voteName3_2;
    }

    public List<String> getVotePointList() {
        return votePointList;
    }

    public void setVotePointList(final List<String> votePointList) {
        this.votePointList = votePointList;
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(final String voteType) {
        this.voteType = voteType;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(final String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssueName1() {
        return issueName1;
    }

    public void setIssueName1(final String issueName1) {
        this.issueName1 = issueName1;
    }

    public String getIssueName2() {
        return issueName2;
    }

    public void setIssueName2(final String issueName2) {
        this.issueName2 = issueName2;
    }

    public String getIssueName3() {
        return issueName3;
    }

    public void setIssueName3(final String issueName3) {
        this.issueName3 = issueName3;
    }

    public String getIssueName4() {
        return issueName4;
    }

    public void setIssueName4(final String issueName4) {
        this.issueName4 = issueName4;
    }

    public String getIssueName5() {
        return issueName5;
    }

    public void setIssueName5(final String issueName5) {
        this.issueName5 = issueName5;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public HashMap<String, String> getReportParams() {
        return reportParams;
    }

    public void setReportParams(final HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(final String reportName) {
        this.reportName = reportName;
    }

    public boolean isRlde800wFlag() {
        return rlde800wFlag;
    }

    public void setRlde800wFlag(final boolean rlde800wFlag) {
        this.rlde800wFlag = rlde800wFlag;
    }

    public Rlde800wType getRlde800w() {
        return rlde800w;
    }

    public void setRlde800w(final Rlde800wType rlde800w) {
        this.rlde800w = rlde800w;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    public String getVoteName4() {
        return voteName4;
    }

    public void setVoteName4(String voteName4) {
        this.voteName4 = voteName4;
    }

    public String getVoteName5() {
        return voteName5;
    }

    public void setVoteName5(String voteName5) {
        this.voteName5 = voteName5;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setVoterRollsInfoDTO(VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

}

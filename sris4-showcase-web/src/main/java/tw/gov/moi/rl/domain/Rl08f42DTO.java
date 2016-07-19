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
import tw.gov.moi.domain.Rlde808wType;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f42DTO", propOrder = { "VoteCode", "VoteDate", "PersonId", "Rlde806wType", "SaveLists" })
@XmlRootElement(name = "Rl08f42DTO")
public class Rl08f42DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VoteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteCode;

    @XmlElement(name = "VoteDate", required = true)
    @FieldName("投票日期 ")
    private String voteDate;

    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號 ")
    private String personId;

    @XmlElement(name = "NewVotePoint", required = true)
    @FieldName("新增後投票所 ")
    private String newVotePoint;

    @XmlElement(name = "PageLists", required = true)
    @FieldName("Rl08f42DTOResult")
    private List<Rl08f42DTOResult> pageLists = new ArrayList<Rl08f42DTOResult>();

    @XmlElement(name = "SelectResult", required = true)
    @FieldName("selectResult")
    private Rl08f42DTOResult selectResult = new Rl08f42DTOResult();

    @XmlElement(name = "Rlde808wTypeList", required = true)
    @FieldName("Rlde808wType")
    private List<Rlde808wType> rlde808wTypeList = new ArrayList<Rlde808wType>();

    @XmlElement(name = "TitleName", required = true)
    @FieldName("titleName")
    private String titleName = "";

    // 選舉權1
    private boolean isVote1 = Boolean.FALSE;

    // 選舉權2
    private boolean isVote2 = Boolean.FALSE;

    // 選舉權3
    private boolean isVote3 = Boolean.FALSE;

    // 選舉權3
    private boolean isVote4 = Boolean.FALSE;

    // 選舉權3
    private boolean isVote5 = Boolean.FALSE;

    private VoterRollsInfoDTO voterRollsInfoDTO;

    public Rl08f42DTOResult getSelectResult() {
        return selectResult;
    }

    public void setSelectResult(Rl08f42DTOResult selectResult) {
        this.selectResult = selectResult;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setVoterRollsInfoDTO(VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getNewVotePoint() {
        return newVotePoint;
    }

    public void setNewVotePoint(String newVotePoint) {
        this.newVotePoint = newVotePoint;
    }

    public List<Rlde808wType> getRlde808wTypeList() {
        return rlde808wTypeList;
    }

    public void setRlde808wTypeList(List<Rlde808wType> rlde808wTypeList) {
        this.rlde808wTypeList = rlde808wTypeList;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Rl08f42DTOResult> getPageLists() {
        return pageLists;
    }

    public void setPageLists(List<Rl08f42DTOResult> pageLists) {
        this.pageLists = pageLists;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public boolean isVote1() {
        return isVote1;
    }

    public void setVote1(boolean isVote1) {
        this.isVote1 = isVote1;
    }

    public boolean isVote2() {
        return isVote2;
    }

    public void setVote2(boolean isVote2) {
        this.isVote2 = isVote2;
    }

    public boolean isVote3() {
        return isVote3;
    }

    public void setVote3(boolean isVote3) {
        this.isVote3 = isVote3;
    }

    public boolean isVote4() {
        return isVote4;
    }

    public void setVote4(boolean isVote4) {
        this.isVote4 = isVote4;
    }

    public boolean isVote5() {
        return isVote5;
    }

    public void setVote5(boolean isVote5) {
        this.isVote5 = isVote5;
    }

    @Override
    public String toString() {
        return "Rl08f42DTO [voteCode=" + voteCode + ", voteDate=" + voteDate + ", personId=" + personId
                + ", newVotePoint=" + newVotePoint + ", pageLists=" + pageLists + ", selectResult=" + selectResult
                + ", rlde808wTypeList=" + rlde808wTypeList + ", titleName=" + titleName + ", isVote1=" + isVote1
                + ", isVote2=" + isVote2 + ", isVote3=" + isVote3 + ", isVote4=" + isVote4 + ", isVote5=" + isVote5
                + ", voterRollsInfoDTO=" + voterRollsInfoDTO + "]";
    }

}

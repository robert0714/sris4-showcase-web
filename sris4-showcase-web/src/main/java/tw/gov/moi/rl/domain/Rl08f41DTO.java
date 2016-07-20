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
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d110DTO", propOrder = { "type", "rldf012dList", "rldf012dLockList", "resultShowList", "graspName" })
@XmlRootElement(name = "Rl0d110DTO")
public class Rl08f41DTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteCode;

    @XmlElement(name = "voteDate", required = true)
    @FieldName("投票日期")
    private String voteDate;

    @XmlElement(name = "personId", required = true)
    @FieldName("統一編號 ")
    private String personId;

    @XmlElement(name = "personName", required = true)
    @FieldName("姓名 ")
    private String personName;

    @XmlElement(name = "streetDoorplate", required = true)
    @FieldName("街路門牌")
    private String streetDoorplate;

    @XmlElement(name = "rlde806wList", required = true)
    @FieldName("選舉人名冊資料 ")
    private List<Rl08f41DTOResult> rlde806wList = new ArrayList<Rl08f41DTOResult>();

    @XmlElement(name = "Lists", required = true)
    @FieldName("Rlde806wType")
    private List<Rlde806wType> lists = new ArrayList<Rlde806wType>();

    // 頁面呈現之結果
    @XmlElement(name = "Select", required = true)
    @FieldName("Rl08f41DTOResult")
    private Rl08f41DTOResult select = new Rl08f41DTOResult();

    @XmlElement(name = "TitleName", required = true)
    @FieldName("選舉人名冊資料 ")
    private String titleName = "";

    private VoterRollsInfoDTO voterRollsInfoDTO;

    public List<Rl08f41DTOResult> getRlde806wList() {
        return rlde806wList;
    }

    public void setRlde806wList(List<Rl08f41DTOResult> rlde806wList) {
        this.rlde806wList = rlde806wList;
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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public Rl08f41DTOResult getSelect() {
        return select;
    }

    public void setSelect(Rl08f41DTOResult select) {
        this.select = select;
    }

    public List<Rlde806wType> getLists() {
        return lists;
    }

    public void setLists(List<Rlde806wType> lists) {
        this.lists = lists;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setVoterRollsInfoDTO(VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }

    @Override
    public String toString() {
        return "Rl08f41DTO [voteCode=" + voteCode + ", voteDate=" + voteDate + ", personId=" + personId
                + ", personName=" + personName + ", streetDoorplate=" + streetDoorplate + ", rlde806wList="
                + rlde806wList + "]";
    }

    private String getSize() {
        return String.valueOf(this.getRlde806wList().size());
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

}

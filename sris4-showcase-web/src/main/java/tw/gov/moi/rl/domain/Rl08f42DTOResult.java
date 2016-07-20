package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rlde808wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f42DTOResult", propOrder = { "VoteCode", "VoteDate", "PersonId", "Rlde806wType", "SaveLists" })
@XmlRootElement(name = "rl08f42DTOResult")
public class Rl08f42DTOResult implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("詳細資料806w")
    private Rlde806wType historyRlde806wType = new Rlde806wType();

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("詳細資料806w")
    private Rlde806wType addrlde806wType = new Rlde806wType();

    @XmlElement(name = "Rlde808wType", required = true)
    @FieldName("詳細資料806w")
    private Rlde808wType rlde808wType = new Rlde808wType();

    @XmlElement(name = "rldf004mType", required = true)
    @FieldName("詳細資料4m")
    private Rldf004mType rldf004mType = new Rldf004mType();

    @XmlElement(name = "rldf001mType", required = true)
    @FieldName("詳細資料4m")
    private Rldf001mType rldf001mType = new Rldf001mType();

    @XmlElement(name = "voteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteCode;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("投票日期 ")
    private String voteDate;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("統號 ")
    private String personId;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動來源")
    private String changeSource;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("禁治產權")
    private String voteRight;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("第一次新增 ")
    private String firstAdd;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("新增後請重印 ")
    private String addReprint;

    public Rlde806wType getHistoryRlde806wType() {
        return historyRlde806wType;
    }

    public void setHistoryRlde806wType(Rlde806wType historyRlde806wType) {
        this.historyRlde806wType = historyRlde806wType;
    }

    public Rlde808wType getRlde808wType() {
        return rlde808wType;
    }

    public void setRlde808wType(Rlde808wType rlde808wType) {
        this.rlde808wType = rlde808wType;
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
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

    public String getChangeSource() {
        return changeSource;
    }

    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    public String getVoteRight() {
        return voteRight;
    }

    public void setVoteRight(String voteRight) {
        this.voteRight = voteRight;
    }

    public String getFirstAdd() {
        return firstAdd;
    }

    public void setFirstAdd(String firstAdd) {
        this.firstAdd = firstAdd;
    }

    public String getAddReprint() {
        return addReprint;
    }

    public void setAddReprint(String addReprint) {
        this.addReprint = addReprint;
    }

    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
    }

    public Rlde806wType getAddrlde806wType() {
        return addrlde806wType;
    }

    public void setAddrlde806wType(Rlde806wType addrlde806wType) {
        this.addrlde806wType = addrlde806wType;
    }

    @Override
    public String toString() {
        return "Rl08f42DTOResult [historyRlde806wType=" + historyRlde806wType + ", addrlde806wType=" + addrlde806wType
                + ", rlde808wType=" + rlde808wType + ", rldf004mType=" + rldf004mType + ", rldf001mType="
                + rldf001mType + ", voteCode=" + voteCode + ", voteDate=" + voteDate + ", personId=" + personId
                + ", changeSource=" + changeSource + ", voteRight=" + voteRight + ", firstAdd=" + firstAdd
                + ", addReprint=" + addReprint + "]";
    }

}

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
public class Rl08f43DTOResult implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("詳細資料806w")
    private Rlde806wType rlde806wOld = new Rlde806wType();

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("詳細資料806w")
    private Rlde806wType rlde806wNew = new Rlde806wType();

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
    @FieldName("新增後投票所 ")
    private String newVotePoint;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("投票所")
    private String votePoint;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("序號 ")
    private String sequential;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String beforeVote;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動前主頁 ")
    private String beforeMainPage;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動前副頁 ")
    private String beforeSubPage;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動前編號 ")
    private String beforeSerialNo;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動後主頁")
    private String afterVote;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動後副頁 ")
    private String afterMainPage;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動後編號 ")
    private String afterSubPage;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動後投票所 ")
    private String afterSerialNo;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("異動來源")
    private String changeSource;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("禁治產權")
    private String voteRight;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("新增後請重印 ")
    private String addReprint;

    private boolean isChangeStreet = false;

    private boolean isChangeVillage = false;

    private boolean isChangee808 = false;

    public boolean isChangee808() {
        return isChangee808;
    }

    public void setChangee808(boolean isChangee808) {
        this.isChangee808 = isChangee808;
    }

    public boolean isChangeStreet() {
        return isChangeStreet;
    }

    public void setChangeStreet(boolean isChangeStreet) {
        this.isChangeStreet = isChangeStreet;
    }

    public boolean isChangeVillage() {
        return isChangeVillage;
    }

    public void setChangeVillage(boolean isChangeVillage) {
        this.isChangeVillage = isChangeVillage;
    }

    public Rlde806wType getRlde806wOld() {
        return rlde806wOld;
    }

    public void setRlde806wOld(Rlde806wType rlde806wOld) {
        this.rlde806wOld = rlde806wOld;
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

    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
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

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public String getSequential() {
        return sequential;
    }

    public void setSequential(String sequential) {
        this.sequential = sequential;
    }

    public String getBeforeVote() {
        return beforeVote;
    }

    public void setBeforeVote(String beforeVote) {
        this.beforeVote = beforeVote;
    }

    public String getBeforeMainPage() {
        return beforeMainPage;
    }

    public void setBeforeMainPage(String beforeMainPage) {
        this.beforeMainPage = beforeMainPage;
    }

    public String getBeforeSubPage() {
        return beforeSubPage;
    }

    public void setBeforeSubPage(String beforeSubPage) {
        this.beforeSubPage = beforeSubPage;
    }

    public String getBeforeSerialNo() {
        return beforeSerialNo;
    }

    public void setBeforeSerialNo(String beforeSerialNo) {
        this.beforeSerialNo = beforeSerialNo;
    }

    public String getAfterVote() {
        return afterVote;
    }

    public void setAfterVote(String afterVote) {
        this.afterVote = afterVote;
    }

    public String getAfterMainPage() {
        return afterMainPage;
    }

    public void setAfterMainPage(String afterMainPage) {
        this.afterMainPage = afterMainPage;
    }

    public String getAfterSubPage() {
        return afterSubPage;
    }

    public void setAfterSubPage(String afterSubPage) {
        this.afterSubPage = afterSubPage;
    }

    public String getAfterSerialNo() {
        return afterSerialNo;
    }

    public void setAfterSerialNo(String afterSerialNo) {
        this.afterSerialNo = afterSerialNo;
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

    public String getAddReprint() {
        return addReprint;
    }

    public void setAddReprint(String addReprint) {
        this.addReprint = addReprint;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rlde806wType getRlde806wNew() {
        return rlde806wNew;
    }

    public void setRlde806wNew(Rlde806wType rlde806wNew) {
        this.rlde806wNew = rlde806wNew;
    }

    @Override
    public String toString() {
        return "Rl08f43DTOResult [rlde806wOld=" + rlde806wOld + ", rlde806wNew=" + rlde806wNew + ", rlde808wType="
                + rlde808wType + ", rldf004mType=" + rldf004mType + ", rldf001mType=" + rldf001mType + ", voteCode="
                + voteCode + ", voteDate=" + voteDate + ", personId=" + personId + ", newVotePoint=" + newVotePoint
                + ", votePoint=" + votePoint + ", sequential=" + sequential + ", beforeVote=" + beforeVote
                + ", beforeMainPage=" + beforeMainPage + ", beforeSubPage=" + beforeSubPage + ", beforeSerialNo="
                + beforeSerialNo + ", afterVote=" + afterVote + ", afterMainPage=" + afterMainPage + ", afterSubPage="
                + afterSubPage + ", afterSerialNo=" + afterSerialNo + ", changeSource=" + changeSource + ", voteRight="
                + voteRight + ", addReprint=" + addReprint + ", isChangeStreet=" + isChangeStreet
                + ", isChangeVillage=" + isChangeVillage + ", isChangee808=" + isChangee808 + "]";
    }

}

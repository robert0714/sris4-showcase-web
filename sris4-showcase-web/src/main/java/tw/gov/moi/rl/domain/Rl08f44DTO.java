package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde806wType;

/**
 * 
 * @author Andy
 * 
 */
public class Rl08f44DTO implements Serializable {

    private String personId;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("選舉組合代碼 ")
    private String voteCode;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("投票日期 ")
    private String voteDate;

    @XmlElement(name = "PageLists", required = true)
    @FieldName("頁面顯示結果 ")
    private List<Rl08f44DTOResult> pageLists = new ArrayList<Rl08f44DTOResult>();

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("候選人")
    private Rlde806wType rlde806wType = new Rlde806wType();

    @XmlElement(name = "AddReprint", required = true)
    @FieldName("刪除後請重印")
    private String addReprint;

    @XmlElement(name = "Mask", required = true)
    @FieldName("註記")
    private String mask;

    @XmlElement(name = "ChangeSource", required = true)
    @FieldName("異動原因")
    private String changeSource;

    @XmlElement(name = "TitleName", required = true)
    @FieldName("titleName")
    private String titleName = "";

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    public List<Rl08f44DTOResult> getPageLists() {
        return pageLists;
    }

    public void setPageLists(List<Rl08f44DTOResult> pageLists) {
        this.pageLists = pageLists;
    }

    public Rlde806wType getRlde806wType() {
        return rlde806wType;
    }

    public String getAddReprint() {
        return addReprint;
    }

    public void setAddReprint(String addReprint) {
        this.addReprint = addReprint;
    }

    public void setRlde806wType(Rlde806wType rlde806wType) {
        this.rlde806wType = rlde806wType;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getChangeSource() {
        return changeSource;
    }

    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    @Override
    public String toString() {
        return "Rl08f44DTO [personId=" + personId + ", voteCode=" + voteCode + ", voteDate=" + voteDate
                + ", pageLists=" + pageLists + ", rlde806wType=" + rlde806wType + ", addReprint=" + addReprint + "]";
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde853wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f12DTO", propOrder = { "voteCode", "voteDate", "labelHead", "votePointS", "votePointE",
        "setVotePoint", "selectedRlde853wType", "listRlde853wType", "selectedRl08f12EditDTO", "listRl08f12EditDTO" })
@XmlRootElement(name = "Rl08f12DTO")
public class Rl08f12DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉組合代碼 */
    @FieldName("選舉組合代碼")
    @XmlElement(name = "voteCode")
    private String voteCode = "";

    /** 投票日期 */
    @FieldName("投票日期")
    @XmlElement(name = "voteDate")
    private String voteDate = "";

    /** 標題顯示 */
    @FieldName("標題顯示")
    @XmlElement(name = "labelHead")
    private String labelHead = "";

    /** 投票所起 */
    @FieldName("投票所起")
    @XmlElement(name = "votePointS")
    private String votePointS = "";

    /** 投票所迄 */
    @FieldName("投票所迄")
    @XmlElement(name = "votePointE")
    private String votePointE = "";

    /** 投票所列表 */
    @FieldName("投票所列表 ")
    @XmlElement(name = "setVotePoint")
    private Set<String> setVotePoint = new HashSet<String>(0);

    /** 使用者選取查詢結果資料 */
    @FieldName("使用者選取查詢結果資料 ")
    @XmlElement(name = "selectedRlde853wType")
    private Rlde853wType selectedRlde853wType = new Rlde853wType();

    /** 查詢結果資料串 */
    @FieldName("查詢結果資料串 ")
    @XmlElement(name = "listRlde853wType")
    private List<Rlde853wType> listRlde853wType = new ArrayList<Rlde853wType>();

    /** 使用者選取新增資料 */
    @FieldName("使用者選取新增資料 ")
    @XmlElement(name = "selectedRl08f12EditDTO")
    private Rl08f12EditDTO selectedRl08f12EditDTO = new Rl08f12EditDTO();

    /** 新增資料串 */
    @FieldName("新增資料串")
    @XmlElement(name = "listRl08f12EditDTO")
    private List<Rl08f12EditDTO> listRl08f12EditDTO = new ArrayList<Rl08f12EditDTO>();

    public String getVotePointS() {
        return votePointS;
    }

    public void setVotePointS(String votePointS) {
        this.votePointS = votePointS;
    }

    public String getVotePointE() {
        return votePointE;
    }

    public void setVotePointE(String votePointE) {
        this.votePointE = votePointE;
    }

    public Rlde853wType getSelectedRlde853wType() {
        return selectedRlde853wType;
    }

    public void setSelectedRlde853wType(Rlde853wType selectedRlde853wType) {
        this.selectedRlde853wType = selectedRlde853wType;
    }

    public List<Rlde853wType> getListRlde853wType() {
        return listRlde853wType;
    }

    public void setListRlde853wType(List<Rlde853wType> listRlde853wType) {
        this.listRlde853wType = listRlde853wType;
    }

    public Rl08f12EditDTO getSelectedRl08f12EditDTO() {
        return selectedRl08f12EditDTO;
    }

    public void setSelectedRl08f12EditDTO(Rl08f12EditDTO selectedRl08f12EditDTO) {
        this.selectedRl08f12EditDTO = selectedRl08f12EditDTO;
    }

    public List<Rl08f12EditDTO> getListRl08f12EditDTO() {
        return listRl08f12EditDTO;
    }

    public void setListRl08f12EditDTO(List<Rl08f12EditDTO> listRl08f12EditDTO) {
        this.listRl08f12EditDTO = listRl08f12EditDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
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

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    public Set<String> getSetVotePoint() {
        return setVotePoint;
    }

    public void setSetVotePoint(Set<String> setVotePoint) {
        this.setVotePoint = setVotePoint;
    }

}

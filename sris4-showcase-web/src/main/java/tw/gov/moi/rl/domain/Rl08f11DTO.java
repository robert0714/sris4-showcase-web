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
import tw.gov.moi.domain.Rlde808wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f11DTO", propOrder = { "voteCode", "voteDate", "labelHead", "votePointS", "votePointE",
        "deleteRlde808wType", "flagDatasExist", "setVotePoint", "listRlde808wType", "deleteRl08f11ResultDTO",
        "listRl08f11ResultDTO", "listRl08f11AddDTO" })
@XmlRootElement(name = "Rl08f11DTO")
public class Rl08f11DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉組合代碼 */
    @FieldName("選舉組合代碼")
    @XmlElement(name = "voteCode")
    private String voteCode;

    /** 投票日期 */
    @FieldName("投票日期")
    @XmlElement(name = "voteDate")
    private String voteDate;

    /** 標題顯示 */
    @FieldName("標題顯示")
    @XmlElement(name = "labelHead")
    private String labelHead;

    /** 投票所(起) */
    @FieldName("投票所(起)")
    @XmlElement(name = "votePointS")
    private String votePointS;

    /** 投票所(迄) */
    @FieldName("投票所(迄)")
    @XmlElement(name = "votePointE")
    private String votePointE;

    /** 資料有無的flag */
    @FieldName("資料有無的flag")
    @XmlElement(name = "flagDatasExist")
    private String flagDatasExist;

    /** 投票所列表 */
    @FieldName("投票所列表")
    @XmlElement(name = "setVotePoint")
    private Set<String> setVotePoint = new HashSet<String>(0);

    /** 要刪除的 */
    @FieldName("要刪除的 ")
    @XmlElement(name = "deleteRlde808wType")
    private Rlde808wType deleteRlde808wType;

    /** 資料顯示 */
    @FieldName("資料顯示 ")
    @XmlElement(name = "listRlde808wType")
    private List<Rlde808wType> listRlde808wType = new ArrayList<Rlde808wType>(0);

    /** 要刪除的 */
    @FieldName("要刪除的 ")
    @XmlElement(name = "deleteRl08f11ResultDTO")
    private Rl08f11ResultDTO deleteRl08f11ResultDTO = new Rl08f11ResultDTO();

    /** 連續鄰的資料顯示 */
    @FieldName("連續鄰的資料顯示  ")
    @XmlElement(name = "listRl08f11ResultDTO")
    private List<Rl08f11ResultDTO> listRl08f11ResultDTO = new ArrayList<Rl08f11ResultDTO>(0);

    /** 使用者輸入清單 */
    @FieldName("使用者輸入清單  ")
    @XmlElement(name = "listRl08f11AddDTO")
    private List<Rl08f11AddDTO> listRl08f11AddDTO = new ArrayList<Rl08f11AddDTO>(10);

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

    public Rlde808wType getDeleteRlde808wType() {
        return deleteRlde808wType;
    }

    public void setDeleteRlde808wType(Rlde808wType deleteRlde808wType) {
        this.deleteRlde808wType = deleteRlde808wType;
    }

    public List<Rlde808wType> getListRlde808wType() {
        return listRlde808wType;
    }

    public void setListRlde808wType(List<Rlde808wType> listRlde808wType) {
        this.listRlde808wType = listRlde808wType;
    }

    public List<Rl08f11AddDTO> getListRl08f11AddDTO() {
        return listRl08f11AddDTO;
    }

    public void setListRl08f11AddDTO(List<Rl08f11AddDTO> listRl08f11AddDTO) {
        this.listRl08f11AddDTO = listRl08f11AddDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    public String getFlagDatasExist() {
        return flagDatasExist;
    }

    public void setFlagDatasExist(String flagDatasExist) {
        this.flagDatasExist = flagDatasExist;
    }

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

    public Set<String> getSetVotePoint() {
        return setVotePoint;
    }

    public void setSetVotePoint(Set<String> setVotePoint) {
        this.setVotePoint = setVotePoint;
    }

    public List<Rl08f11ResultDTO> getListRl08f11ResultDTO() {
        return listRl08f11ResultDTO;
    }

    public void setListRl08f11ResultDTO(List<Rl08f11ResultDTO> listRl08f11ResultDTO) {
        this.listRl08f11ResultDTO = listRl08f11ResultDTO;
    }

    public Rl08f11ResultDTO getDeleteRl08f11ResultDTO() {
        return deleteRl08f11ResultDTO;
    }

    public void setDeleteRl08f11ResultDTO(Rl08f11ResultDTO deleteRl08f11ResultDTO) {
        this.deleteRl08f11ResultDTO = deleteRl08f11ResultDTO;
    }

}

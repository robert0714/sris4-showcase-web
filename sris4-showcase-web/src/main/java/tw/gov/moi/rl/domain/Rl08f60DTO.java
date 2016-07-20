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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f60DTO", propOrder = { "labelHead", "voteCode", "voteDate", "votePoint", "option",
        "listRl08f60ResultDTO" })
@XmlRootElement(name = "Rl08f60DTO")
public class Rl08f60DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題名稱 */
    @XmlElement(name = "labelHead")
    @FieldName("查詢結果 ")
    private String labelHead = "";

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    @FieldName("查詢結果 ")
    private String voteCode = "";

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    @FieldName("查詢結果 ")
    private String voteDate = "";

    /** 投票所 */
    @XmlElement(name = "votePoint")
    @FieldName("查詢結果 ")
    private String votePoint = "";

    /** 種類 */
    @XmlElement(name = "option")
    @FieldName("查詢結果 ")
    private String option = "1";

    /** 資料列表 */
    @XmlElement(name = "listRl08f60ResultDTO")
    @FieldName("查詢結果 ")
    private List<Rl08f60ResultDTO> listRl08f60ResultDTO = new ArrayList<Rl08f60ResultDTO>(0);

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
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

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Rl08f60ResultDTO> getListRl08f60ResultDTO() {
        return listRl08f60ResultDTO;
    }

    public void setListRl08f60ResultDTO(List<Rl08f60ResultDTO> listRl08f60ResultDTO) {
        this.listRl08f60ResultDTO = listRl08f60ResultDTO;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

}

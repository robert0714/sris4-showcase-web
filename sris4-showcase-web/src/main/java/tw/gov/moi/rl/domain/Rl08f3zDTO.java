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
@XmlType(name = "rl08f3zDTO", propOrder = { "voteCode", "voteDate", "label", "url", "code", "titleName", "selectDto",
        "list", "labelHead" })
@XmlRootElement(name = "Rl08f3zDTO")
public class Rl08f3zDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate;

    @XmlElement(name = "Label")
    @FieldName("顯示名稱")
    private String label;

    @XmlElement(name = "Url")
    @FieldName("URL")
    private String url;

    @XmlElement(name = "Code")
    @FieldName("代碼")
    private String code;

    @XmlElement(name = "TitleName")
    @FieldName("標題")
    private String titleName = "";

    @XmlElement(name = "SelectDto")
    @FieldName("SelectDto")
    private Rl08f3zDTO selectDto;

    @XmlElement(name = "List")
    @FieldName("List")
    private List<Rl08f3zDTO> list = new ArrayList<Rl08f3zDTO>();

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

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(final String titleName) {
        this.titleName = titleName;
    }

    public Rl08f3zDTO getSelectDto() {
        return selectDto;
    }

    public void setSelectDto(final Rl08f3zDTO selectDto) {
        this.selectDto = selectDto;
    }

    public List<Rl08f3zDTO> getList() {
        return list;
    }

    public void setList(final List<Rl08f3zDTO> list) {
        this.list = list;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

}

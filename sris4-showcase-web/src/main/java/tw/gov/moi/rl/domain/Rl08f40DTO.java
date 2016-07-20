package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f40DTO", propOrder = { "voteCode", "voteDate", "label", "url" })
@XmlRootElement(name = "Rl08f40DTO")
public class Rl08f40DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    private String voteDate;

    /** 投票日期 */
    @XmlElement(name = "label")
    private String label;

    /** URL */
    @XmlElement(name = "url")
    private String url;

    /** 代碼 */
    @XmlElement(name = "code")
    private String code;

    private String titleName = "";

    private Rl08f40DTO selectDto;

    private List<Rl08f40DTO> list = new ArrayList<Rl08f40DTO>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rl08f40DTO> getList() {
        return list;
    }

    public void setList(List<Rl08f40DTO> list) {
        this.list = list;
    }

    public Rl08f40DTO getSelectDto() {
        return selectDto;
    }

    public void setSelectDto(Rl08f40DTO selectDto) {
        this.selectDto = selectDto;
    }

    @Override
    public String toString() {
        return "Rl08f40DTO [voteCode=" + voteCode + ", voteDate=" + voteDate + ", label=" + label + ", url=" + url
                + ", code=" + code + ", titleName=" + titleName + ", selectDto=" + selectDto + ", list=" + list + "]";
    }

}

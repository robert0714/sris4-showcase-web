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
@XmlType(name = "Rl08f1zDTO", propOrder = { "labelHead", "voteCode", "voteDate", "selectedUrl", "urls" })
@XmlRootElement(name = "Rl08f1zDTO")
public class Rl08f1zDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題名稱 */
    @XmlElement(name = "labelHead")
    private String labelHead;

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    private String voteCode = "";

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    private String voteDate = "";

    /** 點選的連結 */
    @XmlElement(name = "selectedUrl")
    private Rl08f1zUrlDTO selectedUrl = new Rl08f1zUrlDTO();

    /** 超連結 */
    @XmlElement(name = "urls")
    private List<Rl08f1zUrlDTO> urls = new ArrayList<Rl08f1zUrlDTO>(0);

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
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

    public Rl08f1zUrlDTO getSelectedUrl() {
        return selectedUrl;
    }

    public void setSelectedUrl(Rl08f1zUrlDTO selectedUrl) {
        this.selectedUrl = selectedUrl;
    }

    public List<Rl08f1zUrlDTO> getUrls() {
        return urls;
    }

    public void setUrls(List<Rl08f1zUrlDTO> urls) {
        this.urls = urls;
    }

}

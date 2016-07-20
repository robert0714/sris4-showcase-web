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
@XmlType(name = "rl08f10DTO", propOrder = { "voteCode", "voteDate", "labelHead", "selectedUrl", "urls" })
@XmlRootElement(name = "Rl08f10DTO")
public class Rl08f10DTO implements Serializable {

    public Rl08f10UrlDTO getSelectedUrl() {
        return selectedUrl;
    }

    public void setSelectedUrl(Rl08f10UrlDTO selectedUrl) {
        this.selectedUrl = selectedUrl;
    }

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    private String voteDate;

    /** 標題名稱 */
    @XmlElement(name = "labelHead")
    private String labelHead;

    /** 點選的連結 */
    @XmlElement(name = "selectedUrl")
    private Rl08f10UrlDTO selectedUrl;

    /** 超連結 */
    @XmlElement(name = "urls")
    private List<Rl08f10UrlDTO> urls = new ArrayList<Rl08f10UrlDTO>(0);

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<Rl08f10UrlDTO> getUrls() {
        return urls;
    }

    public void setUrls(List<Rl08f10UrlDTO> urls) {
        this.urls = urls;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }
}

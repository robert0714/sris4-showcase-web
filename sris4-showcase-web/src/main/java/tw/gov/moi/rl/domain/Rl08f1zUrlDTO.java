package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f1zUrlDTO", propOrder = { "label", "url" })
@XmlRootElement(name = "Rl08f1zUrlDTO")
public class Rl08f1zUrlDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 名稱顯示 */
    @XmlElement(name = "label")
    private String label;

    /** 投票日期 */
    @XmlElement(name = "url")
    private String url;

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

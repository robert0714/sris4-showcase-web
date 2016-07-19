package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde853wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f12EditDTO", propOrder = { "index", "rlde853wType" })
@XmlRootElement(name = "Rl08f12EditDTO")
public class Rl08f12EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 1 ~ 10 */
    @FieldName("序號 1 ~ 10")
    @XmlElement(name = "index")
    private String index = "";

    /** 投票所檔案 */
    @FieldName("投票所檔案")
    @XmlElement(name = "rlde853wType")
    private Rlde853wType rlde853wType = new Rlde853wType();

    public boolean equals(Object other) {
        Rl08f12EditDTO rl08f12EditDTO = (Rl08f12EditDTO) other;
        if (this.getRlde853wType().getVotePoint().equals(rl08f12EditDTO.getRlde853wType().getVotePoint())
                && this.getRlde853wType().getSiteId().equals(rl08f12EditDTO.getRlde853wType().getSiteId())
                && this.getRlde853wType().getVoteDate().equals(rl08f12EditDTO.getRlde853wType().getVoteDate())
                && this.getRlde853wType().getVoteCode().equals(rl08f12EditDTO.getRlde853wType().getVoteCode())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return getRlde853wType().getVotePoint().hashCode() + getRlde853wType().getSiteId().hashCode()
                + getRlde853wType().getVoteCode().hashCode() + getRlde853wType().getVoteDate().hashCode();
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Rlde853wType getRlde853wType() {
        return rlde853wType;
    }

    public void setRlde853wType(Rlde853wType rlde853wType) {
        this.rlde853wType = rlde853wType;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

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
import tw.gov.moi.domain.Rlde808wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f11RsultDTO", propOrder = { "votePoint", "village", "neighborS", "neighborE", "listRlde808wType" })
@XmlRootElement(name = "Rl08f11RsultDTO")
public class Rl08f11ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 投票所 */
    @FieldName("投票所")
    @XmlElement(name = "votePoint")
    private String votePoint;

    /** 村里 */
    @FieldName("村里 ")
    @XmlElement(name = "village")
    private String village;

    /** 鄰起 */
    @FieldName("鄰起 ")
    @XmlElement(name = "neighborS")
    private String neighborS;

    /** 鄰迄 */
    @FieldName("鄰迄 ")
    @XmlElement(name = "neighborE")
    private String neighborE;

    /** 多筆資料 */
    @FieldName("多筆資料 ")
    @XmlElement(name = "listRlde808wType")
    private List<Rlde808wType> listRlde808wType = new ArrayList<Rlde808wType>();

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighborS() {
        return neighborS;
    }

    public void setNeighborS(String neighborS) {
        this.neighborS = neighborS;
    }

    public String getNeighborE() {
        return neighborE;
    }

    public void setNeighborE(String neighborE) {
        this.neighborE = neighborE;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public boolean equals(Object other) {
        Rl08f11ResultDTO rl08f11AddDTO = (Rl08f11ResultDTO) other;
        if (this.getVotePoint().equals(rl08f11AddDTO.getVotePoint())
                && this.getVillage().equals(rl08f11AddDTO.getVillage())
                && this.getNeighborS().equals(rl08f11AddDTO.getNeighborS())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return getVotePoint().hashCode() + getVillage().hashCode() + getNeighborS().hashCode();
    }

    public List<Rlde808wType> getListRlde808wType() {
        return listRlde808wType;
    }

    public void setListRlde808wType(List<Rlde808wType> listRlde808wType) {
        this.listRlde808wType = listRlde808wType;
    }
}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f11AddDTO", propOrder = { "votePoint", "neighborS", "neighborE", "villageSelected" })
@XmlRootElement(name = "Rl08f11AddDTO")
public class Rl08f11AddDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 投票所 */
    @FieldName("投票所")
    @XmlElement(name = "VotePoint")
    private String votePoint;

    /** 鄰起 */
    @FieldName("鄰起  ")
    @XmlElement(name = "NeighborS")
    private String neighborS;

    /** 鄰迄 */
    @FieldName("鄰迄  ")
    @XmlElement(name = "NeighborE")
    private String neighborE;

    /** 村里Selected */
    @FieldName("村里Selected")
    @XmlElement(name = "VillageSelected")
    private SelectItemFor8f11 villageSelected;

    public SelectItemFor8f11 getVillageSelected() {
        return villageSelected;
    }

    public void setVillageSelected(SelectItemFor8f11 villageSelected) {
        this.villageSelected = villageSelected;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
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

//    public boolean equals(Object other) {
//        Rl08f11AddDTO rl08f11AddDTO = (Rl08f11AddDTO) other;
//        if (this.getVotePoint().equals(rl08f11AddDTO.getVotePoint())
//                && this.getVillageSelected().getLabel().equals(rl08f11AddDTO.getVillageSelected().getLabel())
//                && this.getNeighborS().equals(rl08f11AddDTO.getNeighborS())) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public int hashCode() {
//        return getVotePoint().hashCode() + getVillageSelected().getLabel().hashCode() + getNeighborS().hashCode();
//    }

    public static class SelectItemFor8f11 {

        /** label */
        @FieldName("label")
        @XmlElement(name = "Label")
        private String label;

        /** value */
        @FieldName("value")
        @XmlElement(name = "Value")
        private String value;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "[label=" + label + ", value=" + value + "]";
        }
    }
}

package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04500SelectVillageDTO", propOrder = { "Village", "NeighborStart", "NeighborEnd" })
@XmlRootElement(name = "Rl04500SelectVillageDTO")
public class Rl04500SelectVillageDTO {

    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    @XmlElement(name = "NeighborStart")
    @FieldName("鄰起")
    private String neighborStart = "";

    @XmlElement(name = "NeighborEnd")
    @FieldName("鄰迄")
    private String neighborEnd = "";

    public String getNeighborStart() {
        return neighborStart;
    }

    public void setNeighborStart(String neighborStart) {
        this.neighborStart = neighborStart;
    }

    public String getNeighborEnd() {
        return neighborEnd;
    }

    public void setNeighborEnd(String neighborEnd) {
        this.neighborEnd = neighborEnd;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetAddressDTO", propOrder = { "village", "neighbor", "streetDoorplate", "siteId" })
@XmlRootElement(name = "RlGetAddressDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetAddressDTO implements Serializable {

    private static final long serialVersionUID = -7477531200782454137L;

    @XmlElement(name = "Village", required = false)
    @FieldName("村里")
    private String village;

    @XmlElement(name = "Neighbor", required = false)
    @FieldName("鄰")
    private String neighbor;

    @XmlElement(name = "StreetDoorplate", required = false)
    @FieldName("街路門牌")
    private String streetDoorplate;

    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

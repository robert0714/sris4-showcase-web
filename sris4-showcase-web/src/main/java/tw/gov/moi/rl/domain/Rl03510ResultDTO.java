package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03510ResultDTO", propOrder = { "village", "neighbor", "streetDoorPlate", "householdHeadId",
        "householdId", "siteId" })
@XmlRootElement(name = "Rl03510ResultDTO")
public class Rl03510ResultDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5112075635332576842L;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "Village", required = false)
    private String village;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "Neighbor", required = false)
    private String neighbor;

    /** 街路門牌 */
    @FieldName("街路門牌")
    @XmlElement(name = "StreetDoorPlate", required = false)
    private String streetDoorPlate;

    /** 標準化後之街路門牌 */
    @FieldName("標準化後之街路門牌")
    @XmlElement(name = "FormatStreetDoor", required = false)
    private String formatStreetDoor;

    /** 戶長統號 */
    @FieldName("戶長統號 ")
    @XmlElement(name = "HouseholdHeadId", required = false)
    private String householdHeadId;

    /** 戶號 */
    @FieldName("戶號")
    @XmlElement(name = "HouseholdId", required = false)
    private String householdId;

    /** 作業點代碼 */
    @FieldName("作業點代碼 ")
    @XmlElement(name = "SiteId", required = false)
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

    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

    public String getFormatStreetDoor() {
        return formatStreetDoor;
    }

    public void setFormatStreetDoor(String formatStreetDoor) {
        this.formatStreetDoor = formatStreetDoor;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

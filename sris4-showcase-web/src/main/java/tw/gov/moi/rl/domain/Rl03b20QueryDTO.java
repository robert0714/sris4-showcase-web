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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03b20QueryDTO", propOrder = { "county", "town", "village", "neighbor", "streetDoorplate",
        "resultList" })
@XmlRootElement(name = "Rl03b20QueryDTO")
public class Rl03b20QueryDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 縣市 */
    @XmlElement(name = "County")
    @FieldName("縣市")
    private String county;

    /** 鄉鎮市區 */
    @XmlElement(name = "Town")
    @FieldName("鄉鎮市區")
    private String town;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** Rl03b20Result List */
    @XmlElement(name = "ResultList")
    @FieldName("Rl03b20Result List")
    private List<Rl03b20Result> resultList;

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

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

    public List<Rl03b20Result> getResultList() {
        if (resultList == null) {
            resultList = new ArrayList<Rl03b20Result>();
        }
        return resultList;
    }

    public void setResultList(List<Rl03b20Result> resultList) {
        this.resultList = resultList;
    }

}

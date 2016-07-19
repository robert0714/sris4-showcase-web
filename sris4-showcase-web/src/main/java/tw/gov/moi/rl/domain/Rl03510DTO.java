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
@XmlType(name = "rl03510DTO", propOrder = { "village", "neighbor", "streetDoorPlate", "rl03510DTOResult" })
@XmlRootElement(name = "Rl03510DTO")
public class Rl03510DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3499602381595453739L;

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

    /** 查詢結果資料 */
    @FieldName("查詢結果資料")
    @XmlElement(name = "Rl03510DTOResult", required = false)
    private List<Rl03510ResultDTO> rl03510DTOResult = new ArrayList<Rl03510ResultDTO>();

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
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

    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

    public List<Rl03510ResultDTO> getRl03510DTOResult() {
        return rl03510DTOResult;
    }

    public void setRl03510DTOResult(List<Rl03510ResultDTO> rl03510dtoResult) {
        rl03510DTOResult = rl03510dtoResult;
    }

}

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
@XmlType(name = "rl03540DTO", propOrder = { "village", "neighbor", "streetDoorplate", "registerYyymmdd",
        "registerKind", "registerBatch", "liveNumber", "rl03540List" })
@XmlRootElement(name = "Rl03540DTO")
public class Rl03540DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

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

    /** 編釘日期 */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd;

    /** 編釘類別 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind;

    /** 編釘批號 */
    @XmlElement(name = "RegisterBatch")
    @FieldName("編釘批號")
    private String registerBatch;

    /** 現住口數 */
    @XmlElement(name = "LiveNumber")
    @FieldName("現住口數")
    private String liveNumber;

    /** 里鄰門牌資料清單 */
    @XmlElement(name = "Rl03540List")
    @FieldName("里鄰門牌資料清單")
    private List<Rl03540ResultDTO> rl03540List = new ArrayList<Rl03540ResultDTO>(0);

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    @XmlElement(name = "QueryDTO")
    @FieldName("查詢條件")
    private RlStreetFullAdressDTO queryDTO = new RlStreetFullAdressDTO();

    public RlStreetFullAdressDTO getQueryDTO() {
        return queryDTO;
    }

    public void setQueryDTO(RlStreetFullAdressDTO queryDTO) {
        this.queryDTO = queryDTO;
    }

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

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterKind() {
        return registerKind;
    }

    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    public String getRegisterBatch() {
        return registerBatch;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public String getLiveNumber() {
        return liveNumber;
    }

    public void setLiveNumber(String liveNumber) {
        this.liveNumber = liveNumber;
    }

    public List<Rl03540ResultDTO> getRl03540List() {
        return rl03540List;
    }

    public void setRl03540List(List<Rl03540ResultDTO> rl03540List) {
        this.rl03540List = rl03540List;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

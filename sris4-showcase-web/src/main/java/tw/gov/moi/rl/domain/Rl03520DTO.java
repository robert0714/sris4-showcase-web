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
import tw.gov.moi.domain.Rldf018mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03520DTO", propOrder = { "village", "neighbor", "streetDoorplate", "registerYyymmdd", "modifyKind",
        "modifyDate", "rl03520ResultList" })
@XmlRootElement(name = "Rl03520DTO")
public class Rl03520DTO implements Serializable {

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

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 異動日期 */
    @XmlElement(name = "ModifyDate")
    @FieldName("異動日期")
    private String modifyDate;

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    /** 里鄰門牌資料清單 */
    @XmlElement(name = "Rl03520ResultList")
    @FieldName("里鄰門牌資料清單")
    private List<Rldf018mType> rl03520ResultList = new ArrayList<Rldf018mType>(0);

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

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public List<Rldf018mType> getRl03520ResultList() {
        return rl03520ResultList;
    }

    public void setRl03520ResultList(List<Rldf018mType> rl03520ResultList) {
        this.rl03520ResultList = rl03520ResultList;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}

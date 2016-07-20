package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf052mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07113DTO", propOrder = { "rldf052mType", "transYyymmdd", "village", "neighbor", "houseHeadId",
        "houseId" })
@XmlRootElement(name = "Rl07113DTO")
public class Rl07113DTO implements Serializable {

    private static final long serialVersionUID = 1505396443281503484L;

    /** 詳細資料 */
    @XmlElement(name = "Rldf052mType", required = true)
    @FieldName("詳細資料")
    private Rldf052mType rldf052mType = new Rldf052mType();

    /** 轉錄日期 */
    @XmlElement(name = "TransYyymmdd", required = true)
    @FieldName("轉錄日期")
    private String transYyymmdd;

    /** 村里 */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 戶長統號 */
    @XmlElement(name = "HouseHeadId", required = true)
    @FieldName("戶長統號")
    private String houseHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseId", required = true)
    @FieldName("戶號")
    private String houseId;

    public Rldf052mType getRldf052mType() {
        return rldf052mType;
    }

    public void setRldf052mType(Rldf052mType rldf052mType) {
        this.rldf052mType = rldf052mType;
    }

    public String getTransYyymmdd() {
        return transYyymmdd;
    }

    public void setTransYyymmdd(String transYyymmdd) {
        this.transYyymmdd = transYyymmdd;
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

    public String getHouseHeadId() {
        return houseHeadId;
    }

    public void setHouseHeadId(String houseHeadId) {
        this.houseHeadId = houseHeadId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }
}

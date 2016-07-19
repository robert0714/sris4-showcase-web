package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07111DTO", propOrder = { "rldf001ms", "rldf004ms", "village", "neighborStart", "neighborEnd",
        "yyymmdd", "Kind" })
@XmlRootElement(name = "Rl07111DTO")
public class Rl07111DTO {

    /**
     * 要轉入之1m
     */
    @XmlElement(name = "rldf001ms", required = true)
    @FieldName("轉入之1m")
    private List<Rldf001mType> rldf001ms = new ArrayList<Rldf001mType>();

    /**
     * 要轉入之4m
     */
    @XmlElement(name = "rldf004ms", required = true)
    @FieldName("轉入之4m")
    private List<Rldf004mType> rldf004ms = new ArrayList<Rldf004mType>();

    /** 村里 */
    @XmlElement(name = "village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰起 */
    @XmlElement(name = "neighborStart", required = true)
    @FieldName("鄰起")
    private String neighborStart;

    /** 鄰迄 */
    @XmlElement(name = "neighborEnd", required = true)
    @FieldName("鄰迄 ")
    private String neighborEnd;

    /** 轉入日期 */
    @XmlElement(name = "yyymmdd", required = true)
    @FieldName("轉入日期")
    private String yyymmdd;

    /**
     * 頁面上有三種可能 <li>1:只有輸入時間 <li>2:有時間有村里 <li>3:全部都有輸入包含起訖
     * 
     */
    @XmlElement(name = "village", required = true)
    @FieldName("類型")
    private int Kind;

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

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

    public String getYyymmdd() {
        return yyymmdd;
    }

    public void setYyymmdd(String yyymmdd) {
        this.yyymmdd = yyymmdd;
    }

    public int getKind() {
        return Kind;
    }

    public void setKind(int kind) {
        Kind = kind;
    }

    public List<Rldf001mType> getRldf001ms() {
        return rldf001ms;
    }

    public void setRldf001ms(List<Rldf001mType> rldf001ms) {
        this.rldf001ms = rldf001ms;
    }

    public List<Rldf004mType> getRldf004ms() {
        return rldf004ms;
    }

    public void setRldf004ms(List<Rldf004mType> rldf004ms) {
        this.rldf004ms = rldf004ms;
    }

    @Override
    public String toString() {
        return "Rl07111DTO [village=" + village + ", neighborStart=" + neighborStart + ", neighborEnd=" + neighborEnd
                + ", yyymmdd=" + yyymmdd + ", Kind=" + Kind + "]";
    }

}

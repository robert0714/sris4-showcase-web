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
import tw.gov.moi.domain.Rldf019mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlStreetResultDTO", propOrder = { "HasStartPoint", "HasEndPoint", "Serials" })
@XmlRootElement(name = "rlStreetResultDTO")
public class RlStreetSerialDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "IsStartSearch")
    @FieldName("是否開始")
    private boolean isStartSearchFlag = false;

    @XmlElement(name = "SelectRldf019m")
    @FieldName("選擇到的資料")
    private Rldf019mType selectRldf019m;

    private boolean isSelectRldf19mAdd = false;// 當下選擇到的19m

    @XmlElement(name = "ModifyDate")
    @FieldName("編訂日期")
    private String modifyDate = "";

    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    @XmlElement(name = "StreetDoorPlate")
    @FieldName("門牌")
    private String streetDoorPlate = "";

    @XmlElement(name = "Direct")
    @FieldName("搜尋方向")
    private int direct = 0;

    @XmlElement(name = "Time")
    @FieldName("搜尋次數")
    private int time = 0;

    @XmlElement(name = "Serials")
    @FieldName("串聯結果")
    private RlStreetResultDTO serials;

    @XmlElement(name = "ModifyKind")
    private String modifyKind = "";
    @FieldName("多筆結果")
    private List<Rldf019mType> rldf019ms = null;

    public List<Rldf019mType> getRldf019ms() {
        return rldf019ms;
    }

    public RlStreetSerialDataDTO(Rldf019mType selectRldf019m) {
        this.time = 0;
        this.isStartSearchFlag = false;
        this.selectRldf019m = selectRldf019m;
        this.modifyDate = "";
        this.village = "";
        this.neighbor = "";
        this.streetDoorPlate = "";
        this.direct = 0;
        this.isSelectRldf19mAdd = false;
        this.rldf019ms = new ArrayList<Rldf019mType>();
        this.serials = new RlStreetResultDTO();

    }

    public void addTime() {
        time++;
    }

    public int getTime() {
        return time;
    }

    public void addAll(List<Rldf019mType> rldf019ms) {
        this.rldf019ms.clear();
        this.rldf019ms.addAll(rldf019ms);

    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public Rldf019mType getSelectRldf019m() {
        return selectRldf019m;
    }

    public void setSelectRldf019m(Rldf019mType selectRldf019m) {
        this.selectRldf019m = selectRldf019m;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public RlStreetResultDTO getSerials() {
        return serials;
    }

    public void setSerials(RlStreetResultDTO serials) {
        this.serials = serials;
    }

    public boolean isSelectRldf19mAdd() {
        return isSelectRldf19mAdd;
    }

    public void setSelectRldf19mAdd(boolean isSelectRldf19mAdd) {
        this.isSelectRldf19mAdd = isSelectRldf19mAdd;
    }

    public boolean isStartSearchFlag() {
        return isStartSearchFlag;
    }

    public void setStartSearchFlag(boolean isStartSearchFlag) {
        this.isStartSearchFlag = isStartSearchFlag;
    }

}

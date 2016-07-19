package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlStreetResultDTO", propOrder = { "HasStartPoint", "HasEndPoint", "Serials" })
@XmlRootElement(name = "rlStreetResultDTO")
public class RlStreetResultDTO {

    @XmlElement(name = "HasStartPoint")
    @FieldName("是否已經找到起點")
    private boolean HasStartPoint = false;// 取得最早資料

    @XmlElement(name = "HasEndPoint")
    @FieldName("是否已經找到終點")
    private boolean HasEndPoint = false;// 取得最晚資料

    @XmlElement(name = "Serials")
    @FieldName("找舊的狀態")
    private List<RlStreetSerialResultDTO> serials;
    private Map<String, Boolean> keyCollectMap;

    public RlStreetResultDTO() {
        this.HasStartPoint = false;
        this.HasEndPoint = false;
        this.serials = new ArrayList<RlStreetSerialResultDTO>();
        this.keyCollectMap = new HashMap<String, Boolean>();
    }

    @XmlElement(name = "IsEnd")
    @FieldName("是否執行完成")
    private boolean isEnd = false;

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public boolean isHasStartPoint() {
        return HasStartPoint;
    }

    public void setHasStartPoint(boolean hasStartPoint) {
        HasStartPoint = hasStartPoint;
    }

    public boolean isHasEndPoint() {
        return HasEndPoint;
    }

    public void setHasEndPoint(boolean hasEndPoint) {
        HasEndPoint = hasEndPoint;
    }

    /**
     * 放置最前
     * 
     * @param result
     */
    public void putFirstSerials(RlStreetSerialResultDTO result) {

        this.serials.add(0, result);
    }

    /**
     * 放置最後
     * 
     * @param result
     */
    public void putLastSerials(RlStreetSerialResultDTO result) {

        this.serials.add(result);
    }

    public List<RlStreetSerialResultDTO> getSerials() {
        return serials;
    }

    public void setSerials(List<RlStreetSerialResultDTO> serials) {
        this.serials = serials;
    }

    public Map<String, Boolean> getKeyCollectMap() {
        return keyCollectMap;
    }

}

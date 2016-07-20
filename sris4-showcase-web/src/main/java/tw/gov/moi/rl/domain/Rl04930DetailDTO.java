package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04930DetailDTO", propOrder = { "oldAreaCode", "oldVillage", "oldNeighbor", "newAreaCode",
        "newVillage", "newNeighbor", "newStreetDoorAry", "selectArr", "count" })
@XmlRootElement(name = "Rl04930DetailDTO")
public class Rl04930DetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 調整前行政區域代碼 **/
    @XmlElement(name = "OldAreaCode")
    @FieldName("調整前行政區域代碼")
    private String oldAreaCode;

    /** 調整前村里 **/
    @XmlElement(name = "OldVillage")
    @FieldName("調整前村里")
    private String oldVillage;

    /** 調整前鄰 **/
    @XmlElement(name = "OldNeighbor")
    @FieldName("調整前鄰")
    private String oldNeighbor;

    /** 調整後行政區域代碼 **/
    @XmlElement(name = "NewAreaCode")
    @FieldName("調整後行政區域代碼")
    private String newAreaCode;

    /** 調整後村里 **/
    @XmlElement(name = "NewVillage")
    @FieldName("調整後村里")
    private String newVillage;

    /** 調整後鄰 **/
    @XmlElement(name = "NewNeighbor")
    @FieldName("調整後鄰")
    private String newNeighbor;

    /** 調整門牌清單 **/
    @XmlElement(name = "NewStreetDoorAry")
    @FieldName("調整門牌清單")
    private List<Rl04930ResultDTO> newStreetDoorAry;

    /** 選取清單 */
    @XmlElement(name = "SelectArr")
    @FieldName("選取清單")
    private Rl04930ResultDTO[] selectArr;

    /** 調整門牌筆數 **/
    @XmlElement(name = "Count")
    @FieldName("調整門牌筆數")
    private String count;

    /**
     * @return the oldAreaCode
     */
    public String getOldAreaCode() {
        return oldAreaCode;
    }

    /**
     * @param oldAreaCode
     *            the oldAreaCode to set
     */
    public void setOldAreaCode(String oldAreaCode) {
        this.oldAreaCode = oldAreaCode;
    }

    /**
     * @return the oldVillage
     */
    public String getOldVillage() {
        return oldVillage;
    }

    /**
     * @param oldVillage
     *            the oldVillage to set
     */
    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    /**
     * @return the oldNeighbor
     */
    public String getOldNeighbor() {
        return oldNeighbor;
    }

    /**
     * @param oldNeighbor
     *            the oldNeighbor to set
     */
    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    /**
     * @return the newAreaCode
     */
    public String getNewAreaCode() {
        return newAreaCode;
    }

    /**
     * @param newAreaCode
     *            the newAreaCode to set
     */
    public void setNewAreaCode(String newAreaCode) {
        this.newAreaCode = newAreaCode;
    }

    /**
     * @return the newVillage
     */
    public String getNewVillage() {
        return newVillage;
    }

    /**
     * @param newVillage
     *            the newVillage to set
     */
    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    /**
     * @return the newNeighbor
     */
    public String getNewNeighbor() {
        return newNeighbor;
    }

    /**
     * @param newNeighbor
     *            the newNeighbor to set
     */
    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    /**
     * @return the newStreetDoorAry
     */
    public List<Rl04930ResultDTO> getNewStreetDoorAry() {
        return newStreetDoorAry;
    }

    /**
     * @param newStreetDoorAry
     *            the newStreetDoorAry to set
     */
    public void setNewStreetDoorAry(List<Rl04930ResultDTO> newStreetDoorAry) {
        this.newStreetDoorAry = newStreetDoorAry;
    }

    /**
     * @return the selectArr
     */
    public Rl04930ResultDTO[] getSelectArr() {
        return selectArr;
    }

    /**
     * @param selectArr
     *            the selectArr to set
     */
    public void setSelectArr(Rl04930ResultDTO[] selectArr) {
        this.selectArr = selectArr;
    }

    /**
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * @param count
     *            the count to set
     */
    public void setCount(String count) {
        this.count = count;
    }
}

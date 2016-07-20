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
@XmlType(name = "rl04110DTO", propOrder = { "regDate", "oldVillage", "oldNeighor", "newVillage", "newNeighor",
        "regRange", "newStreetDoorAry", "selectArr" })
@XmlRootElement(name = "Rl04110DTO")
public class Rl04110DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 調整日期 **/
    @XmlElement(name = "RegDate")
    @FieldName("調整日期")
    private String regDate;

    /** 調整前村里 **/
    @XmlElement(name = "OldVillage")
    @FieldName("調整前村里")
    private String oldVillage;

    /** 調整前鄰 **/
    @XmlElement(name = "OldNeighor")
    @FieldName("調整前鄰")
    private String oldNeighor;

    /** 調整後村里 **/
    @XmlElement(name = "NewVillage")
    @FieldName("調整後村里")
    private String newVillage;

    /** 調整後鄰 **/
    @XmlElement(name = "NewNeighor")
    @FieldName("調整後鄰")
    private String newNeighor;

    /** 調整範圍 **/
    @XmlElement(name = "RegRange")
    @FieldName("調整範圍")
    private String regRange;

    /** 調整門牌清單 **/
    @XmlElement(name = "NewStreetDoorAry")
    @FieldName("調整門牌清單")
    private List<Rl04110Result> newStreetDoorAry;

    /** 選取清單 */
    @XmlElement(name = "SelectArr")
    @FieldName("選取清單")
    private Rl04110Result[] selectArr;

    /**
     * @return the regDate
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * @param regDate
     *            the regDate to set
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
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
     * @return the oldNeighor
     */
    public String getOldNeighor() {
        return oldNeighor;
    }

    /**
     * @param oldNeighor
     *            the oldNeighor to set
     */
    public void setOldNeighor(String oldNeighor) {
        this.oldNeighor = oldNeighor;
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
     * @return the newNeighor
     */
    public String getNewNeighor() {
        return newNeighor;
    }

    /**
     * @param newNeighor
     *            the newNeighor to set
     */
    public void setNewNeighor(String newNeighor) {
        this.newNeighor = newNeighor;
    }

    /**
     * @return the regRange
     */
    public String getRegRange() {
        return regRange;
    }

    /**
     * @param regRange
     *            the regRange to set
     */
    public void setRegRange(String regRange) {
        this.regRange = regRange;
    }

    /**
     * @return the newStreetDoorAry
     */
    public List<Rl04110Result> getNewStreetDoorAry() {
        if (newStreetDoorAry == null) {
            this.setNewStreetDoorAry(new ArrayList<Rl04110Result>());
        }
        return newStreetDoorAry;
    }

    /**
     * @param newStreetDoorAry
     *            the newStreetDoorAry to set
     */
    public void setNewStreetDoorAry(List<Rl04110Result> newStreetDoorAry) {
        this.newStreetDoorAry = newStreetDoorAry;
    }

    /**
     * @return the selectArr
     */
    public Rl04110Result[] getSelectArr() {
        return selectArr;
    }

    /**
     * @param selectArr
     *            the selectArr to set
     */
    public void setSelectArr(Rl04110Result[] selectArr) {
        this.selectArr = selectArr;
    }

}
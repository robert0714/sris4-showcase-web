package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03530DTO", propOrder = { "newVillage", "newNeighbor", "newDoorplate", "modifyDate", "oldVillage",
        "odlNeighbor", "oldDoorplate", "modifyKind", "modifyBatch", "totalItems", "viewItems", "button",
        "rl03530ResultList" })
@XmlRootElement(name = "Rl03530DTO")
public class Rl03530DTO {

    /** 變更後村里 */
    @XmlElement(name = "NewVillage")
    @FieldName("變更後村里")
    private String newVillage;
    /** 變更後鄰 */
    @XmlElement(name = "NewNeighbor")
    @FieldName("變更後鄰")
    private String newNeighbor;
    /** 變更後門牌 */
    @XmlElement(name = "NewDoorplate")
    @FieldName("變更後門牌")
    private String newDoorplate;
    /** 變更日期 */
    @XmlElement(name = "ModifyDate")
    @FieldName("變更日期")
    private String modifyDate;
    /** 變更前村里 */
    @XmlElement(name = "OldVillage")
    @FieldName("變更前村里")
    private String oldVillage;
    /** 變更前鄰 */
    @XmlElement(name = "OdlNeighbo")
    @FieldName("變更前鄰")
    private String odlNeighbor;
    /** 變更前門牌 */
    @XmlElement(name = "OldDoorplate")
    @FieldName("變更前門牌")
    private String oldDoorplate;
    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;
    /** 變更批號 */
    @XmlElement(name = "ModifyBatch")
    @FieldName("變更批號")
    private String modifyBatch;
    /** 總筆數 */
    @XmlElement(name = "TotalItems")
    @FieldName("總筆數")
    private int totalItems;
    /** 目前顯示筆數 */
    @XmlElement(name = "ViewItems")
    @FieldName("目前顯示筆數")
    private int viewItems;
    /** button */
    @XmlElement(name = "button")
    @FieldName("button")
    private String button;
    /** 顯示資料 */
    @XmlElement(name = "rl03530ResultList")
    @FieldName("顯示資料")
    private List<Rl03530Result> rl03530ResultList;

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getNewVillage() {
        return newVillage;
    }

    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    public String getNewNeighbor() {
        return newNeighbor;
    }

    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    public String getNewDoorplate() {
        return newDoorplate;
    }

    public void setNewDoorplate(String newDoorplate) {
        this.newDoorplate = newDoorplate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOdlNeighbor() {
        return odlNeighbor;
    }

    public void setOdlNeighbor(String odlNeighbor) {
        this.odlNeighbor = odlNeighbor;
    }

    public String getOldDoorplate() {
        return oldDoorplate;
    }

    public void setOldDoorplate(String oldDoorplate) {
        this.oldDoorplate = oldDoorplate;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getViewItems() {
        return viewItems;
    }

    public void setViewItems(int viewItems) {
        this.viewItems = viewItems;
    }

    public List<Rl03530Result> getRl03530ResultList() {
        if (rl03530ResultList == null) {
            rl03530ResultList = new ArrayList<Rl03530Result>();
        }
        return rl03530ResultList;
    }

    public void setRl03530ResultList(List<Rl03530Result> rl03530ResultList) {
        this.rl03530ResultList = rl03530ResultList;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

}

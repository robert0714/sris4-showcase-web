package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 製作臨時紙質門牌.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01660DTO", propOrder = { "modifyDate", "modifyBatch", "modifyKind", "doorNumber", "doorPageNumber",
        "startPage", "endPage", "isPrintOldDoor", "reportType", "reportURL" })
@XmlRootElement(name = "Rl01660DTO")
public class Rl01660DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8693561681333999521L;

    /** 編釘日期 */
    @FieldName("編釘日期 ")
    @XmlElement(name = "modifyDate", required = false)
    private String modifyDate;

    /** 編釘批號 */
    @FieldName("編釘日期 ")
    @XmlElement(name = "modifyBatch", required = false)
    private String modifyBatch;

    /** 申請種類 */
    @FieldName("申請種類 ")
    @XmlElement(name = "ModifyKind", required = false)
    private String modifyKind;

    /** 門牌總數 */
    @FieldName("門牌總數 ")
    @XmlElement(name = "DoorNumber", required = false)
    private String doorNumber;

    /** 門牌總頁數 */
    @FieldName("門牌總頁數 ")
    @XmlElement(name = "DoorPageNumber", required = false)
    private String doorPageNumber;

    /** 製作起迄頁(起) */
    @FieldName("製作起迄頁(起)")
    @XmlElement(name = "StartPage", required = false)
    private String startPage;

    /** 製作起迄頁(迄) */
    @FieldName("製作起迄頁(迄)")
    @XmlElement(name = "EndPage", required = false)
    private String endPage;

    /** 是否列印舊門牌 */
    @FieldName("是否列印舊門牌 ")
    @XmlElement(name = "IsPrintOldDoor", required = false)
    private String isPrintOldDoor;

    /** 報表格式 */
    @FieldName("報表格式 ")
    @XmlElement(name = "ReportType", required = false)
    private String reportType;

    /** 報表路徑 */
    @FieldName("報表路徑 ")
    @XmlElement(name = "ReportURL", required = false)
    private String reportURL;

    @FieldName("村里 ")
    @XmlElement(name = "Village", required = false)
    private String village;

    @FieldName("鄰 ")
    @XmlElement(name = "Neighbor", required = false)
    private String neighbor;

    @FieldName("門牌")
    @XmlElement(name = "StreetDoorplate", required = false)
    private String streetDoorplate;

    @XmlElement(name = "判斷是否用like or equal")
    @FieldName("查詢類別")
    private String queryType = "P";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
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

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getDoorPageNumber() {
        return doorPageNumber;
    }

    public void setDoorPageNumber(String doorPageNumber) {
        this.doorPageNumber = doorPageNumber;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getEndPage() {
        return endPage;
    }

    public void setEndPage(String endPage) {
        this.endPage = endPage;
    }

    public String getIsPrintOldDoor() {
        return isPrintOldDoor;
    }

    public void setIsPrintOldDoor(String isPrintOldDoor) {
        this.isPrintOldDoor = isPrintOldDoor;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}

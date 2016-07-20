package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04120DTO", propOrder = { "printKind", "oldVillage", "oldNeighor", "newVillage", "newNeighor",
        "sortItem", "reportType", "reportURL" })
@XmlRootElement(name = "Rl04120DTO")
public class Rl04120DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 列印選擇 **/
    @XmlElement(name = "PrintKind")
    @FieldName("列印選擇")
    private String printKind;

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

    /** 排序選擇 **/
    @XmlElement(name = "SortItem")
    @FieldName("排序選擇")
    private String sortItem;

    /** 報表格式 */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * @return the printKind
     */
    public String getPrintKind() {
        return printKind;
    }

    /**
     * @param printKind
     *            the printKind to set
     */
    public void setPrintKind(String printKind) {
        this.printKind = printKind;
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
     * @return the sortItem
     */
    public String getSortItem() {
        return sortItem;
    }

    /**
     * @param sortItem
     *            the sortItem to set
     */
    public void setSortItem(String sortItem) {
        this.sortItem = sortItem;
    }

    /**
     * @return the reportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType
     *            the reportType to set
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * @return the reportURL
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * @param reportURL
     *            the reportURL to set
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}
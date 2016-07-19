package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04400DTO", propOrder = { "modifyDateStart", "modifyDateEnd", "modifyKind", "modifyBatch",
        "doorplateNewOld", "village", "streetDoorplate", "reportURL", "indexColumn" })
@XmlRootElement(name = "Rl04400DTO")
public class Rl04400DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 變更日期(起) **/
    @XmlElement(name = "ModifyDateStart")
    @FieldName("變更日期(起)")
    private String modifyDateStart;

    /** 變更日期(迄) **/
    @XmlElement(name = "ModifyDateEnd")
    @FieldName("變更日期(迄)")
    private String modifyDateEnd;

    /** 異動類別 **/
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 變更批號 **/
    @XmlElement(name = "ModifyBatch")
    @FieldName("變更批號")
    private String modifyBatch;

    /** 門牌變更狀態 **/
    @XmlElement(name = "DoorplateNewOld")
    @FieldName("門牌變更狀態")
    private String doorplateNewOld;

    /** 村里 **/
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 街路門牌 **/
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** 報表URL **/
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    /** 列印排序 */
    @XmlElement(name = "IndexColumn")
    @FieldName("列印排序")
    private String indexColumn;

    /**
     * @return the modifyDateStart
     */
    public String getModifyDateStart() {
        return modifyDateStart;
    }

    /**
     * @param modifyDateStart
     *            the modifyDateStart to set
     */
    public void setModifyDateStart(String modifyDateStart) {
        this.modifyDateStart = modifyDateStart;
    }

    /**
     * @return the modifyDateEnd
     */
    public String getModifyDateEnd() {
        return modifyDateEnd;
    }

    /**
     * @param modifyDateEnd
     *            the modifyDateEnd to set
     */
    public void setModifyDateEnd(String modifyDateEnd) {
        this.modifyDateEnd = modifyDateEnd;
    }

    /**
     * @return the modifyKind
     */
    public String getModifyKind() {
        return modifyKind;
    }

    /**
     * @param modifyKind
     *            the modifyKind to set
     */
    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    /**
     * @return the modifyBatch
     */
    public String getModifyBatch() {
        return modifyBatch;
    }

    /**
     * @param modifyBatch
     *            the modifyBatch to set
     */
    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    /**
     * @return the doorplateNewOld
     */
    public String getDoorplateNewOld() {
        if (this.doorplateNewOld == null) {
            this.setDoorplateNewOld("O");
        }
        return doorplateNewOld;
    }

    /**
     * @param doorplateNewOld
     *            the doorplateNewOld to set
     */
    public void setDoorplateNewOld(String doorplateNewOld) {
        this.doorplateNewOld = doorplateNewOld;
    }

    /**
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village
     *            the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return the streetDoorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * @param streetDoorplate
     *            the streetDoorplate to set
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
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

    /**
     * @return the indexColumn
     */
    public String getIndexColumn() {
        return indexColumn;
    }

    /**
     * @param indexColumn
     *            the indexColumn to set
     */
    public void setIndexColumn(String indexColumn) {
        this.indexColumn = indexColumn;
    }
}

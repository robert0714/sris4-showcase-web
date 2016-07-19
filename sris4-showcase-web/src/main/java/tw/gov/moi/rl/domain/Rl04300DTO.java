package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04300DTO", propOrder = { "registerDateStart", "registerDateEnd", "modifyKind", "village",
        "neighborStart", "neighborEnd", "streetDoorplate", "reportURL" })
@XmlRootElement(name = "Rl04300DTO")
public class Rl04300DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 初編日期(起) */
    @XmlElement(name = "RegisterDateStart")
    @FieldName("初編日期(起)")
    private String registerDateStart = "";

    /** 初編日期(迄) */
    @XmlElement(name = "RegisterDateEnd")
    @FieldName("初編日期(迄)")
    private String registerDateEnd = "";

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind = "";

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰(起) */
    @XmlElement(name = "NeighborStart")
    @FieldName("鄰(起)")
    private String neighborStart = "";

    /** 鄰(迄) */
    @XmlElement(name = "NeighborEnd")
    @FieldName("鄰(迄)")
    private String neighborEnd = "";

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 報表URL */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL = "";

    /**
     * @return the registerDateStart
     */
    public String getRegisterDateStart() {
        return registerDateStart;
    }

    /**
     * @param registerDateStart
     *            the registerDateStart to set
     */
    public void setRegisterDateStart(String registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    /**
     * @return the registerDateEnd
     */
    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    /**
     * @param registerDateEnd
     *            the registerDateEnd to set
     */
    public void setRegisterDateEnd(String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
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
     * @return the neighborStart
     */
    public String getNeighborStart() {
        return neighborStart;
    }

    /**
     * @param neighborStart
     *            the neighborStart to set
     */
    public void setNeighborStart(String neighborStart) {
        this.neighborStart = neighborStart;
    }

    /**
     * @return the neighborEnd
     */
    public String getNeighborEnd() {
        return neighborEnd;
    }

    /**
     * @param neighborEnd
     *            the neighborEnd to set
     */
    public void setNeighborEnd(String neighborEnd) {
        this.neighborEnd = neighborEnd;
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
}

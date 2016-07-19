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
@XmlType(name = "rl04600DTO", propOrder = { "printYN", "streetDoor", "villageList", "reportURL" })
@XmlRootElement(name = "Rl04600DTO")
public class Rl04600DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 列印全部村里 **/
    @XmlElement(name = "PrintYN")
    @FieldName("列印全部村里")
    private String printYN = "Y";

    /** 街路門牌 **/
    @XmlElement(name = "StreetDoor")
    @FieldName("街路門牌")
    private String streetDoor;

    /** 村里清單 **/
    @XmlElement(name = "VillageList")
    @FieldName("村里清單")
    private List<Rl04600ResultDTO> villageList;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * @return the printYN
     */
    public String getPrintYN() {
        return printYN;
    }

    /**
     * @param printYN
     *            the printYN to set
     */
    public void setPrintYN(String printYN) {
        this.printYN = printYN;
    }

    /**
     * @return the streetDoor
     */
    public String getStreetDoor() {
        return streetDoor;
    }

    /**
     * @param streetDoor
     *            the streetDoor to set
     */
    public void setStreetDoor(String streetDoor) {
        this.streetDoor = streetDoor;
    }

    /**
     * @return the villageList
     */
    public List<Rl04600ResultDTO> getVillageList() {
        if (villageList == null) {
            villageList = new ArrayList<Rl04600ResultDTO>();
        }
        return villageList;
    }

    /**
     * @param villageList
     *            the villageList to set
     */
    public void setVillageList(List<Rl04600ResultDTO> villageList) {
        this.villageList = villageList;
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

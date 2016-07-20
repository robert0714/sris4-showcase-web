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
@XmlType(name = "rl04700DTO", propOrder = { "printYN", "streetDoor", "villageList", "reportURL" })
@XmlRootElement(name = "Rl04700DTO")
public class Rl04700DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 列印全部村里 **/
    @XmlElement(name = "PrintYN")
    @FieldName("列印全部村里")
    private String printYN = "N";

    /** 列印無設籍門牌 **/
    @XmlElement(name = "PrintNoSet")
    @FieldName("列印無設籍門牌")
    private String printNoSet = "N";

    /** 村里清單 **/
    @XmlElement(name = "VillageList")
    @FieldName("村里清單")
    private List<Rl04700ResultDTO> villageList;

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
     * @return the printNoSet
     */
    public String getPrintNoSet() {
        return printNoSet;
    }

    /**
     * @param printNoSet
     *            the printNoSet to set
     */
    public void setPrintNoSet(String printNoSet) {
        this.printNoSet = printNoSet;
    }

    /**
     * @return the villageList
     */
    public List<Rl04700ResultDTO> getVillageList() {
        if (villageList == null) {
            villageList = new ArrayList<Rl04700ResultDTO>();
        }
        return villageList;
    }

    /**
     * @param villageList
     *            the villageList to set
     */
    public void setVillageList(List<Rl04700ResultDTO> villageList) {
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

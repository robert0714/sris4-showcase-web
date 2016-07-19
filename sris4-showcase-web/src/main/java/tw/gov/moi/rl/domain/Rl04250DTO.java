package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04250DTO", propOrder = { "RegDate", "PrintOption", "PrintItemOption", "Village", "Neighor",
        "HouseHoldPid", "HouseHoldId", "reportURL" })
@XmlRootElement(name = "Rl04250DTO")
public class Rl04250DTO {

    @XmlElement(name = "RegDate", required = true)
    @FieldName("整編日期")
    private String regDate;

    @XmlElement(name = "PrintOption", required = true)
    @FieldName("列印順序")
    private String printOption;

    @XmlElement(name = "PrintItemOption", required = true)
    @FieldName("列印條件選項")
    private String printItemOption;

    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    @XmlElement(name = "Neighor", required = true)
    @FieldName("鄰")
    private String neighor;

    @XmlElement(name = "HouseHoldPid", required = true)
    @FieldName("戶長統號")
    private String houseHoldPid;

    @XmlElement(name = "HouseHoldId", required = true)
    @FieldName("戶號")
    private String houseHoldId;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(final String regDate) {
        this.regDate = regDate;
    }

    public String getPrintOption() {
        return printOption;
    }

    public void setPrintOption(final String printOption) {
        this.printOption = printOption;
    }

    public String getPrintItemOption() {
        return printItemOption;
    }

    public void setPrintItemOption(final String printItemOption) {
        this.printItemOption = printItemOption;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public String getNeighor() {
        return neighor;
    }

    public void setNeighor(final String neighor) {
        this.neighor = neighor;
    }

    public String getHouseHoldPid() {
        return houseHoldPid;
    }

    public void setHouseHoldPid(final String houseHoldPid) {
        this.houseHoldPid = houseHoldPid;
    }

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(final String houseHoldId) {
        this.houseHoldId = houseHoldId;
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

package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04220DTO", propOrder = { "printKind", "village", "neighbor", "registerDate",
        "oldStreetDoorplateSTD", "countieName", "areaName", "adminOfficeName", "sysdate", "indexColumn", "reportType",
        "reportURL" })
@XmlRootElement(name = "Rl04220DTO")
public class Rl04220DTO {

    /** 列印選擇 */
    @XmlElement(name = "PrintKind")
    @FieldName("列印選擇 ")
    private String printKind;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 編釘日期 */
    @XmlElement(name = "RegisterDate")
    @FieldName("編釘日期")
    private String registerDate;

    /** 整編前街路門牌標準門牌 */
    @XmlElement(name = "OldStreetDoorplateSTD")
    @FieldName("整編前街路門牌標準門牌")
    private String oldStreetDoorplateSTD;

    /** 省縣市 */
    @XmlElement(name = "CountieName")
    @FieldName("省縣市")
    private String countieName;

    /** 鄉鎮市區 */
    @XmlElement(name = "AreaName")
    @FieldName("鄉鎮市區")
    private String areaName;

    /** 戶政所名 */
    @XmlElement(name = "AdminOfficeName")
    @FieldName("戶政所名")
    private String adminOfficeName;

    /** 系統日期 */
    @XmlElement(name = "Sysdate")
    @FieldName("系統日期")
    private String sysdate;

    /** 列印排序 */
    @XmlElement(name = "IndexColumn")
    @FieldName("列印排序")
    private String indexColumn;

    /** 報表格式 */
    @XmlElement(name = "ReportType")
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    public String getPrintKind() {
        return printKind;
    }

    public void setPrintKind(String printKind) {
        this.printKind = printKind;
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

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getOldStreetDoorplateSTD() {
        return oldStreetDoorplateSTD;
    }

    public void setOldStreetDoorplateSTD(String oldStreetDoorplateSTD) {
        this.oldStreetDoorplateSTD = oldStreetDoorplateSTD;
    }

    public String getCountieName() {
        return countieName;
    }

    public void setCountieName(String countieName) {
        this.countieName = countieName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAdminOfficeName() {
        return adminOfficeName;
    }

    public void setAdminOfficeName(String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    public String getSysdate() {
        return sysdate;
    }

    public void setSysdate(String sysdate) {
        this.sysdate = sysdate;
    }

    public String getIndexColumn() {
        return indexColumn;
    }

    public void setIndexColumn(String indexColumn) {
        this.indexColumn = indexColumn;
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

    @Override
    public String toString() {
        return "Rl04220DTO [printKind=" + printKind + ", village=" + village + ", neighbor=" + neighbor
                + ", registerDate=" + registerDate + ", oldStreetDoorplateSTD=" + oldStreetDoorplateSTD
                + ", countieName=" + countieName + ", areaName=" + areaName + ", adminOfficeName=" + adminOfficeName
                + ", sysdate=" + sysdate + ", indexColumn=" + indexColumn + ", reportType=" + reportType
                + ",reportURL=" + reportURL + "]";
    }

}

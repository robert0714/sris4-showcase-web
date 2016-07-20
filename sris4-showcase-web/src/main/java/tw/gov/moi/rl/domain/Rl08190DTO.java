package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;

/**
 * 戶籍人口統計月報表案件數清查表處理.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08190DTO", propOrder = { "dataYyymm", "reportKind", "registerType", "villageList",
        "villageValueList", "villageItems", "reportType", "reportURL", "siteName", "kind1DataList", "kind2DataList" })
@XmlRootElement(name = "Rl08190DTO")
public class Rl08190DTO extends BaseITextReportParams implements Serializable {

    private static final long serialVersionUID = 1652284573644087246L;

    /** 統計年月. */
    @XmlElement(name = "dataYyymm", required = false)
    @FieldName("統計年月")
    private String dataYyymm;

    /** 報表類別. */
    @XmlElement(name = "reportKind", required = false)
    @FieldName("報表類別")
    private String reportKind;

    /** 登記類別. */
    @XmlElement(name = "registerType", required = false)
    @FieldName("登記類別")
    private String registerType;

    /** 村里. */
    @XmlElement(name = "villageList", required = false)
    @FieldName("村里")
    private List<String> villageList = new ArrayList<String>();

    @XmlElement(name = "villageList", required = false)
    @FieldName("村里")
    private List<String> villageValueList = new ArrayList<String>();

    /** 村里選項. */
    @XmlElement(name = "villageItems", required = false)
    @FieldName("村里選項")
    private List<String> villageItems = new ArrayList<String>();

    /** 報表格式 */
    @XmlElement(name = "reportType", required = false)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "reportURL", required = false)
    @FieldName("報表路徑")
    private String reportURL;

    /** 戶政所別. */
    @XmlElement(name = "SiteName", required = false)
    @FieldName("戶政所別")
    private String siteName = "";

    /** 統計表資料. */
    @XmlElement(name = "Kind1DataList", required = false)
    @FieldName("統計表資料")
    private List<Rlrp08190DTO> kind1DataList = new ArrayList<Rlrp08190DTO>();

    /** 清查表資料. */
    @XmlElement(name = "Kind2DataList", required = false)
    @FieldName("清查表資料")
    private List<Rlrp08191DTO> kind2DataList = new ArrayList<Rlrp08191DTO>();

    public List<String> getVillageValueList() {
        return villageValueList;
    }

    public void setVillageValueList(List<String> villageValueList) {
        this.villageValueList = villageValueList;
    }

    public String getDataYyymm() {
        return dataYyymm;
    }

    public void setDataYyymm(String dataYyymm) {
        this.dataYyymm = dataYyymm;
    }

    public String getReportKind() {
        return reportKind;
    }

    public void setReportKind(String reportKind) {
        this.reportKind = reportKind;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public List<String> getVillageList() {
        return villageList;
    }

    public void setVillageList(List<String> villageList) {
        this.villageList = villageList;
    }

    public List<String> getVillageItems() {
        return villageItems;
    }

    public void setVillageItems(List<String> villageItems) {
        this.villageItems = villageItems;
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
    public String getMainReportName() {

        final String strReportKind = getReportKind();
        final String strRegisterType = getRegisterType();
        String returnVal = StringUtils.EMPTY;

        // 統計表
        if (StringUtils.equals("1", strReportKind)) {
            returnVal = "RLRP08190" + strRegisterType;
        }
        // 清查表
        else if (StringUtils.equals("2", strReportKind)) {
            returnVal = "RLRP0819" + strRegisterType;
        }

        return returnVal;
    }

    @Override
    public String getReportExt() {
        return getMainReportName();
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(this.reportType) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public List<Rlrp08190DTO> getKind1DataList() {
        return this.kind1DataList;
    }

    public void setKind1DataList(List<Rlrp08190DTO> kind1DataList) {
        this.kind1DataList = kind1DataList;
    }

    public List<Rlrp08191DTO> getKind2DataList() {
        return this.kind2DataList;
    }

    public void setKind2DataList(List<Rlrp08191DTO> kind2DataList) {
        this.kind2DataList = kind2DataList;
    }

}

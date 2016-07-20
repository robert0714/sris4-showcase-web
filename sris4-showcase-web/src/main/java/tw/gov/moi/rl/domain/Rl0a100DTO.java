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
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a100DTO", propOrder = { "feeItemName", "dateList", "selectedObject", "actionObject" })
@XmlRootElement(name = "Rl0a100DTO")
public class Rl0a100DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2290942245050190572L;

    /** 規費項目 */
    @XmlElement(name = "FeeCode")
    @FieldName("規費項目")
    private String feeCode;

    /** 報表編號 */
    @XmlElement(name = "ReportCode")
    @FieldName("報表編號 ")
    private String reportCode;

    /** 收費年 */
    @XmlElement(name = "StatisticYyy")
    @FieldName("收費年")
    private String statisticYyy;

    /** 收費月 */
    @XmlElement(name = "StatisticMm")
    @FieldName("收費月")
    private String statisticMm;

    /** 收費日期 */
    @XmlElement(name = "ChargeDate")
    @FieldName("收費日期")
    private String chargeDate;

    /** 收費日期起 */
    @XmlElement(name = "ChargeDateStart")
    @FieldName("收費日期起")
    private String chargeDateStart;
    /** 收費日期迄 */
    @XmlElement(name = "ChargeDateEnd")
    @FieldName("收費日期迄")
    private String chargeDateEnd;
    /** 收費日戶籍員帳號AutoBean */
    @XmlElement(name = "RegisterIdQueryAutoBean")
    @FieldName("收費日戶籍員帳號AutoBean")
    private String registerIdQueryAutoBean;

    /** 下載檔案URL. */
    @XmlElement(name = "FileURL")
    @FieldName("下載檔案URL")
    private String fileURL;

    /** 報表檔案URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表檔案URL")
    private String reportURL;

    /** 檔案格式. */
    @XmlElement(name = "RreportFormat")
    @FieldName("檔案格式")
    private String reportFormat = RlConstant.ReportFormat.CSV.name();

    /** 規費項目list. */
    @XmlElement(name = "FeeItemList")
    @FieldName("規費項目list")
    private List<Rldfu001Type> feeItemList = new ArrayList<Rldfu001Type>();
    /** 規費收費人員list. */
    @XmlElement(name = "FeeRegistratList")
    @FieldName("規費收費人員list")
    private List<Object[]> feeRegistratList = new ArrayList<Object[]>();

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getStatisticYyy() {
        return statisticYyy;
    }

    public void setStatisticYyy(String statisticYyy) {
        this.statisticYyy = statisticYyy;
    }

    public String getStatisticMm() {
        return statisticMm;
    }

    public void setStatisticMm(String statisticMm) {
        this.statisticMm = statisticMm;
    }

    public String getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate;
    }

    public String getChargeDateStart() {
        return chargeDateStart;
    }

    public void setChargeDateStart(String chargeDateStart) {
        this.chargeDateStart = chargeDateStart;
    }

    public String getChargeDateEnd() {
        return chargeDateEnd;
    }

    public void setChargeDateEnd(String chargeDateEnd) {
        this.chargeDateEnd = chargeDateEnd;
    }

    public String getRegisterIdQueryAutoBean() {
        return registerIdQueryAutoBean;
    }

    public void setRegisterIdQueryAutoBean(String registerIdQueryAutoBean) {
        this.registerIdQueryAutoBean = registerIdQueryAutoBean;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public List<Rldfu001Type> getFeeItemList() {
        return feeItemList;
    }

    public void setFeeItemList(List<Rldfu001Type> feeItemList) {
        this.feeItemList = feeItemList;
    }

    public List<Object[]> getFeeRegistratList() {
        return feeRegistratList;
    }

    public void setFeeRegistratList(List<Object[]> feeRegistratList) {
        this.feeRegistratList = feeRegistratList;
    }

}

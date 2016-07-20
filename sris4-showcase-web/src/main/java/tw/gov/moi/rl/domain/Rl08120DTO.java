package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rsdfz212Type;
import tw.gov.moi.domain.Rsdfz215Type;

/**
 * 製作戶口校正未接受校正人口數及其原因統計表處理.
 * 
 * @author KenFC
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08120DTO", propOrder = { "registerDate", "isSendMessage", "execute", "executeDate", "executeTime",
        "panelMessage", "dataBaseBackup", "registerLastMonthDate" })
@XmlRootElement(name = "Rl08120DTO")
public class Rl08120DTO implements Serializable {

    private static final long serialVersionUID = 1228901693854787531L;

    /** 統計基準日(YYYMM) */
    @XmlElement(name = "RegisterDate", required = false)
    @FieldName("統計基準日")
    private String registerDate;

    /** 是否通報 */
    @XmlElement(name = "IsSendMessage", required = false)
    @FieldName("是否通報")
    private String isSendMessage;

    /** 是否執行過. */
    @XmlElement(name = "Execute", required = false)
    @FieldName("是否執行過")
    private boolean execute = false;

    /** 執行日期. */
    @XmlElement(name = "ExecuteDate", required = false)
    @FieldName("執行日期")
    private String executeDate = "";

    /** 執行時間. */
    @XmlElement(name = "ExecuteTime", required = false)
    @FieldName("執行時間")
    private String executeTime = "";

    /** 顯示訊息. */
    @XmlElement(name = "PanelMessage", required = false)
    @FieldName("顯示訊息")
    private String panelMessage = "";

    /** 資料庫是否已備份. */
    @XmlElement(name = "dataBaseBackup", required = false)
    @FieldName("資料庫是否已備份")
    private boolean dataBaseBackup = false;

    /** 上月份統計基準日(YYYMMDD) */
    @XmlElement(name = "RegisterLastMonthDate", required = false)
    @FieldName("上月份統計基準日")
    private String registerLastMonthDate = "";

    @XmlElement(name = "rptUrl", required = false)
    @FieldName("rptUrl")
    private String rptUrl;

    @XmlElement(name = "siteId", required = false)
    @FieldName("siteId")
    private String siteId;

    private List<Rsdfz215Type> tempRsdfz215TypeList;

    private List<Rsdfz212Type> tempRsdfz212TypeList;

    @XmlElement(name = "dumpNumber", required = false)
    @FieldName("dumpNumber")
    private String dumpNumber;

    @XmlElement(name = "reportFormat", required = false)
    @FieldName("reportFormat")
    private String reportFormat;

    private String adminOfficeCode;
    private String areaCode;

    private String baseDate;

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getDumpNumber() {
        return dumpNumber;
    }

    public void setDumpNumber(String dumpNumber) {
        this.dumpNumber = dumpNumber;
    }

    public List<Rsdfz215Type> getTempRsdfz215TypeList() {
        return tempRsdfz215TypeList;
    }

    public void setTempRsdfz215TypeList(List<Rsdfz215Type> tempRsdfz215TypeList) {
        this.tempRsdfz215TypeList = tempRsdfz215TypeList;
    }

    public List<Rsdfz212Type> getTempRsdfz212TypeList() {
        return tempRsdfz212TypeList;
    }

    public void setTempRsdfz212TypeList(List<Rsdfz212Type> tempRsdfz212TypeList) {
        this.tempRsdfz212TypeList = tempRsdfz212TypeList;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getRptUrl() {
        return rptUrl;
    }

    public void setRptUrl(String rptUrl) {
        this.rptUrl = rptUrl;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getIsSendMessage() {
        return isSendMessage;
    }

    public void setIsSendMessage(String isSendMessage) {
        this.isSendMessage = isSendMessage;
    }

    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public boolean isExecute() {
        return execute;
    }

    public void setExecute(boolean execute) {
        this.execute = execute;
    }

    public String getPanelMessage() {
        return panelMessage;
    }

    public void setPanelMessage(String panelMessage) {
        this.panelMessage = panelMessage;
    }

    public boolean isDataBaseBackup() {
        return dataBaseBackup;
    }

    public void setDataBaseBackup(boolean dataBaseBackup) {
        this.dataBaseBackup = dataBaseBackup;
    }

    public String getRegisterLastMonthDate() {
        return registerLastMonthDate;
    }

    public void setRegisterLastMonthDate(String registerLastMonthDate) {
        this.registerLastMonthDate = registerLastMonthDate;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(String baseDate) {
        this.baseDate = baseDate;
    }
}

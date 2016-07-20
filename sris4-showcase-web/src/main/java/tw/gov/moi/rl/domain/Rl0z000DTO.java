package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.RedfrptfType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0z000DTO", propOrder = { "reportDateS", "reportDateE", "reportId", "applyStatus", "approveStatus",
        "rejectReason", "approveButton", "ResultList", "fileName" })
@XmlRootElement(name = "Rl0z000DTO")
public class Rl0z000DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /** 詢問訊息 */
    @XmlElement(name = "ConfirmMessage", required = true)
    @FieldName("詢問訊息")
    private String confirmMessage;

    /** The selected array. */
    @FieldName("The selected array.")
    private RedfrptfType[] selectedArray;

    /** 製表日期(起) */
    @XmlElement(name = "reportDateS")
    @FieldName("製表日期(起)")
    private String reportDateS = "";

    /** 製表日期(迄) */
    @XmlElement(name = "reportDateE")
    @FieldName("製表日期(迄)")
    private String reportDateE = "";

    /** 報表名稱 */
    @XmlElement(name = "reportId")
    @FieldName("報表名稱")
    private String reportId = "";

    /** 申請狀況 */
    @XmlElement(name = "applyStatus")
    @FieldName("申請狀況")
    private String applyStatus = "";

    /** 審核狀況 */
    @XmlElement(name = "approveStatus")
    @FieldName("審核狀況")
    private String approveStatus = "";

    /** 核退理由 */
    @XmlElement(name = "rejectReason")
    @FieldName("核退理由")
    private String rejectReason = "";

    /** 審核按鈕 */
    @XmlElement(name = "approveButton")
    @FieldName("審核按鈕")
    private String approveButton = "";

    /** 資料結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("資料結果")
    private List<RedfrptfType> resultList;

    /** 檔案名稱 */
    @XmlElement(name = "FileName", required = false)
    @FieldName("檔案名稱")
    private String fileName;

    public String getApplyStatus() {
        return applyStatus;
    }

    public String getApproveButton() {
        return approveButton;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public String getConfirmMessage() {
        return confirmMessage;
    }

    public String getFileName() {
        return fileName;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public String getReportDateE() {
        return reportDateE;
    }

    public String getReportDateS() {
        return reportDateS;
    }

    public String getReportId() {
        return reportId;
    }

    public List<RedfrptfType> getResultList() {
        return resultList;
    }

    public RedfrptfType[] getSelectedArray() {
        return selectedArray;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public void setApproveButton(String approveButton) {
        this.approveButton = approveButton;
    }

    public void setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
    }

    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public void setReportDateE(String reportDateE) {
        this.reportDateE = reportDateE;
    }

    public void setReportDateS(String reportDateS) {
        this.reportDateS = reportDateS;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public void setResultList(List<RedfrptfType> resultList) {
        this.resultList = resultList;
    }

    public void setSelectedArray(RedfrptfType[] selectedArray) {
        this.selectedArray = selectedArray;
    }

}

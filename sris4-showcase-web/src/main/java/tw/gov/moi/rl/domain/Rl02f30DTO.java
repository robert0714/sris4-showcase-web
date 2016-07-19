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
@XmlType(name = "rl02f30DTO", propOrder = { "printType", "rl2100PrintDateStart", "rl2100PrintDateEnd", "applyTxnId",
        "resultList", "selectedAll", "paymentWay", "reportUrl", "disabledPrintBtn" })
@XmlRootElement(name = "Rl02f30DTO")
public class Rl02f30DTO implements Serializable {

    private static final long serialVersionUID = -6717287707959950690L;

    /** 列印種類. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType = "";

    /** 製作日期起. */
    @XmlElement(name = "Rl2100PrintDateStart")
    @FieldName("製作日期起")
    private String rl2100PrintDateStart = "";

    /** 製作日期迄. */
    @XmlElement(name = "Rl2100PrintDateEnd")
    @FieldName("製作日期迄")
    private String rl2100PrintDateEnd = "";

    /** 申請大宗戶籍謄本交易序號. */
    @XmlElement(name = "ApplyTxnId")
    @FieldName("申請大宗戶籍謄本交易序號")
    private String applyTxnId = "";

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl02f30ResultDTO> resultList = new ArrayList<Rl02f30ResultDTO>();

    /** 勾選全部. */
    @XmlElement(name = "SelectedAll")
    @FieldName("勾選全部")
    private boolean selectedAll = false;

    /** 繳費方式. */
    @XmlElement(name = "PaymentWay")
    @FieldName("繳費方式")
    private String paymentWay = "";

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    /** 控制收據列印按鈕是否Disabled. */
    @XmlElement(name = "DisabledPrintBtn")
    @FieldName("控制收據列印按鈕是否Disabled")
    private boolean disabledPrintBtn = true;

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getRl2100PrintDateStart() {
        return rl2100PrintDateStart;
    }

    public void setRl2100PrintDateStart(String rl2100PrintDateStart) {
        this.rl2100PrintDateStart = rl2100PrintDateStart;
    }

    public String getRl2100PrintDateEnd() {
        return rl2100PrintDateEnd;
    }

    public void setRl2100PrintDateEnd(String rl2100PrintDateEnd) {
        this.rl2100PrintDateEnd = rl2100PrintDateEnd;
    }

    public String getApplyTxnId() {
        return applyTxnId;
    }

    public void setApplyTxnId(String applyTxnId) {
        this.applyTxnId = applyTxnId;
    }

    public List<Rl02f30ResultDTO> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rl02f30ResultDTO> resultList) {
        this.resultList = resultList;
    }

    public boolean isSelectedAll() {
        return selectedAll;
    }

    public void setSelectedAll(boolean selectedAll) {
        this.selectedAll = selectedAll;
    }

    public String getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public boolean isDisabledPrintBtn() {
        return disabledPrintBtn;
    }

    public void setDisabledPrintBtn(boolean disabledPrintBtn) {
        this.disabledPrintBtn = disabledPrintBtn;
    }

}

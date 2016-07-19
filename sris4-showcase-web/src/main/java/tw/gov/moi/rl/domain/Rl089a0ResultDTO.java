package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl089a0ResultDTO", propOrder = { "statisticUnit", "fst", "rep", "chg", "fake", "total",
        "isSendNotice", "reportURL", "funType" })
public class Rl089a0ResultDTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** 統計期間 */
    @XmlElement(name = "StatisticUnit", required = false)
    @FieldName("統計期間")
    private String statisticUnit;

    /** 偽冒初領數 */
    @XmlElement(name = "Fst", required = false)
    @FieldName("偽冒初領數")
    private String fst = RlConstant.STRING_ZERO;

    /** 偽冒補領數 */
    @XmlElement(name = "Rep", required = false)
    @FieldName("偽冒補領數")
    private String rep = RlConstant.STRING_ZERO;

    /** 偽冒換領數 */
    @XmlElement(name = "Chg", required = false)
    @FieldName("偽冒換領數")
    private String chg = RlConstant.STRING_ZERO;

    /** 變造數 */
    @XmlElement(name = "Fake", required = false)
    @FieldName("變造數")
    private String fake = RlConstant.STRING_ZERO;

    /** 總計 */
    @XmlElement(name = "Total", required = false)
    @FieldName("總計")
    private String total = RlConstant.STRING_ZERO;

    /** 是否通報 */
    @XmlElement(name = "IsSendNotice", required = false)
    @FieldName("是否通報")
    private String isSendNotice = RlConstant.NO_CHAR;

    /** 是否列印 */
    // @XmlElement(name = "IsPrint", required = false)
    // private String isPrint = RlConstant.NO_CHAR;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = false)
    @FieldName("報表路徑")
    private String reportURL;

    /** 功能型別 */
    @XmlElement(name = "FunType", required = false)
    @FieldName("功能型別")
    private String funType = RlConstant.STRING_ZERO;

    public String getStatisticUnit() {
        return statisticUnit;
    }

    public void setStatisticUnit(String statisticUnit) {
        this.statisticUnit = statisticUnit;
    }

    public String getFst() {
        return fst;
    }

    public void setFst(String fst) {
        this.fst = fst;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public String getChg() {
        return chg;
    }

    public void setChg(String chg) {
        this.chg = chg;
    }

    public String getFake() {
        return fake;
    }

    public void setFake(String fake) {
        this.fake = fake;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getIsSendNotice() {
        return isSendNotice;
    }

    public void setIsSendNotice(String isSendNotice) {
        this.isSendNotice = isSendNotice;
    }

    // public String getIsPrint() {
    // return isPrint;
    // }
    //
    // public void setIsPrint(String isPrint) {
    // this.isPrint = isPrint;
    // }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getFunType() {
        return funType;
    }

    public void setFunType(String funType) {
        this.funType = funType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

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
import tw.gov.moi.domain.RedfrptfType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08310DTO", propOrder = { "ifAll", "beginDate", "rl08310Edit", "message" })
@XmlRootElement(name = "Rl08310DTO")
public class Rl08310DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 是否全部轉錄 */
    @XmlElement(name = "IfAll")
    @FieldName("是否全部轉錄")
    private String ifAll;

    /** 統計基準日 */
    @XmlElement(name = "BeginDate")
    @FieldName("統計基準日")
    private String beginDate;

    /** Rl08310Result Edit List. */
    @XmlElement(name = "Rl08310Edit")
    @FieldName("Rl08310Result Edit List")
    private List<Rl08310Result> rl08310Edit;

    /** 訊息 */
    @XmlElement(name = "Message")
    @FieldName("訊息")
    private String message;

    @XmlElement(name = "RedfrptfType")
    @FieldName("RedfrptfType")
    private RedfrptfType redfrptfType;

    /** SiteIdFind */
    @XmlElement(name = "SiteIdFind")
    @FieldName("siteIdFind")
    private String siteIdFind;

    @XmlElement(name = "dumpNumber", required = false)
    @FieldName("dumpNumber")
    private String dumpNumber;

    public String getIfAll() {
        return ifAll;
    }

    public void setIfAll(String ifAll) {
        this.ifAll = ifAll;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public List<Rl08310Result> getRl08310Edit() {
        if (rl08310Edit == null) {
            rl08310Edit = new ArrayList<Rl08310Result>();
        }
        return rl08310Edit;
    }

    public void setRl08310Edit(List<Rl08310Result> rl08310Edit) {
        this.rl08310Edit = rl08310Edit;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSiteIdFind() {
        return siteIdFind;
    }

    public void setSiteIdFind(String siteIdFind) {
        this.siteIdFind = siteIdFind;
    }

    public String getDumpNumber() {
        return dumpNumber;
    }

    public void setDumpNumber(String dumpNumber) {
        this.dumpNumber = dumpNumber;
    }

    public RedfrptfType getRedfrptfType() {
        return redfrptfType;
    }

    public void setRedfrptfType(RedfrptfType redfrptfType) {
        this.redfrptfType = redfrptfType;
    }
}

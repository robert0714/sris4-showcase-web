package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05271DTO", propOrder = { "Code", "Message", "ReportURL" })
@XmlRootElement(name = "Rl05271DTO")
public class Rl05271DTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 類型. */
    @XmlElement(name = "Code")
    @FieldName("代碼")
    private String code;

    /** 類型. */
    @XmlElement(name = "Message")
    @FieldName("訊息")
    private String message;

    /** 類型. */
    @XmlElement(name = "ReportURL")
    @FieldName("ReportURL")
    private String reportURL;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Rl05271DTO [code=" + code + ", message=" + message + "]";
    }

}

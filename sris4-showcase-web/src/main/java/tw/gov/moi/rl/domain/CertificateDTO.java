package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * CertificateDTO
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificateDTO", propOrder = { "CertificateKeyDTO", "OtherCertificateTemplate",
        "OtherCertificateCode", "OtherCertificate", "CertificateList", "isOtherCertificateShow", "PayType" })
@XmlRootElement(name = "CertificateDTO")
public class CertificateDTO {
    //
    // @XmlElement(name = "CertificateKeyDTO")
    // @FieldName("附繳證件key ")
    // private CertificateKeyDTO certificateKeyDTO = new CertificateKeyDTO();

    // private Object rldfsxx = null;

    @XmlElement(name = "OtherCertificateTemplate")
    @FieldName("其他附繳證件樣板")
    private String otherCertificateTemplate = "";

    @XmlElement(name = "OtherCertificateCode")
    @FieldName("其他附繳證件代碼")
    private String otherCertificateCode = "";

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate = "";

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 是否顯示其他附繳證件. */
    @XmlElement(name = "isOtherCertificateShow")
    @FieldName("是否顯示其他附繳證件")
    private Boolean isOtherCertificateShow = false;

    private String category = "";

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificateCode() {
        return otherCertificateCode;
    }

    public void setOtherCertificateCode(String otherCertificateCode) {
        this.otherCertificateCode = otherCertificateCode;
    }

    public String getOtherCertificateTemplate() {
        return otherCertificateTemplate;
    }

    public void setOtherCertificateTemplate(String otherCertificateTemplate) {
        this.otherCertificateTemplate = otherCertificateTemplate;
    }

    public Boolean getIsOtherCertificateShow() {
        return isOtherCertificateShow;
    }

    public void setIsOtherCertificateShow(Boolean isOtherCertificateShow) {
        this.isOtherCertificateShow = isOtherCertificateShow;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // public Object getRldfsxx() {
    // return rldfsxx;
    // }
    //
    // public void setRldfsxx(Object rldfsxx) {
    // this.rldfsxx = rldfsxx;
    // }

}

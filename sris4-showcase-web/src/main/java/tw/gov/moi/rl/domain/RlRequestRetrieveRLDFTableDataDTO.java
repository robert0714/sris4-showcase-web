package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRequestRetrieveRLDFTableDataDTO", propOrder = { "transactionId", "siteId", "classTypeSimpleName","userId" })
@XmlRootElement(name = "RlRequestRetrieveRLDFTableDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlRequestRetrieveRLDFTableDataDTO implements java.io.Serializable{

    private static final long serialVersionUID = 5395172381788593746L;

    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    @FieldName("申請書類別簡碼")
    @XmlElement(name = "ClassTypeSimpleName", required = true)
    private String classTypeSimpleName = "";
    
    @FieldName("戶籍員代碼")
    @XmlElement(name = "userId", required = true)
    private String userId = "";

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getClassTypeSimpleName() {
        return classTypeSimpleName;
    }

    public void setClassTypeSimpleName(String classTypeSimpleName) {
        this.classTypeSimpleName = classTypeSimpleName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}

package tw.gov.moi.rl.component.mutltiDataPocess.modules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlGetMultiDataAppendLogicModuleParams", propOrder = { "transactionId", "userId", "siteId" })
@XmlRootElement(name = "RlGetMultiDataAppendLogicModuleParams")
public class RlGetMultiDataAppendLogicModuleParams {
    @XmlElement(name = "transactionId")
    private String transactionId;
    @XmlElement(name = "userId")
    private String userId;
    @XmlElement(name = "siteId")
    private String siteId;
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

package tw.gov.moi.rl.domain;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.util.StringCompressUtil;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlResponseRetrieveRLDFTableDataDTO", propOrder = { "transactionId", "siteId", "classTypeSimpleName","userId",
        "serializedData" })
@XmlRootElement(name = "RlResponseRetrieveRLDFTableDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlResponseRetrieveRLDFTableDataDTO implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    @FieldName("作業點代碼")
    @XmlElement(name = "TiteId", required = true)
    private String siteId = "";

    @FieldName("申請書類別簡碼")
    @XmlElement(name = "ClassTypeSimpleName", required = true)
    private String classTypeSimpleName = "";
    
    @FieldName("戶籍員代碼")
    @XmlElement(name = "userId", required = true)
    private String userId = "";
    

    @FieldName("序列化內容")
    @XmlElement(name = "SerializedData", required = true)
    private String serializedData;

    public String getSerializedData() {
        return serializedData;
    }

    public void setSerializedData(String serializedData) {
        this.serializedData = serializedData;
    }

    public void setRldfObject(Object obj) throws IOException {	
        serializedData = StringCompressUtil.serializeAsBase64(obj);
    }

    public Object getRldfObject() throws IOException, ClassNotFoundException {	
        return StringCompressUtil.deserializeFromBase64(serializedData);
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClassTypeSimpleName() {
        return classTypeSimpleName;
    }

    public void setClassTypeSimpleName(String classTypeSimpleName) {
        this.classTypeSimpleName = classTypeSimpleName;
    }
}

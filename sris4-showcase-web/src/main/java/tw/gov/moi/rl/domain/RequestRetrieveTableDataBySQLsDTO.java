package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRequestRetrieveTableDataBySQLDTO", propOrder = { "transactionId", "siteId", "sql","params","userId" })
@XmlRootElement(name = "RlRequestRetrieveTableDataBySQL", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RequestRetrieveTableDataBySQLsDTO {

    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    @FieldName("SQL指令內容")
    @XmlElement(name = "Sql", required = true)
    private String sql = "";
    
    @FieldName("參數內容")
    @XmlElement(name = "Params", required = true)
    private String[] params;
    
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
    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}

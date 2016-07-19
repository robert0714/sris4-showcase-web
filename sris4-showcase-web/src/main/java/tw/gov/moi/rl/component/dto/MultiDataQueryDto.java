package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDataDto", propOrder = { "transactionId", "siteId", "sql", "classTypeCanonicalName",
        "lockClassTypeForSelectResult", "params", "userId", "actionIp" })
@XmlRootElement(name = "MultiDataDto")
public class MultiDataQueryDto implements Serializable {

    /**  */
    private static final long serialVersionUID = -4961809285501483574L;

    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    @FieldName("SQL指令內容")
    @XmlElement(name = "Sql", required = true)
    private String sql = "";

    @FieldName("指定回傳集合物件中的型別名稱")
    @XmlElement(name = "ClassTypeCanonicalName", required = true)
    private String classTypeCanonicalName;

    @FieldName("是否鎖定回傳資料")
    @XmlElement(name = "LockClassTypeForSelectResult", required = true)
    private Boolean lockClassTypeForSelectResult = Boolean.FALSE;

    @FieldName("參數內容")
    @XmlElement(name = "Params", required = true)
    private String[] params;

    @FieldName("戶籍員代碼")
    @XmlElement(name = "userId", required = true)
    private String userId = "";

    @FieldName("發出Request的ip位址")
    @XmlElement(name = "ActionIp", required = true)
    private String actionIp;

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSql() {
        return this.sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getClassTypeCanonicalName() {
        return this.classTypeCanonicalName;
    }

    public void setClassTypeCanonicalName(String classTypeCanonicalName) {
        this.classTypeCanonicalName = classTypeCanonicalName;
    }

    public Boolean getLockClassTypeForSelectResult() {
        return this.lockClassTypeForSelectResult;
    }

    public void setLockClassTypeForSelectResult(Boolean lockClassTypeForSelectResult) {
        this.lockClassTypeForSelectResult = lockClassTypeForSelectResult;
    }

    public String[] getParams() {
        return this.params;
    }

    public void setParams(String[] params) {
        if (params != null) {
            final String[] dest = new String[params.length];
            System.arraycopy(params, 0, dest, 0, params.length);
            this.params = dest;
        } else {
            this.params = null;
        }
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActionIp() {
        return this.actionIp;
    }

    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }
}

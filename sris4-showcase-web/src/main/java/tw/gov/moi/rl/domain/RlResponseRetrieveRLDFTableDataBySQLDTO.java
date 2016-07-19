package tw.gov.moi.rl.domain;

import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.util.StringCompressUtil;
 
/**
 * The Class RlResponseRetrieveRLDFTableDataBySQLDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlResponseRetrieveRLDFTableDataBySQLDTO", propOrder = { "transactionId", "siteId", "sql",
        "classTypeCanonicalName", "lockClassTypeForSelectResult", "checkLockTypeResult", "params", "userId", "serializedData" })
@XmlRootElement(name = "RlResponseRetrieveRLDFTableDataBySQL", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlResponseRetrieveRLDFTableDataBySQLDTO implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6995809762628836031L;

    /** The transaction id. */
    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    /** The site id. */
    @FieldName("作業點代碼")
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    /** The sql. */
    @FieldName("SQL指令內容")
    @XmlElement(name = "Sql", required = true)
    private String sql = "";

    /** The class type canonical name. */
    @FieldName("指定回傳集合物件中的型別名稱")
    @XmlElement(name = "ClassTypeCanonicalName", required = true)
    private String classTypeCanonicalName;

    /** The lock class type for select result. */
    @FieldName("是否鎖定回傳資料")
    @XmlElement(name = "LockClassTypeForSelectResult", required = true)
    private Boolean lockClassTypeForSelectResult;

    /** The check lock type result. */
    @FieldName("檢查鎖定的型態，判別是否有相同鎖定資料")
    @XmlElement(name = "CheckLockTypeResult", required = true)
    private Integer checkLockTypeResult;

    /** The params. */
    @FieldName("參數內容")
    @XmlElement(name = "Params", required = true)
    private String[] params;

    /** The user id. */
    @FieldName("戶籍員代碼")
    @XmlElement(name = "userId", required = true)
    private String userId = "";

    /** The serialized data. */
    @FieldName("序列化內容")
    @XmlElement(name = "SerializedData", required = true)
    private String serializedData;

    /**
     * Gets the serialized data.
     *
     * @return the serialized data
     */
    public String getSerializedData() {
        return this.serializedData;
    }

    /**
     * Sets the serialized data.
     *
     * @param serializedData the new serialized data
     */
    public void setSerializedData(String serializedData) {
        this.serializedData = serializedData;
    }

    /**
     * Sets the rldf object.
     *
     * @param obj the new rldf object
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void setRldfObject(Object obj) throws IOException {
        this.serializedData = StringCompressUtil.serializeAsBase64(obj);
    }

    /**
     * Gets the rldf object.
     *
     * @return the rldf object
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException the class not found exception
     */
    public Object getRldfObject() throws IOException, ClassNotFoundException {
        return StringCompressUtil.deserializeFromBase64(this.serializedData);
    }

    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Sets the transaction id.
     *
     * @param transactionId the new transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the site id.
     *
     * @return the site id
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * Sets the site id.
     *
     * @param siteId the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the sql.
     *
     * @return the sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * Sets the sql.
     *
     * @param sql the new sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * Gets the params.
     *
     * @return the params
     */
    public String[] getParams() {
        return this.params;
    }

    /**
     * Sets the params.
     *
     * @param params the new params
     */
    public void setParams(String[] params) {
        if (params != null) {
            final String[] dest = new String[params.length];
            System.arraycopy(params, 0, dest, 0, params.length);
            this.params = dest;
        } else {
            this.params = null;
        }
    }

}

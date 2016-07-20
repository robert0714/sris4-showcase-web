package tw.gov.moi.rl.domain;

import java.io.IOException;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;

import tw.gov.moi.rl.common.constant.RlConstant;

import tw.gov.moi.rl.component.mutltiDataPocess.AppendGetMultiDatalogic;
import tw.gov.moi.rl.component.mutltiDataPocess.TypeConditionFilter;

import tw.gov.moi.util.StringCompressUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class RlGetSingleDataRequestDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetSingleDataRequestDto", propOrder = { "transactionId", "siteId", "sql", "classTypeCanonicalName",
        "lockClassTypeForSelectResult", "params", "userId", "actionIp", "typeConditionFilter",
        "appendGetMultiDatalogicClassTypeCanonicalName", "serializedData", "actionSiteId" })
@XmlRootElement(name = "RlGetSingleDataRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetSingleDataRequestDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7056475897502797160L;
    
    /** LOG. */
    private static final Logger LOGGER = LoggerFactory.getLogger(RlGetSingleDataRequestDto.class);


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
    private Boolean lockClassTypeForSelectResult = Boolean.FALSE;

    /** The params. */
    @FieldName("參數內容")
    @XmlElement(name = "Params", required = true)
    private String[] params;

    /** The user id. */
    @FieldName("戶籍員代碼")
    @XmlElement(name = "userId", required = true)
    private String userId = "";

    /** The action ip. */
    @FieldName("發出Request的ip位址")
    @XmlElement(name = "ActionIp", required = true)
    private String actionIp;

    /** The type condition filter. */
    @FieldName("指定回傳集合物件中型別的篩選邏輯")
    @XmlElement(name = "TypeConditionFilter", required = true)
    private TypeConditionFilter typeConditionFilter;

    /** The append get multi datalogic class type canonical name. */
    @FieldName("額外要抓資料的邏輯型別名稱")
    @XmlElement(name = "AppendGetMultiDatalogicClassTypeCanonicalName", required = true)
    private String appendGetMultiDatalogicClassTypeCanonicalName;

    /** The serialized data. */
    @FieldName("序列化內容")
    @XmlElement(name = "SerializedData", required = true)
    private String serializedData;

    
    /** The action site id. */
    @FieldName("發動端的作業點")
    @XmlElement(name = "ActionSiteId", required = true)
    private String actionSiteId;
    
    
    /**
     * Gets the action site id.
     *
     * @return the action site id
     */
    public String getActionSiteId() {
        return this.actionSiteId;
    }

    /**
     * Sets the action site id.
     *
     * @param actionSiteId the new action site id
     */
    public void setActionSiteId(String actionSiteId) {
        this.actionSiteId = actionSiteId;
    }

    /**
     * 指定查詢結果，目的是要讓額外邏輯可以依此查詢結果查詢.
     *
     * @param obj the new rldf object list
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void setRldfObjectList(Object obj) throws IOException {
        if (obj != null) {
            this.serializedData = StringCompressUtil.serializeAsBase64(obj);
        }
    }

    /**
     * Gets the rldf object list.
     *
     * @return the rldf object list
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException the class not found exception
     */
    public Object getRldfObjectList() throws IOException, ClassNotFoundException {
        Object result = null;
        if (StringUtils.isNotBlank(this.serializedData)) {
            result = StringCompressUtil.deserializeFromBase64(this.serializedData);
        }
        return result;
    }

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
     * Gets the append get multi datalogic class type.
     *
     * @return the append get multi datalogic class type
     */
    public Class<AppendGetMultiDatalogic> getAppendGetMultiDatalogicClassType() {
        Class<AppendGetMultiDatalogic> clazz = null;
        if (StringUtils.isNotBlank(this.appendGetMultiDatalogicClassTypeCanonicalName)) {         
            try {
                clazz = (Class<AppendGetMultiDatalogic>) Class.forName(this.appendGetMultiDatalogicClassTypeCanonicalName);
            } catch (ClassNotFoundException e) {
                
                LOGGER.error(e.getMessage(), e);
            }
            
        }
        return clazz;
    }

    /**
     * Sets the append get multi datalogic class type.
     *
     * @param clazz the new append get multi datalogic class type
     */
    public void setAppendGetMultiDatalogicClassType(final Class<? extends AppendGetMultiDatalogic> clazz) {
        if (clazz != null) {
            this.appendGetMultiDatalogicClassTypeCanonicalName = clazz.getCanonicalName();
        }
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
        this.params = params != null ? params.clone() : null;
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
     * Gets the class type canonical name.
     *
     * @return the class type canonical name
     */
    public String getClassTypeCanonicalName() {
        return this.classTypeCanonicalName;
    }

    /**
     * Sets the class type canonical name.
     *
     * @param classTypeCanonicalName the new class type canonical name
     */
    public void setClassTypeCanonicalName(String classTypeCanonicalName) {
        this.classTypeCanonicalName = classTypeCanonicalName;
    }

    /**
     * Gets the lock class type for select result.
     *
     * @return the lock class type for select result
     */
    public Boolean getLockClassTypeForSelectResult() {
        return this.lockClassTypeForSelectResult;
    }

    /**
     * Sets the lock class type for select result.
     *
     * @param lockClassTypeForSelectResult the new lock class type for select result
     */
    public void setLockClassTypeForSelectResult(Boolean lockClassTypeForSelectResult) {
        this.lockClassTypeForSelectResult = lockClassTypeForSelectResult;
    }

    /**
     * Gets the action ip.
     *
     * @return the action ip
     */
    public String getActionIp() {
        return this.actionIp;
    }

    /**
     * Sets the action ip.
     *
     * @param actionIp the new action ip
     */
    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

    /**
     * Gets the type condition filter.
     *
     * @return the type condition filter
     */
    public TypeConditionFilter getTypeConditionFilter() {
        return this.typeConditionFilter;
    }

    /**
     * Sets the type condition filter.
     *
     * @param typeConditionFilter the new type condition filter
     */
    public void setTypeConditionFilter(TypeConditionFilter typeConditionFilter) {
        this.typeConditionFilter = typeConditionFilter;
    }

}

package tw.gov.moi.rl.domain;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.ae.checker.annotation.FieldName;

import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.util.StringCompressUtil;

/**
 * The Class RlGetSingleDataResponseDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetSingleDataResponseDto", propOrder = { "siteId", "sql", "classTypeCanonicalName",
        "lockClassTypeForSelectResult", "checkLockTypeResult", "params", "serializedData", "errorStacks", "contentIds",
        "appendGetDatCheckLockType", "appendDataContentId", "serializedAppendGetMultiDatalogic" })
@XmlRootElement(name = "RlGetSingleDataResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetSingleDataResponseDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3625990587692460708L;

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
    private Integer[] checkLockTypeResult;

    /** The params. */
    @FieldName("參數內容")
    @XmlElement(name = "Params", required = true)
    private String[] params;

    /** The serialized data. */
    @FieldName("序列化內容")
    @XmlElement(name = "SerializedData", required = true)
    private String serializedData;

    /** The error stacks. */
    @FieldName("錯誤紀錄")
    @XmlElement(name = "ErrorStacks", required = true)
    private String errorStacks;

    /** The content ids. */
    @FieldName("鎖定key值內容")
    @XmlElement(name = "ContentIds", required = true)
    private String[] contentIds;

    /** The append get dat check lock type. */
    @FieldName("額外要抓資料的鎖定型態，判別是否有相同鎖定資料")
    @XmlElement(name = "AppendGetDatCheckLockType", required = true)
    private Integer[][] appendGetDatCheckLockType;

    /** The append data content id. */
    @FieldName("額外要抓資料的鎖定key值內容")
    @XmlElement(name = "AppendDataContentId", required = true)
    private String[][] appendDataContentId;

    /** The serialized append get multi datalogic. */
    @FieldName("額外邏輯的序列化內容")
    @XmlElement(name = "SerializedAppendGetMultiDatalogic", required = true)
    private String serializedAppendGetMultiDatalogic;

    /** The LOG. */
    private static final transient Logger LOGGER = LoggerFactory.getLogger(RlGetSingleDataResponseDto.class);

    /**
     * Gets the serialized append get multi datalogic.
     *
     * @return the serialized append get multi datalogic
     */
    public List<Object> getSerializedAppendGetMultiDatalogic() {
        List<Object> result = null;
        try {
            if (StringUtils.isNotBlank(this.serializedAppendGetMultiDatalogic)) {
                result = (List<Object>) StringCompressUtil.deserializeFromBase64(this.serializedAppendGetMultiDatalogic);
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        } catch (ClassNotFoundException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return result;
    }

    /**
     * Sets the serialized append get multi datalogic.
     *
     * @param serializedAppendGetMultiDatalogicList the new serialized append get multi datalogic
     */
    public void setSerializedAppendGetMultiDatalogic(final List<Object> serializedAppendGetMultiDatalogicList) {
        try {
            if (CollectionUtils.isNotEmpty(serializedAppendGetMultiDatalogicList)) {
                this.serializedAppendGetMultiDatalogic = StringCompressUtil
                        .serializeAsBase64(serializedAppendGetMultiDatalogicList);
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
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
     * Gets the check lock type result.
     *
     * @return the check lock type result
     */
    public Integer[] getCheckLockTypeResult() {
        return this.checkLockTypeResult;
    }

    /**
     * Sets the check lock type result.
     *
     * @param checkLockTypeResult the new check lock type result
     */
    public void setCheckLockTypeResult(Integer[] checkLockTypeResult) {
        if (checkLockTypeResult != null) {
            final Integer[] dest = new Integer[checkLockTypeResult.length];
            System.arraycopy(checkLockTypeResult, 0, dest, 0, checkLockTypeResult.length);
            this.checkLockTypeResult = dest;
        } else {
            this.checkLockTypeResult = null;
        }
    }

    /**
     * Gets the error stacks.
     *
     * @return the error stacks
     */
    public String getErrorStacks() {
        return this.errorStacks;
    }

    /**
     * Sets the error stacks.
     *
     * @param errorStacks the new error stacks
     */
    public void setErrorStacks(String errorStacks) {
        this.errorStacks = errorStacks;
    }

    /**
     * Gets the content ids.
     *
     * @return the content ids
     */
    public String[] getContentIds() {
        return this.contentIds;
    }

    /**
     * Sets the content ids.
     *
     * @param contentIds the new content ids
     */
    public void setContentIds(String[] contentIds) {
        if (contentIds != null) {
            final String[] dest = new String[contentIds.length];
            System.arraycopy(contentIds, 0, dest, 0, contentIds.length);
            this.contentIds = dest;
        } else {
            this.contentIds = null;
        }
    }

    /**
     * Gets the append get dat check lock type.
     *
     * @return the append get dat check lock type
     */
    public Integer[][] getAppendGetDatCheckLockType() {
        return this.appendGetDatCheckLockType;
    }

    /**
     * Sets the append get dat check lock type.
     *
     * @param appendGetDatCheckLockType the new append get dat check lock type
     */
    public void setAppendGetDatCheckLockType(Integer[][] appendGetDatCheckLockType) {
        if (appendGetDatCheckLockType != null) {
            this.appendGetDatCheckLockType = new Integer[appendGetDatCheckLockType.length][];
            for (int i = 0; i < appendGetDatCheckLockType.length; i++) {
                if (appendGetDatCheckLockType[i] != null) {
                    final Integer[] src = appendGetDatCheckLockType[i];
                    final Integer[] dest = new Integer[appendGetDatCheckLockType[i].length];
                    System.arraycopy(src, 0, dest, 0, appendGetDatCheckLockType[i].length);
                    this.appendGetDatCheckLockType[i] = dest;
                } else {
                    this.appendGetDatCheckLockType[i] = null;
                }
            }
        } else {
            this.appendGetDatCheckLockType = null;
        }
    }

    /**
     * Gets the append data content id.
     *
     * @return the append data content id
     */
    public String[][] getAppendDataContentId() {
        return this.appendDataContentId;
    }

    /**
     * Sets the append data content id.
     *
     * @param appendDataContentId the new append data content id
     */
    public void setAppendDataContentId(String[][] appendDataContentId) {
        if (appendDataContentId != null) {
            this.appendDataContentId = new String[appendDataContentId.length][];
            for (int i = 0; i < appendDataContentId.length; i++) {
                if (appendDataContentId[i] != null) {
                    this.appendDataContentId[i] = appendDataContentId[i].clone();
                } else {
                    this.appendDataContentId[i] = null;
                }
            }
        } else {
            this.appendDataContentId = null;
        }
    }
}

package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class MultiDataDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiDataDto", propOrder = { "queryResult", "appendGetDataContent", "targetRLDFHibernateClassType",
        "queryParameters", "queryResultContentIds", "checkLockTypeResult", "appendDataContentId", "appendGetDatCheckLockType" })
@XmlRootElement(name = "MultiDataDto")
public class MultiDataDto implements Serializable {

    /**  */
    private static final long serialVersionUID = 416793168051246343L;

    /** The query result. */
    @FieldName("查詢結果")
    @XmlElement(name = "queryResult", required = true)
    private List<Object> queryResult;

    /** The append get data content. */
    @FieldName("依據特殊邏輯一併查詢的結果")
    @XmlElement(name = "appendGetDataContent", required = true)
    private Object appendGetDataContent;

    /** The target rldf hibernate class type. */
    @FieldName("指定Table的HibernateType")
    @XmlElement(name = "targetRLDFHibernateClassType", required = true)
    private Class<?> targetRLDFHibernateClassType;

    /** The query parameters. */
    @FieldName("查詢條件")
    @XmlElement(name = "queryParameters", required = true)
    private String[] queryParameters;

    /** The query result content ids. */
    @FieldName("查詢回來的primary key 資料")
    @XmlElement(name = "queryResultContentIds", required = true)
    private String[] queryResultContentIds;

    /** The check lock type result. */
    @FieldName("查詢回來的鎖定狀態 資料")
    @XmlElement(name = "checkLockTypeResult", required = true)
    private Integer[] checkLockTypeResult;

    /** The append data content id. */
    @FieldName("查詢回來的額外邏輯primary key 資料")
    @XmlElement(name = "appendDataContentId", required = true)
    private String[][] appendDataContentId;

    /** The append get dat check lock type. */
    @FieldName("查詢回來的額外邏輯鎖定狀態 資料")
    @XmlElement(name = "appendGetDatCheckLockType", required = true)
    private Integer[][] appendGetDatCheckLockType;

    /**
     * Gets the append get data content.
     *
     * @return the append get data content
     */
    public Object getAppendGetDataContent() {
        return this.appendGetDataContent;
    }

    /**
     * Sets the append get data content.
     *
     * @param appendGetDataContent the new append get data content
     */
    public void setAppendGetDataContent(Object appendGetDataContent) {
        this.appendGetDataContent = appendGetDataContent;
    }

    /**
     * Gets the query result.
     *
     * @return the query result
     */
    public List<Object> getQueryResult() {
        return this.queryResult;
    }

    /**
     * Sets the query result.
     *
     * @param queryResult the new query result
     */
    public void setQueryResult(List<Object> queryResult) {
        this.queryResult = queryResult;
    }

    /**
     * Gets the target rldf hibernate class type.
     *
     * @return the target rldf hibernate class type
     */
    public Class<?> getTargetRLDFHibernateClassType() {
        return this.targetRLDFHibernateClassType;
    }

    /**
     * Sets the target rldf hibernate class type.
     *
     * @param targetRLDFHibernateClassType the new target rldf hibernate class type
     */
    public void setTargetRLDFHibernateClassType(Class<?> targetRLDFHibernateClassType) {
        this.targetRLDFHibernateClassType = targetRLDFHibernateClassType;
    }

    /**
     * Gets the query parameters.
     *
     * @return the query parameters
     */
    public String[] getQueryParameters() {
        return this.queryParameters;
    }

    /**
     * Sets the query parameters.
     *
     * @param queryParameters the new query parameters
     */
    public void setQueryParameters(String[] queryParameters) {
        this.queryParameters = queryParameters != null ? queryParameters.clone() : null;
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
        this.checkLockTypeResult = checkLockTypeResult != null ? checkLockTypeResult.clone() : null;
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
                    this.appendGetDatCheckLockType[i] = appendGetDatCheckLockType[i].clone();
                } else {
                    this.appendGetDatCheckLockType[i] = null;
                }
            }
        } else {
            this.appendGetDatCheckLockType = null;
        }
    }

    /**
     * Gets the query result content ids.
     *
     * @return the query result content ids
     */
    public String[] getQueryResultContentIds() {
        return this.queryResultContentIds;
    }

    /**
     * Sets the query result content ids.
     *
     * @param queryResultContentIds the new query result content ids
     */
    public void setQueryResultContentIds(String[] queryResultContentIds) {
        if (queryResultContentIds != null) {
            this.queryResultContentIds = queryResultContentIds.clone();
        } else {
            this.queryResultContentIds = null;
        }
    }
}

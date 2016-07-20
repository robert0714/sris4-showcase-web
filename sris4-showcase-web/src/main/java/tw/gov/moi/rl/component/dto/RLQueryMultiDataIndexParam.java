package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.mutltiDataPocess.AppendGetMultiDatalogic;

/**
 * The Class RLQueryMultiDataIndexParam.
 */
public class RLQueryMultiDataIndexParam implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1111651668330926124L;
    
    /** The target hibernate class type. */
    @FieldName("查詢class")
    private Class<?> targetHibernateClassType;
    
    /** The query column names. */
    @FieldName("查詢欄位名稱")
    private String[] queryColumnNames;
    
    /** The query parameters. */
    @FieldName("查詢參數")
    private String[] queryParameters;
    
    /** The dest site id. */
    @FieldName("作業點")
    private String destSiteId;
    
    /** The index. */
    @FieldName("索引")
    private Integer index;
    
    /** The specific1st query result. */
    @FieldName("指定第一次查詢結果")
    private List<Object> specific1stQueryResult;
    
    /** The append logic. */
    @FieldName("額外的處理邏輯")
    private Class<? extends AppendGetMultiDatalogic> appendLogic;

    /**
     * Gets the target hibernate class type.
     *
     * @return the target hibernate class type
     */
    public Class<?> getTargetHibernateClassType() {
        return this.targetHibernateClassType;
    }

    /**
     * Sets the target hibernate class type.
     *
     * @param targetHibernateClassType the new target hibernate class type
     */
    public void setTargetHibernateClassType(Class<?> targetHibernateClassType) {
        this.targetHibernateClassType = targetHibernateClassType;
    }

    /**
     * Gets the query column names.
     *
     * @return the query column names
     */
    public String[] getQueryColumnNames() {
        return this.queryColumnNames;
    }

    /**
     * Sets the query column names.
     *
     * @param queryColumnNames the new query column names
     */
    public void setQueryColumnNames(String[] queryColumnNames) {
        if (queryColumnNames != null) {
            this.queryColumnNames = queryColumnNames.clone();
        } else {
            this.queryColumnNames = null;
        }
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
        this.queryParameters = queryParameters;
    }

    /**
     * Gets the dest site id.
     *
     * @return the dest site id
     */
    public String getDestSiteId() {
        return this.destSiteId;
    }

    /**
     * Sets the dest site id.
     *
     * @param destSiteIds the new dest site id
     */
    public void setDestSiteId(String destSiteIds) {
        this.destSiteId = destSiteIds;
    }

    /**
     * Gets the index.
     *
     * @return the index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * Sets the index.
     *
     * @param insex the new index
     */
    public void setIndex(Integer insex) {
        this.index = insex;
    }

    /**
     * Gets the specific1st query result.
     *
     * @return the specific1st query result
     */
    public List<Object> getSpecific1stQueryResult() {
        return this.specific1stQueryResult;
    }

    /**
     * Sets the specific1st query result.
     *
     * @param specific1stQueryResult the new specific1st query result
     */
    public void setSpecific1stQueryResult(List<Object> specific1stQueryResult) {
        this.specific1stQueryResult = specific1stQueryResult;
    }

    /**
     * Gets the append logic.
     *
     * @return the append logic
     */
    public Class<? extends AppendGetMultiDatalogic> getAppendLogic() {
        return this.appendLogic;
    }

    /**
     * Sets the append logics.
     *
     * @param appendLogic the new append logics
     */
    public void setAppendLogics(Class<? extends AppendGetMultiDatalogic> appendLogic) {
        this.appendLogic = appendLogic;
    }

}

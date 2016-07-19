package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.mutltiDataPocess.AppendGetMultiDatalogic;
import tw.gov.moi.rl.domain.RlLockSingleDataRequestDto;
 
/**
 * The Class RlGetMultiDataQueryParams.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlGetMultiDataQueryParams", propOrder = { "lock", "appendLogics", "specificFirstQueryResultExistInRecordMap",
        "additionalLocks", "tokenLockPool" })
@XmlRootElement(name = "RlGetMultiDataQueryParams")
public class RlGetMultiDataQueryParams implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7005614513245935987L;

    /** The lock. */
    @FieldName("Lock")
    @XmlElement(name = "lock", required = true)
    private boolean lock;

    /** The append logics. */
    @FieldName("額外的處理邏輯")
    @XmlElement(name = "AppendLogics", required = true)
    private Class<? extends AppendGetMultiDatalogic>[] appendLogics;

    /** The specific first query result exist in record map. */
    @FieldName("SpecificFirstQueryResultExistInRecordMap")
    @XmlElement(name = "lock", required = true)
    private Map<Integer, Object> specificFirstQueryResultExistInRecordMap;

    /** The additional locks. */
    @FieldName("額外的lock")
    @XmlElement(name = "AdditionalLocks", required = true)
    private RlLockSingleDataRequestDto[] additionalLocks;

    /** The token lock pool. */
    @FieldName("tokenLockPool")
    @XmlElement(name = "TokenLockPool", required = true)
    private String[] tokenLockPool;

    /**
     * Gets the additional locks.
     *
     * @return the additional locks
     */
    public RlLockSingleDataRequestDto[] getAdditionalLocks() {
        return this.additionalLocks;
    }

    /**
     * Sets the additional locks.
     *
     * @param additionalLocks the new additional locks
     */
    public void setAdditionalLocks(final RlLockSingleDataRequestDto[] additionalLocks) {
        if(additionalLocks!=null){
            this.additionalLocks = additionalLocks.clone();
        }else{
            this.additionalLocks = null;
        }
    }

    /**
     * Checks if is lock.
     *
     * @return true, if is lock
     */
    public boolean isLock() {
        return this.lock;
    }

    /**
     * Sets the lock.
     *
     * @param lock the new lock
     */
    public void setLock(boolean lock) {
        this.lock = lock;
    }

    /**
     * Gets the append logics.
     *
     * @return the append logics
     */
    public Class<? extends AppendGetMultiDatalogic>[] getAppendLogics() {
        return this.appendLogics;
    }

    /**
     * Sets the append logics.
     *
     * @param appendLogics the new append logics
     */
    public void setAppendLogics(Class<? extends AppendGetMultiDatalogic>[] appendLogics) {
        if(appendLogics!=null){
            this.appendLogics = appendLogics.clone();
        }else{
            this.appendLogics = null;
        }
    }

    /**
     * Gets the token lock pool.
     *
     * @return the token lock pool
     */
    public String[] getTokenLockPool() {
        return this.tokenLockPool;
    }

    /**
     * Sets the token lock pool.
     *
     * @param tokenLockPool the new token lock pool
     */
    public void setTokenLockPool(String[] tokenLockPool) {
        if (tokenLockPool != null) {
            this.tokenLockPool = tokenLockPool.clone();
        } else {
            this.tokenLockPool = null;
        }
    }

    /**
     * Gets the specific first query result exist in record map.
     *
     * @return the specific first query result exist in record map
     */
    public Map<Integer, Object> getSpecificFirstQueryResultExistInRecordMap() {
        return this. specificFirstQueryResultExistInRecordMap;
    }

    /**
     * Sets the specific first query result exist in record map.
     *
     * @param specificFirstQueryResultExistInRecordMap the specific first query result exist in record map
     */
    public void setSpecificFirstQueryResultExistInRecordMap(Map<Integer, Object> specificFirstQueryResultExistInRecordMap) {
        this.specificFirstQueryResultExistInRecordMap = specificFirstQueryResultExistInRecordMap;
    }

}

package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.dto.PairEntry;

/**
 * The Class UnlockDetailInfoDTO.
 */
public class UnlockDetailInfoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3651807905390452434L;

    /** The operation code. */
    @FieldName("作業代碼")
    private String operationCode;
    
    /** The operation name. */
    @FieldName("作業名稱")
    private String operationName;

    /** The lock table name content. */
    @FieldName("鎖定table的摘要資訊")
    private PairEntry[] lockTableNameContent;

    /**
     * Gets the operation code.
     *
     * @return the operation code
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * Sets the operation code.
     *
     * @param operationCode the new operation code
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the operation name.
     *
     * @return the operation name
     */
    public String getOperationName() {
        return  this.operationName;
    }

    /**
     * Sets the operation name.
     *
     * @param operationName the new operation name
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * Gets the lock table name content.
     *
     * @return the lock table name content
     */
    public PairEntry[] getLockTableNameContent() {
        return  this.lockTableNameContent;
    }

    /**
     * Sets the lock table name content.
     *
     * @param lockTableNameContent the new lock table name content
     */
    public void setLockTableNameContent(PairEntry[] lockTableNameContent) {
        if (lockTableNameContent != null) {
            this.lockTableNameContent = lockTableNameContent.clone();
        } else {
            this.lockTableNameContent = null;
        }
    }

}

/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class TempFileDTO.
 * 
 * @author Jay Kan
 * 
 * @param <T>
 *            the generic type
 */
public class TempFileDTO<T> implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4255884924561690700L;

    /** The session id. */
    @FieldName("The session id")
    private String sessionId;

    /** The transaction id. */
    @FieldName("The transaction id")
    private String transactionId;

    /** The operation sequence id. */
    @FieldName("The operation sequence id")
    private String operationSequenceId;

    /** The l3 dto. */
    @FieldName("The l3 dto")
    private T l3DTO;

    /**
     * Instantiates a new temp file dto.
     * 
     * @param sessionId
     *            the session id
     * @param transactionId
     *            the transaction id
     * @param operationSequenceId
     *            the operation sequence id
     */
    public TempFileDTO(final String sessionId, final String transactionId, final String operationSequenceId) {
        super();
        this.sessionId = sessionId;
        this.transactionId = transactionId;
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Instantiates a new temp file dto.
     * 
     * @param sessionId
     *            the session id
     * @param transactionId
     *            the transaction id
     * @param operationSequenceId
     *            the operation sequence id
     * @param l3dto
     *            the l3dto
     */
    public TempFileDTO(final String sessionId, final String transactionId, final String operationSequenceId,
            final T l3dto) {
        super();
        this.sessionId = sessionId;
        this.transactionId = transactionId;
        this.operationSequenceId = operationSequenceId;
        l3DTO = l3dto;
    }

    /**
     * Gets the session id.
     * 
     * @return the session id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the session id.
     * 
     * @param sessionId
     *            the new session id
     */
    public void setSessionId(final String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public String getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(final String operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the l3 dto.
     * 
     * @return the l3 dto
     */
    public T getL3DTO() {
        return l3DTO;
    }

    /**
     * Sets the l3 dto.
     * 
     * @param l3dto
     *            the new l3 dto
     */
    public void setL3DTO(final T l3dto) {
        l3DTO = l3dto;
    }
}

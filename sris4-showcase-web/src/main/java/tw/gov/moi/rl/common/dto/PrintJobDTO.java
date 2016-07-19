/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 戶籍登記業務列印資訊物件.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "printJobDTO", propOrder = { "genericStatePrint", "phase", "phaseState", "operationSequence" })
@XmlRootElement(name = "PrintJobDTO")
public class PrintJobDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4088020865770613584L;

    /** 檔案PDF路徑. */
    private String genericStatePrint;

    /**
     * 所指定的單一作業階段.<BR>
     * Default: 1
     */
    private Integer phase = Integer.valueOf(1);

    /**
     * 所指定的多作業階段.<BR>
     * Default: null
     */
    private Integer[] phaseState;

    /**
     * 作業序號.<BR>
     * Default: 0
     */
    private Integer operationSequence = Integer.valueOf(0);

    /**
     * Gets the generic state print.
     * 
     * @return the generic state print
     */
    public String getGenericStatePrint() {
        return genericStatePrint;
    }

    /**
     * Sets the generic state print.
     * 
     * @param genericStatePrint
     *            the new generic state print
     */
    public void setGenericStatePrint(final String genericStatePrint) {
        this.genericStatePrint = genericStatePrint;
    }

    /**
     * Gets the phase.
     * 
     * @return the phase
     */
    public Integer getPhase() {
        return phase;
    }

    /**
     * Sets the phase. phaseState
     * 
     * @param phase
     *            the new phase
     */
    public void setPhase(final Integer phase) {
        this.phase = phase;
    }

    /**
     * Gets the operation sequence.
     * 
     * @return the operation sequence
     */
    public Integer getOperationSequence() {
        return operationSequence;
    }

    /**
     * Sets the operation sequence.
     * 
     * @param operationSequence
     *            the new operation sequence
     */
    public void setOperationSequence(final Integer operationSequence) {
        this.operationSequence = operationSequence;
    }

    /**
     * Gets the phase state.
     * 
     * @return the phase state
     */
    public Integer[] getPhaseState() {
        return phaseState;
    }

    /**
     * Sets the phase state.
     * 
     * @param phaseState
     *            the new phase state
     */
    public void setPhaseState(final Integer[] phaseState) {
        this.phaseState = phaseState;
    }
}

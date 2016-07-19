package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a300PhaseDTO", propOrder = { "applySequenceId", "operationPhase" })
@XmlRootElement(name = "Rl0a300PhaseDTO")
public class Rl0a300PhaseDTO implements Serializable {

    private static final long serialVersionUID = 8213491947853567138L;

    /** 作業順序編號 */
    @FieldName("作業順序編號")
    @XmlElement(name = "ApplySequenceId")
    private int applySequenceId;

    /** 層次 */
    @FieldName("層次")
    @XmlElement(name = "OperationPhase")
    private int operationPhase;

    /**
     * @return the applySequenceId
     */
    public int getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * @param applySequenceId
     *            the applySequenceId to set
     */
    public void setApplySequenceId(int applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * @return the operationPhase
     */
    public int getOperationPhase() {
        return operationPhase;
    }

    /**
     * @param operationPhase
     *            the operationPhase to set
     */
    public void setOperationPhase(int operationPhase) {
        this.operationPhase = operationPhase;
    }

}

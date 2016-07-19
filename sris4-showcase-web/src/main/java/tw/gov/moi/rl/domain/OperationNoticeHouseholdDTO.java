package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationNoticeHouseholdDTO", propOrder = { "SequenceId", "OperationCode","ExtMessage" ,"BehaviorCode"})
public class OperationNoticeHouseholdDTO {
    
    /** 作業順序 */
    @XmlElement(name = "SequenceId", required = true)
    @FieldName("作業順序")
    private Integer sequenceId;
    
    /** 作業代碼 */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;
    
    /** 延伸訊息 */
    @XmlElement(name = "ExtMessage", required = true)
    @FieldName("延伸訊息")
    private String extMessage;
    
    /** 行為代碼 */
    @XmlElement(name = "BehaviorCode", required = true)
    @FieldName("行為代碼")
    private String behaviorCode;

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getExtMessage() {
        return extMessage;
    }

    public void setExtMessage(String extMessage) {
        this.extMessage = extMessage;
    }

    public String getBehaviorCode() {
        return behaviorCode;
    }

    public void setBehaviorCode(String behaviorCode) {
        this.behaviorCode = behaviorCode;
    }
    
}

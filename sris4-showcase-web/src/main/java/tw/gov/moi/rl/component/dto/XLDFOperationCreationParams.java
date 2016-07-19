package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFOperationCreationParams", propOrder = {
        "operationSequenceId",
        "operationCode"
})
@XmlRootElement(name = "XLDFOperationCreationParams")
public class XLDFOperationCreationParams {
    
    @XmlElement(name = "operationSequenceId")
    private Integer operationSequenceId;

    @XmlElement(name = "operationCode")
    private String operationCode;
    
    public XLDFOperationCreationParams(Integer operationSequenceId, String operationCode) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
    }

    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }
    
    

}

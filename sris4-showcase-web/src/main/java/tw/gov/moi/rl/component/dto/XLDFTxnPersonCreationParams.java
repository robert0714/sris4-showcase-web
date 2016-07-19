package tw.gov.moi.rl.component.dto;

public class XLDFTxnPersonCreationParams {

    private Integer operationSequenceId;

    private String operationCode;

    private XLDFCreationValidator validator;
    
    public XLDFTxnPersonCreationParams(){
        
    }

    public XLDFTxnPersonCreationParams(Integer operationSequenceId, String operationCode,
            XLDFCreationValidator validator) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.validator = validator;
    }

    public XLDFTxnPersonCreationParams(Integer operationSequenceId, String operationCode) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
    }

    public XLDFCreationValidator getValidator() {
        return validator;
    }

    public void setValidator(XLDFCreationValidator validator) {
        this.validator = validator;
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

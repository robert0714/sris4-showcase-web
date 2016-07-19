package tw.gov.moi.rl.component.dto;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class XLDFTransactionOperation {

    @FieldName("交易序號")
    private String transactionId;

    @FieldName("作業序號")
    private Integer operationSequenceId;

    @FieldName("作業代碼")
    private String operationCode;

    @FieldName("是否儲存")
    private boolean stored;

    public XLDFTransactionOperation() {

    }

    public XLDFTransactionOperation(String transactionId, Integer operationSequenceId, String operationCode,
            boolean stored) {
        super();
        this.transactionId = transactionId;
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.stored = stored;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
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

    public boolean isStored() {
        return stored;
    }

    public void setStored(boolean stored) {
        this.stored = stored;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((operationCode == null) ? 0 : operationCode.hashCode());
        result = prime * result + ((operationSequenceId == null) ? 0 : operationSequenceId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        XLDFTransactionOperation other = (XLDFTransactionOperation) obj;
        if (operationCode == null) {
            if (other.operationCode != null)
                return false;
        } else if (!operationCode.equals(other.operationCode))
            return false;
        if (operationSequenceId == null) {
            if (other.operationSequenceId != null)
                return false;
        } else if (!operationSequenceId.equals(other.operationSequenceId))
            return false;
        return true;
    }
}

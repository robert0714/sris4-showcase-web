package tw.gov.moi.rl.component.dto;

public class XLDFOperationAccess {

    private String transactionId;

    private String acceptAdminOfficeCode;

    private Integer operationSequenceId;

    private Class<?> xldfType;

    private String domainKey;

    private XLDFOperationAccess copyReference;

    private XLDFAction acion;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    public Class<?> getXldfType() {
        return xldfType;
    }

    public void setXldfType(Class<?> xldfType) {
        this.xldfType = xldfType;
    }

    public String getDomainKey() {
        return domainKey;
    }

    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
    }

    public XLDFOperationAccess getCopyReference() {
        return copyReference;
    }

    public void setCopyReference(XLDFOperationAccess copyReference) {
        this.copyReference = copyReference;
    }

    public XLDFAction getAcion() {
        return acion;
    }

    public void setAcion(XLDFAction acion) {
        this.acion = acion;
    }

}

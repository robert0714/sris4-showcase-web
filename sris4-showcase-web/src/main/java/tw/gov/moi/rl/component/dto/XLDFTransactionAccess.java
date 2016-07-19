package tw.gov.moi.rl.component.dto;

import java.util.List;

public class XLDFTransactionAccess {
    
    private Class<?> xldfType;
    
    private XLDFTransactionOperation operation;
    
    private List<?> domainObjects;

    public Class<?> getXldfType() {
        return xldfType;
    }

    public void setXldfType(Class<?> xldfType) {
        this.xldfType = xldfType;
    }

    public XLDFTransactionOperation getOperation() {
        return operation;
    }

    public void setOperation(XLDFTransactionOperation operation) {
        this.operation = operation;
    }

    public List<?> getDomainObjects() {
        return domainObjects;
    }

    public void setDomainObjects(List<?> domainObjects) {
        this.domainObjects = domainObjects;
    }

}

package tw.gov.moi.rl.component.dto;

public class XLDFTransactionPerson {

    private String transactionId;
    
    private String acceptAdminOfficeCode;
    
    private Integer personSerialNo;

    private String personId;

    private Class<?> xldfType;

    private Object domainObject;

    private String areaCode;

    private String removeYymmdd;

    private String removeTime;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

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

    public Integer getPersonSerialNo() {
        return personSerialNo;
    }

    public void setPersonSerialNo(Integer personSerialNo) {
        this.personSerialNo = personSerialNo;
    }

    public String getRemoveYymmdd() {
        return removeYymmdd;
    }

    public void setRemoveYymmdd(String removeYymmdd) {
        this.removeYymmdd = removeYymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Class<?> getXldfType() {
        return xldfType;
    }

    public void setXldfType(Class<?> xldfType) {
        this.xldfType = xldfType;
    }

    public Object getDomainObject() {
        return domainObject;
    }

    public void setDomainObject(Object domainObject) {
        this.domainObject = domainObject;
    }

}

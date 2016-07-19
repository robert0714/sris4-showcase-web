package tw.gov.moi.rl.component.dto;

public class XLDFTargetPersonKey {
    
    private Class<?> xldfType;
    
    private String personId;
    
    private Object domainObject;
    
    private String areaCode;
    
    private String removeDate;
    
    private String removeTime;

    public Class<?> getXldfType() {
        return xldfType;
    }

    public void setXldfType(Class<?> xldfType) {
        this.xldfType = xldfType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Object getDomainObject() {
        return domainObject;
    }

    public void setDomainObject(Object domainObject) {
        this.domainObject = domainObject;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(String removeDate) {
        this.removeDate = removeDate;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }
}

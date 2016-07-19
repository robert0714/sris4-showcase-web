package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFTransactionParams", propOrder = { "applyPersonData1", "applyPersonData2", "commPersonData",
        "personId", "siteId", "removeYyymmdd", "removeTime", "validator", "ifEnforce", "operationCode" ,"lock"})
@XmlRootElement(name = "XLDFTransactionParams")
public class XLDFTransactionParams {

    @XmlElement(name = "applyPersonData1")
    private PersonDataInputDTO applyPersonData1;

    @XmlElement(name = "applyPersonData2")
    private PersonDataInputDTO applyPersonData2;

    @XmlElement(name = "commPersonData")
    private PersonDataInputDTO commPersonData;

    @XmlElement(name = "personId")
    private String personId;

    @XmlElement(name = "siteId")
    private String siteId;

    @XmlElement(name = "removeYyymmdd")
    private String removeYyymmdd;

    @XmlElement(name = "removeTime")
    private String removeTime;

    @XmlElement(name = "validator")
    private XLDFCreationValidator validator;

    @XmlElement(name = "ifEnforce")
    private boolean ifEnforce;

    @XmlElement(name = "OperationCode")
    private String operationCode;

    
    /** The lock. */
    @XmlElement(name = "lock")
    private boolean lock;
    
    public XLDFTransactionParams() {

    }

    public XLDFTransactionParams(PersonDataInputDTO applyPersonData1, PersonDataInputDTO applyPersonData2,
            PersonDataInputDTO commPersonData, String personId, String siteId, String removeYYMMDD, String removeTime,
            XLDFCreationValidator validator) {
        super();
        this.applyPersonData1 = applyPersonData1;
        this.applyPersonData2 = applyPersonData2;
        this.commPersonData = commPersonData;
        this.personId = personId;
        this.siteId = siteId;
        this.removeYyymmdd = removeYYMMDD;
        this.removeTime = removeTime;
        this.validator = validator;
    }

    public XLDFTransactionParams(PersonDataInputDTO applyPersonData1, PersonDataInputDTO applyPersonData2,
            PersonDataInputDTO commPersonData, String personId, String siteId, String removeYYMMDD, String removeTime,
            String operationCode, XLDFCreationValidator validator) {
        super();
        this.applyPersonData1 = applyPersonData1;
        this.applyPersonData2 = applyPersonData2;
        this.commPersonData = commPersonData;
        this.personId = personId;
        this.siteId = siteId;
        this.removeYyymmdd = removeYYMMDD;
        this.removeTime = removeTime;
        this.validator = validator;
        this.operationCode = operationCode;
    }

    public PersonDataInputDTO getApplyPersonData1() {
        return applyPersonData1;
    }

    public void setApplyPersonData1(PersonDataInputDTO applyPersonData1) {
        this.applyPersonData1 = applyPersonData1;
    }

    public PersonDataInputDTO getApplyPersonData2() {
        return applyPersonData2;
    }

    public void setApplyPersonData2(PersonDataInputDTO applyPersonData2) {
        this.applyPersonData2 = applyPersonData2;
    }

    public PersonDataInputDTO getCommPersonData() {
        return commPersonData;
    }

    public void setCommPersonData(PersonDataInputDTO commPersonData) {
        this.commPersonData = commPersonData;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYYMMDD) {
        this.removeYyymmdd = removeYYMMDD;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /**
     * @return the validator
     */
    public XLDFCreationValidator getValidator() {
        return validator;
    }

    /**
     * @param validator
     *            the validator to set
     */
    public void setValidator(XLDFCreationValidator validator) {
        this.validator = validator;
    }

    /**
     * @return the ifEnforce
     */
    public boolean isIfEnforce() {
        return ifEnforce;
    }

    /**
     * @param ifEnforce
     *            the ifEnforce to set
     */
    public void setIfEnforce(boolean ifEnforce) {
        this.ifEnforce = ifEnforce;
    }

    /**
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * @param operationCode
     *            the operationCode to set
     */
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

}

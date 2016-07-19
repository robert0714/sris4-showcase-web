package tw.gov.moi.rl.domain.xldf;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public interface XLDFHouseholdNoteDomainObject {
    public String getHouseholdHeadId();

    public XLDFDomainObject getDomainObject();

    public void setHouseholdHeadId(String householdHeadId);

    public String getHouseholdId();

    public void setHouseholdId(String householdId);

    /** site id */
    public String getSiteId();

    public String getSequenceId();

    public void setApplySequenceId(Integer seqId);

    public String getApplySequenceId();

    public void setApplyTransactionId(String transactionId);

    public String getApplyTransactionId();

    public void setSiteId(String siteId);

    public String getRegisterYyymmdd();

    public void setRegisterYyymmdd(String registerYyymmdd);

    public String getRegisterHhmmss();

    public void setRegisterHhmmss(String registerHhmmss);

    public String getAreaCode();

    public void setAreaCode(String areaCode);

    public String getAdminOfficeCode();

    public void setAdminOfficeCode(String adminOfficeCode);

    public String getRegisterCode();

    public void setRegisterCode(String registerCode);

    public String getRegisterContent();

    public void setRegisterContent(String registerContent);

    public String getRegisterAdminOfficeCode();

    public void setRegisterAdminOfficeCode(String register_adminOfficeCode);

    public String getRegistrarName();

    public void setRegistrarName(String registrarName);

    public String getMainType();

    public void setMainType(String mainType);

    public String getSubType();

    public void setSubType(String subType);

    public tw.gov.moi.rl.domain.xldf.HouseholdRemovePage getRemovePage();

    public String getRemark();

}

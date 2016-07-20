package tw.gov.moi.rl.domain.xldf;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

public interface XLDFPersonNoteDomainObject {
    public String getPersonId();

    public XLDFDomainObject getDomainObject();

    public void setPersonId(String personId);

    /** site id */
    public String getSiteId();

    public String getSequenceId();

    public void setSequenceId(String sequenceId);

    public void setSiteId(String siteId);

    public String getRegisterYyymmdd();

    public void setRegisterYyymmdd(String registerYyymmdd);

    public String getRegisterHhmmss();

    public void setRegisterHhmmss(String registerHhmmss);

    public String getMainType();

    public void setMainType(String mainType);

    public String getSubType();

    public void setSubType(String subType);

    public String getRegisterCode();

    public void setRegisterCode(String registerCode);

    public String getRegisterContent();

    public void setRegisterContent(String registerContent);

    public String getRegisterAdminOfficeCode();

    public void setRegisterAdminOfficeCode(String registeAdminOfficeCode);

    public String getRegistrarName();

    public void setRegistrarName(String registrarName);

    public tw.gov.moi.rl.domain.xldf.HouseholdRemovePage getRemovePage();

    public String getRemark();

    public String getApplyTransactionId();

    public void setApplyTransactionId(String applyTransactionId);

    public Integer getApplySequenceId();

    public void setApplySequenceId(Integer applySequenceId);

    public void getVisible();

    public void setVisible(boolean visible);

}

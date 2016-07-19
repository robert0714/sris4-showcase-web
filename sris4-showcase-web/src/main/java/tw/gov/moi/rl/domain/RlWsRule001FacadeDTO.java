package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class RlWsRule001FacadeDTO implements RlWsRule ,Serializable{

    private static final long serialVersionUID = -8398795884031556380L;
    @FieldName("當事人的現戶個人資料")
    private XLDFPersonDataDomainObject main4M;//被查詢者的4M
    @FieldName("當事人的現戶全戶資料")
    private XLDFHouseholdDataDomainObject main1M;//被查詢者的1M
    @FieldName("當事人的現戶戶長個人資料")
    private XLDFPersonDataDomainObject householdHead4M;//被查詢者的戶長之4M
    
    public XLDFPersonDataDomainObject getMain4M() {
        return main4M;
    }
    public void setMain4M(XLDFPersonDataDomainObject main4m) {
        main4M = main4m;
    }
    public XLDFHouseholdDataDomainObject getMain1M() {
        return main1M;
    }
    public void setMain1M(XLDFHouseholdDataDomainObject main1m) {
        main1M = main1m;
    }
    public XLDFPersonDataDomainObject getHouseholdHead4M() {
        return householdHead4M;
    }
    public void setHouseholdHead4M(XLDFPersonDataDomainObject householdHead4M) {
        this.householdHead4M = householdHead4M;
    }
}

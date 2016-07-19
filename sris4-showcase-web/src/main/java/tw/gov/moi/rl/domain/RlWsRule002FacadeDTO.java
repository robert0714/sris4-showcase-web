package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class RlWsRule002FacadeDTO implements RlWsRule ,Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 8378422567468887767L;
    @FieldName("當事人的現戶個人資料")
    private XLDFPersonDataDomainObject main4M;//被查詢者的4M
    @FieldName("當事人的現戶全戶資料")
    private XLDFHouseholdDataDomainObject main1M;//被查詢者的1M
    
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
}

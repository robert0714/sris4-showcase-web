package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class RlWsRule006FacadeDTO implements RlWsRule ,Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -4456824715437055601L;

    @FieldName("當事人的除戶個人資料")
    private XLDFPersonDataDomainObject main4H;//被查詢者的4H
    
    @FieldName("當事人的除戶全戶資料")
    private XLDFHouseholdDataDomainObject main1H;//被查詢者的1H
    
    @FieldName("當事人的除戶戶長個人資料")
    private XLDFPersonDataDomainObject householdHead4H;//被查詢者的戶長之4H
    public XLDFPersonDataDomainObject getMain4H() {
        return main4H;
    }
    public void setMain4H(XLDFPersonDataDomainObject main4h) {
        main4H = main4h;
    }
    public XLDFHouseholdDataDomainObject getMain1H() {
        return main1H;
    }
    public void setMain1H(XLDFHouseholdDataDomainObject main1h) {
        main1H = main1h;
    }
    public XLDFPersonDataDomainObject getHouseholdHead4H() {
        return householdHead4H;
    }
    public void setHouseholdHead4H(XLDFPersonDataDomainObject householdHead4H) {
        this.householdHead4H = householdHead4H;
    }
    
   
}

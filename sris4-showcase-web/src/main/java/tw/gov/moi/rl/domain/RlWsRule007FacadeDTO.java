package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

public class RlWsRule007FacadeDTO implements RlWsRule ,Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4551529676292137486L;
    @FieldName("當事人的補登個人資料")
    private XLDFPersonDataDomainObject main4MT;//被查詢者的4MT
    @FieldName("當事人的補登全戶資料")
    private XLDFHouseholdDataDomainObject main1MT;//被查詢者的1MT
    @FieldName("當事人的補登戶長個人資料")
    private XLDFPersonDataDomainObject householdHead4MT;//被查詢者的戶長之4MT
    public XLDFPersonDataDomainObject getMain4MT() {
        return main4MT;
    }
    public void setMain4MT(XLDFPersonDataDomainObject main4mt) {
        main4MT = main4mt;
    }
    public XLDFHouseholdDataDomainObject getMain1MT() {
        return main1MT;
    }
    public void setMain1MT(XLDFHouseholdDataDomainObject main1mt) {
        main1MT = main1mt;
    }
    public XLDFPersonDataDomainObject getHouseholdHead4MT() {
        return householdHead4MT;
    }
    public void setHouseholdHead4MT(XLDFPersonDataDomainObject householdHead4MT) {
        this.householdHead4MT = householdHead4MT;
    }
    
   
}

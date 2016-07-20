package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class RlWsRule002DTO implements RlWsRule ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -722480384334398235L;
    @FieldName("當事人的現戶個人資料")
    private XLDFPersonDataDTO main4M;//被查詢者的4M
    @FieldName("當事人的現戶全戶資料")
    private XLDFHouseholdDataDTO main1M;//被查詢者的1M
    
    public XLDFPersonDataDTO getMain4M() {
        return main4M;
    }
    public void setMain4M(XLDFPersonDataDTO main4m) {
        main4M = main4m;
    }
    public XLDFHouseholdDataDTO getMain1M() {
        return main1M;
    }
    public void setMain1M(XLDFHouseholdDataDTO main1m) {
        main1M = main1m;
    }
}

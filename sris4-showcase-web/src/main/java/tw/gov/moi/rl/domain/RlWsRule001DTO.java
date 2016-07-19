package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class RlWsRule001DTO implements RlWsRule ,Serializable{

    private static final long serialVersionUID = -1565416604359571904L;
    @FieldName("當事人的現戶個人資料")
    private XLDFPersonDataDTO main4M;//被查詢者的4M
    @FieldName("當事人的現戶全戶資料")
    private XLDFHouseholdDataDTO main1M;//被查詢者的1M
    @FieldName("當事人的現戶戶長個人資料")
    private XLDFPersonDataDTO householdHead4M;//被查詢者的戶長之4M
    
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
    public XLDFPersonDataDTO getHouseholdHead4M() {
        return householdHead4M;
    }
    public void setHouseholdHead4M(XLDFPersonDataDTO householdHead4M) {
        this.householdHead4M = householdHead4M;
    }
}

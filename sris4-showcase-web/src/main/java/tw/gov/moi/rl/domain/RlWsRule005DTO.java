package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class RlWsRule005DTO implements RlWsRule ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -1166925610298977183L;
    @FieldName("當事人的除戶個人資料")
    private XLDFPersonDataDTO main4H;//被查詢者的4H
    @FieldName("當事人的除戶全戶資料")
    private XLDFHouseholdDataDTO main1H;//被查詢者的1H
    
    public XLDFPersonDataDTO getMain4H() {
        return main4H;
    }
    public void setMain4H(XLDFPersonDataDTO main4h) {
        main4H = main4h;
    }
    public XLDFHouseholdDataDTO getMain1H() {
        return main1H;
    }
    public void setMain1H(XLDFHouseholdDataDTO main1h) {
        main1H = main1h;
    }
}

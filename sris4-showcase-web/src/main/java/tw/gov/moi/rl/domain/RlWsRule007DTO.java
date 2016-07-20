package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class RlWsRule007DTO implements RlWsRule ,Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = -3323331279753879752L;
    @FieldName("當事人的補登個人資料")
    private XLDFPersonDataDTO main4MT;//被查詢者的4MT
    @FieldName("當事人的補登全戶資料")
    private XLDFHouseholdDataDTO main1MT;//被查詢者的1MT
    @FieldName("當事人的補登戶長個人資料")
    private XLDFPersonDataDTO householdHead4MT;//被查詢者的戶長之4MT
    public XLDFPersonDataDTO getMain4MT() {
        return main4MT;
    }
    public void setMain4MT(XLDFPersonDataDTO main4mt) {
        main4MT = main4mt;
    }
    public XLDFHouseholdDataDTO getMain1MT() {
        return main1MT;
    }
    public void setMain1MT(XLDFHouseholdDataDTO main1mt) {
        main1MT = main1mt;
    }
    public XLDFPersonDataDTO getHouseholdHead4MT() {
        return householdHead4MT;
    }
    public void setHouseholdHead4MT(XLDFPersonDataDTO householdHead4MT) {
        this.householdHead4MT = householdHead4MT;
    }
    
    
   
}

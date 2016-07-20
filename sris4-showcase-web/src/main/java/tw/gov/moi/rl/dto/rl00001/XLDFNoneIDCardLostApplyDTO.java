package tw.gov.moi.rl.dto.rl00001;

import javax.xml.bind.annotation.XmlElement;
public class XLDFNoneIDCardLostApplyDTO implements XLDFIDCardLostApplyDTO {

    private static XLDFNoneIDCardLostApplyDTO _instance = null;

    private XLDFNoneIDCardLostApplyDTO() {

    }

    public static XLDFNoneIDCardLostApplyDTO getInstance() {
        if (_instance == null) {
            _instance = new XLDFNoneIDCardLostApplyDTO();
        }
        return _instance;
    }

    /** site id */                                    
    @XmlElement(name = "SiteId", required = true)     
    private String siteId;                            
    public String getSiteId() {                       
        return siteId;                                
    }                                                 
    public void setSiteId(String siteId) {            
        this.siteId = siteId;                         
    }                                                 

}

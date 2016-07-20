package tw.gov.moi.rl.dto.rl00001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFPhoneDataDTO", propOrder = { "areacode", "number", "extension" })
public class XLDFPhoneDataDTO {

    @XmlElement(name = "Areacode", required = true)
    private String areacode;

    @XmlElement(name = "Number", required = true)
    private String number;

    @XmlElement(name = "Extension", required = true)
    private String extension;

    public XLDFPhoneDataDTO(String phoneAreacode, String phoneNumber, String phoneExtension) {
        this.areacode = phoneAreacode;
        this.number = phoneNumber;
        this.extension = phoneExtension;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
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

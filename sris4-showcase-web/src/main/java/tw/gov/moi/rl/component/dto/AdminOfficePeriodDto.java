package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adminOfficePeriodDto", propOrder = { 
	"siteId","adminOfficeCode","startYyyMMdd","endYyyMMdd",
	"officeChtName","cityChtName",
	"officeEngName1","cityEngName1",
	"officeEngName2","cityEngName2" })
@XmlRootElement(name = "AdminOfficePeriodDto")
public class AdminOfficePeriodDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -518994620798702072L;
    
    @XmlElement(name = "siteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;
    
    @XmlElement(name = "adminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode;
    
    @XmlElement(name = "startYyyMMdd", required = true)
    @FieldName("生效起始日期")
    private String startYyyMMdd;
    
    @XmlElement(name = "endYyyMMdd", required = true)
    @FieldName("生效終止日期")
    private String endYyyMMdd;
    
    @XmlElement(name = "officeChtName", required = true)
    @FieldName("戶所中文名稱")
    private String officeChtName;
    
    @XmlElement(name = "cityChtName", required = true)
    @FieldName("省市縣市中文名稱")
    private String cityChtName;
    
    @XmlElement(name = "officeEngName1", required = true)
    @FieldName("戶所英文名稱-漢語")
    private String officeEngName1;
    
    @XmlElement(name = "cityEngName1", required = true)
    @FieldName("省市縣市英文名稱-漢語")
    private String cityEngName1;
    
    @XmlElement(name = "officeEngName2", required = true)
    @FieldName("戶所英文名稱-通用")
    private String officeEngName2;
    
    @XmlElement(name = "cityEngName2", required = true)
    @FieldName("省市縣市英文名稱-通用")
    private String cityEngName2;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getStartYyyMMdd() {
        return startYyyMMdd;
    }

    public void setStartYyyMMdd(String startYyyMMdd) {
        this.startYyyMMdd = startYyyMMdd;
    }

    public String getEndYyyMMdd() {
        return endYyyMMdd;
    }

    public void setEndYyyMMdd(String endYyyMMdd) {
        this.endYyyMMdd = endYyyMMdd;
    }

    public String getOfficeChtName() {
        return officeChtName;
    }

    public void setOfficeChtName(String officeChtName) {
        this.officeChtName = officeChtName;
    }

    public String getCityChtName() {
        return cityChtName;
    }

    public void setCityChtName(String cityChtName) {
        this.cityChtName = cityChtName;
    }

    public String getOfficeEngName1() {
        return officeEngName1;
    }

    public void setOfficeEngName1(String officeEngName1) {
        this.officeEngName1 = officeEngName1;
    }

    public String getCityEngName1() {
        return cityEngName1;
    }

    public void setCityEngName1(String cityEngName1) {
        this.cityEngName1 = cityEngName1;
    }

    public String getOfficeEngName2() {
        return officeEngName2;
    }

    public void setOfficeEngName2(String officeEngName2) {
        this.officeEngName2 = officeEngName2;
    }

    public String getCityEngName2() {
        return cityEngName2;
    }

    public void setCityEngName2(String cityEngName2) {
        this.cityEngName2 = cityEngName2;
    }
}

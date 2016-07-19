package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08fa0ResultDTO", propOrder = { "countryCode", "areaCode", "village", "adMark" })
@XmlRootElement(name = "Rl08fa0ResultDTO")
public class Rl08fa0ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 相同選區劃分代碼(名稱) */
    @XmlElement(name = "RegionCode")
    @FieldName("相同選區劃分代碼(名稱)")
    private String regionCode;

    /** 縣市代碼 **/
    @XmlElement(name = "CountryCode", required = true)
    @FieldName("縣市代碼 ")
    private String countryCode;

    /** 鄉鎮市區代碼 **/
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("鄉鎮市區代碼")
    private String areaCode;

    /** 村里 **/
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 增減註記 **/
    @XmlElement(name = "AdMark")
    @FieldName("增減註記")
    private String adMark;

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     *            the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * @param areaCode
     *            the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village
     *            the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return the adMark
     */
    public String getAdMark() {
        return adMark;
    }

    /**
     * @param adMark
     *            the adMark to set
     */
    public void setAdMark(String adMark) {
        this.adMark = adMark;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

}

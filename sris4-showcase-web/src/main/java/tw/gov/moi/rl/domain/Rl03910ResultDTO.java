package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03910ResultDTO", propOrder = { "siteId", "personId", "originalName", "personName", "birthOrderSex",
        "birthYyymmdd", "educationMark", "birthPlaceCode", "militaryCode", "marriageCode", "spouseName",
        "moveInYyymmdd", "specialInciCode", "incidentYyymmdd", "areaCode", "cityCountyCode", "townCode", "village",
        "neighbor", "streetDoorplate", "livingStyleCode", "livingRaceType" })
@XmlRootElement(name = "Rl03910ResultDTO")
public class Rl03910ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2336466103480497297L;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId", required = false)
    @FieldName("國民身分證統一編號")
    private String personId;
    
    /** 姓名(或原姓名) */
    @XmlElement(name = "OriginalName", required = false)
    @FieldName("姓名(或原姓名)")
    private String originalName;

    /** 姓名 */
    @XmlElement(name = "PersonName", required = false)
    @FieldName("姓名")
    private String personName;

    /** 出生別 */
    @XmlElement(name = "BirthOrderSex", required = false)
    @FieldName("出生別")
    private String birthOrderSex;

    /** 出生日期 */
    @XmlElement(name = "BirthYyymmdd", required = false)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 教育程度 */
    @XmlElement(name = "EducationMark", required = false)
    @FieldName("教育程度")
    private String educationMark;

    /** 出生地 */
    @XmlElement(name = "BirthPlaceCode", required = false)
    @FieldName("出生地")
    private String birthPlaceCode;

    /** 役別 */
    @XmlElement(name = "MilitaryCode", required = false)
    @FieldName("役別")
    private String militaryCode;

    /** 婚姻狀況 */
    @XmlElement(name = "MarriageCode", required = false)
    @FieldName("婚姻狀況")
    private String marriageCode;

    /** 配偶姓名 */
    @XmlElement(name = "SpouseName", required = false)
    @FieldName("配偶姓名")
    private String spouseName;

    /** 特殊記事代碼 */
    @XmlElement(name = "SpecialInciCode", required = false)
    @FieldName("特殊記事代碼")
    private String specialInciCode;

    /** 記事發生日期 */
    @XmlElement(name = "IncidentYyymmdd", required = false)
    @FieldName("記事發生日期")
    private String incidentYyymmdd;

    /** 遷入日期 */
    @XmlElement(name = "MoveInYyymmdd", required = false)
    @FieldName("遷入日期")
    private String moveInYyymmdd;

    /** 行政區域代碼 */
    @XmlElement(name = "AreaCode", required = false)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 省市縣市 */
    @XmlElement(name = "CityCountyCode", required = false)
    @FieldName("省市縣市")
    private String cityCountyCode;

    /** 鄉鎮市區 */
    @XmlElement(name = "TownCode", required = false)
    @FieldName("鄉鎮市區")
    private String townCode;

    /** 村里 */
    @XmlElement(name = "Village", required = false)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = false)
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate", required = false)
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** 原住民身分 */
    @XmlElement(name = "LivingStyleCode", required = false)
    @FieldName("原住民身分")
    private String livingStyleCode;

    /** 族別 */
    @XmlElement(name = "LivingRaceType", required = false)
    @FieldName("族別")
    private String livingRaceType;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }
    
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCityCountyCode() {
        if (StringUtils.isNotBlank(this.getAreaCode())) {
            return StringUtils.substring(this.getAreaCode(), 0, 5);
        } else {
            return cityCountyCode;
        }
    }

    public void setCityCountyCode(String cityCountyCode) {
        this.cityCountyCode = cityCountyCode;
    }

    public String getTownCode() {
        if (StringUtils.isNotBlank(this.getAreaCode())) {
            return this.getAreaCode();
        } else {
            return townCode;
        }
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public String getMilitaryCode() {
        return militaryCode;
    }

    public void setMilitaryCode(String militaryCode) {
        this.militaryCode = militaryCode;
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getMoveInYyymmdd() {
        return moveInYyymmdd;
    }

    public void setMoveInYyymmdd(String moveInYyymmdd) {
        this.moveInYyymmdd = moveInYyymmdd;
    }

    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    public String getLivingRaceType() {
        return livingRaceType;
    }

    public void setLivingRaceType(String livingRaceType) {
        this.livingRaceType = livingRaceType;
    }

    public String getSpecialInciCode() {
        return specialInciCode;
    }

    public void setSpecialInciCode(String specialInciCode) {
        this.specialInciCode = specialInciCode;
    }

    public String getIncidentYyymmdd() {
        return incidentYyymmdd;
    }

    public void setIncidentYyymmdd(String incidentYyymmdd) {
        this.incidentYyymmdd = incidentYyymmdd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

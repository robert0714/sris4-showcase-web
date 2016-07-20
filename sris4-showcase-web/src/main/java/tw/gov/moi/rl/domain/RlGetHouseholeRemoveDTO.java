package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetHouseholeRemoveDTO", propOrder = { "householeHeadId", "householeId", "personId", "removeYyymmdd",
        "removeTime", "siteId", "areaCode", "village", "neighbor", "streetDoorplate", "startYear", "endYear",
        "rldf001hDTO", "rldf002hDTO", "rldf004hDTO", "rldf005hDTO" })
@XmlRootElement(name = "RlGetHouseholeRemoveDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetHouseholeRemoveDTO implements java.io.Serializable{

    private static final long serialVersionUID = 5411479108854387286L;


    @XmlElement(name = "HouseholeHeadId", required = false)
    private String householeHeadId;

    @XmlElement(name = "HouseholeId", required = false)
    private String householeId;

    @XmlElement(name = "PersonId", required = false)
    private String personId;

    @XmlElement(name = "RemoveYyymmdd", required = false)
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime", required = false)
    private String removeTime;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    @XmlElement(name = "AreaCode", required = false)
    private String areaCode;

    @XmlElement(name = "Village", required = false)
    private String village;

    @XmlElement(name = "Neighbor", required = false)
    private String neighbor;

    @XmlElement(name = "StreetDoorplate", required = false)
    private String streetDoorplate;

    @XmlElement(name = "StartYear", required = false)
    private String startYear;

    @XmlElement(name = "EndYear", required = false)
    private String endYear;

    @XmlElement(name = "Rldf001hDTO", required = false)
    private List<Rldf001hType> rldf001hDTO = new ArrayList<Rldf001hType>();

    @XmlElement(name = "Rldf002hDTO", required = false)
    private List<Rldf002hType> rldf002hDTO = new ArrayList<Rldf002hType>();

    @XmlElement(name = "Rldf004hDTO", required = false)
    private List<Rldf004hType> rldf004hDTO = new ArrayList<Rldf004hType>();

    @XmlElement(name = "Rldf005hDTO", required = false)
    private List<Rldf005hType> rldf005hDTO = new ArrayList<Rldf005hType>();

    public String getHouseholeHeadId() {
        return householeHeadId;
    }

    public void setHouseholeHeadId(String householeHeadId) {
        this.householeHeadId = householeHeadId;
    }

    public String getHouseholeId() {
        return householeId;
    }

    public void setHouseholeId(String householeId) {
        this.householeId = householeId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public List<Rldf001hType> getRldf001hDTO() {
        return rldf001hDTO;
    }

    public void setRldf001hDTO(List<Rldf001hType> rldf001hDTO) {
        this.rldf001hDTO = rldf001hDTO;
    }

    public List<Rldf002hType> getRldf002hDTO() {
        return rldf002hDTO;
    }

    public void setRldf002hDTO(List<Rldf002hType> rldf002hDTO) {
        this.rldf002hDTO = rldf002hDTO;
    }

    public List<Rldf004hType> getRldf004hDTO() {
        return rldf004hDTO;
    }

    public void setRldf004hDTO(List<Rldf004hType> rldf004hDTO) {
        this.rldf004hDTO = rldf004hDTO;
    }

    public List<Rldf005hType> getRldf005hDTO() {
        return rldf005hDTO;
    }

    public void setRldf005hDTO(List<Rldf005hType> rldf005hDTO) {
        this.rldf005hDTO = rldf005hDTO;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

}

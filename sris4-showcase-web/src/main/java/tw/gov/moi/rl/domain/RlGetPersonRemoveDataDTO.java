package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonRemoveDataDTO", propOrder = { "personId", "siteId", "householeHeadId", "householeId",
        "removeYyymmdd", "removeTime", "personName", "startBirth", "endBirth", "startYear", "endYear", "rldf001hDTO", "rldf004hDTO",
        "rldf005hDTO" })
@XmlRootElement(name = "RlGetPersonRemoveDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonRemoveDataDTO implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    @FieldName("統號")
    private String personId;

    @XmlElement(name = "HouseholeHeadId", required = false)
    @FieldName("戶長統號")
    private String householeHeadId;

    @XmlElement(name = "HouseholeId", required = false)
    @FieldName("戶號")
    private String householeId;

    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點")
    private String siteId;

    @XmlElement(name = "RemoveYyymmdd", required = false)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime", required = false)
    @FieldName("除戶時間")
    private String removeTime;

    @XmlElement(name = "PersonName", required = false)
    @FieldName("姓名")
    private String personName;

    @XmlElement(name = "StartBirth", required = false)
    @FieldName("出生日期-起")
    private String startBirth;

    @XmlElement(name = "EndBirth", required = false)
    @FieldName("出生日期-迄")
    private String endBirth;

    @XmlElement(name = "StartYear", required = false)
    @FieldName("年-起")
    private String startYear;

    @XmlElement(name = "EndYear", required = false)
    @FieldName("年-迄")
    private String endYear;
    
    @XmlElement(name = "Rldf001hDTO", required = false)
    @FieldName("除戶全戶資料")
    private List<Rldf001hType> rldf001hDTO = new ArrayList<Rldf001hType>();

    @XmlElement(name = "Rldf004hDTO", required = false)
    @FieldName("除戶個人資料")
    private List<Rldf004hType> rldf004hDTO = new ArrayList<Rldf004hType>();

    @XmlElement(name = "Rldf005hDTO", required = false)
    @FieldName("除戶記事")
    private List<Rldf005hType> rldf005hDTO = new ArrayList<Rldf005hType>();

    public List<Rldf001hType> getRldf001hDTO() {
		return rldf001hDTO;
	}

	public void setRldf001hDTO(List<Rldf001hType> rldf001hDTO) {
		this.rldf001hDTO = rldf001hDTO;
	}

	public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

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

    public void setSiteId(String siteId) {
        this.siteId = siteId;
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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getStartBirth() {
        return startBirth;
    }

    public void setStartBirth(String startBirth) {
        this.startBirth = startBirth;
    }

    public String getEndBirth() {
        return endBirth;
    }

    public void setEndBirth(String endBirth) {
        this.endBirth = endBirth;
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

}

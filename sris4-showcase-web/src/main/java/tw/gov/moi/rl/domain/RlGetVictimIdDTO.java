package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetVictimIdDTO", propOrder = { "victimId", "violatorId", "beginYyymmdd", "endYyymmdd", "siteId" })
@XmlRootElement(name = "RlGetVictimIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetVictimIdDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VictimId", required = false)
    private String victimId;

    @XmlElement(name = "ViolatorId", required = false)
    private String violatorId;

    @XmlElement(name = "BeginYyymmdd", required = false)
    private String beginYyymmdd;

    @XmlElement(name = "EndYyymmdd", required = false)
    private String endYyymmdd;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getVictimId() {
        return victimId;
    }

    public void setVictimId(String victimId) {
        this.victimId = victimId;
    }

    public String getViolatorId() {
        return violatorId;
    }

    public void setViolatorId(String violatorId) {
        this.violatorId = violatorId;
    }

    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    public void setBeginYyymmdd(String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

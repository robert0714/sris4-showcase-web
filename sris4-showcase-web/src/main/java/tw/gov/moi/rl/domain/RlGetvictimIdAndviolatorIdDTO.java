package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetvictimIdAndviolatorIdDTO", propOrder = { "victimId", "violatorId", "siteId" })
@XmlRootElement(name = "RlGetvictimIdAndviolatorIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetvictimIdAndviolatorIdDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VictimId", required = false)
    @FieldName("victimId")
    private String victimId = "";

    @XmlElement(name = "ViolatorId", required = false)
    @FieldName("violatorId")
    private String violatorId = "";

    @XmlElement(name = "SiteId", required = false)
    @FieldName("siteId")
    private String siteId = "";

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

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}

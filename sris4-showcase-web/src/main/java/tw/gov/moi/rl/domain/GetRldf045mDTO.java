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
@XmlType(name = "getRldf045mDTO", propOrder = { "personId", "householdHeadId", "householdId", "processMark01",
        "processMark02", "siteId" })
@XmlRootElement(name = "GetRldf045mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class GetRldf045mDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 國民身分證 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("國民身分證")
    private String personId;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 登記日期 */
    @XmlElement(name = "ProcessMark01", required = true)
    @FieldName("登記日期")
    private String processMark01;

    /** 登記時間 */
    @XmlElement(name = "ProcessMark02", required = true)
    @FieldName("登記時間")
    private String processMark02;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public String getProcessMark01() {
        return processMark01;
    }

    public void setProcessMark01(String processMark01) {
        this.processMark01 = processMark01;
    }

    public String getProcessMark02() {
        return processMark02;
    }

    public void setProcessMark02(String processMark02) {
        this.processMark02 = processMark02;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

}

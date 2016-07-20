package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personEduData", propOrder = { "dataIndex", "personId", "siteId", "birthday", "name", "orgEdu",
        "afterEdu" })
@XmlRootElement(name = "PersonEduData")
public class PersonEduData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 180722527512791147L;

    /** 資料序號 */
    @FieldName("資料序號")
    @XmlElement(name = "dataIndex", required = false)
    int dataIndex;

    /** 原統號 */
    @FieldName("原統號")
    @XmlElement(name = "personId", required = false)
    String personId;

    /** 原作業點代碼 */
    @FieldName("原作業點代碼")
    @XmlElement(name = "siteId", required = false)
    String siteId;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "birthday", required = false)
    String birthday;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "name", required = false)
    String name = "";

    /** 出生日期 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "orgEdu", required = false)
    String orgEdu = "";

    /** 出生日期 */
    @FieldName("修正後教育程度註記")
    @XmlElement(name = "afterEdu", required = false)
    String afterEdu = "";

    public int getDataIndex() {
        return dataIndex;
    }

    public void setDataIndex(int dataIndex) {
        this.dataIndex = dataIndex;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgEdu() {
        return orgEdu;
    }

    public void setOrgEdu(String orgEdu) {
        this.orgEdu = orgEdu;
    }

    public String getAfterEdu() {
        return afterEdu;
    }

    public void setAfterEdu(String afterEdu) {
        this.afterEdu = afterEdu;
    }

}

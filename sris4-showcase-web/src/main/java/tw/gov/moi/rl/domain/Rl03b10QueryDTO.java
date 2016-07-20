package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf047mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03b10QueryDTO", propOrder = { "personId", "siteId", "rldf001m", "rldf004m", "rldf004mList",
        "householdHead", "violence", "rldf047m" })
@XmlRootElement(name = "Rl03b10QueryDTO")
public class Rl03b10QueryDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 統號 */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 全戶基本資料 */
    @XmlElement(name = "Rldf001m")
    @FieldName("全戶基本資料")
    private Rldf001mType rldf001m;

    /** 個人基本資料 */
    @XmlElement(name = "Rldf004m")
    @FieldName("個人基本資料")
    private Rldf004mType rldf004m;

    /** 個人基本資料 List */
    @XmlElement(name = "Rldf004mList")
    @FieldName("個人基本資料 List")
    private List<Rldf004mType> rldf004mList;

    /** 個人基本資料 */
    @XmlElement(name = "HouseholdHead")
    @FieldName("個人基本資料")
    private Rldf004mType householdHead;

    /** 家暴被害 */
    @XmlElement(name = "Violence")
    @FieldName("家暴被害")
    private List<Rldf004mType> violence;

    /** 羅馬拼音檔 */
    @XmlElement(name = "Rldf047m")
    @FieldName("羅馬拼音檔")
    protected Rldf047mType rldf047m;

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

    public Rldf001mType getRldf001m() {
        return rldf001m;
    }

    public void setRldf001m(Rldf001mType rldf001m) {
        this.rldf001m = rldf001m;
    }

    public Rldf004mType getHouseholdHead() {
        return householdHead;
    }

    public void setHouseholdHead(Rldf004mType householdHead) {
        this.householdHead = householdHead;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    public List<Rldf004mType> getRldf004mList() {
        if (rldf004mList == null) {
            rldf004mList = new ArrayList<Rldf004mType>();
        }
        return rldf004mList;
    }

    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    public List<Rldf004mType> getViolence() {
        if (violence == null) {
            violence = new ArrayList<Rldf004mType>();
        }
        return violence;
    }

    public void setViolence(List<Rldf004mType> violence) {
        this.violence = violence;
    }

    public Rldf047mType getRldf047m() {
        if (rldf047m == null) {
            rldf047m = new Rldf047mType();
        }
        return rldf047m;
    }

    public void setRldf047m(Rldf047mType rldf047m) {
        this.rldf047m = rldf047m;
    }

}

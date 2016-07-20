package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01340MoveOutRemainderDTO", propOrder = { "IsHouseholdHeader", "PersonName", "PersonId",
        "BirthYyymmdd", "MoveOutDate", "Appellation", "checked", "oldAppellation" })
@XmlRootElement(name = "Rl01340MoveOutRemainderDTO")
public class Rl01340MoveOutRemainderDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 是否為新戶長
     */

    @XmlElement(name = "IsHouseholdHeader", required = true)
    @FieldName("是否為新戶長")
    private boolean isHouseholdHeader;

    /**
     * 性名
     */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("性名")
    private String personName;

    /**
     * 統號
     */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /**
     * 姓名
     */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("個人記事")
    private String birthYyymmdd;

    /**
     * 遷出時間
     */
    @XmlElement(name = "MoveOutDate", required = true)
    @FieldName("遷出時間")
    private String moveOutDate;

    /**
     * 稱謂
     */
    @XmlElement(name = "Appellation", required = true)
    @FieldName("稱謂")
    private String appellation;

    @XmlElement(name = "Checked", required = true)
    @FieldName("選擇 ")
    private boolean checked;
    
    @XmlElement(name = "oldAppellation", required = true)
    @FieldName("原稱謂")
    private String oldAppellation;

    public String getOldAppellation() {
		return oldAppellation;
	}

	public void setOldAppellation(String oldAppellation) {
		this.oldAppellation = oldAppellation;
	}

	public boolean isHouseholdHeader() {
        return isHouseholdHeader;
    }

    public void setHouseholdHeader(boolean isHouseholdHeader) {
        this.isHouseholdHeader = isHouseholdHeader;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(String moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Rl01340MoveOutRemainderDTO [isHouseholdHeader=" + isHouseholdHeader + ", personName=" + personName
                + ", personId=" + personId + ", birthYyymmdd=" + birthYyymmdd + ", moveOutDate=" + moveOutDate
                + ", appellation=" + appellation + ", checked=" + checked + "]";
    }
}

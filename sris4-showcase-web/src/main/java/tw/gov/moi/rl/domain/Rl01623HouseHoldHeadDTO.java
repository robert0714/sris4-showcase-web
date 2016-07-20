package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01623HouseHoldHeadDTO
 * 
 * @author Alan Lo
 */
public class Rl01623HouseHoldHeadDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 戶長姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("戶長姓名")
    private String personName;

    /** 戶長統號 */
    @XmlElement(name = "PersonId")
    @FieldName("戶長統號")
    private String personId;

    /** 戶號 */
    @XmlElement(name = "HouseHoldId")
    @FieldName("戶號")
    private String houseHoldId;

    /** 戶別 */
    @XmlElement(name = "HouseType")
    @FieldName("戶別")
    private String houseType;

    /** 是否改編 */
    @XmlElement(name = "RegStatus")
    @FieldName("是否改編")
    private String regStatus;

    /** 記事內容 */
    @XmlElement(name = "RegContent")
    @FieldName("記事內容")
    private String regContent;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public String getRegContent() {
        return regContent;
    }

    public void setRegContent(String regContent) {
        this.regContent = regContent;
    }

}

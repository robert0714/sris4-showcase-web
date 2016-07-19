/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 罰鍰受處分人 基本資料 DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finePersonDTO", propOrder = { "personId", "siteId", "name", "gender", "birthDate", "village",
        "neighbor", "streetDoorplate" })
@XmlRootElement(name = "FinePersonDTO")
public class FinePersonDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    @XmlElement(name = "PersonId", required = true)
    @FieldName("受處分人統號")
    private String personId;
    @XmlElement(name = "SiteId", required = true)
    @FieldName("受處分人戶籍地作業點代碼")
    private String siteId;
    @XmlElement(name = "Name", required = true)
    @FieldName("受處分人名字")
    private String name;
    @XmlElement(name = "Gender", required = true)
    @FieldName("受處分人性別")
    private String gender;

    @XmlElement(name = "BirthDate", required = true)
    @FieldName("受處分人出生日期(YYY/MM/DD)")
    private String birthDate;

    @XmlElement(name = "Village", required = true)
    @FieldName("受處分人戶籍地址-村里-")
    private String village;
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("受處分人戶籍地址-鄰-")
    private String neighbor;
    @XmlElement(name = "StreetDoorplate", required = true)
    @FieldName("受處分人戶籍地址-街路門牌-")
    private String streetDoorplate;

    public FinePersonDTO() {

    }

    public FinePersonDTO(String personId, String siteId, String name, String gender, String birthDate, String village,
            String neighbor, String streetDoorplate) {
        super();
        this.personId = personId;
        this.siteId = siteId;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.village = village;
        this.neighbor = neighbor;
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate
     *            the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village
     *            the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * @param neighbor
     *            the neighbor to set
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * @return the streetDoorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * @param streetDoorplate
     *            the streetDoorplate to set
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

}

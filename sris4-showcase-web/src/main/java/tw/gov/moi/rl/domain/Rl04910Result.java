package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04910Result", propOrder = { "siteId", "adminOfficeCode", "regStreetDoor", "stdStreetDoor",
        "checkRange" })
@XmlRootElement(name = "Rl04910Result")
public class Rl04910Result implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 作業點代碼 **/
    @XmlElement(name = "siteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 戶所代碼 **/
    @XmlElement(name = "adminOfficeCode")
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 街路門牌 **/
    @XmlElement(name = "RegStreetDoor")
    @FieldName("街路門牌")
    private String regStreetDoor;

    /** 標準門牌 **/
    @XmlElement(name = "StdStreetDoor")
    @FieldName("標準門牌")
    private String stdStreetDoor;

    /** 是否調整 **/
    @XmlElement(name = "CheckRange")
    @FieldName("是否調整")
    private boolean checkRange;

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
     * @return the adminOfficeCode
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * @param adminOfficeCode
     *            the adminOfficeCode to set
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * @return the regStreetDoor
     */
    public String getRegStreetDoor() {
        return regStreetDoor;
    }

    /**
     * @param regStreetDoor
     *            the regStreetDoor to set
     */
    public void setRegStreetDoor(String regStreetDoor) {
        this.regStreetDoor = regStreetDoor;
    }

    /**
     * @return the stdStreetDoor
     */
    public String getStdStreetDoor() {
        return stdStreetDoor;
    }

    /**
     * @param stdStreetDoor
     *            the stdStreetDoor to set
     */
    public void setStdStreetDoor(String stdStreetDoor) {
        this.stdStreetDoor = stdStreetDoor;
    }

    /**
     * @return the checkRange
     */
    public boolean isCheckRange() {
        return checkRange;
    }

    /**
     * @param checkRange
     *            the checkRange to set
     */
    public void setCheckRange(boolean checkRange) {
        this.checkRange = checkRange;
    }

}
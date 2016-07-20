package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01625OldAddressDTO", propOrder = { "oldStreetDoorplate" })
@XmlRootElement(name = "Rl01625OldAddressDTO")
public class Rl01625OldAddressDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 合併前門牌 */
    @XmlElement(name = "oldStreetDoorplate")
    @FieldName("合併前門牌")
    private String oldStreetDoorplate = "";

    @XmlElement(name = "newStreetDoorplate")
    @FieldName("合併前門牌")
    private String newStreetDoorplate = "";

    public String getOldStreetDoorplate() {
        return oldStreetDoorplate;
    }

    public void setOldStreetDoorplate(String oldStreetDoorplate) {
        this.oldStreetDoorplate = oldStreetDoorplate;
    }

    public String getNewStreetDoorplate() {
        return newStreetDoorplate;
    }

    public void setNewStreetDoorplate(String newStreetDoorplate) {
        this.newStreetDoorplate = newStreetDoorplate;
    }

}

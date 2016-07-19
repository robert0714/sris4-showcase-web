package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04700ResultDTO", propOrder = { "village" })
@XmlRootElement(name = "Rl04700ResultDTO")
public class Rl04700ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 村里名稱 */
    @XmlElement(name = "Village")
    @FieldName("村里名稱")
    private String village;

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

}

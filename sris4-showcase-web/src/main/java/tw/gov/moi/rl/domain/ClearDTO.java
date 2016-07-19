package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clearDTO", propOrder = { "checked", "memberPersonId" })
@XmlRootElement(name = "ClearDTO")
public class ClearDTO implements Serializable {
    /** Serail Id. */
    private static final long serialVersionUID = 1L;
    /** 清除 */
    @XmlElement(name = "checked", required = true)
    @FieldName("清除")
    private boolean checked;

    /** 國民身分證統一編號 */
    @XmlElement(name = "memberPersonId", required = true)
    @FieldName("國民身分證統一編號")
    private String memberPersonId;

    /**
     * @return the checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * @param checked
     *            the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /**
     * @return the memberPersonId
     */
    public String getMemberPersonId() {
        return memberPersonId;
    }

    /**
     * @param memberPersonId
     *            the memberPersonId to set
     */
    public void setMemberPersonId(String memberPersonId) {
        this.memberPersonId = memberPersonId;
    }
}

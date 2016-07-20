package tw.gov.moi.rl.dto.rl01800;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01803MemberDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01803MemberDTO", propOrder = { "select", "memberPersonId", "name" })
@XmlRootElement(name = "Rl01803MemberDTO")
public class Rl01803MemberDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "Select")
    @FieldName("選擇")
    private boolean select;

    @XmlElement(name = "MemberPersonId")
    @FieldName("國民身分證統一編號")
    private String memberPersonId;

    @XmlElement(name = "Name")
    @FieldName("姓名")
    private String name;

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public String getMemberPersonId() {
        return memberPersonId;
    }

    public void setMemberPersonId(String memberPersonId) {
        this.memberPersonId = memberPersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

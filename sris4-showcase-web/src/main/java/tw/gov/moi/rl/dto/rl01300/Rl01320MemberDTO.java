package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * Rl01320MemberDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320MemberDTO", propOrder = { "select", "memberPersonId", "name", "relationship" })
@XmlRootElement(name = "Rl01320MemberDTO")
public class Rl01320MemberDTO implements Serializable {

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

    @XmlElement(name = "Relationship")
    @FieldName("稱謂")
    private String relationship;

    public Rl01320MemberDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Rl01320MemberDTO(boolean select, String memberPersonId, String name, String relationship) {
        super();
        this.select = select;
        this.memberPersonId = memberPersonId;
        this.name = name;
        this.relationship = relationship;
    }

    public Rl01320MemberDTO(XLDFPersonDataDomainObject addPersonData) {
        super();
        this.select = Boolean.FALSE;
        this.memberPersonId = addPersonData.getPersonId();
        this.name = addPersonData.getPersonName();
        this.relationship = addPersonData.getRelationship();
    }

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

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     *            the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}

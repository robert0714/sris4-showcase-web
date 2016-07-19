package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.CompareToBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01830HouseholdNoteDTO", propOrder = { "HouseholdHeadId", "HouseholdHeadName", "HouseholdId",
        "Remark", "ClassType", "RegisterCode", "RegisterContent"

})
@XmlRootElement(name = "Rl01830HouseholdNoteDTO")
public class Rl01830HouseholdNoteDTO implements Serializable, Comparable<Rl01830HouseholdNoteDTO> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統一編號")
    private String householdHeadId;

    @XmlElement(name = "HouseholdHeadName", required = true)
    @FieldName("戶長姓名")
    private String householdHeadName;

    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    @XmlElement(name = "Remark", required = true)
    @FieldName("備註")
    private String remark;

    @XmlElement(name = "ClassType", required = true)
    @FieldName("記事類型")
    private String classType;

    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;

    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    @Override
    public int compareTo(Rl01830HouseholdNoteDTO param) {
        return new CompareToBuilder().append(this.getRemark(), param.getRemark())
                .append(this.getClassType(), param.getClassType()).toComparison()
                * -1;
    }

}

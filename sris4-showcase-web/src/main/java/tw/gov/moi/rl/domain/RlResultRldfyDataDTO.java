package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 個人記事欄位化DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlResultRldfyDataDTO", propOrder = { "personId", "rldfyDataList" })
@XmlRootElement(name = "RlResultRldfyDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlResultRldfyDataDTO implements Serializable {

    private static final long serialVersionUID = -5656277621449846115L;

    /** The person id. */
    @XmlElement(name = "PersonId", required = false)
    @FieldName("統號")
    private String personId;

    @XmlElement(name = "RldfyDataList")
    @FieldName("個人記事欄位化清單")
    List<Object> rldfyDataList = new ArrayList<Object>(20);

    public RlResultRldfyDataDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public RlResultRldfyDataDTO(String personId, List<Object> rldfyDataList) {
        super();
        this.personId = personId;
        this.rldfyDataList = rldfyDataList;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<Object> getRldfyDataList() {
        return rldfyDataList;
    }

    public void setRldfyDataList(List<Object> rldfyDataList) {
        this.rldfyDataList = rldfyDataList;
    }

}

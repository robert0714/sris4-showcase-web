package tw.gov.moi.rl.dto.rl01800;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01803MoveOutRegisterDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01803MoveOutRegisterDTO", propOrder = { "selectPersonId", "personRegisterList" })
@XmlRootElement(name = "Rl01803MoveOutRegisterDTO")
public class Rl01803MoveOutRegisterDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SelectPersonId")
    @FieldName("選擇")
    private String selectPersonId;

    @XmlElement(name = "PersonRegisterList")
    @FieldName("挑選個人記事")
    private List<Rl01803SelectRegisterDTO> personRegisterList;

    public String getSelectPersonId() {
        return selectPersonId;
    }

    public void setSelectPersonId(String selectPersonId) {
        this.selectPersonId = selectPersonId;
    }

    public List<Rl01803SelectRegisterDTO> getPersonRegisterList() {

        if (personRegisterList == null) {
            personRegisterList = new ArrayList<Rl01803SelectRegisterDTO>();
        }

        return personRegisterList;
    }

    public void setPersonRegisterList(List<Rl01803SelectRegisterDTO> personRegisterList) {
        this.personRegisterList = personRegisterList;
    }

}

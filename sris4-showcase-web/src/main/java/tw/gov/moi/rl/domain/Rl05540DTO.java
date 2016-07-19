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
import tw.gov.moi.domain.Rldf004mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05540DTO", propOrder = { "personId", "rldf004mType", "listRl05540ResultDTO" })
@XmlRootElement(name = "Rl05540DTO")
public class Rl05540DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統號 */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** Rldf004mType */
    @XmlElement(name = "rldf004mType")
    @FieldName("個人基本資料")
    private Rldf004mType rldf004mType = null;

    /** 查詢結果 */
    @XmlElement(name = "listRl05540ResultDTO")
    @FieldName("查詢結果")
    private List<Rl05540ResultDTO> listRl05540ResultDTO = new ArrayList<Rl05540ResultDTO>(0);

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public List<Rl05540ResultDTO> getListRl05540ResultDTO() {
        return listRl05540ResultDTO;
    }

    public void setListRl05540ResultDTO(List<Rl05540ResultDTO> listRl05540ResultDTO) {
        this.listRl05540ResultDTO = listRl05540ResultDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

}

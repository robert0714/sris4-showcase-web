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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05291DTO", propOrder = { "AddCountNu", "Rl048mlist", "DtoResult", "TempResult", "Select" })
@XmlRootElement(name = "Rl05291DTO")
public class Rl05291DTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "AddCountNu")
    @FieldName("addCountNu")
    final int addCountNu = 10;

    @XmlElement(name = "DtoResult")
    @FieldName("dtoResult")
    private List<Rl05291DTOResult> dtoResult = new ArrayList<Rl05291DTOResult>();

    @XmlElement(name = "Select")
    @FieldName("select")
    private Rl05291DTOResult select;

    public void addResult(Rl05291DTOResult result) {
        dtoResult.add(result);
    }

    public int findIndex(Rl05291DTOResult selectItem) {
        return dtoResult.indexOf(selectItem);
    }

    public List<Rl05291DTOResult> getDtoResult() {
        return dtoResult;
    }

    public void setDtoResult(List<Rl05291DTOResult> dtoResult) {
        this.dtoResult = dtoResult;
    }

    public Rl05291DTOResult getSelect() {
        return select;
    }

    public void setSelect(Rl05291DTOResult select) {
        this.select = select;
    }

    @Override
    public String toString() {
        return "Rl05291DTO [addCountNu=" + addCountNu + ", dtoResult=" + dtoResult + ", select=" + select + "]";
    }
}

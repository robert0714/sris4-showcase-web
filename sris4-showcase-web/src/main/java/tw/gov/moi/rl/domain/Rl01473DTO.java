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
@XmlType(name = "rl01473DTO", propOrder = { "personId", "specialCode", "endYyymmdd", "queryLists", "queryType" })
@XmlRootElement(name = "Rl01473DTO")
public class Rl01473DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;
    
    // 統號
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    // 特殊註記
    @XmlElement(name = "SpecialCode")
    @FieldName("特殊註記")
    private String specialCode;

    // 列管終止日期
    @XmlElement(name = "EndYyymmdd")
    @FieldName("列管終止日期")
    private String endYyymmdd;

    // 查詢結果
    @XmlElement(name = "QueryLists")
    @FieldName("查詢結果")
    private List<Rl01473EditDTO> queryLists = new ArrayList<Rl01473EditDTO>();

    /** 查詢類別 */
    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    public List<Rl01473EditDTO> getQueryLists() {
        return queryLists;
    }

    public void setQueryLists(List<Rl01473EditDTO> queryLists) {
        this.queryLists = queryLists;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

}

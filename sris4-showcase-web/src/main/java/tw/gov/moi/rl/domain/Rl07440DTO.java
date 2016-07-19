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
@XmlType(name = "rl07440DTO", propOrder = { "deleteIndex", "personId", "applyCaseCode", "regDateStart", "regDateEnd",
        "village", "rl07440DTOResult" })
@XmlRootElement(name = "Rl07440DTO")
public class Rl07440DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 586618295144192623L;

    /** 要刪除的資料序號 */
    @FieldName("要刪除的資料序號")
    @XmlElement(name = "DeleteIndex", required = false)
    private int deleteIndex;

    /** 統號 */
    @FieldName("統號")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 申登案別代碼 */
    @FieldName("申登案別代碼")
    @XmlElement(name = "ApplyCaseCode", required = false)
    private String applyCaseCode;

    /** 開單(登記)日期-開始 */
    @FieldName("開單(登記)日期-開始")
    @XmlElement(name = "RegDateStart", required = false)
    private String regDateStart;

    /** 開單(登記)日期-結束 */
    @FieldName("開單(登記)日期-結束")
    @XmlElement(name = "RegDateEnd", required = false)
    private String regDateEnd;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "Village", required = false)
    private String village;

    /** 查詢結果資料List[] */
    @FieldName("查詢結果資料清單")
    @XmlElement(name = "Rl07440DTOResult", required = false)
    private List<Rl07440ResultDTO> rl07440DTOResult = new ArrayList<Rl07440ResultDTO>();

    public int getDeleteIndex() {
        return deleteIndex;
    }

    public void setDeleteIndex(int deleteIndex) {
        this.deleteIndex = deleteIndex;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getApplyCaseCode() {
        return applyCaseCode;
    }

    public void setApplyCaseCode(String applyCaseCode) {
        this.applyCaseCode = applyCaseCode;
    }

    public String getRegDateStart() {
        return regDateStart;
    }

    public void setRegDateStart(String regDateStart) {
        this.regDateStart = regDateStart;
    }

    public String getRegDateEnd() {
        return regDateEnd;
    }

    public void setRegDateEnd(String regDateEnd) {
        this.regDateEnd = regDateEnd;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public List<Rl07440ResultDTO> getRl07440DTOResult() {
        return rl07440DTOResult;
    }

    public void setRl07440DTOResult(List<Rl07440ResultDTO> rl07440dtoResult) {
        rl07440DTOResult = rl07440dtoResult;
    }

}

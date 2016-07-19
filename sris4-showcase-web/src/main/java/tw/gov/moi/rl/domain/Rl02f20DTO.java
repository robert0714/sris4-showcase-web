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
import tw.gov.moi.domain.Rldf2f10Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02f20DTO", propOrder = { "beApplyId", "beApplyName", "row", "resultList", "rlWarningMessageList",
        "hp02F20DTO", "applyDateStart", "applyDateEnd" })
@XmlRootElement(name = "Rl02f20DTO")
public class Rl02f20DTO implements Serializable {

    private static final long serialVersionUID = 3659813147466598101L;

    /** 被申請人統號. */
    @XmlElement(name = "BeApplyId")
    @FieldName("被申請人統號")
    private String beApplyId = "";

    /** 被申請人姓名. */
    @XmlElement(name = "BeApplyName")
    @FieldName("被申請人姓名")
    private String beApplyName = "";

    /** 大宗戶籍謄本案件檔查詢清單索引. */
    @XmlElement(name = "Row")
    @FieldName("大宗戶籍謄本案件檔查詢清單索引")
    private Integer row = 0;

    /** 大宗戶籍謄本案件檔查詢清單. */
    @XmlElement(name = "ResultList")
    @FieldName("大宗戶籍謄本案件檔查詢清單")
    private List<Rldf2f10Type> resultList = new ArrayList<Rldf2f10Type>();

    /** 警告訊息清單. */
    @XmlElement(name = "RlWarningMessageList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> rlWarningMessageList = new ArrayList<RlWarningMessage>();

    /** 大宗戶籍謄本轉向戶籍謄本之用的DTO. */
    @XmlElement(name = "HP02F20DTO")
    @FieldName("大宗戶籍謄本轉向戶籍謄本之用的DTO")
    private HP02F20DTO hp02F20DTO;

    /** 受理日期起. */
    @XmlElement(name = "ApplyDateStart")
    @FieldName("受理日期起")
    private String applyDateStart = "";

    /** 受理日期迄. */
    @XmlElement(name = "ApplyDateEnd")
    @FieldName("受理日期迄")
    private String applyDateEnd = "";

    public String getBeApplyId() {
        return beApplyId;
    }

    public void setBeApplyId(String beApplyId) {
        this.beApplyId = beApplyId;
    }

    public String getBeApplyName() {
        return beApplyName;
    }

    public void setBeApplyName(String beApplyName) {
        this.beApplyName = beApplyName;
    }

    public List<Rldf2f10Type> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rldf2f10Type> resultList) {
        this.resultList = resultList;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public List<RlWarningMessage> getRlWarningMessageList() {
        return rlWarningMessageList;
    }

    public void setRlWarningMessageList(List<RlWarningMessage> rlWarningMessageList) {
        this.rlWarningMessageList = rlWarningMessageList;
    }

    public HP02F20DTO getHp02F20DTO() {
        return hp02F20DTO;
    }

    public void setHp02F20DTO(HP02F20DTO hp02f20dto) {
        hp02F20DTO = hp02f20dto;
    }

    public String getApplyDateStart() {
        return applyDateStart;
    }

    public void setApplyDateStart(String applyDateStart) {
        this.applyDateStart = applyDateStart;
    }

    public String getApplyDateEnd() {
        return applyDateEnd;
    }

    public void setApplyDateEnd(String applyDateEnd) {
        this.applyDateEnd = applyDateEnd;
    }
}

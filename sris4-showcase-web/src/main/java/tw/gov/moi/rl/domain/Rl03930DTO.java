package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfal01Type;

/**
 * 全國個人概要資料查詢紀錄處理DTO
 * 
 * @author David Wu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03930DTO", propOrder = { "userName", "queryPersonName", "queryPersonId", "queryDayStart",
        "queryDayEnd", "rldfal01", "resultList", "queryRecord", "objDto" })
@XmlRootElement(name = "Rl03930DTO")
public class Rl03930DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4471800219320322371L;
    
    @XmlElement(name = "UserName", required = false)
    @FieldName("查詢人員姓名")
    private String userName;
    
    @XmlElement(name = "QueryPersonName", required = false)
    @FieldName("被查詢人員姓名")
    private String queryPersonName;
    
    @XmlElement(name = "QueryPersonId", required = false)
    @FieldName("被查詢人員統號")
    private String queryPersonId;

    @XmlElement(name = "QueryDayStart", required = false)
    @FieldName("查詢日期(起)")
    private String queryDayStart;
    
    @XmlElement(name = "QueryDayEnd", required = false)
    @FieldName("查詢日期(迄)")
    private String queryDayEnd;

    @XmlElement(name = "Rldfal01")
    @FieldName("全國個人概要查詢申請紀錄")
    private Rldfal01Type rldfal01;
    
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果(存放多筆Rldfal01、Rldfal02)")
    private List<Rl03930ResultDTO> resultList;
    
    @XmlElement(name = "QueryRecord")
    @FieldName("查詢結果(存放Rldfal01、Rldfal02)")
    private Rl03930ResultDTO queryRecord;
    
//    @XmlElement(name = "resultList")
//    @FieldName("查詢結果(存放Rldfal02)")
//    private List<Rldfal02Type> resultList;
    
    @XmlElement(name = "ObjDto")
    @FieldName("親等測試DTO")
    private Object objDto;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQueryPersonName() {
        return queryPersonName;
    }

    public void setQueryPersonName(String queryPersonName) {
        this.queryPersonName = queryPersonName;
    }

    public String getQueryPersonId() {
        return queryPersonId;
    }

    public void setQueryPersonId(String queryPersonId) {
        this.queryPersonId = queryPersonId;
    }

    public String getQueryDayStart() {
        return queryDayStart;
    }

    public void setQueryDayStart(String queryDayStart) {
        this.queryDayStart = queryDayStart;
    }

    public String getQueryDayEnd() {
        return queryDayEnd;
    }

    public void setQueryDayEnd(String queryDayEnd) {
        this.queryDayEnd = queryDayEnd;
    }

    public Rldfal01Type getRldfal01() {
        return rldfal01;
    }

    public void setRldfal01(Rldfal01Type rldfal01) {
        this.rldfal01 = rldfal01;
    }

    public List<Rl03930ResultDTO> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rl03930ResultDTO> resultList) {
        this.resultList = resultList;
    }

    public Rl03930ResultDTO getQueryRecord() {
        return queryRecord;
    }

    public void setQueryRecord(Rl03930ResultDTO queryRecord) {
        this.queryRecord = queryRecord;
    }

//    public List<Rldfal02Type> getResultList() {
//        return resultList;
//    }
//
//    public void setResultList(List<Rldfal02Type> resultList) {
//        this.resultList = resultList;
//    }

    public Object getObjDto() {
        return objDto;
    }

    public void setObjDto(Object objDto) {
        this.objDto = objDto;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

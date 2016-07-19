package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x003DTO", propOrder = { "tableType", "tableCode", "businessType", "tableName", "recordList1",
        "recordList2", "recordList3", "transactionId", "recordTable", "updateSiteId", "codeName", "isEdit", "mainType",
        "tarClass", "otherTarClass", "record" })
@XmlRootElement(name = "Rl0x003DTO")
public class Rl0x003DTO {
    @XmlElement(name = "MainDTO", required = false)
    @FieldName("查詢結果")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "NowAreaCode")
    @FieldName("職權更正類別")
    private String afterAreaCode = "";

    @XmlElement(name = "NowAreaCode")
    @FieldName("職權更正類別")
    private String boforeAreaCode = "";

    @XmlElement(name = "NowAreaName")
    @FieldName("職權更正類別")
    private String nowAreaName = "";

    @XmlElement(name = "BusinessType")
    @FieldName("職權更正類別")
    private String oldAreaCode = "";

    @XmlElement(name = "SelectResult")
    @FieldName("選到的資料")
    private Rl0x003ResultDTO selectResult = new Rl0x003ResultDTO();

    @XmlElement(name = "SelectResult")
    @FieldName("搜尋方向")
    private String search = "";

    private String querySite = "";
    private String queryArea = "";

    @XmlElement(name = "Rl0x003Resuls")
    @FieldName("已串聯資料")
    private List<Rl0x003ResultDTO> rl0x003Resuls = new ArrayList<Rl0x003ResultDTO>();

    @XmlElement(name = "NotRl0x003Resuls")
    @FieldName("尚未串聯資料")
    private List<Rl0x003ResultDTO> notRl0x003Resuls = new ArrayList<Rl0x003ResultDTO>();

    public List<Rl0x003ResultDTO> getNotRl0x003Resuls() {
        return notRl0x003Resuls;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setNotRl0x003Resuls(List<Rl0x003ResultDTO> notRl0x003Resuls) {
        this.notRl0x003Resuls = notRl0x003Resuls;
    }

    public String getBoforeAreaCode() {
        return boforeAreaCode;
    }

    public void setBoforeAreaCode(String boforeAreaCode) {
        this.boforeAreaCode = boforeAreaCode;
    }

    public String getQuerySite() {
        return querySite;
    }

    public void setQuerySite(String querySite) {
        this.querySite = querySite;
    }

    public String getQueryArea() {
        return queryArea;
    }

    public void setQueryArea(String queryArea) {
        this.queryArea = queryArea;
    }

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public String getAfterAreaCode() {
        return afterAreaCode;
    }

    public void setAfterAreaCode(String afterAreaCode) {
        this.afterAreaCode = afterAreaCode;
    }

    public List<Rl0x003ResultDTO> getRl0x003Resuls() {
        return rl0x003Resuls;
    }

    public void setRl0x003Resuls(List<Rl0x003ResultDTO> rl0x003Resuls) {
        this.rl0x003Resuls = rl0x003Resuls;
    }

    public String getNowAreaName() {
        return nowAreaName;
    }

    public void setNowAreaName(String nowAreaName) {
        this.nowAreaName = nowAreaName;
    }

    public String getOldAreaCode() {
        return oldAreaCode;
    }

    public void setOldAreaCode(String oldAreaCode) {
        this.oldAreaCode = oldAreaCode;
    }

    public Rl0x003ResultDTO getSelectResult() {
        return selectResult;
    }

    public void setSelectResult(Rl0x003ResultDTO selectResult) {
        this.selectResult = selectResult;
    }

}

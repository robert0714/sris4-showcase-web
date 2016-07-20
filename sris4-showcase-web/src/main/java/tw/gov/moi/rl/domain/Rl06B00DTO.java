package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rldf022mType;

/**
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl06B00DTO", propOrder = { "Kind", "DataAmount", "Rl06B00ResultDTO", "Code", "QueryAmount", "Sex", "IdType", "DataList", "DataListforMan", "DataListforWoman", "SelectResult" })
@XmlRootElement(name = "Rl06A00DTO")
public class Rl06B00DTO {
    /** 總筆數(代碼：1)、詳細統號(代碼：2) */
    @FieldName("代碼")
    @XmlElement(name = "Kind")
    private String kind;

    /** 總筆數 */
    @XmlElement(name = "DataAmount")
    @FieldName("總筆數")
    private List<Rl06B00ResultDTO> dataAmount = new ArrayList<Rl06B00ResultDTO>();

    @XmlElement(name = "Rl06B00ResultDTO")
    @FieldName("rl06B00ResultDTO")
    private Rl06B00ResultDTO rl06B00ResultDTO = new Rl06B00ResultDTO();

    @XmlElement(name = "Code")
    @FieldName("類別")
    private String code = "";

    /** 詳細統號筆數 */
    @XmlElement(name = "QueryAmount")
    @FieldName("詳細統號筆數")
    private String queryAmount;

    /** 性別 */
    @XmlElement(name = "Sex")
    @FieldName("性別")
    private String sex;

    /** 配賦身分代碼 */
    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType;

    /** 詳細統號列表 */
    @XmlElement(name = "DataList")
    @FieldName("詳細統號列表")
    private List<Rldf022mType> dataList = new ArrayList<Rldf022mType>();

    /** 詳細統號列表 */
    @XmlElement(name = "DataListforMan")
    @FieldName("詳細統號列表 ")
    private List<Rldf022mType> dataListforMan = new ArrayList<Rldf022mType>();

    /** 詳細統號列表 */
    @XmlElement(name = "DataListforWoman")
    @FieldName("詳細統號列表")
    private List<Rldf022mType> dataListforWoman = new ArrayList<Rldf022mType>();

    @XmlElement(name = "SelectResult")
    @FieldName("selectResult ")
    private Rl06B00ResultDTO selectResult = new Rl06B00ResultDTO();

    public void cleanList() {
        this.dataAmount.clear();
        this.dataList.clear();

    }

    public Rl06B00ResultDTO getSelectResult() {
        return selectResult;
    }

    public void setSelectResult(Rl06B00ResultDTO selectResult) {
        this.selectResult = selectResult;
    }

    public List<Rl06B00ResultDTO> getDataAmount() {
        return dataAmount;
    }

    public void addNumsOfId(String code, String b_num, String g_name) {
        dataAmount.add(new Rl06B00ResultDTO(code, b_num, g_name));
    }

    public String getQueryAmount() {
        return queryAmount;
    }

    public void setQueryAmount(String queryAmount) {
        this.queryAmount = queryAmount;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public List<Rldf022mType> getDataList() {
        return dataList;
    }

    public void addAll(List<SelectEntity<Rldf022mType>> results, String num) {
        cleanList();
        // 增加的最大筆數
        Integer iNum = Integer.valueOf(num);
        // 資料取得資料最小值
        final int min = Math.min(results.size(), iNum);

        for (int i = 0; i < min; i++) {
            this.getDataList().add(results.get(i).getValue());
        }
    }

    public void clean() {

        /** 詳細統號筆數 */
        this.queryAmount = null;

        /** 性別 */
        this.sex = null;

        /** 配賦身分代碼 */
        this.idType = null;

        cleanList();

    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        // this.clean();
        this.kind = kind;

    }

    public List<Rldf022mType> getDataListforMan() {
        return dataListforMan;
    }

    public void setDataListforMan(List<Rldf022mType> dataListforMan) {
        this.dataListforMan = dataListforMan;
    }

    public List<Rldf022mType> getDataListforWoman() {
        return dataListforWoman;
    }

    public void setDataListforWoman(List<Rldf022mType> dataListforWoman) {
        this.dataListforWoman = dataListforWoman;
    }

    public Rl06B00ResultDTO getRl06B00ResultDTO() {
        return rl06B00ResultDTO;
    }

    public void setRl06B00ResultDTO(Rl06B00ResultDTO rl06b00ResultDTO) {
        rl06B00ResultDTO = rl06b00ResultDTO;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDataList(List<Rldf022mType> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "Rl06B00DTO [kind=" + kind + ", dataAmount=" + dataAmount + ", rl06B00ResultDTO=" + rl06B00ResultDTO + ", code=" + code + ", queryAmount=" + queryAmount + ", sex=" + sex + ", idType=" + idType + ", dataList=" + dataList + ", dataListforMan=" + dataListforMan + ", dataListforWoman=" + dataListforWoman + "]";
    }

}

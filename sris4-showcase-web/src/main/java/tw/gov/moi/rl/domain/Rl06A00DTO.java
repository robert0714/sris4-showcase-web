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
import tw.gov.moi.domain.Rldf021mType;

/**
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06A00DTO", propOrder = { "Kind", "DataAmount", "QueryAmount", "Result" })
@XmlRootElement(name = "Rl06A00DTO")
public class Rl06A00DTO {

    @FieldName("類別")
    @XmlElement(name = "Kind")
    private String kind;

    /** 總筆數 */
    @FieldName("總筆數")
    @XmlElement(name = "DataAmount")
    public String dataAmount;

    /** 詳細戶號筆數 */
    @FieldName("詳細戶號筆數")
    @XmlElement(name = "QueryAmount")
    public String queryAmount;
    /** 詳細戶號列表 */
    @XmlElement(name = "Result")
    @FieldName("詳細戶號列表")
    public List<Rldf021mType> result = new ArrayList<Rldf021mType>();

    public String getDataAmount() {
        return dataAmount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
        clean();
    }

    public void setDataAmount(String dataAmount) {
        this.dataAmount = dataAmount;
    }

    public String getQueryAmount() {
        return queryAmount;
    }

    public void setQueryAmount(String queryAmount) {
        this.queryAmount = queryAmount;
    }

    public List<Rldf021mType> getResult() {
        return result;
    }

    public void cleanList() {
        result.clear();
    }

    public void addAll(List<SelectEntity<Rldf021mType>> results, String num) {

        Integer iNum = Integer.valueOf(num);
        cleanList();
        // for(SelectEntity<Rldf021mType> eachResult:results){
        // result.add(eachResult.getValue());
        // }
        final int min = Math.min(results.size(), iNum);

        for (int i = 0; i < min; i++) {
            this.result.add(results.get(i).getValue());
        }
    }

    public List<Rldf021mType> getPersonIds() {
        return result;
    }

    public void clean() {
        dataAmount = null;
        queryAmount = null;
        cleanList();
    }

}

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
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Rldfu004Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0a200DTO", propOrder = { "feeItemName", "category", "org", "dataList", "rl0a200List",
        "modifyRldfu001Type", "rldfu004Type" })
@XmlRootElement(name = "Rl0a200DTO")
public class Rl0a200DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 2290942245050190572L;

    /** 規費項目名稱 */
    @XmlElement(name = "FeeItemName")
    private String feeItemName;

    /** 規費項目類別 */
    @XmlElement(name = "Category")
    private String category;

    /** 主管機關 */
    @XmlElement(name = "Org")
    private String org;

    /** 頁面顯示規費List */
    @XmlElement(name = "DataList")
    private List<Rldfu001Type> dataList = new ArrayList<Rldfu001Type>();

    /** 新增資料List */
    @XmlElement(name = "Rl0a200List")
    @FieldName("新增資料List")
    private List<Rl0a200DataDTO> rl0a200DataList = new ArrayList<Rl0a200DataDTO>();;

    @XmlElement(name = "ModifyRldfu001Type")
    @FieldName("modifyRldfu001Type")
    private Rldfu001Type modifyRldfu001Type = new Rldfu001Type();

    @XmlElement(name = "Rldfu004Type")
    @FieldName("rldfu004Type")
    private Rldfu004Type rldfu004Type = new Rldfu004Type();

    public String getFeeItemName() {
        return feeItemName;
    }

    public void setFeeItemName(String feeItemName) {
        this.feeItemName = feeItemName;
    }

    public List<Rldfu001Type> getDataList() {
        return dataList;
    }

    public void setDataList(List<Rldfu001Type> dataList) {
        this.dataList = dataList;
    }

    public List<Rl0a200DataDTO> getRl0a200DataList() {
        return rl0a200DataList;
    }

    public void setRl0a200DataList(List<Rl0a200DataDTO> rl0a200DataList) {
        this.rl0a200DataList = rl0a200DataList;
    }

    public Rldfu001Type getModifyRldfu001Type() {
        return modifyRldfu001Type;
    }

    public void setModifyRldfu001Type(Rldfu001Type modifyRldfu001Type) {
        this.modifyRldfu001Type = modifyRldfu001Type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Rldfu004Type getRldfu004Type() {
        return rldfu004Type;
    }

    public void setRldfu004Type(Rldfu004Type rldfu004Type) {
        this.rldfu004Type = rldfu004Type;
    }

}

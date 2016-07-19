package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06700DTO", propOrder = { "IsDeleteAll", "HouseholdIdBegin", "HouseholdIdEnd", "Num" })
@XmlRootElement(name = "Rl06700DTO")
public class Rl06700DTO {
    /** 是否全部整檔刪除 */
    @FieldName("是否全部整檔刪除")
    @XmlElement(name = "IsDeleteAll")
    private String isDeleteAll;
    /** 整檔戶號(起) */
    @FieldName("整檔戶號(起)")
    @XmlElement(name = "HouseholdIdBegin")
    private String householdIdBegin;
    /** 整檔戶號(迄) */
    @FieldName("整檔戶號(迄)")
    @XmlElement(name = "HouseholdIdEnd")
    private String householdIdEnd;

    @FieldName("數量")
    @XmlElement(name = "Num")
    private String num = "";

    public String getIsDeleteAll() {
        return isDeleteAll;
    }

    public void setIsDeleteAll(String isDeleteAll) {
        this.isDeleteAll = isDeleteAll;
    }

    public String getHouseholdIdBegin() {
        return householdIdBegin;
    }

    public void setHouseholdIdBegin(String householdIdBegin) {
        this.householdIdBegin = householdIdBegin;
    }

    public String getHouseholdIdEnd() {
        return householdIdEnd;
    }

    public void setHouseholdIdEnd(String householdIdEnd) {
        this.householdIdEnd = householdIdEnd;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void clean() {

        householdIdBegin = null;
        householdIdEnd = null;
    }

}

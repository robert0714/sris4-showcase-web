package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * @author 1109001
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06600DTO", propOrder = { "IsDeleteAll", "PersonIdBegin", "PersonIdEnd", "Num" })
@XmlRootElement(name = "Rl06600DTO")
public class Rl06600DTO {
    /**
     * 是否全部整檔刪除
     */
    @FieldName("是否全部整檔刪除")
    @XmlElement(name = "IsDeleteAll")
    private String isDeleteAll;
    /**
     * 整檔統號(起)
     */
    @FieldName("整檔統號(起)")
    @XmlElement(name = "PersonIdBegin")
    private String personIdBegin;
    /**
     * 整檔統號(迄)
     */
    @FieldName("整檔統號(迄)")
    @XmlElement(name = "PersonIdEnd")
    private String personIdEnd;

    @FieldName("數量")
    @XmlElement(name = "Num")
    private String num;

    public String getIsDeleteAll() {
        return isDeleteAll;
    }

    public void setIsDeleteAll(String isDeleteAll) {
        this.isDeleteAll = isDeleteAll;
        clean();
    }

    public String getPersonIdBegin() {
        return personIdBegin;
    }

    public void setPersonIdBegin(String personIdBegin) {
        this.personIdBegin = personIdBegin;
    }

    public String getPersonIdEnd() {
        return personIdEnd;
    }

    public void setPersonIdEnd(String personIdEnd) {
        this.personIdEnd = personIdEnd;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Rl06600DTO [isDeleteAll=" + isDeleteAll + ", personIdBegin=" + personIdBegin + ", personIdEnd=" + personIdEnd + ", num=" + num + "]";
    }

    public void clean() {
        personIdBegin = null;
        personIdEnd = null;
    }
}

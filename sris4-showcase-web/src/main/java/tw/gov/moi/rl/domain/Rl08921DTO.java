package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08921DTO", propOrder = { "dataYyymm", "dataYear", "dataMonth", "showYyyMm", "countTradition",
        "countHan", "countRoma", "countBirth" })
@XmlRootElement(name = "Rl08921DTO")
public class Rl08921DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7712201574018793734L;

    /** 統計年月 */
    @FieldName("統計年月")
    @XmlElement(name = "DataYyymm", required = false)
    private String dataYyymm;

    /** 統計年 */
    @FieldName("統計年")
    @XmlElement(name = "DataYear", required = false)
    private String dataYear;

    /** 統計月 */
    @FieldName("統計月 ")
    @XmlElement(name = "DataMonth", required = false)
    private String dataMonth;

    /** 回復傳統姓名人數 */
    @FieldName("回復傳統姓名人數")
    @XmlElement(name = "CountTradition", required = false)
    private String countTradition;

    /** 回復原有漢人姓名人數 */
    @FieldName("回復原有漢人姓名人數")
    @XmlElement(name = "CountHan", required = false)
    private String countHan;

    /** 申請傳統姓名並列羅馬拼音人數 */
    @FieldName("申請傳統姓名並列羅馬拼音人數")
    @XmlElement(name = "CountRoma", required = false)
    private String countRoma;

    /** 以傳統姓名申報出生人數 */
    @FieldName("以傳統姓名申報出生人數")
    @XmlElement(name = "CountBirth", required = false)
    private String countBirth;

    public String getDataYyymm() {
        return dataYyymm;
    }

    public void setDataYyymm(String dataYyymm) {
        this.dataYyymm = dataYyymm;
    }

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    public String getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(String dataMonth) {
        this.dataMonth = dataMonth;
    }

    public String getCountTradition() {
        return countTradition;
    }

    public void setCountTradition(String countTradition) {
        this.countTradition = countTradition;
    }

    public String getCountHan() {
        return countHan;
    }

    public void setCountHan(String countHan) {
        this.countHan = countHan;
    }

    public String getCountRoma() {
        return countRoma;
    }

    public void setCountRoma(String countRoma) {
        this.countRoma = countRoma;
    }

    public String getCountBirth() {
        return countBirth;
    }

    public void setCountBirth(String countBirth) {
        this.countBirth = countBirth;
    }

}

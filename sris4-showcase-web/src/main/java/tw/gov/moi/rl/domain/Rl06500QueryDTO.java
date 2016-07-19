package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06500QueryDTO", propOrder = { "Num", "Code", "Gender" })
@XmlRootElement(name = "Rl06500QueryDTO")
public class Rl06500QueryDTO {
    // 統計值
    @FieldName("統計值")
    @XmlElement(name = "Num")
    private int num;

    @FieldName("代碼")
    @XmlElement(name = "Code")
    private String code;

    // 性別
    @FieldName("性別")
    @XmlElement(name = "Gender")
    private String gender;

    public Rl06500QueryDTO(int num, String code, String gender) {
        super();
        this.num = num;
        this.code = code;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Rl06500QueryDTO [num=" + num + ", code=" + code + ", gender=" + gender + "]";
    }

}

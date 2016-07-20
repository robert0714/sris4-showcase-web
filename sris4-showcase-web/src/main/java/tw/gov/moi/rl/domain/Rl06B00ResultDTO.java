package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf022mType;

/**
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06B00ResultDTO", propOrder = { "Code", "MNum", "WNum", "DataLists" })
@XmlRootElement(name = "Rl06B00ResultDTO")
public class Rl06B00ResultDTO {
    // 出分身分
    @FieldName("出分身分")
    @XmlElement(name = "Code")
    private String code;
    // 男孩數量
    @FieldName("男孩數量")
    @XmlElement(name = "MNum")
    private String mNum;
    // 女孩數量
    @FieldName("女孩數量")
    @XmlElement(name = "WNum")
    private String wNum;

    @FieldName("查詢結果")
    @XmlElement(name = "DataLists")
    private List<Rldf022mType> dataLists = new ArrayList<Rldf022mType>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getmNum() {
        return mNum;
    }

    public void setmNum(String mNum) {
        this.mNum = mNum;
    }

    public String getwNum() {
        return wNum;
    }

    public void setwNum(String wNum) {
        this.wNum = wNum;
    }

    public Rl06B00ResultDTO(String code, String mNum, String wNum) {
        super();
        this.code = code;
        this.mNum = mNum;
        this.wNum = wNum;
    }

    public Rl06B00ResultDTO() {
        super();
        this.code = "";
        this.mNum = "";
        this.wNum = "";
    }

    @Override
    public String toString() {
        return "Rl06B00ResultDTO [code=" + code + ", mNum=" + mNum + ", wNum=" + wNum + "]";
    }

    public List<Rldf022mType> getDataLists() {
        return dataLists;
    }

    public void setDataLists(List<Rldf022mType> dataLists) {
        this.dataLists = dataLists;
    }

}

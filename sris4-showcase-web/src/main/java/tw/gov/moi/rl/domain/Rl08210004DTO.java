package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfq004Type;
import tw.gov.moi.domain.Rldfs004Type;
import tw.gov.moi.domain.Rldfw004Type;

public class Rl08210004DTO {

    /** 離婚登記申請書資料檔 */
    @XmlElement(name = "Rldfs004Types")
    @FieldName("離婚登記申請書資料檔")
    private List<Rldfs004Type> rldfs004Types = new ArrayList<Rldfs004Type>();

    // /** 離婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft004Types")
    // @FieldName("離婚登記申請書歷史資料檔")
    // private List<Rldft004Type> rldft004Types = new ArrayList<Rldft004Type>();

    /** 離婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq004Types")
    @FieldName("離婚登記申請書凍結歷史資料檔")
    private List<Rldfq004Type> rldfq004Types = new ArrayList<Rldfq004Type>();

    /** 辦理他所離婚登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw004Types")
    @FieldName("辦理他所離婚登記申請書歷史資料檔")
    private List<Rldfw004Type> rldfw004Types = new ArrayList<Rldfw004Type>();

    // /** 妻離婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft004TypesW")
    // @FieldName("妻離婚登記申請書歷史資料檔")
    // private Rldft004Type rldft004TypesW = new Rldft004Type();

    /** 妻離婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq004TypesW")
    @FieldName("妻離婚登記申請書凍結歷史資料檔")
    private Rldfq004Type rldfq004TypesW = new Rldfq004Type();

    // /** 夫離婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft004TypesM")
    // @FieldName("夫離婚登記申請書歷史資料檔")
    // private Rldft004Type rldft004TypesM = new Rldft004Type();

    /** 夫離婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq004TypesM")
    @FieldName("夫離婚登記申請書凍結歷史資料檔")
    private Rldfq004Type rldfq004TypesM = new Rldfq004Type();

    // public Rldft004Type getRldft004TypesW() {
    // return rldft004TypesW;
    // }
    //
    // public void setRldft004TypesW(Rldft004Type rldft004TypesW) {
    // this.rldft004TypesW = rldft004TypesW;
    // }

    public Rldfq004Type getRldfq004TypesW() {
        return rldfq004TypesW;
    }

    public void setRldfq004TypesW(Rldfq004Type rldfq004TypesW) {
        this.rldfq004TypesW = rldfq004TypesW;
    }

    // public Rldft004Type getRldft004TypesM() {
    // return rldft004TypesM;
    // }
    //
    // public void setRldft004TypesM(Rldft004Type rldft004TypesM) {
    // this.rldft004TypesM = rldft004TypesM;
    // }

    public Rldfq004Type getRldfq004TypesM() {
        return rldfq004TypesM;
    }

    public void setRldfq004TypesM(Rldfq004Type rldfq004TypesM) {
        this.rldfq004TypesM = rldfq004TypesM;
    }
}
